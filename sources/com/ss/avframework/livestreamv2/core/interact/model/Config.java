package com.ss.avframework.livestreamv2.core.interact.model;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.ttlivestreamer.livestreamv2.utils.UrlUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Config {
    public boolean mAutoUpdateSeiForTalk;
    public boolean mChorusOnlySendPts;
    public Context mContext;
    public EGLContext mEGLContext14;
    public boolean mEnableAudioOnBackground;
    public boolean mEnableReportLiveCoreInfo;
    public Handler mHandler;
    public boolean mHeartbeatExtEnable;
    public MixStreamConfig mMixStreamConfig;
    public boolean mRoiOn;
    public int mSeiVersion;
    public boolean mSingleViewMode;
    public boolean mUpdateTalkSeiAB;
    public int mVolumeCallbackInterval;
    public int mVolumeThreshold;
    public int profile;
    public String mRtcExtParams = "{}";
    public String mProjectKey = "";
    public String mDeviceId = "";
    public String mAppChannel = "";
    public String mAppId = "";
    public String mAppVersion = "";
    public String mAppMinVersion = "";
    public Type mType = Type.VIDEO;
    public Character mCharacter = Character.GUEST;
    public ViewType mViewType = ViewType.SURFACE_VIEW;
    public VideoQuality mVideoQuality = VideoQuality.GUEST_NORMAL;
    public InteractMode mInteractMode = InteractMode.NORMAL;
    public boolean mEnableAudioOnStart = true;
    public boolean forceAlignTo16 = true;
    public LinkMicScene mScene = LinkMicScene.UNKNOWN;
    public int mUpdateTalkSeiInterval = 1000;
    public int mLogReportInterval = 5;
    public MixStreamType mMixStreamType = MixStreamType.NONE;
    public ChannelProfile mChannelProfile = ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING;
    public boolean mNeedCheckClientMixerParams = true;
    public boolean mDefaultAudioRoutetoSpeakerphone = true;
    public RTCEngine.Env mRtcEnv = RTCEngine.Env.ENV_PRODUCT;
    public boolean mNeedResetLayoutAfterInteract = true;
    public String mBusinessId = "";
    public ChorusCharacter mChorusCharacter = ChorusCharacter.NO_USE;

    /* loaded from: classes9.dex */
    public enum ChannelProfile {
        CHANNEL_PROFILE_COMMUNICATION(0),
        CHANNEL_PROFILE_LIVE_BROADCASTING(1),
        CHANNEL_PROFILE_GAME(2),
        CHANNEL_PROFILE_CLOUD_GAME(3);

        public int channelProfileNumber;

        public String getStringNum() {
            return Integer.toString(this.channelProfileNumber);
        }

        public static ChannelProfile valueOf(String str) {
            return (ChannelProfile) V0N.LJJJ(ChannelProfile.class, str);
        }

        ChannelProfile(int i) {
            this.channelProfileNumber = i;
        }
    }

    /* loaded from: classes12.dex */
    public class MixStreamConfig {
        public int audioBitrate;
        public int audioChannels;
        public AudioProfile audioProfile;
        public AudioSampleRate audioSampleRate;
        public int backgroundColor;
        public String mStreamName;
        public String mStreamUrl;
        public long mStreamUrlPriority;
        public String mStreamUuid;
        public String mTaskId = "";
        public int videoBitrate;
        public VideoCodec videoCodec;
        public int videoFrameRate;
        public float videoGop;
        public int videoHeight;
        public VideoProfile videoProfile;
        public Boolean videoSupportBFrame;
        public int videoWidth;

        public int getAudioSampleRateValue() {
            int i = AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate[this.audioSampleRate.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 44100;
                    }
                    return 48000;
                }
                return 32000;
            }
            return 16000;
        }

        public String getBackgroundColorString() {
            String LLLZ = C16880lQ.LLLZ("%6s", new Object[]{Integer.toHexString(this.backgroundColor).toUpperCase()});
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("#");
            LIZ.append(LLLZ.replaceAll(" ", CardStruct.IStatusCode.DEFAULT));
            return X1D.LIZIZ(LIZ);
        }

        public String getStreamUniqueId() {
            if (!TextUtils.isEmpty(this.mStreamUuid)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.mStreamUuid);
                LIZ.append(".");
                LIZ.append(this.mStreamUrlPriority);
                return X1D.LIZIZ(LIZ);
            }
            return "";
        }

        public String getStreamUrl() {
            String str = this.mStreamUrl;
            if (!TextUtils.isEmpty(str)) {
                long j = this.mStreamUrlPriority;
                if (j != 0) {
                    str = UrlUtils.AddParam(str, "pri", String.valueOf(j));
                }
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(getStreamUniqueId())) {
                return UrlUtils.AddParam(str, "_session_id", getStreamUniqueId());
            }
            return str;
        }

        public VideoProfile getVideoProfile() {
            if (this.videoCodec == VideoCodec.BYTEVC1) {
                this.videoProfile = VideoProfile.MAIN;
            }
            return this.videoProfile;
        }

        public void updateStreamUrlPriority() {
            this.mStreamUrlPriority = System.currentTimeMillis();
        }

        public int getAudioBitrate() {
            return this.audioBitrate;
        }

        public int getAudioChannels() {
            return this.audioChannels;
        }

        public AudioProfile getAudioProfile() {
            return this.audioProfile;
        }

        public AudioSampleRate getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getStreamName() {
            return this.mStreamName;
        }

        public String getTaskId() {
            return this.mTaskId;
        }

        public int getVideoBitrate() {
            return this.videoBitrate;
        }

        public VideoCodec getVideoCodec() {
            return this.videoCodec;
        }

        public int getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public float getVideoGop() {
            return this.videoGop;
        }

        public int getVideoHeight() {
            return this.videoHeight;
        }

        public Boolean getVideoSupportBFrame() {
            return this.videoSupportBFrame;
        }

        public int getVideoWidth() {
            return this.videoWidth;
        }

        public MixStreamConfig() {
            setVideoSize(360, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
            this.videoBitrate = 800;
            this.videoFrameRate = 15;
            this.videoGop = 2.0f;
            this.videoCodec = VideoCodec.H264;
            this.videoProfile = VideoProfile.HIGH;
            this.videoSupportBFrame = Boolean.FALSE;
            this.backgroundColor = 0;
            this.audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
            this.audioChannels = 2;
            this.audioBitrate = 128;
            this.audioProfile = AudioProfile.LC;
            this.mStreamUrl = "";
            this.mStreamName = "";
        }

        private String parseStreamName(String str) {
            try {
                String DecodeUrl = UrlUtils.DecodeUrl(str);
                int lastIndexOf = DecodeUrl.lastIndexOf(47) + 1;
                int indexOf = DecodeUrl.indexOf(63, lastIndexOf);
                if (indexOf < 0) {
                    indexOf = DecodeUrl.length();
                }
                return DecodeUrl.substring(lastIndexOf, indexOf);
            } catch (Exception unused) {
                return "";
            }
        }

        public MixStreamConfig setAudioBitrate(int i) {
            if (i < 32) {
                i = 32;
            } else if (i > 256) {
                i = 256;
            }
            this.audioBitrate = i;
            return this;
        }

        public MixStreamConfig setAudioChannels(int i) {
            if (i != 1 && i != 2) {
                i = 2;
            }
            this.audioChannels = i;
            return this;
        }

        public MixStreamConfig setAudioProfile(AudioProfile audioProfile) {
            this.audioProfile = audioProfile;
            return this;
        }

        public MixStreamConfig setAudioSampleRate(int i) {
            int[] iArr = {16000, 32000, 44100, 48000};
            int i2 = 0;
            AudioSampleRate[] audioSampleRateArr = {AudioSampleRate.SAMPLE_RATE_16K, AudioSampleRate.SAMPLE_RATE_32K, AudioSampleRate.SAMPLE_RATE_44K, AudioSampleRate.SAMPLE_RATE_48K};
            while (i > iArr[i2]) {
                i2++;
                if (i2 >= 4) {
                    this.audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
                    return this;
                }
            }
            this.audioSampleRate = audioSampleRateArr[i2];
            return this;
        }

        public MixStreamConfig setBackgroundColor(int i) {
            this.backgroundColor = i;
            return this;
        }

        public void setStreamUniqueIdentifier(String str) {
            this.mStreamUuid = str;
        }

        public MixStreamConfig setStreamUrl(String str) {
            this.mStreamUrl = str;
            this.mStreamName = parseStreamName(str);
            return this;
        }

        public MixStreamConfig setTaskId(String str) {
            this.mTaskId = str;
            return this;
        }

        public MixStreamConfig setVideoBitrate(int i) {
            if (i < 100) {
                i = 100;
            } else if (i > 5000) {
                i = 5000;
            }
            this.videoBitrate = i;
            return this;
        }

        public MixStreamConfig setVideoCodec(VideoCodec videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }

        public MixStreamConfig setVideoFrameRate(int i) {
            if (i < 5) {
                i = 5;
            } else if (i > 50) {
                i = 50;
            }
            this.videoFrameRate = i;
            return this;
        }

        public MixStreamConfig setVideoGop(float f) {
            if (f < 1.0f) {
                f = 1.0f;
            } else if (f > 10.0f) {
                f = 10.0f;
            }
            this.videoGop = f;
            return this;
        }

        public MixStreamConfig setVideoProfile(VideoProfile videoProfile) {
            this.videoProfile = videoProfile;
            return this;
        }

        public MixStreamConfig setVideoSupportBFrame(Boolean bool) {
            this.videoSupportBFrame = bool;
            return this;
        }

        public MixStreamConfig setAudioSampleRate(AudioSampleRate audioSampleRate) {
            this.audioSampleRate = audioSampleRate;
            return this;
        }

        public MixStreamConfig setVideoSize(int i, int i2) {
            this.videoWidth = Config.align(i, 2);
            this.videoHeight = Config.align(i2, 2);
            return this;
        }

        public synchronized void updateMixStreamLayoutParam(int i, int i2, int i3) {
            this.videoWidth = i;
            this.videoHeight = i2;
            this.videoBitrate = i3;
        }
    }

    /* loaded from: classes12.dex */
    public enum Vendor {
        UNKNOWN(0),
        AGORA(1),
        ZEGO(2),
        BYTE(4);

        public int value;

        public String getName() {
            int i = AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "unknown";
                    }
                    return "byte";
                }
                return "zego";
            }
            return "agora";
        }

        public int getValue() {
            return this.value;
        }

        public static Vendor fromValue(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return UNKNOWN;
                    }
                    return BYTE;
                }
                return ZEGO;
            }
            return AGORA;
        }

        public static Vendor valueOf(String str) {
            return (Vendor) V0N.LJJJ(Vendor.class, str);
        }

        Vendor(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.model.Config$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor;

        static {
            int[] iArr = new int[AudioSampleRate.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate = iArr;
            try {
                iArr[AudioSampleRate.SAMPLE_RATE_16K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate[AudioSampleRate.SAMPLE_RATE_32K.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate[AudioSampleRate.SAMPLE_RATE_48K.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate[AudioSampleRate.SAMPLE_RATE_44K.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Vendor.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor = iArr2;
            try {
                iArr2[Vendor.AGORA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor[Vendor.ZEGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor[Vendor.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public MixStreamConfig getMixStreamConfig() {
        if (this.mMixStreamConfig == null) {
            this.mMixStreamConfig = new MixStreamConfig();
        }
        return this.mMixStreamConfig;
    }

    public int getVolumeThreshold() {
        int i = this.mVolumeThreshold;
        if (i > 0) {
            return i;
        }
        return 30;
    }

    public boolean isClientMix() {
        MixStreamType mixStreamType = this.mMixStreamType;
        if (mixStreamType == MixStreamType.CLIENT_MIX || mixStreamType == MixStreamType.RTC_CLIENT_MIX) {
            return true;
        }
        return false;
    }

    /* loaded from: classes12.dex */
    public enum InteractMode {
        PK(0, "pk"),
        NORMAL(1, "normal"),
        FM(2, "fm"),
        VIDEO_TALK(3, "video_talk"),
        VIDEO_TALK_CAMERA(4, "video_talk_camera"),
        MULTI_ANCHOR(5, "multi_anchor"),
        SHARE_VIDEO(6, "share_video"),
        SHARE_VIDEO_PRI(7, "share_video_pri"),
        KTV(8, "ktv"),
        KTV_CAMERA(9, "ktv_camera"),
        KTV_PRI(10, "ktv_pri"),
        EQUAL_TALK_ROOM(11, "equal_talk_room"),
        MVP(12, "mvp"),
        GAME_AUDIO(13, "game_audio"),
        PK_CROSS(14, "pk_cross");

        public String name;
        public int value;

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        public static InteractMode valueOf(String str) {
            return (InteractMode) V0N.LJJJ(InteractMode.class, str);
        }

        InteractMode(int i, String str) {
            this.value = i;
            this.name = str;
        }
    }

    /* loaded from: classes12.dex */
    public enum MixStreamType {
        NONE(0, LiveGiftNewGifterBadgeSetting.DEFAULT),
        SERVER_MIX(1, "server"),
        CLIENT_MIX(2, "client"),
        RTC_CLIENT_MIX(3, "rtc_client");

        public String name;
        public int value;

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        public static MixStreamType valueOf(String str) {
            return (MixStreamType) V0N.LJJJ(MixStreamType.class, str);
        }

        MixStreamType(int i, String str) {
            this.value = i;
            this.name = str;
        }
    }

    /* loaded from: classes12.dex */
    public static class VideoQuality {
        public final int mBitrate;
        public final int mFps;
        public final int mHeight;
        public final int mOrigHeight;
        public final int mOrigWidth;
        public final int mWidth;
        public static final VideoQuality MIN = new VideoQuality(16, 16, 15, 50);
        public static final VideoQuality GUEST_NORMAL = new VideoQuality(180, 240, 15, 240);
        public static final VideoQuality GUEST_HIGH = new VideoQuality(240, 320, 15, 360);
        public static final VideoQuality ANCHOR_NORMAL = new VideoQuality(360, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 15, 800);
        public static final VideoQuality ANCHOR_HIGH = new VideoQuality(480, 864, 15, LinkMicRtcMixBitrateSetting.DEFAULT);

        public int getBitrate() {
            return this.mBitrate;
        }

        public int getFps() {
            return this.mFps;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getOrigHeight() {
            return this.mOrigHeight;
        }

        public int getOrigWidth() {
            return this.mOrigWidth;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public VideoQuality(int i, int i2, int i3, int i4) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mOrigWidth = i;
            this.mOrigHeight = i2;
            this.mFps = i3;
            this.mBitrate = i4;
        }
    }

    public String getAppChannel() {
        return this.mAppChannel;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppMinVersion() {
        return this.mAppMinVersion;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getBusinessId() {
        return this.mBusinessId;
    }

    public ChannelProfile getChannelProfile() {
        return this.mChannelProfile;
    }

    public Character getCharacter() {
        return this.mCharacter;
    }

    public ChorusCharacter getChorusCharacter() {
        return this.mChorusCharacter;
    }

    public boolean getChorusOnlySendPts() {
        return this.mChorusOnlySendPts;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean getDefaultAudioRoutetoSpeakerphone() {
        return this.mDefaultAudioRoutetoSpeakerphone;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public InteractMode getInteractMode() {
        return this.mInteractMode;
    }

    public int getLogReportInterval() {
        return this.mLogReportInterval;
    }

    public MixStreamType getMixStreamType() {
        return this.mMixStreamType;
    }

    public int getPerformanceProfile() {
        return this.profile;
    }

    public String getProjectKey() {
        return this.mProjectKey;
    }

    public boolean getRoiOn() {
        return this.mRoiOn;
    }

    public RTCEngine.Env getRtcEnv() {
        return this.mRtcEnv;
    }

    public String getRtcExtInfo() {
        return this.mRtcExtParams;
    }

    public LinkMicScene getScene() {
        return this.mScene;
    }

    public int getSeiVersion() {
        return this.mSeiVersion;
    }

    public EGLContext getSharedEGLContext14() {
        return this.mEGLContext14;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean getUpdateTalkSeiAB() {
        return this.mUpdateTalkSeiAB;
    }

    public int getUpdateTalkSeiInterval() {
        return this.mUpdateTalkSeiInterval;
    }

    public VideoQuality getVideoQuality() {
        return this.mVideoQuality;
    }

    public ViewType getViewType() {
        return this.mViewType;
    }

    public int getVolumeCallbackInterval() {
        return this.mVolumeCallbackInterval;
    }

    public boolean isAlignTo16() {
        return this.forceAlignTo16;
    }

    public boolean isAutoUpdateSeiForTalk() {
        return this.mAutoUpdateSeiForTalk;
    }

    public boolean isEnableAudioOnBackground() {
        return this.mEnableAudioOnBackground;
    }

    public boolean isEnableAudioOnStart() {
        return this.mEnableAudioOnStart;
    }

    public boolean isEnableReportLiveCoreInfo() {
        return this.mEnableReportLiveCoreInfo;
    }

    public boolean isHeartbeatExtEnable() {
        return this.mHeartbeatExtEnable;
    }

    public boolean isNeedCheckClientMixerParams() {
        return this.mNeedCheckClientMixerParams;
    }

    public boolean isNeedResetLayoutAfterInteract() {
        return this.mNeedResetLayoutAfterInteract;
    }

    public boolean isSingleViewMode() {
        return this.mSingleViewMode;
    }

    /* loaded from: classes12.dex */
    public enum AudioProfile {
        LC,
        HE;

        public static AudioProfile valueOf(String str) {
            return (AudioProfile) V0N.LJJJ(AudioProfile.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum AudioSampleRate {
        SAMPLE_RATE_16K,
        SAMPLE_RATE_32K,
        SAMPLE_RATE_44K,
        SAMPLE_RATE_48K;

        public static AudioSampleRate valueOf(String str) {
            return (AudioSampleRate) V0N.LJJJ(AudioSampleRate.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum Character {
        ANCHOR,
        GUEST;

        public static Character valueOf(String str) {
            return (Character) V0N.LJJJ(Character.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum ChorusCharacter {
        NO_USE,
        MAIN_SINGER,
        OTHER_SINGER;

        public static ChorusCharacter valueOf(String str) {
            return (ChorusCharacter) V0N.LJJJ(ChorusCharacter.class, str);
        }
    }

    /* loaded from: classes9.dex */
    public enum LinkMicScene {
        MULTI_GUEST,
        CO_HOST,
        UNKNOWN;

        public static LinkMicScene valueOf(String str) {
            return (LinkMicScene) V0N.LJJJ(LinkMicScene.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum Type {
        AUDIO,
        VIDEO;

        public static Type valueOf(String str) {
            return (Type) V0N.LJJJ(Type.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum VideoCodec {
        H264,
        BYTEVC1;

        public static VideoCodec valueOf(String str) {
            return (VideoCodec) V0N.LJJJ(VideoCodec.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum VideoOutputFormat {
        PIXEL_FORMAT_UNKNOWN,
        PIXEL_FORMAT_I420,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_BGRA32,
        PIXEL_FORMAT_RGBA32,
        PIXEL_FORMAT_ARGB32,
        PIXEL_FORMAT_ABGR32,
        TEXTURE_2D,
        TEXTURE_OES;

        public static VideoOutputFormat valueOf(String str) {
            return (VideoOutputFormat) V0N.LJJJ(VideoOutputFormat.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum VideoProfile {
        BASELINE,
        MAIN,
        HIGH;

        public static VideoProfile valueOf(String str) {
            return (VideoProfile) V0N.LJJJ(VideoProfile.class, str);
        }
    }

    /* loaded from: classes9.dex */
    public enum ViewType {
        SURFACE_VIEW,
        TEXTURE_VIEW;

        public static ViewType valueOf(String str) {
            return (ViewType) V0N.LJJJ(ViewType.class, str);
        }
    }

    public Config enableAudioOnBackground(boolean z) {
        this.mEnableAudioOnBackground = z;
        return this;
    }

    public Config enableAudioOnStart(boolean z) {
        this.mEnableAudioOnStart = z;
        return this;
    }

    public Config setAlignTo16(boolean z) {
        this.forceAlignTo16 = z;
        return this;
    }

    public Config setAppChannel(String str) {
        this.mAppChannel = str;
        return this;
    }

    public Config setAppId(String str) {
        this.mAppId = str;
        return this;
    }

    public Config setAppMinVersion(String str) {
        this.mAppMinVersion = str;
        return this;
    }

    public Config setAppVersion(String str) {
        this.mAppVersion = str;
        return this;
    }

    public Config setAutoUpdateSeiForTalk(boolean z) {
        this.mAutoUpdateSeiForTalk = z;
        return this;
    }

    public Config setBusinessId(String str) {
        this.mBusinessId = str;
        return this;
    }

    public void setChannelProfile(ChannelProfile channelProfile) {
        this.mChannelProfile = channelProfile;
    }

    public Config setCharacter(Character character) {
        this.mCharacter = character;
        return this;
    }

    public Config setChorusCharacter(ChorusCharacter chorusCharacter) {
        this.mChorusCharacter = chorusCharacter;
        return this;
    }

    public Config setChorusOnlySendPts(boolean z) {
        this.mChorusOnlySendPts = z;
        return this;
    }

    public Config setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public Config setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.mDefaultAudioRoutetoSpeakerphone = z;
        return this;
    }

    public Config setDeviceId(String str) {
        this.mDeviceId = str;
        return this;
    }

    public void setEnableReportLiveCoreInfo(boolean z) {
        this.mEnableReportLiveCoreInfo = z;
    }

    public Config setHandler(Handler handler) {
        this.mHandler = handler;
        return this;
    }

    public void setHeartbeatExtEnable(boolean z) {
        this.mHeartbeatExtEnable = z;
    }

    public Config setInteractMode(InteractMode interactMode) {
        this.mInteractMode = interactMode;
        return this;
    }

    public Config setLogReportInterval(int i) {
        this.mLogReportInterval = i;
        return this;
    }

    public Config setMixStreamType(MixStreamType mixStreamType) {
        this.mMixStreamType = mixStreamType;
        return this;
    }

    public Config setNeedCheckClientMixerParams(boolean z) {
        this.mNeedCheckClientMixerParams = z;
        return this;
    }

    public Config setNeedResetLayoutAfterInteract(boolean z) {
        this.mNeedResetLayoutAfterInteract = z;
        return this;
    }

    public void setPerformanceProfile(int i) {
        this.profile = i;
    }

    public Config setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public Config setRoiOn(boolean z) {
        this.mRoiOn = z;
        return this;
    }

    public void setRtcEnv(RTCEngine.Env env) {
        this.mRtcEnv = env;
    }

    public Config setRtcExtInfo(String str) {
        this.mRtcExtParams = str;
        return this;
    }

    public Config setScene(LinkMicScene linkMicScene) {
        this.mScene = linkMicScene;
        return this;
    }

    public Config setSeiVersion(int i) {
        this.mSeiVersion = i;
        return this;
    }

    public Config setSharedEGLContext14(EGLContext eGLContext) {
        this.mEGLContext14 = eGLContext;
        return this;
    }

    public Config setSingleViewMode(boolean z) {
        this.mSingleViewMode = z;
        return this;
    }

    public Config setType(Type type) {
        this.mType = type;
        return this;
    }

    public Config setUpdateTalkSeiAB(boolean z) {
        this.mUpdateTalkSeiAB = z;
        return this;
    }

    public Config setUpdateTalkSeiInterval(int i) {
        this.mUpdateTalkSeiInterval = i;
        return this;
    }

    public Config setVideoQuality(VideoQuality videoQuality) {
        int i;
        int width = videoQuality.getWidth();
        int i2 = 16;
        if (this.forceAlignTo16) {
            i = 16;
        } else {
            i = 2;
        }
        int align = align(width, i);
        int height = videoQuality.getHeight();
        if (!this.forceAlignTo16) {
            i2 = 2;
        }
        this.mVideoQuality = new VideoQuality(align, align(height, i2), videoQuality.mFps, videoQuality.mBitrate);
        return this;
    }

    public Config setViewType(ViewType viewType) {
        this.mViewType = viewType;
        return this;
    }

    public Config setVolumeCallbackInterval(int i) {
        this.mVolumeCallbackInterval = i;
        return this;
    }

    public Config setVolumeThreshold(int i) {
        this.mVolumeThreshold = i;
        return this;
    }

    public static int align(int i, int i2) {
        return (((i + i2) - 1) / i2) * i2;
    }

    public Config setRtcExtInfoWithParams(Vendor vendor, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtc_vendor", vendor.getValue());
            jSONObject.put("rtc_app_id", str);
            jSONObject.put("rtc_app_sign", str2);
            jSONObject.put("rtc_token", str3);
            jSONObject.put("rtc_channel_id", str4);
            jSONObject.put("rtc_user_id", str5);
            jSONObject.put("rtc_user_id_mode", i);
            jSONObject.put("user_id", str6);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("live_rtc_engine_config", jSONObject);
            this.mRtcExtParams = jSONObject2.toString();
        } catch (Exception unused) {
        }
        return this;
    }
}
