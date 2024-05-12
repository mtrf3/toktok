package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R4U extends AbstractC66965QPx<R4V> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public R4V LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R4V r4v) {
        C79146V4k.LJJJLZIJ("passport_account_info", null, null, r4v, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R4V r4v = new R4V(false);
        this.LJII = r4v;
        r4v.LJII = jSONObject2;
        if (jSONObject.has("name")) {
            this.LJII.LJIILJJIL = jSONObject.optString("name");
        } else {
            if (!jSONObject.has("error_name")) {
                return;
            }
            this.LJII.LJIILJJIL = jSONObject.optString("error_name");
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        R4V r4v = new R4V(true);
        this.LJII = r4v;
        r4v.LJII = jSONObject;
        r4v.LJIIIZ = R6S.LIZJ(jSONObject, jSONObject2);
    }

    @Override // X.AbstractC66965QPx
    public final R4V LJIIJ(boolean z, QQ4 qq4) {
        R4V r4v = this.LJII;
        if (r4v == null) {
            r4v = new R4V(z);
        } else {
            r4v.LIZIZ = z;
        }
        if (!z) {
            r4v.LIZLLL = qq4.LIZIZ;
            r4v.LJFF = qq4.LIZJ;
        }
        return r4v;
    }

    public R4U(Context context, QQ1 qq1, AbstractC68941R3x abstractC68941R3x) {
        super(context, qq1, abstractC68941R3x);
    }
}
