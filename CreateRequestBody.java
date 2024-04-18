package resuable;

public class CreateRequestBody {

    public String createBankEmployeeRequestBody(String name, String year, String dob, String address, String salary){
        String body = "{\n" +
                "\t\"name\": \""+name+"\",\n" +
                "\t\"data\": {\n" +
                "\t\t\"year\": \""+year+"\",\n" +
                "\t\t\"DOB\": \""+dob+"\",\n" +
                "\t\t\"Address\": \""+address+"\",\n" +
                "\t\t\"Salary\": \""+salary+"\"\n" +
                "\t}\n" +
                "}";
        return body;
    }
 
}
