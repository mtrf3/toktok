package com.ss.bytertc.engine.data;

/* loaded from: classes33.dex */
public class RecordingInfo {
    public String filePath;
    public int height;
    public VideoCodecType videoCodecType;
    public int width;

    public RecordingInfo(String str, VideoCodecType videoCodecType, int i, int i2) {
        this.filePath = str;
        this.videoCodecType = videoCodecType;
        this.width = i;
        this.height = i2;
    }

    public static RecordingInfo create(String str, VideoCodecType videoCodecType, int i, int i2) {
        return new RecordingInfo(str, videoCodecType, i, i2);
    }
}
