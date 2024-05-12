package X;

/* renamed from: X.Vi2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80466Vi2 implements Runnable {
    public final /* synthetic */ AnonymousClass191 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C80463Vhz LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.setTranslationX(this.LJLJJI.LJIJI(r3, this.LJLILLLLZI, this.LJLJI));
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80466Vi2(C80463Vhz c80463Vhz, AnonymousClass191 anonymousClass191, int i, boolean z) {
        this.LJLJJI = c80463Vhz;
        this.LJLIL = anonymousClass191;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
