package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9H extends AbstractC66965QPx<R40<R9Z>> {
    public final R9Z LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R9Z> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_bind", "mobile", null, r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJFF = R6S.LIZJ(jSONObject, jSONObject2);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R9Z> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1012, this.LJII);
    }

    public R9H(Context context, QQ1 qq1, R9Z r9z, R9K r9k) {
        super(context, qq1, r9k);
        this.LJII = r9z;
    }
}
