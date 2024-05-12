package X;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R50 extends AbstractC66965QPx<R6R> {
    public static final /* synthetic */ int LJIIJ = 0;
    public QTX LJII;
    public final C68969R4z LJIIIIZZ;
    public JSONObject LJIIIZ;

    @Override // X.AbstractC66965QPx
    public final void LJ(R6R r6r) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!r6r.LIZIZ) {
                jSONObject.put("result", 0);
                jSONObject.put("errCode", r6r.LIZLLL);
                jSONObject.put("errDesc", r6r.LJFF);
            } else {
                jSONObject.put("result", 1);
            }
            C79146V4k.LJJJZ("passport_device_one_login", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZ(this.LJIIIIZZ, jSONObject);
        this.LJIIIZ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJII = R6S.LIZJ(jSONObject, jSONObject2);
        this.LJIIIZ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R6R LJIIJ(boolean z, QQ4 qq4) {
        R6R r6r = new R6R(z, 10037);
        if (z) {
            r6r.LJIIIZ = this.LJII;
        } else {
            C68969R4z c68969R4z = this.LJIIIIZZ;
            r6r.LIZLLL = c68969R4z.LIZ;
            r6r.LJFF = c68969R4z.LIZIZ;
            r6r.LJIILIIL = c68969R4z.LIZJ;
        }
        r6r.LJII = this.LJIIIZ;
        return r6r;
    }

    public R50(Context context, QQ1 qq1, C68939R3v c68939R3v) {
        super(context, qq1, c68939R3v);
        this.LJIIIIZZ = new C68969R4z();
    }
}
