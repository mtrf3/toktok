package X;

import android.os.SystemClock;

/* renamed from: X.Ipv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47831Ipv {
    public int LIZ = 2;
    public int LIZIZ;
    public long LIZJ;

    public final int LIZ() {
        if (this.LIZ == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.LIZJ);
            if (i >= 0) {
                this.LIZIZ += i;
            }
            this.LIZJ = elapsedRealtime;
        }
        return this.LIZIZ;
    }

    public final void LIZIZ() {
        if (this.LIZ == 2) {
            this.LIZ = 1;
            this.LIZJ = SystemClock.elapsedRealtime();
        }
    }

    public final void LIZJ() {
        if (this.LIZ == 1) {
            this.LIZ = 2;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.LIZJ);
            if (elapsedRealtime >= 0) {
                this.LIZIZ += elapsedRealtime;
            }
        }
    }
}
