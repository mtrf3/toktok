package X;

import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveOhrConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.1cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36731cL implements InterfaceC20970s1 {
    public static int LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static final C36731cL LIZ = new C36731cL();
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(C27Z.LJLIL);
    public static final LiveOhrConfig LIZJ = LiveClientAISettings.INSTANCE.aiServices().liveOhrConfig;
    public static final C36721cK LJI = new FQI() { // from class: X.1cK
        @Override // X.FQI
        public final void LIZ(int i) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onOHRPredictStatus :: [");
            LIZ2.append(i);
            LIZ2.append(']');
            C0NB.LIZIZ("LiveOhrService", X1D.LIZIZ(LIZ2));
        }

        @Override // X.FQI
        public final void LIZIZ(C59852Wn c59852Wn) {
            C36731cL.LIZLLL = c59852Wn.LIZIZ;
            Integer value = Integer.valueOf(C36731cL.LIZLLL);
            o.LJIIIZ(value, "value");
            C19660pu.LIZ.put("livesdk_ohr_status", value);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onOHRPredictChanged :: [");
            LIZ2.append(c59852Wn);
            LIZ2.append(']');
            C0NB.LIZIZ("LiveOhrService", X1D.LIZIZ(LIZ2));
        }
    };

    public static final void LIZLLL() {
        if (LJ && !LJFF) {
            FQE fqe = (FQE) LIZIZ.getValue();
            if (fqe != null) {
                fqe.LIZIZ();
            }
            LJFF = true;
        }
    }

    @Override // X.InterfaceC20970s1
    public final void LIZ() {
        if (LJ && LJFF) {
            FQE fqe = (FQE) LIZIZ.getValue();
            if (fqe != null) {
                fqe.LIZ();
            }
            LJFF = false;
        }
    }

    public final void LIZIZ() {
        if (LJ) {
            return;
        }
        C0NB.LIZIZ("LiveOhrService", "initSmartOhrPredict");
        LJFF = true;
        LJ = true;
        FQE fqe = (FQE) LIZIZ.getValue();
        if (fqe != null) {
            fqe.LJFF();
        }
        LIZJ(this, 0, 3);
    }

    @Override // X.InterfaceC20970s1
    public final boolean isEnable() {
        return LIZJ.ohrPredictEnable;
    }

    @Override // X.InterfaceC20970s1
    public final void feedMotionEvent(MotionEvent ev) {
        FQE fqe;
        o.LJIIIZ(ev, "ev");
        if (LJ && LIZJ.ohrPredictEnable && (fqe = (FQE) LIZIZ.getValue()) != null) {
            fqe.feedMotionEvent(ev);
        }
    }

    public static void LIZJ(C36731cL c36731cL, final int i, int i2) {
        long j;
        if ((i2 & 1) != 0) {
            i = 5;
        }
        if ((i2 & 2) != 0) {
            j = 2000;
        } else {
            j = 0;
        }
        c36731cL.getClass();
        boolean z = false;
        if (LJ) {
            FQE fqe = (FQE) LIZIZ.getValue();
            if (fqe != null) {
                z = fqe.LJIIJ(LJI);
            }
            C10S.LIZ("registerOHRServiceObserver :: ", z, "LiveOhrService");
            if (z) {
                return;
            }
        }
        if (i > 0) {
            C15610jN.LIZ().postDelayed(new Runnable() { // from class: X.10T
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        C36731cL.LIZJ(C36731cL.LIZ, i - 1, 2);
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            }, j);
        }
    }
}
