package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("live_load_image_when_scroll_rv")
/* loaded from: classes6.dex */
public final class LiveRecyclerViewImageOptSetting {
    public static final LiveRecyclerViewImageOptSetting INSTANCE = new LiveRecyclerViewImageOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveRecyclerViewOptData DEFAULT = new LiveRecyclerViewOptData();
    public static final LiveRecyclerViewOptData setting = (LiveRecyclerViewOptData) SettingsManager.INSTANCE.getValueSafely(LiveRecyclerViewImageOptSetting.class);

    public final boolean enabled() {
        LiveRecyclerViewOptData liveRecyclerViewOptData = setting;
        if (liveRecyclerViewOptData == null) {
            return false;
        }
        return liveRecyclerViewOptData.enabled;
    }

    public final int dyForRvLabel(String label) {
        Integer num;
        o.LJIIIZ(label, "label");
        LiveRecyclerViewOptData liveRecyclerViewOptData = setting;
        if (liveRecyclerViewOptData == null || (num = liveRecyclerViewOptData.dyMap.get(label)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
