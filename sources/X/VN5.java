package X;

import Y.ARunnableS20S0110000_14;
import java.util.TimerTask;

/* loaded from: classes15.dex */
public final class VN5 extends TimerTask {
    public final /* synthetic */ VN4 LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            VN4 vn4 = this.LJLIL;
            vn4.getClass();
            try {
                vn4.LIZLLL.submit(new ARunnableS20S0110000_14(vn4, false, 5));
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public VN5(VN4 vn4) {
        this.LJLIL = vn4;
    }
}
