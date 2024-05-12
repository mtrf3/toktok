package X;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class CGO {
    public final CGP[] LIZ;
    public volatile int LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public final /* synthetic */ CGN LJ;

    public CGO(CGN cgn) {
        this.LJ = cgn;
        CGP[] cgpArr = new CGP[60];
        int i = 0;
        do {
            cgpArr[i] = new CGP();
            i++;
        } while (i < 60);
        this.LIZ = cgpArr;
    }

    public final float LIZ(int i) {
        long j = 1000;
        long elapsedRealtime = (SystemClock.elapsedRealtime() / j) - 1;
        long j2 = 60 < i ? 60 : i;
        long j3 = elapsedRealtime - (this.LJ.LJFF / j);
        if (j2 > j3) {
            j2 = j3;
        }
        float f = 0.0f;
        for (CGP cgp : this.LIZ) {
            if (cgp.LIZ >= elapsedRealtime - j2 && cgp.LIZ <= elapsedRealtime) {
                f += cgp.LIZIZ;
            }
        }
        return f / ((float) j2);
    }

    public final void LIZIZ(long j) {
        long j2 = j / 1000;
        long j3 = this.LIZJ;
        if (j3 == j2) {
            this.LIZ[this.LIZIZ].LIZIZ++;
            this.LIZ[this.LIZIZ].LIZ = j2;
        } else if (j2 > j3) {
            this.LIZIZ = (this.LIZIZ + 1) % 60;
            this.LIZ[this.LIZIZ].LIZ = j2;
            this.LIZ[this.LIZIZ].LIZIZ = 1;
        }
        this.LIZJ = j2;
    }

    public final void LIZJ(int i, long j) {
        long j2 = j / 1000;
        long j3 = this.LIZJ;
        if (j3 == j2) {
            this.LIZ[this.LIZIZ].LIZIZ += i;
            this.LIZ[this.LIZIZ].LIZ = j2;
        } else if (j2 > j3) {
            if (this.LIZLLL < this.LIZ[this.LIZIZ].LIZIZ) {
                this.LIZLLL = this.LIZ[this.LIZIZ].LIZIZ;
            }
            this.LIZIZ = (this.LIZIZ + 1) % 60;
            this.LIZ[this.LIZIZ].LIZ = j2;
            this.LIZ[this.LIZIZ].LIZIZ = i;
        }
        this.LIZJ = j2;
    }
}
