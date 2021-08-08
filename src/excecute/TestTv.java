package excecute;
import Utill.Utill;
import model.TV;
public class TestTv {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();

        tv1.setOn(true);
        tv2.setOn(true);
        tv2.setChannel(100);
        tv1.setVolumeLevel(40);

        Utill.showTVOnOff(tv1.isOn(),1);
        Utill.showTVOnOff(tv2.isOn(),2);
        Utill.showChannel(tv1.getChannel(),1);
        Utill.showChannel(tv2.getChannel(),2);
        Utill.showVolumeLevel(tv1.getVolumeLevel(),1);
        Utill.showVolumeLevel(tv2.getVolumeLevel(),2);

    }
}
