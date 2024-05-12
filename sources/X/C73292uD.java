package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2uD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73292uD {
    public final InterfaceC65784Pro<C76800UCe> LIZ;

    public C73292uD() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C73292uD) && o.LJ(this.LIZ, ((C73292uD) obj).LIZ);
    }

    public final int hashCode() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro == null) {
            return 0;
        }
        return interfaceC65784Pro.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AICaptionAction(onAICaptionRetryClick=");
        return C06540Nm.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C73292uD(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
    }
}
