package X;

/* renamed from: X.If1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47155If1 implements InterfaceC47219Ig3 {
    public IWH LIZ;
    public IZ2 LIZIZ;

    @Override // X.InterfaceC47219Ig3
    public final void LIZJ(C47249IgX c47249IgX) {
    }

    @Override // X.InterfaceC47219Ig3
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC47219Ig3
    public final void LJ(C46539IOh c46539IOh) {
    }

    @Override // X.InterfaceC47219Ig3
    public final void LJJIIJZLJL() {
    }

    @Override // X.InterfaceC47219Ig3
    public final void resume() {
        this.LIZ.resume();
    }

    public C47155If1(IWH iwh) {
        this.LIZ = iwh;
    }

    @Override // X.InterfaceC47219Ig3
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        IZ2 iz2 = this.LIZIZ;
        if (iz2 != null) {
            this.LIZ.setSurface(iz2.getSurface());
        }
        this.LIZ.LJIIL(C46810IYs.LIZ(interfaceC46811IYt, null));
    }

    @Override // X.InterfaceC47219Ig3
    public final void LIZIZ(IZ2 iz2) {
        this.LIZIZ = iz2;
    }
}
