package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import java.util.LinkedHashMap;

/* renamed from: X.FCb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38577FCb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2, boolean z3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("previous_page", ED2.LIZ(str));
        linkedHashMap.put("enter_from", ECommerceMallService.v3().i3());
        linkedHashMap.put("deeplink_type", ED2.LIZ(str2));
        linkedHashMap.put("top_product_ids", ED2.LIZ(str3));
        linkedHashMap.put("creative_id", ED2.LIZ(str4));
        linkedHashMap.put("campaign_id", ED2.LIZ(str5));
        linkedHashMap.put("url", ED2.LIZ(str6));
        linkedHashMap.put("schema", ED2.LIZ(str7));
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("error_msg", ED2.LIZ(str8));
        linkedHashMap.put("is_popup", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("has_mall_tab", Integer.valueOf(z3 ? 1 : 0));
        C38583FCh.LIZ(linkedHashMap);
        C76542zS.LIZ("rd_tiktokec_deeplink_start", linkedHashMap);
    }
}
