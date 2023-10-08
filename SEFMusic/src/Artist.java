import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Artist {
    private String ID;
    private String Name;
    private String Address;
    private String City;
    private String State;
    private  String Country;
    private String Birthdate;
    private String Bio;
    private ArrayList <String> Occupations;
    private ArrayList <String> Genres;
    public ArrayList <String> Awards;

    public Artist (String id, String name, String address, String birthdate, String bio, ArrayList <String> occupations, ArrayList <String> genres, ArrayList <String> awards, String city, String state, String country) {
        ID = id;
        Name = name;
        Address = address;
        Birthdate = birthdate;
        Bio = bio;
        Occupations = occupations;
        Genres = genres;
        Awards = awards;
        City = city;
        State = state;
        Country = country;
    }

    public String getArtistID() {
        System.out.println("getArtistID: " + ID);
        return ID;
    }
    public String getBirthdate() {
        System.out.println("getBirthdate: " + Birthdate);
        return Birthdate;
    }

    public boolean addArtist() {
//        CONDITION 1
//        Artist ID must be exactly 10 characters long.
        if (ID.length() != 10) {
            System.out.println("Artist ID must be 10 characters long.");
            return false;
        }

//        Artist ID must have first three characters between 5 - 9.
//          Artist ID Char 1
        char ID_char_1 = ID.charAt(0);
        int ID_int_1 = Character.getNumericValue(ID_char_1);
        System.out.println(ID_int_1);
//          Artist ID Char 2
        char ID_char_2 = ID.charAt(1);
        int ID_int_2 = Character.getNumericValue(ID_char_2);
        System.out.println(ID_int_2);
//          Artist ID Char 3
        char ID_char_3 = ID.charAt(2);
        int ID_int_3 = Character.getNumericValue(ID_char_3);
        System.out.println(ID_int_3);
//        If Statment
//        First Three Characters of Artist ID Must be between 5-9
        if ((ID_int_1 < 5 || ID_int_1 > 9) ||
            (ID_int_2 < 5 || ID_int_2 > 9) ||
            (ID_int_3 < 5 || ID_int_3 > 9)) {
                System.out.println("First three characters of of Artist ID must be between 5 - 9");
                return false;
        }

//        Artist ID characters 4-8 must have upper case letters (A-Z).
//          Artist ID Char 4
        char ID_char_4 = ID.charAt(3);
        String ID_str_4 = Character.toString(ID_char_4);
        System.out.println(ID_str_4);
//          Artist ID Char 5
        char ID_char_5 = ID.charAt(4);
        String ID_str_5 = Character.toString(ID_char_5);
        System.out.println(ID_str_5);
//          Artist ID Char 6
        char ID_char_6 = ID.charAt(5);
        String ID_str_6 = Character.toString(ID_char_6);
        System.out.println(ID_str_6);
//          Artist ID Char 7
        char ID_char_7 = ID.charAt(6);
        String ID_str_7 = Character.toString(ID_char_7);
        System.out.println(ID_str_7);
//          Artist ID Char 8
        char ID_char_8 = ID.charAt(7);
        String ID_str_8 = Character.toString(ID_char_8);
        System.out.println(ID_str_8);
//        If Statement
//        Fourth to Eighth Characters of Artist ID must be Upper Case letters between A-Z
        if (!ID_str_4.matches("[A-Z]") ||
            !ID_str_5.matches("[A-Z]") ||
            !ID_str_6.matches("[A-Z]") ||
            !ID_str_7.matches("[A-Z]") ||
            !ID_str_8.matches("[A-Z]")) {
                System.out.println("Eighth character of Artist ID must be Upper Case letters between A-Z");
                return false;
        }

//        Artist ID characters 9-10 must be special characters.
//          Artist ID Char 9
        char ID_char_9 = ID.charAt(8);
        String ID_str_9 = Character.toString(ID_char_9);
        System.out.println(ID_str_9);
//          Artist Id Char 10
        char ID_char_10 = ID.charAt(9);
        String ID_str_10 = Character.toString(ID_char_10);
        System.out.println(ID_str_10);
//        If Statement
//        Characters ninth to tenth must be special characters
        if (ID_str_9.matches("^[A-Za-z0-9]") ||
            ID_str_10.matches("^[A-Za-z0-9]")){
                System.out.println("Last two characters of Artist ID must be special characters");
                return false;
        }
//        CONDITION 2
//        Artist Birthdate must match format [DD-MM-YYYY]
        if (!Birthdate.matches("([0-2][0-9]|3[0-1])-(0[0-9]|1[0-2])-([1-2][0-9][0-9][0-9])")) {
                System.out.println("Birthdate does not match format DD-MM-YYYY");
                return false;
        }

//        CONDITION 3
//        Address must follow format: City|State|Country

//        CONDITION 4
//        The Artist Bio must be between 10 to 30 words
        StringTokenizer stringTokenizer1 = new StringTokenizer(Bio);
        int bioWords = stringTokenizer1.countTokens();
        System.out.println("BioWords: " + bioWords);
        if (bioWords < 10 || bioWords > 30) {
            System.out.println("Bio is either less than 10 words or more than 30");
            return false;
        }

//        CONDITION 5
//        The Artist Occupation must be
        System.out.println("Occupations size: " + Occupations.size());
        if (Occupations.size() < 1 || Occupations.size() > 5) {
            System.out.println("Artist must have 1 occupation and no great than 5");
            return false;
        }

//        CONDITION 6
//        Artist can only have maximum of three awards
        System.out.println(Awards);
        if (Awards.size() > 3) {
            System.out.println("Artist Award must be less than 3");
            return false;
        }

//        Format should be YEAR, TITLE
        for (String award : Awards) {
            String[] AwardsSplit = award.split(", ");
            String years = AwardsSplit[0];
            String titles = AwardsSplit[1];
            System.out.println("Year: " + years);
            System.out.println("Title: " + titles);
            if (!years.matches("\\d\\d\\d\\d")) {
                System.out.println(years + " Year does not match regex");
                return false;
            }
//        Title should be between 4 and 10 words
            StringTokenizer stringTokenizer2 = new StringTokenizer(titles);
            int titleWords = stringTokenizer2.countTokens();
            System.out.println("TitleWOrds: " + titleWords);
            if (titleWords < 4 || titleWords > 10) {
                System.out.println("Title is either less than 4 or greater than 10 words");
                return false;
            }
        }

//        CONDITION 7
//        Artist should be active in at least two music genres and a maximum of five genres.
        System.out.println(Genres);
        System.out.println("Genres size: " + Genres.size());
        if (Genres.size() < 2 || Genres.size() > 5) {
            System.out.println("Artist must have 2 genres and maximum of 5");
            return false;
        }

        if (Genres.contains("Pop") && Genres.contains("Rock")) {
            System.out.println("Artist cannot be active in Pop and Rock");
            return false;
        }











//        System.out.println("This is where i live: " + Address);
//        System.out.println("Artist Details Added");
        return true;
    }


//    public String addArtistAddress(String city, String state, String country) {
////
//        City = city;
//        State = state;
//        Country = country;
//
//        Address = new ArrayList<String>();
//        Address.add(City);
//        Address.add(State);
//        Address.add(Country);
//
//        System.out.println(City + State + Country);
//
//        return city + " " + state + " " + country;
//    }
//
//    public ArrayList<String> getAddressList() {
//        System.out.println(Address);
//        return Address;
//    }








}
