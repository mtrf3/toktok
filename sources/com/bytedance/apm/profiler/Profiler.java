package com.bytedance.apm.profiler;

import X.C16880lQ;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public class Profiler {
    public static volatile boolean LIZ;

    public static native boolean nAttachThread(int i);

    public static native boolean nCheck();

    public static native void nClear();

    public static native boolean nDetachThread(int i);

    public static native String nDump(long j, long j2);

    public static native String nGetStack(int i);

    public static native boolean nInit();

    public static native void nSetAlog(long j);

    public static native boolean nStart(int i);

    public static native boolean nStop();

    public final synchronized void LIZ() {
        if (!LIZ && Build.VERSION.SDK_INT >= 26) {
            try {
                ShadowHook.init();
                C16880lQ.LLJJJIL("profiler");
                LIZ = nInit();
            } catch (Throwable unused) {
                LIZ = false;
            }
        }
    }

    static {
        new AtomicReference(null);
    }
}
