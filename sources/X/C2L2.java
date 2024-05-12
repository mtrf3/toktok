package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2L2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2L2 {
    public final C76800UCe LIZ;

    public C2L2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2L2) && o.LJ(this.LIZ, ((C2L2) obj).LIZ);
    }

    public final int hashCode() {
        C76800UCe c76800UCe = this.LIZ;
        if (c76800UCe == null) {
            return 0;
        }
        return c76800UCe.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackPanelStates(uiState=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C2L2(int i) {
        this.LIZ = null;
    }
}
