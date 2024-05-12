package com.byted.cast.mediacommon;

import X.V0N;
import X.X1D;
import com.byted.cast.common.config.Config;

/* loaded from: classes29.dex */
public class MediaSetting {
    public boolean mEnableOrientationEventListener;
    public boolean mIsExternalAudioSource;
    public boolean mIsExternalScreenSource;
    public STREAM_TYPE mStreamType = STREAM_TYPE.STREAM_ES;
    public VideoProfile mVideoProfile = new VideoProfile();
    public AudioProfile mAudioProfile = new AudioProfile();
    public Config mConfig = new Config();

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mVideoProfile.toString());
        LIZ.append("\n");
        LIZ.append(this.mAudioProfile.toString());
        LIZ.append("\n");
        return X1D.LIZIZ(LIZ);
    }

    public boolean enableOrientationEventListener() {
        return this.mEnableOrientationEventListener;
    }

    public AudioProfile getAudioProfile() {
        return this.mAudioProfile;
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public VideoProfile getVideoProfile() {
        return this.mVideoProfile;
    }

    public boolean isExternalAudioSource() {
        return this.mIsExternalAudioSource;
    }

    public boolean isExternalScreenSource() {
        return this.mIsExternalScreenSource;
    }

    /* loaded from: classes29.dex */
    public enum ACODEC_ID {
        AUTO,
        ISACFIX,
        ILBC,
        OPUS,
        G729FEC2,
        G729FEC1,
        OPUSFEC1,
        OPUSFEC2,
        OPUS_8K,
        AAC;

        public static ACODEC_ID valueOf(String str) {
            return (ACODEC_ID) V0N.LJJJ(ACODEC_ID.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum BITRATE_MODE {
        BITRATE_MODE_ABR,
        BITRATE_MODE_VBR,
        BITRATE_MODE_CBR;

        public static BITRATE_MODE valueOf(String str) {
            return (BITRATE_MODE) V0N.LJJJ(BITRATE_MODE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum CAPTURE_TYPE {
        NATIVE,
        JAVA;

        public static CAPTURE_TYPE valueOf(String str) {
            return (CAPTURE_TYPE) V0N.LJJJ(CAPTURE_TYPE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum FILL_TYPE {
        SCALE,
        PADDING;

        public static FILL_TYPE valueOf(String str) {
            return (FILL_TYPE) V0N.LJJJ(FILL_TYPE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum PROJECTION_MODE {
        TNT_DESKTOP,
        PHONE_MIRROR;

        public static PROJECTION_MODE valueOf(String str) {
            return (PROJECTION_MODE) V0N.LJJJ(PROJECTION_MODE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum STREAM_TYPE {
        STREAM_ES,
        STREAM_RAW;

        public static STREAM_TYPE valueOf(String str) {
            return (STREAM_TYPE) V0N.LJJJ(STREAM_TYPE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum VCODEC_ID {
        AUTO,
        H264,
        H265,
        LOSSLESS;

        public static VCODEC_ID valueOf(String str) {
            return (VCODEC_ID) V0N.LJJJ(VCODEC_ID.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum VIDEO_SOURCE_TYPE {
        SCREEN,
        CAMERA,
        EXTERNAL_SURFACE;

        public static VIDEO_SOURCE_TYPE valueOf(String str) {
            return (VIDEO_SOURCE_TYPE) V0N.LJJJ(VIDEO_SOURCE_TYPE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum VideoFormat {
        VIDEO_FORMAT_NV12,
        VIDEO_FORMAT_NV21,
        VIDEO_FORMAT_I420,
        VIDEO_FORMAT_YUYV422,
        VIDEO_FORMAT_YVYU422,
        VIDEO_FORMAT_YUV422P,
        VIDEO_FORMAT_RGB565,
        VIDEO_FORMAT_RGB24,
        VIDEO_FORMAT_BGR24,
        VIDEO_FORMAT_ARGB,
        VIDEO_FORMAT_RGBA,
        VIDEO_FORMAT_ABGR,
        VIDEO_FORMAT_BGRA,
        VIDEO_FORMAT_ES_H264,
        VIDEO_FORMAT_ES_H265;

        public static VideoFormat valueOf(String str) {
            return (VideoFormat) V0N.LJJJ(VideoFormat.class, str);
        }
    }

    public void setConfig(Config config) {
        this.mConfig = config;
    }

    public void setEnableOrientationEventListener(boolean z) {
        this.mEnableOrientationEventListener = z;
    }

    public MediaSetting(boolean z, boolean z2) {
        this.mIsExternalScreenSource = z;
        this.mIsExternalAudioSource = z2;
    }
}
