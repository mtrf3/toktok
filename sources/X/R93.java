package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R93 extends AbstractC66965QPx<R40<C69073R8z>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69073R8z LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69073R8z> r40) {
        C79146V4k.LJJJLZIJ("passport_mobile_change_password", "mobile", null, r40, this.LJ);
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
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<C69073R8z> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        return new R40<>(z, 1010, this.LJII);
    }

    public R93(Context context, QQ1 qq1, R94 r94, C69064R8q c69064R8q) {
        super(context, qq1, c69064R8q);
        this.LJII = r94;
    }
}
