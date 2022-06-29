package responsi_smt_2_faresa;

public class WarningMessage extends Exception{
    
    @Override
    public String getMessage(){
        return "Inputan semester di luar range masa studi";
    }
    
}
