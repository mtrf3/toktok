package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R6U extends AbstractC66965QPx<R6R> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C68996R6a LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R6R r6r) {
        String str;
        if (!TextUtils.isEmpty(r6r.LIZJ)) {
            if (r6r.LIZJ.contains(C78939UyV.LIZIZ("/passport/auth/bind_with_mobile_login/"))) {
                str = "passport_auth_bind_with_mobile_login_click";
            } else if (r6r.LIZJ.contains(C78939UyV.LIZIZ("/passport/auth/share_login/"))) {
                str = "passport_auth_share_login";
            } else {
                str = "passport_oauth_login_click";
            }
            C79146V4k.LJJJLZIJ(str, this.LIZJ.LIZ("platform"), "login", r6r, this.LJ);
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6S.LIZIZ(this.LJII, jSONObject);
        C68996R6a c68996R6a = this.LJII;
        c68996R6a.LJIIIIZZ = jSONObject2;
        if (jSONObject != null) {
            c68996R6a.LIZJ = jSONObject.optString("profile_key");
            C68996R6a c68996R6a2 = this.LJII;
            jSONObject.optString("shark_ticket");
            c68996R6a2.getClass();
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C68996R6a c68996R6a = this.LJII;
        QTX qtx = new QTX(jSONObject);
        qtx.LIZ();
        c68996R6a.LJ = qtx;
        this.LJII.LJIIIIZZ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R6R LJIIJ(boolean z, QQ4 qq4) {
        R6R r6r = new R6R(z, 1);
        if (z) {
            r6r.LJIIIZ = this.LJII.LJ;
        } else {
            C68996R6a c68996R6a = this.LJII;
            r6r.LIZLLL = c68996R6a.LIZ;
            r6r.LJFF = c68996R6a.LIZIZ;
            r6r.LJIILIIL = c68996R6a.LIZJ;
        }
        r6r.LJII = this.LJII.LJIIIIZZ;
        return r6r;
    }

    public R6U(Context context, QQ1 qq1, R6C r6c) {
        super(context, qq1, r6c);
        this.LJII = new C68996R6a();
    }
}
