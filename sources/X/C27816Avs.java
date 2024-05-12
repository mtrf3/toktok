package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$queryBillInfo$3", f = "OrderSubmitViewModel.kt", l = {1215}, m = "invokeSuspend")
/* renamed from: X.Avs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27816Avs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;
    public final /* synthetic */ C68322mC<BillInfoRequest> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC43919HLn<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27816Avs(OrderSubmitViewModel orderSubmitViewModel, C68322mC<BillInfoRequest> c68322mC, boolean z, boolean z2, boolean z3, InterfaceC43919HLn<C76800UCe> interfaceC43919HLn, InterfaceC67352kd<? super C27816Avs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitViewModel;
        this.LJLJI = c68322mC;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = z3;
        this.LJLJL = interfaceC43919HLn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27816Avs(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLIL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L75
            if (r0 != r2) goto L9f
            X.C141335gf.LIZJ(r11)
        Ld:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r11 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r11
        Lf:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r2 = r10.LJLILLLLZI
            if (r11 == 0) goto L73
            int r1 = r11.code
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
        L1e:
            r2.LJZL = r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r1 = r10.LJLILLLLZI
            boolean r0 = r1.LLJJJJJIL
            r4 = 0
            if (r0 == 0) goto L48
            r1.LLJJJJJIL = r4
            if (r11 == 0) goto L3d
            T r0 = r11.data
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r0
            if (r0 == 0) goto L3d
            java.util.List r0 = r0.getNewShopOrders()
            if (r0 == 0) goto L3d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L48
        L3d:
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r2 = com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter.LJ()
            java.lang.String r1 = "restore_sku_quantity_event"
            java.lang.String r0 = "{}"
            r2.LIZ(r1, r0)
        L48:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r2 = r10.LJLILLLLZI
            r2.LLJJLIIIJLLLLLLLZ = r4
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 1235(0x4d3, float:1.73E-42)
            r1.<init>(r2, r0)
            r2.withState(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r4 = r10.LJLILLLLZI
            if (r11 == 0) goto L5e
            T r3 = r11.data
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r3
        L5e:
            X.2mC<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest> r0 = r10.LJLJI
            T r2 = r0.element
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest) r2
            boolean r1 = r10.LJLJJL
            boolean r0 = r10.LJLJJLL
            r4.Lv0(r3, r2, r1, r0)
            X.HLn<X.UCe> r1 = r10.LJLJL
            X.UCe r0 = X.C76800UCe.LIZ
            r1.LJ(r0)
            return r0
        L73:
            r0 = r3
            goto L1e
        L75:
            X.C141335gf.LIZJ(r11)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r1 = r10.LJLILLLLZI
            X.Ay6 r5 = r1.LLILL
            if (r5 == 0) goto L9c
            X.2mC<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest> r0 = r10.LJLJI
            T r6 = r0.element
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r6 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest) r6
            boolean r0 = r1.LLI
            r7 = r0 ^ 1
            java.util.HashMap<java.lang.String, java.lang.Object> r8 = r1.LLIL
            if (r8 != 0) goto L91
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L91:
            boolean r9 = r10.LJLJJI
            r10.LJLIL = r2
            java.lang.Object r11 = r5.LLLZZIL(r6, r7, r8, r9, r10)
            if (r11 != r4) goto Ld
            return r4
        L9c:
            r11 = r3
            goto Lf
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27816Avs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
