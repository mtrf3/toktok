package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Dyq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35644Dyq implements C33Q {
    public Boolean LJLIL;

    public C35644Dyq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35644Dyq) && o.LJ(this.LJLIL, ((C35644Dyq) obj).LJLIL);
    }

    public final int hashCode() {
        Boolean bool = this.LJLIL;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsNonPersonalizedState(triggerNP=");
        return C78920UyC.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C35644Dyq(Boolean bool) {
        this.LJLIL = bool;
    }
}
