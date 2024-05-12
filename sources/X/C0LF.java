package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.0LF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LF {
    public final String LIZ;
    public final Effect LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LF)) {
            return false;
        }
        C0LF c0lf = (C0LF) obj;
        return o.LJ(this.LIZ, c0lf.LIZ) && o.LJ(this.LIZIZ, c0lf.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Effect effect = this.LIZIZ;
        return hashCode + (effect == null ? 0 : effect.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NaviEffectWrapper(effectName=");
        LIZ.append(this.LIZ);
        LIZ.append(", effect=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C0LF(Effect effect, String effectName) {
        o.LJIIIZ(effectName, "effectName");
        this.LIZ = effectName;
        this.LIZIZ = effect;
    }
}
