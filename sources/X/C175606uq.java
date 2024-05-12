package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175606uq extends AbstractC175546uk {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final java.util.Set<String> LIZLLL;
    public final java.util.Set<String> LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175606uq)) {
            return false;
        }
        C175606uq c175606uq = (C175606uq) obj;
        return this.LIZ == c175606uq.LIZ && this.LIZIZ == c175606uq.LIZIZ && this.LIZJ == c175606uq.LIZJ && o.LJ(this.LIZLLL, c175606uq.LIZLLL) && o.LJ(this.LJ, c175606uq.LJ) && this.LJFF == c175606uq.LJFF;
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
        return HXX.LIZ(this.LJ, HXX.LIZ(this.LIZLLL, ((((r0 * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31, 31), 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ValidateSuccess(isSingleVideoReplySelection=");
        LIZ.append(this.LIZ);
        LIZ.append(", numVideoRepliesSelected=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", selectCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cids=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", uids=");
        LIZ.append(this.LJ);
        LIZ.append(", videoReplyNumber=");
        return b0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C175606uq(boolean z, int i, int i2, java.util.Set<String> cids, java.util.Set<String> uids, int i3) {
        o.LJIIIZ(cids, "cids");
        o.LJIIIZ(uids, "uids");
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = cids;
        this.LJ = uids;
        this.LJFF = i3;
    }
}
