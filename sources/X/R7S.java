package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7S extends AbstractC66965QPx<C69026R7e> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public C69026R7e LJII;

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // X.AbstractC66965QPx
    public final void LJ(C69026R7e c69026R7e) {
        C79146V4k.LJJJLZIJ("passport_check_password", null, null, c69026R7e, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII = new C69026R7e(true);
        jSONObject2.optString("captcha");
    }

    @Override // X.AbstractC66965QPx
    public final C69026R7e LJIIJ(boolean z, QQ4 qq4) {
        C69026R7e c69026R7e = this.LJII;
        if (c69026R7e == null) {
            c69026R7e = new C69026R7e(z);
        } else {
            c69026R7e.LIZIZ = z;
        }
        if (!z) {
            c69026R7e.LIZLLL = qq4.LIZIZ;
            c69026R7e.LJFF = qq4.LIZJ;
        }
        return c69026R7e;
    }

    public R7S(Context context, QQ1 qq1, R8A r8a) {
        super(context, qq1, r8a);
    }
}
