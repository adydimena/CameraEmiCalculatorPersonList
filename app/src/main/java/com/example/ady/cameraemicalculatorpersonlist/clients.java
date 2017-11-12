package com.example.ady.cameraemicalculatorpersonlist;

/**
 * Created by Ady on 11/11/2017.
 */

public class clients {
    String firstname;
    String lastname;

    clients(String first, String last){
        firstname = first;
        lastname = last;
    }

    public String printclient(){
        return ("First Name: "+firstname + "\n" + "Last Name: " + lastname + "\n" );

    }
}
