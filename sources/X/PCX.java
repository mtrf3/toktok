package X;

import Y.ARunnableS47S0100000_11;
import android.os.Message;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public final class PCX {
    public final C64056PCa LIZ;
    public final ARunnableS47S0100000_11 LIZIZ = new ARunnableS47S0100000_11(this, 5);
    public final CopyOnWriteArraySet<PCY> LIZJ = new CopyOnWriteArraySet<>();

    public PCX() {
        C64056PCa c64056PCa = new C64056PCa();
        this.LIZ = c64056PCa;
        c64056PCa.LIZ.start();
    }

    public final void LIZ(PCY pcy) {
        if (pcy != null) {
            try {
                this.LIZJ.add(pcy);
                this.LIZ.LIZ(this.LIZIZ);
                C64056PCa c64056PCa = this.LIZ;
                c64056PCa.LIZIZ(Message.obtain(c64056PCa.LIZLLL, this.LIZIZ), 30000L);
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        C64056PCa c64056PCa = this.LIZ;
        c64056PCa.LIZIZ(Message.obtain(c64056PCa.LIZLLL, runnable), 0L);
    }
}
