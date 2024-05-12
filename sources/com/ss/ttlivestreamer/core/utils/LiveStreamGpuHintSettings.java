package com.ss.ttlivestreamer.core.utils;

import com.ss.ttlivestreamer.core.utils.QualcommGpuUtils;

/* loaded from: classes6.dex */
public class LiveStreamGpuHintSettings {
    public boolean enable;
    public int time;
    public QualcommGpuUtils.CommandType type;

    public int getTime() {
        return this.time;
    }

    public QualcommGpuUtils.CommandType getType() {
        return this.type;
    }

    public boolean isEnabled() {
        return this.enable;
    }

    public LiveStreamGpuHintSettings(QualcommGpuUtils.CommandType commandType, int i, boolean z) {
        this.type = commandType;
        this.time = i;
        this.enable = z;
    }
}
