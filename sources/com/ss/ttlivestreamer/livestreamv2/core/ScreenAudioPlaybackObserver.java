package com.ss.ttlivestreamer.livestreamv2.core;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.livestreamv2.IInputAudioStream;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ScreenAudioPlaybackObserver implements AudioRecordThread.IAudioRecordThreadObserver {
    public final AudioDeviceModule mAudioDeviceModule;
    public final IInputAudioStream mInputAudioStream;
    public final AudioRecordThread.IAudioRecordThreadObserver mOutObserver;
    public int mPowerDb = -100;
    public float mTotalDuration;

    public void release() {
        this.mAudioDeviceModule.enableOuterAudioFarend(false);
        this.mInputAudioStream.stop();
        this.mInputAudioStream.release();
    }

    public int getPowerDb() {
        return this.mPowerDb;
    }

    public void setVolume(float f) {
        AudioMixer.AudioMixerDescription mixerDescription = this.mInputAudioStream.getMixerDescription();
        mixerDescription.volumeCoeff = f;
        this.mInputAudioStream.setMixerDescription(mixerDescription);
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
    public void onError(int i, Exception exc) {
        AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mOutObserver;
        if (iAudioRecordThreadObserver != null) {
            iAudioRecordThreadObserver.onError(i, exc);
        }
    }

    public ScreenAudioPlaybackObserver(IInputAudioStream iInputAudioStream, AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, AudioDeviceModule audioDeviceModule) {
        this.mAudioDeviceModule = audioDeviceModule;
        audioDeviceModule.enableOuterAudioFarend(true);
        this.mOutObserver = iAudioRecordThreadObserver;
        this.mInputAudioStream = iInputAudioStream;
        this.mTotalDuration = 0.0f;
        iInputAudioStream.start();
    }

    public void calculatePowerDb(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer == null) {
            this.mPowerDb = -1000;
        }
        if (i <= 0 || i2 <= 0) {
            this.mPowerDb = -1000;
        }
        float f = this.mTotalDuration + ((i * 1000.0f) / i2);
        this.mTotalDuration = f;
        if (f > 2000.0f) {
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            int i4 = 0;
            double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i5 * 2 * i3;
                short s = (short) ((byteBuffer.get(i6) & 255) | ((byteBuffer.get(i6 + 1) & 255) << 8));
                d += s * s;
                if (2 == i3) {
                    short s2 = (short) ((byteBuffer.get(i6 + 2) & 255) | ((byteBuffer.get(i6 + 3) & 255) << 8));
                    d2 += s2 * s2;
                }
            }
            double d3 = i;
            int log10 = (int) ((Math.log10(((d / d3) / 1.073676289E9d) + 9.999999682655225E-21d) * 10.0d) + 127.0d);
            int log102 = (int) ((Math.log10(((d2 / d3) / 1.073676289E9d) + 9.999999682655225E-21d) * 10.0d) + 127.0d);
            if (log10 < 0) {
                log10 = 0;
            } else if (log10 > 127) {
                log10 = 127;
            }
            if (log102 >= 0) {
                if (log102 > 127) {
                    i4 = 127;
                } else {
                    i4 = log102;
                }
            }
            if (2 == i3) {
                this.mPowerDb = (i4 * 1000) + log10;
            } else {
                this.mPowerDb = (log10 * 1000) + log10;
            }
            this.mTotalDuration = 0.0f;
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
    public void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        calculatePowerDb(byteBuffer, i, i2, i3);
        this.mInputAudioStream.pushAudioFrame(byteBuffer, i2, i3, 16, i * i3, j);
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.pushOuterAudioFarend(byteBuffer, i, i2, i3, j);
        }
        AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mOutObserver;
        if (iAudioRecordThreadObserver != null) {
            iAudioRecordThreadObserver.onData(byteBuffer, i, i2, i3, j);
        }
    }
}
