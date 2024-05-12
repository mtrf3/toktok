package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCU implements InterfaceC64103PDv {
    public final /* synthetic */ PCT LJLIL;

    @Override // X.InterfaceC64103PDv
    public final void LIZ() {
    }

    public PCU(PCT pct) {
        this.LJLIL = pct;
    }

    @Override // X.InterfaceC64103PDv
    public final void LJ(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onRefresh:");
                LIZ.append(z);
                LIZ.append(" ");
                LIZ.append(jSONObject);
                C64028PAy.LIZ("APM-Config", X1D.LIZIZ(LIZ));
            }
            if (PC5.LJJIIZ() && this.LJLIL.LIZJ != null && z) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            this.LJLIL.LJI = new PCV(this, jSONObject2, z);
            C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZJ(this.LJLIL.LJI);
        } catch (Exception unused) {
        }
    }
}
