package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.helper.OrderSubmitPrefetchHelper$asyncFetchBillInfo$2", f = "OrderSubmitPrefetchHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AwI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27842AwI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C27954Ay6 LJLILLLLZI;
    public final /* synthetic */ BillInfoRequest LJLJI;
    public final /* synthetic */ C27837AwD LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27842AwI(C27954Ay6 c27954Ay6, BillInfoRequest billInfoRequest, C27837AwD c27837AwD, InterfaceC67352kd<? super C27842AwI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c27954Ay6;
        this.LJLJI = billInfoRequest;
        this.LJLJJI = c27837AwD;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C27842AwI c27842AwI = new C27842AwI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c27842AwI.LJLIL = obj;
        return c27842AwI;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        Boolean bool = ECOspOptimizedV2.LIZ().enableChunk;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            C27954Ay6 c27954Ay6 = this.LJLILLLLZI;
            c27954Ay6.LJLJJL = XKX.LIZIZ(interfaceC70422pa, null, null, new C27843AwJ(c27954Ay6, this.LJLJI, this.LJLJJI, null), 3);
        } else {
            C27954Ay6 c27954Ay62 = this.LJLILLLLZI;
            c27954Ay62.LJLJJI = XKX.LIZIZ(interfaceC70422pa, null, null, new C27841AwH(c27954Ay62, this.LJLJI, this.LJLJJI, null), 3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
