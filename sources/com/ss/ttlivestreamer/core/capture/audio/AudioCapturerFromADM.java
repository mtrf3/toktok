package com.ss.ttlivestreamer.core.capture.audio;

import X.C0NY;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class AudioCapturerFromADM extends AudioCapturer {
    public AudioDeviceModule mAdm;
    public int mMode;
    public AudioCapturer.AudioCaptureObserver mObserver;
    public int mStat;

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
        this.mAdm = null;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void start() {
        int startRecording = this.mAdm.startRecording();
        if (startRecording == 0) {
            this.mStat = 1;
            return;
        }
        throw new IllegalStateException(C0NY.LIZIZ("Start adm audio record failure (", startRecording, ")"));
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void stop() {
        this.mAdm.stopRecording();
        this.mStat = 2;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mAdm.getParameter().getInt("audio_channels");
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void pause() {
        super.pause();
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.pause();
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void resume() {
        super.resume();
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.resume();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void mute(boolean z) {
        this.mMute = z;
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicMute(z);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void setOutputFormat(int i, int i2, int i3) {
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("audio_channels", i2);
            parameter.setInt("audio_sample", i);
            this.mAdm.setParameter(parameter);
        }
    }

    public AudioCapturerFromADM(int i, AudioDeviceModule audioDeviceModule, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mAdm = audioDeviceModule;
        this.mObserver = audioCaptureObserver;
        audioDeviceModule.setAudioCaptureObserver(audioCaptureObserver);
        this.mAdm.setParameter(this.mAdm.getParameter());
        setMode(i);
    }
}
