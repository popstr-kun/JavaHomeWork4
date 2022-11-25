/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-25 23:20:39
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-26 01:07:07
 */
package p32;

public class p32 {
    public static void main(String[] args) {
        Vehicle[] vc = new Vehicle[2];
        
        vc[0] = new Car(1254, 12.3);
        vc[1] = new Plane(3000);

        for (int i = 0; i < vc.length; i++) {
            if (vc[i] instanceof Car) {
                System.out.println("第"+(i+1)+"個物件是Car類別");
            }
            else{
                System.out.println("第"+(i+1)+"個物件不是Car類別");
            }
        }
    }
}

abstract class Vehicle{
    protected int speed;

    public void setSpeed(int s){
        speed =s;
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
        System.out.println("生產了車號為"+num+"，汽油量為"+gas);
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