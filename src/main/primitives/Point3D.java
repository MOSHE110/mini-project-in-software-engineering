package primitives;

import org.jetbrains.annotations.NotNull;

public class Point3D extends  Point2D{

    protected Coordinate _z;

    /***************** Ctor **********************/
    public Point3D(){super();_z=new Coordinate();};
    public Point3D(@NotNull Coordinate x,@NotNull Coordinate y,@NotNull Coordinate z){super(x,y); _z=new Coordinate(z);};
    public Point3D(@NotNull Point3D point3D;){
        this._x=point3D.get_x();
        this._y=point3D.get_y();
        this._z=point3D.get_z();
    };

    /***************** Geter/Seters **********************/
    public Coordinate get_z() { return new Coordinate(_z); }
    public void set_z(@NotNull Coordinate z){this._z=new Coordinate(z);}
/*************************************************
 * FUNCTION
 * compareTo()
 * PARAMETERS
 * Point3D point3D
 * RETURN VALUE
 * 1
 * -1
 * 0
 * compere the distance's of this-Point3D and tha other Point3D from the origin
 * MEANING
 * if this_distance >other_distancereturn 1
 * if distance_this <distance_other return -1
 * if Point3D from the origin.
 * if distances are equal but not same coordinates return 0
 *
 * SEE ALSO
 * getDistanceFromOrigin(),
 * *****************************************/
public  int copareTo(@NotNull Point3D point3D){

}
}
