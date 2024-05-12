package X;

/* renamed from: X.Qgq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67652Qgq implements Runnable {
    public final /* synthetic */ AbstractC67638Qgc LJLIL;
    public final /* synthetic */ C67650Qgo LJLILLLLZI;

    public final void LIZ() {
        if (this.LJLIL.LJIIJJI()) {
            this.LJLILLLLZI.LJLJI.LJIJI();
            return;
        }
        try {
            this.LJLILLLLZI.LJLJI.LJIJ(this.LJLILLLLZI.LJLILLLLZI.LIZJ(this.LJLIL));
        } catch (C67645Qgj e) {
            if (e.getCause() instanceof Exception) {
                this.LJLILLLLZI.LJLJI.LJIIZILJ((Exception) e.getCause());
            } else {
                this.LJLILLLLZI.LJLJI.LJIIZILJ(e);
            }
        } catch (Exception e2) {
            this.LJLILLLLZI.LJLJI.LJIIZILJ(e2);
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

    public RunnableC67652Qgq(C67650Qgo c67650Qgo, AbstractC67638Qgc abstractC67638Qgc) {
        this.LJLILLLLZI = c67650Qgo;
        this.LJLIL = abstractC67638Qgc;
    }
}
