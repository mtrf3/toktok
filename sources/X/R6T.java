package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R6T extends AbstractC66965QPx<R6R> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R6Z LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R6R r6r) {
        String str;
        if (!TextUtils.isEmpty(r6r.LIZJ)) {
            if (r6r.LIZJ.contains(C78939UyV.LIZIZ("/passport/auth/bind_with_mobile/"))) {
                str = "passport_oauth_bind_with_mobile_click";
            } else {
                str = "passport_oauth_bind_click";
            }
            C79146V4k.LJJJLZIJ(str, this.LIZJ.LIZ("platform"), "auth_bind", r6r, this.LJ);
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6S.LIZIZ(this.LJII, jSONObject);
        R6Z r6z = this.LJII;
        r6z.LJIIIIZZ = jSONObject2;
        if (jSONObject != null) {
            r6z.LIZJ = jSONObject.optString("profile_key");
            R6Z r6z2 = this.LJII;
            jSONObject.optString("shark_ticket");
            r6z2.getClass();
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        R6Z r6z = this.LJII;
        QTX qtx = new QTX(jSONObject);
        qtx.LIZ();
        r6z.LJ = qtx;
        this.LJII.LJIIIIZZ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R6R LJIIJ(boolean z, QQ4 qq4) {
        R6R LIZ = R6S.LIZ(this.LJII, z);
        if (z) {
            LIZ.LJIIIZ = this.LJII.LJ;
        } else {
            R6Z r6z = this.LJII;
            LIZ.LIZLLL = r6z.LIZ;
            LIZ.LJFF = r6z.LIZIZ;
            LIZ.LJIILIIL = r6z.LIZJ;
        }
        LIZ.LJII = this.LJII.LJIIIIZZ;
        return LIZ;
    }

    public R6T(Context context, QQ1 qq1, QQE<R6R> qqe) {
        super(context, qq1, qqe);
        this.LJII = new R6Z();
    }
}
