package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadRemoteToolbarData$1$mainDataSsResponse$1", f = "ShopMainViewModel.kt", l = {409}, m = "invokeSuspend")
/* renamed from: X.Lyg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56018Lyg extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShopMainViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56018Lyg(ShopMainViewModel shopMainViewModel, InterfaceC67352kd<? super C56018Lyg> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = shopMainViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56018Lyg(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>> interfaceC67352kd) {
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
            InterfaceC56027Lyp interfaceC56027Lyp = (InterfaceC56027Lyp) this.LJLILLLLZI.LJLJI.getValue().getOperator();
            this.LJLIL = 1;
            obj = interfaceC56027Lyp.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
