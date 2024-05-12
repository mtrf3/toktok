package com.ss.ttlivestreamer.livestreamv2.core.audiorecord;

/* loaded from: classes12.dex */
public interface IAudioRecordManager {

    /* loaded from: classes12.dex */
    public interface RecordStateCallback {
        void onError(int i, String str);
    }

    void release();

    void setRecordPath(String str);

    void startAudioRecord();
}
