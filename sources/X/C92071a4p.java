package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a4p, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92071a4p {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92071a4p)) {
            return false;
        }
        C92071a4p c92071a4p = (C92071a4p) obj;
        return this.LIZ == c92071a4p.LIZ && o.LJ(this.LIZIZ, c92071a4p.LIZIZ) && this.LIZJ == c92071a4p.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinRegexCheckResult(result=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", index=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92071a4p(boolean z, String str, int i) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
