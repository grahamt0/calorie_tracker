package calorietrackerjxn;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//This program estimates a users recommended daily caloric intake and tracks their progress towards meeting that goal

public class CalorieTracker {

    public static void main(String[] args) throws Exception{

        Scanner inp = new Scanner(System.in);

        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Welcome to the calorie tracker!");
        double rectak = 0;
        boolean valid = false;

        //Will ask user for their age, gender, and activity level
        //Uses this information to find a recommended daily caloric intake
        do {
            System.out.print("Please enter your age: ");
            String str_age = inp.next();
            System.out.print("Please enter your gender (type m for male or f for female): ");
            String gend = inp.next();
            System.out.print("Please enter your activity level (type s for sedentary, m for moderate, or a for active): ");
            String actlvl = inp.next();

            if (str_age.chars().allMatch(Character::isDigit)) {
                int age = Integer.parseInt(str_age);

                if (age > 50) {
                    if (gend.equalsIgnoreCase("m")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 2000;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2400;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2800;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else if (gend.equalsIgnoreCase("f")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 1600;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 1800;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2200;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else {
                        System.out.println("You have not entered a valid input.");
                    }
                } else if (age > 30) {
                    if (gend.equalsIgnoreCase("m")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 2200;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2600;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 3000;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else if (gend.equalsIgnoreCase("f")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 1800;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2000;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2200;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else {
                        System.out.println("You have not entered a valid input.");
                    }
                } else if (age > 18) {
                    if (gend.equalsIgnoreCase("m")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 2400;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2800;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 3000;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else if (gend.equalsIgnoreCase("f")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 2000;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2200;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2400;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else {
                        System.out.println("You have not entered a valid input.");
                    }
                } else if (age > 13) {
                    if (gend.equalsIgnoreCase("m")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 2200;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2800;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 3200;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else if (gend.equalsIgnoreCase("f")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 1800;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2000;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2400;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else {
                        System.out.println("You have not entered a valid input.");
                    }
                } else if (age > 8) {
                    if (gend.equalsIgnoreCase("m")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 1800;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2200;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2600;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else if (gend.equalsIgnoreCase("f")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 1600;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 2000;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2200;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else {
                        System.out.println("You have not entered a valid input.");
                    }
                } else if (age > 3) {
                    if (gend.equalsIgnoreCase("m")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 1400;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 1600;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 2000;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else if (gend.equalsIgnoreCase("f")) {
                        if (actlvl.equalsIgnoreCase("s")) {
                            rectak = 1200;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("m")) {
                            rectak = 1600;
                            valid = true;
                        } else if (actlvl.equalsIgnoreCase("a")) {
                            rectak = 1800;
                            valid = true;
                        } else {
                            System.out.println("You have not entered a valid input.");
                        }
                    } else {
                        System.out.println("You have not entered a valid input.");
                    }
                } else if (age <= 3) {
                    if (actlvl.equalsIgnoreCase("s")) {
                        rectak = 1000;
                        valid = true;
                    } else if (actlvl.equalsIgnoreCase("m")) {
                        rectak = 1400;
                        valid = true;
                    } else if (actlvl.equalsIgnoreCase("a")) {
                        rectak = 1400;
                        valid = true;
                    } else {
                        System.out.println("You have not entered a valid input.");
                    }
                }
            }
            else {
                System.out.println("You have not entered a valid input.");
            }
        } while (!valid);

        System.out.println("\nYour recommended total daily caloric intake is: " + rectak);

        char action;
        char choice;
        double total_cals = 0;
        ArrayList<String> foods_list = new ArrayList<String>();

        //Will display menu from which user can choose an action
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("A. Enter a food");
            System.out.println("B. Display remaining daily calories");
            System.out.println("C. Display the foods you have eaten today");
            System.out.println("D. Exit");
            System.out.println();
            System.out.println("Enter an option: ");
            choice = inp.next().charAt(0);
            action = Character.toUpperCase(choice);
            System.out.println();

            switch (action) {
                //Choice "A" allows the user to enter a food and the number of calories that food contains
                case 'A':
                    System.out.println("Enter a food name: ");
                    if (inp.hasNext()) {
                        String food = inp.next();
                        System.out.println(food);
                       
                        HttpRequest request_name = HttpRequest.newBuilder()
                                .uri(URI.create("https://trackapi.nutritionix.com/v2/search/instant?query=" + food))
                                .header("x-app-id", "API ID GOES HERE")
                                .header("x-app-key", "API KEY GOES HERE")
                                .header("Content-Type", "application/json")
                                .method("GET", HttpRequest.BodyPublishers.noBody())
                                .build();
                        HttpResponse<String> response_name = HttpClient.newHttpClient().send(request_name, HttpResponse.BodyHandlers.ofString());
                        
                        String food_name = String.valueOf(mapper
                                .readValue(response_name.body(), JsonNode.class)
                                .get("common")
                                .get(0)
                                .get("food_name"));
                      
                        foods_list.add(food_name);

                        HttpRequest request_calories = HttpRequest.newBuilder()
                                .uri(URI.create("https://trackapi.nutritionix.com/v2/natural/nutrients"))
                                .header("x-app-id", "API ID GOES HERE")
                                .header("x-app-key", "API KEY GOES HERE")
                                .header("Content-Type", "application/json")
                                .POST(HttpRequest.BodyPublishers.ofString("{\"query\": " + food_name + "}"))
                                .build();
                        HttpResponse<String> response_calories = HttpClient.newHttpClient().send(request_calories, HttpResponse.BodyHandlers.ofString());                       

                        String found_calories = String.valueOf(mapper
                                .readValue(response_calories.body(), JsonNode.class)
                                .get("foods")
                                .get(0)
                                .get("nf_calories"));                    

                        double calories = Double.parseDouble(found_calories);                     
                        total_cals += calories;
                    }
                    break;
                //Choice "B" will calculate and display the remaining number of calories to reach the recommended intake
                case 'B':
                    double remcal = rectak - total_cals;
                    long round_remcal = Math.round(remcal);
                    System.out.println("You have " + round_remcal + " calories remaining today.");
                    break;
                //Choice "C" will display the foods the user has documented today
                case 'C':
                    System.out.print("Today, you have eaten ");
                    String foods = foods_list.stream().collect(Collectors.joining(", "));
                    System.out.println(foods + ".");
                    break;
                //Choice "D" will exit the calorie tracker
                case 'D':
                    break;
                //The default case notifies the user that they have entered an invalid input
                default:
                    System.out.println("You have entered an invalid option. Please enter A, B, C, or D.");
                    break;
            }

            if (total_cals >= rectak) {
                System.out.println("\nCongrats! You have reached your daily calorie goal!");
            }

        } while(action != 'D');
        System.out.println("\nThank you for using the calorie tracker!");

    }
}
