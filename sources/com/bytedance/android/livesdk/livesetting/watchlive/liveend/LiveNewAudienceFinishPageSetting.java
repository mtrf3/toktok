package com.bytedance.android.livesdk.livesetting.watchlive.liveend;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveNewAudienceEndModel;

@SettingsKey("live_new_audience_finish_page")
/* loaded from: classes6.dex */
public final class LiveNewAudienceFinishPageSetting {
    public static final LiveNewAudienceFinishPageSetting INSTANCE = new LiveNewAudienceFinishPageSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveNewAudienceEndModel DEFAULT = new LiveNewAudienceEndModel();

    public final LiveNewAudienceEndModel getValue() {
        LiveNewAudienceEndModel liveNewAudienceEndModel = (LiveNewAudienceEndModel) SettingsManager.INSTANCE.getValueSafely(LiveNewAudienceFinishPageSetting.class);
        if (liveNewAudienceEndModel == null) {
            return DEFAULT;
        }
        return liveNewAudienceEndModel;
    }

    public final LiveNewAudienceEndModel getDEFAULT() {
        return DEFAULT;
    }
}
