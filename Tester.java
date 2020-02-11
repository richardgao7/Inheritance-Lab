public class Tester
{

    public static void runTests1()
    {
        // code below to be uncommented at the appropriate time during the lab        
//		Flier aFlier = new SkiJumper("Haoye","Tang");
//        Bird tweety = new Bird();
//
//        aFlier.fly();   // which fly method gets invoked? _________
//        tweety.fly();   // which fly method gets invoked? _________
//        
//        tweety.findHome();  // will this cause an error? _________
//        
//        aFlier = tweety;    // is this valid? _________
//        aFlier.fly();       // which fly method gets invoked? _________
//        aFlier.findHome();  // does this cause an error? _________

//              
//         if (aFlier instanceof Bird)  // which statement gets printed?
//             System.out.println("I am a bird!");
//         else
//             System.out.println("I am NOT a bird!");
// 
//         if (tweety instanceof Bird)   // which statement gets printed?
//             System.out.println("I am a bird!");
//         else
//             System.out.println("I am NOT a bird!");
    }
    
    public static void runTests2()
    {
        // code below to be uncommented at the appropriate time during the lab 
		 Flier[] flyArray = new Flier[4];
        
         flyArray[0] = new Bird();  
         flyArray[1] = new SkiJumper("Calvin","Chou");
        
         Flier tweety = new Bird();
         flyArray[2] = tweety;       	// will this cause an error? ________
        
         Runner run1 = new Runner();
         Athlete ath1 = run1;         	// will this cause an error? ________
         Runner run2 = ath1;         	// will this cause an error? ________
         Athlete ath2 = new SkiJumper("Richard","Gao");
         Runner run3 = (Runner)ath2;  	// will this cause an error? ________       

         flyArray[3] = new Flier();  	// will this cause an error?  ________
        
        // // now that we've stored elements, let's get them back.
        
         flyArray[0].fly();      		// which fly method is invoked? _____
         flyArray[0].findHome(); 		// will this cause an error?  ________
         (Bird)flyArray[0].findHome();   // will this cause an error?  ________
         ((Bird)flyArray[0]).findHome(); // will this cause an error?  ________

         flyArray[1].fly();      		// which fly method is invoked? _____

         flyArray[2].findHome(); 		// will this cause an error?  ________
         (Bird)flyArray[2].findHome(); 	// will this cause an error?  ________
         ((Bird)flyArray[2]).findHome(); // will this cause an error?  ________        
     
       
        
    }
}
