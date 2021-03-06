package com.example.shahreznawfal.criminalintent;

import java.util.UUID;

/**
 * Created by Shahrez Nawfal on 7/6/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
