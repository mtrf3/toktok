package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TU1 implements TQF {
    public final TQH LIZ;
    public final boolean LIZIZ;

    public TU1() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TU1)) {
            return false;
        }
        TU1 tu1 = (TU1) obj;
        return o.LJ(this.LIZ, tu1.LIZ) && this.LIZIZ == tu1.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        TQH tqh = this.LIZ;
        int hashCode = (tqh == null ? 0 : tqh.hashCode()) * 31;
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

    public TU1(TQH tqh, int i) {
        this.LIZ = (i & 1) != 0 ? null : tqh;
        this.LIZIZ = false;
    }
}
