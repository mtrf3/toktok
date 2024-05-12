package com.bytedance.crash.nativecrash;

import X.C1XY;
import X.C64214PIc;
import X.C64264PKa;
import X.C64268PKe;
import X.C78596Usy;
import X.C78685UuP;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PKI;
import X.PKL;
import X.PKX;
import X.PKZ;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class NativeCrashCollector {
    public static boolean LIZ;

    public static void LIZ(String str) {
        Iterator<ICrashCallback> it = PKZ.LJFF.LIZ.getList(CrashType.NATIVE).iterator();
        while (it.hasNext()) {
            try {
                it.next().onCrash(CrashType.NATIVE, str, null);
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
        }
    }

    public static void onNativeCrash(int i, String str) {
        PKX pkx;
        C78685UuP.LJJJLL();
        File file = C78596Usy.LJLJJLL;
        if (file == null) {
            file = C78596Usy.LJIL(PK0.LIZ);
        }
        File file2 = new File(file, PK0.LIZJ());
        C1XY.LJ(C78596Usy.LJIJ(PK0.LIZ));
        C1XY.LJIIIZ(C78596Usy.LJIJ(PK0.LIZ));
        C1XY.LJIIIIZZ(C78596Usy.LJIJ(PK0.LIZ));
        try {
            PKL LJIIJJI = PKL.LJIIJJI();
            LJIIJJI.getClass();
            try {
                if (!LJIIJJI.LJ && C64264PKa.LJII(PK0.LIZ)) {
                    C64214PIc.LIZ().LIZ(LJIIJJI.LJI);
                }
            } catch (Throwable unused) {
            }
            C64268PKe.LIZLLL().LIZIZ(CrashType.NATIVE, null, new PKI(str, new File(file2, file2.getName()), i), true);
        } catch (Throwable th) {
            try {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                if (LIZ) {
                    pkx = new PKX(file2);
                }
            } catch (Throwable th2) {
                if (LIZ) {
                    PKX pkx2 = new PKX(file2);
                    pkx2.LJ(file2);
                    LIZ(pkx2.LIZJ());
                } else {
                    LIZ("");
                }
                throw th2;
            }
        }
        if (LIZ) {
            pkx = new PKX(file2);
            pkx.LJ(file2);
            LIZ(pkx.LIZJ());
            return;
        }
        LIZ("");
    }
}
