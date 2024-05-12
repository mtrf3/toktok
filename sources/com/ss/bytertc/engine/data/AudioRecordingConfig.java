package com.ss.bytertc.engine.data;

/* loaded from: classes33.dex */
public class AudioRecordingConfig {
    public String absoluteFileName;
    public AudioChannel channel;
    public AudioFrameSource frameSource;
    public AudioQuality quality;
    public AudioSampleRate sampleRate;

    public AudioRecordingConfig() {
        this.sampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_AUTO;
        this.channel = AudioChannel.AUDIO_CHANNEL_AUTO;
        this.frameSource = AudioFrameSource.AUDIO_FRAME_SOURCE_MIXED;
        this.quality = AudioQuality.AUDIO_QUALITY_MEDIUM;
    }

    public AudioRecordingConfig(String str, AudioSampleRate audioSampleRate, AudioChannel audioChannel, AudioFrameSource audioFrameSource, AudioQuality audioQuality) {
        this.absoluteFileName = str;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.frameSource = audioFrameSource;
        this.quality = audioQuality;
    }
}
