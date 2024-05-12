package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9R extends AbstractC66965QPx<R40<R9X>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R9X LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R9X> r40) {
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject data, JSONObject jSONObject) {
        o.LJIIIZ(data, "data");
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LJII.LJ = jSONObject;
    }

    @Override // X.AbstractC66965QPx
    public final R40<R9X> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        R9X r9x = this.LJII;
        r9x.LIZ = response.LIZIZ;
        r9x.LIZJ = response.LIZJ;
        return new R40<>(z, 1009, r9x);
    }

    public R9R(Context context, QQ1 qq1, R9X r9x, R9I r9i) {
        super(context, qq1, r9i);
        this.LJII = r9x;
    }
}
