package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;

/* renamed from: X.aFz, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92763aFz extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<CheckoutNavBarState, C76800UCe> LJLIL;
    public final /* synthetic */ C92145a61 LJLILLLLZI;
    public final /* synthetic */ C92283a8F LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92763aFz(InterfaceC88472Yns<? super CheckoutNavBarState, C76800UCe> interfaceC88472Yns, C92145a61 c92145a61, C92283a8F c92283a8F, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i) {
        super(2);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = c92145a61;
        this.LJLJI = c92283a8F;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91897a21.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1);
        return C76800UCe.LIZ;
    }
}
