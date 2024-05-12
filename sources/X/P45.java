package X;

import android.media.AudioTrack;

/* loaded from: classes12.dex */
public final class P45 {
    public final P46 LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public final void LIZ() {
        if (this.LIZ != null) {
            LIZIZ(0);
        }
    }

    public P45(AudioTrack audioTrack) {
        if (J2M.LIZ >= 19) {
            this.LIZ = new P46(audioTrack);
            LIZ();
        } else {
            this.LIZ = null;
            LIZIZ(3);
        }
    }

    public final void LIZIZ(int i) {
        this.LIZIZ = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.LIZLLL = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.LIZLLL = 10000000L;
                return;
            }
            this.LIZLLL = 5000L;
            return;
        }
        this.LJ = 0L;
        this.LJFF = -1L;
        this.LIZJ = System.nanoTime() / 1000;
        this.LIZLLL = 5000L;
    }
}
