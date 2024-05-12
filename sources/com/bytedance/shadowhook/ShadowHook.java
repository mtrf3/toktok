package com.bytedance.shadowhook;

import X.C16880lQ;
import X.C79527VJb;
import X.C79528VJc;
import X.C79530VJe;
import X.EnumC79531VJf;
import X.InterfaceC79529VJd;
import X.VJZ;

/* loaded from: classes15.dex */
public final class ShadowHook {
    public static final InterfaceC79529VJd defaultLibLoader = null;
    public static final int defaultMode = VJZ.SHARED.value;
    public static long initCostMs = -1;
    public static int initErrno = 2;
    public static boolean inited;

    public static int init() {
        return init(null);
    }

    public static boolean loadLibrary() {
        return loadLibrary(null);
    }

    public static native String nativeGetArch();

    public static native boolean nativeGetDebuggable();

    public static native int nativeGetInitErrno();

    public static native int nativeGetMode();

    public static native boolean nativeGetRecordable();

    public static native String nativeGetRecords(int i);

    public static native String nativeGetVersion();

    public static native int nativeInit(int i, boolean z);

    public static native void nativeSetDebuggable(boolean z);

    public static native void nativeSetRecordable(boolean z);

    public static native String nativeToErrmsg(int i);

    public static boolean isInitedOk() {
        if (inited) {
            if (initErrno == 0) {
                return true;
            }
            return false;
        }
        if (!loadLibrary()) {
            return false;
        }
        try {
            int nativeGetInitErrno = nativeGetInitErrno();
            if (nativeGetInitErrno != 2) {
                initErrno = nativeGetInitErrno;
                inited = true;
                if (nativeGetInitErrno == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getArch() {
        if (isInitedOk()) {
            return nativeGetArch();
        }
        return "unknown";
    }

    public static boolean getDebuggable() {
        if (isInitedOk()) {
            return nativeGetDebuggable();
        }
        return false;
    }

    public static VJZ getMode() {
        if (isInitedOk()) {
            VJZ vjz = VJZ.SHARED;
            if (vjz.value == nativeGetMode()) {
                return vjz;
            }
            return VJZ.UNIQUE;
        }
        return VJZ.SHARED;
    }

    public static boolean getRecordable() {
        if (isInitedOk()) {
            return nativeGetRecordable();
        }
        return false;
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public static long getInitCostMs() {
        return initCostMs;
    }

    public static int getInitErrno() {
        return initErrno;
    }

    public static String getRecords(EnumC79531VJf... enumC79531VJfArr) {
        if (isInitedOk()) {
            int i = 0;
            for (EnumC79531VJf enumC79531VJf : enumC79531VJfArr) {
                switch (C79530VJe.LIZ[enumC79531VJf.ordinal()]) {
                    case 1:
                        i |= 1;
                        break;
                    case 2:
                        i |= 2;
                        break;
                    case 3:
                        i |= 4;
                        break;
                    case 4:
                        i |= 8;
                        break;
                    case 5:
                        i |= 16;
                        break;
                    case 6:
                        i |= 32;
                        break;
                    case 7:
                        i |= 64;
                        break;
                    case 8:
                        i |= 128;
                        break;
                    case 9:
                        i |= 256;
                        break;
                    case 10:
                        i |= 512;
                        break;
                }
            }
            if (i == 0) {
                i = 1023;
            }
            return nativeGetRecords(i);
        }
        return null;
    }

    public static synchronized int init(C79528VJc c79528VJc) {
        synchronized (ShadowHook.class) {
            if (inited) {
                return initErrno;
            }
            inited = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (c79528VJc == null) {
                c79528VJc = new C79527VJb().LIZ();
            }
            if (!loadLibrary(c79528VJc)) {
                initErrno = 100;
                initCostMs = System.currentTimeMillis() - currentTimeMillis;
                return initErrno;
            }
            try {
                initErrno = nativeInit(c79528VJc.LIZ, c79528VJc.LIZIZ);
            } catch (Throwable unused) {
                initErrno = 101;
            }
            initCostMs = System.currentTimeMillis() - currentTimeMillis;
            return initErrno;
        }
    }

    public static boolean loadLibrary(C79528VJc c79528VJc) {
        try {
            C16880lQ.LLJJJIL("shadowhook");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setDebuggable(boolean z) {
        if (isInitedOk()) {
            nativeSetDebuggable(z);
        }
    }

    public static void setRecordable(boolean z) {
        if (isInitedOk()) {
            nativeSetRecordable(z);
        }
    }

    public static String toErrmsg(int i) {
        if (i == 0) {
            return "OK";
        }
        if (i == 1) {
            return "Pending task";
        }
        if (i == 2) {
            return "Not initialized";
        }
        if (i == 100) {
            return "Load libshadowhook.so failed";
        }
        if (i == 101) {
            return "Init exception";
        }
        if (isInitedOk()) {
            return nativeToErrmsg(i);
        }
        return "Unknown";
    }
}
