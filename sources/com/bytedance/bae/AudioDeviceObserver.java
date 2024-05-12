package com.bytedance.bae;

/* loaded from: classes17.dex */
public interface AudioDeviceObserver {
    void onAudioDevicePlayoutStart();

    void onAudioDevicePlayoutStop();

    void onAudioDeviceRecordStart();

    void onAudioDeviceRecordStop();
}
