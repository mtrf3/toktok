package Y;

import X.JJ4;
import X.R3Y;
import X.R4E;

/* loaded from: classes12.dex */
public class IDgS350S0100000_11 implements JJ4 {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$0(IDgS350S0100000_11 iDgS350S0100000_11) {
    }

    @Override // X.JJ4
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                return;
            case 1:
                LIZIZ$1(this);
                return;
            case 2:
                LIZIZ$2(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0(IDgS350S0100000_11 iDgS350S0100000_11) {
        R4E r4e = (R4E) iDgS350S0100000_11.l0;
        r4e.LJI.LIZ(r4e.LJ, true, true, null);
    }

    public static final void LIZ$1(IDgS350S0100000_11 iDgS350S0100000_11) {
        R3Y r3y = (R3Y) iDgS350S0100000_11.l0;
        if (r3y != null) {
            r3y.onSuccess();
        }
    }

    public static final void LIZ$2(IDgS350S0100000_11 iDgS350S0100000_11) {
        R3Y r3y = (R3Y) iDgS350S0100000_11.l0;
        if (r3y != null) {
            r3y.onSuccess();
        }
    }

    public static final void LIZIZ$1(IDgS350S0100000_11 iDgS350S0100000_11) {
        R3Y r3y = (R3Y) iDgS350S0100000_11.l0;
        if (r3y != null) {
            r3y.onCancel();
        }
    }

    public static final void LIZIZ$2(IDgS350S0100000_11 iDgS350S0100000_11) {
        R3Y r3y = (R3Y) iDgS350S0100000_11.l0;
        if (r3y != null) {
            r3y.onCancel();
        }
    }

    public IDgS350S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
