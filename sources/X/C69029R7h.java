package X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.R7h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69029R7h extends AbstractC66965QPx<C69030R7i> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public String LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(C69030R7i c69030R7i) {
        C79146V4k.LJJJLZIJ("passport_account_verify", null, null, c69030R7i, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.optString("captcha");
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII = jSONObject2.optString("ticket");
    }

    @Override // X.AbstractC66965QPx
    public final C69030R7i LJIIJ(boolean z, QQ4 qq4) {
        C69030R7i c69030R7i = new C69030R7i(z);
        if (z) {
            c69030R7i.LJIIIZ = this.LJII;
        } else {
            c69030R7i.LIZLLL = qq4.LIZIZ;
            c69030R7i.LJFF = qq4.LIZJ;
        }
        return c69030R7i;
    }

    public C69029R7h(Context context, QQ1 qq1, R8O r8o) {
        super(context, qq1, r8o);
    }
}
