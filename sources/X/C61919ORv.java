package X;

import com.google.gson.j;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopPromoPriorityFilter;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$loadProductsFilterData$1$1$1", f = "StoreFragment.kt", l = {482}, m = "invokeSuspend")
/* renamed from: X.ORv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61919ORv extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Response<j>>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61919ORv(StoreFragment storeFragment, InterfaceC67352kd<? super C61919ORv> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C61919ORv(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Response<j>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ShopPromoPriorityFilter shopPromoPriorityFilter;
        String str2;
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
            ShopApi shopApi = (ShopApi) C67332kb.LIZ().create(ShopApi.class);
            StoreFragment storeFragment = this.LJLILLLLZI;
            String str3 = storeFragment.LJLLILLLL;
            C61918ORu c61918ORu = storeFragment.LJLILLLLZI;
            String str4 = null;
            if (c61918ORu != null) {
                str = c61918ORu.LJFF;
            } else {
                str = null;
            }
            if (o.LJ(str, "coupon_center_page")) {
                int value = EnumC46456ILc.VOUCHER.getValue();
                C61918ORu c61918ORu2 = storeFragment.LJLILLLLZI;
                if (c61918ORu2 == null || (str2 = c61918ORu2.LJII) == null) {
                    str2 = "";
                }
                shopPromoPriorityFilter = new ShopPromoPriorityFilter(value, str2);
            } else {
                shopPromoPriorityFilter = new ShopPromoPriorityFilter(0, null, 3, null);
            }
            String LJI = C27739Aud.LJI(shopPromoPriorityFilter);
            C61918ORu c61918ORu3 = this.LJLILLLLZI.LJLILLLLZI;
            if (c61918ORu3 != null) {
                str4 = c61918ORu3.LIZJ;
            }
            this.LJLIL = 1;
            obj = shopApi.getShopHomepageProductFilterList(str3, LJI, str4, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
