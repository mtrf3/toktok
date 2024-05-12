package X;

/* renamed from: X.Fu6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40446Fu6 extends AbstractRunnableC40448Fu8 {
    public long LJLJI = -1;
    public final long LJLILLLLZI = 60000;

    public abstract void LIZ();

    public abstract void LIZIZ(boolean z);

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        boolean z;
        try {
            LIZ();
            if (this.LJLJI > 0) {
                if (System.currentTimeMillis() - this.LJLJI >= this.LJLILLLLZI) {
                    z = true;
                } else {
                    z = false;
                }
                LIZIZ(z);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
