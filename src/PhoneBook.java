import java.util.*;

public class PhoneBook {
    private Map<Integer, String> dict;

    public PhoneBook(){
        this.dict= new HashMap<Integer, String>();
    }


    public void add(int phoneNumber,String surname){
        dict.put(phoneNumber, surname);
    }

    public void get(String surname){
        List<Integer> xRes = new ArrayList<Integer>();
        for (Map.Entry<Integer, String> item: dict.entrySet()) {
            if(item.getValue().equals(surname))
                xRes.add(item.getKey());
        }
        for (Integer item: xRes) {
            System.out.println(surname+": "+item);
        }
        if(xRes.size()==0)
            System.out.println("Для фамилии "+surname+" данных не обнаружено.");


    }
}
