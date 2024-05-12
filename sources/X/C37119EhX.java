package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EhX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37119EhX implements InterfaceC37146Ehy {
    public final /* synthetic */ InterfaceC37120EhY LIZ;

    public C37119EhX(InterfaceC37120EhY interfaceC37120EhY) {
        this.LIZ = interfaceC37120EhY;
    }

    @Override // X.InterfaceC37146Ehy
    public final void LIZIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.LIZ.LIZ(jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.InterfaceC37146Ehy
    public final void onSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("data", obj);
            this.LIZ.LIZ(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC37146Ehy
    public final void LIZ(int i, String str) {
        InterfaceC37120EhY interfaceC37120EhY = this.LIZ;
        if (str == null) {
            str = "";
        }
        interfaceC37120EhY.onError(i, str);
    }

    @Override // X.InterfaceC37146Ehy
    public final void LIZJ(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            jSONObject.put("data", obj);
            this.LIZ.LIZ(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
