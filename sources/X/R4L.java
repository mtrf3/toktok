package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R4L extends AbstractC66965QPx<R4I> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public QTX LJII;
    public JSONObject LJIIIIZZ;

    @Override // X.AbstractC66965QPx
    public final void LJ(R4I r4i) {
        C79146V4k.LJJJLZIJ("passport_account_switch", null, null, r4i, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject;
        this.LJII = R6S.LIZJ(jSONObject, jSONObject2);
    }

    @Override // X.AbstractC66965QPx
    public final R4I LJIIJ(boolean z, QQ4 qq4) {
        R4I r4i = new R4I(z);
        if (z) {
            r4i.LJIIIZ = this.LJII;
        } else {
            r4i.LIZLLL = qq4.LIZIZ;
            r4i.LJFF = qq4.LIZJ;
        }
        r4i.LJII = this.LJIIIIZZ;
        return r4i;
    }

    public R4L(Context context, QQ1 qq1, R4C r4c) {
        super(context, qq1, r4c);
    }
}
