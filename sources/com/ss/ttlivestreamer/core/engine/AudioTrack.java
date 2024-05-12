package com.ss.ttlivestreamer.core.engine;

/* loaded from: classes12.dex */
public class AudioTrack extends MediaTrack {
    public AudioProcessor mAudioProcessor;

    private native void nativeSetAudioProcessor(AudioProcessor audioProcessor);

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public synchronized void release() {
        super.release();
        AudioProcessor audioProcessor = this.mAudioProcessor;
        if (audioProcessor != null) {
            audioProcessor.release();
            this.mAudioProcessor = null;
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public void addAudioSink(AudioSink audioSink) {
        super.addAudioSink(audioSink);
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public void removeAudioSink(AudioSink audioSink) {
        super.removeAudioSink(audioSink);
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.mAudioProcessor = audioProcessor;
        nativeSetAudioProcessor(audioProcessor);
    }

    public AudioTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
