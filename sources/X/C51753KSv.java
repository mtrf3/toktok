package X;

import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.repository.LynxMallApiWithPreload;
import yq4.a;

/* renamed from: X.KSv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51753KSv implements InterfaceC51756KSy {
    @Override // X.InterfaceC51756KSy
    public final Object LIZ(String str, int i, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        LynxMallApiWithPreload.LIZ.getClass();
        LynxMallApiWithPreload lynxMallApiWithPreload = C51754KSw.LIZIZ;
        int LJ = C51741KSj.LJ();
        String LIZJ = a.LJIIZILJ().LIZJ();
        if (LIZJ == null) {
            LIZJ = "";
        }
        if (C51749KSr.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        return lynxMallApiWithPreload.getShopMainData("ttmall_homepage", i, LJ, LIZJ, z, str, interfaceC67352kd);
    }
}
