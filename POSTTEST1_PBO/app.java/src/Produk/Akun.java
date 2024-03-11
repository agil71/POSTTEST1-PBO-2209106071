package Produk;

public class Akun {
    String IdAkun;
    String NamaGame;
    String RankAkun;
    String PlatformAkun;
    int Harga;

    public Akun(String IdAkun, String NamaGame, String RankAkun, String PlatformAkun, int Harga){
        this.IdAkun = IdAkun;
        this.NamaGame = NamaGame;
        this.RankAkun = RankAkun;
        this.PlatformAkun = PlatformAkun;
        this.Harga = Harga;
    }
    public String getIdAkun() {
        return IdAkun;
    }
    public String getNamaGame() {
        return NamaGame;
    }
    public int getHarga() {
        return Harga;
    }
    public String getPlatformAkun() {
        return PlatformAkun;
    }
    public String getRankAkun() {
        return RankAkun;
    }
    public void setIdAkun(String idAkun) {
        IdAkun = idAkun;
    }
    public void setNamaGame(String namaGame) {
        NamaGame = namaGame;
    }
    public void setRankAkun(String rankAkun) {
        RankAkun = rankAkun;
    }
    public void setHarga(int harga) {
        Harga = harga;
    }
    public void setPlatformAkun(String platformAkun) {
        PlatformAkun = platformAkun;
    }

}