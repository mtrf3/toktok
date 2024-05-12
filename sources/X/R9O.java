package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9O extends AbstractC66965QPx<R40<R9W>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final R9W LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<R9W> r40) {
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
    public final R40<R9W> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        R9W r9w = this.LJII;
        r9w.LIZ = response.LIZIZ;
        r9w.LIZJ = response.LIZJ;
        return new R40<>(z, 1009, r9w);
    }

    public R9O(Context context, QQ1 qq1, R9W r9w, R9J r9j) {
        super(context, qq1, r9j);
        this.LJII = r9w;
    }
}
