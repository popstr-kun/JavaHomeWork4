/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-25 22:39:42
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-25 22:58:33
 */
package p29;

public class p29 {
    public static void main(String[] args) {
        Vehicle[] vc = new Vehicle[2];

        vc[0] = new Car(1234, 12.4);
        vc[0].setSpeed(60);

        vc[1] = new Plane(423);
        vc[1].setSpeed(1999);

        for (int i=0;i<vc.length;i++){
            vc[i].show();
        }
    }
}

abstract class Vehicle{
    protected int speed;
    public void setSpeed(int s){
        speed = s;
        System.out.println("將速度設為"+speed+"了");
    }

    abstract void show();
}

class Car extends Vehicle{
    private int num;
    private double gas;

    public Car(int n,double g){
        num = n;
        gas = g;
        System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
    }

    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
        System.out.println("速度是"+speed);
    }
}

class Plane extends Vehicle{
    private int fight;

    public Plane(int f){
        fight = f;
        System.out.println("生產了"+fight+"班次的飛機");
    }
    
    public void show(){
        System.out.println("飛機的班次是"+fight);
        System.out.println("速度是"+speed);
    }
}
