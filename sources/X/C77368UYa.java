package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.UYa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77368UYa extends AbstractC77369UYb {
    public final Effect LIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C77368UYa) && o.LJ(this.LIZ, ((C77368UYa) obj).LIZ);
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
        LIZ.append("PlaceHolderEffect(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
