package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C221108m2;
import X.C30750C5a;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_dns_optimize_config")
/* loaded from: classes6.dex */
public final class PreLiveDnsOptimizeSetting {
    public static final PreLiveDnsOptimizeSetting INSTANCE = new PreLiveDnsOptimizeSetting();

    @Group(isDefault = true, value = "default")
    public static final LiveDnsOptimizeConfig DEFAULT = new LiveDnsOptimizeConfig(0, 0, 3, null);

    @Group("v1")
    public static final LiveDnsOptimizeConfig enableValue = new LiveDnsOptimizeConfig(1, 6);
    public static final C5H3 dnsOptimizeConfig$delegate = C221108m2.LIZIZ(C30750C5a.LJLIL);

    private final LiveDnsOptimizeConfig getDnsOptimizeConfig() {
        return (LiveDnsOptimizeConfig) dnsOptimizeConfig$delegate.getValue();
    }

    public final int checkDNSCnt() {
        LiveDnsOptimizeConfig dnsOptimizeConfig = getDnsOptimizeConfig();
        if (dnsOptimizeConfig != null) {
            return dnsOptimizeConfig.checkHostCount;
        }
        return 0;
    }

    public final boolean isEnable() {
        LiveDnsOptimizeConfig dnsOptimizeConfig = getDnsOptimizeConfig();
        if (dnsOptimizeConfig == null || dnsOptimizeConfig.enableCheckDns <= 0) {
            return false;
        }
        return true;
    }

    public final LiveDnsOptimizeConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveDnsOptimizeConfig getEnableValue() {
        return enableValue;
    }
}
