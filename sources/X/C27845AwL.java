package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitStarter$openCombineActivity$2$1", f = "OrderSubmitStarter.kt", l = {314}, m = "invokeSuspend")
/* renamed from: X.AwL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27845AwL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AbstractC73672Svk<BillInfoResponse>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C27954Ay6 LJLILLLLZI;
    public final /* synthetic */ BillInfoRequest LJLJI;
    public final /* synthetic */ HashMap<String, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27845AwL(C27954Ay6 c27954Ay6, BillInfoRequest billInfoRequest, HashMap<String, Object> hashMap, InterfaceC67352kd<? super C27845AwL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c27954Ay6;
        this.LJLJI = billInfoRequest;
        this.LJLJJI = hashMap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27845AwL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            HashMap<String, Object> hashMap = this.LJLJJI;
            this.LJLIL = 1;
            obj = c27954Ay6.LLZILL(billInfoRequest, true, hashMap, false, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AbstractC73672Svk<BillInfoResponse>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
