package X;

import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;

/* renamed from: X.aEn, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92689aEn extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C92283a8F LJLIL;
    public final /* synthetic */ StoredMethods LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC91961a33, String, Object, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC91961a33 LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92689aEn(C92283a8F c92283a8F, StoredMethods storedMethods, InterfaceC88473Ynt<? super InterfaceC91961a33, ? super String, Object, C76800UCe> interfaceC88473Ynt, InterfaceC91961a33 interfaceC91961a33, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.LJLIL = c92283a8F;
        this.LJLILLLLZI = storedMethods;
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = interfaceC91961a33;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C92283a8F c92283a8F = this.LJLIL;
        String paymentMethod = this.LJLILLLLZI.getPaymentMethod();
        if (paymentMethod == null) {
            paymentMethod = "";
        }
        c92283a8F.LJI(paymentMethod, this.LJLILLLLZI.getPaymentMethodId(), this.LJLILLLLZI.getPaymentMethodToken(), true);
        this.LJLIL.LJIIIZ();
        this.LJLJI.invoke(this.LJLJJI, null, null);
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }
}
