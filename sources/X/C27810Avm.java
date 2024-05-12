package X;

import Y.AfS56S0100000_4;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$checkBillInfoAndFetch$5", f = "OrderSubmitViewModel.kt", l = {863}, m = "invokeSuspend")
/* renamed from: X.Avm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27810Avm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27810Avm(OrderSubmitViewModel orderSubmitViewModel, int i, InterfaceC67352kd<? super C27810Avm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitViewModel;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27810Avm(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C84661XKn c84661XKn;
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
            C27954Ay6 c27954Ay6 = this.LJLILLLLZI.LLILL;
            if (c27954Ay6 != null && (c84661XKn = c27954Ay6.LJLJJL) != null) {
                this.LJLIL = 1;
                obj = c84661XKn.LJJIJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        AbstractC73672Svk abstractC73672Svk = (AbstractC73672Svk) obj;
        if (abstractC73672Svk != null) {
            C73454SsE LJJJ = abstractC73672Svk.LJJJ(C73969T1h.LIZIZ());
            OrderSubmitViewModel orderSubmitViewModel = this.LJLILLLLZI;
            LJJJ.LJJJLIIL(new C27809Avl(orderSubmitViewModel, this.LJLJI), new AfS56S0100000_4(orderSubmitViewModel, 18));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
