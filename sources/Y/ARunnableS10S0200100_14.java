package Y;

import X.C99B;
import X.EnumC84152X0y;
import X.VIW;
import com.ss.android.ttvecamera.TECameraCapture;

/* loaded from: classes15.dex */
public class ARunnableS10S0200100_14 implements Runnable {
    public final int $t;
    public long j2;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Runnable runnable = ((VIW) this.l0).LJ.get((C99B) this.l1);
        if (runnable != null) {
            ((VIW) this.l0).LIZIZ.removeCallbacks(runnable);
        }
        VIW viw = (VIW) this.l0;
        C99B c99b = (C99B) this.l1;
        ARunnableS33S0200000_14 aRunnableS33S0200000_14 = new ARunnableS33S0200000_14(c99b, viw, 69);
        viw.LJ.put(c99b, aRunnableS33S0200000_14);
        ((VIW) this.l0).LIZIZ.postDelayed(aRunnableS33S0200000_14, this.j2);
    }

    public static final void run$0(ARunnableS10S0200100_14 aRunnableS10S0200100_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS10S0200100_14.l1).setShutterTime((TECameraCapture) aRunnableS10S0200100_14.l0, aRunnableS10S0200100_14.j2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S0200100_14 aRunnableS10S0200100_14) {
        boolean LIZ;
        try {
            aRunnableS10S0200100_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S0200100_14(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.j2 = j;
    }
}
