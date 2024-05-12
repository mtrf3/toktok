package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E8e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35928E8e {
    public final boolean LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C35928E8e() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35928E8e)) {
            return false;
        }
        C35928E8e c35928E8e = (C35928E8e) obj;
        return this.LIZ == c35928E8e.LIZ && o.LJ(this.LIZIZ, c35928E8e.LIZIZ);
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
        Object obj = this.LIZIZ;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendGiftInterceptorResult(reject=");
        LIZ.append(this.LIZ);
        LIZ.append(", extra=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35928E8e(Object obj, boolean z) {
        this.LIZ = z;
        this.LIZIZ = obj;
    }
}
