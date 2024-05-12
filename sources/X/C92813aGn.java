package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;

/* renamed from: X.aGn, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92813aGn extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ CheckoutNavBarState LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<Float> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92813aGn(CheckoutNavBarState checkoutNavBarState, InterfaceC65784Pro<Float> interfaceC65784Pro, String str, int i, String str2, Object obj, String str3) {
        super(2);
        this.LJLIL = checkoutNavBarState;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = obj;
        this.LJLJL = str3;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C06480Ng.LIZIZ(this.LJLIL.getCurrentRoute(), null, C92821aGv.LJLIL, null, C1DJ.LJ(interfaceC24520xk2, -819889020, new C92824aGy(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL)), interfaceC24520xk2, 24960, 10);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
