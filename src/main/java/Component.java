public abstract class Component {

    private String play;
    private String stop;
    private String pause;

    public Component(String play, String stop, String pause){
        this.play = play;
        this.stop = stop;
        this.pause = pause;

    }

    public String play(){
        return "playing";
    }

    public String stop(){
        return "stopped";
    }

    public String pause(){
        return "paused";
    }

}
