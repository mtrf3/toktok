package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9E extends AbstractC66965QPx<R40<R9Y>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R9Y LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R9Y> r40) {
        C79146V4k.LJJJLZIJ("passport_account_login", null, null, r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject data, JSONObject jSONObject) {
        o.LJIIIZ(data, "data");
        R6V.LIZJ(this.LJII, data);
        R9Y r9y = this.LJII;
        if (r9y == null) {
            return;
        }
        r9y.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject data) {
        o.LJIIIZ(data, "data");
        R9Y r9y = this.LJII;
        if (r9y != null) {
            r9y.LJI = R6S.LIZJ(jSONObject, data);
        }
        R9Y r9y2 = this.LJII;
        if (r9y2 == null) {
            return;
        }
        r9y2.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R9Y> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        return new R40<>(z, 1016, this.LJII);
    }

    public R9E(Context context, QQ1 qq1, R9Y r9y, R98 r98) {
        super(context, qq1, r98);
        this.LJII = r9y;
    }
}
