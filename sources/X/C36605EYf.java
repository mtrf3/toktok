package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.EYf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36605EYf {
    public final boolean LIZ;
    public final byte[] LIZIZ;
    public final Throwable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36605EYf)) {
            return false;
        }
        C36605EYf c36605EYf = (C36605EYf) obj;
        return this.LIZ == c36605EYf.LIZ && o.LJ(this.LIZIZ, c36605EYf.LIZIZ) && o.LJ(this.LIZJ, c36605EYf.LIZJ);
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
        byte[] bArr = this.LIZIZ;
        int hashCode = (i + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Throwable th = this.LIZJ;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkResult(success=");
        LIZ.append(this.LIZ);
        LIZ.append(", bytes=");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append(", error=");
        return C169696lJ.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C36605EYf(boolean z, byte[] bArr, Throwable th) {
        this.LIZ = z;
        this.LIZIZ = bArr;
        this.LIZJ = th;
    }
}
