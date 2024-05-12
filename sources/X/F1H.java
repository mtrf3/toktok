package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F1H implements F1M {
    public final /* synthetic */ InterfaceC37146Ehy LIZ;

    public F1H(InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LIZ = interfaceC37146Ehy;
    }

    @Override // X.F1M
    public final void LIZ(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("_raw"));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("response", jSONObject2);
        this.LIZ.onSuccess(jSONObject3);
    }
}
