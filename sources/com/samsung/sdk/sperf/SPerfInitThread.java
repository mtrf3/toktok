package com.samsung.sdk.sperf;

import X.C16880lQ;

/* loaded from: classes12.dex */
public class SPerfInitThread implements Runnable {
    public SPerfManager sPerfManager;

    public void com_samsung_sdk_sperf_SPerfInitThread__run$___twin___() {
        try {
            this.sPerfManager = SPerfManager.initSPerfManager();
        } catch (IllegalThreadStateException e) {
            this.sPerfManager = null;
            C16880lQ.LLLLIIL(e);
        }
    }

    public SPerfManager getSPerfManager() {
        return this.sPerfManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        com_samsung_sdk_sperf_SPerfInitThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public static void com_samsung_sdk_sperf_SPerfInitThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SPerfInitThread sPerfInitThread) {
        boolean LIZ;
        try {
            sPerfInitThread.com_samsung_sdk_sperf_SPerfInitThread__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }
}
