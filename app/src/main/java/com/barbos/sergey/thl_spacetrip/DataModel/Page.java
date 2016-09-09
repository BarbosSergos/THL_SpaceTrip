package com.barbos.sergey.thl_spacetrip.DataModel;

/**
 * Created by Sergey on 08.09.2016.
 */
public class Page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;

    public boolean isLastPage() {
        return mLastPage;
    }

    private boolean mLastPage = false;

    public Page(int mImageId, String mText, Choice mChoice1, Choice mChoice2) {
        this.mImageId = mImageId;
        this.mText = mText;
        this.mChoice1 = mChoice1;
        this.mChoice2 = mChoice2;
    }

    public Page(int mImageId, String mText) {
        this.mImageId = mImageId;
        this.mText = mText;
        mChoice1 = null;
        mChoice2 = null;
        mLastPage = true;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public Choice getmChoice1() {
        return mChoice1;
    }

    public void setmChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Choice getmChoice2() {
        return mChoice2;
    }

    public void setmChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }


}
