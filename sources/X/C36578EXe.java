package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.util.EcomBcToggleUtil$checkIfSelfSale$1$1", f = "EcomBcToggleUtil.kt", l = {137}, m = "invokeSuspend")
/* renamed from: X.EXe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36578EXe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36578EXe(String str, InterfaceC67352kd<? super C36578EXe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36578EXe(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (X.C71227RxP.LIZ != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLIL
            r3 = 1
            if (r0 == 0) goto L47
            if (r0 != r3) goto L57
            X.C141335gf.LIZJ(r5)
        Lc:
            com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse r5 = (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse) r5
            if (r5 == 0) goto L3c
            java.lang.Object r0 = r5.getData()
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.SaleMode r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.SaleMode) r0
            if (r0 == 0) goto L3c
            boolean r0 = r0.selfSale
            X.C71227RxP.LIZ = r0
            com.bytedance.android.live.slot.IBcToggleService r1 = X.C71227RxP.LIZIZ()
            boolean r0 = X.C71227RxP.LIZ
            r1.pq0(r0)
            int r0 = X.C71227RxP.LIZIZ
            r2 = 2
            if (r0 != r2) goto L3f
            boolean r0 = X.C71227RxP.LIZ
            if (r0 == 0) goto L45
        L2e:
            java.lang.String r0 = X.C71227RxP.LIZLLL
            if (r0 == 0) goto L3c
            X.C71227RxP.LIZIZ = r2
            com.bytedance.android.live.slot.IBcToggleService r1 = X.C71227RxP.LIZIZ()
            r0 = 0
            r1.os0(r2, r3, r0)
        L3c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3f:
            boolean r0 = X.C71227RxP.LIZ
            if (r0 == 0) goto L45
            r2 = 0
            goto L2e
        L45:
            r2 = 1
            goto L2e
        L47:
            X.C141335gf.LIZJ(r5)
            X.EXf r1 = com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.BcToggleApi.LIZ
            java.lang.String r0 = r4.LJLILLLLZI
            r4.LJLIL = r3
            java.lang.Object r5 = r1.LIZ(r0, r4)
            if (r5 != r2) goto Lc
            return r2
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36578EXe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
