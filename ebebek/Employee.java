package ebebek;

public class Employee {
    public static void main(String[] args){
        Employee emp1 = new Employee("Askin Gunduz", 20000, 45, 1985);
        emp1.toString();
    }

    String name;
    int salary, workHours, hireYear;
    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    double tax=0;
    public double tax() {
        if(this.salary<1000) {
            return 0;
        }
        else{
            tax=salary*3/100;
            return tax;
        }
    }
    int bonus=0;
    public int bonus() {
        if(workHours>40){
            bonus=(workHours-40)*30;
            return bonus;
        }
        else {
            return 0;
        }
    }
    double raise;

    public double raiseSalary() {
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("Gecersiz bir calisma yili girdiniz, tekrar kontrol ediniz!");
        }
        else {
            int year = hireYear - 2021;
            if (year < 10) {
                raise = 1.05;
            } else if (year > 9 && year < 20) {
                raise = 1.1;
            } else {
                raise = 1.15;
            }
            return raise;
        }
        return 0.0;
    }
    public String toString(){
        double top = salary+ bonus() - tax();
        double maas_final=top*raiseSalary();
        System.out.println();
        System.out.println("Adi Soyadi: " + name);
        System.out.println("Maasi: " + salary);
        System.out.println("Calisma Saati: " + workHours);
        System.out.println("Baslangic Yili: " + hireYear);
        System.out.println("Maas Artisi: " + (maas_final-salary));

        System.out.println("Toplam Maas: " + maas_final);

        return null;
    }
}
