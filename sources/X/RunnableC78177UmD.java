package X;

/* renamed from: X.UmD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC78177UmD implements Runnable {
    public final /* synthetic */ C78174UmA LJLIL;
    public final /* synthetic */ double LJLILLLLZI;

    public RunnableC78177UmD(C78174UmA c78174UmA, double d) {
        this.LJLIL = c78174UmA;
        this.LJLILLLLZI = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJ(Double.valueOf(this.LJLILLLLZI));
        } finally {
            if (LIZ) {
            }
        }
    }
}
