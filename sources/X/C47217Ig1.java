package X;

/* renamed from: X.Ig1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47217Ig1 extends C47153Iez {
    public final IWH LJLIL;
    public final C40660FxY LJLILLLLZI;

    public C47217Ig1(IWH iwh, C40660FxY c40660FxY) {
        this.LJLIL = iwh;
        this.LJLILLLLZI = c40660FxY;
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onRenderFirstFrame(String str, IT4 it4) {
        boolean z;
        InterfaceC47220Ig4 interfaceC47220Ig4;
        if (this.LJLIL.LIZJ().LJ() == 6 || this.LJLIL.LIZJ().LJ() == 4) {
            z = true;
        } else {
            z = false;
        }
        C07670Rv.LIZLLL("onRenderFirstFrame softwareDecode: ", z);
        if (z && (interfaceC47220Ig4 = (InterfaceC47220Ig4) this.LJLILLLLZI.LJLIL) != null) {
            interfaceC47220Ig4.LIZLLL();
        }
    }
}
