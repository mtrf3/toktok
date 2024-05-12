package com.samsung.sdk.sperf;

import android.os.Process;

/* loaded from: classes12.dex */
public class PerformanceManager {
    public static PerformanceManager mPerformanceManager = null;
    public static int myPid = -1;
    public static SPerfManager sPerfManager;

    public static PerformanceManager getInstance() {
        PerformanceManager performanceManager;
        synchronized (PerformanceManager.class) {
            try {
                if (mPerformanceManager == null) {
                    mPerformanceManager = new PerformanceManager();
                }
                SPerfManager createInstance = SPerfManager.createInstance(null);
                sPerfManager = createInstance;
                performanceManager = createInstance != null ? mPerformanceManager : null;
            } finally {
            }
        }
        return performanceManager;
    }

    public static int getPid() {
        if (myPid < 0) {
            myPid = Process.myPid();
        }
        return myPid;
    }

    public int start(int i, int i2) {
        SPerfManager sPerfManager2 = sPerfManager;
        if (sPerfManager2 != null) {
            return sPerfManager2.startPresetBoost(i, i2);
        }
        SPerfUtil.log("SPerf has not initialized");
        return -1;
    }

    public int start(CustomParams customParams) {
        String str;
        if (sPerfManager == null) {
            str = "SPerf has not initialized";
        } else if (customParams == null) {
            str = "CustomParams is null";
        } else {
            BoostObject boostObject = customParams.getBoostObject();
            if (boostObject != null) {
                return sPerfManager.startBoost(boostObject);
            }
            str = "CustomParams is not initialized";
        }
        SPerfUtil.log(str);
        return -1;
    }

    public int stop() {
        SPerfManager sPerfManager2 = sPerfManager;
        if (sPerfManager2 != null) {
            return sPerfManager2.stopBoost();
        }
        SPerfUtil.log("SPerf has not initialized");
        return -1;
    }
}
