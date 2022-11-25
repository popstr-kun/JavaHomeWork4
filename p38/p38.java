/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-26 01:08:21
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-26 01:20:16
 */
package p38;

public class p38 {
    public static void main(String[] args) {
        iVehicle[] ivc = new iVehicle[2];

        ivc[0] = new Car(1234, 36.2);
        ivc[1] = new Plane(600);

        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();
        }
    }
}

interface iVehicle{
    int weight = 10000;
    void show();
}

class Car implements iVehicle{
    private int num;
    private double gas;

    public Car(int n,double g){
        num = n;
        gas = g;
        System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
    }

    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油是"+gas);
    }
}

class Plane implements iVehicle{
    private int fight;

    public Plane(int f){
        fight = f;
        System.out.println("生產了"+fight+"班次的飛機");
    }

    public void show(){
        System.out.println("飛機的班次是"+fight);
    }
}