package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM$clearCurShopTabUI$1$1", f = "CustomDotVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECB extends AbstractC65782Prm implements InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super Response<CustomDotResponse>>, Object> {
    public ECB(InterfaceC67352kd<? super ECB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECB(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return new Response(0, "success", new CustomDotResponse(null, null, null, null, null, null), null, 8, null);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Boolean bool, InterfaceC67352kd<? super Response<CustomDotResponse>> interfaceC67352kd) {
        bool.booleanValue();
        return new ECB(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
