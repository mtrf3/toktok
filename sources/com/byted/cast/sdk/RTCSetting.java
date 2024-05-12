package com.byted.cast.sdk;

import X.InterfaceC65349Pkn;
import X.V0N;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.utils.JsonFormatter;

/* loaded from: classes29.dex */
public class RTCSetting extends JsonFormatter {

    @InterfaceC65349Pkn("bDecodedByUser")
    public boolean bDecodedByUser;

    @InterfaceC65349Pkn("bEnableAudioCallback")
    public boolean bEnableAudioCallback;

    @InterfaceC65349Pkn("bEnableAudioMixer")
    public boolean bEnableAudioMixer = true;

    @InterfaceC65349Pkn("bEnableVideoNativeDecode")
    public boolean bEnableVideoNativeDecode;

    @InterfaceC65349Pkn("latencyMs")
    public int latencyMs;

    @InterfaceC65349Pkn("avsyncType")
    public AVSYNC_TYPE mAVSyncType;

    @InterfaceC65349Pkn("audioProfile")
    public RTCAudioProfile mAudioProfile;

    @InterfaceC65349Pkn("audioTransType")
    public TRANS_TYPE mAudioTransType;

    @InterfaceC65349Pkn("captureType")
    public CAPTURE_TYPE mCaptureType;

    @InterfaceC65349Pkn("mirrorId")
    public ContextManager.CastContext mCastContext;

    @InterfaceC65349Pkn("decodeType")
    public DECODE_TYPE mDecodeType;

    @InterfaceC65349Pkn("enableSourceOpengl")
    public boolean mEnableSourceOpengl;

    @InterfaceC65349Pkn("isExternalAudioSource")
    public boolean mIsExternalAudioSource;

    @InterfaceC65349Pkn("isExternalScreenSource")
    public boolean mIsExternalScreenSource;

    @InterfaceC65349Pkn("isExternalVideoSource")
    public boolean mIsExternalVideoSource;

    @InterfaceC65349Pkn("port")
    public int mPort;

    @InterfaceC65349Pkn("screenProfile")
    public RTCScreenProfile mScreenProfile;

    @InterfaceC65349Pkn("streamType")
    public STREAM_TYPE mStreamType;

    @InterfaceC65349Pkn("videoProfile")
    public RTCVideoProfile mVideoProfile;

    @InterfaceC65349Pkn("videoSourceType")
    public VIDEO_SOURCE_TYPE mVideoSourceType;

    @InterfaceC65349Pkn("videoTransType")
    public TRANS_TYPE mVideoTransType;

    public static boolean isHWDecodeSupported() {
        return true;
    }

    public AVSYNC_TYPE getAVSyncType() {
        return this.mAVSyncType;
    }

    public RTCAudioProfile getAudioProfile() {
        return this.mAudioProfile;
    }

    public TRANS_TYPE getAudioTransType() {
        return this.mAudioTransType;
    }

    public CAPTURE_TYPE getCaptureType() {
        return this.mCaptureType;
    }

    public DECODE_TYPE getDecodeType() {
        return this.mDecodeType;
    }

    public int getLatencyMs() {
        return this.latencyMs;
    }

    public int getPort() {
        return this.mPort;
    }

    public RTCScreenProfile getScreenProfile() {
        return this.mScreenProfile;
    }

    public STREAM_TYPE getStreamType() {
        return this.mStreamType;
    }

    public RTCVideoProfile getVideoProfile() {
        return this.mVideoProfile;
    }

    public VIDEO_SOURCE_TYPE getVideoSourceType() {
        return this.mVideoSourceType;
    }

    public TRANS_TYPE getVideoTransType() {
        return this.mVideoTransType;
    }

    public boolean isDecodedByUser() {
        return this.bDecodedByUser;
    }

    public boolean isEnableSourceOpengl() {
        return this.mEnableSourceOpengl;
    }

    public boolean isEnableVideoNativeDecode() {
        return this.bEnableVideoNativeDecode;
    }

    public boolean isExternalAudioSource() {
        return this.mIsExternalAudioSource;
    }

    public boolean isExternalScreenSource() {
        return this.mIsExternalScreenSource;
    }

    public boolean isExternalVideoSource() {
        return this.mIsExternalVideoSource;
    }

    public boolean isbEnableAudioCallback() {
        return this.bEnableAudioCallback;
    }

    public boolean isbEnableAudioMixer() {
        return this.bEnableAudioMixer;
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
    public enum AVSYNC_TYPE {
        SYNC_LOW_LATENCY,
        SYNC_NORMAL;

        public static AVSYNC_TYPE valueOf(String str) {
            return (AVSYNC_TYPE) V0N.LJJJ(AVSYNC_TYPE.class, str);
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
    public enum DECODE_TYPE {
        DECODE_TYPE_SW,
        DECODE_TYPE_HW;

        public static DECODE_TYPE valueOf(String str) {
            return (DECODE_TYPE) V0N.LJJJ(DECODE_TYPE.class, str);
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
    public enum TRANS_TYPE {
        UDP,
        TCP,
        DART,
        LLAMA,
        KCP,
        RTMP;

        public static TRANS_TYPE valueOf(String str) {
            return (TRANS_TYPE) V0N.LJJJ(TRANS_TYPE.class, str);
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

    public RTCSetting(ContextManager.CastContext castContext) {
        DECODE_TYPE decode_type = DECODE_TYPE.DECODE_TYPE_HW;
        this.mDecodeType = decode_type;
        STREAM_TYPE stream_type = STREAM_TYPE.STREAM_ES;
        this.mStreamType = stream_type;
        AVSYNC_TYPE avsync_type = AVSYNC_TYPE.SYNC_LOW_LATENCY;
        this.mAVSyncType = avsync_type;
        this.mCaptureType = CAPTURE_TYPE.JAVA;
        this.mAudioTransType = TRANS_TYPE.UDP;
        this.mVideoTransType = TRANS_TYPE.TCP;
        this.mPort = 3229;
        this.mVideoSourceType = VIDEO_SOURCE_TYPE.SCREEN;
        this.latencyMs = 100;
        this.mEnableSourceOpengl = true;
        this.mDecodeType = decode_type;
        this.mStreamType = stream_type;
        this.mAVSyncType = avsync_type;
        this.mPort = 3229;
        this.mCastContext = castContext;
        this.mAudioProfile = new RTCAudioProfile(castContext);
        this.mVideoProfile = new RTCVideoProfile(castContext);
        this.mScreenProfile = new RTCScreenProfile(castContext);
    }

    public static ACODEC_ID valueOfAudio(int i) {
        if (i != 1) {
            if (i != 3) {
                switch (i) {
                    case 6:
                        return ACODEC_ID.OPUSFEC1;
                    case 7:
                        return ACODEC_ID.OPUSFEC2;
                    case 8:
                        return ACODEC_ID.OPUS_8K;
                    case 9:
                        return ACODEC_ID.AAC;
                    default:
                        return ACODEC_ID.AUTO;
                }
            }
            return ACODEC_ID.OPUS;
        }
        return ACODEC_ID.ISACFIX;
    }

    public static VCODEC_ID valueOfVideo(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return VCODEC_ID.AUTO;
                }
                return VCODEC_ID.LOSSLESS;
            }
            return VCODEC_ID.H265;
        }
        return VCODEC_ID.H264;
    }

    public boolean isAutoPublish(RTCMediaKind rTCMediaKind) {
        if (rTCMediaKind == RTCMediaKind.AUDIO) {
            return this.mAudioProfile.isAutoPublish();
        }
        if (rTCMediaKind == RTCMediaKind.VIDEO) {
            return this.mVideoProfile.isAutoPublish();
        }
        return false;
    }

    public boolean isAutoSubscribe(RTCMediaKind rTCMediaKind) {
        if (rTCMediaKind == RTCMediaKind.AUDIO) {
            return this.mAudioProfile.isAutoSubscribe();
        }
        return false;
    }

    public void setAVSyncType(AVSYNC_TYPE avsync_type) {
        this.mAVSyncType = avsync_type;
    }

    public RTCSetting setAudioProfile(RTCAudioProfile rTCAudioProfile) {
        this.mAudioProfile = rTCAudioProfile;
        return this;
    }

    public void setAudioTransType(TRANS_TYPE trans_type) {
        this.mAudioTransType = trans_type;
    }

    public void setCaptureType(CAPTURE_TYPE capture_type) {
        this.mCaptureType = capture_type;
    }

    public void setDecodeType(DECODE_TYPE decode_type) {
        if (!isHWDecodeSupported() && decode_type == DECODE_TYPE.DECODE_TYPE_HW) {
            return;
        }
        this.mDecodeType = decode_type;
    }

    public void setDecodedByUser(boolean z) {
        this.bDecodedByUser = z;
    }

    public void setEnableSourceOpengl(boolean z) {
        this.mEnableSourceOpengl = z;
    }

    public void setEnableVideoNativeDecode(boolean z) {
        this.bEnableVideoNativeDecode = z;
    }

    public RTCSetting setExternalAudioSource(boolean z) {
        this.mIsExternalAudioSource = z;
        return this;
    }

    public RTCSetting setExternalScreenSource(boolean z) {
        this.mIsExternalScreenSource = z;
        return this;
    }

    public RTCSetting setExternalVideoSource(boolean z) {
        this.mIsExternalVideoSource = z;
        return this;
    }

    public void setLatencyMs(int i) {
        this.latencyMs = i;
    }

    public void setPort(int i) {
        this.mPort = i;
    }

    public RTCSetting setScreenProfile(RTCScreenProfile rTCScreenProfile) {
        this.mScreenProfile = rTCScreenProfile;
        return this;
    }

    public void setStreamType(STREAM_TYPE stream_type) {
        this.mStreamType = stream_type;
    }

    public RTCSetting setVideoProfile(RTCVideoProfile rTCVideoProfile) {
        this.mVideoProfile = rTCVideoProfile;
        return this;
    }

    public void setVideoSourceType(VIDEO_SOURCE_TYPE video_source_type) {
        this.mVideoSourceType = video_source_type;
    }

    public void setVideoTransType(TRANS_TYPE trans_type) {
        this.mVideoTransType = trans_type;
    }

    public void setbEnableAudioCallback(boolean z) {
        this.bEnableAudioCallback = z;
    }

    public void setbEnableAudioMixer(boolean z) {
        this.bEnableAudioMixer = z;
    }
}
