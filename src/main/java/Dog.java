public class Dog implements Domesticatable, Tradable{
    @Override
    public String sound() {
        return "Wang!";
    }
    @Override
    public int getPrice() {
        return 5;
    }
}
