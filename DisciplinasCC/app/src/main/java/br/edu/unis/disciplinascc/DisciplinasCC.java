package br.edu.unis.disciplinascc;

public class DisciplinasCC {
    private String name;
    private String course;
    private String stage;
    private int backgroundColor;

    public DisciplinasCC(String name, String course, String stage, int backgroundColor) {
        this.name = name;
        this.course = course;
        this.stage = stage;
        this.backgroundColor = backgroundColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
