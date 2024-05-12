package tikcast.api.wallet.tiktok;

import X.InterfaceC65349Pkn;
import webcast.data.RechargeCustomError;

/* loaded from: classes17.dex */
public final class DiamondBuyResult {

    @InterfaceC65349Pkn("data")
    public DiamondBuyData data;

    @InterfaceC65349Pkn("extra")
    public DiamondBuyExtra extra;

    /* loaded from: classes17.dex */
    public static final class ABSPIPOInfo {

        @InterfaceC65349Pkn("coin_number")
        public int coinNumber;

        @InterfaceC65349Pkn("need_billing_address")
        public boolean needBillingAddress;

        @InterfaceC65349Pkn("show_tax")
        public boolean showTax;

        @InterfaceC65349Pkn("order_id")
        public String orderId = "";

        @InterfaceC65349Pkn("cashier_url")
        public String cashierUrl = "";

        @InterfaceC65349Pkn("payment_reference")
        public String paymentReference = "";

        @InterfaceC65349Pkn("merchant_id")
        public String merchantId = "";

        @InterfaceC65349Pkn("nonce")
        public String nonce = "";

        @InterfaceC65349Pkn("address")
        public String address = "";

        @InterfaceC65349Pkn("tax_money")
        public String taxMoney = "";

        @InterfaceC65349Pkn("tax_rate")
        public String taxRate = "";

        @InterfaceC65349Pkn("notify_url")
        public String notifyUrl = "";

        @InterfaceC65349Pkn("total_money")
        public String totalMoney = "";

        @InterfaceC65349Pkn("region")
        public String region = "";

        @InterfaceC65349Pkn("billing_address")
        public String billingAddress = "";

        @InterfaceC65349Pkn("money_before_tax")
        public String moneyBeforeTax = "";

        @InterfaceC65349Pkn("price_show_form")
        public String priceShowForm = "";
    }

    /* loaded from: classes16.dex */
    public static final class APPartnerAPIInAppRequest {

        @InterfaceC65349Pkn("request_body")
        public String requestBody = "";

        @InterfaceC65349Pkn("generic_product_id")
        public String genericProductId = "";
    }

    /* loaded from: classes17.dex */
    public static final class DiamondBuyData {

        @InterfaceC65349Pkn("abs_pipo_info")
        public ABSPIPOInfo absPipoInfo;

        @InterfaceC65349Pkn("order_platform")
        public int orderPlatform;

        @InterfaceC65349Pkn("pipo_details")
        public PIPODetails pipoDetails;

        @InterfaceC65349Pkn("order_id")
        public String orderId = "";

        @InterfaceC65349Pkn("params")
        public String params = "";
    }

    /* loaded from: classes17.dex */
    public static final class DiamondBuyExtra {

        @InterfaceC65349Pkn("custom_error")
        public RechargeCustomError customError;

        @InterfaceC65349Pkn("iap_fail_extra")
        public IapFailExtraData iapFailExtra;

        @InterfaceC65349Pkn("is_webapp_recharge_redirect_enabled")
        public boolean isWebappRechargeRedirectEnabled;
    }

    /* loaded from: classes17.dex */
    public static final class IapFailExtraData {

        @InterfaceC65349Pkn("toast_message")
        public String toastMessage = "";

        @InterfaceC65349Pkn("webapp_schema")
        public String webappSchema = "";
    }
}
