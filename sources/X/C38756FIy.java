package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FIy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38756FIy implements QLN {
    @Override // X.QLN
    public final void LIZ(List teaEventIndex) {
        o.LJIIIZ(teaEventIndex, "teaEventIndex");
    }

    @Override // X.QLN
    public final void LIZIZ() {
    }

    @Override // X.QLN
    public final void LIZJ() {
    }

    @Override // X.QLN
    public final void LIZLLL() {
    }

    @Override // X.QLN
    public final void LJFF() {
    }

    @Override // X.QLN
    public void onEventExpired(List<Long> teaEventIndex) {
        o.LJIIIZ(teaEventIndex, "teaEventIndex");
    }

    @Override // X.QLN
    public final void LJ(String str) {
        if (o.LJ("terminate", "terminate")) {
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("data_source", "terminate");
            c198517qh.LIZ.put("session_id", str);
            c198517qh.LIZ.put("is_success", 1);
            c198517qh.LIZ.put("eventIndex", null);
            c198517qh.LIZ.put("error_message", "");
            FUA.LIZJ("type_app_log_state_change", c198517qh.LJ());
        }
    }
}
