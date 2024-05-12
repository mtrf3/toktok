package com.ss.ttlivestreamer.core.engine;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.WrapperNativeAudioBuffer;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public abstract class AudioSource extends MediaSource {
    public AudioDeviceModule mADM;
    public PowerObserver mObserver;

    /* loaded from: classes12.dex */
    public interface PowerObserver {
        void onCalculatePcmPowerEvent(int i);
    }

    @Override // com.ss.ttlivestreamer.core.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public native void nativeAdaptedOutputFormat(int i, int i2, int i3);

    public native void nativeOnData(Buffer buffer, int i, int i2, int i3, long j);

    public native void nativeSetAudioQuantizeGapPeriod(long j);

    public native void nativeSetMute(boolean z);

    public native void nativeSetVolume(double d);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mADM = null;
        super.release();
    }

    public AudioDeviceModule getAudioDeviceModule() {
        return this.mADM;
    }

    private void onEvent(int i) {
        PowerObserver powerObserver = this.mObserver;
        if (powerObserver != null) {
            powerObserver.onCalculatePcmPowerEvent(i);
        }
    }

    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        this.mADM = audioDeviceModule;
    }

    public void setCalculatePcmPowerEventObserver(PowerObserver powerObserver) {
        this.mObserver = powerObserver;
    }

    public void nativeOnData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }
}
