package X;

import android.os.Handler;
import android.os.SystemClock;
import ccb.t;

/* renamed from: X.VAk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC79302VAk implements Runnable {
    public final /* synthetic */ t LJLIL;

    public final void LIZ() {
        VAD vad;
        synchronized (this.LJLIL.H2) {
            if (!this.LJLIL.I2 || this.LJLIL.LJLLL == null) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis + r6.M;
            long longOption = this.LJLIL.LJLLL.getLongOption(381, 0L);
            long longOption2 = this.LJLIL.LJLLL.getLongOption(382, 0L);
            long longOption3 = this.LJLIL.LJLLL.getLongOption(383, 0L);
            long longOption4 = this.LJLIL.LJLLL.getLongOption(384, 0L);
            long longOption5 = this.LJLIL.LJLLL.getLongOption(385, 0L);
            long longOption6 = this.LJLIL.LJLLL.getLongOption(386, 0L);
            long longOption7 = this.LJLIL.LJLLL.getLongOption(387, 0L);
            if ((longOption != 0 || longOption2 != 0 || longOption3 != 0 || longOption4 != 0 || longOption5 != 0 || longOption6 != 0 || longOption7 != 0) && (vad = this.LJLIL.LJLJJI) != null) {
                vad.LJJJJZI(longOption, longOption2, longOption3, longOption4, longOption5, longOption6, longOption7);
            }
            Handler handler = this.LJLIL.F2;
            if (handler != null) {
                handler.postAtTime(this, j);
            }
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

    public RunnableC79302VAk(t tVar) {
        this.LJLIL = tVar;
    }
}
