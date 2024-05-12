package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public interface IRTCAudioDeviceManagerEx {

    /* loaded from: classes33.dex */
    public interface IRTCAudioDeviceEventHandler {
        void onRecordingAudioVolumeIndication(int i);
    }

    void setEnableSpeakerphone(boolean z);

    int startAudioCaptureDeviceTest(int i);

    int startAudioPlaybackDeviceTest(String str, int i);

    int stopAudioCaptureDeviceTest();

    int stopAudioPlaybackDeviceTest();
}
