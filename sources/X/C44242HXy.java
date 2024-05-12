package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HXy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44242HXy extends HY8 {
    public final Effect LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44242HXy) && o.LJ(this.LIZ, ((C44242HXy) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        if (effect != null) {
            return effect.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Show(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C44242HXy(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
    }
}
