package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$handleCreateOrderResult$5$1", f = "OrderSubmitViewModel.kt", l = {3704, 3717, 3718}, m = "invokeSuspend")
/* renamed from: X.Azf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28051Azf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ OrderSubmitViewModel LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ CreateOrderData LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28051Azf(long j, OrderSubmitViewModel orderSubmitViewModel, Context context, CreateOrderData createOrderData, InterfaceC67352kd<? super C28051Azf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = orderSubmitViewModel;
        this.LJLJJI = context;
        this.LJLJJL = createOrderData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28051Azf(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r6 = 3
            r7 = 2
            r4 = 1
            r8 = 0
            if (r0 == 0) goto L2b
            if (r0 == r4) goto L43
            if (r0 == r7) goto L51
            if (r0 != r6) goto L67
            X.C141335gf.LIZJ(r12)
        L13:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r7 = r11.LJLJI
            android.content.Context r6 = r11.LJLJJI
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData r0 = r11.LJLJJL
            java.lang.String r9 = r0.comboId
            r7.getClass()
            kotlin.jvm.internal.AqS29S1300000_4 r5 = new kotlin.jvm.internal.AqS29S1300000_4
            r10 = 2
            r5.<init>(r6, r7, r8, r9, r10)
            r7.withState(r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            X.C141335gf.LIZJ(r12)
            X.UtN r3 = X.C36636EZk.LIZ
            X.Azg r2 = new X.Azg
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r1 = r11.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData r0 = r11.LJLJJL
            r2.<init>(r1, r0, r8)
            r11.LJLIL = r4
            java.lang.Object r0 = X.XKX.LJI(r3, r2, r11)
            if (r0 != r5) goto L46
            return r5
        L43:
            X.C141335gf.LIZJ(r12)
        L46:
            long r0 = r11.LJLILLLLZI
            r11.LJLIL = r7
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r11)
            if (r0 != r5) goto L54
            return r5
        L51:
            X.C141335gf.LIZJ(r12)
        L54:
            X.UtN r2 = X.C36636EZk.LIZ
            X.Azh r1 = new X.Azh
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r11.LJLJI
            r1.<init>(r0, r8)
            r11.LJLIL = r6
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r11)
            if (r0 != r5) goto L13
            return r5
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Azf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
