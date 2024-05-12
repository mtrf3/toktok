package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FoC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40080FoC extends OF9 {
    public static final C40080FoC LIZ = new C40080FoC();

    @Override // X.OF9
    public final boolean LIZ(C40083FoF c40083FoF) {
        if (!o.LJ(c40083FoF.LIZIZ("ev_type"), "custom")) {
            return false;
        }
        String valueOf = String.valueOf(c40083FoF.LIZLLL("client_extra.event_name", ""));
        JSONObject jSONObject = new JSONObject();
        C40082FoE.LJII(jSONObject, c40083FoF.LIZIZ("client_category"), c40083FoF.LIZIZ("client_metric"), OF9.LIZIZ(c40083FoF));
        C40082FoE.LJIIJJI(jSONObject, C40082FoE.LIZ);
        OF9.LIZLLL(valueOf, jSONObject);
        return true;
    }
}
