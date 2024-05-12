package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6P {
    public final V75 LIZ;
    public final V7I LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6P)) {
            return false;
        }
        V6P v6p = (V6P) obj;
        return this.LIZ == v6p.LIZ && o.LJ(this.LIZIZ, v6p.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadingEvent(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", state=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public V6P(V75 type, V7I state) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(state, "state");
        this.LIZ = type;
        this.LIZIZ = state;
    }
}
