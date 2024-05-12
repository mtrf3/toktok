package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RwA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71150RwA {
    public static int LIZ;
    public static String LIZIZ;
    public static final boolean LIZJ = C19N.LJ("ecom_live_exception_switch", false);

    public static void LIZJ(String str, String str2, boolean z) {
        if (!LIZJ) {
            return;
        }
        EnumC53638L3i enumC53638L3i = EnumC53638L3i.SHOP_BAG_LIST;
        LinkedHashMap LIZ2 = C0JU.LIZ("room_id", str);
        LIZ2.put("is_data_empty", Integer.valueOf(z ? 1 : 0));
        C66832jn.LIZIZ("rd_tiktokec_shop_bag_list_exception", enumC53638L3i, 1020, str2, LIZ2);
    }

    public static final void LIZ(String str, String role, String str2, boolean z) {
        int i;
        o.LJIIIZ(role, "role");
        if (!LIZJ) {
            return;
        }
        if (z) {
            i = 1002;
        } else {
            i = 1001;
        }
        C66832jn.LIZIZ("rd_tiktokec_shop_bag_icon_exception", EnumC53638L3i.SHOP_BAG_ICON, Integer.valueOf(i), str2, JF1.LIZIZ("room_id", str, "live_role", role));
    }

    public static final void LIZIZ(String str, String str2, boolean z, boolean z2) {
        if (!LIZJ) {
            return;
        }
        EnumC53638L3i enumC53638L3i = EnumC53638L3i.PIN_CARD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("room_id", str);
        linkedHashMap.put("is_prefetch", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_data_empty", Integer.valueOf(z2 ? 1 : 0));
        C66832jn.LIZIZ("rd_tiktokec_pop_product_exception", enumC53638L3i, 1001, str2, linkedHashMap);
    }
}
