package Y;

import X.C31521CYr;
import X.C41875Gc3;
import X.C87818YdK;
import X.InterfaceC88472Yns;

/* loaded from: classes17.dex */
public class ARunnableS35S0200000_16 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS35S0200000_16 aRunnableS35S0200000_16) {
        boolean LIZ;
        try {
            ((InterfaceC88472Yns) aRunnableS35S0200000_16.l0).invoke((C41875Gc3) aRunnableS35S0200000_16.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS35S0200000_16 aRunnableS35S0200000_16) {
        boolean LIZ;
        try {
            ((C87818YdK) aRunnableS35S0200000_16.l0).LIZIZ.LJIIJ((C31521CYr) aRunnableS35S0200000_16.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS35S0200000_16 aRunnableS35S0200000_16) {
        boolean LIZ;
        try {
            ((C87818YdK) aRunnableS35S0200000_16.l0).LIZIZ.LJJI((C31521CYr) aRunnableS35S0200000_16.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS35S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
