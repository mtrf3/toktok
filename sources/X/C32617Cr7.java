package X;

/* renamed from: X.Cr7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32617Cr7 implements InterfaceC19880qG {
    public final /* synthetic */ C32609Cqz LIZ;

    public C32617Cr7(C32609Cqz c32609Cqz) {
        this.LIZ = c32609Cqz;
    }

    @Override // X.InterfaceC19880qG
    public final void LIZ(int i) {
        C32633CrN c32633CrN = new C32633CrN(EnumC32608Cqy.RANDOM_GIFT, EnumC32627CrH.BUBBLE, 0L);
        InterfaceC32642CrW mIView = this.LIZ.getMIView();
        if (mIView != null) {
            mIView.LIZJ(c32633CrN);
        }
        if (i != 1) {
            if (i != 3) {
                C32793Ctx.LIZ(EnumC32853Cuv.OTHER, EnumC32606Cqw.RANDOM_GIFT);
                return;
            } else {
                C32793Ctx.LIZ(EnumC32853Cuv.USER_CLOSE, EnumC32606Cqw.RANDOM_GIFT);
                return;
            }
        }
        C32793Ctx.LIZ(EnumC32853Cuv.TIME_UP, EnumC32606Cqw.RANDOM_GIFT);
    }
}
