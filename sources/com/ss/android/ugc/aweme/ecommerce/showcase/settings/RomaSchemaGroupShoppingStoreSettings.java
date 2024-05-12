package com.ss.android.ugc.aweme.ecommerce.showcase.settings;

import X.C113554cx;
import X.C58096Mr6;
import X.C76542zS;
import X.OSZ;
import X.PII;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.settings.IRomaSchemaGroupShoppingStoreSettings;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RomaSchemaGroupShoppingStoreSettings implements IRomaSchemaGroupShoppingStoreSettings {
    public static final IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel LIZ = new IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel("sslocal://lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_shop_showcase%2Fpages%2Fshop-store%2Ftemplate.js&__live_platform__=webcast&use_new_container=1&use_spark=1&thread_strategy=2&ab_params=ec_store_lynx_network,shop_recommend_optimize,ec_profile_store_tab_api_optimize&target_handler=webcast", "sslocal://lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_shop_showcase%2Fpages%2Fshop-info%2Ftemplate.js&should_full_screen=1&hide_nav_bar=1&trans_status_bar=1&__live_platform__=webcast&use_spark=1&target_handler=webcast,ecom&business_from=ecom&use_default_loading=1&use_default_failed_view=1", "sslocal://lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_shop_showcase%2Fpages%2Fshop-store-page%2Ftemplate.js&__live_platform__=webcast&use_new_container=1&thread_strategy=2&target_handler=webcast&ab_params=ec_store_lynx_network,shop_promotion_tab_type,shop_active_tab_type,ec_store_cart,shop_promo_enhance,shop_recommend_optimize,shop_product_list_switch,ec_store_page_tab_info_api_parallel,ec_shop_api_parallel");

    public static IRomaSchemaGroupShoppingStoreSettings LIZ() {
        Object LIZ2 = C58096Mr6.LIZ(IRomaSchemaGroupShoppingStoreSettings.class, false);
        if (LIZ2 != null) {
            return (IRomaSchemaGroupShoppingStoreSettings) LIZ2;
        }
        if (C58096Mr6.c0 == null) {
            synchronized (IRomaSchemaGroupShoppingStoreSettings.class) {
                if (C58096Mr6.c0 == null) {
                    C58096Mr6.c0 = new RomaSchemaGroupShoppingStoreSettings();
                }
            }
        }
        return C58096Mr6.c0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.settings.IRomaSchemaGroupShoppingStoreSettings
    public final IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel getValue(String shopId, String str) {
        o.LJIIIZ(shopId, "shopId");
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel romaSchemaGroupShoppingStoreModel = LIZ;
        IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel romaSchemaGroupShoppingStoreModel2 = (IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel) LIZLLL.LJIIIIZZ("roma_schema_group_shopping_store", IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel.class, romaSchemaGroupShoppingStoreModel);
        if (romaSchemaGroupShoppingStoreModel2 == null) {
            LIZIZ(C113554cx.LJJLIIIIJ(new OSZ("shop_id", shopId), new OSZ("current_page", str), new OSZ("is_success", 0)), romaSchemaGroupShoppingStoreModel2, str);
            return romaSchemaGroupShoppingStoreModel;
        }
        LIZIZ(C113554cx.LJJLIIIIJ(new OSZ("shop_id", shopId), new OSZ("current_page", str), new OSZ("is_success", 1)), romaSchemaGroupShoppingStoreModel2, str);
        return romaSchemaGroupShoppingStoreModel2;
    }

    public static void LIZIZ(Map map, IRomaSchemaGroupShoppingStoreSettings.RomaSchemaGroupShoppingStoreModel romaSchemaGroupShoppingStoreModel, String str) {
        String str2;
        String str3;
        String str4;
        if (romaSchemaGroupShoppingStoreModel != null && (str4 = romaSchemaGroupShoppingStoreModel.romaSchemaPageShopInfo) != null) {
            map.put("schema", str4);
        }
        map.put("traceparent", PII.LIZIZ());
        C76542zS.LIZ("rd_ttec_store_get_lynx_shopinfo_schema", map);
        if (o.LJ(str, "shop")) {
            if (romaSchemaGroupShoppingStoreModel != null && (str3 = romaSchemaGroupShoppingStoreModel.romaSchemaPageShopPage) != null) {
                map.put("schema", str3);
            }
        } else if (o.LJ(str, "profile") && romaSchemaGroupShoppingStoreModel != null && (str2 = romaSchemaGroupShoppingStoreModel.romaSchemaPageShopStore) != null) {
            map.put("schema", str2);
        }
        map.put("traceparent", PII.LIZIZ());
        C76542zS.LIZ("rd_ttec_store_get_lynx_shop_schema", map);
    }
}
