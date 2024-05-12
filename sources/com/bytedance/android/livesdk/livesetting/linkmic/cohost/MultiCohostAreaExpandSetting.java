package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("live_multi_host_expand_video_area_enable")
/* loaded from: classes14.dex */
public final class MultiCohostAreaExpandSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static boolean audienceExpandState;
    public static final MultiCohostAreaExpandSetting INSTANCE = new MultiCohostAreaExpandSetting();
    public static String lastCohostLayoutId = "";

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiCohostAreaExpandSetting.class);
    }

    public final String getCohostLayoutId() {
        if (getValue()) {
            return "2002";
        }
        return "2001";
    }

    public final boolean getAudienceExpandState() {
        return audienceExpandState;
    }

    public final String getLastCohostLayoutId() {
        return lastCohostLayoutId;
    }

    public final void setAudienceExpandState(boolean z) {
        audienceExpandState = z;
    }

    public final void setLastCohostLayoutId(String str) {
        o.LJIIIZ(str, "<set-?>");
        lastCohostLayoutId = str;
    }
}
