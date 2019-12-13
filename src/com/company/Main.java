package com.company;

public class Main {

    public static void main(String[] args) {
        // นายเอ วิ่งได้วันละ 5 กิโลเมตร ในแต่ละเดือนนายเอสามารถวิ่งได้เพิ่มขึ้น 4 กิโลเมตร กี่เดือนนายเอถึงวิ่งได้มากกว่า 40 กิโลเมตร
	int kilometer = 5;
	int month = 0;
	while (kilometer <= 40) {
	    kilometer = kilometer + 4;
	    month++;
        System.out.println("month" + month);
        System.out.println("kilometer = " + kilometer);
    }
        System.out.println("month = " + month);
    }
}
