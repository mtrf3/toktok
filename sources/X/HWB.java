package X;

import Y.ARunnableS11S0101000_7;

/* loaded from: classes8.dex */
public final class HWB implements HW9 {
    public final W5E LIZ;
    public HW9 LIZIZ;
    public boolean LIZJ;

    @Override // X.HW9
    public final void cancel() {
        W5E w5e = this.LIZ;
        if (w5e == null) {
            return;
        }
        HWC.LIZ.execute(new ARunnableS11S0101000_7(1, w5e, 11));
    }

    public HWB(W5E w5e) {
        this.LIZ = w5e;
    }
}
