package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70142p8 implements InterfaceC70192pD {
    public final C109544Rq LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C70142p8) && o.LJ(this.LIZ, ((C70142p8) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Received(msg=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C70142p8(C109544Rq c109544Rq) {
        this.LIZ = c109544Rq;
    }
}
