package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnFeed;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$addOnWriteImpression$1", f = "OrderSubmitViewModel.kt", l = {1096}, m = "invokeSuspend")
/* renamed from: X.Aye, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27988Aye extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<AddOnFeed> LJLILLLLZI;
    public final /* synthetic */ OrderSubmitViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27988Aye(List<AddOnFeed> list, OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C27988Aye> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27988Aye(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Throwable unused) {
            C78983UzD.LJIILL("addon write impression Fail");
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            AddOnWriteImpressionRequest addOnWriteImpressionRequest = new AddOnWriteImpressionRequest("checkout_page_shipping_recommend", this.LJLILLLLZI);
            if (this.LJLJI.LLILL != null) {
                this.LJLIL = 1;
                obj = C27954Ay6.LLLLZ(addOnWriteImpressionRequest, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
