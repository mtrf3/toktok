package X;

/* renamed from: X.IcZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47003IcZ implements B91 {
    public final /* synthetic */ C47002IcY LIZ;

    public C47003IcZ(C47002IcY c47002IcY) {
        this.LIZ = c47002IcY;
    }

    @Override // X.B91
    public final void onWindowFocusChanged(boolean z) {
        IX7 LIZIZ;
        IXC ixc = this.LIZ.LJIIJJI;
        if (ixc == null) {
            LIZIZ = null;
        } else {
            LIZIZ = ixc.LIZIZ();
        }
        if (z && LIZIZ != null) {
            if (LIZIZ.LJFF.isPlaying() || LIZIZ.LJFF.isLoading()) {
                this.LIZ.LIZJ();
            }
        }
    }
}
