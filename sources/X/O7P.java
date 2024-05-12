package X;

import Y.ACallableS113S0100000_10;

/* loaded from: classes11.dex */
public final class O7P implements Runnable {
    public final /* synthetic */ boolean LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C61359O6h.LJ.submit(new ACallableS113S0100000_10(this, 16));
        } finally {
            if (LIZ) {
            }
        }
    }

    public O7P(boolean z) {
        this.LJLIL = z;
    }
}
