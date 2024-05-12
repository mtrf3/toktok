package com.tencent.wcdb.database;

import X.C16880lQ;
import android.os.Environment;
import android.os.StatFs;

/* loaded from: classes16.dex */
public final class SQLiteGlobal {
    public static final int LIZ;

    public static void loadLib() {
    }

    public static native int nativeReleaseMemory();

    public static native void nativeSetDefaultPageSize(int i);

    static {
        int i;
        if (!WCDBInitializationProbe.libLoaded) {
            C16880lQ.LLJJJIL("wcdb");
        }
        try {
            i = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            i = 4096;
        }
        LIZ = i;
        nativeSetDefaultPageSize(i);
    }
}
