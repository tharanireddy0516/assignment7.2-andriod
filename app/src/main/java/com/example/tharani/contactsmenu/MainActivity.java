package com.example.tharani.contactsmenu;

/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /*onCreate is the first method in the life cycle of an activity
   * savedInstance passes data to super class,data is pull to store state of application
   * setContentView is used to set layout for the activity
   *  R is a resource and it is auto generate file
   * activity_main assign an integer value

   */
    //here I'm defining PICK_CONTACT constant to pass with intent
    private static final int PICK_CONTACT = 1234;

    Button contactButton;//Button is a android widget or view
                        //creating bridge between button and java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactButton = findViewById(R.id.contactButton);//stores integer in button
        //setOnclickListener is a evet
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //executes button here
            public void onClick(View view) {

                /*
                  * In here using intent to go contact list.
                  * Intent is a kind of message or information that is passed to the components.
                  * It is used to launch an activity, display a web page, send sms, send email etc.
                  *
                */
                Intent contect= new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);//creates contact object

                startActivityForResult(contect, PICK_CONTACT);//starts the activity to open contact
            }
        });
    }
}
