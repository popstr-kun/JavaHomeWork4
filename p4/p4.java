/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-25 17:22:51
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-25 20:41:30
 */
package p4;

public class p4 {
    public static void main(String[] args) {
        RacingCar rccar1 = new RacingCar();

        rccar1.setCar(1234, 34.5);

        rccar1.setCourse(5);

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
    public void setCourse(int c){
        course = c;
        System.out.println("將賽車編號設為"+course);
    }
}