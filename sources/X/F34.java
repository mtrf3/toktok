package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F34 implements K1E {
    @Override // X.K1E
    public final void LIZ(String str, JSONObject jSONObject) {
        try {
            C09900aA.LJI(str, null, null, jSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("apm upload: ");
            LIZ.append(str);
            C82519Wa3.LIZLLL("WebViewMonitorDefault", X1D.LIZIZ(LIZ));
        } catch (Throwable unused) {
            C70657RoD.LJIILL();
        }
    }
}
