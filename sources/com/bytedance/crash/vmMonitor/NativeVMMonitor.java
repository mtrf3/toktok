package com.bytedance.crash.vmMonitor;

import X.C16880lQ;
import X.PK0;
import com.bytedance.librarian.Librarian;

/* loaded from: classes12.dex */
public class NativeVMMonitor {
    public static boolean LIZ;
    public static NativeVMMonitor LIZIZ;

    public static native int nativeActivityModified(int i, int i2, int i3);

    public static native int nativeCreateNewActivityGroup(int i, String str);

    public static native int nativeDoCommandWithOption(int i, int i2);

    public static native int nativeDumpActivityInfo();

    public static native int nativeDumpInfoCrash(int i);

    public static native long nativeGetDumpVmAddr();

    public static native int nativeInitMmapHook(String str, String str2, String str3, int i, boolean z);

    public static native int nativeMmapHook();

    public static native int nativeSetMmapParamsInit(String[] strArr);

    public static native int nativeSetMprotectProts(int i);

    public NativeVMMonitor() {
        if (!LIZ) {
            try {
                try {
                    C16880lQ.LLJJJIL("npth_vm_monitor");
                    LIZ = true;
                } catch (Throwable unused) {
                    Librarian.LJFF(PK0.LIZ, "npth_vm_monitor");
                    LIZ = true;
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static NativeVMMonitor LJI() {
        if (LIZIZ == null) {
            synchronized (NativeVMMonitor.class) {
                if (LIZIZ == null) {
                    LIZIZ = new NativeVMMonitor();
                }
            }
        }
        return LIZIZ;
    }

    public static long LJII() {
        long j = 0;
        if (!LIZ) {
            return 0L;
        }
        try {
            j = nativeGetDumpVmAddr();
            return j;
        } catch (Throwable unused) {
            return j;
        }
    }

    public static int LIZ(String[] strArr) {
        if (!LIZ) {
            return -2;
        }
        return nativeSetMmapParamsInit(strArr);
    }

    public static int LJ(int i) {
        if (!LIZ) {
            return -1;
        }
        try {
            return nativeDoCommandWithOption(i, 0);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static int LJFF(int i) {
        int i2 = -1;
        if (!LIZ) {
            return -1;
        }
        try {
            i2 = nativeDumpInfoCrash(i);
            return i2;
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static int LJIIIZ(int i) {
        if (!LIZ) {
            return -2;
        }
        return nativeSetMprotectProts(i);
    }

    public static int LIZJ(int i, String str) {
        if (!LIZ) {
            return -1;
        }
        try {
            return nativeCreateNewActivityGroup(i, str);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static int LIZLLL(int i, int i2) {
        if (!LIZ) {
            return -1;
        }
        try {
            return nativeDoCommandWithOption(i, i2);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static int LIZIZ(int i, int i2, int i3) {
        if (!LIZ) {
            return -1;
        }
        try {
            return nativeActivityModified(i, i2, i3);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static int LJIIIIZZ(int i, String str, boolean z, String str2, String str3) {
        int i2 = -1;
        if (!LIZ) {
            return -1;
        }
        try {
            i2 = nativeInitMmapHook(str, str2, str3, i, z);
            return i2;
        } catch (Throwable unused) {
            return i2;
        }
    }
}
