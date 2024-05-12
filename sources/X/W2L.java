package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W2L extends W2O {
    public final Effect LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W2L) && o.LJ(this.LIZ, ((W2L) obj).LIZ);
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        if (effect == null) {
            return 0;
        }
        return effect.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LaunchReportEffect(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public W2L(Effect effect) {
        this.LIZ = effect;
    }
}
