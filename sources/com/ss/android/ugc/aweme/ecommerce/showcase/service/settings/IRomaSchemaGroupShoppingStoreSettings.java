package com.ss.android.ugc.aweme.ecommerce.showcase.service.settings;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public interface IRomaSchemaGroupShoppingStoreSettings {

    /* loaded from: classes11.dex */
    public static final class RomaSchemaGroupShoppingStoreModel {

        @InterfaceC65349Pkn("roma_schema_page_shop_info")
        public final String romaSchemaPageShopInfo;

        @InterfaceC65349Pkn("roma_schema_page_shop_page")
        public final String romaSchemaPageShopPage;

        @InterfaceC65349Pkn("roma_schema_page_shop_store")
        public final String romaSchemaPageShopStore;

        /* JADX WARN: Multi-variable type inference failed */
        public RomaSchemaGroupShoppingStoreModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RomaSchemaGroupShoppingStoreModel)) {
                return false;
            }
            RomaSchemaGroupShoppingStoreModel romaSchemaGroupShoppingStoreModel = (RomaSchemaGroupShoppingStoreModel) obj;
            return o.LJ(this.romaSchemaPageShopStore, romaSchemaGroupShoppingStoreModel.romaSchemaPageShopStore) && o.LJ(this.romaSchemaPageShopInfo, romaSchemaGroupShoppingStoreModel.romaSchemaPageShopInfo) && o.LJ(this.romaSchemaPageShopPage, romaSchemaGroupShoppingStoreModel.romaSchemaPageShopPage);
        }

        public final int hashCode() {
            return this.romaSchemaPageShopPage.hashCode() + C79062V1e.LJ(this.romaSchemaPageShopInfo, this.romaSchemaPageShopStore.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RomaSchemaGroupShoppingStoreModel(romaSchemaPageShopStore=");
            LIZ.append(this.romaSchemaPageShopStore);
            LIZ.append(", romaSchemaPageShopInfo=");
            LIZ.append(this.romaSchemaPageShopInfo);
            LIZ.append(", romaSchemaPageShopPage=");
            return q.LIZIZ(LIZ, this.romaSchemaPageShopPage, ')', LIZ);
        }

        public RomaSchemaGroupShoppingStoreModel(String str, String str2, String str3) {
            HH1.LIZ(str, "romaSchemaPageShopStore", str2, "romaSchemaPageShopInfo", str3, "romaSchemaPageShopPage");
            this.romaSchemaPageShopStore = str;
            this.romaSchemaPageShopInfo = str2;
            this.romaSchemaPageShopPage = str3;
        }

        public /* synthetic */ RomaSchemaGroupShoppingStoreModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "sslocal://lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_shop_showcase%2Fpages%2Fshop-store%2Ftemplate.js&__live_platform__=webcast&use_new_container=1&use_spark=1&thread_strategy=2&ab_params=ec_store_lynx_network,shop_recommend_optimize,ec_profile_store_tab_api_optimize&target_handler=webcast" : str, (i & 2) != 0 ? "sslocal://lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_shop_showcase%2Fpages%2Fshop-info%2Ftemplate.js&should_full_screen=1&hide_nav_bar=1&trans_status_bar=1&__live_platform__=webcast&use_spark=1&target_handler=webcast,ecom&business_from=ecom&use_default_loading=1&use_default_failed_view=1" : str2, (i & 4) != 0 ? "sslocal://lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_shop_showcase%2Fpages%2Fshop-store-page%2Ftemplate.js&__live_platform__=webcast&use_new_container=1&thread_strategy=2&target_handler=webcast&ab_params=ec_store_lynx_network,shop_promotion_tab_type,shop_active_tab_type,ec_store_cart,shop_promo_enhance,shop_recommend_optimize,shop_product_list_switch,ec_store_page_tab_info_api_parallel,ec_shop_api_parallel" : str3);
        }
    }

    RomaSchemaGroupShoppingStoreModel getValue(String str, String str2);
}
