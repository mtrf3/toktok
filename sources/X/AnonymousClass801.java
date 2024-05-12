package X;

import kotlin.jvm.internal.o;

/* renamed from: X.801, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass801 {
    public final boolean LIZ;
    public final Float LIZIZ;
    public final boolean LIZJ;

    public AnonymousClass801() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass801)) {
            return false;
        }
        AnonymousClass801 anonymousClass801 = (AnonymousClass801) obj;
        return this.LIZ == anonymousClass801.LIZ && o.LJ(this.LIZIZ, anonymousClass801.LIZIZ) && this.LIZJ == anonymousClass801.LIZJ;
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
        Float f = this.LIZIZ;
        return ((i + (f == null ? 0 : f.hashCode())) * 31) + (this.LIZJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareContainerState(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", alpha=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enabled=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ AnonymousClass801(int i) {
        this(true, null, true);
    }

    public AnonymousClass801(boolean z, Float f, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = z2;
    }
}
