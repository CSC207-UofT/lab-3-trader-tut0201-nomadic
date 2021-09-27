public class Car implements Tradable,Drivable{
    private int speed;

    public Car(){speed = 100;}
    @Override
    public int getPrice(){
        return 100000;
    }

    @Override
    public void upgradeSpeed(){
         this.speed++;
    }

    @Override
    public void downgradeSpeed(){
        this.speed--;
    }

    @Override
    public int getMaxSpeed(){
        return this.speed;
    }
}
