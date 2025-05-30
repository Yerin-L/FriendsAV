import java.util.Scanner;
public class Main
{
    //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
    //May want to create an array of goodbye answers.
        static String[] goodBye = {"bye"};
        static String[] basics = {"1. Food Menu", "2. Drink Menu", "3. Customer Service", "4. Sample Order", "5. Reward Program"};
        static String[] foodMenu = {"1. Burrito/Burrito Bowl", "2. Taco", "3. Kid Meals"};
        static String[] drinksMenu = {"1. Fountain Drinks", "2. Bottled Drinks", "3. Canned Drinks"};
        static String[] costumerService = {"1. Our Values", "2. Leave a rating", "3. Distance from Chiptole"};
        static double lat1 = 37.658980;
        static double lon2 = -121.898030;
        static double rate = 0.0;
        static double value = 0;
        static double lat2 = 0.0;
        static double lon1 = 0.0;
        static String entree;
        static String drink;
        static String addOn = "chips";
        static String red = "\u001B[31m";
        static String white = "\u001B[37m";
        static String green = "\u001B[32m";

        //pleasanton chipotle coords
        //lat: 37.658980
        //long: -121.898030
       public static void main(String[] args)
       {
        
        Scanner in = new Scanner (System.in);//Creates scanner object.
        Scanner in2 = new Scanner (System.in);//Creates a second scanner object.
        System.out.println(red + "Hello there, I am Chipotle's ChipChat Bot. I am here to help you on most things Chipotle related how can I help you?");
        System.out.println("If you would like to end any interactions further on forward please type 'bye'.");
        System.out.println(basics[0]);
        System.out.println(basics[1]);
        System.out.println(basics[2]);
        System.out.println(basics[3]);
        System.out.println(basics[4]);

        System.out.print(white + " ");
        String userResp = in.nextLine();
        //in.nextLine() uses the scanner object to get the user's responnse as a String
        userResp = userResp.toLowerCase();
        System.out.print(red + " ");
        for(int i = 0; i >=0; i++){
                if (!userResp.equalsIgnoreCase(goodBye[0])) {
                        if(userResp.contains("food")){
                                System.out.println(green + "Here is our options I can tell you about for our Food Menu:");
                                System.out.println(red + foodMenu[0]);
                                System.out.println(foodMenu[1]);
                                System.out.println(foodMenu[2]);       
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");                 
                                } 
                        else if(userResp.contains("burrito") || userResp.contains("bowl")){
                                System.out.println("Our burritos/burrito bowl have all sorts of customisation offerings.");
                                System.out.println("We have fresh ingredients cut and prepared every day, fresh rice cooked daily, all in a warm heated flour tortilla or a eco-friendly paper bowl.");
                                System.out.println("Both options pair nicely with a bag of our Chipotle flour tortilla chips. If you like to know more ask about our Toppings.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        }
                        else if(userResp.contains("taco")){
                                System.out.println("Our tacos have all sorts of customisation offerings.");
                                System.out.println("We serve fresh cut and prepared produce, freshly cooked rice cooked, all in 3 hard or soft flour tortilla.");
                                System.out.println("All perfect to go with a bag of our Chipotle flour tortilla chips. If you like to know more ask about our Toppings.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        }
                        else if(userResp.contains("meal") || userResp.contains("kid")){
                                System.out.println("Our Kids Meal has all sorts of customisation offerings.");
                                System.out.println("We have fresh ingredients cut and prepared every day, fresh rice cooked daily, and can be served as mini Tacos or Quesadilla.");
                                System.out.println("Both options pair nicely with a bag of our Chipotle flour tortilla chips. If you like to know more ask about our Toppings.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        }
                        else if(userResp.contains("toppings")){
                                System.out.println("Here are our topping offerings (Some toppings may not be offered for the quesadilla option):");
                                toppings();
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        }
                        else if(userResp.contains("drink") || userResp.contains("soda")){
                                System.out.println(green + "Here is our options I can tell you about for our Drinks Menu:");
                                System.out.println(red + drinksMenu[0]);
                                System.out.println(drinksMenu[1]);
                                System.out.println(drinksMenu[2]);
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("fountain")){
                                System.out.println("We offer many different flavors of fountain drinks. Such as different sodas, lemonade, water, and iced tea.");
                                System.out.println("Some unique drinks we offer are our: Organic Watermelon Limeade, Organic Lemonade, Organic Manadrin Agua Fresca, and Organic Berry Agua Fresca.");
                                System.out.println("We offer unlimited refills to those who chose to order our fountain drinks; however only applicable if you choose to eat in store.");
                                System.out.println("If you would like to know about our bottled drinks, type 'Bottled Drinks'.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("bottle") || userResp.contains("glass") || userResp.contains("plastic")){
                                System.out.println("We offer many different flavors of bottled drink options. We offer different bottles such as glass and plastic.");
                                System.out.println("We offer:"); 
                                System.out.println(".Mexican Coca-Cola and Sprite");
                                System.out.println(".Coke Zero");
                                System.out.println(".San Pelligrin Sparkling Watter");
                                System.out.println(".Grapefruit and Blackberry Izze");
                                System.out.println(".Tractor Organic Lemonade");
                                System.out.println(".Apple Juice");
                                System.out.println(".Open Still Water");
                                System.out.println("We offer unlimited refills to those who chose to order our fountain drinks; however only applicable if you choose to eat in store.");
                                System.out.println("If you would like to know about our bottled drinks, type 'Canned Drinks'.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("can")){
                                System.out.println("We offer a few flavors of canned drinks. ");
                                System.out.println("We offer two different flavors of Poppi, however this may vary location to location.");
                                System.out.println("We offer Strawberry Lemon and Orange flavors of Poppi.");
                                System.out.println("If you would like to know about our bottled drinks, type 'Fountain Drinks'.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("customer") || userResp.contains("service")){
                                System.out.println(green + "Here's what I can tell you about our customer service:");
                                System.out.println(red + costumerService[0]);
                                System.out.println(costumerService[1]);
                                System.out.println(costumerService[2]);
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("value")){
                                System.out.println("The values we hold as a company are that real is better for you, the people, and the planet.");
                                System.out.println("We believe restaurants shouldn't make food with non-fresh ingredients, preservatives, and added hormones.");
                                System.out.println("As well as, we try and limit our negative effect on the enviorment through methods such as diverting 50% of our landfill and plan to reduce our greenhouse gas emissions by 50% by 2030.");
                                System.out.println("Lastly, we attempt to train and educate as many youth as we can to give them proper work expierence and training");
                                System.out.println("If you'd like to also leave a rating, please type in 'rating'.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("rating") || userResp.contains("star") || userResp.contains("rate")){
                                System.out.println("I have a resturant in Pleasanton that has a rating of 3.5 stars with 148 reviews.");
                                System.out.println("If you would also like to leave a review, please type in your rating from 0-5");
                                System.out.print(white + " ");
                                rate = 0.0;
                                boolean valid = false;
                        
                                // Loop until a valid double is entered
                                while (!valid) {
                                    System.out.print(red + "Please enter a value between 0-5: ");
                                    System.out.print(white);
                                    // Check if the next input is a valid double
                                    if (in2.hasNextDouble()) {
                                        
                                        rate = in2.nextDouble();  // Read the valid double
                                        if(rate >=0 && rate <=5){
                                        valid = true;  // Set validInput to true, ending the loop
                                    }
                                    } else {
                                        System.out.println(red + "Invalid input. Please enter a value between 0-5.");
                                        System.out.print(white);
                                        in2.next();  // Consume the invalid input to avoid an infinite loop
                                    }
                                }
                                System.out.print(red + " ");
                                leaveARating(rate);
                                System.out.println("Thank you for your rating. Would you now like to know how far you are from our Pleasanton location, then type in 'distance'.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("distance") || userResp.contains("dist")){
                                System.out.println("I can tell you the distance from our Pleasanton resturant to you, but I require your current coordinates.");
                                System.out.println("Please tell me what are your current latitude coordinate:");
                                System.out.print(white + " ");
                               // double numResp = in2.nextInt();//Gets the user's input as an integer. 
                               double numResp = 0.0;
                               boolean validInput = false;
                       
                               // Loop until a valid double is entered
                               while (!validInput) {
                                   System.out.print(red + "Please enter a valid value: ");
                                   System.out.print(white);
                                   // Check if the next input is a valid double
                                   if (in2.hasNextDouble()) {
                                       numResp = in2.nextDouble();  // Read the valid double
                                       validInput = true;  // Set validInput to true, ending the loop
                                   } else {
                                       System.out.println(red + "Invalid input. Please enter a valid value.");
                                       System.out.print(white);
                                       in2.next();  // Consume the invalid input to avoid an infinite loop
                                   }
                               }
                       
                                lat2 = numResp;
                                System.out.print(red + " ");
                                System.out.println("Now tell me what are your current longitude coordinate:");
                                System.out.print(white + " ");
                                 numResp = 0.0;
                                 validInput = false;
                        
                                // Loop until a valid double is entered
                                while (!validInput) {
                                    System.out.print(red + "Please enter a valid value: ");
                                    System.out.print(white);
                                    // Check if the next input is a valid double
                                    if (in2.hasNextDouble()) {
                                        numResp = in2.nextDouble();  // Read the valid double
                                        validInput = true;  // Set validInput to true, ending the loop
                                    } else {
                                        System.out.println(red + "Invalid input. Please enter a valid value.");
                                        System.out.print(white);
                                        in2.next();  // Consume the invalid input to avoid an infinite loop
                                    }
                                }
                                lon1 = numResp;
                                System.out.print(red + " ");
                                calcDistance(lat2, lon1);
                                System.out.println("If you would like to make a sample order now, type 'sample order'");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("sample") || userResp.contains("order")){
                                sampleExamples();
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                                for(int a = 0; a >= 0; a++){
                                        if(userResp.contains("burrito") || userResp.contains("bowl")){
                                                entree = "burrito";
                                                break;
                                        }
                                        if(userResp.contains("taco")){
                                                entree = "taco";
                                                break;
                                        }
                                        if(userResp.contains("kid") || userResp.contains("meal")){
                                                entree = "kids meal";
                                                break;
                                        }
                                        else{
                                                System.out.println("Please respond with: Burrito, Taco, or Kids Meal");
                                                System.out.print(white + " ");
                                                userResp = in.nextLine(); 
                                                userResp = userResp.toLowerCase();
                                                System.out.print(red + " ");
                                        }
                                }
                                System.out.println("Next can you tell me which drink you want?");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                                for(int b = 0; b >= 0; b++){
                                        if(userResp.contains("fountain") || userResp.contains("soda")){
                                                drink = "fountain drink";
                                                break;
                                        }
                                        if(userResp.contains("bottled")){
                                                drink = "bottled drink";
                                                break;
                                        }
                                        if(userResp.contains("can")){
                                                drink = "can drink";
                                                break;
                                        }
                                        else{
                                                System.out.println("Please respond with: fountain drink, bottle drink, or canned drink");
                                                System.out.print(white + " ");
                                                userResp = in.nextLine(); 
                                                userResp = userResp.toLowerCase();
                                                System.out.print(red + " ");
                                        }
                                }
                                SampleOrder order = new SampleOrder(entree, drink, addOn);
                                System.out.println("Your order of " + entree + ", " + drink + ", and " + addOn +" price is ");
                                System.out.println(green + "$" + order.calcPrice());
                                System.out.println(red + "Would you like to know more about the other entrees or drinks?");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else if(userResp.contains("reward") || userResp.contains("program")){
                                System.out.println("We here at Chipotle also offer a rewards program to help people save money when buying food from us.");
                                System.out.println("We offer multiple rewards for our members. There are 2 deals offered yearly, birthdya rewards, and $1 = 10 points.");
                                System.out.println("You can redeem free tortillas, chips, guacamole, and up to burritos with our points.");
                                System.out.println("If you'd like to sign up check out our website: https://www.chipotle.com/rewards");
                                System.out.println("Would you like to leave a rating? Type in rating.");
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        } 
                        else{    
                                System.out.println(getRandomResponse());
                                System.out.print(white + " ");
                                userResp = in.nextLine(); 
                                userResp = userResp.toLowerCase();
                                System.out.print(red + " ");
                        }

                }
                else{
                     break;   
                }
        }
        }
        //System.out.println("Bot says blah, expects an int now");
       // int numResp = in2.nextInt();//Gets the user's input as an integer. 

                       
       public static String getRandomResponse(){
        String[] responses = {"Could you try rephrasing that?", "Sorry, I dont understand that?", "What do you mean?", "Could you ask me again?", "I am having trouble understanding can you repeat what you said?", "How about you ask me about our drinks?", "I don't think I can help with that, but I can help with stuff pretaining to our food."};
        int randint = (int) (Math.random()*7);
        return responses[randint];
       }

       
         public static void toppings(){
                System.out.println(".White Rice");
                System.out.println(".Brown Rice");
                System.out.println(".Black Beans");
                System.out.println(".Pinto Beans");
                System.out.println(".Chicken");
                System.out.println(".Carnitas");
                System.out.println(".Barbacoa");
                System.out.println(".Steak");
                System.out.println(".Sofritas");
                System.out.println(".Smoked Brisket");
                System.out.println(".Fajita Vegetables");
                System.out.println(".Romaine Lettuce");
                System.out.println(".Cheese");
                System.out.println(".Corn Salsa");
                System.out.println(".Tomato Salsa");
                System.out.println(".Red-Chili Salsa");
                System.out.println(".Green-Chili Salsa");
                System.out.println(".Sour Cream");
                System.out.println(".Queso");
                System.out.println(".Guacamole");
                System.out.println("If more information is required please visit our nutritions page: ");
                System.out.print("https://www.chipotle.com/nutrition-calculator");
                System.out.println("Otherwise if you'd like to end this interaction please type 'bye'.");

        }

        public static void calcDistance(double lat2, double lon1){
                double distance = (Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon2-lon1))*6371);
                System.out.println("You are " + distance*0.621371 + " miles from the Pleasanton Chipotle at koll center. ("+distance+"km)");
                //acos(sin(lat1)*sin(lat2)+cos(lat1)*cos(lat2)*cos(lon2-lon1))*3958.756
        }

        public static void leaveARating(double num){
                        System.out.println("Your previous rating was: " + rate + " stars");
                        rate = num;
                        System.out.println("Your new rating is: " + rate + "stars");
                }
        public static void sampleExamples(){
                System.out.println("I can offer you sample orders to estimate the prices order combos.");
                System.out.println("However, in order for me to tell you how much your order will cost, you must let me the components of your order.");
                System.out.println("For example, if you want a order of a burrito, fountain drink, and chips it would cost you: ");
                SampleOrder first = new SampleOrder("burrito", "fountain drink", "chips");
                System.out.println(green + "$" + first.calcPrice());
                System.out.println(red + "Another example would be: tacos, bottled drink, and chips. Costing:");
                SampleOrder second = new SampleOrder("taco", "bottled drink", "chips");
                System.out.println(green + "$" + second.calcPrice());
                System.out.println(red + "Lastly: Kids meal, can drink, and chips. Costing:");
                SampleOrder third = new SampleOrder("taco", "bottled drink", "chips");
                System.out.println(green + "$" + third.calcPrice());
                System.out.println(red + "Now how about you give it a try, tell me which entree do you want:");
        }
                
        }
