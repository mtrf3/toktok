package Y;

import X.C38995FSd;
import X.C39004FSm;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS0S1102100_6 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public long j4;
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

    public static final void run$0(ARunnableS0S1102100_6 aRunnableS0S1102100_6) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = C39004FSm.LIZ((WeakReference) aRunnableS0S1102100_6.l1, aRunnableS0S1102100_6.s0, aRunnableS0S1102100_6.i2, aRunnableS0S1102100_6.i3, aRunnableS0S1102100_6.j4);
            if (LIZ2 != null) {
                C38995FSd.LIZIZ.LIZLLL(LIZ2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1102100_6 aRunnableS0S1102100_6) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = C39004FSm.LIZ((WeakReference) aRunnableS0S1102100_6.l1, aRunnableS0S1102100_6.s0, aRunnableS0S1102100_6.i2, aRunnableS0S1102100_6.i3, aRunnableS0S1102100_6.j4);
            if (LIZ2 != null) {
                C38995FSd.LIZIZ.LJI(LIZ2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1102100_6(WeakReference weakReference, String str, int i, int i2, long j, int i3) {
        this.$t = i3;
        this.l1 = weakReference;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
        this.j4 = j;
    }
}
