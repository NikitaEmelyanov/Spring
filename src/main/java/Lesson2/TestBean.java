package Lesson2;

public class TestBean {
    private String name;
//Command+N для быстрой генерации конструкторов, геттеров, сеттеров и прочего
    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
