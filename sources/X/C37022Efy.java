package X;

import org.json.JSONObject;

/* renamed from: X.Efy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37022Efy implements InterfaceC37025Eg1 {
    @Override // X.InterfaceC37025Eg1
    public final void LIZ(C37024Eg0 c37024Eg0) {
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_restrictive_rule");
        c79605VMb.LIZIZ = "restrictive_rule";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ruleId", c37024Eg0.LJLIL);
        jSONObject.put("url", c37024Eg0.LJLILLLLZI);
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LIZ = c37024Eg0.LJLILLLLZI;
        c79605VMb.LIZIZ(0);
        VMI.LJ.LJIILL(null, c79605VMb.LIZ());
    }
}
