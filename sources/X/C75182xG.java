package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl$prefetchPin$2", f = "ECommerceLiveServiceImpl.kt", l = {117}, m = "invokeSuspend")
/* renamed from: X.2xG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75182xG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super BaseResponse<PopProductResp>>, Object> {
    public int LJLIL;
    public final /* synthetic */ HashMap<String, String> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75182xG(HashMap<String, String> hashMap, long j, InterfaceC67352kd<? super C75182xG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = hashMap;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75182xG(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
                ProductListApi productListApi = (ProductListApi) C67332kb.LIZ().create(ProductListApi.class);
                if (this.LJLILLLLZI.size() <= 0 || !this.LJLILLLLZI.containsKey("traffic_source_list")) {
                    str = "";
                } else {
                    str = String.valueOf(this.LJLILLLLZI.get("traffic_source_list"));
                }
                String LJII = M2T.LJII(str);
                long j = this.LJLJI;
                this.LJLIL = 1;
                obj = productListApi.queryPin(j, 1, LJII, 0, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            BaseResponse baseResponse = (BaseResponse) c64797Pbt.LIZIZ;
            if (baseResponse.getData() == null) {
                C71150RwA.LIZIZ(String.valueOf(this.LJLJI), "", true, true);
            }
            S52.LIZ(c64797Pbt, String.valueOf(this.LJLJI), false);
            return baseResponse;
        } catch (Exception e) {
            C71150RwA.LIZIZ(String.valueOf(this.LJLJI), e.getMessage(), true, false);
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super BaseResponse<PopProductResp>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
