package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$cancelOrder$1", f = "OrderSubmitViewModel.kt", l = {4844}, m = "invokeSuspend")
/* renamed from: X.AyE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27962AyE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27962AyE(OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C27962AyE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27962AyE(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            C27965AyH c27965AyH = OrderSubmitApi.LIZ;
            List<String> list = this.LJLILLLLZI.LLJZIJLIL.LIZ;
            String str2 = null;
            if (list != null) {
                str = (String) ORZ.LJLLLL(list);
            } else {
                str = null;
            }
            CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(str, this.LJLILLLLZI.LLJZIJLIL.LIZIZ, "ecom_order_unpaid_canceled_reason_no_longer_needed", new Integer(1), new Integer(100));
            Integer num = this.LJLILLLLZI.LLJLLL;
            if (num != null) {
                str2 = num.toString();
            }
            cancelOrderRequest.LIZ = str2;
            this.LJLIL = 1;
            if (c27965AyH.LIZ(cancelOrderRequest, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
