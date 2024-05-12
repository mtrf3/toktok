package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aTM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93592aTM {
    public final boolean LIZ;
    public final EnumC93589aTJ LIZIZ;
    public final EnumC93589aTJ LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93592aTM)) {
            return false;
        }
        C93592aTM c93592aTM = (C93592aTM) obj;
        return this.LIZ == c93592aTM.LIZ && this.LIZIZ == c93592aTM.LIZIZ && this.LIZJ == c93592aTM.LIZJ;
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
        return (((r0 * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransitionResult(changed=");
        LIZ.append(this.LIZ);
        LIZ.append(", before=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", after=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C93592aTM(boolean z, EnumC93589aTJ before, EnumC93589aTJ after) {
        o.LJIIIZ(before, "before");
        o.LJIIIZ(after, "after");
        this.LIZ = z;
        this.LIZIZ = before;
        this.LIZJ = after;
    }
}
