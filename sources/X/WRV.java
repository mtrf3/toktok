package X;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* loaded from: classes15.dex */
public final class WRV extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ WRN LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WRV(WRN wrn, boolean z, boolean z2, boolean z3) {
        super(0);
        this.LJLIL = wrn;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        WRN wrn = this.LJLIL;
        FilterBean filterBean = wrn.LJLJI;
        if (filterBean != null) {
            WRN.LJJLIIIJJIZ(wrn, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, filterBean);
            wrn.LJLJI = null;
            InterfaceC92693kP interfaceC92693kP = wrn.LJLJJI;
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
        }
        return C76800UCe.LIZ;
    }
}
