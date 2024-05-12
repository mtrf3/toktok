package X;

import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentityMatchRule;

/* loaded from: classes13.dex */
public final class RZR extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<BizIdentityMatchRule, InterfaceC65784Pro<? extends Object>>> {
    public static final RZR LJLIL = new RZR();

    public RZR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<BizIdentityMatchRule, InterfaceC65784Pro<? extends Object>> invoke() {
        return C113554cx.LJJLIIIIJ(new OSZ(new BizIdentityMatchRule("*", "*", "global"), RZS.LJLIL), new OSZ(new BizIdentityMatchRule("*", "*", "sa"), RZT.LJLIL), new OSZ(new BizIdentityMatchRule("*", "*", "us"), RZP.LJLIL), new OSZ(new BizIdentityMatchRule("*", "*", "*"), RZQ.LJLIL));
    }
}
