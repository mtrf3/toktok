package X;

import Y.ARunnableS34S0200000_15;
import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y5W {
    public final Y60 LIZ;
    public volatile boolean LIZIZ;
    public HandlerThread LIZLLL;
    public Handler LJ;
    public C66426Q5e LJI;
    public volatile Y5K LJII;
    public final IDCallbackS369S0100000_15 LJIIIIZZ;
    public int LJIIIZ;
    public final Y5X LJIIJ;
    public final Object LIZJ = new Object();
    public volatile boolean LJFF = true;

    public final void LIZIZ() {
        Y60 y60 = this.LIZ;
        if (y60 != null && y60.LJFF) {
            Y60 y602 = this.LIZ;
            y602.LJII.post(new ARunnableS34S0200000_15(this.LJIIJ, y602, 32));
        }
    }

    public final void LIZJ() {
        C79043V0l.LJJIIJZLJL();
        this.LJIIIZ = 0;
        synchronized (this.LIZJ) {
            this.LIZIZ = false;
        }
    }

    public Y5W(Y60 y60, Y5K y5k) {
        new ThreadLocal();
        this.LJIIIIZZ = new IDCallbackS369S0100000_15(this, 4);
        this.LJIIJ = new Y5X(this);
        C79043V0l.LJJIIJZLJL();
        this.LIZ = y60;
        this.LJII = y5k;
    }

    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult) {
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeMessages(10002);
        }
        HandlerThread handlerThread = this.LIZLLL;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            Y5K y5k = this.LJII;
            if (y5k == null) {
                return;
            }
            y5k.LLIIJI(i, i2, str, pipoOcrResult, "scan");
            this.LJII = null;
            return;
        }
        o.LJIJI("thread");
        throw null;
    }
}
