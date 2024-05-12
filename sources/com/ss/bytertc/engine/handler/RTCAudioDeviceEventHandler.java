package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;

/* loaded from: classes33.dex */
public class RTCAudioDeviceEventHandler {
    public void OnLoopbackAudioVolumeIndication(int i) {
    }

    public void onRecordingAudioVolumeIndication(int i) {
        IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler audioDeviceManagerEvent = RTCEngineImpl.getAudioDeviceManagerEvent();
        if (audioDeviceManagerEvent != null) {
            audioDeviceManagerEvent.onRecordingAudioVolumeIndication(i);
        }
    }
}
