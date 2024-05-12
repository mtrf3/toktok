package com.ttnet.org.chromium.net;

import X.C37386Elq;
import X.FSM;
import X.FSP;
import X.FSQ;
import X.P4W;
import X.VI7;
import android.os.Build;

/* loaded from: classes7.dex */
public class AndroidDeviceBasicInfo {
    public static String getCpuCores() {
        String valueOf;
        synchronized (FSQ.LJIIJ) {
            valueOf = String.valueOf(FSQ.LJIIIZ);
        }
        return valueOf;
    }

    public static String getCpuModel() {
        String str;
        synchronized (FSQ.LJIIIIZZ) {
            str = FSQ.LJII;
        }
        return str;
    }

    public static String getGpuModel() {
        String str;
        synchronized (P4W.LIZJ) {
            str = P4W.LIZIZ;
        }
        return str;
    }

    public static String getTotalMemoryGB() {
        String str;
        synchronized (C37386Elq.LIZLLL) {
            str = C37386Elq.LIZJ;
        }
        return str;
    }

    public static void initDeviceScorer() {
        FSP fsp = new FSP();
        VI7 vi7 = FSM.LJ;
        if (fsp.LIZIZ != 0) {
            int i = fsp.LIZIZ;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
        }
        fsp.LIZIZ = 1;
        vi7.execute(fsp.LIZ);
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }
}
