package X;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes7.dex */
public final class FY1 extends AbstractC06100Lu {
    public final Handler LJLILLLLZI = C60992aN.LIZIZ.LIZ();
    public final long LJLJI;
    public final FY2 LJLJJI;
    public final int LJLJJL;
    public final FY4 LJLJJLL;
    public long LJLJL;

    public FY1(FY4 fy4) {
        this.LJLJJLL = fy4;
        C16880lQ.LLJJJJ().getThread();
        long j = fy4.LJLILLLLZI;
        this.LJLJI = j;
        this.LJLJJL = (int) ((fy4.LJLIL / j) - 1);
        this.LJLJJI = new FY2(this);
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIIZZ(String str) {
        this.LJLIL = true;
        if (SystemClock.uptimeMillis() - this.LJLJL >= this.LJLJJLL.LJLJI) {
            FY2 fy2 = this.LJLJJI;
            fy2.LJLIL = true;
            SystemClock.uptimeMillis();
            fy2.LJLJJL = Long.valueOf(System.currentTimeMillis());
            this.LJLILLLLZI.postDelayed(this.LJLJJI, this.LJLJI);
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        this.LJLILLLLZI.removeCallbacks(this.LJLJJI);
        this.LJLIL = false;
    }
}
