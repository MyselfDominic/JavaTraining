package com.company;



public class funcProg {

    static final Double pi = Math.PI;

    public static <Double> void main(String[] args) {
        Function <Double, Function<Double, Double>> sumof = r -> h -> (Math.PI * r * r * h)/3;

        System.out.println("Cone V : " +sumof.apply(5.0).apply(15.0));

        Function<Double , Function<Double, Double>> vofC = r -> h -> 1D/3D * pi * r * r * h;

        System.out.println("eqwqw: " +vofC.apply(3.5).apply(6.5) );


    }
}
