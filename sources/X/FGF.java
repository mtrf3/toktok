package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
public final class FGF {
    public final long LIZ;
    public final Runnable LIZIZ;
    public Handler LIZJ;
    public boolean LIZLLL;

    public final void LIZ() {
        long j;
        if (!this.LIZLLL) {
            j = 0;
        } else {
            j = this.LIZ;
        }
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.postDelayed(new ARunnableS42S0100000_6(this, 64), j);
        }
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        Looper.loop();
    }

    public FGF(long j, ARunnableS42S0100000_6 aRunnableS42S0100000_6) {
        this.LIZ = j;
        this.LIZIZ = aRunnableS42S0100000_6;
        if (this.LIZJ == null) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.LIZJ = new Handler(myLooper);
            }
        }
    }
}
