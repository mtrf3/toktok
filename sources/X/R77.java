package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R77 extends AbstractC66965QPx<R40<R7E>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R7E LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R7E> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_sendcode", "mobile", this.LIZJ.LIZ("type"), r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject data, JSONObject jSONObject) {
        o.LJIIIZ(data, "data");
        R6V.LIZJ(this.LJII, data);
        R7E r7e = this.LJII;
        if (r7e == null) {
            return;
        }
        r7e.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject data) {
        o.LJIIIZ(data, "data");
        if (this.LJII != null) {
            data.optInt("retry_time", 30);
        }
        R7E r7e = this.LJII;
        if (r7e == null) {
            return;
        }
        r7e.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R7E> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        return new R40<>(z, 1002, this.LJII);
    }

    public R77(Context context, QQ1 qq1, R7E r7e, R80 r80) {
        super(context, qq1, r80);
        this.LJII = r7e;
    }
}
