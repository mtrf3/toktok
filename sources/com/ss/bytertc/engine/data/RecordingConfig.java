package com.ss.bytertc.engine.data;

import com.ss.bytertc.engine.type.RecordingFileType;

/* loaded from: classes33.dex */
public class RecordingConfig {
    public String dirPath;
    public RecordingFileType recordingFileType;

    public RecordingConfig() {
        this.recordingFileType = RecordingFileType.MP4;
    }

    public RecordingConfig(String str, RecordingFileType recordingFileType) {
        this.dirPath = str;
        this.recordingFileType = recordingFileType;
    }
}
