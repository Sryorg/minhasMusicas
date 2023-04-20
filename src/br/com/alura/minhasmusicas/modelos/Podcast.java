package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String host;
    private String previw;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPreviw() {
        return previw;
    }

    public void setPreviw(String previw) {
        this.previw = previw;
    }
}
