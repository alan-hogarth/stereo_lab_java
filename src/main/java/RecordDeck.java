public class RecordDeck extends Component {

    private int playSpeed;
    private String make;
    private String model;

    public RecordDeck(int playSpeed, String make, String model, String play, String stop, String pause){
        super(play, stop, pause);
        this.make = make;
        this.model = model;
        this.playSpeed = playSpeed;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
