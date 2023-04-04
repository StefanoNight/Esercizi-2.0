public class Triangolo {

    private double base;
    private double altezza;


    public Triangolo(double base, double altezza)
    {
        this.setBase(base);
        this.setAltezza(altezza);
    }

    private void setAltezza(double altezza)
    {
        this.altezza=altezza;
    }

    private void setBase(double base)
    {
        this.base=base;
    }

    public double getAltezza()
    {
        return this.altezza;
    }

    public  double getBase()
    {
        return this.base;
    }


    public double getArea()
    {
        double area= (this.base * this.altezza)/2;
        return  area;
    }

    public double getPerimetro()
    {
        double t=Math.sqrt((this.base*this.base) + (this.altezza*this.altezza));
        //System.out.println("//" + t + "//");
        double perimetro= t + this.base + this.altezza;
        return perimetro;
    }
}
