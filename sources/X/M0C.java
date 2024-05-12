package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel$loadData$2$mainDataSsResponse$1", f = "ShopMainLynxViewModel.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M0C extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<java.util.Map<String, ? extends Object>>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShopMainLynxViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0C(ShopMainLynxViewModel shopMainLynxViewModel, InterfaceC67352kd<? super M0C> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = shopMainLynxViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new M0C(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<java.util.Map<String, ? extends Object>>>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC51756KSy interfaceC51756KSy = (InterfaceC51756KSy) this.LJLILLLLZI.LJLJL.getValue().getOperator();
            ShopMainFragment.LJZ.getClass();
            String str = ShopMainFragment.LLFFF;
            if (str == null) {
                str = "";
            }
            this.LJLIL = 1;
            obj = interfaceC51756KSy.LIZ(str, 0, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
