public class Park {
    private String namePark;
    private Attraction[] attractionsArray;

    public Park(String namePark, int numberOfAttractions) {
        this.namePark = namePark;
        this.attractionsArray = new Attraction[numberOfAttractions];
    }

    public void addAttraction(int index, String attractionName, String operatingHours, double price) {
        if (index < attractionsArray.length) {
            attractionsArray[index] = new Attraction(attractionName, operatingHours, price);
        } else {
            System.out.println("Больше нет места для новых аттракционов.");
        }
    }

    public static class Attraction {
        private String name;
        private String operatingHours;
        private double price;

        public Attraction(String name, String operatingHours, double price) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название аттракциона : " + name);
            System.out.println("Часы работы: " + operatingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println("-------------------------------");
        }
    }
    public void displayAllAttractions() {
        System.out.println("Аттракционы в " + namePark + ":");
        for (Attraction attraction : attractionsArray) {
            if (attraction != null) {
                attraction.printInfo();
            }
        }
    }
    public static void main(String[] args) {
        Park park = new Park("ЦПКиО им. Маяковского", 3);

        park.addAttraction(0, "Американские горки", "10:00 - 20:00", 500.50);
        park.addAttraction(1, "Колесо обозрения", "10:00 - 20:00", 380.55);
        park.addAttraction(2, "Дом с привидениями", "10:00 - 20:00", 420.35);
        park.displayAllAttractions();
    }
}