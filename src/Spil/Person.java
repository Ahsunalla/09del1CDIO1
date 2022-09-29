package Spil;

public class Person {

    private String name;
    private int point = 0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int p){
        this.point = p;
    }

    public int getPoint(){
        return point;
    }

    public Person(String name) {
        this.name = name;
        this.point = point;
    }


}
