package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.FbR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39289FbR {
    public static final java.util.Map<String, Integer> LIZ = new LinkedHashMap();
    public static final int LIZIZ = -1;
    public static final C39289FbR LIZJ = new C39289FbR();

    public final void LIZIZ() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public static int LIZ(String str) {
        if (str == null) {
            return LIZIZ;
        }
        Integer num = (Integer) ((LinkedHashMap) LIZ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return LIZIZ;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        o.LJIIIZ(event, "event");
        C58582Rq.LIZ("onCardStatusEvent: Status", "AdHybridSparkJsbStatusModel");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(event.LJLJI);
        LIZ2.append(event.LJLJJI);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        Integer valueOf = Integer.valueOf(event.LJLIL);
        if (valueOf != null) {
            valueOf.intValue();
            if (LIZIZ2 == null) {
                return;
            }
            LIZ.put(LIZIZ2, valueOf);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSuperLikeStatusEvent(C37087Eh1 event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onSuperLikeStatusEvent: status = ");
        LIZ2.append(event.LJLIL);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ2), "AdHybridSparkJsbStatusModel");
        Integer valueOf = Integer.valueOf(event.LJLIL);
        if (valueOf != null) {
            valueOf.intValue();
            LIZ.put("feed_fyp_super_like", valueOf);
        }
    }
}
