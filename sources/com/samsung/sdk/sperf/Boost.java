package com.samsung.sdk.sperf;

import X.C16880lQ;

/* loaded from: classes12.dex */
public class Boost {
    public static boolean isLoadLib;

    public static boolean init() {
        if (isLoadLib) {
            return true;
        }
        try {
            C16880lQ.LLJJJIL("perfsdk.performance.samsung");
            isLoadLib = true;
        } catch (Exception e) {
            SPerfUtil.log("Library has problem");
            C16880lQ.LLLLIIL(e);
            isLoadLib = false;
            return isLoadLib;
        } catch (UnsatisfiedLinkError e2) {
            SPerfUtil.log("ERROR : Library load fail.. not exist or check permission");
            e2.printStackTrace();
            isLoadLib = false;
            return isLoadLib;
        }
        return isLoadLib;
    }

    public static native int releaseBoost();

    public static native int releaseBoost(int i);

    public static int releaseNativeBoost() {
        int defaultLevel;
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            return -1;
        }
        releaseBoost();
        SPerfUtil.log("release all boost");
        int i = 0;
        do {
            BoostResource boostResource = BoostLevelControl.getBoostResource(i);
            if (boostResource != null && (defaultLevel = boostResource.getDefaultLevel()) != 64532198) {
                int realBoostLevel = BoostLevelControl.getRealBoostLevel(defaultLevel, i);
                if (CustomParams.getBoostType(i) == 1) {
                    requestBoost(i, realBoostLevel, PerformanceManager.getPid());
                } else {
                    requestBoost(i, realBoostLevel, 0);
                }
            }
            i++;
        } while (i < 11);
        return 0;
    }

    public static int releaseNativeBoost(int i, int i2) {
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            return -1;
        }
        BoostResource boostResource = BoostLevelControl.getBoostResource(i);
        if (boostResource == null) {
            return -1;
        }
        int defaultLevel = boostResource.getDefaultLevel();
        if (defaultLevel == 64532198) {
            releaseBoost(i);
        } else {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(defaultLevel, i);
            if (i2 < 0) {
                requestBoost(i, realBoostLevel, 0);
            } else {
                requestBoost(i, realBoostLevel, i2);
            }
        }
        SPerfUtil.log("release all boost");
        return 0;
    }

    public static native int requestBoost(int i, int i2, int i3);

    public static int requestNativeBoost(BoostObject boostObject) {
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            return -1;
        }
        int i = 0;
        do {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(boostObject, i);
            int timeout = boostObject.getTimeout(i);
            if (realBoostLevel != 64532198 && timeout != 64532198) {
                if (timeout == 99999999) {
                    timeout = -1;
                }
                SPerfUtil.log("acquire boost - type : " + i + "   value : " + realBoostLevel + "   timeouts : " + timeout);
                if (CustomParams.getBoostType(i) == 1) {
                    timeout = PerformanceManager.getPid();
                    SPerfManager.startTaskReleaseHandler(i, timeout);
                }
                requestBoost(i, realBoostLevel, timeout);
            }
            i++;
        } while (i < 11);
        return 0;
    }

    public static int requestNativeBoostForProcess(BoostObject boostObject) {
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            return -1;
        }
        int i = 0;
        do {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(boostObject, i);
            int timeout = boostObject.getTimeout(i);
            if (realBoostLevel != 64532198 && timeout != 64532198) {
                if (timeout == 99999999) {
                    timeout = -1;
                }
                SPerfUtil.log("acquire boost - type : " + i + "   value : " + realBoostLevel + "   timeouts : " + timeout);
                requestBoost(i, realBoostLevel, timeout);
            }
            i++;
        } while (i < 11);
        return 0;
    }

    public static int setNativePkgName(String str) {
        if (str == null) {
            SPerfUtil.log("ERR : PkgName is Null.. check it again");
            return -1;
        }
        setPkgName(str);
        SPerfUtil.log("Unique Pkg Name set : ".concat(str));
        return 0;
    }

    public static native int setPkgName(String str);
}
