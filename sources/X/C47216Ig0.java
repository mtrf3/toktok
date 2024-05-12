package X;

/* renamed from: X.Ig0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47216Ig0 extends C47153Iez {
    public final IWH LJLIL;
    public final C47222Ig6 LJLILLLLZI;

    public C47216Ig0(IWH iwh, C47222Ig6 c47222Ig6) {
        this.LJLIL = iwh;
        this.LJLILLLLZI = c47222Ig6;
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onRenderFirstFrame(String str, IT4 it4) {
        boolean z;
        InterfaceC47219Ig3 interfaceC47219Ig3;
        if (this.LJLIL.LIZJ().LJ() == 6 || this.LJLIL.LIZJ().LJ() == 4) {
            z = true;
        } else {
            z = false;
        }
        C07670Rv.LIZLLL("onRenderFirstFrame softwareDecode: ", z);
        if (z && (interfaceC47219Ig3 = this.LJLILLLLZI.LIZIZ) != null) {
            interfaceC47219Ig3.LIZLLL();
        }
    }
}
