package X;

import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aiw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94558aiw extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC93473aRR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94558aiw(String str, String str2, InterfaceC93473aRR interfaceC93473aRR) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = interfaceC93473aRR;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(this.LJLIL, new IDqS419S0100000_42(this.LJLJI, 25));
        String str = this.LJLILLLLZI;
        if (str != null) {
            actionGroup.LJIIIZ(str, new IDqS419S0100000_42(this.LJLJI, 26));
        }
        return C76800UCe.LIZ;
    }
}
