package X;

import Y.AObjectS52S0101000_7;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Go9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42625Go9 {
    public static boolean LIZ(Object obj) {
        return EventBus.LIZJ().LJI(obj);
    }

    public static void LIZIZ(Object obj) {
        C42631GoF.LIZ(new AObjectS52S0101000_7(2, obj, 14));
        if (!EventBus.LIZJ().LJI(obj)) {
            C42631GoF.LIZ(new AObjectS52S0101000_7(1, obj, 13));
            EventBus.LIZJ().LJIILJJIL(obj);
        }
    }

    public static void LIZJ(Object obj) {
        C42631GoF.LIZ(new AObjectS52S0101000_7(1, obj, 10));
        if (EventBus.LIZJ().LJI(obj)) {
            C42631GoF.LIZ(new AObjectS52S0101000_7(2, obj, 25));
            EventBus.LIZJ().LJIJ(obj);
        }
    }
}
