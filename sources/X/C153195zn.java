package X;

/* renamed from: X.5zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153195zn implements C6FI, InterfaceC65784Pro<C82622Wbi> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJI;
    public final InterfaceC65784Pro<C82622Wbi> LJLIL;
    public final C153205zo LJLILLLLZI = new C153205zo(this);

    static {
        TBT tbt = new TBT(C153195zn.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C6FI
    public final void LIZIZ(boolean z) {
    }

    @Override // X.C6FI
    public final void LIZJ(boolean z) {
    }

    @Override // X.InterfaceC65784Pro
    public final C82622Wbi invoke() {
        return this.LJLIL.invoke();
    }

    public C153195zn(InterfaceC65784Pro<C82622Wbi> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // X.C6FI
    public final void LIZLLL(int i, int i2) {
        InterfaceC140385f8 interfaceC140385f8;
        C153205zo c153205zo = this.LJLILLLLZI;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLJI;
        ((InterfaceC153185zm) c153205zo.LIZ(this, interfaceC74236TBoArr[0])).f0(i);
        C82622Wbi invoke = this.LJLIL.invoke();
        if (invoke != null && (interfaceC140385f8 = (InterfaceC140385f8) invoke.LJIIIIZZ(null, InterfaceC147865rC.class)) != null) {
            interfaceC140385f8.rb0(Integer.valueOf(i));
        }
        ((InterfaceC153185zm) this.LJLILLLLZI.LIZ(this, interfaceC74236TBoArr[0])).LZ(i2);
    }
}
