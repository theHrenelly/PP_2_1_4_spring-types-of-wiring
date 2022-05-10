package koschei.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private FairyTail fairyTail;

    public Duck5(@Qualifier("egg6") FairyTail fairyTail) {
        this.fairyTail = fairyTail;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + fairyTail.toString();
    }
}
