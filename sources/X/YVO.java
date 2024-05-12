package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YVO<STATE, EVENT, SIDE_EFFECT> extends YVQ<STATE, EVENT, SIDE_EFFECT> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YVO)) {
            return false;
        }
        obj.getClass();
        return o.LJ(null, null) && o.LJ(null, null) && o.LJ(null, null) && o.LJ(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Valid(fromState=");
        LIZ.append((Object) null);
        LIZ.append(", event=");
        LIZ.append((Object) null);
        LIZ.append(", toState=");
        LIZ.append((Object) null);
        LIZ.append(", sideEffect=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
