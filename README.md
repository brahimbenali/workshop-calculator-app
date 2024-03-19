# Workshop Calculator App

## Calculator App Development Using XML and Kotlin

Project Description:

This project involves creating a calculator app for Android devices using XML for layout design and Kotlin for functionality. The goal is to develop an app that is adaptive to different screen sizes, ensuring a consistent user experience across various devices. The design and functionality of the app should closely mirror those of pre-installed calculator apps found on smartphones, emphasizing a user-friendly interface and efficient operation.

### Key Features:

- Adaptive layout for various screen sizes and orientations.
- Basic arithmetic operations: addition, subtraction, multiplication, and division.
- Clear and intuitive user interface similar to native calculator apps.
- Error handling for invalid operations.

## Installation Guide

### Install Android Studio

```bash
sudo snap install android-studio --classic
```

## Step 1: Setting Up Android Studio

1. Download and install the latest version of Android Studio from the Android Developer website.
2. Start a new project with the "Empty Activity" template, selecting Kotlin as the programming language.


### Step 1.1: in case that layout folder doesn't exist :

1. /res/ => mkdir layout
2. /res/layout => touch activity_main.xml



## Step 2: Designing the Layout in XML


For an adaptive layout, we'll use ConstraintLayout and LinearLayout for their  flexibility and ease of making adaptive UIs. Below is a simplified XML layout to start with. You can enhance it further by looking at the design of the pre-installed calculator app on your device.

```xml
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:app="http://schemas.android.com/apk/res-auto"
	xmlns:tools="http://schemas.android.com/tools"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	tools:context=".MainActivity">
	<TextView
    	android:id="@+id/textViewResult"
    	android:layout_width="0dp"
    	android:layout_height="wrap_content"
    	android:layout_marginTop="32dp"
    	android:textSize="32sp"
    	app:layout_constraintEnd_toEndOf="parent"
    	app:layout_constraintStart_toStartOf="parent"
    	app:layout_constraintTop_toTopOf="parent"
    	android:text="0"
    	android:gravity="end"/>

<!-- Add Buttons for digits and operations here, using a similar approach -->

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Creating a Grid of Buttons:

For buttons (0-9, +, -, *, /, =, etc.), use Button views inside the ConstraintLayout. Arrange them in a grid-like manner by constraining buttons to the sides of other buttons or the parent view.
Use android:layout_width and android:layout_height with fixed sizes or wrap_content for buttons, and adjust their app:layout_constraint* attributes to position them.


=> check the xml file 

More about Android development using xml, check this link:

	https://developer.android.com/codelabs/basic-android-kotlin-training-xml-layouts?hl=fr#0



## STEP 3: THE KOTLIN PART

look at the kotlin file

In the kotline file we should just modify in :
```kotlin
class MainActivity : AppCompatActivity()
```


## STEP 4:VARIABLES

You should declare all the variables first in the class MainActivity.
Just like these example : 

there is 3 types of variable that we will use : 

-variable for the buttons


-variable for a normal variable :



-variable for the textview:




## STEP 5 : AFTER THE VARIABLES

Just after the declaration of variables, add this function , and we're gonna modify all the things in this function .
```
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
 ```


## STEP 6: LINK THE XML WITH KOTLIN 



This is an example how to link a button with the xml , and you should all the rest alone :
```
nbr_one_button = findViewById(R.id.one)
```
## and look at the kotlin file , there is more example .



To link the button with a function , you should use the function :
```
findViewById(R.id.”name of the id “) 
```


##STEP7 : USEFUL FUNCTION FOR THE RESULT :


THE FUNCTION here , YOU ARE GOING TO USE IT IN BUTTONS WITH NUMBERS
```
fun writeText(text: CharSequence?) {
      val sb = StringBuilder()
      sb.append(result.text).append(text)
      result.text = sb/toString()
}
```


## Step 8: Implementing Functionality in Kotlin

- Set up click listeners for the calculator's buttons.
- Implement the logic for performing arithmetic operations.
- Update the display to show results or errors as appropriate.



## Step 9: Testing Across Different Devices

- Test the app using the Android Emulator for various devices.
- If possible, test on physical devices to ensure compatibility.






## Additional Tips

- Study existing calculator apps for insights into design and functionality.
- Prioritize UI/UX design to make the app intuitive and easy to use.




## FINAL STEP : 

Now it is on you to make all these ideas in the correct form .
And if you need anything visit the following website : 
```
https://developer.android.com/get-started/overview
```








