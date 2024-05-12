package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7M extends AbstractC66965QPx<R40<R7X>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R7X LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7X> r40) {
        C79146V4k.LJJJLZIJ("passport_email_check_register", "email", this.LIZJ.LIZ("type"), r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJII = jSONObject2.optInt("is_registered");
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R7X> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1026, this.LJII);
    }

    public R7M(Context context, QQ1 qq1, R7X r7x, R8H r8h) {
        super(context, qq1, r8h);
        this.LJII = r7x;
    }
}
