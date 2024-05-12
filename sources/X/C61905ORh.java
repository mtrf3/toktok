package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabShowcaseFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseProductRequest;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabShowcaseFragment$prefetchAsync$1", f = "TabShowcaseFragment.kt", l = {219}, m = "invokeSuspend")
/* renamed from: X.ORh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61905ORh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super TemplateData>, Object> {
    public int LJLIL;
    public final /* synthetic */ TabShowcaseFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61905ORh(TabShowcaseFragment tabShowcaseFragment, String str, String str2, InterfaceC67352kd<? super C61905ORh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tabShowcaseFragment;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C61905ORh(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String LIZ;
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
                List LIZIZ = M2U.LIZIZ(this.LJLILLLLZI.LJLJLJ, "search_card_live_product_id_list");
                List LIZIZ2 = M2U.LIZIZ(this.LJLILLLLZI.LJLJLJ, "search_card_no_live_product_id_list");
                String str2 = this.LJLILLLLZI.Jl().secId;
                String str3 = this.LJLJI;
                String enterFrom = this.LJLILLLLZI.getEnterFrom();
                String str4 = this.LJLJJI;
                PageSourceInfo LJ = C39468FeK.LJ(new PageSource(this.LJLILLLLZI.getBtmPageCode(), null, 2, null));
                if (LJ != null) {
                    str = C27739Aud.LJI(LJ);
                } else {
                    str = null;
                }
                ShowcaseProductRequest showcaseProductRequest = new ShowcaseProductRequest(str2, str3, enterFrom, null, 0, null, LIZIZ, LIZIZ2, str4, str, 56, null);
                ShopApi shopApi = (ShopApi) C67332kb.LIZ().create(ShopApi.class);
                this.LJLIL = 1;
                obj2 = shopApi.getTabShowcaseProducts(showcaseProductRequest, this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (String) obj2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            if (e2 instanceof C64799Pbv) {
                i = ((C64799Pbv) e2).getStatusCode();
            } else {
                i = -106;
            }
            LIZ = C10120aW.LIZ("{\"code\":", i, '}');
        }
        TabShowcaseFragment tabShowcaseFragment = this.LJLILLLLZI;
        String str5 = this.LJLJJI;
        tabShowcaseFragment.getClass();
        TemplateData LJLIL = C61491OBj.LJLIL(new OSZ("recommend_context", str5), new OSZ("profile_tab_product_list", LIZ));
        if (LJLIL != null) {
            return LJLIL;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super TemplateData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
