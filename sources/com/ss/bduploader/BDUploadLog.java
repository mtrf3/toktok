package com.ss.bduploader;

/* loaded from: classes7.dex */
public class BDUploadLog {
    public static int LogTurnOn = 112;

    public static final void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static final void i(String str, String str2) {
    }

    public static final void k(String str, String str2) {
    }

    public static final void t(String str, String str2) {
    }

    public static final void w(String str, String str2) {
    }

    public static final void turnOn(int i, int i2) {
        LogTurnOn = (i2 << i) | ((~(1 << i)) & LogTurnOn);
    }
}