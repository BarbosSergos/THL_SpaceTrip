package com.barbos.sergey.thl_spacetrip.DataModel;

/**
 * Created by Sergey on 08.09.2016.
 */
public class Choice {

    private int mChoiceId;
    private String mChoiceText;

    public Choice(String mChoiceText, int mChoiceId) {
        this.mChoiceId = mChoiceId;
        this.mChoiceText = mChoiceText;
    }

    public int getmChoiceId() {
        return mChoiceId;
    }

    public void setmChoiceId(int mChoiceId) {
        this.mChoiceId = mChoiceId;
    }

    public String getmChoiceText() {
        return mChoiceText;
    }

    public void setmChoiceText(String mChoiceText) {
        this.mChoiceText = mChoiceText;
    }


}
