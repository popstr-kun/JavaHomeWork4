/*
 * @Author: SHEN XAIN KUN
 * @Date: 2022-11-25 21:48:52
 * @LastEditors: SHEN XAIN KUN
 * @LastEditTime: 2022-11-25 21:51:17
 */
package p17;

public class p17 {
    public static void main(String[] args) {
        Car cars[] = new Car[2];

        cars[0] = new Car();
        cars[0].setCar(1234,32.5);

        cars[1] = new RacingCar();
        cars[1].setCar(3425,23.5);

        for(int i =0;i<cars.length;i++)
            cars[i].show();
    }
}

class Car{
    protected int num;
    protected double gas;

    public Car(){
        num =0;
        gas =0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+"，汽油量設為"+gas);
    }
    
    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油是"+gas);
    }
}

class RacingCar extends Car{
    private int course;

    public RacingCar(){
        course =0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c){
        course = c;
        System.out.println("將賽車編號設為"+course);
    }

    public void show(){
        System.out.println("賽車的車號是"+num);
        System.out.println("汽油量是"   +gas);
        System.out.println("賽車編號是" +course);
    }
}