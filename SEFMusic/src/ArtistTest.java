import com.sun.xml.internal.bind.v2.TODO;
import org.junit.jupiter.api.Test;
import sun.plugin.dom.css.Counter;

import java.io.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

import static java.lang.Integer.sum;
import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;


class ArtistTest {
    ArrayList <String> ArtistDetailList = new ArrayList<>();
    String ArtistFileID;
    String ArtistFileName;
    String ArtistFileAddress;
    String ArtistFileBirth;
    String ArtistFileBio;
    ArrayList <String> ArtistFileOccupation;
    ArrayList <String> ArtistFileGenre;
    ArrayList <String> ArtistFileAward = new ArrayList<>();
    String ArtistInFile;


    public void TestAddArtist_TestCase1() {
//        TEST VARIABLES
//        Test Case 1 Data 1
        String ArtistID1 = "666JACKG$$";
        String Name1 = "Jack Gale";
        String Address1 = "Melbourne|Victoria|Australia";
        String Birthdate1 = "05-02-1991";
        String Bio1 = "I am neo-classical pianist and I am starting to explore jazz";
        ArrayList<String> Occupations1 = new ArrayList<>();
        Occupations1.add("Soloist");
        ArrayList<String> Genres1 = new ArrayList<>();
        Genres1.add("Classical");
        Genres1.add("Jazz");
        Genres1.add("Rock");
        ArrayList<String> Awards1 = new ArrayList<>();
        Awards1.add("2022, Academy Award for Best Original Score");
        Awards1.add("2022, Academy Award for Best Sound Design");
        Awards1.add("2010, Academy Award for Best Original Score");

//        Test Case 1 Data 2
        String ArtistID2 = "985TONYG**";
        String Name2 = "Tony Gale";
        String Address2 = "Sydney|New South Whales|Australia";
        String Birthdate2 = "28-08-1954";
        String Bio2 = "I am a soundscape artist that records the silence of flowers blooming";
        ArrayList<String> Occupations2 = new ArrayList<>();
        Occupations2.add("Composer");
        ArrayList<String> Genres2 = new ArrayList<>();
        Genres2.add("Soundscape");
        Genres2.add("Micro Noise");
        ArrayList<String> Awards2 = new ArrayList<>();
        Awards2.add("1980, Academy Award for Best Soundscape in a Cafe");
        Awards2.add("1985, Academy Award for Best Soundscape near the Ocean");

//        CREATE Artist Object
//        Object TestCase1_Data1
        Artist TestCase1_Data1 = new Artist(
                ArtistID1,
                Name1,
                Address1,
                Birthdate1,
                Bio1,
                Occupations1,
                Genres1,
                Awards1,
                null
        );
//        TestCase1_Data1.addArtist();
//        Object TestCase1_Data2
        Artist TestCase1_Data2 = new Artist(
                ArtistID2,
                Name2,
                Address2,
                Birthdate2,
                Bio2,
                Occupations2,
                Genres2,
                Awards2,
                null
        );
//        TestCase1_Data2.addArtist();

//        ASSERTIONS
        assertAll (
                "Group Assertion for Test Case 1: addArtist()",
                () -> assertTrue(TestCase1_Data1.addArtist()),
                () -> assertTrue(TestCase1_Data2.addArtist())
        );
        System.out.println("Test Complete");
    }
    public void TestAddArtist_TestCase2() {
//        TEST VARIABLES
//        Test Case 2 Data 1
        String ArtistID1 = "666JACKG$$";
        String Name1 = "Jack Gale";
        String Address1 = "Melbourne|Victoria|Australia";
        String Birthdate1 = "05-02-1991";
        String Bio1 = "I am a pianist";
        ArrayList<String> Occupations1 = new ArrayList<>();
        Occupations1.add("Soloist");
        ArrayList<String> Genres1 = new ArrayList<>();
        Genres1.add("Classical");
        Genres1.add("Jazz");
        Genres1.add("Rock");
        ArrayList<String> Awards1 = new ArrayList<>();
        Awards1.add("2022, Academy Award for Best Original Score");
        Awards1.add("2022, Academy Award for Best Sound Design");
        Awards1.add("2010, Academy Award for Best Original Score");

////        Test Case 2 Data 2
        String ArtistID2 = "985TONYG**";
        String Name2 = "Tony Gale";
        String Address2 = "Sydney|New South Whales|Australia";
        String Birthdate2 = "28-08-1954";
        String Bio2 = "I am a soundscape artist that records the silence of flowers blooming, this isn't to be confused with other micro-sounds such as paint drying or clouds moving. I find art in the subtleties that the regular artist couldn't fathom";
        ArrayList<String> Occupations2 = new ArrayList<>();
        Occupations2.add("Composer");
        ArrayList<String> Genres2 = new ArrayList<>();
        Genres2.add("Soundscape");
        Genres2.add("Micro Noise");
        ArrayList<String> Awards2 = new ArrayList<>();
        Awards2.add("1980, Academy Award for Best Soundscape in a Cafe");
        Awards2.add("1985, Academy Award for Best Soundscape near the Ocean");

//        CREATE Artist Object
//        Object TestCase1_Data1
        Artist TestCase2_Data1 = new Artist(
                ArtistID1,
                Name1,
                Address1,
                Birthdate1,
                Bio1,
                Occupations1,
                Genres1,
                Awards1,
                null
        );
//        TestCase2_Data1.addArtist();
//        Object TestCase1_Data2
        Artist TestCase2_Data2 = new Artist(
                ArtistID2,
                Name2,
                Address2,
                Birthdate2,
                Bio2,
                Occupations2,
                Genres2,
                Awards2,
                null
        );
//        TestCase2_Data2.addArtist();

//        ASSERTIONS
        assertAll (
                "Group Assertion for Test Case 2: addArtist()",
                () -> assertFalse(TestCase2_Data1.addArtist()),
                () -> assertFalse(TestCase2_Data2.addArtist())
        );
        System.out.println("Test Complete");
    }
    public void TestAddArtist_TestCase3() {
//        TEST VARIABLES
//        Test Case 3 Data 1
        String ArtistID1 = "666JACKG$$";
        String Name1 = "Jack Gale";
        String Address1 = "Melbourne|Victoria|Australia";
        String Birthdate1 = "05-02-1991";
        String Bio1 = "I am a pianist";
        ArrayList<String> Occupations1 = new ArrayList<>();
        Occupations1.add("Soloist");
        ArrayList<String> Genres1 = new ArrayList<>();
        Genres1.add("Classical");
        Genres1.add("Jazz");
        Genres1.add("Rock");
        ArrayList<String> Awards1 = new ArrayList<>();
        Awards1.add("2022, Academy Award for Best Original Score");
        Awards1.add("2022, Academy Award for Best Sound Design");
        Awards1.add("2010, Academy Award for Best Original Score");

////        Test Case 3 Data 2
        String ArtistID2 = "985TONYG**";
        String Name2 = "Tony Gale";
        String Address2 = "Sydney|New South Whales|Australia";
        String Birthdate2 = "28-08-1954";
        String Bio2 = "I am a soundscape artist that records the silence of flowers blooming, this isn't to be confused with other micro-sounds such as paint drying or clouds moving. I find art in the subtleties that the regular artist couldn't fathom";
        ArrayList<String> Occupations2 = new ArrayList<>();
        Occupations2.add("Composer");
        ArrayList<String> Genres2 = new ArrayList<>();
        Genres2.add("Soundscape");
        Genres2.add("Micro Noise");
        ArrayList<String> Awards2 = new ArrayList<>();
        Awards2.add("1980, Academy Award for Best Soundscape in a Cafe");
        Awards2.add("1985, Academy Award for Best Soundscape near the Ocean");

//        CREATE Artist Object
//        Object TestCase3_Data1
        Artist TestCase3_Data1 = new Artist(
                ArtistID1,
                Name1,
                Address1,
                Birthdate1,
                Bio1,
                Occupations1,
                Genres1,
                Awards1,
                null
        );
//        TestCase3_Data1.addArtist();

//        Object TestCase3_Data2
        Artist TestCase3_Data2 = new Artist(
                ArtistID2,
                Name2,
                Address2,
                Birthdate2,
                Bio2,
                Occupations2,
                Genres2,
                Awards2,
                null
        );
//        TestCase3_Data2.addArtist();

//        ASSERTIONS
        List<String> OccupationsExpected1 = asList("Soloist");
        List<String> GenresExpected1 = asList("Classical", "Jazz", "Rock");
        List<String> AwardsExpected1 = asList("2022, Academy Award for Best Original Score",
                "2022, Academy Award for Best Sound Design",
                "2010, Academy Award for Best Original Score");
        assertAll (
                "Group Assertion for Test Case 3: Artist Class Lists Match",
                () -> assertEquals("666JACKG$$", TestCase3_Data1.ID),
                () -> assertLinesMatch(OccupationsExpected1, TestCase3_Data1.Occupations),
                () -> assertLinesMatch(GenresExpected1, TestCase3_Data1.Genres),
                () -> assertLinesMatch(AwardsExpected1, TestCase3_Data1.Awards)
        );
        List<String> OccupationsExpected2 = asList("Composer");
        List<String> GenresExpected2 = asList("Soundscape", "Micro Noise");
        List<String> AwardsExpected2 = asList("1980, Academy Award for Best Soundscape in a Cafe",
                "1985, Academy Award for Best Soundscape near the Ocean");
        assertAll (
                "Group Assertion for Test Case 3: Artist Class Lists Match",
                () -> assertEquals("985TONYG**", TestCase3_Data2.ID),
                () -> assertLinesMatch(OccupationsExpected2, TestCase3_Data2.Occupations),
                () -> assertLinesMatch(GenresExpected2, TestCase3_Data2.Genres),
                () -> assertLinesMatch(AwardsExpected2, TestCase3_Data2.Awards)
        );
        System.out.println("Test Complete");
    }
    public void TestAddArtist_TestCase4() {
//        TEST VARIABLES
//        Test Case 4 Data 1
        String ArtistID1 = "666JACKG$$";
        String Name1 = "Jack Gale";
        String Address1 = "Melbourne|Victoria|Australia";
        String Birthdate1 = "05-02-1991";
        String Bio1 = "I am a neo-classical pianist and I am starting to explore jazz";
        ArrayList<String> Occupations1 = new ArrayList<>();
        Occupations1.add("Soloist");
        ArrayList<String> Genres1 = new ArrayList<>();
//        Genres1.add("Pop");
//        Genres1.add("Rock");
        Genres1.add("Classical");
        Genres1.add("Jazz");
        ArrayList<String> Awards1 = new ArrayList<>();
        Awards1.add("2022, Academy Award for Best Original Score");
        Awards1.add("2022, Academy Award for Best Sound Design");
        Awards1.add("2010, Academy Award for Best Original Score");
        Awards1.add("2015, Academy Award for Best Ground-Breaking Performance");

////        Test Case 4 Data 2
        String ArtistID2 = "985TONYG**";
        String Name2 = "Tony Gale";
        String Address2 = "Sydney|New South Whales|Australia";
        String Birthdate2 = "28-08-1954";
        String Bio2 = "I am a soundscape artist that records the silence of flowers blooming";
        ArrayList<String> Occupations2 = new ArrayList<>();
        Occupations2.add("Composer");
        ArrayList<String> Genres2 = new ArrayList<>();
        Genres2.add("Soundscape");
        ArrayList<String> Awards2 = new ArrayList<>();
        Awards2.add("1980, Academy Award for Best Soundscape in a Cafe");
        Awards2.add("1985, Academy Award for Best Soundscape near the Ocean");

//        CREATE Artist Object
//        Object TestCase4_Data1
        Artist TestCase4_Data1 = new Artist(
                ArtistID1,
                Name1,
                Address1,
                Birthdate1,
                Bio1,
                Occupations1,
                Genres1,
                Awards1,
                null
        );
//        TestCase4_Data1.addArtist();

//        Object TestCase4_Data2
        Artist TestCase4_Data2 = new Artist(
                ArtistID2,
                Name2,
                Address2,
                Birthdate2,
                Bio2,
                Occupations2,
                Genres2,
                Awards2,
                null
        );
//        TestCase4_Data2.addArtist();
//        ASSERTIONS
        List<String> OccupationsExpected1 = asList("Soloist");
        List<String> GenresExpected1 = asList("Pop", "Rock", "Jazz");
        List<String> AwardsExpected1 = asList("2022, Academy Award for Best Original Score",
                "2022, Academy Award for Best Sound Design",
                "2010, Academy Award for Best Original Score");
        assertAll (
                "Group Assertion for Test Case 4: Artist Class Lists Don't Match",
                () -> assertEquals("666JACKG$$", TestCase4_Data1.ID),
                () -> assertLinesMatch(OccupationsExpected1, TestCase4_Data1.Occupations),
//                () -> assertNotEquals(GenresExpected1, TestCase4_Data1.Genres),
                () -> assertNotEquals(AwardsExpected1.size(), TestCase4_Data1.Awards.size())
        );
        List<String> OccupationsExpected2 = asList("Composer");
        List<String> GenresExpected2 = asList("Soundscape", "Micro Noise");
        List<String> AwardsExpected2 = asList("1980, Academy Award for Best Soundscape in a Cafe",
                "1985, Academy Award for Best Soundscape near the Ocean");
        assertAll (
                "Group Assertion for Test Case 4: Artist Class Lists Don't Match",
                () -> assertEquals("985TONYG**", TestCase4_Data2.ID),
                () -> assertNotEquals(GenresExpected2.size(), TestCase4_Data2.Genres.size())
        );
        System.out.println("Test Complete");
    }
    public void TestUpdateArtist_TestCase5() throws IOException {
        File myFile = new File("src\\ArtistFile.txt");
        Scanner readFile = new Scanner(myFile);
        while (readFile.hasNextLine()) {
            String ArtistLine = readFile.nextLine();
              ArtistDetailList.add(ArtistLine);
        }
        System.out.println("This is Artist 1: " + ArtistDetailList.get(0));
        System.out.println("This is Artist 2: " + ArtistDetailList.get(1));
        String Artist1 = ArtistDetailList.get(0);
        String Artist2 = ArtistDetailList.get(1);


//        TODO: Create a second dataset for test case 2
//----------------------------------------------------------------------------
//        Change this String(row) to select Artist in ArtistFile.txt
//----------------------------------------------------------------------------
        String[] ArtistSplit = Artist1.split("(?![^)(]*\\([^)(]*?\\)\\)), (?![^\\[]*])"); // First Artist
//        String[] ArtistSplit = Artist2.split("(?![^)(]*\\([^)(]*?\\)\\)), (?![^\\[]*])"); // Second Artist
        ArtistFileID = ArtistSplit[0];
        ArtistFileName = ArtistSplit[1];
        ArtistFileAddress  = ArtistSplit[2];
        ArtistFileBirth = ArtistSplit[3];
        ArtistFileBio = ArtistSplit[4];

//        Formatting Lists to pass through ArtistUpdate()
//        Occupation List
        String artistFileOccupation = ArtistSplit[5];
        String OccStrip = artistFileOccupation.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] ArtistFileOccupationSplit = OccStrip.split(", ");
        int ArtistOccupationListsize = ArtistFileOccupationSplit.length;
        ArrayList ArtistFileOccupationList = new ArrayList<>();
        for (int i = 0; i < ArtistOccupationListsize; i++) {
            ArtistFileOccupationList.add(ArtistFileOccupationSplit[i]);
        }
        ArtistFileOccupation = ArtistFileOccupationList;

//        Genre List
        String artistFileGenre = ArtistSplit[6];
        String GenreStrip = artistFileGenre.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] ArtistFileGenreSplit = GenreStrip.split(", ");
        int ArtistGenreListSize = ArtistFileGenreSplit.length;
        ArrayList ArtistFileGenreList = new ArrayList<>();
        for (int i = 0; i < ArtistGenreListSize; i++) {
            ArtistFileGenreList.add(ArtistFileGenreSplit[i]);
        }
        ArtistFileGenre = ArtistFileGenreList;
//        Award List
        String artistFileAwards = ArtistSplit[7];
        String AwardsStrip = artistFileAwards.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] ArtistAwardSplit = AwardsStrip.split(", ");
        int ArtistAwardSize = ArtistAwardSplit.length;
        for (int i = 0; i < ArtistAwardSize; i++) {
            String Award = ArtistAwardSplit[i++] + ", " + ArtistAwardSplit[i];
            ArtistFileAward.add(Award);
        }

//        Test Case 5 Data 1
        String ArtistID1 = ArtistFileID;
        String Name1 = ArtistFileName;
        String Address1 = ArtistFileAddress;
        String Birthdate1 = ArtistFileBirth;
        String Bio1 = ArtistFileBio;
        ArrayList<String> Occupations1 = ArtistFileOccupation;
        ArrayList<String> Genres1 = ArtistFileGenre;
        ArrayList<String> NewAwards = new ArrayList<>();
        NewAwards.add("2000, Academy Award for Best Original Saxophone");
        NewAwards.add("2023, Academy Award for Loudest Saxophone Ever");
        ArrayList<String> Awards1 = NewAwards;
        String ArtistInFile1 = Artist1;

//        Test Case 5 Data 2
        String ArtistID2 = ArtistFileID;
        String Name2 = ArtistFileName;
        String Address2 = ArtistFileAddress;
        String Birthdate2 = ArtistFileBirth;
        String Bio2 = ArtistFileBio;
        ArrayList<String> NewOccupations = new ArrayList<>();
        NewOccupations.add("Producer");
        NewOccupations.add("Mixer");
        ArrayList<String> Occupations2 = NewOccupations;
        ArrayList<String> Genres2 = ArtistFileGenre;
        ArrayList<String> Awards2 = ArtistFileAward;
        String ArtistInFile2 = Artist2;

//        CREATE Artist Object
//        Object TestCase1_Data1
        Artist TestCase5_Data1 = new Artist(
                ArtistID1,
                Name1,
                Address1,
                Birthdate1,
                Bio1,
                Occupations1,
                Genres1,
                Awards1,
                ArtistInFile1
        );

        Artist TestCase5_Data2 = new Artist(
                ArtistID2,
                Name2,
                Address2,
                Birthdate2,
                Bio2,
                Occupations2,
                Genres2,
                Awards2,
                ArtistInFile2
        );


//      ASSERTIONS
        List<String> AwardsExpected1 = asList(
                "2000, Academy Award for Best Original Saxophone",
                "2023, Academy Award for Loudest Saxophone Ever"
        );
        assertAll (
                "Group Assertion for Test Case 5: UpdateArtist()",
                () -> assertTrue(TestCase5_Data1.UpdateArtist()),
                () -> assertEquals("555JANIN##", TestCase5_Data1.ID),
                () -> assertEquals(AwardsExpected1, TestCase5_Data1.Awards)
        );

//        List<String> OccupatonsExpected2 = asList(
//                "Producer",
//                "Mixer"
//        );
//        assertAll (
//                "Group Assertion for Test Case 5: UpdateArtist()",
//                () -> assertTrue(TestCase5_Data2.UpdateArtist()),
//                () -> assertEquals("999HAYLE()", TestCase5_Data2.Awards),
//                () -> assertEquals(OccupatonsExpected2, TestCase5_Data2.Occupations)
//        );

        System.out.println("Test Complete");
    }
    public void TestUpdateArtist_TestCase6() throws IOException {
        File myFile = new File("src\\ArtistFile.txt");
        Scanner readFile = new Scanner(myFile);
        while (readFile.hasNextLine()) {
            String ArtistLine = readFile.nextLine();
            ArtistDetailList.add(ArtistLine);
        }
        System.out.println("This is Artist 1: " + ArtistDetailList.get(0));
        System.out.println("This is Artist 2: " + ArtistDetailList.get(1));
        System.out.println("This is Artist 3: " + ArtistDetailList.get(2));
        System.out.println("This is Artist 4: " + ArtistDetailList.get(3));
        String Artist1 = ArtistDetailList.get(0);
        String Artist2 = ArtistDetailList.get(1);
        String Artist3 = ArtistDetailList.get(2);
        String Artist4 = ArtistDetailList.get(3);


//----------------------------------------------------------------------------
//        Change this String(row) to select Artist in ArtistFile.txt
//----------------------------------------------------------------------------
//        String[] ArtistSplit = Artist1.split("(?![^)(]*\\([^)(]*?\\)\\)), (?![^\\[]*])"); // First Artist
//        String[] ArtistSplit = Artist2.split("(?![^)(]*\\([^)(]*?\\)\\)), (?![^\\[]*])"); // Second Artist
//        String[] ArtistSplit = Artist3.split("(?![^)(]*\\([^)(]*?\\)\\)), (?![^\\[]*])"); // Second Artist
          String[] ArtistSplit = Artist4.split("(?![^)(]*\\([^)(]*?\\)\\)), (?![^\\[]*])"); // Second Artist
        ArtistFileID = ArtistSplit[0];
        ArtistFileName = ArtistSplit[1];
        ArtistFileAddress  = ArtistSplit[2];
        ArtistFileBirth = ArtistSplit[3];
        ArtistFileBio = ArtistSplit[4];

//        Formatting Lists to pass through ArtistUpdate()
//        Occupation List
        String artistFileOccupation = ArtistSplit[5];
        String OccStrip = artistFileOccupation.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] ArtistFileOccupationSplit = OccStrip.split(", ");
        int ArtistOccupationListsize = ArtistFileOccupationSplit.length;
        ArrayList ArtistFileOccupationList = new ArrayList<>();
        for (int i = 0; i < ArtistOccupationListsize; i++) {
            ArtistFileOccupationList.add(ArtistFileOccupationSplit[i]);
        }
        ArtistFileOccupation = ArtistFileOccupationList;

//        Genre List
        String artistFileGenre = ArtistSplit[6];
        String GenreStrip = artistFileGenre.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] ArtistFileGenreSplit = GenreStrip.split(", ");
        int ArtistGenreListSize = ArtistFileGenreSplit.length;
        ArrayList ArtistFileGenreList = new ArrayList<>();
        for (int i = 0; i < ArtistGenreListSize; i++) {
            ArtistFileGenreList.add(ArtistFileGenreSplit[i]);
        }
        ArtistFileGenre = ArtistFileGenreList;
//        Award List
        String artistFileAwards = ArtistSplit[7];
        String AwardsStrip = artistFileAwards.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] ArtistAwardSplit = AwardsStrip.split(", ");
        int ArtistAwardSize = ArtistAwardSplit.length;
        for (int i = 0; i < ArtistAwardSize; i++) {
            String Award = ArtistAwardSplit[i++] + ", " + ArtistAwardSplit[i];
            ArtistFileAward.add(Award);
        }

//        Test Case 5 Data 1
        String ArtistID1 = ArtistFileID;
        String Name1 = ArtistFileName;
        String Address1 = ArtistFileAddress;
        String Birthdate1 = ArtistFileBirth;
        String Bio1 = ArtistFileBio;
        ArrayList<String> Occupations1 = ArtistFileOccupation;
        ArrayList<String> Genres1 = ArtistFileGenre;
        ArrayList<String> NewAwards = new ArrayList<>();
        NewAwards.add("1999, Academy Award for Best Sound Design");
        ArrayList<String> Awards1 = NewAwards;
        String ArtistInFile1 = Artist3;

//        Test Case 5 Data 2
        String ArtistID2 = ArtistFileID;
        String Name2 = ArtistFileName;
        String Address2 = ArtistFileAddress;
        String Birthdate2 = ArtistFileBirth;
        String Bio2 = ArtistFileBio;
        ArrayList<String> NewOccupations = new ArrayList<>();
        NewOccupations.add("Composer");
        ArrayList<String> Occupations2 = NewOccupations;
        ArrayList<String> Genres2 = ArtistFileGenre;
        ArrayList<String> Awards2 = ArtistFileAward;
        String ArtistInFile2 = Artist2;

//        CREATE Artist Object
//        Object TestCase1_Data1
        Artist TestCase6_Data1 = new Artist(
                ArtistID1,
                Name1,
                Address1,
                Birthdate1,
                Bio1,
                Occupations1,
                Genres1,
                Awards1,
                ArtistInFile1
        );

        Artist TestCase6_Data2 = new Artist(
                ArtistID2,
                Name2,
                Address2,
                Birthdate2,
                Bio2,
                Occupations2,
                Genres2,
                Awards2,
                ArtistInFile2
        );


//      ASSERTIONS
//        assertAll (
//                "Group Assertion for Test Case 6: UpdateArtist()",
//                () -> assertFalse(TestCase6_Data1.UpdateArtist(), "The Award cannot be changed, Award Year is less than 2000"),
//                () -> assertEquals("888BENGA$$", TestCase6_Data1.ID)
//        );
//

        assertAll (
        "Group Assertion for Test Case 6: UpdateArtist()",
                () -> assertFalse(TestCase6_Data2.UpdateArtist(), "Cannot change occupation if Artist Birth Year is before 2000"),
                () -> assertEquals("09-09-1950", TestCase6_Data2.Birthdate),
                () -> assertEquals("666LUCIG**", TestCase6_Data2.ID)
        );

        System.out.println("Test Complete");
    }

}

