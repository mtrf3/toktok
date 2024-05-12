package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TU2 {
    public final TT2 LIZ;
    public final boolean LIZIZ;

    public TU2() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TU2)) {
            return false;
        }
        TU2 tu2 = (TU2) obj;
        return o.LJ(this.LIZ, tu2.LIZ) && this.LIZIZ == tu2.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        TT2 tt2 = this.LIZ;
        int hashCode = (tt2 == null ? 0 : tt2.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BeInvitedDialogUICtrlCmd(beInvitedOptPresenter=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSupportPauseLive=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public TU2(TT2 tt2, int i) {
        this.LIZ = (i & 1) != 0 ? null : tt2;
        this.LIZIZ = false;
    }
}
