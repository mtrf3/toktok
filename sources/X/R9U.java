package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9U extends AbstractC66965QPx<C69076R9c> {
    public String LJII;
    public boolean LJIIIIZZ;
    public JSONObject LJIIIZ;

    @Override // X.AbstractC66965QPx
    public final void LJ(C69076R9c c69076R9c) {
        C79146V4k.LJJJLZIJ("passport_shark_safe_verify", null, null, c69076R9c, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIZ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIZ = jSONObject;
        this.LJII = jSONObject2.optString("ticket");
        this.LJIIIIZZ = jSONObject2.optBoolean("safe");
    }

    @Override // X.AbstractC66965QPx
    public final C69076R9c LJIIJ(boolean z, QQ4 qq4) {
        C69076R9c c69076R9c = new C69076R9c(z);
        if (z) {
            c69076R9c.LJIIIZ = this.LJII;
            c69076R9c.LJIIJ = this.LJIIIIZZ;
        } else {
            c69076R9c.LIZLLL = qq4.LIZIZ;
            c69076R9c.LJFF = qq4.LIZJ;
        }
        c69076R9c.LJII = this.LJIIIZ;
        return c69076R9c;
    }

    public R9U(Context context, QQ1 qq1, AbstractC67056QTk abstractC67056QTk) {
        super(context, qq1, abstractC67056QTk);
    }
}
