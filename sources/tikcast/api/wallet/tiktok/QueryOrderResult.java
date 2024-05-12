package tikcast.api.wallet.tiktok;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class QueryOrderResult {

    @InterfaceC65349Pkn("data")
    public ChargeOrderData data;

    @InterfaceC65349Pkn("extra")
    public ChargeOrderExtra extra;

    /* loaded from: classes14.dex */
    public static final class ChargeOrderData {

        @InterfaceC65349Pkn("extra")
        public String extra = "";

        @InterfaceC65349Pkn("status")
        public int status;
    }

    /* loaded from: classes14.dex */
    public static final class ChargeOrderExtra {

        @InterfaceC65349Pkn("coupon")
        public String coupon = "";

        @InterfaceC65349Pkn("coupon_description")
        public String couponDescription = "";

        @InterfaceC65349Pkn("coupon_detail")
        public List<CouponDetailData> couponDetail = new ArrayList();

        @InterfaceC65349Pkn("kyc_incentive")
        public KYCIncentive kycIncentive;

        @InterfaceC65349Pkn("ploy_id")
        public long ployId;
    }

    /* loaded from: classes14.dex */
    public static final class CouponDetailData {

        @InterfaceC65349Pkn("product")
        public String product = "";

        @InterfaceC65349Pkn("discount")
        public String discount = "";
    }

    /* loaded from: classes14.dex */
    public static final class KYCIncentive {

        @InterfaceC65349Pkn("is_show_entrance")
        public boolean isShowEntrance;
    }
}
