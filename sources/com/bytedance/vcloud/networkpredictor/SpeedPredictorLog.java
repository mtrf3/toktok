package com.bytedance.vcloud.networkpredictor;

/* loaded from: classes9.dex */
public class SpeedPredictorLog {
    public static int LogTurnOn = 112;

    public static final void d(String str, String str2) {
    }

    public static void d(Throwable th) {
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
        int i3 = ((~(1 << i)) & LogTurnOn) | (i2 << i);
        LogTurnOn = i3;
        if (i == 1 && i2 == 1) {
            LogTurnOn = (i3 & (-5)) | 4;
        }
    }
}
