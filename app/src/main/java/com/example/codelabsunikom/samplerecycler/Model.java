package com.example.codelabsunikom.samplerecycler;

/**
 * Created by codelabsunikom on 12/15/15.
 */
public class Model {
    private String name;
    private String nim;

    public Model(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
