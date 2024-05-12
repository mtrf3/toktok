package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequestV2$1$deferred$1$2$response$1", f = "StoreFragment.kt", l = {331}, m = "invokeSuspend")
/* renamed from: X.2tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72812tR extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Response<m>>, Object> {
    public int LJLIL;
    public final /* synthetic */ m LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72812tR(m mVar, InterfaceC67352kd<? super C72812tR> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = mVar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72812tR(this.LJLILLLLZI, interfaceC67352kd);
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
            m mVar = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = shopApi.getShopHomepageV2(mVar, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
