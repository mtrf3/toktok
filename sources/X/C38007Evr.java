package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Evr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38007Evr implements InterfaceC38071Ewt {
    @Override // X.InterfaceC38071Ewt
    public final void LIZ(String str, JSONObject jSONObject) {
        if ("host".equals(str) && jSONObject != null) {
            C37876Etk.LIZJ("jsb_auth_on_host_config", new JSONObject());
            C37876Etk.LIZ("DEFAULT", "from_JSB2", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("content");
                if (optJSONObject != null) {
                    jSONObject2.put("content", optJSONObject.length());
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
