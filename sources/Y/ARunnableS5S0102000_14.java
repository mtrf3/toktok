package Y;

import X.C63922P6w;
import X.C83667WsZ;
import X.EnumC84152X0y;
import X.OSZ;
import X.X1D;

/* loaded from: classes15.dex */
public class ARunnableS5S0102000_14 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((EnumC84152X0y) this.l0).mCurrentCameraState != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set picture size failed, w: ");
            LIZ.append(this.i1);
            LIZ.append(", h: ");
            LIZ.append(this.i2);
            LIZ.append(", state: ");
            LIZ.append(((EnumC84152X0y) this.l0).mCurrentCameraState);
            C63922P6w.LIZIZ("TECameraServer", X1D.LIZIZ(LIZ));
            return;
        }
        if (((EnumC84152X0y) this.l0).mCameraInstance != null) {
            ((EnumC84152X0y) this.l0).mCameraInstance.LLLILZLLLI(this.i1, this.i2);
        }
    }

    public static final void run$0(ARunnableS5S0102000_14 aRunnableS5S0102000_14) {
        boolean LIZ;
        try {
            aRunnableS5S0102000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0102000_14 aRunnableS5S0102000_14) {
        boolean LIZ;
        try {
            ((C83667WsZ) aRunnableS5S0102000_14.l0).LIZIZ.LJII(new OSZ<>(Integer.valueOf(aRunnableS5S0102000_14.i1), Integer.valueOf(aRunnableS5S0102000_14.i2)));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0102000_14(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
