package X;

/* loaded from: classes16.dex */
public final class Y1O extends AbstractC65781Prl implements InterfaceC65784Pro<Y1D> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = false;
    public final /* synthetic */ Y1S LJLJJI;
    public final /* synthetic */ C86652Xzc LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1O(boolean z, boolean z2, C86673Xzx c86673Xzx, C86652Xzc c86652Xzc) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJJI = c86673Xzx;
        this.LJLJJL = c86652Xzc;
    }

    @Override // X.InterfaceC65784Pro
    public final Y1D invoke() {
        return new Y1D(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
    }
}
