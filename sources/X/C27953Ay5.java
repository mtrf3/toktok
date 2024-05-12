package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$createOrder$1$4", f = "OrderSubmitViewModel.kt", l = {3225}, m = "invokeSuspend")
/* renamed from: X.Ay5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27953Ay5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public long LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ OrderSubmitViewModel LJLJJI;
    public final /* synthetic */ OrderSubmitState LJLJJL;
    public final /* synthetic */ Boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ Context LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27953Ay5(OrderSubmitViewModel orderSubmitViewModel, OrderSubmitState orderSubmitState, Boolean bool, String str, Context context, InterfaceC67352kd<? super C27953Ay5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = orderSubmitViewModel;
        this.LJLJJL = orderSubmitState;
        this.LJLJJLL = bool;
        this.LJLJL = str;
        this.LJLJLJ = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27953Ay5(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r5 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ac A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #0 {all -> 0x00c7, blocks: (B:8:0x009d, B:10:0x00ac, B:23:0x002a, B:25:0x0037, B:27:0x004a, B:29:0x005e, B:31:0x0064, B:33:0x007c, B:34:0x0080, B:38:0x008f), top: B:22:0x002a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r6 = r12
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            long r8 = r11.LJLILLLLZI
            java.lang.Object r10 = r11.LJLIL
            java.lang.String r10 = (java.lang.String) r10
            goto L94
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C141335gf.LIZJ(r6)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "randomUUID().toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r10, r0)
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r11.LJLJJI     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r0.tw0()     // Catch: java.lang.Throwable -> Lc7
            r6 = 0
            if (r0 == 0) goto L8f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc7
            X.OSZ r1 = new X.OSZ     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "skip_duplicated_order_check"
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lc7
            java.util.Map r0 = X.C51029K0z.LJJIIZI(r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = X.C27739Aud.LJI(r0)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L8f
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc7
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r11.LJLJJI     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r0.LLIZLLLIL     // Catch: java.lang.Throwable -> Lc7
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r5 == 0) goto L8f
        L5e:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r4 = r11.LJLJJI     // Catch: java.lang.Throwable -> Lc7
            X.Ay6 r0 = r4.LLILL     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState r1 = r11.LJLJJL     // Catch: java.lang.Throwable -> Lc7
            java.lang.Boolean r0 = r11.LJLJJLL     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest r0 = r4.Sv0(r1, r0, r10)     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest r1 = r0.LIZIZ(r5)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r11.LJLJL     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest r1 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r11.LJLJJI     // Catch: java.lang.Throwable -> Lc7
            java.lang.Integer r0 = r0.LLJLLL     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L80
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> Lc7
        L80:
            r1.LIZ = r6     // Catch: java.lang.Throwable -> Lc7
            r11.LJLIL = r10     // Catch: java.lang.Throwable -> Lc7
            r11.LJLILLLLZI = r8     // Catch: java.lang.Throwable -> Lc7
            r11.LJLJI = r2     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r6 = X.C27954Ay6.LLLLZLLLI(r1, r11)     // Catch: java.lang.Throwable -> Lc7
            if (r6 != r3) goto L97
            goto L9c
        L8f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r11.LJLJJI     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = r0.LLIZLLLIL     // Catch: java.lang.Throwable -> Lc7
            goto L5e
        L94:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Throwable -> L9a
        L97:
            X.AzF r6 = (X.C28025AzF) r6     // Catch: java.lang.Throwable -> L9a
            goto L9d
        L9a:
            r7 = move-exception
            goto Lc8
        L9c:
            return r3
        L9d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r4 = r11.LJLJJI     // Catch: java.lang.Throwable -> Lc7
            android.content.Context r5 = r11.LJLJLJ     // Catch: java.lang.Throwable -> Lc7
            r2 = 0
            r7 = r2
            r4.ow0(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r11.LJLJJI     // Catch: java.lang.Throwable -> Lc7
            int r0 = r0.LJLJJLL     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Ld2
            com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent r0 = new com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent     // Catch: java.lang.Throwable -> Lc7
            r1 = 1
            r7 = 62
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r8 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = X.C27739Aud.LJI(r0)     // Catch: java.lang.Throwable -> Lc7
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r1 = com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter.LJ()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "ec_cart_refresh"
            r1.LIZ(r0, r2)     // Catch: java.lang.Throwable -> Lc7
            goto Ld2
        Lc7:
            r7 = move-exception
        Lc8:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r4 = r11.LJLJJI
            android.content.Context r5 = r11.LJLJLJ
            r6 = 0
            r8 = -1
            r4.ow0(r5, r6, r7, r8, r10)
        Ld2:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27953Ay5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
