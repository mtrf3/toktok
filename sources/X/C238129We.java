package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9We, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238129We {
    public final boolean LIZ;
    public final C9WC LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C238129We)) {
            return false;
        }
        C238129We c238129We = (C238129We) obj;
        return this.LIZ == c238129We.LIZ && this.LIZIZ == c238129We.LIZIZ && o.LJ(this.LIZJ, c238129We.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LIZIZ.hashCode() + (r0 * 31)) * 31;
        String str = this.LIZJ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NameSyncStatus(isSuccessful=");
        LIZ.append(this.LIZ);
        LIZ.append(", syncType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C238129We(C9WC c9wc) {
        this(true, c9wc, null);
    }

    public C238129We(boolean z, C9WC syncType, String str) {
        o.LJIIIZ(syncType, "syncType");
        this.LIZ = z;
        this.LIZIZ = syncType;
        this.LIZJ = str;
    }
}
