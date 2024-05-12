package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ProductListRequestBody;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$productsAsync$2", f = "TabStoreFragment.kt", l = {244}, m = "invokeSuspend")
/* renamed from: X.ORi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61906ORi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Response<m>>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ TabStoreFragment LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61906ORi(String str, TabStoreFragment tabStoreFragment, String str2, InterfaceC67352kd<? super C61906ORi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = tabStoreFragment;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C61906ORi(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj2);
            } else {
                C141335gf.LIZJ(obj2);
                String str2 = this.LJLILLLLZI;
                if (C52235Kel.LIZ()) {
                    i = 10;
                } else {
                    i = 20;
                }
                TabStoreFragment tabStoreFragment = this.LJLJI;
                String str3 = tabStoreFragment.LLFF;
                String enterFrom = tabStoreFragment.getEnterFrom();
                List LIZIZ = M2U.LIZIZ(this.LJLJI.LJLJLJ, "search_card_live_product_id_list");
                List LIZIZ2 = M2U.LIZIZ(this.LJLJI.LJLJLJ, "search_card_no_live_product_id_list");
                TabStoreFragment tabStoreFragment2 = this.LJLJI;
                int[] iArr = tabStoreFragment2.LJLJL;
                String str4 = this.LJLJJI;
                PageSourceInfo LJ = C39468FeK.LJ(new PageSource(tabStoreFragment2.getBtmPageCode(), null, 2, null));
                if (LJ != null) {
                    str = C27739Aud.LJI(LJ);
                } else {
                    str = null;
                }
                ProductListRequestBody productListRequestBody = new ProductListRequestBody(str2, null, 0, 0, i, str3, enterFrom, null, null, "profile_tab_store", null, null, null, null, LIZIZ, LIZIZ2, null, null, iArr, null, null, str4, str, 1785230, null);
                ShopApi shopApi = (ShopApi) C67332kb.LIZ().create(ShopApi.class);
                this.LJLIL = 1;
                obj2 = shopApi.getProductListResponse(productListRequestBody, this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            Response response = (Response) obj2;
            if (response != null && response.data != 0 && C00F.LIZ(31744, 0, "ec_store_tab_product_cache", true) > 0) {
                new C65312hL(response, this.LJLILLLLZI);
                return response;
            }
            return response;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Response<m>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
