package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.L6x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53731L6x implements P83 {
    @Override // X.P83
    public final void LIZ(String event, JSONObject jSONObject, String productType) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(productType, "productType");
        if (C48331Ixz.LIZ()) {
            int hashCode = event.hashCode();
            if (hashCode != -1749001661) {
                if (hashCode != -205564286) {
                    if (hashCode == -30478458 && event.equals("effect_event_init_display")) {
                        return;
                    }
                } else if (event.equals("effect_performance")) {
                    return;
                }
            } else if (event.equals("effect_event_load_model")) {
                return;
            }
        }
        FMX.LJIILJJIL(event, jSONObject);
    }
}
