package by.belstu.it.krukovich.basejava;

import java.util.Objects;

public class WrapperString {
    private String priv;

    public WrapperString(String priv) {
        this.priv = priv;
    }


    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(priv, that.priv);
    }

    @Override
    public int hashCode() {

        return Objects.hash(priv);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "priv='" + priv + '\'' +
                '}';
    }
    public void replace(char oldchar, char newchar)
    {

    }
}
