package X;

import Y.IDRunnableS4S1100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GXS implements GXQ {
    @Override // X.GXQ
    public final boolean LIZ(String eventName, java.util.Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        if (!C09590Zf.LJIILLIIL.LIZIZ()) {
            return false;
        }
        C1FP.LJLIL.execute(new IDRunnableS4S1100000(map, eventName, 1));
        return false;
    }

    @Override // X.GXQ
    public final boolean LIZIZ(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        if (!C09590Zf.LJIILLIIL.LIZIZ()) {
            return false;
        }
        C1FP.LJLIL.execute(new IDRunnableS4S1100000(jSONObject, eventName, 0));
        return false;
    }
}
