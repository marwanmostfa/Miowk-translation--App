package com.example.android.miwok;

public class Word {
    private int mImageResourceID=NO_IMAGE_PROVIDED;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private  static  final int NO_IMAGE_PROVIDED=-1;

    private int mAudioResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID=audioId;
    }
    public Word(String defaultTranslation, String miwokTranslation,int imageID,int audioID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID=imageID;
        mAudioResourceID=audioID;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getResourceID(){
        return mImageResourceID;
    }

    public int getAudioResourceID(){
        return mAudioResourceID ;
    }

    public boolean hasImage(){
        if(mImageResourceID !=NO_IMAGE_PROVIDED){
            return true;
        }
        else{
            return false;
        }
    }

}
