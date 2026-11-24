abstract class Delivery {

    void acceptOrder() {
        System.out.println("Delivery order accepted");
    }

    abstract void deliverProduct();
}

class FoodDelivery extends Delivery {

    @Override
    void deliverProduct() {
        System.out.println("Food order delivered to customer");
    }
}

class ParcelDelivery extends Delivery {

    @Override
    void deliverProduct() {
        System.out.println("Parcel delivered successfully");
    }
}

public class MainD {
    public static void main(String[] args) {

        FoodDelivery food = new FoodDelivery();

        food.acceptOrder();
        food.deliverProduct();

        ParcelDelivery parcel = new ParcelDelivery();

        parcel.acceptOrder();
        parcel.deliverProduct();
    }
}