package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7R extends AbstractC66965QPx<R40<C69024R7c>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69024R7c LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69024R7c> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_set_password", "mobile", null, r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<C69024R7c> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 10002, this.LJII);
    }

    public R7R(Context context, QQ1 qq1, C69024R7c c69024R7c, AbstractC69028R7g abstractC69028R7g) {
        super(context, qq1, abstractC69028R7g);
        this.LJII = c69024R7c;
    }
}
