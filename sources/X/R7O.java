package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7O extends AbstractC66965QPx<R40<R7V>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R7V LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7V> r40) {
        C79146V4k.LJJJLZIJ("passport_email_register", "email", null, r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJIIIZ = R6S.LIZJ(jSONObject, jSONObject2);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R7V> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1009, this.LJII);
    }

    public R7O(Context context, QQ1 qq1, R7V r7v, R82 r82) {
        super(context, qq1, r82);
        this.LJII = r7v;
    }
}
