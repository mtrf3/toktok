package X;

import org.json.JSONObject;

/* renamed from: X.IfG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47170IfG {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LIZ = jSONObject.optInt("sub_id");
        this.LIZIZ = jSONObject.optInt("language_id");
        jSONObject.optString("format");
        this.LIZJ = jSONObject.optString("version");
    }
}
