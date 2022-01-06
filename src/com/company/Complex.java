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

    public String toString(){
        return r + "+" + i + "i";
    }

    public static void main(String[] args) {
    }
}
