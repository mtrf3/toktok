package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.api.MallApiWithPreload;

/* renamed from: X.Lww, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55910Lww {
    public static Object LIZ(MallApiWithPreload mallApiWithPreload, String str, int i, String str2, InterfaceC67352kd interfaceC67352kd, int i2) {
        int i3;
        int i4 = i;
        String str3 = str2;
        boolean z = false;
        if ((i2 & 2) != 0) {
            i4 = 0;
        }
        if ((i2 & 4) != 0) {
            i3 = C55909Lwv.LIZLLL();
        } else {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        if ((i2 & 16) != 0 && ((Number) C52997Kr3.LIZ.getValue()).intValue() != 0) {
            z = true;
        }
        return mallApiWithPreload.getShopMainData(str, i4, i3, str3, z, interfaceC67352kd);
    }
}
