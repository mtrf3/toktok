package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YVN<STATE, SIDE_EFFECT> {
    public final STATE LIZ;
    public final SIDE_EFFECT LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YVN)) {
            return false;
        }
        YVN yvn = (YVN) obj;
        return o.LJ(this.LIZ, yvn.LIZ) && o.LJ(this.LIZIZ, yvn.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        SIDE_EFFECT side_effect = this.LIZIZ;
        return hashCode + (side_effect == null ? 0 : side_effect.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransitionTo(toState=");
        LIZ.append(this.LIZ);
        LIZ.append(", sideEffect=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YVN(YVS toState, YVR yvr) {
        o.LJIIIZ(toState, "toState");
        this.LIZ = toState;
        this.LIZIZ = yvr;
    }
}
