package Y;

import X.C16880lQ;
import X.C2U8;
import X.IK9;
import X.JRS;
import X.JVW;
import android.os.Handler;

/* loaded from: classes9.dex */
public class ARunnableS3S0001000_8 implements Runnable {
    public final int $t;
    public int i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS3S0001000_8 aRunnableS3S0001000_8) {
        boolean LIZ;
        try {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(IK9.LJLIL, aRunnableS3S0001000_8.i0 * 1000);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0001000_8 aRunnableS3S0001000_8) {
        boolean LIZ;
        try {
            C2U8.LIZ(new JRS(aRunnableS3S0001000_8.i0, 5));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S0001000_8 aRunnableS3S0001000_8) {
        boolean LIZ;
        try {
            JVW.LIZ(aRunnableS3S0001000_8.i0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S0001000_8 aRunnableS3S0001000_8) {
        boolean LIZ;
        try {
            JVW.LIZ(aRunnableS3S0001000_8.i0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS3S0001000_8 aRunnableS3S0001000_8) {
        boolean LIZ;
        try {
            JVW.LIZ(aRunnableS3S0001000_8.i0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0001000_8(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}
