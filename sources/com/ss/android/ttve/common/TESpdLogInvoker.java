package com.ss.android.ttve.common;

import X.FWO;

/* loaded from: classes12.dex */
public class TESpdLogInvoker {
    public native void close();

    public native int error(String str);

    public native String getLogFiles(String str);

    public native int info(int i, String str);

    public native int initSpdLog(String str, int i, int i2);

    public native void setLevel(int i);

    public native int warn(String str);

    static {
        FWO.LIZJ();
    }
}
