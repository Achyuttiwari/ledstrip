public class LEDStrip {
    private Led[] ledStrip;

    public Led[] getLedStrip() {
        return ledStrip;

    }

    public void setLedStrip(Led[] ledStrip) {
        this.ledStrip = ledStrip;
    }

    public LEDStrip(Led[] ledStrip) {
        this.ledStrip = ledStrip;
    }

    private int lengthOfStrip() {
        return ledStrip.length;
    }

    private int numberOfDefectiveLEDs() {
        int counter = 0;
        for (Led led : ledStrip) {
            if (!led.isWorking()) {            //if (led.isWorking() == false)
                counter++;
            }
        }
        return counter;
    }

    private boolean isStripDefective() {
        return numberOfDefectiveLEDs() > (lengthOfStrip() / 2);
    }
    public void printStripStatus(){
        System.out.println(isStripDefective()?"This strip is defective!":"This strip is not defective");
    }
}


