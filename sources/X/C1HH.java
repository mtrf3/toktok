package X;

import android.os.SystemClock;

/* renamed from: X.1HH, reason: invalid class name */
/* loaded from: classes.dex */
public class C1HH extends C05630Jz {
    public long LIZ;
    public long LIZIZ;

    public void LJIIJ(int i, String str) {
    }

    public void LJIIJJI() {
    }

    public void LJIIL(int i, String str) {
    }

    public void LJIILIIL() {
    }

    public final long LJIIIIZZ() {
        long j;
        if (this.LIZIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZIZ;
        } else {
            j = 0;
        }
        this.LIZIZ = 0L;
        return j;
    }

    public final long LJIIIZ() {
        long j;
        if (this.LIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            j = 0;
        }
        this.LIZ = 0L;
        return j;
    }
}
