package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl$prefetchPin$1", f = "ECommerceLiveServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75192xH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super BaseResponse<PopProductResp>>, Object> {
    public final /* synthetic */ HashMap<String, String> LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75192xH(HashMap<String, String> hashMap, long j, InterfaceC67352kd<? super C75192xH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = hashMap;
        this.LJLILLLLZI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75192xH(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        ProductListApi productListApi = (ProductListApi) C67332kb.LIZ().create(ProductListApi.class);
        if (this.LJLIL.size() <= 0 || !this.LJLIL.containsKey("traffic_source_list")) {
            str = "";
        } else {
            str = String.valueOf(this.LJLIL.get("traffic_source_list"));
        }
        try {
            C64797Pbt<BaseResponse<PopProductResp>> execute = productListApi.getIntroduceProduct(String.valueOf(this.LJLILLLLZI), null, new Integer(1), M2T.LJII(str), 0, null).execute();
            BaseResponse<PopProductResp> baseResponse = execute.LIZIZ;
            if (baseResponse.getData() == null) {
                C71150RwA.LIZIZ(String.valueOf(this.LJLILLLLZI), "", true, true);
            }
            S52.LIZ(execute, String.valueOf(this.LJLILLLLZI), false);
            return baseResponse;
        } catch (Exception e) {
            C71150RwA.LIZIZ(String.valueOf(this.LJLILLLLZI), e.getMessage(), true, false);
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super BaseResponse<PopProductResp>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
