package X;

import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import kotlin.jvm.internal.o;

/* renamed from: X.aEp, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92691aEp extends AbstractC65781Prl implements InterfaceC88472Yns<Methods, C76800UCe> {
    public final /* synthetic */ Methods LJLIL;
    public final /* synthetic */ C92283a8F LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC91961a33, String, Object, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC91961a33 LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92691aEp(Methods methods, C92283a8F c92283a8F, InterfaceC88473Ynt<? super InterfaceC91961a33, ? super String, Object, C76800UCe> interfaceC88473Ynt, InterfaceC91961a33 interfaceC91961a33, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.LJLIL = methods;
        this.LJLILLLLZI = c92283a8F;
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = interfaceC91961a33;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Methods it) {
        o.LJIIIZ(it, "it");
        String paymentMethod = this.LJLIL.getPaymentMethod();
        if (paymentMethod == null) {
            paymentMethod = "";
        }
        this.LJLILLLLZI.LJI(paymentMethod, this.LJLIL.getPaymentMethodId(), null, false);
        this.LJLILLLLZI.LJIIIZ();
        this.LJLJI.invoke(this.LJLJJI, null, null);
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }
}
