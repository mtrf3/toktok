package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes16.dex */
public final class EcommerceEntrance {

    @InterfaceC65349Pkn("creator_type")
    public int creatorType;

    @InterfaceC65349Pkn("entrance_type")
    public int entranceType;

    @InterfaceC65349Pkn("schema")
    public String schema = "";

    @InterfaceC65349Pkn("shop_entrance_info")
    public ShopEntranceInfo shopEntranceInfo;

    @InterfaceC65349Pkn("showcase_entrance_info")
    public ShowcaseEntranceInfo showcaseEntranceInfo;

    /* loaded from: classes16.dex */
    public static final class ShopEntranceInfo {

        @InterfaceC65349Pkn("exp_rate_percentile")
        public int expRatePercentile;

        @InterfaceC65349Pkn("rate_display_style")
        public int rateDisplayStyle;

        @InterfaceC65349Pkn("show_rate_not_applicable")
        public boolean showRateNotApplicable;

        @InterfaceC65349Pkn("sold_count")
        public long soldCount;

        @InterfaceC65349Pkn("store_label")
        public StoreLabel storeLabel;

        @InterfaceC65349Pkn("exp_rate_top_display")
        public String expRateTopDisplay = "";

        @InterfaceC65349Pkn("shop_id")
        public String shopId = "";

        @InterfaceC65349Pkn("shop_name")
        public String shopName = "";

        @InterfaceC65349Pkn("shop_rating")
        public String shopRating = "";

        @InterfaceC65349Pkn("format_sold_count")
        public String formatSoldCount = "";

        /* loaded from: classes16.dex */
        public static final class StoreLabel {

            @InterfaceC65349Pkn("is_bytemall")
            public boolean isBytemall;

            @InterfaceC65349Pkn("official_label")
            public StoreOfficialLabel officialLabel;

            /* loaded from: classes16.dex */
            public static final class StoreOfficialLabel {

                @InterfaceC65349Pkn("label_image_dark")
                public ShopLabelImage labelImageDark;

                @InterfaceC65349Pkn("label_image_light")
                public ShopLabelImage labelImageLight;

                @InterfaceC65349Pkn("label_type")
                public int labelType;

                @InterfaceC65349Pkn("label_type_str")
                public String labelTypeStr = "";

                /* loaded from: classes16.dex */
                public static final class ShopLabelImage {

                    @InterfaceC65349Pkn("height")
                    public int height;

                    @InterfaceC65349Pkn("thumb_uri_list")
                    public List<String> thumbUriList;

                    @InterfaceC65349Pkn("url_list")
                    public List<String> urlList;

                    @InterfaceC65349Pkn("width")
                    public int width;

                    @InterfaceC65349Pkn("minetype")
                    public String minetype = "";

                    @InterfaceC65349Pkn("thumb_uri")
                    public String thumbUri = "";

                    @InterfaceC65349Pkn("uri")
                    public String uri = "";

                    @InterfaceC65349Pkn("color")
                    public String color = "";
                }
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class ShowcaseEntranceInfo {

        @InterfaceC65349Pkn("format_sold_count")
        public String formatSoldCount = "";

        @InterfaceC65349Pkn("sold_count")
        public long soldCount;
    }
}
