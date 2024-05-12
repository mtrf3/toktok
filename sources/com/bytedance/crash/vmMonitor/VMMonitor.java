package com.bytedance.crash.vmMonitor;

import X.C64272PKi;
import X.C64274PKk;
import X.C64279PKp;
import X.C78596Usy;
import X.C78685UuP;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PK8;
import X.PLQ;
import X.X1D;
import android.app.Application;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public class VMMonitor {
    public static PLQ LJII;
    public static PLQ LJIIIIZZ;
    public static VMMonitor LJIIIZ;
    public String[] LIZ;
    public JSONArray LIZIZ;
    public JSONArray LIZJ;
    public long LIZLLL;
    public long LJ = 512000;
    public long LJFF = 819200;
    public long LJI = 512000;

    public static VMMonitor LIZJ() {
        if (LJIIIZ == null) {
            synchronized (VMMonitor.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new VMMonitor();
                }
            }
        }
        return LJIIIZ;
    }

    public final void LIZIZ() {
        PLQ plq = LJII;
        if (plq.LJ) {
            C78685UuP.LJIJJLI();
        } else {
            plq.LJ = true;
            new C64279PKp(this).start();
        }
    }

    public static long LIZLLL() {
        PLQ plq;
        NativeVMMonitor.LJI().getClass();
        if (NativeVMMonitor.LJ(6) < 0 && (plq = LJII) != null) {
            plq.LJFF = -1;
        }
        return Math.max(0, r2);
    }

    public static void LJIIIIZZ() {
        C78685UuP.LJIJJLI();
        PLQ plq = LJII;
        NativeVMMonitor.LJI().getClass();
        int LIZLLL = NativeVMMonitor.LIZLLL(4, 0);
        if (LIZLLL != 0) {
            plq.LJFF = -1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VMMonitor: stop monitor error: ");
            LIZ.append(LIZLLL);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJIJJLI();
        }
    }

    public static void LJIIIZ() {
        C78685UuP.LJIJJLI();
        PLQ plq = LJII;
        if (!plq.LIZIZ) {
            return;
        }
        NativeVMMonitor.LJI().getClass();
        boolean z = false;
        int LIZLLL = NativeVMMonitor.LIZLLL(2, 0);
        if (LIZLLL != 0) {
            plq.LJFF = -1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VMMonitor: exit hook error: ");
            LIZ.append(LIZLLL);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJIJJLI();
        } else {
            z = true;
        }
        plq.LIZJ = z;
        plq.LIZIZ = !z;
    }

    public static boolean LIZ(int i) {
        PLQ plq;
        int i2;
        PLQ plq2;
        if (i == 0) {
            plq = LJII;
        } else {
            plq = LJIIIIZZ;
        }
        boolean z = true;
        if (plq == null || !plq.LIZ || (i2 = plq.LJFF) == 4 || i2 == -1 || i2 == 5) {
            return false;
        }
        if (!plq.LIZIZ && plq.LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VMMonitor: start hook: ");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJIJJLI();
            if (i == 0) {
                plq2 = LJII;
            } else {
                plq2 = LJIIIIZZ;
            }
            if (!plq2.LIZIZ) {
                NativeVMMonitor.LJI().getClass();
                int LIZLLL = NativeVMMonitor.LIZLLL(1, i);
                if (LIZLLL != 0) {
                    plq2.LJFF = -1;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("VMMonitor: start hook error: ");
                    LIZ2.append(LIZLLL);
                    X1D.LIZIZ(LIZ2);
                    C78685UuP.LJIJJLI();
                    z = false;
                }
                plq2.LIZIZ = z;
                plq2.LIZJ = false;
            }
            C64272PKi.LIZ().getClass();
            Application application = PK0.LIZIZ;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(C64272PKi.LJ);
            }
        }
        return plq.LIZIZ;
    }

    public static String LJFF(String str) {
        Long l;
        String str2 = null;
        if (str != null) {
            try {
                if (str.endsWith("M")) {
                    l = Long.valueOf(CastLongProtector.parseLong(str.substring(0, str.indexOf("M"))) * 1024 * 1024);
                } else if (str.endsWith("G")) {
                    l = Long.valueOf(CastLongProtector.parseLong(str.substring(0, str.indexOf("G"))) * 1024 * 1024 * 1024);
                } else if (str.endsWith("K")) {
                    l = Long.valueOf(CastLongProtector.parseLong(str.substring(0, str.indexOf("K"))) * 1024);
                } else {
                    l = null;
                }
                if (l == null) {
                    return null;
                }
                str2 = l.toString();
                return str2;
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
        }
        return str2;
    }

    public static void LJII(int i) {
        PLQ plq;
        C78685UuP.LJIJJLI();
        if (!LIZ(i)) {
            return;
        }
        NativeVMMonitor.LJI().getClass();
        int LIZLLL = NativeVMMonitor.LIZLLL(3, i);
        if (LIZLLL != 0) {
            if (i == 0) {
                plq = LJII;
            } else {
                plq = LJIIIIZZ;
            }
            plq.LJFF = -1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VMMonitor: start monitor error: ");
            LIZ.append(LIZLLL);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJIJJLI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4 A[Catch: all -> 0x0213, TryCatch #3 {all -> 0x0213, blocks: (B:7:0x0023, B:9:0x002a, B:10:0x0032, B:12:0x003c, B:15:0x0043, B:17:0x004d, B:18:0x005c, B:20:0x005f, B:24:0x0069, B:25:0x006d, B:27:0x007e, B:28:0x0088, B:30:0x0090, B:44:0x00ea, B:46:0x00f4, B:47:0x00f6, B:49:0x00fc, B:51:0x0108, B:53:0x0117, B:93:0x00db, B:22:0x00a7), top: B:6:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154 A[LOOP:2: B:58:0x014e->B:60:0x0154, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.io.File r15) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.vmMonitor.VMMonitor.LJIIJ(java.io.File):void");
    }

    public static void LJIIJJI(boolean z) {
        File[] listFiles;
        C78685UuP.LJIJJLI();
        File LJJII = C78596Usy.LJJII(PK0.LIZ);
        File LJJIII = C78596Usy.LJJIII(PK0.LIZ, PK0.LIZJ());
        if (!z) {
            if (!LJJIII.exists()) {
                return;
            }
            LJIIJ(LJJIII);
            PK8.LIZJ(LJJIII);
            return;
        }
        if (!LJJII.exists() || (listFiles = LJJII.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if (!LJJIII.getAbsolutePath().equals(file.getAbsolutePath())) {
                LJIIJ(file);
                PK8.LIZJ(file);
            }
        }
    }

    public final void LJI(int i) {
        if (!LIZ(0)) {
            return;
        }
        if (LJII.LJ) {
            C78685UuP.LJIJJLI();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VMMonitor: setMode: ");
        LIZ.append(LJII.LJI);
        LIZ.append("  ----> ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJIJJLI();
        PLQ plq = LJII;
        plq.LJI = i;
        if (i == 1) {
            plq.LIZLLL = false;
        } else if (i != 0) {
            if (i != 1) {
                return;
            }
        } else {
            if (plq.LIZLLL) {
                C78685UuP.LJIJJLI();
                return;
            }
            if (!plq.LIZ) {
                C78685UuP.LJIJJLI();
                return;
            }
            C78685UuP.LJIJJLI();
            PLQ plq2 = LJII;
            plq2.LIZLLL = true;
            plq2.LJFF = 0;
            new C64274PKk(this).start();
            return;
        }
        C78685UuP.LJIJJLI();
        PLQ plq3 = LJII;
        if (plq3.LIZLLL) {
            C78685UuP.LJIJJLI();
        } else {
            plq3.LIZLLL = true;
            LJII(0);
        }
    }

    public int dumpInfoCrash(int i) {
        PLQ plq;
        int i2;
        if (i == 0) {
            plq = LJII;
        } else {
            plq = LJIIIIZZ;
        }
        if (plq == null || !plq.LIZ || (i2 = plq.LJFF) == 4 || i2 == -1 || i2 == 5) {
            return -1;
        }
        NativeVMMonitor.LJI().getClass();
        return NativeVMMonitor.LJFF(i);
    }

    public static int LJ(JSONArray jSONArray, int i, String str) {
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
