package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vys, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81510Vys extends AbstractC81511Vyt {
    public final List<Effect> LIZ;
    public final Effect LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81510Vys)) {
            return false;
        }
        C81510Vys c81510Vys = (C81510Vys) obj;
        return o.LJ(this.LIZ, c81510Vys.LIZ) && o.LJ(this.LIZIZ, c81510Vys.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Effect effect = this.LIZIZ;
        return hashCode + (effect == null ? 0 : effect.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success(allCategoryEffects=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultDuetLayout=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C81510Vys(Effect effect, List allCategoryEffects) {
        o.LJIIIZ(allCategoryEffects, "allCategoryEffects");
        this.LIZ = allCategoryEffects;
        this.LIZIZ = effect;
    }
}
