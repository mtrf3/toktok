package Y;

import X.YQ6;
import X.YQV;
import X.YR5;
import com.ss.videoarch.live.ttquic.TTLogManager;

/* loaded from: classes16.dex */
public class ARunnableS1S1102000_15 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

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
        int i;
        YQ6 yq6 = (YQ6) this.l1;
        yq6.LJII(yq6.LJIJ);
        YQ6 yq62 = (YQ6) this.l1;
        YQV yqv = yq62.LIZLLL;
        if (yqv != null) {
            if (this.i2 == 3 && (i = this.i3) == 3) {
                yqv.LJ(yq62.LJJJ, yq62.LIZIZ.LJLILLLLZI, i, this.s0);
            } else {
                yqv.LIZIZ(yq62.LIZIZ.LJLILLLLZI, this.i3, yq62, yq62.LJJJ);
            }
        }
    }

    public static final void run$0(ARunnableS1S1102000_15 aRunnableS1S1102000_15) {
        boolean LIZ;
        try {
            aRunnableS1S1102000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1102000_15 aRunnableS1S1102000_15) {
        boolean LIZ;
        try {
            synchronized (((TTLogManager) aRunnableS1S1102000_15.l1).mLogLock) {
                YR5 yr5 = ((TTLogManager) aRunnableS1S1102000_15.l1).mListener;
                if (yr5 != null) {
                    yr5.onMonitoryLog(aRunnableS1S1102000_15.i2, aRunnableS1S1102000_15.i3, aRunnableS1S1102000_15.s0);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1102000_15(Object obj, int i, int i2, String str, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
    }
}
