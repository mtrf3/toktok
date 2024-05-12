package com.ss.bytertc.engine.data;

/* loaded from: classes33.dex */
public class RecordingProgress {
    public long duration;
    public long fileSize;

    public RecordingProgress(long j, long j2) {
        this.duration = j;
        this.fileSize = j2;
    }

    public static RecordingProgress create(long j, long j2) {
        return new RecordingProgress(j, j2);
    }
}
