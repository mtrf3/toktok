package X;

/* renamed from: X.Zfb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90507Zfb implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C90506Zfa LJLILLLLZI;

    public final void LIZ() {
        try {
            C90639Zhj LJ = this.LJLILLLLZI.LJ(null);
            if (LJ == null) {
                this.LJLILLLLZI.LJIJJLI.w("ChromeCastSourceImpl", " RemoteMediaClient is null.");
            } else {
                LJ.LJIJI(this.LJLIL);
            }
        } catch (Exception e) {
            this.LJLILLLLZI.LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            this.LJLILLLLZI.LJIIZILJ = false;
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

    public RunnableC90507Zfb(C90506Zfa c90506Zfa, long j) {
        this.LJLILLLLZI = c90506Zfa;
        this.LJLIL = j;
    }
}
