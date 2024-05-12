package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9M extends AbstractC66965QPx<R40<C69078R9e>> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69078R9e LJII;

    @Override // X.AbstractC66965QPx
    public final void LJ(R40<C69078R9e> r40) {
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZJ(this.LJII, jSONObject);
        this.LJII.LJ = jSONObject2;
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject data) {
        o.LJIIIZ(data, "data");
        C69078R9e c69078R9e = this.LJII;
        c69078R9e.LJ = jSONObject;
        c69078R9e.LJI = JSONObjectProtectorUtils.getBoolean(data, "is_registered");
    }

    @Override // X.AbstractC66965QPx
    public final R40<C69078R9e> LJIIJ(boolean z, QQ4 qq4) {
        return new R40<>(z, 1008, this.LJII);
    }

    public R9M(Context context, QQ1 qq1, C69078R9e c69078R9e, R9L r9l) {
        super(context, qq1, r9l);
        this.LJII = c69078R9e;
    }
}
