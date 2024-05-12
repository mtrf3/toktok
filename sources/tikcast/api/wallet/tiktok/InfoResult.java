package tikcast.api.wallet.tiktok;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public final class InfoResult {

    @InterfaceC65349Pkn("data")
    public InfoData data;

    @InterfaceC65349Pkn("extra")
    public InfoExtra extra;

    /* loaded from: classes17.dex */
    public static final class InfoData {

        @InterfaceC65349Pkn("auto_exchange")
        public boolean autoExchange;

        @InterfaceC65349Pkn("auto_exchange_enable")
        public boolean autoExchangeEnable;

        @InterfaceC65349Pkn("coin_exchange_tax_status")
        public int coinExchangeTaxStatus;

        @InterfaceC65349Pkn("coin_exchange_tax_type")
        public int coinExchangeTaxType;

        @InterfaceC65349Pkn("deprecated1")
        public long deprecated1;

        @InterfaceC65349Pkn("deprecated5")
        public long deprecated5;

        @InterfaceC65349Pkn("diamond")
        public long diamond;

        @InterfaceC65349Pkn("exchange")
        public Exchange exchange;

        @InterfaceC65349Pkn("is_periodic_payout")
        public boolean isPeriodicPayout;

        @InterfaceC65349Pkn("vip_only_recharge_channel_status")
        public int vipOnlyRechargeChannelStatus;

        @InterfaceC65349Pkn("deprecated2")
        public String deprecated2 = "";

        @InterfaceC65349Pkn("deprecated3")
        public String deprecated3 = "";

        @InterfaceC65349Pkn("deprecated4")
        public List<CouponDetailData> deprecated4 = new ArrayList();

        @InterfaceC65349Pkn("auto_exchange_map")
        public Map<String, Boolean> autoExchangeMap = C113554cx.LJJJLIIL();
    }

    /* loaded from: classes17.dex */
    public static final class InfoExtra {

        @InterfaceC65349Pkn("is_web_recharge_allowed")
        public boolean isWebRechargeAllowed;
    }
}
