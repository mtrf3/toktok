package com.ss.android.ugc.aweme.ecommercelive.common.settings;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class EcTapShopBagBubbleTipsSettings {
    public static final EcTapShopBagBubbleTipsSettings LIZ = new EcTapShopBagBubbleTipsSettings();
    public static final EcTapShopBagBubbleTipsConfig LIZIZ;

    /* loaded from: classes13.dex */
    public static final class EcTapShopBagBubbleTipsConfig {

        @InterfaceC65349Pkn("delay_show_time")
        public long delayShowTime;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("show_duration")
        public long showDuration;

        @InterfaceC65349Pkn("voucher_tips_request_max_times")
        public int voucherTipsMaxRequestTimes;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EcTapShopBagBubbleTipsConfig() {
            /*
                r9 = this;
                r1 = 0
                r2 = 0
                r7 = 15
                r8 = 0
                r0 = r9
                r4 = r2
                r6 = r1
                r0.<init>(r1, r2, r4, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.settings.EcTapShopBagBubbleTipsSettings.EcTapShopBagBubbleTipsConfig.<init>():void");
        }

        public static /* synthetic */ EcTapShopBagBubbleTipsConfig copy$default(EcTapShopBagBubbleTipsConfig ecTapShopBagBubbleTipsConfig, boolean z, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = ecTapShopBagBubbleTipsConfig.enable;
            }
            if ((i2 & 2) != 0) {
                j = ecTapShopBagBubbleTipsConfig.showDuration;
            }
            if ((i2 & 4) != 0) {
                j2 = ecTapShopBagBubbleTipsConfig.delayShowTime;
            }
            if ((i2 & 8) != 0) {
                i = ecTapShopBagBubbleTipsConfig.voucherTipsMaxRequestTimes;
            }
            return ecTapShopBagBubbleTipsConfig.copy(z, j, j2, i);
        }

        public final EcTapShopBagBubbleTipsConfig copy(boolean z, long j, long j2, int i) {
            return new EcTapShopBagBubbleTipsConfig(z, j, j2, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcTapShopBagBubbleTipsConfig)) {
                return false;
            }
            EcTapShopBagBubbleTipsConfig ecTapShopBagBubbleTipsConfig = (EcTapShopBagBubbleTipsConfig) obj;
            return this.enable == ecTapShopBagBubbleTipsConfig.enable && this.showDuration == ecTapShopBagBubbleTipsConfig.showDuration && this.delayShowTime == ecTapShopBagBubbleTipsConfig.delayShowTime && this.voucherTipsMaxRequestTimes == ecTapShopBagBubbleTipsConfig.voucherTipsMaxRequestTimes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return JBR.LIZJ(this.delayShowTime, JBR.LIZJ(this.showDuration, r0 * 31, 31), 31) + this.voucherTipsMaxRequestTimes;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcTapShopBagBubbleTipsConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", showDuration=");
            LIZ.append(this.showDuration);
            LIZ.append(", delayShowTime=");
            LIZ.append(this.delayShowTime);
            LIZ.append(", voucherTipsMaxRequestTimes=");
            return b0.LIZJ(LIZ, this.voucherTipsMaxRequestTimes, ')', LIZ);
        }

        public final long getDelayShowTime() {
            return this.delayShowTime;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final long getShowDuration() {
            return this.showDuration;
        }

        public final int getVoucherTipsMaxRequestTimes() {
            return this.voucherTipsMaxRequestTimes;
        }

        public final void setDelayShowTime(long j) {
            this.delayShowTime = j;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setShowDuration(long j) {
            this.showDuration = j;
        }

        public final void setVoucherTipsMaxRequestTimes(int i) {
            this.voucherTipsMaxRequestTimes = i;
        }

        public EcTapShopBagBubbleTipsConfig(boolean z, long j, long j2, int i) {
            this.enable = z;
            this.showDuration = j;
            this.delayShowTime = j2;
            this.voucherTipsMaxRequestTimes = i;
        }

        public /* synthetic */ EcTapShopBagBubbleTipsConfig(boolean z, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 5000L : j, (i2 & 4) == 0 ? j2 : 5000L, (i2 & 8) != 0 ? 10 : i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long j = 0;
        LIZIZ = new EcTapShopBagBubbleTipsConfig(false, j, j, 0 == true ? 1 : 0, 15, null);
    }

    public static final EcTapShopBagBubbleTipsConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcTapShopBagBubbleTipsConfig ecTapShopBagBubbleTipsConfig = LIZIZ;
        EcTapShopBagBubbleTipsConfig ecTapShopBagBubbleTipsConfig2 = (EcTapShopBagBubbleTipsConfig) LIZLLL.LJIIIIZZ("ec_tap_shop_bag_bubble_tips_settings", EcTapShopBagBubbleTipsConfig.class, ecTapShopBagBubbleTipsConfig);
        if (ecTapShopBagBubbleTipsConfig2 == null) {
            return ecTapShopBagBubbleTipsConfig;
        }
        return ecTapShopBagBubbleTipsConfig2;
    }
}
