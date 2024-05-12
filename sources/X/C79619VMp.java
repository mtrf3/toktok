package X;

import com.lynx.react.bridge.JavaOnlyMap;
import kotlin.jvm.internal.AqS161S0200000_14;
import org.json.JSONObject;

/* renamed from: X.VMp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79619VMp implements VNH {
    public final /* synthetic */ AqS161S0200000_14 LIZ;

    @Override // X.VNH
    public final void onFail() {
        VMC vmc = VMB.LJLLLL;
        AqS161S0200000_14 aqS161S0200000_14 = this.LIZ;
        vmc.LIZIZ((VNS) aqS161S0200000_14.l1, (VM4) aqS161S0200000_14.l0);
    }

    public C79619VMp(AqS161S0200000_14 aqS161S0200000_14) {
        this.LIZ = aqS161S0200000_14;
    }

    @Override // X.VNH
    public final void LIZ(JavaOnlyMap javaOnlyMap) {
        JSONObject jSONObject;
        VM4 vm4 = (VM4) this.LIZ.l0;
        if (javaOnlyMap != null) {
            jSONObject = javaOnlyMap.toJSONObject();
        } else {
            jSONObject = null;
        }
        vm4.LIZLLL(jSONObject, "state_info");
        VMC vmc = VMB.LJLLLL;
        AqS161S0200000_14 aqS161S0200000_14 = this.LIZ;
        vmc.LIZIZ((VNS) aqS161S0200000_14.l1, (VM4) aqS161S0200000_14.l0);
    }
}
