package com.ss.bytertc.engine.live;

import X.V0N;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.utils.LogUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class MixedStreamConfig {
    public JSONObject advancedConfig;
    public MixedStreamAudioConfig audioConfig;
    public JSONObject authInfo;
    public MixedStreamClientMixConfig clientMixConfig;
    public ByteRTCStreamMixingType expectedMixingType = ByteRTCStreamMixingType.STREAM_MIXING_BY_SERVER;
    public MixedStreamLayoutConfig layout;
    public String pushURL;
    public String roomID;
    public MixedStreamServerControlConfig serverControlConfig;
    public MixedStreamSpatialConfig spatialConfig;
    public MixedStreamSyncControlConfig syncControlConfig;
    public String userID;
    public MixedStreamVideoConfig videoConfig;

    /* loaded from: classes33.dex */
    public static class MixedStreamLayoutConfig {
        public MixedStreamLayoutRegionConfig[] regions;
        public String userConfigExtraInfo = "";
        public String backgroundColor = "#000000";

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Object jSONObject2 = new JSONObject();
            try {
                MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = this.regions;
                if (mixedStreamLayoutRegionConfigArr != null) {
                    for (MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : mixedStreamLayoutRegionConfigArr) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("userID", mixedStreamLayoutRegionConfig.userID);
                        jSONObject3.put("roomID", mixedStreamLayoutRegionConfig.roomID);
                        jSONObject3.put("locationX", mixedStreamLayoutRegionConfig.locationX);
                        jSONObject3.put("locationY", mixedStreamLayoutRegionConfig.locationY);
                        jSONObject3.put("widthProportion", mixedStreamLayoutRegionConfig.widthProportion);
                        jSONObject3.put("heightProportion", mixedStreamLayoutRegionConfig.heightProportion);
                        jSONObject3.put("zOrder", mixedStreamLayoutRegionConfig.zOrder);
                        jSONObject3.put("alpha", mixedStreamLayoutRegionConfig.alpha);
                        jSONObject3.put("cornerRadius", mixedStreamLayoutRegionConfig.cornerRadius);
                        jSONObject3.put("regionContentType", mixedStreamLayoutRegionConfig.regionContentType);
                        jSONObject3.put("renderMode", mixedStreamLayoutRegionConfig.renderMode);
                        jSONObject3.put("streamType", mixedStreamLayoutRegionConfig.streamType);
                        jSONObject3.put("applySpatialAudio", mixedStreamLayoutRegionConfig.applySpatialAudio);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put("canvas", jSONObject2);
                jSONObject.put("regions", jSONArray);
                jSONObject.put("userConfigExtraInfo", this.userConfigExtraInfo);
                return jSONObject.toString();
            } catch (JSONException e) {
                LogUtil.w("MixedStreamConfig", "create layout json message happen exception", e);
                return null;
            }
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public MixedStreamLayoutRegionConfig[] getRegions() {
            return this.regions;
        }

        public String getUserConfigExtraInfo() {
            return this.userConfigExtraInfo;
        }

        public MixedStreamLayoutConfig setBackgroundColor(String str) {
            this.backgroundColor = str;
            return this;
        }

        public MixedStreamLayoutConfig setRegions(MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr) {
            this.regions = mixedStreamLayoutRegionConfigArr;
            return this;
        }

        public MixedStreamLayoutConfig setUserConfigExtraInfo(String str) {
            this.userConfigExtraInfo = str;
            return this;
        }
    }

    public static MixedStreamConfig defaultMixedStreamConfig() {
        MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamVideoConfig();
        mixedStreamVideoConfig.videoCodec = MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        mixedStreamVideoConfig.fps = 15;
        mixedStreamVideoConfig.gop = 2;
        mixedStreamVideoConfig.enableBframe = false;
        mixedStreamVideoConfig.height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        mixedStreamVideoConfig.width = 360;
        mixedStreamVideoConfig.bitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamAudioConfig();
        mixedStreamAudioConfig.audioCodec = MixedStreamAudioConfig.MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        mixedStreamAudioConfig.channels = 2;
        mixedStreamAudioConfig.bitrate = 64;
        mixedStreamAudioConfig.sampleRate = 48000;
        mixedStreamAudioConfig.audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        MixedStreamServerControlConfig mixedStreamServerControlConfig = new MixedStreamServerControlConfig();
        mixedStreamServerControlConfig.enableVolumeIndication = false;
        mixedStreamServerControlConfig.seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
        mixedStreamServerControlConfig.isAddVolumeValue = false;
        mixedStreamServerControlConfig.talkVolume = 0;
        mixedStreamServerControlConfig.volumeIndicationInterval = 2.0f;
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = new MixedStreamSyncControlConfig();
        mixedStreamSyncControlConfig.baseUserID = "";
        mixedStreamSyncControlConfig.enableSync = false;
        mixedStreamSyncControlConfig.maxCacheTimeMs = 0;
        mixedStreamSyncControlConfig.videoNeedSdkMix = true;
        MixedStreamClientMixConfig mixedStreamClientMixConfig = new MixedStreamClientMixConfig();
        mixedStreamClientMixConfig.useAudioMixer = true;
        mixedStreamClientMixConfig.videoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;
        MixedStreamSpatialConfig mixedStreamSpatialConfig = new MixedStreamSpatialConfig();
        mixedStreamSpatialConfig.enableSpatialRender = false;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamLayoutConfig();
        mixedStreamLayoutConfig.backgroundColor = "#000000";
        mixedStreamLayoutConfig.userConfigExtraInfo = "";
        MixedStreamConfig mixedStreamConfig = new MixedStreamConfig();
        mixedStreamConfig.audioConfig = mixedStreamAudioConfig;
        mixedStreamConfig.videoConfig = mixedStreamVideoConfig;
        mixedStreamConfig.serverControlConfig = mixedStreamServerControlConfig;
        mixedStreamConfig.syncControlConfig = mixedStreamSyncControlConfig;
        mixedStreamConfig.clientMixConfig = mixedStreamClientMixConfig;
        mixedStreamConfig.spatialConfig = mixedStreamSpatialConfig;
        mixedStreamConfig.layout = mixedStreamLayoutConfig;
        mixedStreamConfig.pushURL = null;
        return mixedStreamConfig;
    }

    public String getMixedStreamAdvancedConfig() {
        JSONObject jSONObject = this.advancedConfig;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public String getMixedStreamAudioConfigAudioProfile() {
        MixedStreamAudioProfile mixedStreamAudioProfile;
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null || (mixedStreamAudioProfile = mixedStreamAudioConfig.audioProfile) == null) {
            return "";
        }
        return mixedStreamAudioProfile.getValue();
    }

    public int getMixedStreamAudioConfigChannels() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.channels;
    }

    public String getMixedStreamAudioConfigCodec() {
        MixedStreamAudioConfig.MixedStreamAudioCodecType mixedStreamAudioCodecType;
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null || (mixedStreamAudioCodecType = mixedStreamAudioConfig.audioCodec) == null) {
            return "";
        }
        return mixedStreamAudioCodecType.getValue();
    }

    public int getMixedStreamAudioConfigSampleRate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.sampleRate;
    }

    public String getMixedStreamAuthInfo() {
        JSONObject jSONObject = this.authInfo;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public boolean getMixedStreamClientMixConfigUseAudioMixer() {
        MixedStreamClientMixConfig mixedStreamClientMixConfig = this.clientMixConfig;
        if (mixedStreamClientMixConfig == null) {
            return true;
        }
        return mixedStreamClientMixConfig.useAudioMixer;
    }

    public int getMixedStreamClientMixConfigVideoFormat() {
        MixedStreamClientMixVideoFormat mixedStreamClientMixVideoFormat;
        MixedStreamClientMixConfig mixedStreamClientMixConfig = this.clientMixConfig;
        if (mixedStreamClientMixConfig == null) {
            mixedStreamClientMixVideoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;
        } else {
            mixedStreamClientMixVideoFormat = mixedStreamClientMixConfig.videoFormat;
        }
        return mixedStreamClientMixVideoFormat.getValue();
    }

    public String getMixedStreamLayoutBackgroundColor() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        if (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.backgroundColor) == null) {
            return "";
        }
        return str;
    }

    public MixedStreamLayoutRegionConfig[] getMixedStreamLayoutRegionConfigs() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        if (mixedStreamLayoutConfig == null) {
            return null;
        }
        return mixedStreamLayoutConfig.regions;
    }

    public String getMixedStreamLayoutUserConfigExtraInfo() {
        String str;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        if (mixedStreamLayoutConfig == null || (str = mixedStreamLayoutConfig.userConfigExtraInfo) == null) {
            return "";
        }
        return str;
    }

    public int getMixedStreamMixType() {
        return this.expectedMixingType.value();
    }

    public String getMixedStreamRoomID() {
        String str = this.roomID;
        if (str == null) {
            return "";
        }
        return str;
    }

    public boolean getMixedStreamServerControlConfigEnableVolumeIndication() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return false;
        }
        return mixedStreamServerControlConfig.enableVolumeIndication;
    }

    public boolean getMixedStreamServerControlConfigIsAddVolumeValue() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return false;
        }
        return mixedStreamServerControlConfig.isAddVolumeValue;
    }

    public int getMixedStreamServerControlConfigSeiContentMode() {
        MixedStreamSEIContentMode mixedStreamSEIContentMode;
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            mixedStreamSEIContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
        } else {
            mixedStreamSEIContentMode = mixedStreamServerControlConfig.seiContentMode;
        }
        return mixedStreamSEIContentMode.getValue();
    }

    public int getMixedStreamServerControlConfigTalkVolume() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 0;
        }
        return mixedStreamServerControlConfig.talkVolume;
    }

    public float getMixedStreamServerControlConfigVolumeIndicationInterval() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 2.0f;
        }
        return mixedStreamServerControlConfig.volumeIndicationInterval;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.z;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.z;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.z;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialPositionX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.x;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialPositionY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.y;
    }

    public float getMixedStreamSpatialConfigAudienceSpatialPositionZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.z;
    }

    public boolean getMixedStreamSpatialConfigEnableSpatialRender() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return false;
        }
        return mixedStreamSpatialConfig.enableSpatialRender;
    }

    public String getMixedStreamSyncControlConfigBaseUser() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return "";
        }
        return mixedStreamSyncControlConfig.baseUserID;
    }

    public boolean getMixedStreamSyncControlConfigEnableSync() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return false;
        }
        return mixedStreamSyncControlConfig.enableSync;
    }

    public int getMixedStreamSyncControlConfigQueueLength() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return 0;
        }
        return mixedStreamSyncControlConfig.maxCacheTimeMs;
    }

    public boolean getMixedStreamSyncControlConfigVideoNeedMix() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return false;
        }
        return mixedStreamSyncControlConfig.videoNeedSdkMix;
    }

    public String getMixedStreamUrl() {
        String str = this.pushURL;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getMixedStreamUserID() {
        String str = this.userID;
        if (str == null) {
            return "";
        }
        return str;
    }

    public boolean getMixedStreamVideoConfigBFrame() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return false;
        }
        return mixedStreamVideoConfig.enableBframe;
    }

    public int getMixedStreamVideoConfigBitrate() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.bitrate;
    }

    public String getMixedStreamVideoConfigCodec() {
        MixedStreamVideoConfig.MixedStreamVideoCodecType mixedStreamVideoCodecType;
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null || (mixedStreamVideoCodecType = mixedStreamVideoConfig.videoCodec) == null) {
            return "";
        }
        return mixedStreamVideoCodecType.getValue();
    }

    public int getMixedStreamVideoConfigFps() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.fps;
    }

    public int getMixedStreamVideoConfigGop() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.gop;
    }

    public int getMixedStreamVideoConfigHeight() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.height;
    }

    public int getMixedStreamVideoConfigWidth() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.width;
    }

    public int getMixedStreamaudioConfigBitrate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.bitrate;
    }

    public JSONObject getTranscodeMessage() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = new JSONObject();
        try {
            jSONObject.put("videoCodec", this.videoConfig.videoCodec);
            jSONObject.put("fps", this.videoConfig.fps);
            jSONObject.put("gop", this.videoConfig.gop);
            jSONObject.put("bitrate", this.videoConfig.bitrate);
            jSONObject.put("width", this.videoConfig.width);
            jSONObject.put("height", this.videoConfig.height);
            jSONObject.put("enableBframe", this.videoConfig.enableBframe);
            jSONObject2.put("audioCodec", this.audioConfig.audioCodec);
            jSONObject2.put("bitrate", this.audioConfig.bitrate);
            jSONObject2.put("sampleRate", this.audioConfig.sampleRate);
            jSONObject2.put("channels", this.audioConfig.channels);
            jSONObject2.put("audioProfile", this.audioConfig.audioProfile);
            jSONObject3.put("enableVolumeIndication", this.serverControlConfig.enableVolumeIndication);
            jSONObject3.put("talkVolume", this.serverControlConfig.talkVolume);
            jSONObject3.put("isAddVolumeValue", this.serverControlConfig.isAddVolumeValue);
            jSONObject3.put("volumeIndicationInterval", this.serverControlConfig.volumeIndicationInterval);
            jSONObject3.put("seiContentMode", this.serverControlConfig.seiContentMode);
            jSONObject4.put("useAudioMixer", this.clientMixConfig.useAudioMixer);
            jSONObject4.put("videoFormat", this.clientMixConfig.videoFormat.getValue());
            jSONObject5.put("enableSync", this.syncControlConfig.enableSync);
            jSONObject5.put("maxCacheTimeMs", this.syncControlConfig.maxCacheTimeMs);
            jSONObject5.put("videoNeedSdkMix", this.syncControlConfig.videoNeedSdkMix);
            jSONObject5.put("baseuserID", this.syncControlConfig.baseUserID);
            jSONObject7.put("backgroundColor", this.layout.backgroundColor);
            MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = this.layout.regions;
            if (mixedStreamLayoutRegionConfigArr != null) {
                for (MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : mixedStreamLayoutRegionConfigArr) {
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put("userID", mixedStreamLayoutRegionConfig.userID);
                    jSONObject11.put("roomID", mixedStreamLayoutRegionConfig.roomID);
                    jSONObject11.put("locationX", mixedStreamLayoutRegionConfig.locationX);
                    jSONObject11.put("locationY", mixedStreamLayoutRegionConfig.locationY);
                    jSONObject11.put("widthProportion", mixedStreamLayoutRegionConfig.widthProportion);
                    jSONObject11.put("heightProportion", mixedStreamLayoutRegionConfig.heightProportion);
                    jSONObject11.put("zOrder", mixedStreamLayoutRegionConfig.zOrder);
                    jSONObject11.put("alpha", mixedStreamLayoutRegionConfig.alpha);
                    jSONObject11.put("cornerRadius", mixedStreamLayoutRegionConfig.cornerRadius);
                    jSONObject11.put("mediaType", mixedStreamLayoutRegionConfig.mediaType);
                    jSONObject11.put("renderMode", mixedStreamLayoutRegionConfig.renderMode);
                    jSONObject11.put("isLocalUser", mixedStreamLayoutRegionConfig.isLocalUser);
                    jSONObject11.put("streamType", mixedStreamLayoutRegionConfig.streamType);
                    jSONObject11.put("applySpatialAudio", mixedStreamLayoutRegionConfig.applySpatialAudio);
                    jSONArray.put(jSONObject11);
                }
            }
            jSONObject6.put("canvas", jSONObject7);
            jSONObject6.put("regions", jSONArray);
            jSONObject6.put("userConfigExtraInfo", this.layout.userConfigExtraInfo);
            jSONObject8.put("pushURL", this.pushURL);
            jSONObject9.put("transcode", jSONObject8);
            jSONObject9.put("video", jSONObject);
            jSONObject9.put("audio", jSONObject2);
            jSONObject9.put("serverControl", jSONObject3);
            jSONObject9.put("clientMix", jSONObject4);
            jSONObject9.put("syncControl", jSONObject5);
            jSONObject9.put("layout", jSONObject6);
            jSONObject9.put("advancedConfig", this.advancedConfig);
            Object obj = this.authInfo;
            if (obj != null) {
                jSONObject9.put("authInfo", obj);
            }
            jSONObject10.put("expectedMixingType", this.expectedMixingType);
            jSONObject10.put("type", "transcode");
            jSONObject10.put("roomID", this.roomID);
            jSONObject10.put("userID", this.userID);
            jSONObject10.put("transcodeMeta", jSONObject9);
            return jSONObject10;
        } catch (JSONException e) {
            LogUtil.w("MixedStreamConfig", "get json message happen exception", e);
            return null;
        }
    }

    /* loaded from: classes33.dex */
    public static class MixedStreamAudioConfig {
        public MixedStreamAudioCodecType audioCodec = MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        public int bitrate = 64;
        public int sampleRate = 48000;
        public int channels = 2;
        public MixedStreamAudioProfile audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;

        /* loaded from: classes33.dex */
        public enum MixedStreamAudioCodecType {
            MIXED_STREAM_AUDIO_CODEC_TYPE_AAC("AAC");

            public String audioCodecType;

            public String getValue() {
                return this.audioCodecType;
            }

            public static MixedStreamAudioCodecType valueOf(String str) {
                return (MixedStreamAudioCodecType) V0N.LJJJ(MixedStreamAudioCodecType.class, str);
            }

            MixedStreamAudioCodecType(String str) {
                this.audioCodecType = str;
            }
        }

        public MixedStreamAudioCodecType getAudioCodec() {
            return this.audioCodec;
        }

        public MixedStreamAudioProfile getAudioProfile() {
            return this.audioProfile;
        }

        public int getBitrate() {
            return this.bitrate;
        }

        public int getChannels() {
            return this.channels;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public MixedStreamAudioConfig setAudioCodec(MixedStreamAudioCodecType mixedStreamAudioCodecType) {
            this.audioCodec = mixedStreamAudioCodecType;
            return this;
        }

        public MixedStreamAudioConfig setAudioProfile(MixedStreamAudioProfile mixedStreamAudioProfile) {
            this.audioProfile = mixedStreamAudioProfile;
            return this;
        }

        public MixedStreamAudioConfig setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public MixedStreamAudioConfig setChannels(int i) {
            this.channels = i;
            return this;
        }

        public MixedStreamAudioConfig setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public static class MixedStreamLayoutRegionConfig {
        public double cornerRadius;
        public byte[] imageWaterMark;
        public boolean isLocalUser;
        public double locationX;
        public double locationY;
        public int zOrder;
        public String userID = "";
        public String roomID = "";
        public double widthProportion = 1.0d;
        public double heightProportion = 1.0d;
        public double alpha = 1.0d;
        public MixedStreamMediaType mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
        public MixedStreamRenderMode renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
        public MixedStreamVideoType streamType = MixedStreamVideoType.MIXED_STREAM_VIDEO_TYPE_MAIN;
        public MixedStreamLayoutRegionType regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
        public MixedStreamLayoutRegionImageWaterMarkConfig imageWaterMarkConfig = new MixedStreamLayoutRegionImageWaterMarkConfig(0, 0);
        public Position spatialPosition = new Position();
        public boolean applySpatialAudio = true;

        /* loaded from: classes33.dex */
        public static class MixedStreamLayoutRegionImageWaterMarkConfig {
            public int imageHeight;
            public int imageWidth;

            public int getImageHeight() {
                return this.imageHeight;
            }

            public int getImageWidth() {
                return this.imageWidth;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig setImageHeight(int i) {
                this.imageHeight = i;
                return this;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig setImageWidth(int i) {
                this.imageWidth = i;
                return this;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }
        }

        /* loaded from: classes33.dex */
        public enum MixedStreamVideoType {
            MIXED_STREAM_VIDEO_TYPE_MAIN(0),
            MIXED_STREAM_VIDEO_TYPE_SCREEN(1);

            public int videoType;

            public int getValue() {
                return this.videoType;
            }

            public static MixedStreamVideoType valueOf(String str) {
                return (MixedStreamVideoType) V0N.LJJJ(MixedStreamVideoType.class, str);
            }

            MixedStreamVideoType(int i) {
                this.videoType = i;
            }
        }

        public double getAlpha() {
            return this.alpha;
        }

        public boolean getApplySpatialAudio() {
            return this.applySpatialAudio;
        }

        public double getCornerRadius() {
            return this.cornerRadius;
        }

        public double getHeightProportion() {
            return this.heightProportion;
        }

        public byte[] getImageWaterMark() {
            return this.imageWaterMark;
        }

        public MixedStreamLayoutRegionImageWaterMarkConfig getImageWaterMarkConfig() {
            return this.imageWaterMarkConfig;
        }

        public boolean getIsLocalUser() {
            return this.isLocalUser;
        }

        public double getLocationX() {
            return this.locationX;
        }

        public double getLocationY() {
            return this.locationY;
        }

        public MixedStreamMediaType getMediaType() {
            return this.mediaType;
        }

        public MixedStreamLayoutRegionType getRegionContentType() {
            return this.regionContentType;
        }

        public MixedStreamRenderMode getRenderMode() {
            return this.renderMode;
        }

        public String getRoomID() {
            return this.roomID;
        }

        public Position getSpatialPosition() {
            return this.spatialPosition;
        }

        public MixedStreamVideoType getStreamType() {
            return this.streamType;
        }

        public String getUserID() {
            return this.userID;
        }

        public double getWidthProportion() {
            return this.widthProportion;
        }

        public int getZOrder() {
            return this.zOrder;
        }

        public MixedStreamLayoutRegionConfig setAlpha(double d) {
            this.alpha = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setApplySpatialAudio(boolean z) {
            this.applySpatialAudio = z;
            return this;
        }

        public MixedStreamLayoutRegionConfig setCornerRadius(double d) {
            this.cornerRadius = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setHeightProportion(double d) {
            this.heightProportion = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setImageWaterMark(byte[] bArr) {
            this.imageWaterMark = bArr;
            return this;
        }

        public MixedStreamLayoutRegionConfig setImageWaterMarkConfig(MixedStreamLayoutRegionImageWaterMarkConfig mixedStreamLayoutRegionImageWaterMarkConfig) {
            this.imageWaterMarkConfig = mixedStreamLayoutRegionImageWaterMarkConfig;
            return this;
        }

        public MixedStreamLayoutRegionConfig setIsLocalUser(boolean z) {
            this.isLocalUser = z;
            return this;
        }

        public MixedStreamLayoutRegionConfig setLocationX(double d) {
            this.locationX = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setLocationY(double d) {
            this.locationY = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setMediaType(MixedStreamMediaType mixedStreamMediaType) {
            this.mediaType = mixedStreamMediaType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRegionContentType(MixedStreamLayoutRegionType mixedStreamLayoutRegionType) {
            this.regionContentType = mixedStreamLayoutRegionType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRenderMode(MixedStreamRenderMode mixedStreamRenderMode) {
            this.renderMode = mixedStreamRenderMode;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRoomID(String str) {
            this.roomID = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setSpatialPosition(Position position) {
            this.spatialPosition = position;
            return this;
        }

        public MixedStreamLayoutRegionConfig setStreamType(MixedStreamVideoType mixedStreamVideoType) {
            this.streamType = mixedStreamVideoType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setUserID(String str) {
            this.userID = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setWidthProportion(double d) {
            this.widthProportion = d;
            return this;
        }

        public MixedStreamLayoutRegionConfig setZOrder(int i) {
            this.zOrder = i;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public static class MixedStreamVideoConfig {
        public boolean enableBframe;
        public MixedStreamVideoCodecType videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        public int fps = 15;
        public int gop = 2;
        public int bitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        public int width = 360;
        public int height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;

        /* loaded from: classes33.dex */
        public enum MixedStreamVideoCodecType {
            MIXED_STREAM_VIDEO_CODEC_TYPE_H264("H264"),
            MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1("ByteVC1");

            public String videoCodecType;

            public String getValue() {
                return this.videoCodecType;
            }

            public static MixedStreamVideoCodecType valueOf(String str) {
                return (MixedStreamVideoCodecType) V0N.LJJJ(MixedStreamVideoCodecType.class, str);
            }

            MixedStreamVideoCodecType(String str) {
                this.videoCodecType = str;
            }
        }

        public int getBitrate() {
            return this.bitrate;
        }

        public boolean getEnableBframe() {
            return this.enableBframe;
        }

        public int getFps() {
            return this.fps;
        }

        public int getGop() {
            return this.gop;
        }

        public int getHeight() {
            return this.height;
        }

        public MixedStreamVideoCodecType getVideoCodec() {
            return this.videoCodec;
        }

        public int getWidth() {
            return this.width;
        }

        public MixedStreamVideoConfig setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public MixedStreamVideoConfig setEnableBframe(boolean z) {
            this.enableBframe = z;
            return this;
        }

        public MixedStreamVideoConfig setFps(int i) {
            this.fps = i;
            return this;
        }

        public MixedStreamVideoConfig setGop(int i) {
            this.gop = i;
            return this;
        }

        public MixedStreamVideoConfig setHeight(int i) {
            this.height = i;
            return this;
        }

        public MixedStreamVideoConfig setVideoCodec(MixedStreamVideoCodecType mixedStreamVideoCodecType) {
            this.videoCodec = mixedStreamVideoCodecType;
            return this;
        }

        public MixedStreamVideoConfig setWidth(int i) {
            this.width = i;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public enum MixedStreamAudioProfile {
        MIXED_STREAM_AUDIO_PROFILE_LC("LC"),
        MIXED_STREAM_AUDIO_PROFILE_HEV1("HEv1"),
        MIXED_STREAM_AUDIO_PROFILE_HEV2("HEv2");

        public String aacProfile;

        public String getValue() {
            return this.aacProfile;
        }

        public static MixedStreamAudioProfile valueOf(String str) {
            return (MixedStreamAudioProfile) V0N.LJJJ(MixedStreamAudioProfile.class, str);
        }

        MixedStreamAudioProfile(String str) {
            this.aacProfile = str;
        }
    }

    /* loaded from: classes33.dex */
    public static class MixedStreamClientMixConfig {
        public boolean useAudioMixer = true;
        public MixedStreamClientMixVideoFormat videoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;

        public boolean getUseAudioMixer() {
            return this.useAudioMixer;
        }

        public MixedStreamClientMixVideoFormat getVideoFormat() {
            return this.videoFormat;
        }

        public MixedStreamClientMixConfig setUseAudioMixer(boolean z) {
            this.useAudioMixer = z;
            return this;
        }

        public MixedStreamClientMixConfig setVideoFormat(MixedStreamClientMixVideoFormat mixedStreamClientMixVideoFormat) {
            this.videoFormat = mixedStreamClientMixVideoFormat;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public enum MixedStreamClientMixVideoFormat {
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420(0),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_TEXTURE_2D(1),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_CVPIXEL_BUFFER_BGRA(2),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_NV12(3);

        public int videoFormat;

        public int getValue() {
            return this.videoFormat;
        }

        public static MixedStreamClientMixVideoFormat valueOf(String str) {
            return (MixedStreamClientMixVideoFormat) V0N.LJJJ(MixedStreamClientMixVideoFormat.class, str);
        }

        MixedStreamClientMixVideoFormat(int i) {
            this.videoFormat = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum MixedStreamLayoutRegionType {
        MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM(0),
        MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE(1);

        public int regionType;

        public int getValue() {
            return this.regionType;
        }

        public static MixedStreamLayoutRegionType valueOf(String str) {
            return (MixedStreamLayoutRegionType) V0N.LJJJ(MixedStreamLayoutRegionType.class, str);
        }

        MixedStreamLayoutRegionType(int i) {
            this.regionType = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum MixedStreamMediaType {
        MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO(0),
        MIXED_STREAM_MEDIA_TYPE_AUDIO_ONLY(1),
        MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY(2);

        public int contentControlType;

        public int getValue() {
            return this.contentControlType;
        }

        public static MixedStreamMediaType valueOf(String str) {
            return (MixedStreamMediaType) V0N.LJJJ(MixedStreamMediaType.class, str);
        }

        MixedStreamMediaType(int i) {
            this.contentControlType = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum MixedStreamRenderMode {
        MIXED_STREAM_RENDER_MODE_HIDDEN(1),
        MIXED_STREAM_RENDER_MODE_FIT(2),
        MIXED_STREAM_RENDER_MODE_ADAPTIVE(3);

        public int renderMode;

        public int getValue() {
            return this.renderMode;
        }

        public static MixedStreamRenderMode valueOf(String str) {
            return (MixedStreamRenderMode) V0N.LJJJ(MixedStreamRenderMode.class, str);
        }

        MixedStreamRenderMode(int i) {
            this.renderMode = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum MixedStreamSEIContentMode {
        MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT(0),
        MIXED_STREAM_SEI_CONTENT_MODE_ENABLE_VOLUME_INDICATION(1);

        public int seiContentMode;

        public int getValue() {
            return this.seiContentMode;
        }

        public static MixedStreamSEIContentMode valueOf(String str) {
            return (MixedStreamSEIContentMode) V0N.LJJJ(MixedStreamSEIContentMode.class, str);
        }

        MixedStreamSEIContentMode(int i) {
            this.seiContentMode = i;
        }
    }

    /* loaded from: classes33.dex */
    public static class MixedStreamServerControlConfig {
        public boolean enableVolumeIndication;
        public boolean isAddVolumeValue;
        public int talkVolume;
        public float volumeIndicationInterval = 2.0f;
        public MixedStreamSEIContentMode seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;

        public boolean getEnableVolumeIndication() {
            return this.enableVolumeIndication;
        }

        public boolean getIsAddVolumeValue() {
            return this.isAddVolumeValue;
        }

        public MixedStreamSEIContentMode getSeiContentMode() {
            return this.seiContentMode;
        }

        public int getTalkVolume() {
            return this.talkVolume;
        }

        public float getVolumeIndicationInterval() {
            return this.volumeIndicationInterval;
        }

        public MixedStreamServerControlConfig setEnableVolumeIndication(boolean z) {
            this.enableVolumeIndication = z;
            return this;
        }

        public MixedStreamServerControlConfig setIsAddVolumeValue(boolean z) {
            this.isAddVolumeValue = z;
            return this;
        }

        public MixedStreamServerControlConfig setSeiContentMode(MixedStreamSEIContentMode mixedStreamSEIContentMode) {
            this.seiContentMode = mixedStreamSEIContentMode;
            return this;
        }

        public MixedStreamServerControlConfig setTalkVolume(int i) {
            this.talkVolume = i;
            return this;
        }

        public MixedStreamServerControlConfig setVolumeIndicationInterval(float f) {
            this.volumeIndicationInterval = f;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public static class MixedStreamSpatialConfig {
        public boolean enableSpatialRender;
        public Position audienceSpatialPosition = new Position();
        public HumanOrientation audienceSpatialOrientation = new HumanOrientation();

        public HumanOrientation getAudienceSpatialOrientation() {
            return this.audienceSpatialOrientation;
        }

        public Position getAudienceSpatialPosition() {
            return this.audienceSpatialPosition;
        }

        public boolean getEnableSpatialRender() {
            return this.enableSpatialRender;
        }

        public MixedStreamSpatialConfig setAudienceSpatialOrientation(HumanOrientation humanOrientation) {
            this.audienceSpatialOrientation = humanOrientation;
            return this;
        }

        public MixedStreamSpatialConfig setAudienceSpatialPosition(Position position) {
            this.audienceSpatialPosition = position;
            return this;
        }

        public MixedStreamSpatialConfig setEnableSpatialRender(boolean z) {
            this.enableSpatialRender = z;
            return this;
        }

        public MixedStreamSpatialConfig setAudienceSpatialPosition(float f, float f2, float f3) {
            Position position = this.audienceSpatialPosition;
            position.x = f;
            position.y = f2;
            position.z = f3;
            return this;
        }
    }

    /* loaded from: classes33.dex */
    public static class MixedStreamSyncControlConfig {
        public boolean enableSync;
        public int maxCacheTimeMs;
        public boolean videoNeedSdkMix = true;
        public String baseUserID = "";

        public String getBaseUserID() {
            return this.baseUserID;
        }

        public boolean getEnableSync() {
            return this.enableSync;
        }

        public int getMaxCacheTimeMs() {
            return this.maxCacheTimeMs;
        }

        public boolean getVideoNeedSdkMix() {
            return this.videoNeedSdkMix;
        }

        public MixedStreamSyncControlConfig setBaseUserID(String str) {
            this.baseUserID = str;
            return this;
        }

        public MixedStreamSyncControlConfig setEnableSync(boolean z) {
            this.enableSync = z;
            return this;
        }

        public MixedStreamSyncControlConfig setMaxCacheTimeMs(int i) {
            this.maxCacheTimeMs = i;
            return this;
        }

        public MixedStreamSyncControlConfig setVideoNeedSdkMix(boolean z) {
            this.videoNeedSdkMix = z;
            return this;
        }
    }

    public JSONObject getAdvancedConfig() {
        return this.advancedConfig;
    }

    public MixedStreamAudioConfig getAudioConfig() {
        return this.audioConfig;
    }

    public JSONObject getAuthInfo() {
        return this.authInfo;
    }

    public MixedStreamClientMixConfig getClientMixConfig() {
        return this.clientMixConfig;
    }

    public ByteRTCStreamMixingType getExpectedMixingType() {
        return this.expectedMixingType;
    }

    public MixedStreamLayoutConfig getLayout() {
        return this.layout;
    }

    public String getPushURL() {
        return this.pushURL;
    }

    public String getRoomID() {
        return this.roomID;
    }

    public MixedStreamServerControlConfig getServerControlConfig() {
        return this.serverControlConfig;
    }

    public MixedStreamSpatialConfig getSpatialConfig() {
        return this.spatialConfig;
    }

    public MixedStreamSyncControlConfig getSyncControlConfig() {
        return this.syncControlConfig;
    }

    public String getUserID() {
        return this.userID;
    }

    public MixedStreamVideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    public double getMixedStreamLayoutRegionAlpha(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return mixedStreamLayoutRegionConfig.alpha;
    }

    public boolean getMixedStreamLayoutRegionApplySpatialAudio(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return true;
        }
        return mixedStreamLayoutRegionConfig.applySpatialAudio;
    }

    public int getMixedStreamLayoutRegionContentType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.regionContentType.getValue();
    }

    public double getMixedStreamLayoutRegionCornerRadius(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return mixedStreamLayoutRegionConfig.cornerRadius;
    }

    public byte[] getMixedStreamLayoutRegionData(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return null;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMark;
    }

    public int getMixedStreamLayoutRegionDataParamImageHeight(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageHeight;
    }

    public int getMixedStreamLayoutRegionDataParamImageWidth(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageWidth;
    }

    public double getMixedStreamLayoutRegionH(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return mixedStreamLayoutRegionConfig.heightProportion;
    }

    public boolean getMixedStreamLayoutRegionLocalUser(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return false;
        }
        return mixedStreamLayoutRegionConfig.isLocalUser;
    }

    public int getMixedStreamLayoutRegionMediaType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.mediaType.getValue();
    }

    public int getMixedStreamLayoutRegionRenderMode(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.renderMode.getValue();
    }

    public String getMixedStreamLayoutRegionRoomID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        String str;
        if (mixedStreamLayoutRegionConfig == null || (str = mixedStreamLayoutRegionConfig.roomID) == null) {
            return "";
        }
        return str;
    }

    public int getMixedStreamLayoutRegionScreenStream(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.streamType.getValue();
    }

    public float getMixedStreamLayoutRegionSpatialPositionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.x;
    }

    public float getMixedStreamLayoutRegionSpatialPositionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.y;
    }

    public float getMixedStreamLayoutRegionSpatialPositionZ(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.z;
    }

    public String getMixedStreamLayoutRegionUserID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        String str;
        if (mixedStreamLayoutRegionConfig == null || (str = mixedStreamLayoutRegionConfig.userID) == null) {
            return "";
        }
        return str;
    }

    public double getMixedStreamLayoutRegionW(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return mixedStreamLayoutRegionConfig.widthProportion;
    }

    public double getMixedStreamLayoutRegionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return mixedStreamLayoutRegionConfig.locationX;
    }

    public double getMixedStreamLayoutRegionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return mixedStreamLayoutRegionConfig.locationY;
    }

    public int getMixedStreamLayoutRegionZOrder(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.zOrder;
    }

    public MixedStreamConfig setAdvancedConfig(JSONObject jSONObject) {
        this.advancedConfig = jSONObject;
        return this;
    }

    public MixedStreamConfig setAudioConfig(MixedStreamAudioConfig mixedStreamAudioConfig) {
        this.audioConfig = mixedStreamAudioConfig;
        return this;
    }

    public MixedStreamConfig setAuthInfo(JSONObject jSONObject) {
        this.authInfo = jSONObject;
        return this;
    }

    public MixedStreamConfig setClientMixConfig(MixedStreamClientMixConfig mixedStreamClientMixConfig) {
        this.clientMixConfig = mixedStreamClientMixConfig;
        return this;
    }

    public MixedStreamConfig setExpectedMixingType(ByteRTCStreamMixingType byteRTCStreamMixingType) {
        this.expectedMixingType = byteRTCStreamMixingType;
        return this;
    }

    public MixedStreamConfig setLayout(MixedStreamLayoutConfig mixedStreamLayoutConfig) {
        this.layout = mixedStreamLayoutConfig;
        return this;
    }

    public MixedStreamConfig setPushURL(String str) {
        this.pushURL = str;
        return this;
    }

    public MixedStreamConfig setRoomID(String str) {
        this.roomID = str;
        return this;
    }

    public MixedStreamConfig setServerControlConfig(MixedStreamServerControlConfig mixedStreamServerControlConfig) {
        this.serverControlConfig = mixedStreamServerControlConfig;
        return this;
    }

    public MixedStreamConfig setSpatialConfig(MixedStreamSpatialConfig mixedStreamSpatialConfig) {
        this.spatialConfig = mixedStreamSpatialConfig;
        return this;
    }

    public MixedStreamConfig setSyncControlConfig(MixedStreamSyncControlConfig mixedStreamSyncControlConfig) {
        this.syncControlConfig = mixedStreamSyncControlConfig;
        return this;
    }

    public MixedStreamConfig setUserID(String str) {
        this.userID = str;
        return this;
    }

    public MixedStreamConfig setVideoConfig(MixedStreamVideoConfig mixedStreamVideoConfig) {
        this.videoConfig = mixedStreamVideoConfig;
        return this;
    }
}
