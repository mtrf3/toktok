package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QXU {
    public final long LIZ;
    public final EnumC66933QOr LIZIZ;
    public final EnumC66933QOr LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QXU)) {
            return false;
        }
        QXU qxu = (QXU) obj;
        return this.LIZ == qxu.LIZ && this.LIZIZ == qxu.LIZIZ && this.LIZJ == qxu.LIZJ && this.LIZLLL == qxu.LIZLLL && this.LJ == qxu.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31)) * 31)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + (this.LJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OutAppPushIntervalData(intervalInMillis=");
        LIZ.append(this.LIZ);
        LIZ.append(", outPushWsState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imsdkWsState=");
        LIZ.append(this.LIZJ);
        LIZ.append(", outPushIsBackground=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", imsdkIsBackground=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public QXU(long j, EnumC66933QOr outPushWsState, EnumC66933QOr imsdkWsState, boolean z, boolean z2) {
        o.LJIIIZ(outPushWsState, "outPushWsState");
        o.LJIIIZ(imsdkWsState, "imsdkWsState");
        this.LIZ = j;
        this.LIZIZ = outPushWsState;
        this.LIZJ = imsdkWsState;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
