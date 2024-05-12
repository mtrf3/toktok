package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7J extends AbstractC66965QPx<R40<C69022R7a>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69022R7a LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69022R7a> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_login_only", "mobile", "login_only", r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
        try {
            jSONObject.optString("sms_code_key");
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII.LJFF = R6S.LIZJ(jSONObject, jSONObject2);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<C69022R7a> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1021, this.LJII);
    }

    public R7J(Context context, QQ1 qq1, C69022R7a c69022R7a, R85 r85) {
        super(context, qq1, r85);
        this.LJII = c69022R7a;
    }
}
