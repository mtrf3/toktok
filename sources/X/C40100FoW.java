package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequest$1$response$2$response$1", f = "StoreFragment.kt", l = {445}, m = "invokeSuspend")
/* renamed from: X.FoW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40100FoW extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Response<m>>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40100FoW(StoreFragment storeFragment, InterfaceC67352kd<? super C40100FoW> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C40100FoW(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Response<m>> interfaceC67352kd) {
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
            ShopApi shopApi = (ShopApi) C67332kb.LIZ().create(ShopApi.class);
            String str = this.LJLILLLLZI.LJLLILLLL;
            this.LJLIL = 1;
            obj = shopApi.getShopHomepage(str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
