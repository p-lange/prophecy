package com.peter;


import java.io.IOException;

public class ProphecyConstruct extends Prophecy {
    private String mProphecy;


    public ProphecyConstruct(int ProphecySeed) throws IOException {
        if (ProphecySeed > 12) {
            System.out.println("Improper input!");
            System.exit(0);
        }
        //Prophecy prof = new Prophecy();
        switch (ProphecySeed) {
            case 0:
                mProphecy = getPreface() +
                        " the " +
                        getAdjective() + " " +
                        getNoun() + " " +
                        getOriginIntro() + " " +
                        getOrigin() + ".";
                break;
            case 1:
                mProphecy = getPreface() +
                        " the " +
                        getAdjective() + " " +
                        getNoun() + ", " +
                        "for when the " +
                        getTimePeriod() + " of the " +
                        getNoun() +
                        " comes, then the " +
                        getNoun() + " " +
                        getSverb() + ".";
                break;
            case 2:
                mProphecy = "When the " +
                        getNoun() + " " +
                        getSverb() +
                        ", then begins the " +
                        getTimePeriod() +
                        " of the " +
                        getIngVerbs() + " " +
                        getNoun() + ".";
                break;
            case 3:
                mProphecy = "If the " +
                        getNoun() + " " +
                        getSverb() +
                        ", soon the " +
                        getNoun() + " " +
                        getOriginIntro() + " " +
                        getOrigin() +
                        " will " +
                        getHardVerb() + ".";
                break;
            case 4:
                mProphecy = "Beware the " +
                        getAdjective() + " " +
                        getNoun() +
                        " in the " +
                        getTimePeriod() +
                        " of the " +
                        getNoun() + ".";
                break;
            case 5:
                mProphecy = "If the " +
                        getNoun() + " " +
                        getSverb() +
                        ", then you must " +
                        getHardVerb() +
                        " before the next " +
                        getTimePeriod() + " of the " +
                        getNoun() + ".";
                break;
            case 6:
                mProphecy = getPreface() +
                        " the " +
                        getIngVerbs() + " " +
                        getNoun() +
                        ", for in the " +
                        getTimePeriod() +
                        " does the " +
                        getNoun() + " " +
                        getHardVerb() + ".";
                break;
            case 7:
                mProphecy = "When the " +
                        getIngVerbs() + " " +
                        getNoun() + " " +
                        getSverb() +
                        ", then the " +
                        getNoun() + " must " +
                        getHardVerb() + ".";
                break;
            case 8:
                mProphecy = getAdjective() +
                        " is the " +
                        getNoun() +
                        " that is not " +
                        getIngVerbs() + ".";
            case 9:
                mProphecy = getAdjective() +
                        " is the " +
                        getNoun() +
                        " that " +
                        getSverb() + ".";
            case 10:
                mProphecy = "If the " +
                        getNoun() + " " +
                        getSverb() +
                        ", then the " +
                        getAdjective() + " " +
                        getNoun() +
                        " must " +
                        getHardVerb() +
                        " before the next " +
                        getTimePeriod() + " of the " +
                        getNoun() +
                        ", or you shall never again " +
                        getHardVerb() + ".";
                break;
            case 11:
                mProphecy = "The " +
                        getIngVerbs() + " " +
                        getNoun() +
                        " will be no more.";
                break;
            case 12:
                mProphecy = getPreface() +
                        " the " +
                        getIngVerbs() + " " +
                        getNoun() + ".";
                break;
        }

    }

    public String getProphecy() {
        return mProphecy;
    }


}
