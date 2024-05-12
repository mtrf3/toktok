package com.bytedance.vcloud.strategy;

import X.C16880lQ;
import android.content.Context;
import java.io.File;

/* loaded from: classes7.dex */
public class StrategyCenterJniLoader {
    public static volatile boolean isLibraryLoaded;

    public static boolean copyFile(File file, File file2, boolean z) {
        return false;
    }

    public static String getDebugLibPath(Context context) {
        return "";
    }

    public static boolean isDebugLibEnabled(Context context) {
        return false;
    }

    public static boolean loadDebugLib(Context context) {
        return false;
    }

    public static boolean moveFile(File file, File file2, boolean z) {
        return false;
    }

    public static synchronized void loadCustomLibrary() {
        synchronized (StrategyCenterJniLoader.class) {
            try {
                C16880lQ.LLJJJIL("AndroidPitayaProxy");
            } catch (Throwable unused) {
            }
        }
    }

    public static File getDebugDir(Context context) {
        return new File("");
    }

    public static synchronized void loadLibrary(Context context) {
        synchronized (StrategyCenterJniLoader.class) {
            if (isLibraryLoaded) {
                return;
            }
            try {
                C16880lQ.LLJJJIL("preload");
                isLibraryLoaded = true;
            } catch (Throwable unused) {
            }
        }
    }
}
