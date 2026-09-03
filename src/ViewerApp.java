public class ViewerApp {
    public static void main(String[] args) {

        Tv tv = new Tv();
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl rc = new RemoteControl();

        // Tv Commands
        PowerOn powerOn = new PowerOn(tv);
        PowerOff powerOff = new PowerOff(tv);

        rc.setCommand(powerOn);
        rc.clickButton();

        rc.setCommand(powerOff);
        rc.clickButton();

        // Light Commands
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(livingRoomLight);
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(livingRoomLight);
        IncreaseBrightnessCommand increaseBrightnessCommand = new IncreaseBrightnessCommand(livingRoomLight);
        DecreaseBrightnessCommand decreaseBrightnessCommand = new DecreaseBrightnessCommand(livingRoomLight);

        rc.setCommand(turnOnLightCommand);
        rc.clickButton();

        rc.setCommand(turnOffLightCommand);
        rc.clickButton();

        rc.setCommand(increaseBrightnessCommand);
        rc.clickButton();

        rc.setCommand(decreaseBrightnessCommand);
        rc.clickButton();

        // Thermostat Commands
        IncreaseTemperatureCommand increaseTemperatureCommand = new IncreaseTemperatureCommand(thermostat);
        DecreaseTemperatureCommand decreaseTemperatureCommand = new DecreaseTemperatureCommand(thermostat);

        rc.setCommand(increaseTemperatureCommand);
        rc.clickButton();

        rc.setCommand(decreaseTemperatureCommand);
        rc.clickButton();

        // Music Player Commands
        PlayMusicCommand playMusicCommand = new PlayMusicCommand(musicPlayer);
        PauseMusicCommand pauseMusicCommand = new PauseMusicCommand(musicPlayer);
        NextTrackCommand nextTrackCommand = new NextTrackCommand(musicPlayer);
        PreviousTrackCommand previousTrackCommand = new PreviousTrackCommand(musicPlayer);

        rc.setCommand(playMusicCommand);
        rc.clickButton();

        rc.setCommand(pauseMusicCommand);
        rc.clickButton();

        rc.setCommand(nextTrackCommand);
        rc.clickButton();

        rc.setCommand(previousTrackCommand);
        rc.clickButton();
    }
}