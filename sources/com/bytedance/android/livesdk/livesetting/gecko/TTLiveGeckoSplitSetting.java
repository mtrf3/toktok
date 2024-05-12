package com.bytedance.android.livesdk.livesetting.gecko;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.GeckoSplit;

@SettingsKey("tt_live_gecko_channel_split")
/* loaded from: classes6.dex */
public final class TTLiveGeckoSplitSetting {
    public static final TTLiveGeckoSplitSetting INSTANCE = new TTLiveGeckoSplitSetting();

    @Group(isDefault = true, value = "default group")
    public static final GeckoSplit DEFAULT = new GeckoSplit();

    public final GeckoSplit getValue() {
        return (GeckoSplit) SettingsManager.INSTANCE.getValueSafely(TTLiveGeckoSplitSetting.class);
    }

    public final long getDelayTime() {
        int i;
        GeckoSplit value = getValue();
        if (value != null) {
            i = value.delayTime;
        } else {
            i = 3;
        }
        return i * 1000;
    }

    public final boolean isEnableReport() {
        GeckoSplit value = getValue();
        if (value != null) {
            return value.isEnableReport;
        }
        return false;
    }

    public final boolean isSplit() {
        GeckoSplit value = getValue();
        if (value != null) {
            return value.isEnable;
        }
        return false;
    }

    public final GeckoSplit getDEFAULT() {
        return DEFAULT;
    }
}
