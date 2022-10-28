public class App {
    public static void main(String[] args) {
        Movie HomeAlone = new Movie();
        HomeAlone.year = 1990;
        HomeAlone.name = "HomeAlone";
        HomeAlone.genre = "comedy";
        System.out.println("Name-"+HomeAlone.name+"\ngenre-"+HomeAlone.genre+"\nyear-"+HomeAlone.year);

        Movie HarryPotter = new Movie();
        HarryPotter.year = 2001;
        HarryPotter.name = "HarryPotter";
        HarryPotter.genre = "fantasy";

        Movie SantaBarbara = new Movie();
        SantaBarbara.year = 1984;
        SantaBarbara.name = "SantaBarbara";
        SantaBarbara.genre = "melodrama";

        HomeAlone.hi();
        HarryPotter.hi();
        SantaBarbara.hi();

        Fruit Mango = new Fruit();
        Mango.cost = 0.99;
        Mango.name = "Mango";
        Mango.provider = "Mexico";
        Mango.info();






    }
}
