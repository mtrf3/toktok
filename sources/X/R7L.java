package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R7L extends AbstractC66965QPx<C69025R7d> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public String LJII;
    public JSONObject LJIIIIZZ;

    @Override // X.AbstractC66965QPx
    public final void LJ(C69025R7d c69025R7d) {
        String str;
        if (!TextUtils.isEmpty(c69025R7d.LIZJ)) {
            if (c69025R7d.LIZJ.contains(C77412UZs.LJIJJLI("/passport/mobile/check_code/"))) {
                str = "passport_mobile_check_code";
            } else {
                str = "passport_email_check_code";
            }
            C79146V4k.LJJJLZIJ(str, null, null, c69025R7d, this.LJ);
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII = jSONObject2.optString("ticket");
        this.LJIIIIZZ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final C69025R7d LJIIJ(boolean z, QQ4 qq4) {
        C69025R7d c69025R7d = new C69025R7d(z);
        if (z) {
            c69025R7d.LJIIIZ = this.LJII;
        } else {
            c69025R7d.LIZLLL = qq4.LIZIZ;
            c69025R7d.LJFF = qq4.LIZJ;
        }
        c69025R7d.LJII = this.LJIIIIZZ;
        return c69025R7d;
    }

    public R7L(Context context, QQ1 qq1, AbstractC68940R3w abstractC68940R3w) {
        super(context, qq1, abstractC68940R3w);
    }
}
