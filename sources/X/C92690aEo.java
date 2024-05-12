package X;

import com.bytedance.pipo.checkout.api.network.model.response.Methods;

/* renamed from: X.aEo, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92690aEo extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Methods LJLIL;
    public final /* synthetic */ C92283a8F LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC91961a33, String, Object, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC91961a33 LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92690aEo(Methods methods, C92283a8F c92283a8F, InterfaceC88473Ynt<? super InterfaceC91961a33, ? super String, Object, C76800UCe> interfaceC88473Ynt, InterfaceC91961a33 interfaceC91961a33, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.LJLIL = methods;
        this.LJLILLLLZI = c92283a8F;
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = interfaceC91961a33;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String paymentMethod = this.LJLIL.getPaymentMethod();
        if (paymentMethod == null) {
            paymentMethod = "";
        }
        this.LJLILLLLZI.LJI(paymentMethod, null, null, false);
        this.LJLILLLLZI.LJIIIZ();
        this.LJLJI.invoke(this.LJLJJI, null, null);
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }
}
