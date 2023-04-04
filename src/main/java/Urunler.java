public class Urunler {
    int id;
    String urunIsmi;
    String uretici;
    int miktar;
    String birim;
    String raf;

    public Urunler(int id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
      this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim= birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "id=" + id +
                "\nurunIsmi=" + urunIsmi +
                "\nuretici=" + uretici +
                "\nmiktar=" + miktar +
                "\nBirim=" + birim +
                "\nraf=" + raf+
                "\n-------------------------\n";
    }
}
