public class Stereo extends Component{

    private String name;
    private Radio radio;

    public Stereo(String name, String play, String stop, String pause){
        super(play, stop, pause);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String tune(){
        return "Tuning to Radio 6";
    }

}
