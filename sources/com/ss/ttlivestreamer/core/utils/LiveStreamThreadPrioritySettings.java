package com.ss.ttlivestreamer.core.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class LiveStreamThreadPrioritySettings {
    public Map<LiveStreamThreadType, LiveStreamThreadSettingItem> configs = new HashMap();

    public LiveStreamThreadSettingItem getSettings(LiveStreamThreadType liveStreamThreadType) {
        return this.configs.get(liveStreamThreadType);
    }

    public void addSettings(LiveStreamThreadType liveStreamThreadType, boolean z, int i) {
        this.configs.put(liveStreamThreadType, new LiveStreamThreadSettingItem(liveStreamThreadType, z, i));
    }
}
