package model;

public class TV {
    private int channel=1;
    private int volumeLevel=1;
    private boolean on;

    public int getChannel() {
        if(on) {
            return channel;
        }
        return 0;
    }

    public void setChannel(int channel) {
        if(channel >= 1 && channel <= 120 && on){
            this.channel = channel;
        }
        System.out.println("Channel is more than 1");
    }

    public int getVolumeLevel() {
        if(on){
            return  volumeLevel;
        }
        return 0;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(volumeLevel >= 1 && volumeLevel <= 100 && on){
            this.volumeLevel = volumeLevel;
        }
        System.out.println("Channel is more than 1");
    }

    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setchannelUp(){
        if(on && channel < 120)
            channel++;
    }
    public void setchanneldown(){
        if(on && channel > 1)
            channel--;
    }
    public void setvolumlevelup(){
        if (on && volumeLevel < 100)
            volumeLevel++;
    }
    public void setvolumleveldown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
