package X;

import org.json.JSONObject;

/* renamed from: X.Jjv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50007Jjv {
    public final /* synthetic */ C37948Euu LIZ;

    public C50007Jjv(C37945Eur c37945Eur) {
        this.LIZ = c37945Eur;
    }

    public final void LIZ(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("msg", str);
        this.LIZ.LIZ(0, "failed", jSONObject);
    }
}
