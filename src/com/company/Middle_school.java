package com.company;

public class Middle_school extends Primary_school {

    public Middle_school(int className, Class aClass, String schoolName, int numberOfStudent,
                         int excellentStudent, int goodStudent, int tripletsStudent) {
        super(className, aClass, schoolName, numberOfStudent, excellentStudent, goodStudent, tripletsStudent);
    }

    public String getInfo(int classNames, Class aClasses, String schoolNames, int numberOfStudents,
                          int excellentStudents, int goodStudent, int tripletsStudents) {
        return " В " + this.getClassName() + "-"+this.getaClass() + " классе" + this.getSchoolName() +
                "\n Есть - " + this.getNumberOfStudent() + " учеников " +
                "\n Отличников: " + this.getExcellentStudent() +
                "\n Хорошо учашихся: " + this.getGoodStudent() +
                "\n Старающихся: " + this.getTripletsStudent() ;

    }

    public String getInfo(int className1, Class bClass, String schoolNames, int numberOfStudents,
                          int excellentStudents, int tripletsStudents) {
        return " В - " + getClassName() + getaClass() + " классе" + getSchoolName() +
                "\n Есть - " + getNumberOfStudent() + " учеников " +
                "\n Отличников: " + getExcellentStudent() +
                "\n Старающихся: " + getTripletsStudent() ;
    }

    public final String getInfo(int className1, Class bClass, String schoolNames, int numberOfStudents) {
        return " В " + getClassName() + getaClass() + " классе" + getSchoolName() +
                "\n Есть - " + getNumberOfStudent() + " учеников ";
    }

}