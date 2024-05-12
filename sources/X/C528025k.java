package X;

/* renamed from: X.25k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528025k extends AbstractC65781Prl implements InterfaceC65784Pro<C1ZD> {
    public final /* synthetic */ EnumC21450sn LJLIL;
    public final /* synthetic */ C0Q2<Float> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = false;
    public final /* synthetic */ InterfaceC88472Yns<EnumC21450sn, Boolean> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528025k(EnumC21450sn enumC21450sn, C0Q2 c0q2, InterfaceC88472Yns interfaceC88472Yns) {
        super(0);
        this.LJLIL = enumC21450sn;
        this.LJLILLLLZI = c0q2;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC65784Pro
    public final C1ZD invoke() {
        return new C1ZD(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }
}
