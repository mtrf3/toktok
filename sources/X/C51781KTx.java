package X;

import Y.ARunnableS19S0300000_8;
import Y.ARunnableS22S0200000_3;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.KTx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51781KTx {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends C8W0 & KU4 & KUK> void LIZ(T t) {
        o.LJIIIZ(t, "<this>");
        ScopePerformanceVM LIZ = KU1.LIZ(C212428Vi.LIZLLL(t));
        if (JAK.LIZ() && LIZ != null) {
            LIZ.gv0().add(t);
        }
        JAK.LIZ.getClass();
        if (((Number) JAK.LIZIZ.getValue()).intValue() == 2) {
            if (LIZ == null) {
                C55096Ljo.LIZJ(t);
                LIZIZ(t);
                return;
            }
            C55096Ljo.LIZJ(t);
            KU2 ku2 = new KU2(t, t);
            C37179EiV.LJFF.postAtFrontOfQueue(ku2);
            KU5 actionHandler = t.getActionHandler();
            actionHandler.getClass();
            CopyOnWriteArraySet<KU9> copyOnWriteArraySet = actionHandler.LIZIZ().get("simple_action_key_parent_set_buck_up");
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            }
            if (actionHandler.LIZIZ().get("simple_action_key_parent_set_buck_up") == null) {
                actionHandler.LIZIZ().put("simple_action_key_parent_set_buck_up", copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(ku2);
            return;
        }
        C55096Ljo.LIZJ(t);
        LIZIZ(t);
    }

    public static final <T extends C8W0 & KUK & KU4> void LIZIZ(T t) {
        T t2 = t;
        KRA panelContext = t2.getPanelContext();
        C8MM c8mm = new C8MM();
        t2.eventInit(c8mm);
        if (!c8mm.LIZIZ().isEmpty()) {
            if (!MS5.LIZLLL()) {
                C37179EiV.LIZ().postAtFrontOfQueue(new ARunnableS22S0200000_3(c8mm, panelContext, 61));
                return;
            }
            java.util.Set<Map.Entry<String, Observer<C207668Da>>> entrySet = c8mm.LIZIZ().entrySet();
            o.LJIIIIZZ(entrySet, "observers.entries");
            for (Map.Entry<String, Observer<C207668Da>> entry : entrySet) {
                panelContext.LIZIZ.iv0(entry.getKey(), entry.getValue(), false);
            }
        }
    }

    public static final <R extends C8W0 & KU4, T> void LIZJ(R r, C221138m5<? extends T> c221138m5) {
        o.LJIIIZ(r, "r");
        C37179EiV.LJFF.postAtFrontOfQueue(new ARunnableS19S0300000_8(r, r, c221138m5, 11));
    }
}
