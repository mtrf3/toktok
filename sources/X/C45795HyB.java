package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HyB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45795HyB implements InterfaceC140135ej {
    @Override // X.InterfaceC140135ej
    public final void LIZ(double d, String str, boolean z) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", d);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("methodName", str);
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        c6bk.LIZ.put("is_nle", str2);
        C43882HKc.LIZ.LJIILIIL("nle_method_cost", jSONObject, c6bk.LJ());
    }
}
