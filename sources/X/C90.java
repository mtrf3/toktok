package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C90 {
    public final boolean LIZ;
    public final String LIZIZ;

    public C90() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90)) {
            return false;
        }
        C90 c90 = (C90) obj;
        return this.LIZ == c90.LIZ && o.LJ(this.LIZIZ, c90.LIZIZ);
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
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscriptionGoalState(hasOnGoingGoal=");
        LIZ.append(this.LIZ);
        LIZ.append(", goalId=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C90(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
