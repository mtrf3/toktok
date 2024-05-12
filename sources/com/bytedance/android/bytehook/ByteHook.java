package com.bytedance.android.bytehook;

import X.C0IN;
import X.C0IO;
import X.C0IP;
import X.C16880lQ;
import X.InterfaceC17110ln;

/* loaded from: classes.dex */
public class ByteHook {
    public static final InterfaceC17110ln defaultLibLoader = null;
    public static final int defaultMode = C0IP.AUTOMATIC.value;
    public static int initStatus = 1;
    public static boolean inited;

    public static native String nativeGetRecords();

    public static native int nativeInit(int i, boolean z);

    public static native void nativeSetDebug(boolean z);

    public static String getRecords() {
        if (initStatus == 0) {
            return nativeGetRecords();
        }
        return null;
    }

    public static int init() {
        if (inited) {
            return initStatus;
        }
        C0IO c0io = new C0IO();
        C0IN c0in = new C0IN();
        c0in.LIZ = c0io.LIZ;
        c0in.LIZIZ = c0io.LIZIZ;
        return init(c0in);
    }

    public static synchronized int init(C0IN c0in) {
        synchronized (ByteHook.class) {
            if (inited) {
                return initStatus;
            }
            inited = true;
            try {
                c0in.getClass();
                C16880lQ.LLJJJIL("bytehook");
                try {
                    initStatus = nativeInit(c0in.LIZ, c0in.LIZIZ);
                } catch (Throwable unused) {
                    initStatus = 101;
                }
                return initStatus;
            } catch (Throwable unused2) {
                initStatus = 100;
                return 100;
            }
        }
    }

    public static void setDebug(boolean z) {
        if (initStatus == 0) {
            nativeSetDebug(z);
        }
    }
}
