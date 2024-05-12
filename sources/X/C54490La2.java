package X;

import kotlin.jvm.internal.o;

/* renamed from: X.La2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54490La2 {
    public final boolean LIZ;
    public final C54503LaF LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54490La2)) {
            return false;
        }
        C54490La2 c54490La2 = (C54490La2) obj;
        return this.LIZ == c54490La2.LIZ && o.LJ(this.LIZIZ, c54490La2.LIZIZ);
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
        C54503LaF c54503LaF = this.LIZIZ;
        return i + (c54503LaF == null ? 0 : c54503LaF.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsEmptyPageItemBound(isBound=");
        LIZ.append(this.LIZ);
        LIZ.append(", item=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C54490La2(boolean z, C54503LaF c54503LaF) {
        this.LIZ = z;
        this.LIZIZ = c54503LaF;
    }
}
