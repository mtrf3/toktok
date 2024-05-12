package com.ss.ttlivestreamer.core.mixer;

import com.ss.ttlivestreamer.core.engine.AudioSink;

/* loaded from: classes12.dex */
public class AudioMixer extends NativeMixer {
    private native void nativeAddAudioSink(long j, AudioSink audioSink);

    private native void nativeAudioMixerRelease(long j);

    private native void nativeRemoveAudioSink(long j, AudioSink audioSink);

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean isAudioMixer() {
        return true;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        long j = this.mNativeObj;
        if (j != 0) {
            nativeAudioMixerRelease(j);
        }
        this.mNativeObj = 0L;
    }

    /* loaded from: classes12.dex */
    public static class AudioMixerDescription {
        public float volumeCoeff;

        public AudioMixerDescription() {
            this.volumeCoeff = 1.0f;
        }

        public float getColumeCoeff() {
            return this.volumeCoeff;
        }

        public AudioMixerDescription(float f) {
            this.volumeCoeff = f;
        }
    }

    public AudioMixer(long j) {
        setNativeObj(j);
    }

    public void addAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
    }

    public int createTrack(AudioMixerDescription audioMixerDescription) {
        return super.nativeCreateTrack(audioMixerDescription);
    }

    public AudioMixerDescription getDescription(int i) {
        return (AudioMixerDescription) super.nativeGetDescription(i);
    }

    public void removeAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
    }

    public void updateDescription(int i, AudioMixerDescription audioMixerDescription) {
        super.nativeUpdateDescription(i, audioMixerDescription);
    }
}
