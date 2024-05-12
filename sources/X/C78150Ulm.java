package X;

import Y.AfS65S0100000_13;
import Y.IDaS222S0100000_13;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ulm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78150Ulm {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public C73411SrX LJI;

    public final void LIZJ() {
        C73411SrX c73411SrX = this.LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LIZIZ = false;
    }

    public final void LIZLLL() {
        if (this.LIZJ <= 0) {
            return;
        }
        if (this.LIZIZ) {
            LIZJ();
        }
        long j = this.LJ;
        if (j != 0) {
            this.LJFF = (j - this.LIZLLL) + this.LJFF;
            this.LJ = 0L;
        }
        this.LIZLLL = SystemClock.uptimeMillis();
        LJ(this.LIZJ - this.LJFF);
        this.LIZIZ = true;
    }

    public final void LIZIZ() {
        this.LJ = SystemClock.uptimeMillis();
        this.LIZIZ = false;
        C73411SrX c73411SrX = this.LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public final void LIZ(long j) {
        this.LIZJ = TimeUnit.SECONDS.toMillis(j);
        if (this.LIZIZ) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j2 = (uptimeMillis - this.LIZLLL) + this.LJFF;
            this.LJFF = j2;
            this.LIZLLL = uptimeMillis;
            LJ(this.LIZJ - j2);
        }
    }

    public final void LJ(long j) {
        C73411SrX c73411SrX = this.LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        if (j <= 0) {
            return;
        }
        this.LJI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS65S0100000_13(this, 144), C78151Uln.LJLIL, new IDaS222S0100000_13(this, 1));
    }

    public C78150Ulm(InterfaceC65784Pro interfaceC65784Pro, long j) {
        this.LIZ = interfaceC65784Pro;
        this.LIZJ = TimeUnit.SECONDS.toMillis(j);
    }
}
