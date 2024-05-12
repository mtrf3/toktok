package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W2M extends W2O {
    public final EffectInfoPanelState LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W2M) && o.LJ(this.LIZ, ((W2M) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReloadEffectInfo(state=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public W2M(EffectInfoPanelState state) {
        o.LJIIIZ(state, "state");
        this.LIZ = state;
    }
}
