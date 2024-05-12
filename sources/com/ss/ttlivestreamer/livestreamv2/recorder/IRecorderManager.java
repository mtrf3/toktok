package com.ss.ttlivestreamer.livestreamv2.recorder;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.engine.AudioTrack;

/* loaded from: classes12.dex */
public interface IRecorderManager {

    /* loaded from: classes12.dex */
    public static class Config {
        public long audioBitrate;
        public int audioChannel;
        public int audioSample;
        public boolean havaVideo = true;
        public boolean haveAudio = true;
        public boolean isAlign16 = true;
        public boolean useMediaMuxer;
        public long videoBitrate;
        public int videoFps;
        public int videoHeight;
        public boolean videoProfileHigh;
        public int videoWidth;

        public Config dump() {
            Config config = new Config();
            config.videoProfileHigh = this.videoProfileHigh;
            config.videoWidth = this.videoWidth;
            config.videoHeight = this.videoHeight;
            config.videoFps = this.videoFps;
            config.havaVideo = this.havaVideo;
            config.videoBitrate = this.videoBitrate;
            config.haveAudio = this.haveAudio;
            config.audioChannel = this.audioChannel;
            config.audioSample = this.audioSample;
            config.audioBitrate = this.audioBitrate;
            return config;
        }
    }

    /* loaded from: classes12.dex */
    public interface IRecorderListener {
        void onRecorderError(int i, Exception exc);

        void onRecorderStarted();

        void onRecorderStoped(String str);
    }

    void addAudioTrack(AudioTrack audioTrack);

    Config getConfig();

    Canvas lock(Rect rect);

    void release();

    void removeAudioTrack(AudioTrack audioTrack);

    void setupAudioSource(AudioCapturer audioCapturer);

    void setupVideoSource(VideoCapturer videoCapturer);

    void start(String str, IRecorderListener iRecorderListener, Config config, int i);

    void stop();

    void unlockAndPost(Canvas canvas);
}
