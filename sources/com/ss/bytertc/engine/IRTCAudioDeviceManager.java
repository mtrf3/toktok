package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public interface IRTCAudioDeviceManager {
    int startAudioDeviceRecordTest(int i);

    int startAudioPlaybackDeviceTest(String str, int i);

    int stopAudioDevicePlayTest();

    int stopAudioDeviceRecordAndPlayTest();

    int stopAudioPlaybackDeviceTest();
}
