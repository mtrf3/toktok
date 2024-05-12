package X;

import org.json.JSONObject;

/* renamed from: X.O8o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61418O8o {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareAdInfo{mTitle='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", mDescription='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", mImageUrl='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", mShareUrl='");
        return C77800Ug8.LIZJ(LIZ, this.LIZLLL, '\'', '}', LIZ);
    }

    public C61418O8o(JSONObject jSONObject) {
        this.LIZ = jSONObject.optString("share_title");
        this.LIZIZ = jSONObject.optString("share_desc");
        this.LIZJ = jSONObject.optString("share_icon");
        this.LIZLLL = jSONObject.optString("share_url");
    }
}
