# AwesomeToggle
A customized toggle button

ScreenShot:
![Output sample](https://github.com/jineshfrancs/AwesomeToggle/blob/master/screens/screen_new.gif)

In your xml file add this tag to get AwesomeToggle
 ```
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
```  
  awesomeToggle= (AwesomeToggle) findViewById(R.id.sample);
  awesomeToggle.setOnCheckedChangeListner(new AwesomeToggle.OnCheckedChangeListner() {
            @Override
            public void onChecked(boolean isChecked) {
                
            }
  });
```        
     
        
