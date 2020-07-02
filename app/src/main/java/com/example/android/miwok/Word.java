package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;

    /*
     ** Default translation of the word
     */
    private String mDefaultTranslation;

    /*
    ** Miwok translation of the word
    */
    private String mMiwokTranslation;

    /*
     ** Miwok image resource of the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /*
     ** Miwok translation of the word
     */
    private int mAudioResourceId;


    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word
     * */

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     * */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Get the image resource id for the image
     * */
    public int getImageResourceId(){
        return mImageResourceId;
    }







    public boolean hasImage(){
        /***
         * returns a boolean value that says if there is an image or not
         */
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
