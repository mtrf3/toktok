package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7N extends AbstractC66965QPx<R40<R7W>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R7W LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7W> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_change", "mobile", null, r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJI = R6S.LIZJ(jSONObject, jSONObject2);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R7W> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1011, this.LJII);
    }

    public R7N(Context context, QQ1 qq1, R7W r7w, R8K r8k) {
        super(context, qq1, r8k);
        this.LJII = r7w;
    }
}
