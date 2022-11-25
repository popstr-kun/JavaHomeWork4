/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-26 01:20:35
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-26 01:27:09
 */
package p41;

public class p41 {
    public static void main(String[] args) {
        Car car = new Car(7893, 45.33);
        car.vShow();
        car.mShow();
    }
}

interface iVehicle{
    void vShow();
}

interface iMaterial{
    void mShow();
}

class Car implements iVehicle,iMaterial{
    private int num;
    private double gas;

    public Car(int n,double g){
        num = n;
        gas = g;

        System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
    }

    public void vShow(){
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }

    public void mShow(){
        System.out.println("車子的材質是鐵");
    }
}