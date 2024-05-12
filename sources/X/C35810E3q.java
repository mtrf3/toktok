package X;

import Y.AObjectS23S0000000_6;
import Y.ARunnableS11S0000000_4;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS1S0001000_6;
import Y.ARunnableS8S0000100_6;
import Y.ARunnableS8S0101000_4;
import android.os.Handler;
import android.os.Process;
import android.os.Trace;
import com.bytedance.common.jato.gfx.DoFrameController;
import java.util.LinkedHashMap;

/* renamed from: X.E3q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35810E3q {
    public static int LIZ = 0;
    public static int LIZIZ = 0;
    public static int LIZJ = 0;
    public static int LIZLLL = 0;
    public static int LJ = 0;
    public static boolean LJFF = false;
    public static int LJI = -1;
    public static long LJII;

    public static void LIZ() {
        E3F.LIZIZ("applogslidebatch", new AObjectS23S0000000_6(5), ((Boolean) C34016DWq.LJIIJJI.getValue()).booleanValue());
    }

    public static void LIZIZ() {
        C35808E3o c35808E3o;
        if (((Boolean) C34597Dhx.LIZLLL.getValue()).booleanValue() && (c35808E3o = (C35808E3o) ((LinkedHashMap) C35801E3h.LIZ).get("assem-serial-t")) != null) {
            try {
                EVM.LIZ(c35808E3o.LJLILLLLZI, c35808E3o.LJLJI);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean LJIIIIZZ() {
        int i;
        if (LJI == -1) {
            if (C38354F3m.LIZJ(EF7.LJIILIIL, "local_test") || C38354F3m.LIZJ(EF7.LJIILIIL, "lark_inhouse") || C38354F3m.LIZJ(EF7.LJIILIIL, "monkey") || C38354F3m.LIZJ(EF7.LJIILIIL, "rhea")) {
                i = 1;
            } else {
                i = 0;
            }
            LJI = i;
        }
        if (LJI != 1) {
            return false;
        }
        return true;
    }

    public static void LJIIL() {
        C37179EiV.LJFF.post(new ARunnableS13S0000000_6(33));
    }

    public static void LJIILIIL() {
        C37179EiV.LJFF.post(new ARunnableS1S0001000_6(1, 21));
    }

    public static void LJII() {
        if (LJIIIIZZ()) {
            Trace.endSection();
        }
    }

    public static void LJIILJJIL() {
        int myTid = Process.myTid();
        Handler handler = C37179EiV.LJFF;
        handler.post(new ARunnableS1S0001000_6(myTid, 10));
        if (((Boolean) C35812E3s.LIZ.getValue()).booleanValue()) {
            handler.post(new ARunnableS13S0000000_6(28));
        } else {
            if ((!C36152EGu.LJ() || !DPN.LIZ()) && !C35150Dqs.LIZ()) {
                return;
            }
            handler.post(new ARunnableS13S0000000_6(38));
        }
    }

    public static void LIZJ(String str) {
        if (LJIIIIZZ()) {
            Trace.beginSection(str);
        }
    }

    public static void LIZLLL(long j) {
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZLLL();
        C37179EiV.LJFF.postDelayed(new ARunnableS13S0000000_6(29), j);
    }

    public static void LJ(long j) {
        if ((C33750DMk.LIZ() & 1) == 1 || 0 != 0) {
            return;
        }
        if ((C33750DMk.LIZ() & 2) == 2) {
            j /= 2;
        } else if ((C33750DMk.LIZ() & 4) == 4) {
            j /= 4;
        } else if ((C33750DMk.LIZ() & 8) == 8) {
            j /= 10;
        }
        if (j <= 0) {
            return;
        }
        Handler handler = C37179EiV.LJFF;
        handler.post(new ARunnableS13S0000000_6(31));
        handler.postDelayed(new ARunnableS13S0000000_6(32), j);
    }

    public static void LJFF(long j) {
        int myTid = Process.myTid();
        Process.getThreadPriority(myTid);
        Handler handler = C37179EiV.LJFF;
        handler.post(new ARunnableS1S0001000_6(myTid, 8));
        handler.postDelayed(new ARunnableS1S0001000_6(myTid, 9), j);
        LJI(j);
    }

    public static void LJI(long j) {
        if (((Boolean) C35812E3s.LIZ.getValue()).booleanValue()) {
            C37179EiV.LJFF.post(new ARunnableS8S0000100_6(j, 5));
            return;
        }
        if ((!C36152EGu.LJ() || !DPN.LIZ()) && !C35150Dqs.LIZ() && !((Boolean) C86801Y4v.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (((Boolean) C86801Y4v.LIZJ.getValue()).booleanValue()) {
            j *= 2;
        }
        EBB.LIZ(j);
    }

    public static void LJIIJ(long j) {
        DoFrameController.LIZIZ = 3;
        LIZJ++;
        C37179EiV.LJFF.postDelayed(new ARunnableS11S0000000_4(5), j);
    }

    public static void LJIIJJI(long j) {
        Handler handler = C37179EiV.LJFF;
        handler.post(new ARunnableS13S0000000_6(34));
        handler.postDelayed(new ARunnableS13S0000000_6(30), j);
    }

    public static void LJIIIZ(int i, int[] iArr) {
        C37179EiV.LJFF.post(new ARunnableS8S0101000_4(i, iArr, 5));
    }
}
