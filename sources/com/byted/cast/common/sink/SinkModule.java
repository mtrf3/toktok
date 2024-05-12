package com.byted.cast.common.sink;

/* loaded from: classes29.dex */
public class SinkModule {
    public static String getProtocolNameByID(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? i != 7 ? "" : "ChromeCast" : "BDCloud" : "LeLink" : "ByteLink" : "BDLink" : "BDDLNA" : "BDAirPlay";
    }
}
