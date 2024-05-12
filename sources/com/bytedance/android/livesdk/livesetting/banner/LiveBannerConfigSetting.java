package com.bytedance.android.livesdk.livesetting.banner;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey(preciseExperiment = false, value = "tiktok_live_banner_config")
/* loaded from: classes6.dex */
public final class LiveBannerConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final BannerConfig DEFAULT;
    public static final LiveBannerConfigSetting INSTANCE = new LiveBannerConfigSetting();

    static {
        long j = 0;
        DEFAULT = new BannerConfig(j, j, 3, null);
    }

    public final BannerConfig getValue() {
        BannerConfig bannerConfig = (BannerConfig) SettingsManager.INSTANCE.getValueSafely(LiveBannerConfigSetting.class);
        if (bannerConfig == null) {
            return DEFAULT;
        }
        return bannerConfig;
    }

    /* loaded from: classes6.dex */
    public static final class BannerConfig {

        @InterfaceC65349Pkn("anchor_interval")
        public long anchorInterval;

        @InterfaceC65349Pkn("normal_interval")
        public long normalInterval;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BannerConfig() {
            /*
                r7 = this;
                r1 = 0
                r5 = 3
                r6 = 0
                r0 = r7
                r3 = r1
                r0.<init>(r1, r3, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.banner.LiveBannerConfigSetting.BannerConfig.<init>():void");
        }

        public BannerConfig(long j, long j2) {
            this.normalInterval = j;
            this.anchorInterval = j2;
        }

        public /* synthetic */ BannerConfig(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? 5000L : j2);
        }
    }
}
