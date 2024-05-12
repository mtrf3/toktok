package X;

import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.EcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.ui.ShopMainLynxAssem$sendTabClickEventWhenPageShow$1", f = "ShopMainLynxAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Lzt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56093Lzt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C56093Lzt(InterfaceC67352kd<? super C56093Lzt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56093Lzt(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        boolean LIZJ = C51751KSt.LIZ.LIZJ();
        c56092Lzs.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("page_name", "mall");
        hashMap.put("tab_name", "mall");
        hashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        hashMap.put("enter_from", C56092Lzs.LIZJ());
        hashMap.put("enter_method", "switch_tab");
        if (LIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_data_cache", str);
        hashMap.put("coldboot_to_click_duration", Long.valueOf(M0M.LIZIZ));
        hashMap.put("is_ug_allowlist_user", EcUgNewInstallService.LIZLLL().LIZ().getSecond());
        hashMap.putAll(C56092Lzs.LJ());
        C56092Lzs.LJIILJJIL("rd_tiktokec_mall_entrance_click", hashMap);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C56093Lzt(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
