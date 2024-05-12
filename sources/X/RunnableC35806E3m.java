package X;

import android.os.Process;
import kotlin.jvm.internal.AqS9S0002000_6;

/* renamed from: X.E3m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC35806E3m implements Runnable {
    public static final RunnableC35806E3m LJLIL = new RunnableC35806E3m();

    public static void LIZ() {
        int i;
        try {
            int myTid = Process.myTid();
            C35809E3p.LIZ(myTid);
            if (DS8.LIZIZ() || C2NW.LIZ().LJIILLIIL(DSC.LJLIL)) {
                if (DS8.LIZIZ()) {
                    i = 15;
                } else {
                    i = 5;
                }
                C35818E3y.LIZJ(2, new AqS9S0002000_6(myTid, i, 0));
                C35818E3y.LIZJ(3, new AqS9S0002000_6(myTid, i, 1));
                C35818E3y.LIZJ(4, new AqS9S0002000_6(myTid, i, 2));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
