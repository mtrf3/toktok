package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$startCollectingPaymentInfo$1$4", f = "PaymentViewModel.kt", l = {1003}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class B1I extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PaymentViewModel LJLILLLLZI;
    public final /* synthetic */ PaymentInfo LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1I(PaymentViewModel paymentViewModel, PaymentInfo paymentInfo, InterfaceC67352kd<? super B1I> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = paymentViewModel;
        this.LJLJI = paymentInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new B1I(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L96
            if (r0 != r5) goto Lc1
            X.C141335gf.LIZJ(r8)
        Ld:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodDetails r8 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodDetails) r8
            if (r8 == 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r7.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto L92
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO> r0 = r0.neededElementDTOS
        L19:
            java.util.List r2 = r8.convertToElements(r0)
            if (r2 == 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r7.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto L2a
            java.lang.String r4 = r0.LJFF()
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LIZ(r4, r2)
        L2d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r7.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r5 = r0.paymentMethodInfo
            if (r5 != 0) goto L44
        L33:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r3 = r7.LJLILLLLZI
            kotlin.jvm.internal.AqS170S0100000_4 r2 = new kotlin.jvm.internal.AqS170S0100000_4
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r1 = r7.LJLJI
            r0 = 18
            r2.<init>(r1, r0)
            r3.setState(r2)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L44:
            X.SAN r1 = X.SAN.LIZ
            java.util.List r0 = r5.getPaymentElements()
            r1.getClass()
            java.util.List r0 = X.SAN.LJI(r0, r2)
            if (r0 != 0) goto L59
            X.OQg r3 = X.C61878OQg.INSTANCE
        L55:
            r5.setPaymentElements(r3)
            goto L33
        L59:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r1
            java.lang.String r0 = r1.getElement()
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L67
            java.lang.String r0 = r1.getElement()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L67
            java.lang.String r0 = r1.getElement()
            r4.add(r0)
            r3.add(r1)
            goto L67
        L92:
            r0 = r4
            goto L19
        L94:
            r2 = r4
            goto L2d
        L96:
            X.C141335gf.LIZJ(r8)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r1 = r7.LJLILLLLZI
            X.B1d r0 = X.C28101B1d.LJLIL
            r1.setState(r0)
            X.SAN r3 = X.SAN.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r7.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto Lbf
            java.lang.String r2 = r0.token
        Laa:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.LJZ
            if (r0 == 0) goto Lbd
            java.lang.String r1 = r0.pipoHost
        Lb2:
            r7.LJLIL = r5
            java.lang.String r0 = "payment_method"
            java.lang.Object r8 = r3.LIZIZ(r2, r1, r0, r7)
            if (r8 != r6) goto Ld
            return r6
        Lbd:
            r1 = r4
            goto Lb2
        Lbf:
            r2 = r4
            goto Laa
        Lc1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
