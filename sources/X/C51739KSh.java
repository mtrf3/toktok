package X;

import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.model.MallV3Cache;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel$preloadLocalImage$1", f = "ShopMainLynxViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.KSh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51739KSh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C51739KSh(InterfaceC67352kd<? super C51739KSh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C51739KSh(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        List list;
        C141335gf.LIZJ(obj);
        MallV3Cache LIZIZ = C51751KSt.LIZIZ();
        if (LIZIZ != null) {
            java.util.Map<String, Object> data = LIZIZ.getData();
            List list2 = null;
            if (data != null) {
                bool = C35685DzV.LIZ(data);
                list = C35685DzV.LIZIZ(data);
                list2 = C35685DzV.LIZJ(data);
            } else {
                bool = null;
                list = null;
            }
            C51741KSj.LIZ(bool, list, list2, EnumC51740KSi.LOAD_IN_MALL.getPageName(), EnumC51744KSm.LOCAL_FIRST_REQUEST.getValue());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C51739KSh(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
