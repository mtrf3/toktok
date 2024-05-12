package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R6W extends AbstractC66965QPx<R6R> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C68997R6b LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R6R r6r) {
        C79146V4k.LJJJLZIJ("passport_auth_login_only", this.LIZJ.LIZ("platform"), null, r6r, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6S.LIZIZ(this.LJII, jSONObject);
        C68997R6b c68997R6b = this.LJII;
        c68997R6b.LJIIIIZZ = jSONObject2;
        if (jSONObject != null) {
            c68997R6b.LIZJ = jSONObject.optString("profile_key");
            C68997R6b c68997R6b2 = this.LJII;
            jSONObject.optString("shark_ticket");
            c68997R6b2.getClass();
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C68997R6b c68997R6b = this.LJII;
        QTX qtx = new QTX(jSONObject);
        qtx.LIZ();
        c68997R6b.LJ = qtx;
        this.LJII.LJIIIIZZ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R6R LJIIJ(boolean z, QQ4 qq4) {
        R6R r6r = new R6R(z, 1);
        if (z) {
            r6r.LJIIIZ = this.LJII.LJ;
        } else {
            C68997R6b c68997R6b = this.LJII;
            r6r.LJIILIIL = c68997R6b.LIZJ;
            r6r.LIZLLL = c68997R6b.LIZ;
            r6r.LJFF = c68997R6b.LIZIZ;
        }
        r6r.LJII = this.LJII.LJIIIIZZ;
        return r6r;
    }

    public R6W(Context context, QQ1 qq1, R6C r6c) {
        super(context, qq1, r6c);
        this.LJII = new C68997R6b();
    }
}
