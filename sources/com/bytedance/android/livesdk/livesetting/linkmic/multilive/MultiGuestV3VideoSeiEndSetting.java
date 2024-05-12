package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

@SettingsKey("linkmic_sdk_video_sei_end_layout")
/* loaded from: classes6.dex */
public final class MultiGuestV3VideoSeiEndSetting {
    public static final MultiGuestV3VideoSeiEndSetting INSTANCE = new MultiGuestV3VideoSeiEndSetting();

    @Group(isDefault = true, value = "default group")
    public static final VideoSeiEndSetting DEFAULT = new VideoSeiEndSetting(0, 0, 0, null, 15, null);

    private final VideoSeiEndSetting getConfig() {
        VideoSeiEndSetting videoSeiEndSetting = (VideoSeiEndSetting) SettingsManager.INSTANCE.getValueSafely(MultiGuestV3VideoSeiEndSetting.class);
        if (videoSeiEndSetting == null) {
            return DEFAULT;
        }
        return videoSeiEndSetting;
    }

    public final boolean enableNoParseSeiEndLayout() {
        if (getConfig().enableNoParseSeiEndLayout == 1) {
            return true;
        }
        return false;
    }

    public final ArrayList<String> enableSceneList() {
        return getConfig().enableSceneList;
    }

    public final boolean enableVideoSei() {
        if (getConfig().enableVideoSei == 1) {
            return true;
        }
        return false;
    }

    public final boolean enableVideoSeiEndLayout() {
        if (getConfig().enableVideoSeiEndLayout == 1) {
            return true;
        }
        return false;
    }
}
