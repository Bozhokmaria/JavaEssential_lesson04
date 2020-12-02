package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("choose doctype: doc/txt/xml");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        switch (type) {
            case "doc":
                AbstractHandler docHandler = new DOCHandler();
                docHandler.open ();
                docHandler.create ();
                docHandler.change();
                docHandler.save();
                break;
            case "txt":
                AbstractHandler txtHandler = new TXTHandler();
                txtHandler.open ();
                txtHandler.create ();
                txtHandler.change();
                txtHandler.save();
                break;
            case "xml":
                AbstractHandler xmlHandler = new XMLHandler();
               xmlHandler.open ();
               xmlHandler.create ();
               xmlHandler.change();
               xmlHandler.save();
                break;
            }

    }
}
