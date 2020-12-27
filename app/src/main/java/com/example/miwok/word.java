package com.example.miwok;


// Word class is Created to Store List objects in a Array_List of Each Activity

public class word {
    // Default Translation
    private String mDefaultTranslation;

    //for miwok Translation
    private  String mMiwokTranslation;

    // For Image view for Numbers Activity Layout
    private int NO_IMAGE_PROVIDED = -1;

    // for imageResource Id for textView Container Background
    private int imageResourceId = NO_IMAGE_PROVIDED;



    /**
     *  Create a new word object
     * @param DefaultTranslation the Language user known (i.e English)
     *@param miwokTranslation is the word in the English Language
     */

    public word(String DefaultTranslation, String miwokTranslation,int Image_id){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageResourceId = Image_id;
        }


    /**
     *  Create new word object for phrases activity
     *  Create two paramMeterConstructor To present Phrases Activity
     * @param  mDefaultTranslation
     * @param  mMiwokTranslation
     */
    public word(String mDefaultTranslation,String mMiwokTranslation){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    // To Get Miwok word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    // To get English Or Default Translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // To get Image Resource Id
    public int getImagesResourceId(){ return imageResourceId; }

    // To Check View Contains Image OR not
    public boolean hasImage(){ return imageResourceId != NO_IMAGE_PROVIDED; }




}

