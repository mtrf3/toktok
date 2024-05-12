package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R6X extends AbstractC66965QPx<R6R> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C68998R6c LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R6R r6r) {
        C79146V4k.LJJJLZIJ("2_user_info", this.LIZJ.LIZ("platform"), null, r6r, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6S.LIZIZ(this.LJII, jSONObject);
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C68998R6c c68998R6c = this.LJII;
        QTX qtx = new QTX(jSONObject);
        qtx.LIZ();
        c68998R6c.LJ = qtx;
    }

    @Override // X.AbstractC66965QPx
    public final R6R LJIIJ(boolean z, QQ4 qq4) {
        R6R LIZ = R6S.LIZ(this.LJII, z);
        if (z) {
            LIZ.LJIIIZ = this.LJII.LJ;
        } else {
            C68998R6c c68998R6c = this.LJII;
            LIZ.LIZLLL = c68998R6c.LIZ;
            LIZ.LJFF = c68998R6c.LIZIZ;
        }
        return LIZ;
    }

    public R6X(Context context, QQ1 qq1, R6G r6g) {
        super(context, qq1, r6g);
        this.LJII = new C68998R6c();
    }
}
