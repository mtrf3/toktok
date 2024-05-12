package com.ss.android.ugc.aweme.ab;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class RomaSchemaGroupSearchSettings {
    public static final RomaSchemaGroupSearchModel LIZ;

    /* loaded from: classes9.dex */
    public static final class RomaSchemaGroupSearchModel {

        @InterfaceC65349Pkn("roma_schema_page_brand_sale")
        public final String romaSchemaPageBrandSearch;

        @InterfaceC65349Pkn("roma_schema_page_channel_search_page")
        public final String romaSchemaPageFashionSearch;

        @InterfaceC65349Pkn("roma_schema_page_filter_panel")
        public final String romaSchemaPageFilterPanel;

        @InterfaceC65349Pkn("roma_schema_page_filter_panel_new")
        public final String romaSchemaPageFilterPanelNew;

        @InterfaceC65349Pkn("roma_schema_page_flash_sale")
        public final String romaSchemaPageFlashSearch;

        @InterfaceC65349Pkn("roma_schema_page_image_search")
        public final String romaSchemaPageImageSearch;

        @InterfaceC65349Pkn("roma_schema_page_live_tab")
        public final String romaSchemaPageLiveTab;

        @InterfaceC65349Pkn("roma_schema_page_order_list_search")
        public final String romaSchemaPageOrderStoreTab;

        @InterfaceC65349Pkn("roma_schema_page_store_search")
        public final String romaSchemaPageStoreSearch;

        @InterfaceC65349Pkn("roma_schema_page_store_tab")
        public final String romaSchemaPageStoreTab;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RomaSchemaGroupSearchModel)) {
                return false;
            }
            RomaSchemaGroupSearchModel romaSchemaGroupSearchModel = (RomaSchemaGroupSearchModel) obj;
            return o.LJ(this.romaSchemaPageStoreSearch, romaSchemaGroupSearchModel.romaSchemaPageStoreSearch) && o.LJ(this.romaSchemaPageFilterPanel, romaSchemaGroupSearchModel.romaSchemaPageFilterPanel) && o.LJ(this.romaSchemaPageImageSearch, romaSchemaGroupSearchModel.romaSchemaPageImageSearch) && o.LJ(this.romaSchemaPageStoreTab, romaSchemaGroupSearchModel.romaSchemaPageStoreTab) && o.LJ(this.romaSchemaPageFilterPanelNew, romaSchemaGroupSearchModel.romaSchemaPageFilterPanelNew) && o.LJ(this.romaSchemaPageFashionSearch, romaSchemaGroupSearchModel.romaSchemaPageFashionSearch) && o.LJ(this.romaSchemaPageFlashSearch, romaSchemaGroupSearchModel.romaSchemaPageFlashSearch) && o.LJ(this.romaSchemaPageBrandSearch, romaSchemaGroupSearchModel.romaSchemaPageBrandSearch) && o.LJ(this.romaSchemaPageLiveTab, romaSchemaGroupSearchModel.romaSchemaPageLiveTab) && o.LJ(this.romaSchemaPageOrderStoreTab, romaSchemaGroupSearchModel.romaSchemaPageOrderStoreTab);
        }

        public final int hashCode() {
            return this.romaSchemaPageOrderStoreTab.hashCode() + C79062V1e.LJ(this.romaSchemaPageLiveTab, C79062V1e.LJ(this.romaSchemaPageBrandSearch, C79062V1e.LJ(this.romaSchemaPageFlashSearch, C79062V1e.LJ(this.romaSchemaPageFashionSearch, C79062V1e.LJ(this.romaSchemaPageFilterPanelNew, C79062V1e.LJ(this.romaSchemaPageStoreTab, C79062V1e.LJ(this.romaSchemaPageImageSearch, C79062V1e.LJ(this.romaSchemaPageFilterPanel, this.romaSchemaPageStoreSearch.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RomaSchemaGroupSearchModel(romaSchemaPageStoreSearch=");
            LIZ.append(this.romaSchemaPageStoreSearch);
            LIZ.append(", romaSchemaPageFilterPanel=");
            LIZ.append(this.romaSchemaPageFilterPanel);
            LIZ.append(", romaSchemaPageImageSearch=");
            LIZ.append(this.romaSchemaPageImageSearch);
            LIZ.append(", romaSchemaPageStoreTab=");
            LIZ.append(this.romaSchemaPageStoreTab);
            LIZ.append(", romaSchemaPageFilterPanelNew=");
            LIZ.append(this.romaSchemaPageFilterPanelNew);
            LIZ.append(", romaSchemaPageFashionSearch=");
            LIZ.append(this.romaSchemaPageFashionSearch);
            LIZ.append(", romaSchemaPageFlashSearch=");
            LIZ.append(this.romaSchemaPageFlashSearch);
            LIZ.append(", romaSchemaPageBrandSearch=");
            LIZ.append(this.romaSchemaPageBrandSearch);
            LIZ.append(", romaSchemaPageLiveTab=");
            LIZ.append(this.romaSchemaPageLiveTab);
            LIZ.append(", romaSchemaPageOrderStoreTab=");
            return q.LIZIZ(LIZ, this.romaSchemaPageOrderStoreTab, ')', LIZ);
        }

        public RomaSchemaGroupSearchModel(String romaSchemaPageStoreSearch, String romaSchemaPageFilterPanel, String romaSchemaPageImageSearch, String romaSchemaPageStoreTab, String romaSchemaPageFilterPanelNew, String romaSchemaPageFashionSearch, String romaSchemaPageFlashSearch, String romaSchemaPageBrandSearch, String romaSchemaPageLiveTab, String romaSchemaPageOrderStoreTab) {
            o.LJIIIZ(romaSchemaPageStoreSearch, "romaSchemaPageStoreSearch");
            o.LJIIIZ(romaSchemaPageFilterPanel, "romaSchemaPageFilterPanel");
            o.LJIIIZ(romaSchemaPageImageSearch, "romaSchemaPageImageSearch");
            o.LJIIIZ(romaSchemaPageStoreTab, "romaSchemaPageStoreTab");
            o.LJIIIZ(romaSchemaPageFilterPanelNew, "romaSchemaPageFilterPanelNew");
            o.LJIIIZ(romaSchemaPageFashionSearch, "romaSchemaPageFashionSearch");
            o.LJIIIZ(romaSchemaPageFlashSearch, "romaSchemaPageFlashSearch");
            o.LJIIIZ(romaSchemaPageBrandSearch, "romaSchemaPageBrandSearch");
            o.LJIIIZ(romaSchemaPageLiveTab, "romaSchemaPageLiveTab");
            o.LJIIIZ(romaSchemaPageOrderStoreTab, "romaSchemaPageOrderStoreTab");
            this.romaSchemaPageStoreSearch = romaSchemaPageStoreSearch;
            this.romaSchemaPageFilterPanel = romaSchemaPageFilterPanel;
            this.romaSchemaPageImageSearch = romaSchemaPageImageSearch;
            this.romaSchemaPageStoreTab = romaSchemaPageStoreTab;
            this.romaSchemaPageFilterPanelNew = romaSchemaPageFilterPanelNew;
            this.romaSchemaPageFashionSearch = romaSchemaPageFashionSearch;
            this.romaSchemaPageFlashSearch = romaSchemaPageFlashSearch;
            this.romaSchemaPageBrandSearch = romaSchemaPageBrandSearch;
            this.romaSchemaPageLiveTab = romaSchemaPageLiveTab;
            this.romaSchemaPageOrderStoreTab = romaSchemaPageOrderStoreTab;
        }

        public /* synthetic */ RomaSchemaGroupSearchModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "sslocal://webcast_lynxview_popup?gravity=bottom&height=80%25&radius=16rpx&show_mask=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_panels%2Fpages%2Fsearch-filter-panel%2Ftemplate.js&use_spark=1&mask_bg_color=00000080&bypass_presentation_hook=0" : str2, str3, (i & 8) != 0 ? "sslocal://lynxview?url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_store_tab%2Fpages%2Fstore-search-tab-page.js&use_spark=1&use_new_container=1&__live_platform__=webcast" : str4, (i & 16) != 0 ? "sslocal://webcast_lynxview_popup?gravity=bottom&radius=8&show_mask=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_panels%2Fpages%2Fsearch-filter-panel%2Ftemplate.js&use_spark=1&mask_bg_color=00000080&bypass_presentation_hook=0&keyboard_adjust=0" : str5, (i & 32) != 0 ? "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2F%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_channel_search_page%2Fpages%2Fchannel-search-page%2Ftemplate.js&use_spark=1&__live_platform__=webcast" : str6, (i & 64) != 0 ? "aweme://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_result_page%2Fpages%2Fflash-branch-search-page%2Ftemplate.js&use_spark=1&enable_code_cache=1&page_type=flash_sale_search" : str7, (i & 128) != 0 ? "aweme://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_result_page%2Fpages%2Fflash-branch-search-page%2Ftemplate.js&use_spark=1&enable_code_cache=1&page_type=brand_diskon_search" : str8, (i & 256) != 0 ? "sslocal://lynxview?url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_live_tab%2Fpages%2Fsearch-live-tab%2Ftemplate.js&use_spark=1&use_new_container=1&ab_params=ecom_search_simple_tab_live_tab_layout_type" : str9, (i & 512) != 0 ? "aweme://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_result_page%2Fpages%2Forder-list-search-page%2Ftemplate.js&use_spark=1&enable_code_cache=1" : str10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new RomaSchemaGroupSearchSettings();
        LIZ = new RomaSchemaGroupSearchModel("sslocal://webcast_lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_store_search_page%2Fpages%2Fstore-search-page%2Ftemplate.js&use_spark=1&hide_nav_bar=1&trans_status_bar=1&hide_status_bar=0", "sslocal://webcast_lynxview_popup?gravity=bottom&height=80%25&radius=16rpx&show_mask=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_panels%2Fpages%2Fsearch-filter-panel%2Ftemplate.js&use_spark=1&mask_bg_color=00000080&bypass_presentation_hook=0", "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_photo_search_page%2Fpages%2Fphoto-search-page.js&use_spark=1&__live_platform__=webcast", "sslocal://lynxview?url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_store_tab%2Fpages%2Fstore-search-tab-page.js&use_spark=1&use_new_container=1&__live_platform__=webcast", "sslocal://webcast_lynxview_popup?gravity=bottom&radius=8&show_mask=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_panels%2Fpages%2Fsearch-filter-panel%2Ftemplate.js&use_spark=1&mask_bg_color=00000080&bypass_presentation_hook=0&keyboard_adjust=0", "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2F%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_channel_search_page%2Fpages%2Fchannel-search-page%2Ftemplate.js&use_spark=1&__live_platform__=webcast", "aweme://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_result_page%2Fpages%2Fflash-branch-search-page%2Ftemplate.js&use_spark=1&enable_code_cache=1&page_type=flash_sale_search", "aweme://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_result_page%2Fpages%2Fflash-branch-search-page%2Ftemplate.js&use_spark=1&enable_code_cache=1&page_type=brand_diskon_search", null, 0 == true ? 1 : 0, 768, 0 == true ? 1 : 0);
    }

    public static final RomaSchemaGroupSearchModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        RomaSchemaGroupSearchModel romaSchemaGroupSearchModel = LIZ;
        RomaSchemaGroupSearchModel romaSchemaGroupSearchModel2 = (RomaSchemaGroupSearchModel) LIZLLL.LJIIIIZZ("roma_schema_group_search", RomaSchemaGroupSearchModel.class, romaSchemaGroupSearchModel);
        if (romaSchemaGroupSearchModel2 == null) {
            return romaSchemaGroupSearchModel;
        }
        return romaSchemaGroupSearchModel2;
    }
}
