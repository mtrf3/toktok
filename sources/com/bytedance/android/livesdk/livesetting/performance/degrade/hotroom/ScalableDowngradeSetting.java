package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C221108m2;
import X.C30922CBq;
import X.C5H3;
import X.CKA;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.PerfMetricSwitchSetting;

@SettingsKey("hot_room_scalable_downgrade")
/* loaded from: classes6.dex */
public final class ScalableDowngradeSetting {
    public static volatile boolean isDisableLog;
    public static final ScalableDowngradeSetting INSTANCE = new ScalableDowngradeSetting();

    @Group(isDefault = true, value = "default group")
    public static final ScalableDowngradeConfig DEFAULT = new ScalableDowngradeConfig(false, false, 0, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 65535, null);
    public static final C5H3 lazyValue$delegate = C221108m2.LIZIZ(CKA.LJLIL);

    private final ScalableDowngradeConfig getConfig() {
        if (C30922CBq.LIZIZ) {
            ScalableDowngradeConfig scalableDowngradeConfig = (ScalableDowngradeConfig) SettingsManager.INSTANCE.getValueSafely(ScalableDowngradeSetting.class);
            if (scalableDowngradeConfig == null) {
                return DEFAULT;
            }
            return scalableDowngradeConfig;
        }
        return getLazyValue();
    }

    private final ScalableDowngradeConfig getLazyValue() {
        return (ScalableDowngradeConfig) lazyValue$delegate.getValue();
    }

    public static final boolean isEnabled() {
        if (INSTANCE.getConfig().isEnabled() && !PerfMetricSwitchSetting.disable()) {
            return true;
        }
        return false;
    }

    public static final boolean disableAlog() {
        if (isEnabled() && INSTANCE.getConfig().getDisableAlog() && isDisableLog) {
            return true;
        }
        return false;
    }

    public static final boolean disableApmLog() {
        if (isEnabled() && INSTANCE.getConfig().getDisableApmLog() && isDisableLog) {
            return true;
        }
        return false;
    }

    public static final boolean disableBanner() {
        if (isEnabled() && INSTANCE.getConfig().getDisableBanner()) {
            return true;
        }
        return false;
    }

    public static final boolean disableGiftNotifyAnim() {
        if (isEnabled() && INSTANCE.getConfig().getDisableGiftNotifyAnim()) {
            return true;
        }
        return false;
    }

    public static final boolean disableGiftTrayAnim() {
        if (isEnabled() && INSTANCE.getConfig().getDisableGiftTrayAnim()) {
            return true;
        }
        return false;
    }

    public static final boolean disableOtherLikeAnim() {
        if (isEnabled() && INSTANCE.getConfig().getDisableOtherLikeAnim()) {
            return true;
        }
        return false;
    }

    public static final boolean disablePublicScreenAnim() {
        if (isEnabled() && INSTANCE.getConfig().getDisablePublicScreenAnim()) {
            return true;
        }
        return false;
    }

    public static final boolean disablePublicScreenAvatarPreload() {
        if (isEnabled() && INSTANCE.getConfig().getDisablePublicAvatarPreload()) {
            return true;
        }
        return false;
    }

    public final int hotTemperature() {
        return getConfig().getHotTemperature();
    }

    public final int levelCriticalFps() {
        return getConfig().getLevelSeriousFps();
    }

    public final int levelSeriousFpsEnd() {
        return getConfig().getLevelSeriousFpsEnd();
    }

    public final int levelSeriousFpsStart() {
        return getConfig().getLevelSeriousFpsStart();
    }

    public final int msgQpsHeavy() {
        return getConfig().getMsgQpsHeavy();
    }

    public final boolean isDisableLog$livebase_release() {
        return isDisableLog;
    }

    public static final long getOnlineAudienceRefreshInterval(long j) {
        if (isEnabled()) {
            return INSTANCE.getConfig().getOnlineAudienceRefreshInterval();
        }
        return j;
    }

    public static final int getPublicScreenRefreshInterval(int i) {
        if (isEnabled()) {
            ScalableDowngradeSetting scalableDowngradeSetting = INSTANCE;
            if (scalableDowngradeSetting.getConfig().getPublicScreenRefreshInterval() > 2000) {
                return scalableDowngradeSetting.getConfig().getPublicScreenRefreshInterval();
            }
            return i;
        }
        return i;
    }

    public final void setDisableLog$livebase_release(boolean z) {
        isDisableLog = z;
    }
}
