package Y;

import X.C46748IWi;
import X.C51677KPx;

/* loaded from: classes9.dex */
public class ARunnableS1S0100001_8 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

    public static final void run$1(ARunnableS1S0100001_8 aRunnableS1S0100001_8) {
        C46748IWi.LJJIJL((C46748IWi) aRunnableS1S0100001_8.l0, aRunnableS1S0100001_8.f1);
    }

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

    public static final void run$0(ARunnableS1S0100001_8 aRunnableS1S0100001_8) {
        boolean LIZ;
        try {
            ((C51677KPx) aRunnableS1S0100001_8.l0).LIZIZ(aRunnableS1S0100001_8.f1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0100001_8(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
