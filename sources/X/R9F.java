package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9F extends AbstractC66965QPx<R40<C69074R9a>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69074R9a LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69074R9a> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_login", "mobile", "login", r40, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject data, JSONObject jSONObject) {
        o.LJIIIZ(data, "data");
        R6V.LIZJ(this.LJII, data);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LJII.LJFF = R6S.LIZJ(jSONObject, data);
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<C69074R9a> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        return new R40<>(z, 1006, this.LJII);
    }

    public R9F(Context context, QQ1 qq1, C69074R9a c69074R9a, R9B r9b) {
        super(context, qq1, r9b);
        this.LJII = c69074R9a;
    }
}
