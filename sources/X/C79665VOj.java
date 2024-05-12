package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;

/* renamed from: X.VOj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79665VOj implements VDQ {
    public Runnable LIZ;
    public boolean LIZIZ;
    public Handler LIZJ;
    public C79666VOk LIZLLL;

    @Override // X.VDQ
    public final void LIZ(ARunnableS50S0100000_14 aRunnableS50S0100000_14) {
        if (this.LIZJ == null) {
            this.LIZJ = new Handler();
            this.LIZLLL = new C79666VOk();
        }
        C79666VOk c79666VOk = this.LIZLLL;
        c79666VOk.getClass();
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        if (c79666VOk.LIZ == null) {
            c79666VOk.LIZ = LLLLIIIILLL;
        }
        if (c79666VOk.LIZ == LLLLIIIILLL) {
            if (this.LIZIZ) {
                return;
            }
            this.LIZ = aRunnableS50S0100000_14;
            this.LIZJ.postDelayed(new ARunnableS50S0100000_14(this, 211), 16L);
            this.LIZIZ = true;
            return;
        }
        throw new AssertionError();
    }
}
