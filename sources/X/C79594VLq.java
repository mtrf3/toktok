package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.VLq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79594VLq {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79594VLq)) {
            return false;
        }
        C79594VLq c79594VLq = (C79594VLq) obj;
        return this.LIZ == c79594VLq.LIZ && o.LJ(this.LIZIZ, c79594VLq.LIZIZ);
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
        LIZ.append("MixNamePowerData(btnAble=");
        LIZ.append(this.LIZ);
        LIZ.append(", mixName=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C79594VLq(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
