package main ;
import java.util.Scanner;
import student.Student;

import static java.lang.Integer.parseInt;

public class Main {

    static int findByFaculty(String faculty, int amount, Student[]arr){
        int flag = 0, j = 0;
        while( j < amount) {

            if (arr[j].getFaculty().equals(faculty)) {
                System.out.print(arr[j].toString());
                flag = 1;
            }
            j++;
        }
        if (flag == 1)
            return 1;
        return 0;
    }

    static int findByGroup(String group, int amount, Student[]arr){
        int flag = 0;
        for( int j = 0; j < amount; j++) {

            if (arr[j].getGroup().equals(group)) {
                System.out.print(arr[j].toString());
                flag = 1;
            }
        }
        if (flag == 1)
            return 1;
        return 0;
    }

    static void findAfterYear(int year, int amount, Student[]arr ){
        String date, temp = "";

        for(int j = 0; j < amount; j++){
            date = arr[j].getBirth();
            for(int k = 6; k <= 9; k++){
                temp = temp + date.charAt(k);
            }

            if((parseInt(temp)) > year){
                System.out.print(arr[j].toString());
                temp = "";
            }
        }

    }

    public static void main(String[] args) {

        int amount, sch_year;    // к-сть студентів
        Scanner scan = new Scanner(System.in);
        String sch_faculty, sch_group;

        System.out.print("\n Input number of student => ");
        amount = scan.nextInt();
        Student [] students = new Student[amount];
        scan.nextLine();   // забираю непотрібний ентер

        /* Змінні для вводу */
        int _id,_number, _course;
        String _surname, _name, _patronymic, _birth, _address,
                _faculty, _group;

        System.out.print("\n Input data: ");
        scan.reset();
        for(int k = 1; k <= amount; k++){
            System.out.println("\n " + k + ")");
            System.out.print(" ID => ");
            _id = scan.nextInt();
            scan.nextLine();
            System.out.print(" Surname => ");
            _surname = scan.nextLine();
            System.out.print(" Name => ");
            _name = scan.nextLine();
            System.out.print(" Patronymic => ");
            _patronymic = scan.nextLine();
            System.out.print(" Birth => ");
            _birth = scan.nextLine();
            System.out.print(" Address => ");
            _address = scan.nextLine();
            System.out.print(" Number => ");
            _number = scan.nextInt();
            scan.nextLine();
            System.out.print(" Faculty => ");
            _faculty = scan.nextLine();
            System.out.print(" Course => ");
            _course = scan.nextInt();
            scan.nextLine();
            System.out.print(" Group => ");
            _group = scan.nextLine();

            students[k-1] = new Student(_id,_surname,_name,_patronymic,_birth,_address,_number,_faculty,_course,_group);
        }

        System.out.print("\n\n Faculty for searching => ");
        sch_faculty = scan.nextLine();
        System.out.println(" Students of " + sch_faculty);
        if(findByFaculty(sch_faculty,amount,students) == 0)
            return;

        System.out.print("\n\n Group for searching => ");
        sch_group = scan.nextLine();
        System.out.println(" Students of " + sch_group);
        findByGroup(sch_group,amount, students);

        System.out.print("\n\n More than year => ");
        sch_year = scan.nextInt();
        findAfterYear(sch_year, amount, students);


    }
}