package com.ss.mediakit.medialoader;

/* loaded from: classes9.dex */
public class AVMDLTaskEventID {
    public static boolean eventTypeIsValid(int i) {
        return i > -1 && i < 2;
    }

    public static boolean taskTypeIsValid(int i) {
        return i > 0 && i < 4;
    }
}
