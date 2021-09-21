# Write a caculation app use Kotlin
### Step 1:
* Create a new Android application:Kotlin Calculator with an Empty activity

![](https://images.viblo.asia/6e4dc8a5-95eb-4359-8943-7239e8a24a75.png)

### Step 2:
* Add the MathParser dependency to the project by adding implementation 'org.mariuszgromada.math:MathParser.org-mXparser:4.4.2' to the dependencies in build.gradle. This library is used in caculation.

![](https://images.viblo.asia/db2f4bd1-f7d8-4e19-ae38-cb392dc5e00a.png)

### Step 3:
* Update in file app/res/value/string.xml

```html
<resources>
    <string name="app_name">Calculation</string>

    <string name="rezo">0</string>
    <string name="one">1</string>
    <string name="two">2</string>
    <string name="three">3</string>
    <string name="four">4</string>
    <string name="five">5</string>
    <string name="six">6</string>
    <string name="seven">7</string>
    <string name="eight">8</string>
    <string name="nine">9</string>

    <string name="clear">C</string>
    <string name="exponent">^</string>
    <string name="bracket_left">(</string>
    <string name="divide">÷</string>
    <string name="multifly">×</string>
    <string name="add">+</string>
    <string name="subtruct">-</string>
    <string name="brack_right">)</string>
    <string name="point">.</string>
    <string name="equals">=</string>

    <string name="backspace"> </string>

    <string name="display">Enter in a value</string>

</resources>
```

### Step 4
* modify the activity_main.xml. You can see detail in source code. Interface as given below

![](https://images.viblo.asia/9f3c3898-5fed-48e5-a802-5c3ff486a030.png)
### Step 5
* Update logic in MainActivity.kt. See detail in source code

![](https://images.viblo.asia/0b3afdb2-26ea-4e45-96d6-9c3ad3e74dca.png)

