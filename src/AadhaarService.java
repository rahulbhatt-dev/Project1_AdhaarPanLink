import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    //Logicxn without statiuc block(static logic is used in PanService)
    private  Map<String,Aadhaar> aadhaarMap=new HashMap<>();

    public AadhaarService() {
        this.aadhaarMap.put("1232332234",new Aadhaar("1232332234",
                "Ashwani","Mr Anil Kumar","Almora"));
        this.aadhaarMap.put("1232332236",new Aadhaar("1232332236",
                "Chetan","Mr Mahesh ji","Delhi"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber)
    {
        return aadhaarMap.get(aadhaarNumber);
    }
}
