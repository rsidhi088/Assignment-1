public class Sharks extends Animals{
    public String name;
    public String YOB;

    public Sharks(String name, String YOB){
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
}
