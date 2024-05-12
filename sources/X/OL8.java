package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.api.VSAApi;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.vsa.manager.EcUgVSAManager$preloadProductData$1$1$response$1", f = "EcUgVSAManager.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OL8 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<VSAProductCardsResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<VSAProductCardsRequest.ProductInfo> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OL8(String str, List list, InterfaceC67352kd interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new OL8(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<VSAProductCardsResponse>>> interfaceC67352kd) {
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
            OLD old = ((OLE) OL3.LIZ.getValue()).LIZ;
            List<VSAProductCardsRequest.ProductInfo> list = this.LJLILLLLZI;
            String str = this.LJLJI;
            this.LJLIL = 1;
            old.getClass();
            VSAApi.LIZ.getClass();
            obj = OLB.LIZIZ.fetchVSAProductCards(new VSAProductCardsRequest(list, str), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
