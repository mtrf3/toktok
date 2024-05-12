package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R79 extends AbstractC66965QPx<R40<R7E>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R7E LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7E> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_sendcode", "mobile", this.LIZJ.LIZ("type"), r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        R7E r7e = this.LJII;
        if (jSONObject2 != null) {
            jSONObject2.optInt("retry_time", 30);
        }
        r7e.getClass();
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R7E> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1002, this.LJII);
    }

    public R79(Context context, QQ1 qq1, R7E r7e, R86 r86) {
        super(context, qq1, r86);
        this.LJII = r7e;
    }
}
