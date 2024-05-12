package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9Fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C233919Fz {
    public final boolean LIZ;
    public final String LIZIZ;

    public C233919Fz() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C233919Fz)) {
            return false;
        }
        C233919Fz c233919Fz = (C233919Fz) obj;
        return this.LIZ == c233919Fz.LIZ && o.LJ(this.LIZIZ, c233919Fz.LIZIZ);
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
        LIZ.append("GatekeeperEligibilityState(isEligible=");
        LIZ.append(this.LIZ);
        LIZ.append(", currBlockingTaskName=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C233919Fz(boolean z, int i) {
        this((i & 1) != 0 ? true : z, (String) null);
    }

    public C233919Fz(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
