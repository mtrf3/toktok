package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_short_touch_widget_recycle")
/* loaded from: classes6.dex */
public final class LiveShortTouchWidgetRecycleSetting {
    public static final LiveShortTouchWidgetRecycleSetting INSTANCE = new LiveShortTouchWidgetRecycleSetting();

    @Group(isDefault = true, value = "default group")
    public static final ShortTouchWidgetRecycleConfig DEFAULT = new ShortTouchWidgetRecycleConfig(false, false, 3, null);

    public final boolean getPreviewWidgetRecycle() {
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig = (ShortTouchWidgetRecycleConfig) SettingsManager.INSTANCE.getValueSafely(LiveShortTouchWidgetRecycleSetting.class);
        if (shortTouchWidgetRecycleConfig == null) {
            shortTouchWidgetRecycleConfig = DEFAULT;
        }
        return shortTouchWidgetRecycleConfig.previewWidgetRecycle;
    }

    public final boolean getViewWidgetRecycle() {
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig = (ShortTouchWidgetRecycleConfig) SettingsManager.INSTANCE.getValueSafely(LiveShortTouchWidgetRecycleSetting.class);
        if (shortTouchWidgetRecycleConfig == null) {
            shortTouchWidgetRecycleConfig = DEFAULT;
        }
        return shortTouchWidgetRecycleConfig.viewWidgetRecycle;
    }
}
