package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.KAk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51274KAk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, java.util.Map map) {
        boolean z;
        if (i == EnumC51280KAq.MALL.getValue() || i == EnumC51280KAq.HOMEPAGE_MALL.getValue() || i == EnumC51280KAq.MALL_UG_DEEPLINK.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            map.put("root_enter_from_type", Integer.valueOf(i));
            map.put("middle_req_source", KB5.SOURCE_MALL_MIDDLE.getValue());
            map.put("middle_sug_source", EnumC51289KAz.SOURCE_SHOP.getValue());
            map.put("result_source", EnumC51288KAy.SOURCE_MALL.getValue());
            map.put("result_channel", KB7.CHANNEL_MALL.getValue());
            map.put("result_type", EnumC51287KAx.TYPE_MALL.getValue());
        } else if (i == EnumC51280KAq.FASHION.getValue()) {
            map.put("root_enter_from_type", Integer.valueOf(i));
            map.put("middle_req_source", KB5.SOURCE_MALL_MIDDLE.getValue());
            map.put("middle_sug_source", EnumC51289KAz.SOURCE_SHOP.getValue());
            map.put("disable_history_strategy", "disable_history_from_fashion");
            map.put("disable_sug_strategy", "disable_sug_from_fashion");
            map.put("disable_guess_strategy", "disable_guess_from_fashion");
            map.put("result_source", EnumC51288KAy.SOURCE_FASHION.getValue());
            map.put("result_channel", KB7.CHANNEL_FASHION.getValue());
            map.put("result_type", EnumC51287KAx.TYPE_FASHION.getValue());
        } else if (i == EnumC51280KAq.ORDER.getValue()) {
            map.put("middle_search_position", "order_list_page");
            map.put("result_type", "order_list_page");
        } else if (i == EnumC51280KAq.HALF_SHOP.getValue()) {
            map.put("result_channel", KB7.CHANNEL_HALF_SHOP.getValue());
            map.put("result_source", EnumC51288KAy.SOURCE_HALF_SHOP.getValue());
            map.put("result_type", EnumC51287KAx.TYPE_HALF_SHOP.getValue());
        } else if (i == EnumC51280KAq.FROM_HALF_SHOP.getValue()) {
            map.put("middle_req_source", KB5.SOURCE_FROM_HALF_SHOP.getValue());
            map.put("middle_sug_source", EnumC51289KAz.SOURCE_FROM_HALF_SHOP.getValue());
            map.put("result_channel", KB7.CHANNEL_FROM_HALF_SHOP.getValue());
            map.put("result_source", EnumC51288KAy.SOURCE_FROM_HALF_SHOP.getValue());
            map.put("result_type", EnumC51287KAx.TYPE_FROM_HALF_SHOP.getValue());
        } else if (i == EnumC51280KAq.ORDER_CENTER_WITH_SUGGEST_LIKE.getValue() || i == EnumC51280KAq.ORDER_DETAIL_WITH_SUGGEST_LIKE.getValue() || i == EnumC51280KAq.PAY_SUCCESS_WITH_SUGGEST_LIKE.getValue() || i == EnumC51280KAq.DELIVERY_DETAIL_WITH_SUGGEST_LIKE.getValue()) {
            map.put("middle_req_source", KB5.SOURCE_FROM_AFTER_SALE.getValue());
            map.put("middle_sug_source", EnumC51289KAz.SOURCE_FROM_AFTER_SALE.getValue());
        }
        C51276KAm.LIZ.getClass();
        java.util.Map map2 = (java.util.Map) ((java.util.Map) C51276KAm.LIZJ.getValue()).get(String.valueOf(i));
        if (map2 == null) {
            map2 = C113554cx.LJJJLIIL();
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public static boolean LIZIZ(android.net.Uri uri, int i) {
        if (o.LJ(C78939UyV.LJIJJLI(uri, "ec_entrance_new_arch"), "1")) {
            return true;
        }
        KCJ.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        int[] iArr = KCJ.LIZIZ;
        LJIIIZ.getClass();
        int[] iArr2 = (int[]) FFL.LJIJ(true, "ec_search_entrance_block_first_level_params", 31744, int[].class, iArr);
        if (iArr2 != null) {
            iArr = iArr2;
        }
        o.LJIIIIZZ(iArr, "ABManager.getInstance()\n…s::class.java) ?: DEFAULT");
        return !ORY.LJJIJ(i, iArr);
    }
}
