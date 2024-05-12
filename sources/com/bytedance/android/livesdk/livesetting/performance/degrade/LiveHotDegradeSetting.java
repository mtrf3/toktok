package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C31032CFw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey(preciseExperiment = false, value = "live_hot_degrade")
/* loaded from: classes6.dex */
public final class LiveHotDegradeSetting {
    public static boolean isDeviceHot;
    public static long lastCheckHotTime;
    public static final LiveHotDegradeSetting INSTANCE = new LiveHotDegradeSetting();

    @Group(isDefault = true, value = "default group")
    public static final HotDegradeConfig DEFAULT = new HotDegradeConfig(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);

    public final HotDegradeConfig getValue() {
        HotDegradeConfig hotDegradeConfig = (HotDegradeConfig) SettingsManager.INSTANCE.getValueSafely(LiveHotDegradeSetting.class);
        if (hotDegradeConfig == null) {
            return DEFAULT;
        }
        return hotDegradeConfig;
    }

    private final boolean deviceIsHot() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastCheckHotTime > 60000) {
            lastCheckHotTime = currentTimeMillis;
            if (C31032CFw.LIZ.LIZLLL > getValue().hotTemperature) {
                z = true;
            } else {
                z = false;
            }
            isDeviceHot = z;
        }
        return isDeviceHot;
    }

    public final boolean delayLikeWidget() {
        if (deviceIsHot() && getValue().hotDelayLikeWidget) {
            return true;
        }
        return false;
    }

    public final boolean disableGaussBg() {
        if (deviceIsHot() && getValue().hotDisableGaussBg) {
            return true;
        }
        return false;
    }

    public final boolean disableGc() {
        if (deviceIsHot() && getValue().hotDisableGc) {
            return true;
        }
        return false;
    }

    public final boolean disableLog() {
        if (deviceIsHot() && getValue().hotDisableLog) {
            return true;
        }
        return false;
    }

    public final boolean disableMessageAnim() {
        if (deviceIsHot() && getValue().hotDisableMessageAnim) {
            return true;
        }
        return false;
    }

    public final boolean disableOtherLike() {
        if (deviceIsHot() && getValue().hotDisableOtherLike) {
            return true;
        }
        return false;
    }

    public final boolean enable() {
        if (getValue().hotTemperature < 100) {
            return true;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class HotDegradeConfig {

        @InterfaceC65349Pkn("hot_delay_like_widget")
        public boolean hotDelayLikeWidget;

        @InterfaceC65349Pkn("hot_disable_gauss_bg")
        public boolean hotDisableGaussBg;

        @InterfaceC65349Pkn("hot_disable_gc")
        public boolean hotDisableGc;

        @InterfaceC65349Pkn("hot_disable_log")
        public boolean hotDisableLog;

        @InterfaceC65349Pkn("hot_disable_message_anim")
        public boolean hotDisableMessageAnim;

        @InterfaceC65349Pkn("hot_disable_other_like")
        public boolean hotDisableOtherLike;

        @InterfaceC65349Pkn("hot_temperature")
        public int hotTemperature;

        /* JADX WARN: Multi-variable type inference failed */
        public HotDegradeConfig() {
            this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
        }

        public HotDegradeConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.hotTemperature = i;
            this.hotDisableLog = z;
            this.hotDisableGc = z2;
            this.hotDisableOtherLike = z3;
            this.hotDelayLikeWidget = z4;
            this.hotDisableGaussBg = z5;
            this.hotDisableMessageAnim = z6;
        }

        public /* synthetic */ HotDegradeConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? false : z5, (i2 & 64) == 0 ? z6 : false);
        }
    }
}
