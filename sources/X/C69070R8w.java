package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R8w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69070R8w extends AbstractC66965QPx<R40<C69072R8y>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69072R8y LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69072R8y> r40) {
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
    public final R40<C69072R8y> LJIIJ(boolean z, QQ4 response) {
        o.LJIIIZ(response, "response");
        return new R40<>(z, 1010, this.LJII);
    }

    public C69070R8w(Context context, QQ1 qq1, C69072R8y c69072R8y, C69063R8p c69063R8p) {
        super(context, qq1, c69063R8p);
        this.LJII = c69072R8y;
    }
}
