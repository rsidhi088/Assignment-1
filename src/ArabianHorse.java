public class ArabianHorse extends Animals{

    public String breed;
    public String name;
    public String YOB;

    public ArabianHorse(String name, String YOB){
        this.name=name;
        this.YOB =YOB;
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
