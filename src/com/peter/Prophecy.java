package com.peter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Prophecy {

    private String[] mPrefaces;
    private String[] mNouns;
    private String[] mOriginIntros;
    private String[] mOrigins;
    private String[] mAdjectives;
    private String[] mSverbs;
    private String[] mTimePeriods;
    private String[] mHardVerbs;
    private String[] mIngVerbs;


    public void createPrefaces() throws IOException{
        try {
            BufferedReader prefacesBr = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\Prefaces.txt"));
            String prefacesStr;
            List<String> prefacesList = new ArrayList<String>();
            while ((prefacesStr = prefacesBr.readLine()) != null) {
                prefacesList.add(prefacesStr);
            }
            mPrefaces = prefacesList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createAdjectives() throws IOException{
        try {
            BufferedReader adjBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\Adjectives.txt"));
            String adjStr;
            List<String> adjList = new ArrayList<String>();
            while ((adjStr = adjBR.readLine()) != null) {
                adjList.add(adjStr);
            }
            mAdjectives = adjList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
    }

    public void createNouns() throws IOException{
        try {
            BufferedReader nounBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\Nouns.txt"));
            String nounStr;
            List<String> nounList = new ArrayList<String>();
            while ((nounStr = nounBR.readLine()) != null) {
                nounList.add(nounStr);
            }
            mNouns = nounList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createOriginIntro() throws IOException{
        try {
            BufferedReader originDescrBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\OriginDescription.txt"));
            String originDescrStr;
            List<String> originDescrList = new ArrayList<String>();
            while ((originDescrStr = originDescrBR.readLine()) != null) {
                originDescrList.add(originDescrStr);
            }
            mOriginIntros = originDescrList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createOrigins() throws IOException{
        try {
            BufferedReader originsBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\Origins.txt"));
            String originsStr;
            List<String> originsList = new ArrayList<String>();
            while ((originsStr = originsBR.readLine()) != null) {
                originsList.add(originsStr);
            }
            mOrigins = originsList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createSverbs() throws IOException {
        try {
            BufferedReader sVerbBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\sVerbs.txt"));
            String sVerbStr;
            List<String> sVerbList = new ArrayList<String>();
            while ((sVerbStr = sVerbBR.readLine()) != null) {
                sVerbList.add(sVerbStr);
            }
            mSverbs = sVerbList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createTimePeriods() throws IOException{
        try{
            BufferedReader timePeriodBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\TimePeriods.txt"));
            String timePeriodStr;
            List<String> timePeriodList = new ArrayList<String>();
            while ((timePeriodStr = timePeriodBR.readLine()) != null) {
                timePeriodList.add(timePeriodStr);
            }
            mTimePeriods = timePeriodList.toArray(new String[0]);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public void createHardVerbs() throws IOException {
        try {
            BufferedReader hardVerbBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\hardVerbs.txt"));
            String hardVerbStr;
            List<String> hardVerbList = new ArrayList<String>();
            while ((hardVerbStr = hardVerbBR.readLine()) != null) {
                hardVerbList.add(hardVerbStr);
            }
            mHardVerbs = hardVerbList.toArray(new String[0]);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void createIngVerbs() throws IOException {
        try {
            BufferedReader ingVerbBR = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\Prophecy\\src\\ingVerbs.txt"));
            String ingVerbStr;
            List<String> ingVerbList = new ArrayList<String>();
            while ((ingVerbStr = ingVerbBR.readLine()) != null) {
                ingVerbList.add(ingVerbStr);
            }
            mIngVerbs = ingVerbList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String getPreface() throws IOException{
        createPrefaces();
        Random rand = new Random();
        int match = rand.nextInt(mPrefaces.length);
        return mPrefaces[match];
    }


    public String getAdjective() throws IOException{
        createAdjectives();
        Random rand = new Random();
        int match = rand.nextInt(mAdjectives.length);
        return mAdjectives[match];
    }

    public String getNoun() throws IOException{
        createNouns();
        Random rand = new Random();
        int match = rand.nextInt(mNouns.length);
        return mNouns[match];
    }

    public String getOriginIntro() throws IOException{
        createOriginIntro();
        Random rand = new Random();
        int match = rand.nextInt(mOriginIntros.length);
        return mOriginIntros[match];
    }

    public String getOrigin() throws IOException {
        createOrigins();
        Random rand = new Random();
        int match = rand.nextInt(mOrigins.length);
        return mOrigins[match];
    }

    public String getSverb() throws IOException{
        createSverbs();
        Random rand = new Random();
        int match = rand.nextInt(mSverbs.length);
        return mSverbs[match];
    }

    public String getTimePeriod() throws IOException{
        createTimePeriods();
        Random rand = new Random();
        int match = rand.nextInt(mTimePeriods.length);
        return mTimePeriods[match];
    }

    public String getHardVerb() throws IOException{
        createHardVerbs();
        Random rand = new Random();
        int match = rand.nextInt(mHardVerbs.length);
        return mHardVerbs[match];
    }

    public String getIngVerbs() throws IOException{
        createIngVerbs();
        Random rand = new Random();
        int match = rand.nextInt(mIngVerbs.length);
        return mIngVerbs[match];
    }

}
