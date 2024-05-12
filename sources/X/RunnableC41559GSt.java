package X;

/* renamed from: X.GSt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC41559GSt implements Runnable {
    public final /* synthetic */ C41558GSs LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    public RunnableC41559GSt(C41558GSs c41558GSs, int i, int i2, int i3) {
        this.LJLIL = c41558GSs;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLILLLLZI == this.LJLIL.LJLJI.length()) {
                this.LJLIL.LJLJI.setSelection(this.LJLJI, this.LJLJJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
