package primitives;
import org.jetbrains.annotations.NotNull;

public class Point2D implements Comparable<Point2D> {

    protected Coordinate _x;
    protected Coordinate _y;

    /************ CTOR *************/
   public  Point2D()
   {
       this._x=new Coordinate(0);
       this._y=new Coordinate(0);

   }
    public Point2D(@NotNull Coordinate x,@NotNull Coordinate y) {
        this._x=new Coordinate(x);
        this._y=new Coordinate(y);

    }
    public Point2D(@NotNull Point2D point2D) {
        this._x=point2D.get_x();
        this._y=point2D.get_y();

    }
    /***************** Getters/Setters **********************/
    public Coordinate get_x() { return _x; }
    public Coordinate get_y() { return _y; }
    public void set_x(Coordinate _x) { this._x = _x; }
    public void set_y(Coordinate _y) { this._y = _y; }

    @Override
    public int compareTo(@NotNull Point2D other_point2D) {

        /** Distance_result **/
        double this_point2D_Distance =this.getDistanceFromOrigin();
        double other_point2D_Distance=other_point2D.getDistanceFromOrigin();

        /** compartion_result **/
        int x_compartion_result= _x.compareTo(other_point2D.get_x());
        int y_compartion_result= _y.compareTo(other_point2D.get_y());

        /**distance equales  but y coordinat postion difrent then othe point  **/
        if(this_point2D_Distance!=other_point2D_Distance)
        {
            return(this_point2D_Distance>other_point2D_Distance)?  1:-1;
        }

        /**distance equales  but x coordinat postion difrent then othe point  **/
        else if(y_compartion_result !=0)
        {
            return y_compartion_result;
        }
        else if(x_compartion_result != 0 )
        {
            return x_compartion_result;
        }
        /** equal **/
        return 0;

    }

    @Override
    public String toString() {
        return "Point2D{}";
    }

    /*************************************************
     * FUNCTION
     * getDistanceFromOrigin()
     * PARAMETERS
     *
     * RETURN VALUE
     * A (positive) double: the sqre root of the x and y coordinate paw 2:sqre root( _x^2+_y^2),
     * smaller than the integer received as parameter.
     * MEANING
     * This functions return the Distance Point2D from the origin.
     * sqre root( _x^2+_y^2)
     * SEE ALSO
     * comperTo(),
     * **************************************************/
    public double getDistanceFromOrigin()
    {
        return Math.sqrt(
                (_x.get_Coordinate_Value()*_x.get_Coordinate_Value())+
                        (_y.get_Coordinate_Value()*_y.get_Coordinate_Value())
        );
    }
}
