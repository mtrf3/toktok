package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes15.dex */
public class ArtOptimizer {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;

    public static native boolean disableDumpOatFile(int i);

    public static native boolean increaseSuspendTime(int i);

    public static synchronized boolean disableDumpOatFileForANR(Context context) {
        synchronized (ArtOptimizer.class) {
            if (mOptimized) {
                return true;
            }
            int i = Build.VERSION.SDK_INT;
            if (i != 29 || !SysOptimizer.loadOptimizerLibrary(context)) {
                return false;
            }
            try {
                boolean disableDumpOatFile = disableDumpOatFile(i);
                mOptimized = disableDumpOatFile;
                return disableDumpOatFile;
            } catch (UnsatisfiedLinkError unused) {
                return false;
            }
        }
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT > 23) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optSuspendTimeout(Context context) {
        synchronized (ArtOptimizer.class) {
            if (mOptimized) {
                return true;
            }
            if (!loadOptimizerOnNeed(context)) {
                return false;
            }
            try {
                boolean increaseSuspendTime = increaseSuspendTime(Build.VERSION.SDK_INT);
                mOptimized = increaseSuspendTime;
                return increaseSuspendTime;
            } catch (UnsatisfiedLinkError unused) {
                return false;
            }
        }
    }
}
