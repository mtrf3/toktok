package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.ReturnStatus;

/* loaded from: classes33.dex */
public class RTCAudioDeviceManager implements IRTCAudioDeviceManager {
    public long mAudioDeviceManager;

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioDevicePlayTest() {
        long j = this.mAudioDeviceManager;
        if (j == -1) {
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeAudioDeviceManagerFunctions.nativeStopAudioDevicePlayTest(j);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioDeviceRecordAndPlayTest() {
        long j = this.mAudioDeviceManager;
        if (j == -1) {
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeAudioDeviceManagerFunctions.nativeStopAudioDeviceRecordAndPlayTest(j);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioPlaybackDeviceTest() {
        long j = this.mAudioDeviceManager;
        if (j == -1) {
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeAudioDeviceManagerFunctions.nativeStopAudioPlaybackDeviceTest(j);
    }

    public RTCAudioDeviceManager(long j) {
        this.mAudioDeviceManager = j;
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioDeviceRecordTest(int i) {
        long j = this.mAudioDeviceManager;
        if (j == -1) {
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeAudioDeviceManagerFunctions.nativeStartAudioDeviceRecordTest(j, i);
    }

    @Override // com.ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioPlaybackDeviceTest(String str, int i) {
        long j = this.mAudioDeviceManager;
        if (j == -1) {
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeAudioDeviceManagerFunctions.nativeStartAudioPlaybackDeviceTest(j, str, i);
    }
}
