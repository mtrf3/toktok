package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryServiceViewHolder;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryServiceViewHolder$onBind$1$1", f = "PdpDeliveryServiceViewHolder.kt", l = {39}, m = "invokeSuspend")
/* renamed from: X.AfF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26785AfF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpDeliveryServiceViewHolder LJLILLLLZI;
    public final /* synthetic */ C26786AfG LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26785AfF(PdpDeliveryServiceViewHolder pdpDeliveryServiceViewHolder, C26786AfG c26786AfG, InterfaceC67352kd<? super C26785AfF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpDeliveryServiceViewHolder;
        this.LJLJI = c26786AfG;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26785AfF(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r1 != null) goto L13;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r6 = 1
            if (r0 == 0) goto Lf
            if (r0 != r6) goto L47
            X.C141335gf.LIZJ(r8)
        Lc:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lf:
            X.C141335gf.LIZJ(r8)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryServiceViewHolder r0 = r7.LJLILLLLZI
            androidx.fragment.app.Fragment r0 = r0.LJLIL
            androidx.fragment.app.FragmentManager r4 = r0.getChildFragmentManager()
            X.AfG r0 = r7.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping r1 = r0.LJLILLLLZI
            r3 = 0
            if (r1 == 0) goto L43
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService r0 = r1.shippingService
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServicePopup r2 = r0.shippingServicePopup
        L27:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService r0 = r1.shippingService
            if (r0 == 0) goto L2d
            java.lang.String r3 = r0.shippingRightsContent
        L2d:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryServiceViewHolder r0 = r7.LJLILLLLZI
            android.view.View r1 = r0.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.Rtn r0 = X.C78948Uye.LJIILIIL(r1)
            r7.LJLIL = r6
            java.lang.Object r0 = X.C26725AeH.LIZ(r4, r2, r3, r0, r7)
            if (r0 != r5) goto Lc
            return r5
        L43:
            r2 = r3
            if (r1 == 0) goto L2d
            goto L27
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26785AfF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
