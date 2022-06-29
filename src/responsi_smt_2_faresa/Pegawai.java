package responsi_smt_2_faresa;

public class Pegawai {
    private int noPegawai;
    private String namaPegawai;
    private String posisiPegawai;
    private String gajiPegawai;

    
    public Pegawai(){
    }
    
    public Pegawai(int noPegawai, String namaPegawai, String posisiPegawai, String gajiPegawai){
        this.noPegawai = noPegawai;
        this.namaPegawai = namaPegawai;
        this.posisiPegawai = posisiPegawai;
        this.gajiPegawai = gajiPegawai;

    }

    // Setter
    public void setNoPegawai(int noPegawai){
        this.noPegawai = noPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
   
    public void setPosisiPegawai(String posisiPegawai){
        this.posisiPegawai = posisiPegawai;
    }
  
    public void setGajiPegawai(String gajiPegawai){
        this.gajiPegawai = gajiPegawai;
    }
    
    // Getter
    public int getNoPegawai(){
        return noPegawai;
    }
    
    public String getNamaPegawai(){
        return namaPegawai;
    }
   
    public String getPosisiPegawai(){
        return posisiPegawai;
    }
      
    public String getGajiPegawai(){
        return gajiPegawai;
    }
   
          
}
