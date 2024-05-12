package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class GiftLimitGetResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data extends F9E {

        @InterfaceC65349Pkn("allow_custom_stall")
        public boolean allowCustomStall;

        @InterfaceC65349Pkn("gift_prompt_stall")
        public GiftPromptStall giftPromptStall;

        @InterfaceC65349Pkn("notification_status")
        public int notificationStatus;

        @InterfaceC65349Pkn("set_failed_toast")
        public String setFailedToast;

        @InterfaceC65349Pkn("set_successfully_toast")
        public String setSuccessfullyToast;

        @InterfaceC65349Pkn("suggested_custom_stall_text")
        public String suggestedCustomStallText;

        /* loaded from: classes6.dex */
        public static final class GiftPromptStall extends F9E {

            @InterfaceC65349Pkn("amount_stalls")
            public List<Integer> amountStalls;

            @InterfaceC65349Pkn("coin_exchange_rate")
            public double coinExchangeRate;

            @InterfaceC65349Pkn("currency_code")
            public String currencyCode;

            @InterfaceC65349Pkn("currency_symbol")
            public String currencySymbol;

            @InterfaceC65349Pkn("past_max_money")
            public Integer pastMaxMoney;

            @InterfaceC65349Pkn("region")
            public String region;

            @InterfaceC65349Pkn("selected_code")
            public String selectedCode = "";

            @InterfaceC65349Pkn("selected_stall")
            public Integer selectedStall;

            @InterfaceC65349Pkn("selected_stall_in_coin")
            public int selectedStallInCoin;

            @InterfaceC65349Pkn("suggested_stall_threshold")
            public Integer suggestedStallThreshold;

            @InterfaceC65349Pkn("use_coin_limit")
            public boolean useCoinLimit;

            @Override // X.F9E
            public final Object[] getObjects() {
                String str = this.currencyCode;
                List<Integer> list = this.amountStalls;
                Integer num = this.selectedStall;
                String str2 = this.currencySymbol;
                String str3 = this.region;
                return new Object[]{str, str, list, list, list, num, num, str2, str2, str3, str3};
            }
        }

        @Override // X.F9E
        public final Object[] getObjects() {
            GiftPromptStall giftPromptStall = this.giftPromptStall;
            String str = this.setSuccessfullyToast;
            String str2 = this.setFailedToast;
            return new Object[]{Integer.valueOf(this.notificationStatus), giftPromptStall, giftPromptStall, str, str, str2, str2};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Data data = this.data;
        return new Object[]{data, data};
    }
}
