package com.example.android.miwok;

/**
 * Created by MeRKeZ on 14.11.2016.
 */
public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageID = NO_IMAGE_PROVIDED;
    private int audıoID = NO_AUDIO_PROVIDED;



    public Word(String defaultTranslation, String miwokTranslation, int imageID, int audıoID){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageID = imageID;
        this.audıoID = audıoID;
    }

    public Word(String defaultTranslation, String miwokTranslation,int audıoID){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audıoID = audıoID;
    }

    public String getDefaultTranslation() {

        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageID(){
        return imageID;
    }

    public int getAudıoID(){ return audıoID; }

    public boolean hasImage(){
        return this.imageID!=NO_IMAGE_PROVIDED;
    }
}
