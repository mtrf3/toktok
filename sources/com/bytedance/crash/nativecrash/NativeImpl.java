package com.bytedance.crash.nativecrash;

import X.C16880lQ;
import X.C64214PIc;
import X.C78596Usy;
import X.PK0;
import X.PKZ;
import X.X1D;
import Y.ARunnableS0S2000000_6;
import android.content.Context;
import android.os.Build;
import com.bytedance.crash.Npth;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.librarian.Librarian;
import java.io.File;

/* loaded from: classes12.dex */
public class NativeImpl {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static String LIZJ;
    public static boolean LIZLLL;
    public static volatile boolean LJ;

    public static native void CoredumpNativeInit(int i);

    public static native boolean doCheckNativeCrash();

    public static native int doCreateCallbackThread();

    public static native void doDelayCheck();

    public static native int doDumpRefLeakTable(String str);

    public static native void doEnableDumpMalloc(int i);

    public static native void doEnableMiniDump(String str, int i);

    public static native void doEnableResumeCbWhenCrash();

    public static native String doGetCrashHeader(String str);

    public static native long doGetNpthCatchAddr();

    public static native long doGetUtilFormatAddr();

    public static native int doOptMtkBuffer(int i, int i2);

    public static native void doPthreadKeyMonitorInit(int i);

    public static native void doRebuildTombstone(String str, String str2, String str3);

    public static native void doSetAlogFlushAddr(long j);

    public static native void doSetCoredumpConfig(String[] strArr);

    public static native void doSetDumpEnvInfoAddr(long j);

    public static native void doSetDumpVmMonitorAddr(long j);

    public static native void doSetMallocInfoFunctionAddress(long j);

    public static native void doSetNativeCallbackAddr(long j);

    public static native void doSetUploadEnd();

    public static native int doStartFixArtDumpNativeStack(int i);

    public static native int doStartMonitorReference(int i, int i2, String str, int i3, int i4, int i5);

    public static native int doStartNativeCrashMonitor(int i, String str, String str2, String str3, long j, long j2);

    public static native void doStopFixArtDumpNativeStack();

    public static int LIZIZ() {
        if (!LIZ) {
            return -1;
        }
        return doCreateCallbackThread();
    }

    public static boolean LIZLLL() {
        boolean z = false;
        if (!LIZ) {
            return false;
        }
        try {
            z = doCheckNativeCrash();
            return z;
        } catch (Throwable unused) {
            return z;
        }
    }

    public static void LJFF() {
        if (LIZ) {
            LJ = true;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C78596Usy.LJJIIJ(PK0.LIZ));
            LIZ2.append("/npth");
            File file = new File(X1D.LIZIZ(LIZ2), "anr_mindump");
            file.mkdirs();
            doEnableMiniDump(file.getAbsolutePath(), Build.VERSION.SDK_INT);
        }
    }

    public static void LJI() {
        if (!LIZ) {
            return;
        }
        doEnableResumeCbWhenCrash();
    }

    public static long LJIIIIZZ() {
        if (!LIZ) {
            return 0L;
        }
        return doGetNpthCatchAddr();
    }

    public static long LJIIIZ() {
        if (!LIZ) {
            return 0L;
        }
        return doGetUtilFormatAddr();
    }

    public static boolean LJIIJ() {
        boolean z;
        if (LIZIZ) {
            return LIZ;
        }
        boolean z2 = true;
        LIZIZ = true;
        if (!LIZ) {
            try {
                try {
                    C16880lQ.LLJJJIL("npth");
                } catch (Throwable unused) {
                    Librarian.LJFF(PK0.LIZ, "npth");
                }
                z = true;
            } catch (Throwable unused2) {
                z = false;
            }
            LIZ = z;
            if (LIZ) {
                try {
                    try {
                        C16880lQ.LLJJJIL("npth_tools");
                    } catch (Throwable unused3) {
                        Librarian.LJFF(PK0.LIZ, "npth_tools");
                    }
                } catch (Throwable unused4) {
                    z2 = false;
                }
                LIZ = z2;
                doSetDumpEnvInfoAddr(NativeTools.LJIILJJIL().LJIIZILJ());
            }
        }
        return LIZ;
    }

    public static void LJIILL() {
        long j;
        if (!LIZ) {
            return;
        }
        if (PKZ.LJIIJ != null) {
            j = Npth.getVmMonitorDumpInfoCrashAddr();
        } else {
            j = 0;
        }
        doSetDumpVmMonitorAddr(j);
    }

    public static void LJIILLIIL() {
        if (!LIZ) {
            return;
        }
        doSetUploadEnd();
    }

    public static String LIZ(Context context) {
        String str = LIZJ;
        if (str != null) {
            return str;
        }
        if (new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
            LIZJ = context.getApplicationInfo().nativeLibraryDir;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLIIJLIL(PK0.LIZ));
            LIZ2.append("/npth/selflib/");
            LIZJ = X1D.LIZIZ(LIZ2);
            LIZLLL = true;
            C64214PIc.LIZ().LIZ(new ARunnableS0S2000000_6("npth_dumper", "3.1.7-rc.51.oversea", 3));
        }
        return LIZJ;
    }

    public static void LIZJ(String str) {
        if (!LIZ) {
            return;
        }
        doDumpRefLeakTable(str);
    }

    public static void LJ(int i) {
        if (LIZ) {
            doEnableDumpMalloc(i);
        }
    }

    public static String LJII(String str) {
        if (!LIZ) {
            return null;
        }
        return doGetCrashHeader(str);
    }

    public static void LJIIL(int i) {
        try {
            doPthreadKeyMonitorInit(i);
        } catch (Throwable unused) {
        }
    }

    public static void LJIILIIL(File file) {
        if (!LIZ) {
            return;
        }
        doRebuildTombstone(new File(file, "header.bin").getAbsolutePath(), new File(file, "tombstone.txt").getAbsolutePath(), new File(C78596Usy.LJIJI(PK0.LIZ, file.getName()), "maps.txt").getAbsolutePath());
    }

    public static void LJIILJJIL(long j) {
        if (!LIZ) {
            return;
        }
        try {
            doSetAlogFlushAddr(j);
        } catch (Throwable unused) {
        }
    }

    public static void LJIIZILJ(int i) {
        if (LIZ) {
            doStartFixArtDumpNativeStack(i);
        }
    }

    public static boolean LJIJ(Context context) {
        if (LJIIJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C78596Usy.LJJIIJ(context));
            LIZ2.append("/npth");
            try {
                doStartNativeCrashMonitor(Build.VERSION.SDK_INT, LIZ(context), X1D.LIZIZ(LIZ2), PK0.LIZJ(), PK0.LJIIZILJ, PK0.LIZJ);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public static int LJIIJJI(int i, int i2) {
        if (LIZ) {
            return doOptMtkBuffer(i, i2);
        }
        return -1;
    }

    public static void handleNativeCrash(int i, String str) {
        NativeCrashCollector.onNativeCrash(i, str);
    }

    public static void LJIJI(int i, int i2, String str, int i3, int i4, int i5) {
        if (!LIZ) {
            return;
        }
        doStartMonitorReference(i, i2, str, i3, i4, i5);
    }
}
