package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$handleRecommendPaymentList$2", f = "OrderSubmitViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ay3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27951Ay3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OrderSubmitViewModel LJLIL;
    public final /* synthetic */ PaymentInfo LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27951Ay3(OrderSubmitViewModel orderSubmitViewModel, PaymentInfo paymentInfo, boolean z, InterfaceC67352kd<? super C27951Ay3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = orderSubmitViewModel;
        this.LJLILLLLZI = paymentInfo;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27951Ay3(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x015a, code lost:
    
        if (r1 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d5, code lost:
    
        if (r3 == null) goto L127;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27951Ay3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
