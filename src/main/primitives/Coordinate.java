package primitives;

import org.jetbrains.annotations.NotNull;
public class Coordinate implements Comparable<Coordinate>
{
 private double CoordinateValu_=0.0;

 /************ CTOR *************/
 public Coordinate(){};

 public Coordinate (double CoordinateValu ) {this.CoordinateValu_=CoordinateValu; }

public Coordinate(@NotNull Coordinate coordinat) { this.CoordinateValu_=coordinat.CoordinateValu_; }

    /***************** Getters/Setters **********************/
    public double getCoordinateValu_() {
        return CoordinateValu_;
    }

    public void setCoordinateValu_(double coordinateValu_) {
        CoordinateValu_ = coordinateValu_;
    }
    /***************** Administration ***********************/
    @Override
    public int compareTo(@NotNull Coordinate other) {
        return Double.compare(this.CoordinateValu_,other.CoordinateValu_);
    }
    // *****************Aritmetic Operations ******************** //
    // ***************** Operations ******************** //

    public void add(@NotNull Coordinate coordinate)
    {
        this.CoordinateValu_ += coordinate.CoordinateValu_;
    }

    public void subtract(@NotNull Coordinate coordinate)
    {
        this.CoordinateValu_ -= coordinate.CoordinateValu_;
    }



    // ***************** Static Class Methods ******************** //

    @NotNull
    public static Coordinate add(@NotNull Coordinate coordinate1, @NotNull Coordinate coordinate2)
    {
        return new Coordinate(coordinate1.getCoordinateValu_() + coordinate2.getCoordinateValu_());
    }

    @NotNull
    public static Coordinate subtract(@NotNull Coordinate coordinate1, @NotNull Coordinate coordinate2)
    {
        return new Coordinate(coordinate1.getCoordinateValu_() - coordinate2.getCoordinateValu_());
    }

/************ ~DTOR *************/
}
