package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.RecentlyLogIdSettings;

@SettingsKey("get_recently_logId_for_request")
/* loaded from: classes6.dex */
public final class GetRecentLogIdForRequest {
    public static final GetRecentLogIdForRequest INSTANCE = new GetRecentLogIdForRequest();

    @Group(isDefault = true, value = "default group")
    public static final RecentlyLogIdSettings DEFAULT = new RecentlyLogIdSettings(false, null, 3, null);

    public final RecentlyLogIdSettings getValue() {
        return (RecentlyLogIdSettings) SettingsManager.INSTANCE.getValueSafely(GetRecentLogIdForRequest.class);
    }
}
