package X;

import kotlin.jvm.internal.o;

/* renamed from: X.99Z, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C99Z implements InterfaceC198557ql {
    public final C43I<Integer> LIZ;

    public C99Z() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C99Z) && o.LJ(this.LIZ, ((C99Z) obj).LIZ);
    }

    public final int hashCode() {
        C43I<Integer> c43i = this.LIZ;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileAdvancedFeatureData(mobShowFeatureId=");
        return C61845OOz.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C99Z(C43I<Integer> c43i) {
        this.LIZ = c43i;
    }
}
