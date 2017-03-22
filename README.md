# AwesomeToggle
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Awesome%20Toggle-blue.svg?style=flat)](https://android-arsenal.com/details/3/4699) [![GitHub issues](https://img.shields.io/github/issues/jineshfrancs/AwesomeToggle.svg)](https://github.com/jineshfrancs/AwesomeToggle/issues) [![GitHub forks](https://img.shields.io/github/forks/jineshfrancs/AwesomeToggle.svg)](https://github.com/jineshfrancs/AwesomeToggle/network) [![GitHub stars](https://img.shields.io/github/stars/jineshfrancs/AwesomeToggle.svg)](https://github.com/jineshfrancs/AwesomeToggle/stargazers)

A customized toggle button

ScreenShot:

![Output sample](https://github.com/jineshfrancs/AwesomeToggle/blob/master/screens/screen_new.gif)

In your xml file add this tag to get AwesomeToggle
 ```xml
 <test.jinesh.awesometoggleproject.AwesomeToggle
        android:layout_width="100dp"
        android:layout_height="wrap_content"
        android:id="@+id/sample"
        app:inactive_background_color="@color/colorPrimary"
        app:active_background_color="@color/colorAccent"
        app:font_color="@color/white"
        app:inner_toggle_color="@color/white"
        />
```      
You can apply checked change listner in java code to monitor the toggle state changes
```java  
  awesomeToggle= (AwesomeToggle) findViewById(R.id.sample);
  awesomeToggle.setOnCheckedChangeListner(new AwesomeToggle.OnCheckedChangeListner() {
            @Override
            public void onChecked(boolean isChecked) {
                
            }
  });
```        
     
        
