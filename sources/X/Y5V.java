package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class Y5V extends Y61 {
    public Y5W LLFII;
    public C66426Q5e LLFZ;
    public Y6E LLI;
    public Y5K LLIFFJFJJ;

    @Override // X.Y61
    public final void LIZIZ() {
        Y6E y6e = this.LLI;
        if (y6e != null) {
            y6e.LIZJ();
        }
    }

    public final void LJI() {
        Y5W y5w = this.LLFII;
        if (y5w != null) {
            C79043V0l.LJJIIJZLJL();
            y5w.LJIIIZ = 0;
            synchronized (y5w.LIZJ) {
                y5w.LIZIZ = false;
            }
            this.LLFII = null;
        }
        if (this.LJLJL) {
            Y5W y5w2 = new Y5W(getCameraInstance(), this.LLIFFJFJJ);
            this.LLFII = y5w2;
            y5w2.LJI = this.LLFZ;
            C79043V0l.LJJIIJZLJL();
            if (y5w2.LIZIZ) {
                y5w2.LIZJ();
            }
            HandlerThread handlerThread = new HandlerThread("ScanThread");
            y5w2.LIZLLL = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = y5w2.LIZLLL;
            if (handlerThread2 != null) {
                y5w2.LJ = new Handler(handlerThread2.getLooper(), y5w2.LJIIIIZZ);
                y5w2.LIZIZ = true;
                y5w2.LIZIZ();
                return;
            }
            o.LJIJI("thread");
            throw null;
        }
    }

    @Override // X.Y61
    public final void LIZJ() {
        super.LIZJ();
    }

    public Y5V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
