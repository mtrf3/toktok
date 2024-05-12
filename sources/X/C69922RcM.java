package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$fetchShopRecommendData$1$1", f = "PdpViewModel.kt", l = {4865}, m = "invokeSuspend")
/* renamed from: X.RcM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69922RcM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public PdpViewModel LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ PdpViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69922RcM(View view, PdpViewModel pdpViewModel, InterfaceC67352kd<? super C69922RcM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = view;
        this.LJLJJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69922RcM(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLILLLLZI
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 != r1) goto Lc7
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r3 = r14.LJLIL
            X.C141335gf.LIZJ(r15)
        Le:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse r15 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse) r15
            r3.LLLILZLLLI = r15
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r2 = r14.LJLJJI
            kotlin.jvm.internal.AqS178S0100000_12 r1 = new kotlin.jvm.internal.AqS178S0100000_12
            r0 = 70
            r1.<init>(r2, r0)
            r2.setState(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L21:
            X.C141335gf.LIZJ(r15)
            android.view.View r0 = r14.LJLJI
            r13 = 0
            if (r0 == 0) goto Lc3
            X.Rtn r3 = X.C78948Uye.LJIILIIL(r0)
            if (r3 == 0) goto Lc3
            java.lang.String r0 = "lib_track_builtin_lane_business"
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r3 = X.C78948Uye.LJIILJJIL(r3, r0)
            if (r3 == 0) goto Lc4
            java.lang.String r0 = "first_source_page"
            java.lang.Object r6 = r3.get(r0)
        L3d:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto Lc1
            java.lang.String r6 = (java.lang.String) r6
        L43:
            if (r3 == 0) goto Lbf
            java.lang.String r0 = "enter_from_info"
            java.lang.Object r7 = r3.get(r0)
        L4b:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto Lbd
            java.lang.String r7 = (java.lang.String) r7
        L51:
            if (r3 == 0) goto Lbb
            java.lang.String r0 = "author_id"
            java.lang.Object r8 = r3.get(r0)
        L59:
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lb9
            java.lang.String r8 = (java.lang.String) r8
        L5f:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r4 = r14.LJLJJI
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r4.LJLJLLL
            if (r0 == 0) goto Lb7
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo r0 = r0.sellerInfo
            if (r0 == 0) goto Lb7
            java.lang.String r10 = r0.sellerId
        L6b:
            X.RfF r3 = com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r4.LJLJJLL
            r3.getClass()
            int r11 = X.C70101RfF.LIZIZ(r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r14.LJLJJI
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r0.LJLJJLL
            if (r0 == 0) goto L83
            java.util.HashMap r0 = r0.getTrackParams()
            if (r0 != 0) goto L88
        L83:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L88:
            int[] r0 = X.M2T.LJFF(r0)
            if (r0 == 0) goto L94
            java.util.List r12 = X.ORY.LJJZ(r0)
            if (r12 != 0) goto L96
        L94:
            X.OQg r12 = X.C61878OQg.INSTANCE
        L96:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r3 = r14.LJLJJI
            X.Rf5 r4 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.LIZ
            java.lang.String r5 = r3.jw0()
            java.lang.String r9 = "pdp_shop_recommend"
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r14.LJLJJI
            java.lang.Integer r0 = r0.Wv0()
            if (r0 == 0) goto Lac
            java.lang.String r13 = r0.toString()
        Lac:
            r14.LJLIL = r3
            r14.LJLILLLLZI = r1
            java.lang.Object r15 = r4.LJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 != r2) goto Le
            return r2
        Lb7:
            r10 = r13
            goto L6b
        Lb9:
            r8 = r13
            goto L5f
        Lbb:
            r8 = r13
            goto L59
        Lbd:
            r7 = r13
            goto L51
        Lbf:
            r7 = r13
            goto L4b
        Lc1:
            r6 = r13
            goto L43
        Lc3:
            r3 = r13
        Lc4:
            r6 = r13
            goto L3d
        Lc7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69922RcM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
