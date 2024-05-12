package X;

/* renamed from: X.TLj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74491TLj implements InterfaceC74483TLb {
    public final C73893SzJ LIZ = new C73893SzJ();

    @Override // X.InterfaceC74483TLb
    public final C73426Srm LIZ() {
        C73893SzJ c73893SzJ = this.LIZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC74483TLb
    public final void LIZIZ() {
        this.LIZ.onNext(EnumC74492TLk.PRE_SHOW);
        this.LIZ.onNext(EnumC74492TLk.SHOWN);
    }

    @Override // X.InterfaceC74483TLb
    public final void LIZJ() {
        this.LIZ.onNext(EnumC74492TLk.PRE_HIDE);
        this.LIZ.onNext(EnumC74492TLk.HIDDEN);
    }

    @Override // X.InterfaceC74483TLb
    public final C73805Sxt a3() {
        return LIZ().LJJIFFI(C78926UyI.LJLIL).LJJIJL(C31309CQn.LJLIL);
    }

    @Override // X.InterfaceC74483TLb
    public final void hide() {
        LIZJ();
    }

    @Override // X.InterfaceC74483TLb
    public final void show() {
        LIZIZ();
    }
}
