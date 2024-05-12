package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7Q extends AbstractC66965QPx<R40<C69023R7b>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69023R7b LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69023R7b> r40) {
        C79146V4k.LJJJLZIJ("passport_account_register", null, null, r40, this.LJ);
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
    public final R40<C69023R7b> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1023, this.LJII);
    }

    public R7Q(Context context, QQ1 qq1, C69023R7b c69023R7b, C69047R7z c69047R7z) {
        super(context, qq1, c69047R7z);
        this.LJII = c69023R7b;
    }
}
