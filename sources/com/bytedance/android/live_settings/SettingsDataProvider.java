package com.bytedance.android.live_settings;

import java.util.HashMap;

/* loaded from: classes6.dex */
public interface SettingsDataProvider {
    void deleteUselessExposedVids(String str);

    String getCurrentUid();

    HashMap<String, LiveSettingModel> getLiveSettingMap();

    void setExposedVids(String str);

    void setExposedVidsByUid(String str);
}
