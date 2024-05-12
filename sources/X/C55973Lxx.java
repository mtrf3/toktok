package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadToolPanelData$1", f = "ShopMainViewModel.kt", l = {926}, m = "invokeSuspend")
/* renamed from: X.Lxx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55973Lxx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ShopMainViewModel LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55973Lxx(ShopMainViewModel shopMainViewModel, long j, int i, InterfaceC67352kd<? super C55973Lxx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = shopMainViewModel;
        this.LJLJJI = j;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55973Lxx c55973Lxx = new C55973Lxx(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c55973Lxx.LJLILLLLZI = obj;
        return c55973Lxx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:8:0x003c, B:9:0x003f, B:10:0x0041, B:12:0x004c, B:14:0x0052, B:16:0x0056, B:17:0x005b, B:19:0x0061, B:21:0x0065, B:22:0x009c, B:24:0x00a2, B:27:0x00a8, B:28:0x0097, B:33:0x001b, B:35:0x0031), top: B:2:0x0007 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r5 = 0
            r4 = 0
            r7 = 1
            if (r0 == 0) goto L14
            if (r0 != r7) goto Lc
            goto L3c
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L14:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r6 = r9.LJLILLLLZI
            X.2pa r6 = (X.InterfaceC70422pa) r6
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r3 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            X.XIA r2 = X.C78613UtF.LIZJ     // Catch: java.lang.Throwable -> Lac
            X.2nN r1 = new X.2nN     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lac
            r0 = 2
            X.XKn r0 = X.XKX.LIZIZ(r6, r2, r4, r1, r0)     // Catch: java.lang.Throwable -> Lac
            r3.LJLIL = r0     // Catch: java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            X.XKn r0 = r0.LJLIL     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L3a
            r9.LJLIL = r7     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r10 = r0.LJJIJ(r9)     // Catch: java.lang.Throwable -> Lac
            if (r10 != r8) goto L3f
            return r8
        L3a:
            r10 = r4
            goto L41
        L3c:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> Lac
        L3f:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r10 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r10     // Catch: java.lang.Throwable -> Lac
        L41:
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            long r1 = r9.LJLJJI     // Catch: java.lang.Throwable -> Lac
            int r3 = r9.LJLJJL     // Catch: java.lang.Throwable -> Lac
            r0.getClass()     // Catch: java.lang.Throwable -> Lac
            if (r10 == 0) goto L97
            boolean r0 = r10.isCodeOK()     // Catch: java.lang.Throwable -> Lac
            if (r0 != r7) goto L9c
            T r0 = r10.data     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto L9c
            java.lang.String r0 = "response_is_empty"
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel.qv0(r3, r5, r1, r0)     // Catch: java.lang.Throwable -> Lac
        L5b:
            boolean r0 = r10.isCodeOK()     // Catch: java.lang.Throwable -> Lac
            if (r0 != r7) goto L97
            T r0 = r10.data     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r6 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            long r0 = r9.LJLJJI     // Catch: java.lang.Throwable -> Lac
            int r3 = r9.LJLJJL     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = ""
            r6.getClass()     // Catch: java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel.qv0(r3, r7, r0, r2)     // Catch: java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            X.Lyi r0 = r0.lv0()     // Catch: java.lang.Throwable -> Lac
            r0.LJLLLL = r7     // Catch: java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r1 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            T r0 = r10.data     // Catch: java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallToolPanelData r0 = (com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallToolPanelData) r0     // Catch: java.lang.Throwable -> Lac
            java.util.List r3 = r1.iv0(r0)     // Catch: java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r2 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            kotlin.jvm.internal.AqS140S0200000_9 r1 = new kotlin.jvm.internal.AqS140S0200000_9     // Catch: java.lang.Throwable -> Lac
            r0 = 86
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> Lac
            r2.withState(r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "UpdateToolPanel request new user tool panel"
            r0 = 3
            X.C36746EbW.LIZ(r0, r1)     // Catch: java.lang.Throwable -> Lac
        L97:
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lac
            r0.LJLIL = r4     // Catch: java.lang.Throwable -> Lac
            goto Lc1
        L9c:
            boolean r0 = r10.isCodeOK()     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto L5b
            java.lang.String r0 = r10.message     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto La8
            java.lang.String r0 = "api_fail"
        La8:
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel.qv0(r3, r5, r1, r0)     // Catch: java.lang.Throwable -> Lac
            goto L5b
        Lac:
            r0 = move-exception
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r4 = r9.LJLJI
            long r2 = r9.LJLJJI
            int r1 = r9.LJLJJL
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "api_error"
        Lbb:
            r4.getClass()
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel.qv0(r1, r5, r2, r0)
        Lc1:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55973Lxx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
