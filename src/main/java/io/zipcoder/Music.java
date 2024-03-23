package io.zipcoder;

public class Music {
    private String[] playList;

/// CONSTRUCTOR ///

    public Music(String[] playList){
        this.playList = playList;
    }

/// METHODS ///

    public Integer selection(Integer startIndex, String selection){
        int k = startIndex;
        String q = selection;
        int forwardClicks = 0;
        int backwardClicks = 0;
        int result = 0;

        while (!playList[k].equals(q)) {
            k = (k + 1) % playList.length;
            forwardClicks++;
        }

        k = startIndex;
        while (!playList[k].equals(q)) {
            k = (k - 1 + playList.length) % playList.length;
            backwardClicks++;
        }

        if (forwardClicks > backwardClicks) {
            result = backwardClicks;
        } else if (forwardClicks < backwardClicks) {
            result = forwardClicks;
        } else {
            result = forwardClicks;
        }
        return result;
    }
}
