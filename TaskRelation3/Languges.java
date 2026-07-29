package TaskRelation3;

import java.util.List;

public class Languges {

    private long id;
    private String name;


    private List <Tetcher> tetchers;

    public Languges() {
    }

    public Languges(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tetcher> getTetchers() {
        return tetchers;
    }

    public void setTetchers(List<Tetcher> tetchers) {
        this.tetchers = tetchers;
    }
}
