package X;

/* renamed from: X.CrA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32620CrA implements InterfaceC19890qH {
    public final /* synthetic */ C32609Cqz LJLIL;
    public final /* synthetic */ C32633CrN LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C32620CrA(C32609Cqz c32609Cqz, C32633CrN c32633CrN, long j) {
        this.LJLIL = c32609Cqz;
        this.LJLILLLLZI = c32633CrN;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        InterfaceC32642CrW mIView = this.LJLIL.getMIView();
        if (mIView != null) {
            mIView.LIZLLL(this.LJLILLLLZI);
        }
        C32793Ctx.LIZIZ(Long.valueOf(this.LJLJI), EnumC32606Cqw.GIFT_COLOR, 0);
        InterfaceC30442Bx8.c.LIZ(Boolean.TRUE);
    }
}
