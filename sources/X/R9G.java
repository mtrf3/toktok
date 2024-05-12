package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9G extends AbstractC66965QPx<R40<R9Z>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R9Z LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R9Z> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_bind", "mobile", null, r40, this.LJ);
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
    public final R40<R9Z> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        return new R40<>(z, 1012, this.LJII);
    }

    public R9G(Context context, QQ1 qq1, R9Z r9z, R9K r9k) {
        super(context, qq1, r9k);
        this.LJII = r9z;
    }
}
