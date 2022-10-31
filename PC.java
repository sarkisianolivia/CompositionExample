public class PC { //the PC is comprised of all the following things

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public void powerUp() {
        theCase().pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        //Fancy Graphics
        getMonitor().drawPixelAt(1200, 50, "yellow");
    }



    private PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}
