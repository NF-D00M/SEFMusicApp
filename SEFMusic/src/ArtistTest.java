import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {


    @Test
    void TestAddArtist() {
//        SET Test Variables
        String ArtistID = "555JACKG!@";
        String Name = "Jack Gale";
        String City = "Melbourne";
        String State = "Victoria";
        String Country = "Australia";
        String Address = City + "|" + State + "|" + Country;
        System.out.println(Address);
        String Birthdate = "05-02-1991";
        String Bio = "I am a neo-classical pianist";
        ArrayList<String> Occupations = new ArrayList<>();
        Occupations.add("Singer");
        Occupations.add("Songwriter");
        ArrayList<String> Genres = new ArrayList<>();
        Genres.add("Classical");
        Genres.add("Jazz");
        ArrayList<String> Awards = new ArrayList<>();
        Awards.add("Tony");
        Awards.add("Grammy");

//        CREATE Artist Object
        Artist testCase1Artist1 = new Artist(
                ArtistID,
                Name,
                Address,
                Birthdate,
                Bio,
                Occupations,
                Genres,
                Awards,
                City,
                State,
                Country);


        testCase1Artist1.addArtist();

//        testCase1Artist1.addArtistAddress("Melbourne", "Victoria", "Australia");

        assertAll (
                "Group Assertion for Test Case 1: Artist 1 ArtistID",
                () -> assertEquals("555JACKG!@", testCase1Artist1.getArtistID()),
                () -> assertEquals("05-02-1991", testCase1Artist1.getBirthdate())
        );

//        testCase1Artist1.getAddressList();





        System.out.println("Test Complete");
    }
}