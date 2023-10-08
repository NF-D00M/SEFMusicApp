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
        String Bio = "I am neo-classical pianist and I am starting to explore jazz";
        ArrayList<String> Occupations = new ArrayList<>();
        Occupations.add("Chino");
        ArrayList<String> Genres = new ArrayList<>();
        Genres.add("Classical");
        Genres.add("Jazz");
        Genres.add("Pop");
        Genres.add("Rock");
        ArrayList<String> Awards = new ArrayList<>();
        Awards.add("2023, Academy Award for Best Original Score");
        Awards.add("2022, Academy Award for Best Picture");
        Awards.add("2021, Academy Award for Best Original Screenplay");


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
//        assertAll (
//                "Group Assertion for Test Case 2: ",
//                () -> assertEquals("The book information cannot be added"),
//                () -> assertEquals("The book information can be added")
//        )

//        testCase1Artist1.getAddressList();





        System.out.println("Test Complete");
    }
}