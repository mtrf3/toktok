package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FBW implements InterfaceC37120EhY {
    public final /* synthetic */ FBV LIZ;

    public FBW(FBV fbv) {
        this.LIZ = fbv;
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZ(JSONObject jSONObject) {
        this.LIZ.finishWithResult(jSONObject);
    }

    @Override // X.InterfaceC37120EhY
    public final void onError(int i, String str) {
        this.LIZ.finishWithFailure();
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZIZ(int i, String str, JSONObject jSONObject) {
        this.LIZ.finishWithFailure();
    }
}
