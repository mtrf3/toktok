package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class INV {
    public final InterfaceC58973NCn LIZ;

    public INV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof INV) && o.LJ(this.LIZ, ((INV) obj).LIZ);
    }

    public final int hashCode() {
        InterfaceC58973NCn interfaceC58973NCn = this.LIZ;
        if (interfaceC58973NCn == null) {
            return 0;
        }
        return interfaceC58973NCn.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleOtherDelegate(anoleSeachDelegate=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public INV(InterfaceC58973NCn interfaceC58973NCn) {
        this.LIZ = interfaceC58973NCn;
    }
}
