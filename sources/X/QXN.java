package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QXN {
    public final long LIZ;
    public final EnumC66933QOr LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QXN)) {
            return false;
        }
        QXN qxn = (QXN) obj;
        return this.LIZ == qxn.LIZ && this.LIZIZ == qxn.LIZIZ && this.LIZJ == qxn.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PendingMessageData(timestamp=");
        LIZ.append(this.LIZ);
        LIZ.append(", connectionState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isBackground=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public QXN(long j, EnumC66933QOr connectionState, boolean z) {
        o.LJIIIZ(connectionState, "connectionState");
        this.LIZ = j;
        this.LIZIZ = connectionState;
        this.LIZJ = z;
    }
}
