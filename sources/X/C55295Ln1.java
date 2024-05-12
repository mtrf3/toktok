package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunFeedViewModel$refresh$1", f = "MallRacunFeedViewModel.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.Ln1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55295Ln1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C55289Lmv LJLJI;
    public final /* synthetic */ M89 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55295Ln1(C55289Lmv c55289Lmv, M89 m89, InterfaceC67352kd<? super C55295Ln1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c55289Lmv;
        this.LJLJJI = m89;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55295Ln1(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLILLLLZI
            r9 = 0
            r1 = 1
            if (r0 == 0) goto L4c
            if (r0 != r1) goto L9c
            java.lang.Object r8 = r10.LJLIL
            java.lang.String r8 = (java.lang.String) r8
            X.C141335gf.LIZJ(r11)
        L11:
            X.Pbt r11 = (X.C64797Pbt) r11
            if (r11 == 0) goto L32
            T r0 = r11.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L32
            T r9 = r0.data
            com.ss.android.ugc.aweme.ecommerce.mall.bean.MallCommonFeedModel r9 = (com.ss.android.ugc.aweme.ecommerce.mall.bean.MallCommonFeedModel) r9
            if (r9 == 0) goto L32
            java.util.List r4 = r9.getFeedList()
            if (r4 == 0) goto L32
            X.Lmv r3 = r10.LJLJI
            X.M89 r2 = r10.LJLJJI
            java.lang.String r0 = r9.getRequestId()
            r3.LJIIJ(r4, r2, r1, r0)
        L32:
            X.Lmv r2 = r10.LJLJI
            if (r9 == 0) goto L40
            java.lang.Boolean r0 = r9.getHasMore()
            if (r0 == 0) goto L40
            boolean r1 = r0.booleanValue()
        L40:
            r0 = 0
            r2.LJIIJJI(r8, r1, r0)
            X.Lmv r0 = r10.LJLJI
            r0.LJIIIZ(r9)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4c:
            X.C141335gf.LIZJ(r11)
            X.Lmv r0 = r10.LJLJI     // Catch: java.lang.NumberFormatException -> L64
            java.lang.String r0 = r0.LJLLJ     // Catch: java.lang.NumberFormatException -> L64
            if (r0 != 0) goto L5f
            X.M89 r0 = r10.LJLJJI     // Catch: java.lang.NumberFormatException -> L64
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.getAid()     // Catch: java.lang.NumberFormatException -> L64
            if (r0 == 0) goto L64
        L5f:
            long r5 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L64
            goto L66
        L64:
            r5 = 0
        L66:
            X.Lmv r0 = r10.LJLJI
            T r0 = r0.mData
            com.ss.android.ugc.aweme.ecommerce.mall.bean.MallCommonFeedModel r0 = (com.ss.android.ugc.aweme.ecommerce.mall.bean.MallCommonFeedModel) r0
            if (r0 == 0) goto L9a
            java.lang.Integer r0 = r0.getNextCursor()
            if (r0 == 0) goto L9a
            int r4 = r0.intValue()
        L78:
            X.Lmv r0 = r10.LJLJI
            com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunTabInfo r0 = r0.LJLJL
            if (r0 == 0) goto L84
            java.lang.String r8 = r0.getScene()
            if (r8 != 0) goto L86
        L84:
            java.lang.String r8 = "ttmall_content_channel_explore"
        L86:
            X.Ln9 r3 = new X.Ln9
            X.Lmv r7 = r10.LJLJI
            r3.<init>(r4, r5, r7, r8, r9)
            r10.LJLIL = r8
            r10.LJLILLLLZI = r1
            java.lang.String r0 = "mall_racun_channel"
            java.lang.Object r11 = X.C36669EaH.LIZLLL(r0, r9, r3, r10)
            if (r11 != r2) goto L11
            return r2
        L9a:
            r4 = 1
            goto L78
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55295Ln1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
