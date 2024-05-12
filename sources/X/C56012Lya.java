package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$tryRefreshHomepageData$1", f = "ShopMainViewModel.kt", l = {327}, m = "invokeSuspend")
/* renamed from: X.Lya, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56012Lya extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C34K LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ ShopMainViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56012Lya(ShopMainViewModel shopMainViewModel, InterfaceC67352kd<? super C56012Lya> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = shopMainViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56012Lya(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #0 {all -> 0x00b7, blocks: (B:6:0x0070, B:7:0x0073, B:9:0x0077, B:11:0x007d, B:13:0x0083, B:15:0x0089, B:17:0x008f, B:19:0x009d, B:20:0x00a5, B:22:0x00a9, B:30:0x0019, B:32:0x002e), top: B:2:0x0007 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r4 = 0
            r7 = 0
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 != r3) goto Le
            X.34K r5 = r9.LJLIL
            goto L70
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L16:
            X.C141335gf.LIZJ(r10)
            X.34K r5 = new X.34K     // Catch: java.lang.Throwable -> Lb7
            r5.<init>()     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lb7
            X.Lyi r0 = r0.lv0()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r0.LJLJJLL     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = X.C78685UuP.LJJJZ(r0)     // Catch: java.lang.Throwable -> Lb7
            r5.element = r0     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto La5
            r0 = 2
            X.OSZ[] r6 = new X.OSZ[r0]     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "mall_request_type"
            X.LyU r0 = X.EnumC56006LyU.RETURN_MALL     // Catch: java.lang.Throwable -> Lb7
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            X.OSZ r0 = new X.OSZ     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Lb7
            r6[r4] = r0     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "mall_request_scene"
            java.lang.String r1 = "get_channel_scene_id"
            X.OSZ r0 = new X.OSZ     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Lb7
            r6[r3] = r0     // Catch: java.lang.Throwable -> Lb7
            java.util.Map r6 = X.C113554cx.LJJL(r6)     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lb7
            r0.getClass()     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel.pv0(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "mall"
            X.Lyh r1 = new X.Lyh     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> Lb7
            r9.LJLIL = r5     // Catch: java.lang.Throwable -> Lb7
            r9.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r10 = X.C36669EaH.LIZLLL(r2, r6, r1, r9)     // Catch: java.lang.Throwable -> Lb7
            if (r10 != r8) goto L73
            return r8
        L70:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> Lb7
        L73:
            X.Pbt r10 = (X.C64797Pbt) r10     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto La5
            T r0 = r10.LIZIZ     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La5
            T r0 = r0.data     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse r0 = (com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse) r0     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La5
            com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.PageData r0 = r0.getPageData()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La5
            java.lang.String r2 = r0.getChannelSceneId()     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto La5
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r1 = r9.LJLJI     // Catch: java.lang.Throwable -> Lb7
            X.Lyi r0 = r1.lv0()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r0.LJLLI     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto La5
            X.Lyi r0 = r1.lv0()     // Catch: java.lang.Throwable -> Lb7
            r0.LJLLI = r2     // Catch: java.lang.Throwable -> Lb7
            r5.element = r3     // Catch: java.lang.Throwable -> Lb7
        La5:
            boolean r0 = r5.element     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto Lc0
            X.Ly1 r0 = new X.Ly1     // Catch: java.lang.Throwable -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb7
            X.C2U8.LIZ(r0)     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel r0 = r9.LJLJI     // Catch: java.lang.Throwable -> Lb7
            r0.mv0(r4, r3)     // Catch: java.lang.Throwable -> Lb7
            goto Lc0
        Lb7:
            r0 = move-exception
            java.lang.StackTraceElement[] r1 = r0.getStackTrace()
            r0 = 6
            X.C36746EbW.LIZ(r0, r1)
        Lc0:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56012Lya.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
