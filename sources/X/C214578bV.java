package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214578bV {
    public final boolean LIZ;
    public final InterfaceC65350Pko<?> LIZIZ;
    public final boolean LIZJ;

    public /* synthetic */ C214578bV() {
        this(false, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C214578bV)) {
            return false;
        }
        C214578bV c214578bV = (C214578bV) obj;
        if (this.LIZ != c214578bV.LIZ || !o.LJ(this.LIZIZ, c214578bV.LIZIZ)) {
            return false;
        }
        c214578bV.getClass();
        return o.LJ(null, null) && this.LIZJ == c214578bV.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        InterfaceC65350Pko<?> interfaceC65350Pko = this.LIZIZ;
        return ((i + (interfaceC65350Pko == null ? 0 : interfaceC65350Pko.hashCode())) * 31 * 31) + (this.LIZJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KeyInfo(required=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", schema=");
        LIZ.append((Object) null);
        LIZ.append(", isAdExtra=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C214578bV(boolean z, InterfaceC65350Pko<?> interfaceC65350Pko, InterfaceC214558bT interfaceC214558bT, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = interfaceC65350Pko;
        this.LIZJ = z2;
    }
}
