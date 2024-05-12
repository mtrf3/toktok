package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$checkAndUpdateBillInfoData$1", f = "OrderSubmitViewModel.kt", l = {1319}, m = "invokeSuspend")
/* renamed from: X.Ay4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27952Ay4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public OrderSubmitViewModel LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ BillInfoData LJLJI;
    public final /* synthetic */ OrderSubmitViewModel LJLJJI;
    public final /* synthetic */ BillInfoRequest LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27952Ay4(BillInfoData billInfoData, OrderSubmitViewModel orderSubmitViewModel, BillInfoRequest billInfoRequest, boolean z, boolean z2, InterfaceC67352kd<? super C27952Ay4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = billInfoData;
        this.LJLJJI = orderSubmitViewModel;
        this.LJLJJL = billInfoRequest;
        this.LJLJJLL = z;
        this.LJLJL = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27952Ay4(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x011c, code lost:
    
        if (r3.isEmpty() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7.getBeginRenderChunk(), r4) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ea, code lost:
    
        if (r3.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010a, code lost:
    
        if (r3.isEmpty() != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27952Ay4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
