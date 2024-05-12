package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;

/* renamed from: X.aGD, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92777aGD extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C92145a61 LJLIL;
    public final /* synthetic */ CheckoutViewModel LJLILLLLZI;
    public final /* synthetic */ CheckoutUiState LJLJI;
    public final /* synthetic */ C31431Lf LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92777aGD(C92145a61 c92145a61, CheckoutViewModel checkoutViewModel, CheckoutUiState checkoutUiState, C31431Lf c31431Lf) {
        super(2);
        this.LJLIL = c92145a61;
        this.LJLILLLLZI = checkoutViewModel;
        this.LJLJI = checkoutUiState;
        this.LJLJJI = c31431Lf;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91899a23.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk2, 584, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
