package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class HotWordGiftStruct {

    @InterfaceC65349Pkn("eea_coins_policy_url")
    public String eeaCoinsPolicyUrl;

    @InterfaceC65349Pkn("eea_popup_interval")
    public int eeaPopupInterval;

    @InterfaceC65349Pkn("enabled")
    public boolean enabled;

    @InterfaceC65349Pkn("expensive_gift_price")
    public int expensiveGiftPrice;

    @InterfaceC65349Pkn("freq_control")
    public FrequencyControl frequencyControl;

    @InterfaceC65349Pkn("non_recharge_user_max_price")
    public int nonRechargeMaxPrice;

    @InterfaceC65349Pkn("row_coins_policy_url")
    public String rowCoinsPolicyUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public HotWordGiftStruct() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public HotWordGiftStruct(boolean z, int i, int i2, int i3, String eeaCoinsPolicyUrl, String rowCoinsPolicyUrl, FrequencyControl frequencyControl) {
        o.LJIIIZ(eeaCoinsPolicyUrl, "eeaCoinsPolicyUrl");
        o.LJIIIZ(rowCoinsPolicyUrl, "rowCoinsPolicyUrl");
        o.LJIIIZ(frequencyControl, "frequencyControl");
        this.enabled = z;
        this.nonRechargeMaxPrice = i;
        this.expensiveGiftPrice = i2;
        this.eeaPopupInterval = i3;
        this.eeaCoinsPolicyUrl = eeaCoinsPolicyUrl;
        this.rowCoinsPolicyUrl = rowCoinsPolicyUrl;
        this.frequencyControl = frequencyControl;
    }

    /* loaded from: classes14.dex */
    public static final class FrequencyControl {

        @InterfaceC65349Pkn("consecutive_active_days_count")
        public int consecutiveActiveDaysCount;

        @InterfaceC65349Pkn("consecutive_active_days_daily_close_cooldown")
        public int consecutiveActiveDaysDailyCloseCoolDownHrs;

        @InterfaceC65349Pkn("consecutive_active_days_daily_close_count")
        public int consecutiveActiveDaysDailyCloseCount;

        @InterfaceC65349Pkn("daily_close_cooldown")
        public int dailyCloseCoolDownHrs;

        @InterfaceC65349Pkn("daily_close_count")
        public int dailyCloseCount;

        @InterfaceC65349Pkn("daily_no_interaction_cooldown")
        public int dailyNoInteractionCoolDownHrs;

        @InterfaceC65349Pkn("daily_no_interaction_count")
        public int dailyNoInteractionCount;

        @InterfaceC65349Pkn("session_max_distinct_gift")
        public int sessionMaxDistinctGift;

        @InterfaceC65349Pkn("session_max_single_gift")
        public int sessionMaxSingleGift;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public FrequencyControl() {
            /*
                r12 = this;
                r1 = 0
                r10 = 511(0x1ff, float:7.16E-43)
                r11 = 0
                r0 = r12
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r9 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct.FrequencyControl.<init>():void");
        }

        public FrequencyControl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.sessionMaxDistinctGift = i;
            this.sessionMaxSingleGift = i2;
            this.dailyNoInteractionCount = i3;
            this.dailyNoInteractionCoolDownHrs = i4;
            this.dailyCloseCount = i5;
            this.dailyCloseCoolDownHrs = i6;
            this.consecutiveActiveDaysCount = i7;
            this.consecutiveActiveDaysDailyCloseCount = i8;
            this.consecutiveActiveDaysDailyCloseCoolDownHrs = i9;
        }

        public /* synthetic */ FrequencyControl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 2 : i, (i10 & 2) != 0 ? 1 : i2, (i10 & 4) != 0 ? 5 : i3, (i10 & 8) != 0 ? 24 : i4, (i10 & 16) != 0 ? 3 : i5, (i10 & 32) == 0 ? i6 : 24, (i10 & 64) != 0 ? 3 : i7, (i10 & 128) == 0 ? i8 : 3, (i10 & 256) != 0 ? 336 : i9);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HotWordGiftStruct(boolean r14, int r15, int r16, int r17, java.lang.String r18, java.lang.String r19, com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct.FrequencyControl r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r13 = this;
            r1 = r20
            r0 = r21 & 1
            if (r0 == 0) goto L7
            r14 = 0
        L7:
            r0 = r21 & 2
            if (r0 == 0) goto Ld
            r15 = 100
        Ld:
            r0 = r21 & 4
            if (r0 == 0) goto L13
            r16 = 1000(0x3e8, float:1.401E-42)
        L13:
            r0 = r21 & 8
            if (r0 == 0) goto L19
            r17 = 24
        L19:
            r0 = r21 & 16
            if (r0 == 0) goto L1f
            java.lang.String r18 = "https://www.tiktok.com/legal/page/eea/virtual-items/en"
        L1f:
            r0 = r21 & 32
            if (r0 == 0) goto L25
            java.lang.String r19 = "https://www.tiktok.com/legal/page/row/virtual-items/en"
        L25:
            r0 = r21 & 64
            if (r0 == 0) goto L3a
            com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct$FrequencyControl r1 = new com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct$FrequencyControl
            r2 = 0
            r11 = 511(0x1ff, float:7.16E-43)
            r12 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L3a:
            r20 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct.<init>(boolean, int, int, int, java.lang.String, java.lang.String, com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct$FrequencyControl, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
