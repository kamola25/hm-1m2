package com.company;

public class Primary_school {

    private int className;
    private Class aClass;
    private String schoolName;
    private int numberOfStudent;
    private int excellentStudent;
    private int goodStudent;
    private int tripletsStudent;

    public Primary_school(int className, Class aClass, String schoolName, int numberOfStudent,
                  int excellentStudent, int goodStudent, int tripletsStudent) {
        this.className = className;
        this.aClass = aClass;
        this.schoolName = schoolName;
        this.numberOfStudent = numberOfStudent;
        this.excellentStudent = excellentStudent;
        this.goodStudent = goodStudent;
        this.tripletsStudent = tripletsStudent;
    }

    public int getClassName() {
        return className;
    }

    public Class getaClass() {
        return aClass;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public int getExcellentStudent() {
        return excellentStudent;
    }

    public int getGoodStudent() {
        return goodStudent;
    }

    public int getTripletsStudent() {
        return tripletsStudent;
    }

}
