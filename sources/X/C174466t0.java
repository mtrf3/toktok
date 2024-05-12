package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6t0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174466t0 {
    public int LIZ = 0;
    public int LIZIZ = -1;
    public C174496t3 LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C174466t0)) {
            return false;
        }
        C174466t0 c174466t0 = (C174466t0) obj;
        return this.LIZ == c174466t0.LIZ && this.LIZIZ == c174466t0.LIZIZ && o.LJ(this.LIZJ, c174466t0.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        C174496t3 c174496t3 = this.LIZJ;
        return i + (c174496t3 == null ? 0 : c174496t3.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentUpvoteListInfo(startIndex=");
        LIZ.append(this.LIZ);
        LIZ.append(", endIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", moreBtnStruct=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int LIZ() {
        return (this.LIZIZ - this.LIZ) + 1;
    }
}
