import java.util.*;

public class Artist {
    public String ID;
    public String Name;
    public String Address;
    public String Birthdate;
    public String Bio;
    public ArrayList <String> Occupations;
    public ArrayList <String> Genres;
    public ArrayList <String> Awards;

    public Artist (String id, String name, String address, String birthdate, String bio, ArrayList <String> occupations, ArrayList <String> genres, ArrayList <String> awards) {
        ID = id;
        Name = name;
        Address = address;
        Birthdate = birthdate;
        Bio = bio;
        Occupations = occupations;
        Genres = genres;
        Awards = awards;
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
//          Artist ID Char 2
        char ID_char_2 = ID.charAt(1);
        int ID_int_2 = Character.getNumericValue(ID_char_2);
//          Artist ID Char 3
        char ID_char_3 = ID.charAt(2);
        int ID_int_3 = Character.getNumericValue(ID_char_3);
//        If Statement
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
//          Artist ID Char 5
        char ID_char_5 = ID.charAt(4);
        String ID_str_5 = Character.toString(ID_char_5);
//          Artist ID Char 6
        char ID_char_6 = ID.charAt(5);
        String ID_str_6 = Character.toString(ID_char_6);
//          Artist ID Char 7
        char ID_char_7 = ID.charAt(6);
        String ID_str_7 = Character.toString(ID_char_7);
//          Artist ID Char 8
        char ID_char_8 = ID.charAt(7);
        String ID_str_8 = Character.toString(ID_char_8);
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
//          Artist Id Char 10
        char ID_char_10 = ID.charAt(9);
        String ID_str_10 = Character.toString(ID_char_10);
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

        //        CONDITION 4
//        The Artist Bio must be between 10 to 30 words
        StringTokenizer stringTokenizer1 = new StringTokenizer(Bio);
        int bioWords = stringTokenizer1.countTokens();
        if (bioWords < 10 || bioWords > 30) {
            System.out.println("BioWords: " + bioWords + ". Bio must be less than 10 words or more than 30");
            return false;
        }
//        CONDITION 5
//        The Artist Occupation must be
        if (Occupations.size() < 1 || Occupations.size() > 5) {
            System.out.println("Artist must have 1 occupation and no great than 5");
            return false;
        }
//        CONDITION 7
//        Artist should be active in at least two music genres and a maximum of five genres.
        if (Genres.size() < 2 || Genres.size() > 5) {
            System.out.println("Artist must have 2 genres or maximum of 5");
            return false;
        }
//        Artist cannot be acrtive in Pop or Rock
        if (Genres.contains("Pop") && Genres.contains("Rock")) {
            System.out.println("Artist cannot be active in Pop and Rock");
            return false;
        }

        //        CONDITION 6
//        Artist can only have maximum of three awards
        if (Awards.size() > 3) {
            System.out.println("Artist must have less than 3 awards");
            return false;
        }

//        Format should be YEAR, TITLE
        for (String award : Awards) {
            String[] AwardsSplit = award.split(", ");
            String years = AwardsSplit[0];
            String titles = AwardsSplit[1];
            if (!years.matches("\\d\\d\\d\\d")) {
                System.out.println(years + " Year does not match regex");
                return false;
            }
//        Title should be between 4 and 10 words
            StringTokenizer stringTokenizer2 = new StringTokenizer(titles);
            int titleWords = stringTokenizer2.countTokens();
            if (titleWords < 4 || titleWords > 10) {
                System.out.println("Title is either less than 4 or greater than 10 words");
                return false;
            }
        }
        return true;
    }

    public boolean UpdateArtist() {
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
//          Artist ID Char 2
        char ID_char_2 = ID.charAt(1);
        int ID_int_2 = Character.getNumericValue(ID_char_2);
//          Artist ID Char 3
        char ID_char_3 = ID.charAt(2);
        int ID_int_3 = Character.getNumericValue(ID_char_3);
//        If Statement
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
//          Artist ID Char 5
        char ID_char_5 = ID.charAt(4);
        String ID_str_5 = Character.toString(ID_char_5);
//          Artist ID Char 6
        char ID_char_6 = ID.charAt(5);
        String ID_str_6 = Character.toString(ID_char_6);
//          Artist ID Char 7
        char ID_char_7 = ID.charAt(6);
        String ID_str_7 = Character.toString(ID_char_7);
//          Artist ID Char 8
        char ID_char_8 = ID.charAt(7);
        String ID_str_8 = Character.toString(ID_char_8);
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
//          Artist Id Char 10
        char ID_char_10 = ID.charAt(9);
        String ID_str_10 = Character.toString(ID_char_10);
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

        //        CONDITION 4
//        The Artist Bio must be between 10 to 30 words
        StringTokenizer stringTokenizer1 = new StringTokenizer(Bio);
        int bioWords = stringTokenizer1.countTokens();
        if (bioWords < 10 || bioWords > 30) {
            System.out.println("BioWords: " + bioWords + ". Bio must be less than 10 words or more than 30");
            return false;
        }
//        CONDITION 5
//        The Artist Occupation must be
        if (Occupations.size() < 1 || Occupations.size() > 5) {
            System.out.println("Artist must have 1 occupation and no great than 5");
            return false;
        }
//        CONDITION 7
//        Artist should be active in at least two music genres and a maximum of five genres.
        if (Genres.size() < 2 || Genres.size() > 5) {
            System.out.println("Artist must have 2 genres or maximum of 5");
            return false;
        }
//        Artist cannot be acrtive in Pop or Rock
        if (Genres.contains("Pop") && Genres.contains("Rock")) {
            System.out.println("Artist cannot be active in Pop and Rock");
            return false;
        }

        //        CONDITION 6
//        Artist can only have maximum of three awards
        if (Awards.size() > 3) {
            System.out.println("Artist must have less than 3 awards");
            return false;
        }

//        Format should be YEAR, TITLE
        for (String award : Awards) {
            String[] AwardsSplit = award.split(", ");
            String years = AwardsSplit[0];
            String titles = AwardsSplit[1];
            if (!years.matches("\\d\\d\\d\\d")) {
                System.out.println(years + " Year does not match regex");
                return false;
            }
//        Title should be between 4 and 10 words
            StringTokenizer stringTokenizer2 = new StringTokenizer(titles);
            int titleWords = stringTokenizer2.countTokens();
            if (titleWords < 4 || titleWords > 10) {
                System.out.println("Title is either less than 4 or greater than 10 words");
                return false;
            }
        }
        
        System.out.println("Artist Updated");
        return true;
    }


















}
