package com.company;

public class Complex {

    private double r;//real
    private double i;//imaginary

    public Complex(double a, double b){
        r=a; i=b;
    }
    public Complex(double a){
        this(a,0.0);
    }

    public double abs(){
        return Math.sqrt(r*r+i*i);
    }

    public Complex add(Complex other){
        double a = r+other.r;
        double b = i+other.i;
        return new Complex(a,b);
    }

    public Complex add(double x){
        double a = r+x;
        double b = i;
        return new Complex(a,b);
    }

    public String toString(){
        return r + " + " + i + "i";
    }

    public Complex multiply(Complex other){
        double a = this.r*other.r - this.i*other.i;
        double b = this.r*other.i + this.i*other.r;
        return new Complex(a,b);
    }

    public Complex multiply(double x){
        double a = this.r*x;
        double b = this.i*x;
        return new Complex(a,b);
    }

    public static void main(String[] args) {
        Complex x1 = new Complex(4,5);
        Complex x2 = new Complex(3,5);
        Complex x3 = new Complex(1,2);
        Complex x4 = new Complex(4);
        Complex x5 = new Complex(6, 3);
        Complex x6 = new Complex(9,2);
        System.out.println(x1.abs());
        System.out.println(x1.add(x2));
        System.out.println(x6.add(x2));
        System.out.println(x4.add(x3));
        System.out.println(x1.add(x5));
        System.out.println(x1.multiply(x3));
        System.out.println(x2.multiply(x5));
        System.out.println(x6.multiply(x4));
        System.out.println(x3.multiply(x2));
        System.out.println(x1.add(6.7));
        System.out.println(x3.add(3.2));
        System.out.println(x5.add(2));
        System.out.println(x2.multiply(4));
        System.out.println(x4.multiply(3));
        System.out.println(x6.multiply(10));
    }
}

//6.4031242374328485
//7.0 + 10.0i
//12.0 + 7.0i
//5.0 + 2.0i
//10.0 + 8.0i
//-6.0 + 13.0i
//3.0 + 39.0i
//36.0 + 8.0i
//-7.0 + 11.0i
//10.7 + 5.0i
//4.2 + 2.0i
//8.0 + 3.0i
//12.0 + 20.0i
//12.0 + 0.0i
//90.0 + 20.0i