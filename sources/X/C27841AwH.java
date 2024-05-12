package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.helper.OrderSubmitPrefetchHelper$asyncFetchBillInfo$2$2", f = "OrderSubmitPrefetchHelper.kt", l = {118}, m = "invokeSuspend")
/* renamed from: X.AwH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27841AwH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super BillInfoResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ C27954Ay6 LJLILLLLZI;
    public final /* synthetic */ BillInfoRequest LJLJI;
    public final /* synthetic */ C27837AwD LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27841AwH(C27954Ay6 c27954Ay6, BillInfoRequest billInfoRequest, C27837AwD c27837AwD, InterfaceC67352kd<? super C27841AwH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c27954Ay6;
        this.LJLJI = billInfoRequest;
        this.LJLJJI = c27837AwD;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27841AwH(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C27954Ay6 c27954Ay6 = this.LJLILLLLZI;
            BillInfoRequest billInfoRequest = this.LJLJI;
            HashMap<String, Object> hashMap = this.LJLJJI.LIZLLL;
            this.LJLIL = 1;
            obj = c27954Ay6.LLLZZIL(billInfoRequest, true, hashMap, false, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super BillInfoResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
