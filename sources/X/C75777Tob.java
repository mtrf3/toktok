package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tob, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75777Tob {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C75589TlZ statics) {
        U8H LJJZZI;
        U8H LJJZZI2;
        o.LJIIIZ(statics, "statics");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ(statics.LJLILLLLZI, new JSONObject().put("stream_status", statics.LJLIL.getType())));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onStreamStatusUpdateAtAnchorSide start, writing sei data: ");
        LIZ2.append(LJJLIIIIJ);
        C0NB.LIZIZ("MultiCoHostResumeTracker", X1D.LIZIZ(LIZ2));
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null && (LJJZZI2 = LJJIJL.LJJZZI()) != null) {
            LJJZZI2.LJJJJJ(LJJLIIIIJ);
        }
        InterfaceC75441TjB LJJIJL2 = C8E.LIZLLL().LJJIJL();
        if (LJJIJL2 != null && (LJJZZI = LJJIJL2.LJJZZI()) != null) {
            LJJZZI.LJJJJL(new LinkedHashMap(), C113554cx.LJJLIIIIJ(new OSZ(statics.LJLILLLLZI, new JSONObject())));
        }
    }
}
