public class Duck extends Animals implements Swimmer{
    public String name;
    public String YOB;

    public Duck(String name, String YOB){
        super();
        this.name=name;
        this.YOB = YOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYOB() {
        return YOB;
    }

    public void setYOB(String YOB) {
        this.YOB = YOB;
    }

    public static void swim() {

    }
}
