    import java.util.Scanner;
class asiacup {
     int NoOfteam=8;
     int NoOfGrp=2;
     String ven="Dubai/Abudhabi";
     String schl="Match will be start  from 8 pm live on Sony Sports 1,2,3,5 and mobile Sony liv";

    public void tournamentdetails(){
        System.out.println("Number OF Teams: "+NoOfteam);
        System.out.println("Number Of Groups: "+NoOfGrp);
        System.out.println();
        System.out.println("venue: "+ven);
        System.out.println("schedule: "+schl);
    }

    public void teams(){
        String teams[]={"India","Pakistan","Afghanistan","Bangladesh","Sri Lanka","UAE","Oman","Hong Kong"};
        int i;
        System.out.println("\n show every teams");
        for(i=0;i<teams.length;i++){
            System.out.println(teams[i]);
        }
    }

    public void groups(){
        System.out.println("----- Show Every Groups ----- ");
        String grp1[]={"India","UAE","Pakistan","Oman"};
        String grp2[]={"Afghanistan","Sri Lanka","Hong Kong","Bangladesh"};
        int i;
        System.out.println("List Of Group A Teams:");
        for(i=0;i<4;i++){
            System.out.println(grp1[i]+" ");
        }
        System.out.println("\n");
        System.out.println("List Of Group B Teams:");
        for(i=0;i<4;i++){
            System.out.println(grp2[i]+" ");
        }
    }

    public void match(){
        String Matchs[]={
            "TUES, 09 SEP 2025, 8 PM, AFG VS HKG -> ABU DHABI (GROUP B) ",
            "WED, 10 SEP 2025, 8 PM, IND VS UAE -> DUBAI (GROUP A)",
            "THU, 11 SEP 2025, 8 PM,  BAN VS HKG -> ABU DHABI (GROUP B)",
            "FRI, 12 SEP 2025, 8 PM, OMN VS PAK -> DUBAI (GROUP A)",
            "SAT, 13 SEP 2025, 8 PM, BAN VS SL -> ABU DHABI (GROUP B)",
            "SUN, 14 SEP 2025, 8 PM, IND VS PAK -> DUBAI (GROUP A)",
            "MON, 15 SEP 2025, 8 PM, UAE VS OMN -> ABU DHABI (GROUP A)",
            "MON, 15 SEP 2025, 8 PM, HKG VS SL -> DUBAI (GROUP B)",
            "TUES, 16 SEP 2025, 8 PM, AFG VS BAN -> ABU DHABI (GROUP B),",
            "WED, 17 SEP 2025, 8 PM, UAE VS PAK -> DUBAI (GROUP A)",
            "THUS, 18 SEP 2025, 8 PM, AFG VS SL -> ABU DHABI (GROUP B)",
            "FRI, 19 SEP 2025, 8 PM, IND VS OMN -> DUBAI (GROUP A)" 
        };
        String Rest_Match[]={
               "SAT SEP 20 8 PM Sl Vs Ban -> Dubai",
               "SUN SEP 21 8 PM Ind Vs pak -> Dubai",
               "TUES SEP 23 8 PM  Pak Vs Sl -> Abu Dhabi",
               "WED SEP 24 8 PM Ind Vs Ban -> Dubai",
               "THUS SEP 25 8 PM Pak VS Ban -> Dubai",
               "FRI SEP 26 8 PM Ind VS Sl -> Dubai",
                "------------ FINAL -----------",
               "SUN SEP 28 8 PM Ind VS Pak -> Dubai"
        };
        int i;
        System.out.println("\n----- Matches -----");
        for(i=0;i<Matchs.length;i++){
            System.out.println("Match "+(i+1)+" "+Matchs[i]);
        }
        System.out.println("\nSuper Four Stage (September 2025)");
        System.out.println("\n------Top two teams from each group advance to this round-robin Super Four phase------");
        System.out.println("India and Pakistan from Group 1 are Qualified for Super Four Stage");
        System.out.println("Sri Lanka and Bangladesh from Group 2 are Qualified for Super Four Stage");
        System.out.println();
        System.out.println("All times are in India Standered Time");
        System.out.println();
        for(i=0;i<Rest_Match.length;i++){
            System.out.println(Rest_Match[i]);
        }
        System.out.println();
    }

    public void fixtuers(){
        String sch1[]={
             "WED, 10 SEP 2025, 8 PM, IND VS UAE -> DUBAI (GROUP A)",
             "SUN, 14 SEP 2025, 8 PM, IND VS PAK -> DUBAI (GROUP A)",
             "FRI, 19 SEP 2025, 8 PM, IND VS OMN -> DUBAI (GROUP A)"
        };
        String sch2[]={
            "FRI, 12 SEP 2025, 8 PM, OMN VS PAK -> DUBAI (GROUP A)",
            "MON, 15 SEP 2025, 8 PM, OMN VS UAE -> ABU DHABI (GROUP A)",
            "FRI, 19 SEP 2025, 8 PM, OMN VS IND -> DUBAI (GROUP A)"   
        };
        String Sch3[]={
            "WED, 10 SEP 2025, 8 PM, UAE VS IND -> DUBAI (GROUP A)",
            "MON, 15 SEP 2025, 8 PM, UAE VS OMN -> ABU DHABI (GROUP A)",
            "WED, 17 SEP 2025, 8 PM, UAE VS PAK -> DUBAI (GROUP A)"
        };
        String sch4[]={
             "FRI, 12 SEP 2025, 8 PM, PAK VS OMN -> DUBAI (GROUP A)",
             "SUN, 14 SEP 2025, 8 PM, PAK VS IND -> DUBAI (GROUP A)",
             "WED, 17 SEP 2025, 8 PM, PAK VS UAE -> DUBAI (GROUP A)"
        };
        String sch5[]={
            "TUES, 09 SEP 2025, 8 PM, AFG VS HKG -> ABU DHABI (GROUP B) ",
            "TUES, 16 SEP 2025, 8 PM, AFG VS BAN -> ABU DHABI (GROUP B),",
            "THUS, 18 SEP 2025, 8 PM, AFG VS SL -> ABU DHABI (GROUP B)"
        };
        String sch6[]={
            "SAT, 13 SEP 2025, 8 PM, SL VS BAN -> ABU DHABI (GROUP B)",
            "MON, 15 SEP 2025, 8 PM, SL VS HKG ->  DUBAI (GROUP B)",
            "THUS, 18 SEP 2025, 8 PM, SL VS AFG -> ABU DHABI (GROUP B)"
        };
        String sch7[]={
            "TUES, 09 SEP 2025, 8 PM, HKG VS AFG -> ABU DHABI (GROUP B) ",
            "THU, 11 SEP 2025, 8 PM,  HKG VS BAN -> ABU DHABI (GROUP B)",
            "MON, 15 SEP 2025, 8 PM, HKG VS SL -> DUBAI (GROUP B)"
        };
        String sch8[]={
            "THU, 11 SEP 2025, 8 PM,  BAN VS HKG -> ABU DHABI (GROUP B)",
             "SAT, 13 SEP 2025, 8 PM, BAN VS SL -> ABU DHABI (GROUP B)",
             "TUES, 16 SEP 2025, 8 PM, BAN VS AFG -> ABU DHABI (GROUP B),"
        };
        int i;
        System.out.println("\n ----- Fixture Of Every Team -----");

        System.out.println("\n Fixture Of India");
        for(i=0;i<sch1.length;i++){
            System.out.println(sch1[i]);
        }

        System.out.println("\n Fixture Of Oman");
        for(i=0;i<sch2.length;i++){
            System.out.println(sch2[i]);
        }

        System.out.println("\n Fixture Of Uae");
        for(i=0;i<Sch3.length;i++){
            System.out.println(Sch3[i]);
        }

        System.out.println("\n Fixture Of Pakistan");
        for(i=0;i<sch4.length;i++){
            System.out.println(sch4[i]);
        }

        System.out.println("\n Fixture Of Afghanistan");
        for(i=0;i<sch5.length;i++){
            System.out.println(sch5[i]);
        }

        System.out.println("\n Fixture Of Sri Lanka");
        for(i=0;i<sch6.length;i++){
            System.out.println(sch6[i]);
        }

        System.out.println("\n Fixture Of Hong Kong");
        for(i=0;i<sch7.length;i++){
            System.out.println(sch7[i]);
        }

        System.out.println("\n Fixture Of Bangladesh");
        for(i=0;i<sch8.length;i++){
            System.out.println(sch8[i]);
        }
        System.out.println();
    }

    public void squad(){
        String ind[]={
            "Suryakumar Yadav (c), Shubman Gill(vc),Abhishek Sharma,Sanju Samson (wk),Tilak Varma",
            "Rinku Singh,Jitesh Sharma (wk),Axar Patel,Hardik Pandya,Shivam Dube",
            "Kuldeep Yadav,Varun Chakaravarthy,Jasprit Bumrah,Arshdeep Singh,Harshit Rana"
        };

        String afg[]={
            "Rashid Khan(c), Rahmanullah Gurbaz (wk), Ibrahim Zadran, Darwish Rasooli, Sediqullah Atal, Azmatullah Omarzai,",
             "Karim Janat, Mohammad Nabi, Gulbadin Naib(vc), Sharafuddin Ashraf, Mohammad Ishaq, Mujeeb Ur Rahman",
             "AM Ghazanfar, Noor Ahmad, Fareed Ahmad, Naveen-ul-Haq, Fazalhaq Farooqi"
        };

        String omn[]={
           "Jatinder Singh(c) Hammad Mirza, Vinayak Shukla, Sufyan Yousuf, Ashish Odedera, Aamir Kaleem,",
           "Mohammed Nadeem, Sufyan Mehmood, Aryan Bisht, Karan Sonavale, Zikriya Islam, Hassnain Ali Shah, Faisal Shah,",
           "Muhammad Imran, Nadeem Khan, Shakeel Ahmad, Samay Shrivastava"
        };

        String sl[]={
            "Charith Asalanka (c),Pathum Nissanka, Kusal Mendis, Kusal Perera, Nuwanidu Fernando, Kamindu Mendis, Kamil Mishara,",
            "Pathum Nissanka, Kusal Mendis, Thrisara Perera, Nuwanidu Fernando, Kamindu Mendis, Kamil Mishara,",
            "Dushmantha Chameera, Binura Fernando, Nuwan Thushara, Matheesha Pathirana"
        };

        String hkg[]={
            "Yasim Murtaza (c), Babar Hayat, Zeeshan Ali (wk), Niazakat Khan Mohammad, Nasrulla Rana, Martin Coetzee,",
            "Anshuman Rath, Kalhan Marc Challu, Ayush Shukla, Mohammad Aizaz Khan, Ateeq ul Rehman Iqbal, Kinchit",
            "Shah (wk), Ali Hassan, Shahid Wasif (wk), Ghazanfar Mohammad, Mohammad Waheed"
        };

        String uae[]={
            "Muhammad Waseem (c), Alishan Sharafu, Aryansh Sharma (wk), Asif Khan, Dhruv Parashar, Ethan DSouza, Haider Ali, Harshit",
            "Kaushik, Junaid Siddique, Matiullah Khan, Muhammad Farooq, Muhammad Jawadullah, Muhammad Zohaib,",
            "Rahul Chopra (wk), Rohid Khan, Simranjeet Singh, Saghir Khan"
        };

        String pak[]={
            "Salman Ali Agha (c), Abrar Ahmed, Faheem Ashraf, Fakhar Zaman, Haris Rauf, Hasan Ali, Hasan Nawaz, Hussain Talat,",
            "Khushdil Shah, Mohammad Haris (wk), Mohammad Nawaz, Mohammad Waseem Jr., Sahibzada Farhan, Saim",
            "Ayub, Salman Mirza, Shaheen Afridi, Sufyan Moqim"
        };

        String ban[]={
            "Litton Das (c/wk) ,Tanzid Hasan, Parvez Hossain Emon, Saif Hassan, Towhid Hridoy, Jaker Ali, Shamim Hossain, Nurul",
            "Hasan, Mahedi Hasan, Rishad Hossain, Nasum Ahmed, Mustafizur Rahman, Tanzim Hasan Sakib, Taskin",
            "Ahmed, Shoriful Islam, Mohammad Saifuddin"
        };

        int i;
        System.out.println("\n Men's Asia Cup 2025 Squad List");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("\n Squad Of India");
        for(i=0;i<ind.length;i++){
            System.out.println(ind[i]+" ");
        }

        System.out.println("\n Squad Of Afghanistan");
        for(i=0;i<afg.length;i++){
            System.out.println(afg[i]+" ");
        }

        System.out.println("\n Squad Of Oman");
        for(i=0;i<omn.length;i++){
            System.out.println(omn[i]+" ");
        }

        System.out.println("\n Squad Of Uae");
        for(i=0;i<uae.length;i++){
            System.out.println(uae[i]+" ");
        }

        System.out.println("\n Squad Of Hong Kong");
        for(i=0;i<hkg.length;i++){
            System.out.println(hkg[i]+" ");
        }

        System.out.println("\n Squad Of Sri Lanka");
        for(i=0;i<sl.length;i++){
            System.out.println(sl[i]+" ");
        }

        System.out.println("\n Squad Of Pakistan");
        for(i=0;i<pak.length;i++){
            System.out.println(pak[i]+" ");
        }

        System.out.println("\n Squad Of Bangladesh");
        for(i=0;i<ban.length;i++){
            System.out.println(ban[i]+" ");
        }
    }
    public void result(){
        int afg=188;
        int hkg=94,res;
        System.out.println("--------Asia cup T20 League------------");
        System.out.println("Group Stage");
        res=afg-hkg;
        System.out.println("9 September 2025 (Match 1)");
        System.out.println("Afghanistan Won by: "+res+" runs");
        System.out.println("Afghanistan Score In 20 Overs 188 /6");
        System.out.println("Hong Kong Score In 20 overs 94/9");
        System.out.println("------------------------------------------");
        System.out.println("------------Top Performers-----------");
        System.out.println(" Player of the Match: Azmatullah Omarzai 53(21)");
        System.out.println();


        int ind=3;
        int uae=57;
        int ind1=ind+uae;
         System.out.println("10 September 2025 (Match 2)");
        System.out.println("India Won by 9 wickets");
        System.out.println("Uae Score 57 All out in 13.1 Over");
        System.out.println("India Score "+ind1+" with Loss 1 Wickt in 4.3 Over");
        System.out.println("---------------------------------------------------");
        System.out.println("------------Top Performers-----------");
        System.out.println(" Player of the Match: Kuldeep Yadav 4/7(2.1)");
        System.out.println();


       int hn=143;
       int bd=1;
       int bd1=bd+hn;
       System.out.println("11 September 2025 (Match 3)");
       System.out.println("Bangladesh Won by 7 wcikets");
       System.out.println("Hong Kong Score 143 with Loss 7 Wickets in 20 Over");
       System.out.println("Bangladesh Score "+bd1+" with Loss 3 Wickets in 17.4 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Litton Das 53(39)");
       System.out.println();

       int pak=160;
       int om=66;
       int res2=pak-om;
       System.out.println("12 September 2025 (Match 4)");
        System.out.println("Pakistan Won by "+res2+ "runs");
       System.out.println("Pakistan Score 160 with Loss 7 Wickets in 20 Over");
       System.out.println("Oman Score 66 All Out in 16.4 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Mohammad Haris 66(43)");
       System.out.println();

       int bn=139;
       int sl=1;
       int re3=sl+bn;
       System.out.println("13 September 2025 (Match 5");
       System.out.println("Sri Lanka Won by 6 Wickets");
       System.out.println("Bangldesh Score 139 with Loss 5 Wickets in 20 Over");
       System.out.println("Sri Lanka Score "+re3+" with Loss 4 Wickets in 14.4 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Math: Kamil Mishara 46*(32)");
       System.out.println();

       int pak2=127;
       int ind2=4;
       int res4=pak2+ind2;
       System.out.println("14 September 2025 (Match 6)");
       System.out.println("India Won by 7 Wickets");
       System.out.println("Pakistan Score 127 with Loss 9 Wickets in 20 Over");
       System.out.println("India Score "+res4+" with Loss 3 Wickets in 15.5 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Kuldeep yadav 3/18(4)");
       System.out.println();

       int sl2=4;
       int Hong=149;
       int res3=sl2+Hong;
        System.out.println("15 September 2025 (Match 7)");
       System.out.println("Sri Lanka Won by 4 Wickets");
       System.out.println("Hong KOng Score 149 with Loss 4 Wickets in 20 Over");
       System.out.println("Sri Lanka Score "+res3+" With Loss 6 Wickets 18.5 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Pathum Nissanka 68(44)");
       System.out.println();
    
        System.out.println("15 September 2025 (Match 8)");
        System.out.println("Uae Won by 42 Runs");
        System.out.println("Uae Score 172 With Loss 5 Wickets in 20 Over");
        System.out.println("Oman Score 130 All Out in 18.4 Over");
        System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: 4/23(4)");
       System.out.println();

       System.out.println("16 Spetember 2025 (Match 9)");
       System.out.println("Bangladesh won by 8 Runs");
       System.out.println("Bangladesh Score 155 with Loss 5 Wickets in 20 Over");
       System.out.println("Afghabistan Score 146 All Out in 20 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Nasum Ahmed 2/11(4)");
       System.out.println();

       System.out.println("17 September 2025 (Match 10)");
       System.out.println("Pakistan won by 41 Runs");
       System.out.println("Pakistan Score 146 with Loss 9 Wickets in 20 Over");
       System.out.println("Uae Score 105 All Out  in 17.4 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Shaheen Afridi 1/16(3) & 29*(14)"); 
       System.out.println();

       System.out.println("18 September 2025 (Match 11)");
       System.out.println("Sri Lanka won by 6 Wickets");
       System.out.println("Afghanistan Score 169 with Loss 8 wickets in 20 Over");
       System.out.println("Sri Lanka Score 171 With Loss 4 wickets in 18.4 Over");
     System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Kusal Mendis 74*(52)");
       System.out.println();

       System.out.println("19 September 2025 (Match 12)");
       System.out.println("India won by 21 Runs");
       System.out.println("India Score 188 with Loss 8 wickets in 20 Over");
       System.out.println("Oman Score 164 with Loss 4 wickets in 20 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Sanju Samson 56(45)");
       System.out.println();

        System.out.println("Super Four Stage");
        System.out.println();

       System.out.println("20 September 2025 (Match 13)");
       System.out.println("Bangladesh won by 6 Wickets");
       System.out.println("sri Lanka Score 168 with Loss 7 Wickets in 20 Over");
       System.out.println("Bangladesh SCore 169 with Loss 6 Wickets in 19.5 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Saif Hassan 61(45)");
       System.out.println();

       System.out.println("21 September 2025 (Match 14)");
       System.out.println("India won by 6 Wickets");
       System.out.println("Paksitan Score 171 With Loss 5 Wickets in 20 Over");
       System.out.println("India Score 174 with Loss 4 Wickets in 18.5 Over");
        System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Avishek Sharma 74(39)");
       System.out.println();

       System.out.println("23 September 2025 (Match 15)");
       System.out.println("Pakistan won by 5 Wickets");
       System.out.println("Sri Lanka Score 133 with Loss 8 Wickets in 20 Over");
       System.out.println("Pakistan Score 138 with Loss 5 Wickets in 20 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player of the Match: Hussain Talat 2/18(3) & 32*(30)");
       System.out.println();
       
      System.out.println("24 September 2025 (Match 16)");
      System.out.println("India won by 41 Runs");
      System.out.println("India Score 168 with Loss 8 Wicktes in 20 Over");
      System.out.println("Bangladesh Score 127 All Out in 19.3 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Avishek Sharma 75(37)");
       System.out.println();

       System.out.println("25 September 2025 (Match 17)");
       System.out.println("Paksitan won by 11 Runs");
       System.out.println("Paksiatn Score 135 with Loss 8 Wcikets in 20 Over");
       System.out.println("Bangladesg Score 124 with Loss 9 Wickets in 20 Over");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Shaheen Afridi 3/17(4) & 19(13)");
       System.out.println();

       System.out.println("26 September 2025 (Match 18)");
       System.out.println("India Won SAUPER Over (5 Ball Left)");
       System.out.println("India Score 202 with Loss 5 Wickets in 20 Over");
       System.out.println("Sri Lanka Score 202 With Loss 5 Wickets in 20 Over");
       System.out.println("------------ SUPER OVER ---------------------");
       System.out.println("Sri Lanka Score 2 Runs with Loss 2 wickets(All Out) in 1 Over");
       System.out.println("India Score 3 Runs with Loss no Wickets");
       System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player Of the Match: Pathum Nissanka 107(58)");
       System.out.println();

       System.out.println("28 September 2025 (Match 19 -> Final)");
       System.out.println("India won by 5 Wickets");
       System.out.println("Pakistan Score 146 All Out In 19.1 Over");
       System.out.println("India Score 150 Runs with Loss 5 Wickets in 18.4 Over");
        System.out.println("---------------------------------------------------");
       System.out.println("------------Top Performers-----------");
       System.out.println("Player of the Match: Tilak Verma 69*(53)");
       System.out.println("Player of the Tournament: Avishek Sharma 314 Runs with 50 avg and 196 Strike Rate ");
       System.out.println();
    }

}

public class Asiacuptournament {
    public static void main(String[] args) {
      asiacup obj=new asiacup();
       int ch;
       int wt=0;
       Scanner sc=new Scanner(System.in);
       do{
             System.out.println("DP WORLD ASIA CUP 2025 ALL UPDATE ARE SHOWING HERE");
             System.out.println("-------------------------------------------------");
             System.out.println("press 1 for show match details");
             System.out.println("press 2 for show teams");
             System.out.println("press 3 for show groups");
             System.out.println("press 4 for show every matches");
             System.out.println("press 5 for fixture of every teams");
             System.out.println("press 6 for show squad of every teams");
             System.out.println("press 7 for show match result of every teams");
             System.out.println("press 8 for exit");
             System.out.println("---------------------------------------------------");

             System.out.print("Please choose any option from the menu bar : ");
             ch=sc.nextInt();

              if (ch < 1 || ch > 8) { 
                 wt++;
                 if (wt >= 3) {
                     System.out.println("\n You have reached maximum invalid attempts (3).");
                     System.out.println("Program will restart after 30 sec...");
                     try {
                         Thread.sleep(30000); 
                     }
                      catch (InterruptedException e) {
                         System.out.println("Sleep interrupted!");
                     }
                     wt=0;
                     continue;
                 } 
                 else {
                     System.out.println("Out of limit! Please try again (Attempt " + wt + " of 3)");
                 }
                 continue;
             }

             switch (ch) {
                 case 1:
                     obj.tournamentdetails();
                     break;

                case 2:
                   obj.teams();
                   break;

                 case 3:
                   obj.groups();
                   break;

                 case 4:
                   obj.match();
                   break;

                 case 5:
                   obj.fixtuers();
                   break;

                 case 6:
                   obj.squad();
                   break;

                case 7:
                   obj.result();
                   break;

                 case 8:
                     System.out.println("\n Thank You Please visit again");
                     ch=8;
                     break;
                default:
                    System.out.println("wrong choice");
                     break;
             }

        } while (ch!=8);
        sc.close();
    }
}