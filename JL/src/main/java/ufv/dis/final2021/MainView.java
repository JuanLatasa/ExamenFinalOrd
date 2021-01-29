package ufv.dis.final2021;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route
@PWA(name = "My Application", shortName = "My Application")
public class MainView extends VerticalLayout {

    public MainView() {

        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button);
    }
    public String longToIp(long ip) {
        StringBuilder result = new StringBuilder(15);
        for (int i = 0; i < 4; i++) { result.insert(0,Long.toString(ip & 0xff)); if (i < 3) {
            result.insert(0,'.'); }
            ip = ip >> 8; }
        return result.toString(); }


    public static Long Dot2LongIP(String dottedIP) {
        String[] addrArray = dottedIP.split("\\."); long num = 0;
        for (int i=0;i<addrArray.length;i++) {
            int power = 3-i;
            num += ((Integer.parseInt(addrArray[i]) % 256) *
                    Math.pow(256, power));
        }
        return num; }
}
