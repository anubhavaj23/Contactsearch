package com.example.anubh.contactsearch;

import android.net.Uri;

/**
 * Created by anubh on 11-Oct-16.
 */
public class ListItems {
    private String Contactname,contactnum;
    Uri thumbnail;

    public ListItems(String name,String number,Uri imageuri){
        this.Contactname = name;
        this.contactnum = number;
        this.thumbnail = imageuri;
    }

    public String getContactname() {
        return Contactname;
    }

    public void setContactname(String contactname) {
        Contactname = contactname;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

    public Uri getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Uri thumbnail) {
        this.thumbnail = thumbnail;
    }
}
