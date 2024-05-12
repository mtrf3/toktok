package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadRemoteToolbarData$1", f = "ShopMainViewModel.kt", l = {408}, m = "invokeSuspend")
/* renamed from: X.Lyb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56013Lyb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShopMainViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56013Lyb(ShopMainViewModel shopMainViewModel, InterfaceC67352kd<? super C56013Lyb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = shopMainViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56013Lyb(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        ShopMainResponse shopMainResponse;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                java.util.Map LJJL = C113554cx.LJJL(new OSZ("mall_request_type", new Integer(EnumC56006LyU.RETURN_MALL.getType())), new OSZ("mall_request_scene", "tool_panel_refresh"));
                this.LJLILLLLZI.getClass();
                ShopMainViewModel.pv0(LJJL);
                C56018Lyg c56018Lyg = new C56018Lyg(this.LJLILLLLZI, null);
                this.LJLIL = 1;
                obj = C36669EaH.LIZLLL("mall", LJJL, c56018Lyg, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            if (c64797Pbt != null && (response = (Response) c64797Pbt.LIZIZ) != null && ((ShopMainResponse) response.data) != null && response.isCodeOK() && (shopMainResponse = (ShopMainResponse) response.data) != null) {
                ShopMainViewModel shopMainViewModel = this.LJLILLLLZI;
                shopMainViewModel.getClass();
                C78565UsT.LJJIJIIJI(shopMainViewModel, C78613UtF.LIZJ, new C56014Lyc(shopMainViewModel, shopMainResponse, null));
            }
        } catch (Exception e) {
            C36746EbW.LIZ(6, e.getStackTrace());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
