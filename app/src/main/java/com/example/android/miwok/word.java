package com.example.android.miwok;

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage = -1;
    private int mMedia;

    public word(String defaultTranslation, String miwokTranslation,int image,int media) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImage = image;
        mMedia = media;
    }

    public word(String defaultTranslation, String miwokTranslation,int media) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mMedia = media;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImage(){ return mImage; }

    public int getMedia(){ return mMedia; }

    public boolean hasImage(){ return mImage != -1; }
}
