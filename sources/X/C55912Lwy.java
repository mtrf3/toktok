package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.api.MallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;

/* renamed from: X.Lwy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55912Lwy implements InterfaceC56027Lyp {
    @Override // X.InterfaceC56027Lyp
    public final Object LJI(InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>> interfaceC67352kd) {
        MallApiWithPreload.LIZ.getClass();
        return C55910Lww.LIZ(C30N.LIZIZ, "tool_panel_refresh", 0, null, interfaceC67352kd, 30);
    }

    @Override // X.InterfaceC56027Lyp
    public final Object LJLIIIL(InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>> interfaceC67352kd) {
        MallApiWithPreload.LIZ.getClass();
        return C55910Lww.LIZ(C30N.LIZIZ, "get_channel_scene_id", 0, null, interfaceC67352kd, 30);
    }

    @Override // X.InterfaceC56027Lyp
    public final Object LIZ(String str, int i, InterfaceC67352kd interfaceC67352kd) {
        MallApiWithPreload.LIZ.getClass();
        return C55910Lww.LIZ(C30N.LIZIZ, "ttmall_homepage", i, str, interfaceC67352kd, 20);
    }

    @Override // X.InterfaceC56027Lyp
    public final Object LJJJJZ(int i, String str, String str2, String str3, InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>> interfaceC67352kd) {
        MallApiWithPreload.LIZ.getClass();
        return C30N.LIZIZ.refreshShopMainData("ttmall_homepage", i, C55909Lwv.LIZLLL(), str, str2, str3, interfaceC67352kd);
    }
}
