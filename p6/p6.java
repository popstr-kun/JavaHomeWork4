/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-25 20:29:09
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-25 20:44:33
 */
package p6;

public class p6 {
    public static void main(String[] args) {
        RacingCar rccar1 = new RacingCar(1234,23.5,6);
    }
}

class Car{
    private int num;
    private double gas;

    public Car(){
        System.out.println("生產了車子");
        num = 0;
        gas = 0.0;
    }

    public Car(int n,double g){
        num = n;
        gas = g;
        System.out.println("生產車號為"+num+"，汽油量設為"+gas+"的車子");
    }

    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
    }
    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}

class RacingCar extends Car{
    private int course;
    public RacingCar(){
        course = 0;
        System.out.println("生產了賽車");
    }

    public RacingCar(int n,double g,int c){
        super(n,g);
        course = c;
        System.out.println("生產賽車編號設為"+course+"的賽車");
    }

    public void setCourse(int c){
        course = c;
        System.out.println("將賽車編號設為"+course);
    }
}
