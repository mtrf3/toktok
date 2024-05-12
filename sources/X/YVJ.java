package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YVJ<STATE, EVENT, SIDE_EFFECT> {
    public final STATE LIZ;
    public final java.util.Map<YVG<STATE, STATE>, YVP<STATE, EVENT, SIDE_EFFECT>> LIZIZ;
    public final List<InterfaceC88472Yns<YVQ<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C76800UCe>> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YVJ)) {
            return false;
        }
        YVJ yvj = (YVJ) obj;
        return o.LJ(this.LIZ, yvj.LIZ) && o.LJ(this.LIZIZ, yvj.LIZIZ) && o.LJ(this.LIZJ, yvj.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C12400eC.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Graph(initialState=");
        LIZ.append(this.LIZ);
        LIZ.append(", stateDefinitions=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onTransitionListeners=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YVJ(STATE state, java.util.Map<YVG<STATE, STATE>, YVP<STATE, EVENT, SIDE_EFFECT>> map, List<? extends InterfaceC88472Yns<? super YVQ<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C76800UCe>> onTransitionListeners) {
        o.LJIIIZ(onTransitionListeners, "onTransitionListeners");
        this.LIZ = state;
        this.LIZIZ = map;
        this.LIZJ = onTransitionListeners;
    }
}
