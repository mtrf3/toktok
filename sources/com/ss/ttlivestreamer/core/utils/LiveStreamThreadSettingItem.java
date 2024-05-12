package com.ss.ttlivestreamer.core.utils;

/* loaded from: classes6.dex */
public class LiveStreamThreadSettingItem {
    public boolean enable;
    public int priority;
    public LiveStreamThreadType type;

    public int getPriority() {
        return this.priority;
    }

    public LiveStreamThreadType getType() {
        return this.type;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public LiveStreamThreadSettingItem(LiveStreamThreadType liveStreamThreadType, boolean z, int i) {
        this.type = liveStreamThreadType;
        this.enable = z;
        this.priority = i;
    }
}
