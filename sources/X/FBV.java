package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FBV extends AbstractC38123Exj<JSONObject, JSONObject> {
    public final /* synthetic */ InterfaceC38186Eyk LJLIL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    public FBV(InterfaceC38186Eyk interfaceC38186Eyk) {
        this.LJLIL = interfaceC38186Eyk;
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        try {
            this.LJLIL.handle(jSONObject, new FBW(this));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
