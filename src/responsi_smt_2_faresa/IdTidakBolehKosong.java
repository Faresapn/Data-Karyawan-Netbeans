package responsi_smt_2_faresa;

public class IdTidakBolehKosong extends Exception{

    @Override
    public String getMessage() {
        return "No Pegawai Tidak Boleh Kosong"; 
    }
    
}