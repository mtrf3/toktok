package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7P extends AbstractC66965QPx<R40<R7Z>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R7Z LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7Z> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_login_continue", "mobile", "login_continue", r40, this.LJ);
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
    public final R40<R7Z> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1022, this.LJII);
    }

    public R7P(Context context, QQ1 qq1, R7Z r7z, R83 r83) {
        super(context, qq1, r83);
        this.LJII = r7z;
    }
}
