package com.ss.bytertc.engine.live;

import X.V0N;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class LiveTranscoding {
    public JSONObject advancedConfig;
    public AudioConfig audio;
    public JSONObject authInfo;
    public ClientMixParam clientMixParam;
    public Layout layout;
    public String roomId;
    public SpatialConfig spatialConfig;
    public SyncControlParam syncControlParam;
    public String url;
    public String userId;
    public VideoConfig video;
    public String action = "";
    public ByteRTCStreamMixingType mixType = ByteRTCStreamMixingType.STREAM_MIXING_BY_SERVER;

    /* loaded from: classes33.dex */
    public static class ClientMixParam {
        public boolean clientMixUseOriginalFrame;
        public boolean clientMixUseAudioMixer = true;
        public TranscoderClientMixVideoFormat clientMixVideoFormat = TranscoderClientMixVideoFormat.YUV_I420;

        public Boolean clientMixUseAudioMixer() {
            return Boolean.valueOf(this.clientMixUseAudioMixer);
        }

        public Boolean clientMixUseOriginalFrame() {
            return Boolean.valueOf(this.clientMixUseOriginalFrame);
        }

        public TranscoderClientMixVideoFormat getClientMixVideoFormat() {
            return this.clientMixVideoFormat;
        }

        public ClientMixParam setClientMixUseAudioMixer(Boolean bool) {
            this.clientMixUseAudioMixer = bool.booleanValue();
            return this;
        }

        public ClientMixParam setClientMixUseOriginalFrame(Boolean bool) {
            this.clientMixUseOriginalFrame = bool.booleanValue();
            return this;
        }

        public void setClientMixVideoFormat(TranscoderClientMixVideoFormat transcoderClientMixVideoFormat) {
            this.clientMixVideoFormat = transcoderClientMixVideoFormat;
        }
    }

    /* loaded from: classes33.dex */
    public static class Layout {
        public String appData;
        public String backgroundColor;
        public Region[] regions;

        /* loaded from: classes33.dex */
        public static class Builder {
            public String appData = "";
            public String backgroundColor = "#000000";
            public ArrayList<Region> regions;

            public Layout builder() {
                Layout layout = new Layout();
                ArrayList<Region> arrayList = this.regions;
                if (arrayList != null) {
                    layout.regions = (Region[]) arrayList.toArray(new Region[arrayList.size()]);
                }
                layout.appData = this.appData;
                layout.backgroundColor = this.backgroundColor;
                return layout;
            }

            public Builder addRegion(Region region) {
                if (this.regions == null) {
                    this.regions = new ArrayList<>();
                }
                this.regions.add(region);
                return this;
            }

            public Builder appData(String str) {
                this.appData = str;
                return this;
            }

            public Builder backgroundColor(String str) {
                this.backgroundColor = str;
                return this;
            }
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Object jSONObject2 = new JSONObject();
            try {
                Region[] regionArr = this.regions;
                if (regionArr != null) {
                    for (Region region : regionArr) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("uid", region.uid);
                        jSONObject3.put("roomID", region.roomId);
                        jSONObject3.put("x", region.x);
                        jSONObject3.put("y", region.y);
                        jSONObject3.put("w", region.w);
                        jSONObject3.put("h", region.h);
                        jSONObject3.put("zorder", region.zorder);
                        jSONObject3.put("alpha", region.alpha);
                        jSONObject3.put("cornerRadius", region.cornerRadius);
                        jSONObject3.put("contentControl", region.contentControl);
                        jSONObject3.put("renderMode", region.renderMode);
                        jSONObject3.put("screen", region.screenStream);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put("canvas", jSONObject2);
                jSONObject.put("regions", jSONArray);
                jSONObject.put("app_data", this.appData);
                return jSONObject.toString();
            } catch (JSONException e) {
                LogUtil.w("LiveTranscoding", "create layout json message happen exception", e);
                return null;
            }
        }

        public String getAppData() {
            return this.appData;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public Region[] getRegions() {
            return this.regions;
        }

        public void setAppData(String str) {
            this.appData = str;
        }

        public void setBackgroundColor(String str) {
            this.backgroundColor = str;
        }

        public void setRegions(Region[] regionArr) {
            this.regions = regionArr;
        }
    }

    /* loaded from: classes33.dex */
    public static class SyncControlParam {
        public Boolean syncStream = Boolean.FALSE;
        public int syncQueueLengthMs = 0;
        public boolean syncOnlySendPts = false;
        public boolean syncClientVideoNeedMix = false;
        public String syncBaseUser = "";

        public Boolean syncClientVideoNeedMix() {
            return Boolean.valueOf(this.syncClientVideoNeedMix);
        }

        public String syncBaseUser() {
            return this.syncBaseUser;
        }

        public boolean syncOnlySendPts() {
            return this.syncOnlySendPts;
        }

        public int syncQueueLengthMs() {
            return this.syncQueueLengthMs;
        }

        public Boolean syncStream() {
            return this.syncStream;
        }

        public SyncControlParam setSyncBaseUser(String str) {
            this.syncBaseUser = str;
            return this;
        }

        public SyncControlParam setSyncClientVideoNeedMix(Boolean bool) {
            this.syncClientVideoNeedMix = bool.booleanValue();
            return this;
        }

        public SyncControlParam setSyncOnlySendPts(boolean z) {
            this.syncOnlySendPts = z;
            return this;
        }

        public SyncControlParam setSyncQueueLengthMs(int i) {
            this.syncQueueLengthMs = i;
            return this;
        }

        public SyncControlParam setSyncStream(Boolean bool) {
            this.syncStream = bool;
            return this;
        }
    }

    public static LiveTranscoding getDefualtLiveTranscode() {
        VideoConfig videoConfig = new VideoConfig();
        videoConfig.setCodec(VideoConfig.VideoCodecType.VIDEO_CODEC_TYPE_H264);
        videoConfig.setFps(15);
        videoConfig.setGop(2);
        videoConfig.setKBitRate(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        videoConfig.setHeight(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
        videoConfig.setWidth(360);
        videoConfig.setBFrame(false);
        AudioConfig audioConfig = new AudioConfig();
        audioConfig.setCodec(AudioConfig.AudioCodecType.AUDIO_CODEC_TYPE_AAC);
        audioConfig.setSampleRate(48000);
        audioConfig.setChannels(2);
        audioConfig.setKBitRate(64);
        audioConfig.setAacProfile(AACProfile.AAC_PROFILE_LC);
        SyncControlParam syncControlParam = new SyncControlParam();
        Boolean bool = Boolean.FALSE;
        syncControlParam.setSyncStream(bool);
        syncControlParam.setSyncBaseUser("");
        syncControlParam.setSyncOnlySendPts(false);
        syncControlParam.setSyncClientVideoNeedMix(bool);
        syncControlParam.setSyncQueueLengthMs(0);
        ClientMixParam clientMixParam = new ClientMixParam();
        clientMixParam.setClientMixUseAudioMixer(Boolean.TRUE);
        clientMixParam.setClientMixUseOriginalFrame(bool);
        clientMixParam.setClientMixVideoFormat(TranscoderClientMixVideoFormat.YUV_I420);
        SpatialConfig spatialConfig = new SpatialConfig();
        spatialConfig.setAudienceSpatialPosition(0.0f, 0.0f, 0.0f);
        spatialConfig.setEnableSpatialRender(false);
        Layout.Builder builder = new Layout.Builder();
        builder.backgroundColor("#000000");
        builder.appData("");
        LiveTranscoding liveTranscoding = new LiveTranscoding();
        liveTranscoding.setAudio(audioConfig);
        liveTranscoding.setVideo(videoConfig);
        liveTranscoding.setSyncControlParam(syncControlParam);
        liveTranscoding.setClientMixParam(clientMixParam);
        liveTranscoding.setSpatialConfig(spatialConfig);
        liveTranscoding.setLayout(builder.builder());
        liveTranscoding.setUrl(null);
        return liveTranscoding;
    }

    public String getFieldAction() {
        String str = this.action;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getFieldAdvancedConfig() {
        JSONObject jSONObject = this.advancedConfig;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public String getFieldAudioConfigAacProfile() {
        String str;
        AudioConfig audioConfig = this.audio;
        if (audioConfig == null || (str = audioConfig.aacProfile) == null) {
            return "";
        }
        return str;
    }

    public int getFieldAudioConfigBitrate() {
        AudioConfig audioConfig = this.audio;
        if (audioConfig == null) {
            return 0;
        }
        return audioConfig.bitRate;
    }

    public int getFieldAudioConfigChannels() {
        AudioConfig audioConfig = this.audio;
        if (audioConfig == null) {
            return 0;
        }
        return audioConfig.channels;
    }

    public String getFieldAudioConfigCodec() {
        String str;
        AudioConfig audioConfig = this.audio;
        if (audioConfig == null || (str = audioConfig.codec) == null) {
            return "";
        }
        return str;
    }

    public int getFieldAudioConfigSampleRate() {
        AudioConfig audioConfig = this.audio;
        if (audioConfig == null) {
            return 0;
        }
        return audioConfig.sampleRate;
    }

    public String getFieldAuthInfo() {
        JSONObject jSONObject = this.authInfo;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public boolean getFieldClientMixParamClientMixUseAudioMixer() {
        ClientMixParam clientMixParam = this.clientMixParam;
        if (clientMixParam == null) {
            return true;
        }
        return clientMixParam.clientMixUseAudioMixer;
    }

    public boolean getFieldClientMixParamClientMixUseOriginalFrame() {
        ClientMixParam clientMixParam = this.clientMixParam;
        if (clientMixParam == null) {
            return false;
        }
        return clientMixParam.clientMixUseOriginalFrame;
    }

    public int getFieldClientMixParamClientMixVideoFormat() {
        TranscoderClientMixVideoFormat transcoderClientMixVideoFormat;
        ClientMixParam clientMixParam = this.clientMixParam;
        if (clientMixParam == null) {
            transcoderClientMixVideoFormat = TranscoderClientMixVideoFormat.YUV_I420;
        } else {
            transcoderClientMixVideoFormat = clientMixParam.clientMixVideoFormat;
        }
        return transcoderClientMixVideoFormat.getValue();
    }

    public String getFieldLayoutAppData() {
        String str;
        Layout layout = this.layout;
        if (layout == null || (str = layout.appData) == null) {
            return "";
        }
        return str;
    }

    public String getFieldLayoutBackgroundColor() {
        String str;
        Layout layout = this.layout;
        if (layout == null || (str = layout.backgroundColor) == null) {
            return "";
        }
        return str;
    }

    public Region[] getFieldLayoutRegions() {
        Layout layout = this.layout;
        if (layout == null) {
            return null;
        }
        return layout.regions;
    }

    public int getFieldMixType() {
        return this.mixType.value();
    }

    public String getFieldRoomId() {
        String str = this.roomId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationForwardX() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.forward.x;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationForwardY() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.forward.y;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationForwardZ() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.forward.z;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationRightX() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.right.x;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationRightY() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.right.y;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationRightZ() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.right.z;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationUpX() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.up.x;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationUpY() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.up.y;
    }

    public float getFieldSpatialConfigAudienceSpatialOrientationUpZ() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialOrientation.up.z;
    }

    public float getFieldSpatialConfigAudienceSpatialPositionX() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialPosition.x;
    }

    public float getFieldSpatialConfigAudienceSpatialPositionY() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialPosition.y;
    }

    public float getFieldSpatialConfigAudienceSpatialPositionZ() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return 0.0f;
        }
        return spatialConfig.audienceSpatialPosition.z;
    }

    public boolean getFieldSpatialConfigEnableSpatialRender() {
        SpatialConfig spatialConfig = this.spatialConfig;
        if (spatialConfig == null) {
            return false;
        }
        return spatialConfig.enableSpatialRender;
    }

    public String getFieldSyncControlParamSyncBaseUser() {
        SyncControlParam syncControlParam = this.syncControlParam;
        if (syncControlParam == null) {
            return "";
        }
        return syncControlParam.syncBaseUser;
    }

    public boolean getFieldSyncControlParamSyncClientVideoNeedMix() {
        SyncControlParam syncControlParam = this.syncControlParam;
        if (syncControlParam == null) {
            return false;
        }
        return syncControlParam.syncClientVideoNeedMix;
    }

    public boolean getFieldSyncControlParamSyncOnlySendPts() {
        SyncControlParam syncControlParam = this.syncControlParam;
        if (syncControlParam == null) {
            return false;
        }
        return syncControlParam.syncOnlySendPts;
    }

    public int getFieldSyncControlParamSyncQueueLengthMs() {
        SyncControlParam syncControlParam = this.syncControlParam;
        if (syncControlParam == null) {
            return 0;
        }
        return syncControlParam.syncQueueLengthMs;
    }

    public boolean getFieldSyncControlParamSyncStream() {
        SyncControlParam syncControlParam = this.syncControlParam;
        if (syncControlParam == null) {
            return false;
        }
        return syncControlParam.syncStream.booleanValue();
    }

    public String getFieldUrl() {
        String str = this.url;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getFieldUserId() {
        String str = this.userId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public boolean getFieldVideoConfigBFrame() {
        VideoConfig videoConfig = this.video;
        if (videoConfig == null) {
            return false;
        }
        return videoConfig.bFrame;
    }

    public int getFieldVideoConfigBitrate() {
        VideoConfig videoConfig = this.video;
        if (videoConfig == null) {
            return 0;
        }
        return videoConfig.bitRate;
    }

    public String getFieldVideoConfigCodec() {
        String str;
        VideoConfig videoConfig = this.video;
        if (videoConfig == null || (str = videoConfig.codec) == null) {
            return "";
        }
        return str;
    }

    public int getFieldVideoConfigFps() {
        VideoConfig videoConfig = this.video;
        if (videoConfig == null) {
            return 0;
        }
        return videoConfig.fps;
    }

    public int getFieldVideoConfigGop() {
        VideoConfig videoConfig = this.video;
        if (videoConfig == null) {
            return 0;
        }
        return videoConfig.gop;
    }

    public int getFieldVideoConfigHeight() {
        VideoConfig videoConfig = this.video;
        if (videoConfig == null) {
            return 0;
        }
        return videoConfig.height;
    }

    public int getFieldVideoConfigWidth() {
        VideoConfig videoConfig = this.video;
        if (videoConfig == null) {
            return 0;
        }
        return videoConfig.width;
    }

    public JSONObject getTranscodeMessage() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject.put("codec", this.video.codec);
            jSONObject.put("fps", this.video.fps);
            jSONObject.put("gop", this.video.gop);
            jSONObject.put("bitRate", this.video.bitRate);
            jSONObject.put("width", this.video.width);
            jSONObject.put("height", this.video.height);
            jSONObject.put("bFrame", this.video.bFrame);
            jSONObject2.put("codec", this.audio.codec);
            jSONObject2.put("bitRate", this.audio.bitRate);
            jSONObject2.put("sampleRate", this.audio.sampleRate);
            jSONObject2.put("channels", this.audio.channels);
            jSONObject2.put("profile", this.audio.aacProfile);
            jSONObject3.put("clientMixUseOriginalFrame", this.clientMixParam.clientMixUseOriginalFrame);
            jSONObject3.put("clientMixUseAudioMixer", this.clientMixParam.clientMixUseAudioMixer);
            jSONObject3.put("clientMixVideoFormat", this.clientMixParam.clientMixVideoFormat.getValue());
            jSONObject4.put("syncStream", this.syncControlParam.syncStream);
            jSONObject4.put("syncQueueLengthMs", this.syncControlParam.syncQueueLengthMs);
            jSONObject4.put("syncOnlySendPts", this.syncControlParam.syncOnlySendPts);
            jSONObject4.put("syncClientVideoNeedMix", this.syncControlParam.syncClientVideoNeedMix);
            jSONObject4.put("syncBaseUser", this.syncControlParam.syncBaseUser);
            jSONObject6.put("bgnd", this.layout.backgroundColor);
            Region[] regionArr = this.layout.regions;
            if (regionArr != null) {
                for (Region region : regionArr) {
                    JSONObject jSONObject10 = new JSONObject();
                    jSONObject10.put("uid", region.uid);
                    jSONObject10.put("roomID", region.roomId);
                    jSONObject10.put("x", region.x);
                    jSONObject10.put("y", region.y);
                    jSONObject10.put("w", region.w);
                    jSONObject10.put("h", region.h);
                    jSONObject10.put("zorder", region.zorder);
                    jSONObject10.put("alpha", region.alpha);
                    jSONObject10.put("cornerRadius", region.cornerRadius);
                    jSONObject10.put("contentControl", region.contentControl);
                    jSONObject10.put("renderMode", region.renderMode);
                    jSONObject10.put("local_user", region.localUser);
                    jSONObject10.put("screen", region.screenStream);
                    jSONArray.put(jSONObject10);
                }
            }
            jSONObject5.put("canvas", jSONObject6);
            jSONObject5.put("regions", jSONArray);
            jSONObject5.put("app_data", this.layout.appData);
            jSONObject7.put("url", this.url);
            jSONObject8.put("transcode", jSONObject7);
            jSONObject8.put("video", jSONObject);
            jSONObject8.put("audio", jSONObject2);
            jSONObject8.put("clientMix", jSONObject3);
            jSONObject8.put("syncControl", jSONObject4);
            jSONObject8.put("layout", jSONObject5);
            jSONObject8.put("advancedConfig", this.advancedConfig);
            Object obj = this.authInfo;
            if (obj != null) {
                jSONObject8.put("authInfo", obj);
            }
            jSONObject9.put("mixingType", this.mixType);
            jSONObject9.put("type", "transcode");
            jSONObject9.put("roomId", this.roomId);
            jSONObject9.put("userId", this.userId);
            jSONObject9.put("action", this.action);
            jSONObject9.put("transcodeMeta", jSONObject8);
            return jSONObject9;
        } catch (JSONException e) {
            LogUtil.w("LiveTranscoding", "get json message happen exception", e);
            return null;
        }
    }

    /* loaded from: classes33.dex */
    public static class AudioConfig {
        public String codec = "AAC";
        public int bitRate = 64000;
        public int sampleRate = 48000;
        public int channels = 2;
        public String aacProfile = AACProfile.AAC_PROFILE_LC.getValue();

        /* loaded from: classes33.dex */
        public enum AudioCodecType {
            AUDIO_CODEC_TYPE_AAC("AAC");

            public String audioCodecType;

            public String getValue() {
                return this.audioCodecType;
            }

            public static AudioCodecType valueOf(String str) {
                return (AudioCodecType) V0N.LJJJ(AudioCodecType.class, str);
            }

            AudioCodecType(String str) {
                this.audioCodecType = str;
            }
        }

        public AudioConfig setAacProfile(AACProfile aACProfile) {
            this.aacProfile = aACProfile.getValue();
            return this;
        }

        public AudioConfig setChannels(int i) {
            this.channels = i;
            return this;
        }

        public AudioConfig setCodec(AudioCodecType audioCodecType) {
            this.codec = audioCodecType.getValue();
            return this;
        }

        public AudioConfig setKBitRate(int i) {
            if (i > 0) {
                if (i > 2097152) {
                    i = 2097152;
                }
            } else {
                i = 0;
            }
            this.bitRate = i * 1000;
            return this;
        }

        public AudioConfig setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public static class VideoConfig {
        public boolean bFrame;
        public String codec = "H264";
        public int fps = 30;
        public int gop = 2;
        public int bitRate = 500000;
        public int width = 360;
        public int height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;

        /* loaded from: classes33.dex */
        public enum VideoCodecType {
            VIDEO_CODEC_TYPE_H264("H264"),
            VIDEO_CODEC_TYPE_BYTEVC1("ByteVC1");

            public String videoCodecType;

            public String getValue() {
                return this.videoCodecType;
            }

            public static VideoCodecType valueOf(String str) {
                return (VideoCodecType) V0N.LJJJ(VideoCodecType.class, str);
            }

            VideoCodecType(String str) {
                this.videoCodecType = str;
            }
        }

        public VideoConfig setBFrame(boolean z) {
            this.bFrame = z;
            return this;
        }

        public VideoConfig setCodec(VideoCodecType videoCodecType) {
            this.codec = videoCodecType.getValue();
            return this;
        }

        public VideoConfig setFps(int i) {
            this.fps = i;
            return this;
        }

        public VideoConfig setGop(int i) {
            this.gop = i;
            return this;
        }

        public VideoConfig setHeight(int i) {
            this.height = i;
            return this;
        }

        public VideoConfig setKBitRate(int i) {
            if (i > 0) {
                if (i > 2097152) {
                    i = 2097152;
                }
            } else {
                i = 0;
            }
            this.bitRate = i * 1000;
            return this;
        }

        public VideoConfig setWidth(int i) {
            this.width = i;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public enum AACProfile {
        AAC_PROFILE_LC("LC"),
        AAC_PROFILE_HEV1("HEv1"),
        AAC_PROFILE_HEV2("HEv2");

        public String AacProfile;

        public String getValue() {
            return this.AacProfile;
        }

        public static AACProfile valueOf(String str) {
            return (AACProfile) V0N.LJJJ(AACProfile.class, str);
        }

        AACProfile(String str) {
            this.AacProfile = str;
        }
    }

    /* loaded from: classes33.dex */
    public static class Region {
        public double cornerRadius;
        public byte[] data;
        public boolean localUser;
        public boolean screenStream;
        public double x;
        public double y;
        public int zorder;
        public String uid = "";
        public String roomId = "";
        public double w = 1.0d;
        public double h = 1.0d;
        public double alpha = 1.0d;
        public TranscoderContentControlType contentControl = TranscoderContentControlType.HAS_AUDIO_AND_VIDEO;
        public TranscoderRenderMode renderMode = TranscoderRenderMode.RENDER_HIDDEN;
        public TranscoderLayoutRegionType type = TranscoderLayoutRegionType.LAYOUT_REGION_TYPE_VIDEO_STREAM;
        public DataParam dataParam = new DataParam();
        public Position spatialPosition = new Position();
        public boolean applySpatialAudio = true;

        public boolean isLocalUser() {
            return this.localUser;
        }

        public boolean isScreenStream() {
            return this.screenStream;
        }

        /* loaded from: classes33.dex */
        public static class DataParam {
            public int imageHeight;
            public int imageWidth;

            public DataParam setImageHeight(int i) {
                this.imageHeight = i;
                return this;
            }

            public DataParam setImageWidth(int i) {
                this.imageWidth = i;
                return this;
            }
        }

        public Region alpha(double d) {
            this.alpha = d;
            return this;
        }

        public Region applySpatialAudio(boolean z) {
            this.applySpatialAudio = z;
            return this;
        }

        public Region contentControl(TranscoderContentControlType transcoderContentControlType) {
            this.contentControl = transcoderContentControlType;
            return this;
        }

        public Region data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Region dataParam(DataParam dataParam) {
            this.dataParam = dataParam;
            return this;
        }

        public Region renderMode(TranscoderRenderMode transcoderRenderMode) {
            this.renderMode = transcoderRenderMode;
            return this;
        }

        public Region roomId(String str) {
            this.roomId = str;
            return this;
        }

        public Region setCornerRadius(double d) {
            this.cornerRadius = d;
            return this;
        }

        public Region setLocalUser(boolean z) {
            this.localUser = z;
            return this;
        }

        public Region setScreenStream(boolean z) {
            this.screenStream = z;
            return this;
        }

        public Region type(TranscoderLayoutRegionType transcoderLayoutRegionType) {
            this.type = transcoderLayoutRegionType;
            return this;
        }

        public Region uid(String str) {
            this.uid = str;
            return this;
        }

        public Region zorder(int i) {
            this.zorder = i;
            return this;
        }

        public Region position(double d, double d2) {
            this.x = d;
            this.y = d2;
            return this;
        }

        public Region size(double d, double d2) {
            this.w = d;
            this.h = d2;
            return this;
        }

        public Region spatialPosition(float f, float f2, float f3) {
            Position position = this.spatialPosition;
            position.x = f;
            position.y = f2;
            position.z = f3;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public enum TranscoderClientMixVideoFormat {
        YUV_I420(0),
        TEXTURE_2D(1),
        CVPIXEL_BUFFER_BGRA(2),
        YUV_NV12(3);

        public int videoFormat;

        public int getValue() {
            return this.videoFormat;
        }

        public static TranscoderClientMixVideoFormat valueOf(String str) {
            return (TranscoderClientMixVideoFormat) V0N.LJJJ(TranscoderClientMixVideoFormat.class, str);
        }

        TranscoderClientMixVideoFormat(int i) {
            this.videoFormat = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum TranscoderContentControlType {
        HAS_AUDIO_AND_VIDEO(0),
        HAS_AUDIO_ONLY(1),
        HAS_VIDEO_ONLY(2);

        public int contentControlType;

        public int getValue() {
            return this.contentControlType;
        }

        public static TranscoderContentControlType valueOf(String str) {
            return (TranscoderContentControlType) V0N.LJJJ(TranscoderContentControlType.class, str);
        }

        TranscoderContentControlType(int i) {
            this.contentControlType = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum TranscoderLayoutRegionType {
        LAYOUT_REGION_TYPE_VIDEO_STREAM(0),
        LAYOUT_REGION_TYPE_IMAGE(1);

        public int regionType;

        public int getValue() {
            return this.regionType;
        }

        public static TranscoderLayoutRegionType valueOf(String str) {
            return (TranscoderLayoutRegionType) V0N.LJJJ(TranscoderLayoutRegionType.class, str);
        }

        TranscoderLayoutRegionType(int i) {
            this.regionType = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum TranscoderRenderMode {
        RENDER_UNKNOWN(0),
        RENDER_HIDDEN(1),
        RENDER_FIT(2),
        RENDER_ADAPTIVE(3);

        public int renderMode;

        public int getValue() {
            return this.renderMode;
        }

        public static TranscoderRenderMode valueOf(String str) {
            return (TranscoderRenderMode) V0N.LJJJ(TranscoderRenderMode.class, str);
        }

        TranscoderRenderMode(int i) {
            this.renderMode = i;
        }
    }

    public AudioConfig getAudio() {
        return this.audio;
    }

    public ClientMixParam getClientMixParam() {
        return this.clientMixParam;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public ByteRTCStreamMixingType getMixType() {
        return this.mixType;
    }

    public SpatialConfig getSpatialConfig() {
        return this.spatialConfig;
    }

    public SyncControlParam getSyncControlParam() {
        return this.syncControlParam;
    }

    public String getUrl() {
        return this.url;
    }

    public VideoConfig getVideo() {
        return this.video;
    }

    /* loaded from: classes33.dex */
    public static class SpatialConfig {
        public boolean enableSpatialRender;
        public Position audienceSpatialPosition = new Position();
        public HumanOrientation audienceSpatialOrientation = new HumanOrientation();

        public SpatialConfig setAudienceSpatialOrientation(HumanOrientation humanOrientation) {
            this.audienceSpatialOrientation = humanOrientation;
            return this;
        }

        public SpatialConfig setAudienceSpatialPosition(Position position) {
            this.audienceSpatialPosition = position;
            return this;
        }

        public SpatialConfig setEnableSpatialRender(boolean z) {
            this.enableSpatialRender = z;
            return this;
        }

        public SpatialConfig setAudienceSpatialPosition(float f, float f2, float f3) {
            Position position = this.audienceSpatialPosition;
            position.x = f;
            position.y = f2;
            position.z = f3;
            return this;
        }
    }

    public double getFieldLayoutRegionAlpha(Region region) {
        if (region == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return region.alpha;
    }

    public boolean getFieldLayoutRegionApplySpatialAudio(Region region) {
        if (region == null) {
            return true;
        }
        return region.applySpatialAudio;
    }

    public int getFieldLayoutRegionContentControl(Region region) {
        if (region == null) {
            return 0;
        }
        return region.contentControl.getValue();
    }

    public double getFieldLayoutRegionCornerRadius(Region region) {
        if (region == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return region.cornerRadius;
    }

    public byte[] getFieldLayoutRegionData(Region region) {
        if (region == null) {
            return null;
        }
        return region.data;
    }

    public int getFieldLayoutRegionDataParamImageHeight(Region region) {
        if (region == null) {
            return 0;
        }
        return region.dataParam.imageHeight;
    }

    public int getFieldLayoutRegionDataParamImageWidth(Region region) {
        if (region == null) {
            return 0;
        }
        return region.dataParam.imageWidth;
    }

    public double getFieldLayoutRegionH(Region region) {
        if (region == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return region.h;
    }

    public boolean getFieldLayoutRegionLocalUser(Region region) {
        if (region == null) {
            return false;
        }
        return region.localUser;
    }

    public int getFieldLayoutRegionRenderMode(Region region) {
        if (region == null) {
            return 0;
        }
        return region.renderMode.getValue();
    }

    public String getFieldLayoutRegionRoomId(Region region) {
        String str;
        if (region == null || (str = region.roomId) == null) {
            return "";
        }
        return str;
    }

    public boolean getFieldLayoutRegionScreenStream(Region region) {
        if (region == null) {
            return false;
        }
        return region.screenStream;
    }

    public float getFieldLayoutRegionSpatialPositionX(Region region) {
        if (region == null) {
            return 0.0f;
        }
        return region.spatialPosition.x;
    }

    public float getFieldLayoutRegionSpatialPositionY(Region region) {
        if (region == null) {
            return 0.0f;
        }
        return region.spatialPosition.y;
    }

    public float getFieldLayoutRegionSpatialPositionZ(Region region) {
        if (region == null) {
            return 0.0f;
        }
        return region.spatialPosition.z;
    }

    public int getFieldLayoutRegionType(Region region) {
        if (region == null) {
            return 0;
        }
        return region.type.getValue();
    }

    public String getFieldLayoutRegionUid(Region region) {
        String str;
        if (region == null || (str = region.uid) == null) {
            return "";
        }
        return str;
    }

    public double getFieldLayoutRegionW(Region region) {
        if (region == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return region.w;
    }

    public double getFieldLayoutRegionX(Region region) {
        if (region == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return region.x;
    }

    public double getFieldLayoutRegionY(Region region) {
        if (region == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return region.y;
    }

    public int getFieldLayoutRegionZorder(Region region) {
        if (region == null) {
            return 0;
        }
        return region.zorder;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setAdvancedConfig(JSONObject jSONObject) {
        this.advancedConfig = jSONObject;
    }

    public void setAudio(AudioConfig audioConfig) {
        this.audio = audioConfig;
    }

    public void setAuthInfo(JSONObject jSONObject) {
        this.authInfo = jSONObject;
    }

    public void setClientMixParam(ClientMixParam clientMixParam) {
        this.clientMixParam = clientMixParam;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public void setMixType(ByteRTCStreamMixingType byteRTCStreamMixingType) {
        this.mixType = byteRTCStreamMixingType;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setSpatialConfig(SpatialConfig spatialConfig) {
        this.spatialConfig = spatialConfig;
    }

    public void setSyncControlParam(SyncControlParam syncControlParam) {
        this.syncControlParam = syncControlParam;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVideo(VideoConfig videoConfig) {
        this.video = videoConfig;
    }
}
