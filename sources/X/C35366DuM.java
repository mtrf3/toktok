package X;

import kotlin.jvm.internal.o;

/* renamed from: X.DuM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35366DuM {
    public final boolean LIZ;
    public final InterfaceC65350Pko<?> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35366DuM)) {
            return false;
        }
        C35366DuM c35366DuM = (C35366DuM) obj;
        return this.LIZ == c35366DuM.LIZ && o.LJ(this.LIZIZ, c35366DuM.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        InterfaceC65350Pko<?> interfaceC65350Pko = this.LIZIZ;
        return i + (interfaceC65350Pko == null ? 0 : interfaceC65350Pko.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IconAttr(rtl=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconClass=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C35366DuM(boolean z, C65776Prg c65776Prg) {
        this.LIZ = z;
        this.LIZIZ = c65776Prg;
    }
}
