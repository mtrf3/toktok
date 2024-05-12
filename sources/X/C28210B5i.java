package X;

import kotlin.jvm.internal.o;

/* renamed from: X.B5i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28210B5i {
    public final long LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28210B5i)) {
            return false;
        }
        C28210B5i c28210B5i = (C28210B5i) obj;
        return this.LIZ == c28210B5i.LIZ && o.LJ(this.LIZIZ, c28210B5i.LIZIZ) && this.LIZJ == c28210B5i.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        Long l = this.LIZIZ;
        int hashCode = (LLJIJIL + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MicRoomJumpEvent(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", anchorId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", autoJump=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C28210B5i(long j, Long l, boolean z) {
        this.LIZ = j;
        this.LIZIZ = l;
        this.LIZJ = z;
    }
}
