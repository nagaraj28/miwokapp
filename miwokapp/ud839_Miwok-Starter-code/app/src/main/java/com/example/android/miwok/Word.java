package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudio;

    public Word(String defaultTranslation,String miwokTranslation,int audio){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudio=audio;
    }
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audio){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;

    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId(){
        return mAudio;
    }
}
