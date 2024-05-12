package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.B6I;
import X.C221108m2;
import X.C5H3;
import X.X1D;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

@SettingsKey("live_card_smooth_enter_opt")
/* loaded from: classes6.dex */
public final class LiveCardSmoothEnterOptSetting {
    public static final LiveCardSmoothEnterOptSetting INSTANCE = new LiveCardSmoothEnterOptSetting();

    @Group(isDefault = true, value = "control_group")
    public static final SmoothEnterConfig DEFAULT = new SmoothEnterConfig(false, false, 0, null, 15, null);

    @Group("experimental_group")
    public static final SmoothEnterConfig ENABLE = new SmoothEnterConfig(true, true, 2000, null, 8, null);
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(B6I.LJLIL);

    public final SmoothEnterConfig getSetting() {
        return (SmoothEnterConfig) setting$delegate.getValue();
    }

    public final long getForceRemoveDelayTime() {
        return getSetting().forceRemoveDelayTime;
    }

    public final boolean getForceRemoveEnable() {
        return getSetting().forceRemove;
    }

    public final SmoothEnterConfig getDEFAULT() {
        return DEFAULT;
    }

    public final SmoothEnterConfig getENABLE() {
        return ENABLE;
    }

    private final boolean entranceEnableWithHighPriority(EnterRoomConfig enterRoomConfig) {
        Boolean bool;
        if (enterRoomConfig == null) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
        LIZ.append('-');
        LIZ.append(enterRoomConfig.mRoomsData.enterMethod);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!getSetting().entranceMap.containsKey(LIZIZ) || (bool = getSetting().entranceMap.get(LIZIZ)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean getSmoothEnterEnable(EnterRoomConfig enterRoomConfig) {
        if (getSetting().enable || entranceEnableWithHighPriority(enterRoomConfig)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean getSmoothEnterEnable$default(LiveCardSmoothEnterOptSetting liveCardSmoothEnterOptSetting, EnterRoomConfig enterRoomConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            enterRoomConfig = null;
        }
        return liveCardSmoothEnterOptSetting.getSmoothEnterEnable(enterRoomConfig);
    }
}
