package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EPw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36388EPw extends AbstractC36384EPs {
    public final Integer LIZ;
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36388EPw)) {
            return false;
        }
        C36388EPw c36388EPw = (C36388EPw) obj;
        return o.LJ(this.LIZ, c36388EPw.LIZ) && o.LJ(this.LIZIZ, c36388EPw.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Throwable th = this.LIZIZ;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FailUploadEffect(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", e=");
        return C169696lJ.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C36388EPw(Integer num, Throwable th) {
        this.LIZ = num;
        this.LIZIZ = th;
    }
}
