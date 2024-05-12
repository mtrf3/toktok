package com.bytedance.realx.base;

import X.C16880lQ;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import java.io.File;
import java.io.FileFilter;

/* loaded from: classes9.dex */
public class RXPerformanceMonitorAndroid {
    public static Context context;
    public static PowerManager powerManager;
    public static final FileFilter CPU_IDLE_STATE_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.RXPerformanceMonitorAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("state")) {
                return false;
            }
            for (int i = 5; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    };
    public static int mCpuCoreCount = -1;
    public static int mCpuIdleStateCount = -1;

    static {
        Context applicationContext = ContextUtils.getApplicationContext();
        context = applicationContext;
        powerManager = (PowerManager) C16880lQ.LLILL(applicationContext, "power");
    }

    public static int getCpuIdleStateCount() {
        try {
            return new File("/sys/devices/system/cpu/cpu0/cpuidle/").listFiles(CPU_IDLE_STATE_FILTER).length;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean getIfRoomsDevice() {
        if ("a3382".equals(Build.MODEL.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static int getThermalState() {
        PowerManager powerManager2;
        if (Build.VERSION.SDK_INT >= 29 && (powerManager2 = powerManager) != null) {
            int currentThermalStatus = powerManager2.getCurrentThermalStatus();
            switch (currentThermalStatus) {
                case 0:
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                case 4:
                    return 2;
                case 5:
                case 6:
                    return 3;
                default:
                    return currentThermalStatus;
            }
        }
        return 4;
    }

    public static int getCurrentPidMemorySize() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(applicationContext, "activity");
            if (activityManager == null) {
                return 0;
            }
            return C16880lQ.LLJJL(activityManager, new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getThreadCount() {
        return Thread.activeCount();
    }

    public static void setPowerManger(PowerManager powerManager2) {
        powerManager = powerManager2;
    }
}
