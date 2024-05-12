package X;

import android.os.HandlerThread;
import android.util.SparseArray;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ot5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63315Ot5 {
    public static final C63315Ot5 LIZ = new C63315Ot5();
    public static final HandlerThread LIZIZ = new HandlerThread("RepairManagerV2-Thread");
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C63329OtJ.LJLIL);
    public static final C63291Osh LJ = C63291Osh.LIZ();
    public static final SparseArray<L46> LJFF = new SparseArray<>();
    public static final boolean LIZLLL = true;

    static {
        int[] allInbox = C63312Ot2.LIZLLL();
        o.LJIIIIZZ(allInbox, "allInbox");
        for (int i : allInbox) {
            SparseArray<L46> sparseArray = LJFF;
            LIZ.getClass();
            sparseArray.put(i, new L46(LIZLLL(i)));
        }
    }

    public static void LIZ() {
        C63322OtC.LIZIZ("RepairManagerV2 ", "cancelPollingMsg for all inboxes");
        if ((!C63314Ot4.LJI() && !C63314Ot4.LIZ()) || C63314Ot4.LJ()) {
            return;
        }
        int size = LJFF.size();
        for (int i = 0; i < size; i++) {
            LJI(LJFF.keyAt(i));
        }
    }

    public static HandlerC63316Ot6 LIZJ() {
        return (HandlerC63316Ot6) LIZJ.getValue();
    }

    public static void LJFF() {
        int i;
        C63322OtC.LIZIZ("RepairManagerV2 ", "startPollingMsg for all inboxes");
        if (C63308Osy.LJI().LJ) {
            if (C63314Ot4.LJI() || C63314Ot4.LIZ()) {
                if (C63314Ot4.LIZ()) {
                    i = 11;
                } else {
                    i = 8;
                }
                LJ(i);
            }
        }
    }

    public static long LIZIZ(int i) {
        if (i == 3) {
            JSONObject jSONObject = C63314Ot4.LJIILIIL;
            if (jSONObject != null) {
                return jSONObject.optLong("defaultPollingStrangerMsgInterval", C63314Ot4.LIZLLL);
            }
            return C63314Ot4.LIZLLL;
        }
        if (C63314Ot4.LJIILIIL != null) {
            return r1.optInt("defaultPollingMsgInterval");
        }
        return C63314Ot4.LIZJ;
    }

    public static long LIZLLL(int i) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getNextPollingMsgIntervalSeconds inbox: ");
        LIZ2.append(i);
        C63322OtC.LIZIZ("RepairManagerV2 ", X1D.LIZIZ(LIZ2));
        L46 l46 = LJFF.get(i);
        if (l46 != null) {
            return l46.LJLILLLLZI;
        }
        return LIZIZ(i);
    }

    public static void LJ(int i) {
        int size = LJFF.size();
        for (int i2 = 0; i2 < size; i2++) {
            SparseArray<L46> sparseArray = LJFF;
            int keyAt = sparseArray.keyAt(i2);
            L46 l46 = sparseArray.get(keyAt);
            if (!LIZJ().hasMessages(keyAt)) {
                LIZJ().sendEmptyMessageDelayed(keyAt, LIZLLL(keyAt) * 1000);
            }
            l46.LJLIL = i;
        }
    }

    public static void LJI(int i) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("stopPollingMsg inbox: ");
        LIZ2.append(i);
        C63322OtC.LIZIZ("RepairManagerV2 ", X1D.LIZIZ(LIZ2));
        if (LIZJ().hasMessages(i)) {
            LIZJ().removeMessages(i);
            L46 l46 = LJFF.get(i);
            if (l46 != null) {
                LIZ.getClass();
                l46.LJLILLLLZI = LIZIZ(i);
            }
        }
    }

    public static void LJII(int i, long j) {
        C63322OtC.LIZIZ("RepairManagerV2 ", "startRepairAfterInit");
        L46 l46 = LJFF.get(i);
        if (l46 != null) {
            l46.LJLILLLLZI = j;
            LIZ.getClass();
            if (LIZJ().hasMessages(i)) {
                LIZJ().removeMessages(i);
                LIZJ().sendEmptyMessageDelayed(i, j * 1000);
            }
        }
    }
}
