package X;

/* renamed from: X.IYx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46815IYx extends AbstractC47210Ifu {
    public InterfaceC46811IYt LJ;
    public IWH LJFF;
    public final C46814IYw LJI = new C46814IYw(this);

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void release() {
        super.release();
        this.LJ = null;
        this.LJFF = null;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final InterfaceC46540IOi LJII() {
        return this.LJI;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        this.LJ = interfaceC46811IYt;
    }

    @Override // X.AbstractC47210Ifu
    public final void LJIIIIZZ(IWH iwh) {
        this.LJFF = iwh;
    }
}
