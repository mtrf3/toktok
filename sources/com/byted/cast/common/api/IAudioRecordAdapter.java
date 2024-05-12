package com.byted.cast.common.api;

import android.media.AudioRecord;

/* loaded from: classes29.dex */
public interface IAudioRecordAdapter {
    void releaseAudioRecord(AudioRecord audioRecord);

    void startAudioRecord(AudioRecord audioRecord);

    void stopAudioRecord(AudioRecord audioRecord);
}
