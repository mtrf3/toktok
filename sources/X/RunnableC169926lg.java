package X;

import Y.ARunnableS38S0100000_2;

/* renamed from: X.6lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC169926lg implements Runnable {
    public boolean LJLIL;
    public final /* synthetic */ C169776lR LJLILLLLZI;

    public final void LIZ() {
        boolean LIZJ = this.LJLILLLLZI.LJJIIZ.LIZJ();
        C169776lR c169776lR = this.LJLILLLLZI;
        if (c169776lR.LJJIL) {
            if (LIZJ && this.LJLIL) {
                return;
            }
            this.LJLILLLLZI.LJJIFFI((int) c169776lR.LJJIIZ.LIZIZ(), false);
            if (!LIZJ) {
                this.LJLILLLLZI.LJII.postDelayed(this, 1L);
                return;
            }
            this.LJLILLLLZI.LIZLLL.setValue(C5MM.LIZJ());
            this.LJLILLLLZI.LIZLLL.setValue(C5MM.LIZLLL(0L));
            this.LJLILLLLZI.LJII.postDelayed(new ARunnableS38S0100000_2(this, 28), 100L);
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

    public RunnableC169926lg(C169776lR c169776lR) {
        this.LJLILLLLZI = c169776lR;
    }
}
