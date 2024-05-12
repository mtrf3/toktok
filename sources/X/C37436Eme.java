package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Eme, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37436Eme {
    public boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37436Eme)) {
            return false;
        }
        C37436Eme c37436Eme = (C37436Eme) obj;
        return this.LIZ == c37436Eme.LIZ && o.LJ(this.LIZIZ, c37436Eme.LIZIZ);
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
        String str = this.LIZIZ;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Record(once=");
        LIZ.append(this.LIZ);
        LIZ.append(", result=");
        return JBR.LJFF(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C37436Eme(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
