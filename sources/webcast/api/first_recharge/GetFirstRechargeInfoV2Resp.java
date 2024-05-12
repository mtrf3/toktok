package webcast.api.first_recharge;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class GetFirstRechargeInfoV2Resp {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static final class Data {
    }

    /* loaded from: classes14.dex */
    public static final class FirstChargeGuideEffectRule {

        @InterfaceC65349Pkn("enable_first_recharge_guide_effect")
        public boolean enableFirstRechargeGuideEffect;

        @InterfaceC65349Pkn("enter_room_show_time")
        public List<Integer> enterRoomShowTime = new ArrayList();

        @InterfaceC65349Pkn("watch_pk_show_time")
        public int watchPkShowTime;
    }

    /* loaded from: classes14.dex */
    public static final class FirstRechargeCampaignV1 {

        @InterfaceC65349Pkn("default_diamond")
        public Diamond defaultDiamond;

        @InterfaceC65349Pkn("first_charge_gift_style")
        public int firstChargeGiftStyle;

        @InterfaceC65349Pkn("guide_effect_rule")
        public FirstChargeGuideEffectRule guideEffectRule;

        @InterfaceC65349Pkn("is_first_charge")
        public boolean isFirstCharge;
    }

    /* loaded from: classes17.dex */
    public static final class FirstRechargeCampaignV2 {

        @InterfaceC65349Pkn("expire_time")
        public long expireTime;

        @InterfaceC65349Pkn("frozen_coins_for_large_packages")
        public int frozenCoinsForLargePackages;

        @InterfaceC65349Pkn("frozen_coins_for_small_packages")
        public int frozenCoinsForSmallPackages;

        @InterfaceC65349Pkn("gift_id")
        public long giftId;

        @InterfaceC65349Pkn("is_cash_first_charge")
        public boolean isCashFirstCharge;

        @InterfaceC65349Pkn("is_show_countdown")
        public boolean isShowCountdown;

        @InterfaceC65349Pkn("minimum_number_of_coins_to_unlock_frozen_coins")
        public int minimumNumberOfCoinsToUnlockFrozenCoins;

        @InterfaceC65349Pkn("recharge_coins_for_large_packages")
        public int rechargeCoinsForLargePackages;

        @InterfaceC65349Pkn("recharge_coins_for_small_packages")
        public int rechargeCoinsForSmallPackages;

        @InterfaceC65349Pkn("remaining_frozen_coins")
        public int remainingFrozenCoins;

        @InterfaceC65349Pkn("total_frozen_coins")
        public int totalFrozenCoins;
    }
}
