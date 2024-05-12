package com.bytedance.crash.util;

import X.C16880lQ;
import X.C48292IxM;
import X.C64214PIc;
import X.C64263PJz;
import X.C64264PKa;
import X.C64278PKo;
import X.C64284PKu;
import X.C78596Usy;
import X.C78685UuP;
import X.PJC;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PK8;
import X.PKO;
import X.PKP;
import X.PKQ;
import X.PKX;
import X.PLD;
import X.X1D;
import Y.ARunnableS18S0000000_11;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.librarian.Librarian;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class NativeTools {
    public static NativeTools LIZIZ;
    public static final HashMap<String, String> LIZJ = new HashMap<>();
    public volatile boolean LIZ;

    public static native int doCommonLogPath(int i, String str);

    public static native long doDumpEnvInfo();

    public static native void doEnvMonitorInit(int i);

    public static native void doSetNpthCatchAddr(long j);

    public static native void doSetUtilFormatSafe(long j);

    public static native int nativeAnrDump(String str, int i);

    public static native int nativeAnrMonitorInit();

    public static native int nativeAnrMonitorLoop();

    public static native int nativeCloseFile(int i);

    public static native int nativeDumpCrashInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z);

    public static native int nativeDumpLogcat(String str, String str2);

    public static native int nativeDumpOSMemInfo(String str);

    public static native int nativeDumpPthreadFile(String str);

    public static native int nativeDumpPthreadList(String str, String str2);

    public static native int nativeDumpThrowable(String str, Throwable th);

    public static native int nativeFillNativeHeapSize(NativeHeapSize nativeHeapSize);

    public static native String nativeGetBuildID(String str);

    public static native int nativeGetFDCount();

    public static native String[] nativeGetFdListForAPM();

    public static native int nativeGetMapsSize(String str);

    public static native String nativeGetOOMReason(String str, String str2);

    public static native long nativeGetPathSize(String str, int i);

    public static native int nativeGetResendSigquit();

    public static native long nativeGetSymbolAddress(String str, String str2, int i);

    public static native long nativeGetThreadCpuTimeMills(int i);

    public static native int nativeGetThreadInfoFromTombStone(String str, String str2);

    public static native boolean nativeIs64BitLibrary();

    public static native int nativeLockFile(String str);

    public static native int nativeOpenFile(String str);

    public static native boolean nativePidExists(int i);

    public static native void nativeSetFdLimit();

    public static native void nativeSetMallocInfoFunctionAddress(long j);

    public static native void nativeSetResendSigquit(int i);

    public static native int nativeTerminateMonitorWait(long j, String str, String str2, String str3, boolean z, boolean z2, boolean z3);

    public static native int nativeToolsInit(int i, String str);

    public static native int nativeUnlockFile(int i);

    public static native int nativeUpdateEspInfoFromTombStone(String str, String str2);

    public static native int nativeWriteFile(int i, String str, int i2);

    public static void onClearExcept(int[] iArr) {
    }

    /* loaded from: classes7.dex */
    public class NativeHeapSize {
        public long allocate;
        public long free;
        public long total;

        public void print() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NativeHeapSize.total = ");
            LIZ.append(this.total);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJJJLL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NativeHeapSize.allocate = ");
            LIZ2.append(this.allocate);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJJJLL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("NativeHeapSize.free = ");
            LIZ3.append(this.free);
            X1D.LIZIZ(LIZ3);
            C78685UuP.LJJJLL();
        }

        public NativeHeapSize() {
        }
    }

    public NativeTools() {
        if (!this.LIZ) {
            try {
                try {
                    C16880lQ.LLJJJIL("npth_tools");
                    this.LIZ = true;
                } catch (Throwable unused) {
                    Librarian.LJFF(PK0.LIZ, "npth_tools");
                    this.LIZ = true;
                }
            } catch (Throwable unused2) {
            }
            boolean z = this.LIZ;
        }
    }

    public static NativeTools LJIILJJIL() {
        if (LIZIZ == null) {
            synchronized (NativeTools.class) {
                if (LIZIZ == null) {
                    NativeTools nativeTools = new NativeTools();
                    LIZIZ = nativeTools;
                    try {
                        if (nativeTools.LIZ) {
                            nativeToolsInit(Build.VERSION.SDK_INT, NativeImpl.LIZ(PK0.LIZ));
                            doSetNpthCatchAddr(NativeImpl.LJIIIIZZ());
                            doSetUtilFormatSafe(NativeImpl.LJIIIZ());
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return LIZIZ;
    }

    public static String LJIILLIIL() {
        File LJIIZILJ = C78596Usy.LJIIZILJ(PK0.LIZ);
        if (!LJIIZILJ.exists()) {
            LJIIZILJ.mkdirs();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIZILJ.getAbsolutePath());
        LIZ.append('/');
        LIZ.append(PK0.LIZJ());
        return X1D.LIZIZ(LIZ);
    }

    public static void reportEventForAnrMonitor() {
        JSONArray jSONArray;
        long j;
        String str;
        String str2;
        String str3;
        if (PLD.LIZLLL) {
            if (PK0.LJI) {
                if (!C64278PKo.LIZLLL()) {
                    return;
                }
                PKO.LJII();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            if (PKO.LJI) {
                str = "doingTrace";
            } else {
                str = "noDoTrace";
            }
            LIZ.append(str);
            if (PKO.LJIIIZ != null) {
                str2 = "_HasTraced";
            } else {
                str2 = "_NoTraced";
            }
            LIZ.append(str2);
            if (PKO.LJFF != null) {
                str3 = "_HasANRInfo";
            } else {
                str3 = "_NoANRInfo";
            }
            LIZ.append(str3);
            C64263PJz.LIZ("anr_sigquit", X1D.LIZIZ(LIZ));
            if (!PKO.LJI && PKO.LJIIIZ == null) {
                if (PKO.LJ <= 0 || System.currentTimeMillis() - PKO.LJ >= 100000) {
                    if (LJIILJJIL().LJJI()) {
                        try {
                            PK8.LJIILJJIL(PKO.LJIIIZ(), String.valueOf(PKO.LJIIIIZZ + 1), false);
                        } catch (Throwable unused) {
                        }
                    }
                    synchronized (PKO.class) {
                        if (!PKO.LJI && PKO.LJIIIZ == null) {
                            PKO.LJI = true;
                            PKO.LIZLLL = currentTimeMillis;
                            C64284PKu LIZ2 = C64214PIc.LIZ();
                            ARunnableS18S0000000_11 aRunnableS18S0000000_11 = PKO.LJIIJJI;
                            LIZ2.LJ();
                            PKO.LJFF(currentTimeMillis, 0L, true);
                            synchronized (PKO.class) {
                                PKO.LJI = false;
                                PKO.class.notifyAll();
                            }
                            C64214PIc.LIZ().LIZJ(aRunnableS18S0000000_11, 35000L);
                            C64214PIc.LIZ().LIZJ(new ARunnableS18S0000000_11(27), 2000L);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!C64278PKo.LIZLLL()) {
            return;
        }
        try {
            PKP pkp = (PKP) C48292IxM.LIZJ(PK0.LIZ).LIZ;
            pkp.getClass();
            if (LJIILJJIL().LJJI()) {
                try {
                    PK8.LJIILJJIL(pkp.LJII(), String.valueOf(1), false);
                } catch (Throwable th) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
            pkp.LJIIIZ.LIZ();
            pkp.LJ(SystemClock.uptimeMillis());
            if (!Header.LJIIIZ()) {
                File LJJIIZI = C78596Usy.LJJIIZI();
                C64263PJz.LIZ("anr_signal_trace", LJJIIZI.getParentFile().getName());
                long uptimeMillis = SystemClock.uptimeMillis();
                LIZIZ.LIZIZ(LJJIIZI.getAbsolutePath(), true);
                j = SystemClock.uptimeMillis() - uptimeMillis;
                C64263PJz.LIZ("after_signal_trace", LJJIIZI.getParentFile().getName());
                try {
                    jSONArray = PK8.LJIIIIZZ(LJJIIZI.getAbsolutePath());
                } catch (Throwable unused2) {
                    jSONArray = new JSONArray();
                }
            } else {
                jSONArray = new JSONArray();
                j = -1;
            }
            try {
                ((PKP) C48292IxM.LIZJ(PK0.LIZ).LIZ).LJIIJJI(j, jSONArray);
            } catch (Throwable th2) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th2);
            }
        } catch (Throwable unused3) {
            C78685UuP.LJJ();
        }
    }

    public final void LJIILIIL() {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeAnrMonitorLoop();
        } catch (Throwable unused) {
        }
    }

    public final long LJIIZILJ() {
        long j = 0;
        if (!this.LIZ) {
            return 0L;
        }
        try {
            j = doDumpEnvInfo();
            return j;
        } catch (Throwable unused) {
            return j;
        }
    }

    public final int LJIJ() {
        int i = -1;
        if (!this.LIZ) {
            return -1;
        }
        try {
            i = nativeGetFDCount();
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    public final List<String> LJIJI() {
        if (!this.LIZ) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String[] nativeGetFdListForAPM = nativeGetFdListForAPM();
            if (nativeGetFdListForAPM != null) {
                arrayList.addAll(Arrays.asList(nativeGetFdListForAPM));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean LJJI() {
        if (!this.LIZ) {
            return false;
        }
        try {
            if (nativeGetResendSigquit() == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void LJJIIJ() {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeSetFdLimit();
        } catch (Throwable unused) {
            C78685UuP.LJJ();
        }
    }

    public final void LJJIIJZLJL() {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeAnrMonitorInit();
        } catch (Throwable unused) {
        }
    }

    public final boolean LJJIIZ() {
        boolean z = false;
        if (!this.LIZ) {
            return false;
        }
        try {
            z = nativeIs64BitLibrary();
            return z;
        } catch (Throwable unused) {
            return z;
        }
    }

    public static void onProcessBeWorker() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current be worker ");
        LIZ.append(C64264PKa.LIZJ(PK0.LIZ));
        X1D.LIZIZ(LIZ);
        C78685UuP.LJJI();
        C64214PIc.LIZ().LIZ(new ARunnableS18S0000000_11(7));
    }

    public static void onStartAllClear() {
        PKQ.LJI();
    }

    public static String LIZLLL(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            return sb.toString();
        }
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    public static String LJIILL(String str) {
        try {
            return nativeGetBuildID(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long LJIJJ(String str) {
        return nativeGetPathSize(str, 0);
    }

    public static long LJIJJLI(String str) {
        return nativeGetPathSize(str, 1);
    }

    public static JSONArray LJJIFFI(String str) {
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        for (String str2 : str.split("\n")) {
            String[] LIZIZ2 = PKX.LIZIZ(str2);
            if (LIZIZ2 != null) {
                NativeTools LJIILJJIL = LJIILJJIL();
                String str3 = LIZIZ2[1];
                LJIILJJIL.getClass();
                HashMap<String, String> hashMap = LIZJ;
                String str4 = hashMap.get(str3);
                if (TextUtils.isEmpty(str4)) {
                    LJIILJJIL().getClass();
                    str4 = LIZLLL(LJIILL(str3));
                    hashMap.put(str3, str4);
                }
                if (!TextUtils.isEmpty(str4) && !hashSet.contains(LIZIZ2[0])) {
                    hashSet.add(LIZIZ2[0]);
                    JSONObject jSONObject = new JSONObject();
                    PJC.LJIIJ(jSONObject, "lib_name", LIZIZ2[0]);
                    PJC.LJIIJ(jSONObject, "lib_uuid", str4);
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    public final void LIZJ(int i) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeCloseFile(i);
        } catch (Throwable unused) {
        }
    }

    public final void LJFF(String str) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpCrashInfo(null, null, null, str, null, null, null, false);
        } catch (Throwable unused) {
        }
    }

    public final void LJI(String str) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpCrashInfo(null, null, null, null, null, str, null, false);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIIZZ(String str) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpCrashInfo(null, null, null, null, null, null, str, false);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIZ(String str) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpCrashInfo(null, str, null, null, null, null, null, false);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIJ(String str) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpOSMemInfo(str);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIJJI(String str) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpPthreadFile(str);
        } catch (Throwable unused) {
        }
    }

    public final int LJIL(String str) {
        int i = 0;
        if (!this.LIZ) {
            return 0;
        }
        try {
            i = nativeGetMapsSize(str);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    public final long LJJII(int i) {
        if (!this.LIZ) {
            return -1L;
        }
        try {
            return nativeGetThreadCpuTimeMills(i);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final int LJJIIZI(String str) {
        int i = -1;
        if (!this.LIZ) {
            return -1;
        }
        try {
            i = nativeLockFile(str);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    public final int LJJIJ(String str) {
        int i = -1;
        if (!this.LIZ) {
            return -1;
        }
        try {
            i = nativeOpenFile(str);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    public final boolean LJJIJIIJI(int i) {
        boolean z = false;
        if (!this.LIZ) {
            return false;
        }
        try {
            z = nativePidExists(i);
            return z;
        } catch (Throwable unused) {
            return z;
        }
    }

    public final void LJJIJIIJIL(boolean z) {
        int i;
        if (!this.LIZ) {
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            nativeSetResendSigquit(i);
        } catch (Throwable unused) {
        }
    }

    public final void LJJIJL(int i) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeUnlockFile(i);
        } catch (Throwable unused) {
        }
    }

    public void setMallocInfoFunc(long j) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeSetMallocInfoFunctionAddress(j);
        } catch (Throwable unused) {
        }
    }

    public static void onFindOneDied(int i, String str) {
        PKQ.LJFF(i, str);
    }

    public final void LIZ(int i, boolean z) {
        if (!this.LIZ) {
            return;
        }
        try {
            if (ByteHook.init() != 0) {
                return;
            }
            if (!z) {
                String LJIILLIIL = LJIILLIIL();
                if (this.LIZ) {
                    doCommonLogPath(0, LJIILLIIL);
                } else {
                    doEnvMonitorInit(i);
                }
            } else {
                String LJIILLIIL2 = LJIILLIIL();
                if (this.LIZ) {
                    doCommonLogPath(1, LJIILLIIL2);
                }
                doEnvMonitorInit(i);
            }
            doEnvMonitorInit(i);
        } catch (Throwable unused) {
        }
    }

    public final boolean LIZIZ(String str, boolean z) {
        int i;
        if (!this.LIZ) {
            return false;
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            nativeAnrDump(str, i);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void LJII(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpLogcat(str, str2);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIL(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeDumpPthreadList(str, str2);
        } catch (Throwable unused) {
        }
    }

    public final String LJJ(String str, String str2) {
        if (!this.LIZ) {
            return "UNKNOWN";
        }
        try {
            String nativeGetOOMReason = nativeGetOOMReason(str, str2);
            if (nativeGetOOMReason == null) {
                return "UNKNOWN";
            }
            return nativeGetOOMReason;
        } catch (Throwable unused) {
            return "UNKNOWN";
        }
    }

    public final void LJJIII(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeGetThreadInfoFromTombStone(str, str2);
        } catch (Throwable unused) {
        }
    }

    public final void LJJIJLIJ(String str, String str2) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeUpdateEspInfoFromTombStone(str, str2);
        } catch (Throwable unused) {
        }
    }

    public final void LJJIL(int i, String str) {
        if (!this.LIZ) {
            return;
        }
        try {
            nativeWriteFile(i, str, str.length());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(long r9, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            boolean r0 = r8.LIZ
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = X.PK0.LIZ     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = X.C64264PKa.LIZJ(r0)     // Catch: java.lang.Throwable -> L44
            android.content.Context r0 = X.PK0.LIZ     // Catch: java.lang.Throwable -> L44
            boolean r5 = X.C64264PKa.LJII(r0)     // Catch: java.lang.Throwable -> L44
            android.content.Context r0 = X.PK0.LIZ     // Catch: java.lang.Throwable -> L44
            boolean r0 = X.C64264PKa.LJII(r0)     // Catch: java.lang.Throwable -> L44
            r3 = 1
            java.lang.String r2 = "custom_event_settings"
            java.lang.String r1 = "npth_simple_setting"
            if (r0 != 0) goto L2d
            java.lang.String r0 = "enable_kill_history_data_sub"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L44
            int r0 = X.PJA.LJIIJ(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 != r3) goto L2b
            goto L2d
        L2b:
            r6 = 0
            goto L2e
        L2d:
            r6 = 1
        L2e:
            java.lang.String r0 = "disable_kill_history_subprocess"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L44
            int r0 = X.PJA.LJIIJ(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 != r3) goto L3c
            r7 = 0
            goto L3d
        L3c:
            r7 = 1
        L3d:
            r2 = r11
            r3 = r12
            r0 = r9
            nativeTerminateMonitorWait(r0, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            X.C78685UuP.LJJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.NativeTools.LJJIJIL(long, java.lang.String, java.lang.String):void");
    }

    public long getSymbolAddress(String str, String str2, boolean z) {
        int i;
        if (!this.LIZ) {
            return -1L;
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            return nativeGetSymbolAddress(str, str2, i);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5) {
        nativeDumpCrashInfo(str, str2, str3, str4, str5, null, null, false);
    }
}
