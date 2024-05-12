package X;

/* loaded from: classes15.dex */
public final class WS1 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C82306WRy LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ WS0 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WS1(boolean z, C82306WRy c82306WRy, boolean z2, WS0 ws0) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = c82306WRy;
        this.LJLJI = z2;
        this.LJLJJI = ws0;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL) {
            this.LJLILLLLZI.LJLL.LJI(Float.valueOf(0.0f));
            this.LJLILLLLZI.LJLJLJ.LJI(Boolean.TRUE);
            this.LJLILLLLZI.LJLJJL(false, true);
        } else {
            this.LJLILLLLZI.LJLLI.LJI(C76800UCe.LIZ);
        }
        C82306WRy.LJJLIIIIJ(this.LJLILLLLZI, this.LJLIL, this.LJLJI, this.LJLJJI, false, 8, null);
        return C76800UCe.LIZ;
    }
}
