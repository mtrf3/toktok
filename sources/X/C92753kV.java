package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92753kV extends AbstractC92763kW {
    public final Object LIZ;

    public C92753kV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C92753kV) && o.LJ(this.LIZ, ((C92753kV) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GenericException(exception=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C92753kV(Object obj) {
        this.LIZ = obj;
    }
}
