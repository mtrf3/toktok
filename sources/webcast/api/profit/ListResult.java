package webcast.api.profit;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.wallet.model.CustomizedDiamond;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class ListResult {

    @InterfaceC65349Pkn("data")
    public List<Diamond> data = new ArrayList();

    @InterfaceC65349Pkn("extra")
    public ListResultExtra extra;

    /* loaded from: classes14.dex */
    public static final class ActivityDetail {

        @InterfaceC65349Pkn("end_time")
        public long endTime;

        @InterfaceC65349Pkn("start_time")
        public long startTime;

        @InterfaceC65349Pkn("activity_id")
        public String activityId = "";

        @InterfaceC65349Pkn("activity_main_path")
        public String activityMainPath = "";

        @InterfaceC65349Pkn("activity_image")
        public String activityImage = "";
    }

    /* loaded from: classes14.dex */
    public static final class ActivityInfo {

        @InterfaceC65349Pkn("activity_list")
        public List<ActivityDetail> activityList = new ArrayList();

        @InterfaceC65349Pkn("is_show_banner")
        public boolean isShowBanner;
    }

    /* loaded from: classes14.dex */
    public static final class ExtraDiamondItem {

        @InterfaceC65349Pkn("channel")
        public String channel = "";

        @InterfaceC65349Pkn("channel_id")
        public int channelId;
    }

    /* loaded from: classes17.dex */
    public static final class IapCustomData {

        @InterfaceC65349Pkn("enable_custom_recharge")
        public boolean enableCustomRecharge;

        @InterfaceC65349Pkn("has_iap_custom_recharge")
        public int hasIapCustomRecharge;

        @InterfaceC65349Pkn("custom_recharge_scenarios_key")
        public String customRechargeScenariosKey = "";

        @InterfaceC65349Pkn("custom_recharge_popup_url")
        public String customRechargePopupUrl = "";

        @InterfaceC65349Pkn("custom_recharge_panel_url")
        public String customRechargePanelUrl = "";

        @InterfaceC65349Pkn("balance_page_custom_recharge_panel_url")
        public String balancePageCustomRechargePanelUrl = "";

        @InterfaceC65349Pkn("balance_page_custom_recharge_popup_url")
        public String balancePageCustomRechargePopupUrl = "";

        @InterfaceC65349Pkn("balance_page_web_recharge_url")
        public String balancePageWebRechargeUrl = "";
    }

    /* loaded from: classes14.dex */
    public static final class IapUnitPrice {

        @InterfaceC65349Pkn("price")
        public long price;

        @InterfaceC65349Pkn("price_dot")
        public int priceDot;
    }

    /* loaded from: classes17.dex */
    public static final class ListResultExtra {

        @InterfaceC65349Pkn("activity_info")
        public ActivityInfo activityInfo;

        @InterfaceC65349Pkn("ap_unit_price")
        public IapUnitPrice apUnitPrice;

        @InterfaceC65349Pkn("channel_id")
        public int channelId;

        @InterfaceC65349Pkn("default_packet_coin")
        public long defaultPacketCoin;

        @InterfaceC65349Pkn("default_packet_id")
        public long defaultPacketId;

        @InterfaceC65349Pkn("deprecated3")
        public boolean deprecated3;

        @InterfaceC65349Pkn("first_charge_packet_id")
        public long firstChargePacketId;

        @InterfaceC65349Pkn("gp_unit_price")
        public IapUnitPrice gpUnitPrice;

        @InterfaceC65349Pkn("iap_custom_data")
        public IapCustomData iapCustomData;

        @InterfaceC65349Pkn("iap_max_customized_diamond_cnt")
        public int iapMaxCustomizedDiamondCnt;

        @InterfaceC65349Pkn("iap_min_customized_diamond_cnt")
        public int iapMinCustomizedDiamondCnt;

        @InterfaceC65349Pkn("is_default")
        public boolean isDefault;

        @InterfaceC65349Pkn("is_new_recommend_package")
        public boolean isNewRecommendPackage;

        @InterfaceC65349Pkn("is_recommend")
        public boolean isRecommend;

        @InterfaceC65349Pkn("is_web_recharge_allowed")
        public boolean isWebRechargeAllowed;

        @InterfaceC65349Pkn("max_customized_diamond_cnt")
        public int maxCustomizedDiamondCnt;

        @InterfaceC65349Pkn("min_customized_diamond_cnt")
        public int minCustomizedDiamondCnt;

        @InterfaceC65349Pkn("need_auth")
        public int needAuth;

        @InterfaceC65349Pkn("ploy_trace_id")
        public long ployTraceId;

        @InterfaceC65349Pkn("recently_purchased_packet_id")
        public long recentlyPurchasedPacketId;

        @InterfaceC65349Pkn("recommended_packet_id")
        public long recommendedPacketId;

        @InterfaceC65349Pkn("should_display_customized_web_recharge")
        public boolean shouldDisplayCustomizedWebRecharge;

        @InterfaceC65349Pkn("show_hint")
        public long showHint;

        @InterfaceC65349Pkn("total_signed")
        public long totalSigned;

        @InterfaceC65349Pkn("use_default_packet")
        public boolean useDefaultPacket;

        @InterfaceC65349Pkn("use_web_recharge_store_region")
        public boolean useWebRechargeStoreRegion;

        @InterfaceC65349Pkn("web_recharge_custom")
        public Diamond webRechargeCustom;

        @InterfaceC65349Pkn("large_pay_url")
        public String largePayUrl = "";

        @InterfaceC65349Pkn("apple_pay_hint_url")
        public String applePayHintUrl = "";

        @InterfaceC65349Pkn("deprecated1")
        public String deprecated1 = "";

        @InterfaceC65349Pkn("sign_infos")
        public List<String> signInfos = new ArrayList();

        @InterfaceC65349Pkn("deprecated2")
        public List<CustomizedDiamond> deprecated2 = new ArrayList();

        @InterfaceC65349Pkn("channel")
        public String channel = "";

        @InterfaceC65349Pkn("currency_list")
        public List<String> currencyList = new ArrayList();

        @InterfaceC65349Pkn("extra_diamond_list")
        public List<ExtraDiamondItem> extraDiamondList = new ArrayList();

        @InterfaceC65349Pkn("badge_icon")
        public String badgeIcon = "";

        @InterfaceC65349Pkn("default_currency")
        public String defaultCurrency = "";

        @InterfaceC65349Pkn("customized_ids")
        public List<Long> customizedIds = new ArrayList();

        @InterfaceC65349Pkn("merchant_id")
        public String merchantId = "";

        @InterfaceC65349Pkn("region")
        public String region = "";

        @InterfaceC65349Pkn("insufficient_balance_ab_group_id")
        public String insufficientBalanceAbGroupId = "";

        @InterfaceC65349Pkn("full_list")
        public List<Diamond> fullList = new ArrayList();

        @InterfaceC65349Pkn("request_id")
        public String requestId = "";

        @InterfaceC65349Pkn("voucher_list")
        public List<VoucherItem> voucherList = new ArrayList();

        @InterfaceC65349Pkn("web_display_data")
        public List<WebDisplayData> webDisplayData = new ArrayList();

        @InterfaceC65349Pkn("pipo_domain")
        public String pipoDomain = "";

        @InterfaceC65349Pkn("store_region")
        public String storeRegion = "";
    }

    /* loaded from: classes14.dex */
    public static final class VoucherItem {

        @InterfaceC65349Pkn("cashback_info")
        public CashbackInfo cashbackInfo;

        @InterfaceC65349Pkn("expire_timestamp")
        public long expireTimestamp;

        @InterfaceC65349Pkn("lock_expiry_unix")
        public long lockExpiryUnix;

        @InterfaceC65349Pkn("max_order_coins_amount")
        public long maxOrderCoinsAmount;

        @InterfaceC65349Pkn("min_order_coins_amount")
        public long minOrderCoinsAmount;

        @InterfaceC65349Pkn("voucher_starling_content")
        public VoucherStarlingContent voucherStarlingContent;

        @InterfaceC65349Pkn("voucher_status")
        public int voucherStatus;

        @InterfaceC65349Pkn("voucher_type")
        public int voucherType;

        @InterfaceC65349Pkn("voucher_token")
        public String voucherToken = "";

        @InterfaceC65349Pkn("reward_detail")
        public String rewardDetail = "";

        @InterfaceC65349Pkn("voucher_template_id")
        public String voucherTemplateId = "";

        /* loaded from: classes14.dex */
        public static final class CashbackInfo {

            @InterfaceC65349Pkn("cashback_percentage")
            public CashbackPercentage cashbackPercentage;

            @InterfaceC65349Pkn("diamond_id_to_cashback_usd_amt")
            public Map<Long, String> diamondIdToCashbackUsdAmt = C113554cx.LJJJLIIL();

            @InterfaceC65349Pkn("show_cashback")
            public boolean showCashback;

            @InterfaceC65349Pkn("usd_conversion_rate")
            public USDConversionRate usdConversionRate;

            /* loaded from: classes14.dex */
            public static final class CashbackPercentage {

                @InterfaceC65349Pkn("iap")
                public String iap = "";

                @InterfaceC65349Pkn("webapp")
                public String webapp = "";
            }

            /* loaded from: classes14.dex */
            public static final class USDConversionRate {

                @InterfaceC65349Pkn("rate")
                public int rate;

                @InterfaceC65349Pkn("rate_decimal_position")
                public int rateDecimalPosition;
            }
        }

        /* loaded from: classes14.dex */
        public static final class VoucherStarlingContent {

            @InterfaceC65349Pkn("voucher_tags")
            public List<String> voucherTags = new ArrayList();

            @InterfaceC65349Pkn("discount_amount")
            public String discountAmount = "";

            @InterfaceC65349Pkn("min_amount")
            public String minAmount = "";

            @InterfaceC65349Pkn("max_amount")
            public String maxAmount = "";

            @InterfaceC65349Pkn("validity_period")
            public String validityPeriod = "";

            @InterfaceC65349Pkn("terms_and_conditions")
            public String termsAndConditions = "";

            @InterfaceC65349Pkn("voucher_applied")
            public String voucherApplied = "";
        }
    }

    /* loaded from: classes17.dex */
    public static final class WebDisplayData {

        @InterfaceC65349Pkn("display_message")
        public String displayMessage = "";

        @InterfaceC65349Pkn("display_schema")
        public String displaySchema = "";

        @InterfaceC65349Pkn("display_sub_message")
        public String displaySubMessage = "";
    }
}
