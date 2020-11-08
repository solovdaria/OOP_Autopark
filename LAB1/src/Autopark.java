import java.util.ArrayList;
import java.util.Arrays;
public class Autopark {
    int n=0;

    ArrayList<Car> autopark = new ArrayList<>();

    public void setN(int n) {
        this.n = n;
    }
    public void menu(int n, int choice)
    {

        if (n>0) {

            switch (choice) {
                case 1:
                    Cabriolet cabriolet = new Cabriolet();
                    autopark.add(cabriolet);
                    break;
                case 2:
                    Minivan minivan = new Minivan();
                    autopark.add(minivan);
                    break;
                case 3:
                    Sedan sedan = new Sedan();
                    autopark.add(sedan);
                    break;
                case 4:
                    SUV suv = new SUV();
                    autopark.add(suv);
                    break;
                case 5:
                    Universal universal = new Universal();
                    autopark.add(universal);
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }
    public int countCost(){
        int amount = 0;
        for (int i = 0; i < autopark.size(); i++) {
            amount = amount + autopark.get(i).getCost();
        }
        return amount;
    }
    public String findSpeed(int a, int b)
    {
        String str="";
        for(int i = 0;i<autopark.size(); i++)
        {
            if((autopark.get(i).maxSpeed >= a) && (autopark.get(i).maxSpeed <= b))
                str = str + (autopark.get(i).getName()) + " ";
        }
        return str;
    }
    private void swap(ArrayList<Car> array, int ind1, int ind2) {
        Car tmp = array.get(ind1);
        array.add(ind1, array.get(ind2));
        array.add(ind2, tmp);
    }
    public String sort() {
        String str = "";
        for (int i = 1; i < autopark.size(); i++) {
            if (autopark.get(i).getConsumption() < autopark.get(i-1).getConsumption()) {
                swap(autopark, i, i - 1);
            }
        }
        for (int i = 0; i < autopark.size(); i++) {
            str = str + autopark.get(i).getName() + " ";
        }
        return str;
    }
}
