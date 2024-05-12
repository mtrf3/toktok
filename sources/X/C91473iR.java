package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3iR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91473iR implements InterfaceC91483iS {
    public final C98803uG LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C91473iR) && o.LJ(this.LIZ, ((C91473iR) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Instance(reportParams=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC91483iS
    public final C98803uG LIZ() {
        return this.LIZ;
    }

    public C91473iR(C98803uG c98803uG) {
        this.LIZ = c98803uG;
    }
}
