package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;

/* loaded from: classes12.dex */
public class MediaEditorStream {
    public AudioMixer mAudioMixer;
    public long mNativeObj;
    public VideoMixer mVideoMixer;

    private native long nativeGetAudioMixer(long j);

    private native long nativeGetVideoMixer(long j);

    private native boolean nativeSetAudioMixerDescription(long j, String str, AudioMixer.AudioMixerDescription audioMixerDescription);

    private native void nativeSetOriginAudioTrack(long j, String str);

    private native void nativeSetOriginVideoTrack(long j, String str);

    private native boolean nativeSetVideoMixerDescription(long j, String str, VideoMixer.VideoMixerDescription videoMixerDescription);

    public synchronized void release() {
        if (this.mNativeObj == 0) {
            return;
        }
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            videoMixer.release();
            this.mVideoMixer = null;
        }
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null) {
            audioMixer.release();
            this.mAudioMixer = null;
        }
        this.mNativeObj = 0L;
    }

    public AudioMixer getAudioMixer() {
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer == null) {
            AudioMixer audioMixer2 = new AudioMixer(nativeGetAudioMixer(this.mNativeObj));
            this.mAudioMixer = audioMixer2;
            return audioMixer2;
        }
        return audioMixer;
    }

    public VideoMixer getVideoMixer() {
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer == null) {
            VideoMixer videoMixer2 = new VideoMixer(nativeGetVideoMixer(this.mNativeObj));
            this.mVideoMixer = videoMixer2;
            return videoMixer2;
        }
        return videoMixer;
    }

    public MediaEditorStream(long j) {
        this.mNativeObj = j;
    }

    public void setOriginAudioTrack(String str) {
        nativeSetOriginAudioTrack(this.mNativeObj, str);
    }

    public void setOriginVideoTrack(String str) {
        nativeSetOriginVideoTrack(this.mNativeObj, str);
    }

    public boolean setAudioMixerDescription(String str, AudioMixer.AudioMixerDescription audioMixerDescription) {
        return nativeSetAudioMixerDescription(this.mNativeObj, str, audioMixerDescription);
    }

    public boolean setVideoMixerDescription(String str, VideoMixer.VideoMixerDescription videoMixerDescription) {
        return nativeSetVideoMixerDescription(this.mNativeObj, str, videoMixerDescription);
    }
}
