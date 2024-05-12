package com.ss.ttlivestreamer.livestreamv2.filter;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class FindContourInfo {
    public List<ContourItem> contourItemsList = new ArrayList();
    public int mAdaptedVideoHeight;
    public int mAdaptedVideoWidth;
    public int mContourItemSize;
    public int mExtraSize;
    public int mHeight;
    public String mId;
    public String mInteractId;
    public int mScene;
    public int mVersion;
    public int mWidth;

    /* loaded from: classes12.dex */
    public static class ContourItem {
        public int counts;
        public List<ContourPoint> pointsList = new ArrayList();
    }

    /* loaded from: classes12.dex */
    public static class ContourPoint {
        public int x;
        public int y;
    }
}
