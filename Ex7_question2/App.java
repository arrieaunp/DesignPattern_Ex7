public class App {
    public static void main(String[] args) {
        Manager ceo = new Manager("Settha", "CEO", 500000);
        Manager headSales = new Manager("Kamphaka", "Head Sales", 300000);
        IEmployee sales1 = new Employee("Wiroj", "Sales", 150000);
        IEmployee sales2 = new Employee("Weeranan", "Sales", 100000);
        Manager headMarketing = new Manager("UngInk", "Head Marketing", 300000);
        IEmployee marketing1 = new Employee("Oak", "Marketing", 200000);
        IEmployee marketing2 = new Employee("Aem", "Marketing", 250000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(sales1);
        headSales.add(sales2);
        
        headMarketing.add(marketing1);
        headMarketing.add(marketing2);

        printAllEmployee(ceo);
    }
    public static void printAllEmployee(IEmployee ceo) {
        ceo.print();
    }
}

