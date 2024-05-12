package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import java.util.HashSet;
import java.util.Random;

/* loaded from: classes15.dex */
public class W4T {
    public static W4T LIZLLL;
    public static boolean LJ;
    public static int LJFF;
    public static final boolean LJI;
    public final ARunnableS50S0100000_14 LIZJ = new ARunnableS50S0100000_14(this, 203);
    public final java.util.Set<InterfaceC81694W4k> LIZ = new HashSet();
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());

    static {
        boolean z;
        if (new Random().nextFloat() < 0.005f) {
            z = true;
        } else {
            z = false;
        }
        LJI = z;
    }

    public static void LIZIZ() {
        boolean z;
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
    }

    public void LIZ(InterfaceC81694W4k interfaceC81694W4k) {
        if (!LJ || LJI) {
            LIZIZ();
        }
        ((HashSet) this.LIZ).remove(interfaceC81694W4k);
    }
}
