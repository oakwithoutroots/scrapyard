package models;

public enum Category {

    CLASS_000(0, "Class 000 – Computer science, information and general works"),
    CLASS_100(1, "Class 100 – Philosophy and psychology"),
    CLASS_200(2, "Class 200 – Religion"),
    CLASS_300(3, "Class 300 – Social sciences"),
    CLASS_400(4, "Class 400 – Language"),
    CLASS_500(5,"Class 500 – Science"),
    CLASS_600(6,"Class 600 – Technology"),
    CLASS_700(7,"Class 700 – Arts and recreation"),
    CLASS_800(8,"Class 800 – Literature"),
    CLASS_900(9,"Class 900 – History and geography");


    private int value;
    private String className;

    Category(int value, String className) {
        this.value = value;
        this.className = className;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
