package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public abstract class MediaTrack implements StaticsReport.StaticReportInterface {
    public long mNativeObj;
    public MediaSource mSource;
    public ArrayList<VideoSink> mVideoSinks = new ArrayList<>();
    public ArrayList<AudioSink> mAudioSinks = new ArrayList<>();

    private native boolean nativeEnable(long j);

    private native String nativeId(long j);

    private native String nativeKind(long j);

    private native void nativeSetEnable(long j, boolean z);

    public native void nativeAddAudioSink(long j, AudioSink audioSink);

    public native void nativeAddVideoSink(long j, VideoSink videoSink);

    public native boolean nativeGetStaticsReport(long j, StaticsReport staticsReport);

    public native void nativeRemoveAudioSink(long j, AudioSink audioSink);

    public native void nativeRemoveVideoSink(long j, VideoSink videoSink);

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            Iterator<VideoSink> it = this.mVideoSinks.iterator();
            while (it.hasNext()) {
                VideoSink next = it.next();
                nativeRemoveVideoSink(this.mNativeObj, next);
                next.release();
                it.remove();
            }
            Iterator<AudioSink> it2 = this.mAudioSinks.iterator();
            while (it2.hasNext()) {
                AudioSink next2 = it2.next();
                nativeRemoveAudioSink(this.mNativeObj, next2);
                next2.release();
                it2.remove();
            }
            JniCommon.nativeReleaseRef(this.mNativeObj);
            this.mNativeObj = 0L;
        }
    }

    public boolean enable() {
        return nativeEnable(this.mNativeObj);
    }

    public String id() {
        return nativeId(this.mNativeObj);
    }

    public String kind() {
        return nativeKind(this.mNativeObj);
    }

    private long getNativeObj() {
        return this.mNativeObj;
    }

    public void addAudioSink(AudioSink audioSink) {
        if (this.mAudioSinks.indexOf(audioSink) < 0) {
            this.mAudioSinks.add(audioSink);
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
    }

    public void addVideoSink(VideoSink videoSink) {
        if (this.mVideoSinks.indexOf(videoSink) < 0) {
            this.mVideoSinks.add(videoSink);
            nativeAddVideoSink(this.mNativeObj, videoSink);
        }
    }

    public boolean containVideoSink(VideoSink videoSink) {
        return this.mVideoSinks.contains(videoSink);
    }

    @Override // com.ss.ttlivestreamer.core.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(this.mNativeObj, staticsReport);
    }

    public void removeAudioSink(AudioSink audioSink) {
        if (this.mAudioSinks.remove(audioSink)) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
    }

    public void removeVideoSink(VideoSink videoSink) {
        if (this.mVideoSinks.remove(videoSink)) {
            nativeRemoveVideoSink(this.mNativeObj, videoSink);
        }
    }

    public void setEnable(boolean z) {
        nativeSetEnable(this.mNativeObj, z);
    }

    public MediaTrack(long j, MediaSource mediaSource) {
        this.mNativeObj = j;
        this.mSource = mediaSource;
    }
}
