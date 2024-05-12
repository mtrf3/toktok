package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("search_live_title_bar_opt")
/* loaded from: classes6.dex */
public final class SearchLiveTitleBarOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final SearchLiveTitleBarOptSetting INSTANCE = new SearchLiveTitleBarOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SearchLiveTitleBarOptSetting.class);
    }

    public final boolean isOpt() {
        return getValue();
    }
}
