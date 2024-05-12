package X;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.J1m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48494J1m {
    public static long LJFF = -1;
    public final C48395Iz1 LIZ;
    public final AtomicInteger LIZIZ;
    public final HandlerC48495J1n LIZJ;
    public final boolean LIZLLL;
    public long LJ;

    public final void LIZIZ() {
        try {
            if (!this.LIZLLL && this.LIZIZ.getAndIncrement() == 0) {
                Logger.debug();
                this.LIZJ.sendEmptyMessage(1);
                this.LJ = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZJ() {
        try {
            if (!this.LIZLLL && this.LIZIZ.decrementAndGet() == 0) {
                Logger.debug();
                this.LIZJ.removeMessages(1);
                LIZ();
                LJFF = -1L;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ() {
        try {
            long LLLLLZ = C16880lQ.LLLLLZ();
            long j = LJFF;
            long j2 = LLLLLZ - j;
            if (j >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.LIZ.LIZ(j2, elapsedRealtime - this.LJ);
                    this.LJ = elapsedRealtime;
                }
            }
            LJFF = LLLLLZ;
        } catch (Throwable unused) {
        }
    }

    public C48494J1m(C48395Iz1 c48395Iz1) {
        this.LIZ = c48395Iz1;
        try {
            this.LIZIZ = new AtomicInteger();
            HandlerThread LIZ = C29259Be3.LIZ();
            LIZ.start();
            this.LIZJ = new HandlerC48495J1n(this, LIZ.getLooper());
        } catch (Throwable unused) {
            this.LIZLLL = true;
        }
    }
}
