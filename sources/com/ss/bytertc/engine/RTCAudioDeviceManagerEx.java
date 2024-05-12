package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;

/* loaded from: classes33.dex */
public class RTCAudioDeviceManagerEx implements IRTCAudioDeviceManagerEx {
    public long mAudioDeviceManager;

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int stopAudioCaptureDeviceTest() {
        return NativeRTCVideoFunctions.nativeStopAudioCaptureDeviceTestEx(this.mAudioDeviceManager);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int stopAudioPlaybackDeviceTest() {
        return NativeRTCVideoFunctions.nativeStopAudioPlaybackDeviceTestEx(this.mAudioDeviceManager);
    }

    public RTCAudioDeviceManagerEx(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler) {
        this.mAudioDeviceManager = -1L;
        this.mAudioDeviceManager = NativeRTCVideoFunctions.nativeCreateAudioDeviceManager(rTCAudioDeviceEventHandler);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public void setEnableSpeakerphone(boolean z) {
        NativeRTCVideoFunctions.nativeSetEnableSpeakerphoneForTest(this.mAudioDeviceManager, z);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int startAudioCaptureDeviceTest(int i) {
        return NativeRTCVideoFunctions.nativeStartAudioCaptureDeviceTestEx(this.mAudioDeviceManager, i);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManagerEx
    public int startAudioPlaybackDeviceTest(String str, int i) {
        return NativeRTCVideoFunctions.nativeStartAudioPlaybackDeviceTestEx(this.mAudioDeviceManager, str, i);
    }
}
