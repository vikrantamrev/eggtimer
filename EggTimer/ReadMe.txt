Author - Vikrant Verma
Project description - Eggtimer is a simple countdown timer.

Automation testing of the feature -
Step 1: Please visit the site URL and make sure the page load is complete; then enter 25 seconds and click on the Go button to start the counter.

Step 2: Wait for the counter to start counting down from the period specified in the home page and verify that the countdown is happening every second and that the remaining time decreases in one-second increments.

Apart from this there are different scenarios as mentioned below:
Test scenarios eggtimer web application:
1. Provide valid time in time field and verify countdown feature.
2. Provide negative time in time field and verify and verify countdown feature.
3. Provide alphanumeric value in time field and verify and verify countdown feature.
4. Leave time field blank and verify and verify countdown feature.
5. Verify countdown feature after providing valid time.
6. Verify pop alert after the countdown is completed.


Issues found while testing:
1. If user enters negative value in time field, valid tooltip should be shown to the user.
2. User can directly open the countdown page by altering URL.
ex: https://e.ggtimer.com/25

  