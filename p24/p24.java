/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-25 22:03:10
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-25 22:10:50
 */
package p24;

public class p24 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setCar(1234, 12.4);
        System.out.println(car);     //在print中car的toString方法，會被呼叫
    }
}

class Car{
    protected int num;
    protected double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+"，汽油量設為"+gas);
    }

    public String toString(){
        String str = "車號"+num+"汽油量"+gas;
        return str;
    }
}
