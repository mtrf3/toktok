package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IRX {
    public final boolean LIZ;
    public final Runnable LIZIZ;

    public IRX() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IRX)) {
            return false;
        }
        IRX irx = (IRX) obj;
        return this.LIZ == irx.LIZ && o.LJ(this.LIZIZ, irx.LIZIZ);
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
        Runnable runnable = this.LIZIZ;
        return i + (runnable == null ? 0 : runnable.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CoHostInProgressChangedEvent(isInProgress=");
        LIZ.append(this.LIZ);
        LIZ.append(", callback=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ IRX(int i) {
        this(null, false);
    }

    public IRX(Runnable runnable, boolean z) {
        this.LIZ = z;
        this.LIZIZ = runnable;
    }
}
