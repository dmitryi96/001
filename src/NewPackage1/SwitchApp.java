package NewPackage1;

public class SwitchApp {
    public static void main(String[] args) {
        checkOrderStatus2("ACCEPTED");
        checkOrderStatus2("IN_DELIVERELY");
        checkOrderStatus2("Едет");
    }

    public static void checkOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED")) {
            System.out.println("Доставлен");
        } else {
            System.out.println("Не известный статус заказа");
        }
    }


    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED": {
                System.out.println("Принят");
                break;
            }
            case "Едет":
            case "DELIVERED": {
                System.out.println("Доставлен");
                break;
            }
            default: {
                System.out.println("Не известный статус заказа");

            }
        }
    }


}
