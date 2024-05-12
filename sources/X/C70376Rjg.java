package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSettingConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rjg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70376Rjg {
    public static final /* synthetic */ C70376Rjg LIZ = new C70376Rjg();

    public static void LIZLLL(C70376Rjg c70376Rjg, Context context, String str, String str2, Integer num, String str3, HashMap hashMap) {
        c70376Rjg.getClass();
        LIZJ(c70376Rjg, context, str, 2, "order_submit", 3, str3, hashMap, str2, num, null, null, null, null, null, null, null, 251904);
    }

    public final void LIZ(Context context, String schema, String str, HashMap hashMap, String str2, String str3, String str4, Boolean bool, String str5, String str6, List list) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("entrance_name", "product_detail_coupon");
        linkedHashMap.put("entrance_link", schema);
        C76542zS.LIZ("rd_page_entrance_click", linkedHashMap);
        LIZJ(this, context, schema, 1, "product_detail", 2, str, hashMap, null, null, str2, str3, str4, bool, str5, str6, list, 1792);
    }

    public static void LIZJ(C70376Rjg c70376Rjg, Context context, String str, int i, String str2, int i2, String str3, HashMap hashMap, String str4, Integer num, String str5, String str6, String str7, Boolean bool, String str8, String str9, List list, int i3) {
        String str10;
        Object obj;
        HashMap hashMap2 = hashMap;
        String str11 = str3;
        String str12 = str4;
        String str13 = str;
        List list2 = list;
        String str14 = str5;
        Integer num2 = num;
        String str15 = str6;
        String str16 = str9;
        String str17 = str7;
        String str18 = str8;
        if ((i3 & 32) != 0) {
            str11 = null;
        }
        if ((i3 & 64) != 0) {
            hashMap2 = null;
        }
        if ((i3 & 256) != 0) {
            str12 = null;
        }
        if ((i3 & 1024) != 0) {
            num2 = null;
        }
        if ((i3 & 2048) != 0) {
            str14 = null;
        }
        if ((i3 & 4096) != 0) {
            str15 = null;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            str17 = null;
        }
        if ((i3 & 16384) != 0) {
            bool = null;
        }
        if ((32768 & i3) != 0) {
            str18 = null;
        }
        if ((65536 & i3) != 0) {
            str16 = null;
        }
        if ((i3 & 131072) != 0) {
            list2 = null;
        }
        c70376Rjg.getClass();
        if (str13.length() == 0) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            ECSettingConfig eCSettingConfig = C2Q7.LIZ;
            ECSettingConfig eCSettingConfig2 = (ECSettingConfig) LIZLLL.LJIIIIZZ("ecom_settings_config", ECSettingConfig.class, eCSettingConfig);
            if (eCSettingConfig2 != null) {
                eCSettingConfig = eCSettingConfig2;
            }
            str13 = eCSettingConfig.couponPanelSchema;
            if (str13 == null) {
                str13 = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_coupon_panel%2Fpages%2Fcoupon%2Ftemplate.js&gravity=bottom&type=popup&hide_nav_bar=1&hide_status_bar=1&web_bg_color=ffffff&show_dim=1&mask_alpha=0.5";
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", Integer.valueOf(i));
        linkedHashMap.put("previous_page", str2);
        linkedHashMap.put("from_type", Integer.valueOf(i2));
        if (str11 != null) {
            linkedHashMap.put("entrance_info", str11);
        }
        linkedHashMap.put("use_lynx_net_ability", 1);
        linkedHashMap.put("enable_code_cache", 1);
        if (i2 != 2) {
            if (i2 == 3) {
                linkedHashMap.put("lru_cache_init", C27739Aud.LJI(C47261Igj.LJJIJ(C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "order_submit_coupon"), new OSZ("key", str12)))));
            }
        } else {
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ(WM7.SCENE_SERVICE, "product_detail_coupon");
            if (hashMap2 != null && (obj = hashMap2.get("product_id")) != null) {
                str10 = obj.toString();
            } else {
                str10 = null;
            }
            oszArr[1] = new OSZ("key", str10);
            linkedHashMap.put("lru_cache_init", C27739Aud.LJI(C47261Igj.LJJIJ(C113554cx.LJJL(oszArr))));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (hashMap2 != null) {
            linkedHashMap2.putAll(hashMap2);
        }
        if (str18 != null) {
            linkedHashMap2.put("source_info", str18);
        }
        linkedHashMap2.put("previous_page", "product_detail");
        linkedHashMap.put("trackParams", linkedHashMap2);
        if (bool != null) {
            linkedHashMap.put("from_fullscreen_pdp", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (list2 != null) {
            linkedHashMap.put("seller_ids", list2);
        }
        if (num2 != null) {
            num2.intValue();
            linkedHashMap.put("voucher_type", num2);
        }
        if (str12 != null) {
            linkedHashMap.put("popup_promotion_cache_key", str12);
        }
        linkedHashMap.put("height", Integer.valueOf(KL2.LJIILL(EF7.LIZIZ(), C27162AlK.LIZIZ())));
        linkedHashMap.put("init_time", Long.valueOf(System.currentTimeMillis()));
        if (str14 != null) {
            linkedHashMap.put("pageParams", str14);
        }
        if (str15 != null) {
            linkedHashMap.put("couponlist_entrance", str15);
        }
        if (str17 != null) {
            linkedHashMap.put("traffic_source", str17);
        }
        if (str16 != null) {
            linkedHashMap.put("sku_id", str16);
        }
        linkedHashMap.put("radius", 10);
        C26867AgZ.LIZIZ(context, str13, linkedHashMap, false).open();
    }
}
