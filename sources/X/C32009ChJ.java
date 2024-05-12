package X;

import org.json.JSONObject;

/* renamed from: X.ChJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32009ChJ implements InterfaceC38012Evw {
    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        JSONObject optJSONObject = c38048EwW.LIZLLL.optJSONObject("args");
        int i = 0;
        if (optJSONObject != null) {
            str = optJSONObject.optString("charge_reason");
            str2 = optJSONObject.optString("gift_enter_from");
            str3 = optJSONObject.optString("notification_type");
            i = optJSONObject.optInt("lack_diamond_count", 0);
        } else {
            str = "";
            str2 = "";
            str3 = "";
        }
        C32010ChK c32010ChK = new C32010ChK();
        c32010ChK.LIZ = str;
        c32010ChK.LIZIZ = i;
        c32010ChK.LIZJ = str2;
        c32010ChK.LIZLLL = str3;
        C73943T0h.LIZ().LIZIZ(c32010ChK);
        jSONObject.put("code", 1);
    }
}
