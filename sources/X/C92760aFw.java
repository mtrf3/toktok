package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;

/* renamed from: X.aFw, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92760aFw extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C92145a61 LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<CheckoutNavBarState, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ CheckoutViewModel LJLJI;
    public final /* synthetic */ C92283a8F LJLJJI;
    public final /* synthetic */ CheckoutUiState LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<String> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92760aFw(C92145a61 c92145a61, InterfaceC88472Yns<? super CheckoutNavBarState, C76800UCe> interfaceC88472Yns, CheckoutViewModel checkoutViewModel, C92283a8F c92283a8F, CheckoutUiState checkoutUiState, InterfaceC65784Pro<String> interfaceC65784Pro, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i) {
        super(2);
        this.LJLIL = c92145a61;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = checkoutViewModel;
        this.LJLJJI = c92283a8F;
        this.LJLJJL = checkoutUiState;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = interfaceC88472Yns2;
        this.LJLJLJ = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91897a21.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC24520xk, this.LJLJLJ | 1);
        return C76800UCe.LIZ;
    }
}
