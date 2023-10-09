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
//        Genres.add("Pop");
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
        System.out.println("First ARTIST ID: " + testCase1Artist1.getArtistID());


        assertAll (
                "Group Assertion for Test Case 1: Artist 1 ArtistID",
                () -> assertEquals("555JACKG!@", testCase1Artist1.getArtistID())
        );
//        assertAll (
//                "Group Assertion for Test Case 2: ",
//                () -> assertEquals("The book information cannot be added"),
//                () -> assertEquals("The book information can be added")
//        )

//        testCase1Artist1.getAddressList();

        Artist TESTCASE2 = new Artist(
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
        System.out.println("SECOND ARTIST ID: " + TESTCASE2.getArtistID());

        ArrayList<String> newOccupations = new ArrayList<>();
        newOccupations.add("Producer");
        newOccupations.add("Manager");
        ArrayList<String> newAwards = new ArrayList<>();
        newAwards.add("2023, Academy Award for Best Original Sound");
        newAwards.add("gggg, Academy Award for Best Original Costume Design");
        ArrayList<String> newGenres = new ArrayList<>();
        newGenres.add("K-Pop");
        newGenres.add("J-Pop");
        TESTCASE2.UpdateArtist(
                "666JACKG!!",
                "Janine Gale"  ,
                "Sydney|New South Whales|Australia",
                "05-07-1991",
                "Bio must be big and strong like a leg, oh yeah double leg",
                newOccupations,
                newGenres,
                newAwards);

        System.out.println("THIRD ARTIST ID: " + TESTCASE2.getArtistID());
        System.out.println(TESTCASE2.getArtistBirthdate());
        TESTCASE2.setArtistBirthdate("20-10-2010");
        System.out.println(TESTCASE2.getArtistBirthdate());
        TESTCASE2.setArtistName("Tony Gale");
        System.out.println(TESTCASE2.getArtistName());
        TESTCASE2.setArtistAddress("CHINO HILLS");
        System.out.println(TESTCASE2.getArtistAddress());
        System.out.println(TESTCASE2.getArtistOccupations());
        System.out.println(TESTCASE2.getArtistGenres());
        System.out.println(TESTCASE2.getArtistAwards());
        System.out.println(TESTCASE2.getArtistBio());




        System.out.println("Test Complete");
    }
}