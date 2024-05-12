package com.ss.avframework.livestreamv2.core.interact.utils;

import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class MixerUtils {
    public static boolean isConfigMixOnClient(LiveCore liveCore) {
        JSONObject jSONObject = liveCore.getBuilder().getInteract().mixOnClient;
        if (jSONObject == null || !jSONObject.optBoolean("enable", false)) {
            return false;
        }
        return true;
    }

    public static Config.VideoProfile getVideoProfile(int i, int i2) {
        if (i == 2) {
            return Config.VideoProfile.MAIN;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return Config.VideoProfile.BASELINE;
            }
            return Config.VideoProfile.HIGH;
        }
        return Config.VideoProfile.MAIN;
    }

    public static void syncLiveConfigToMixStream(LiveCore liveCore, InteractConfig interactConfig) {
        Config.VideoCodec videoCodec;
        Config.AudioProfile audioProfile;
        LiveCore.Builder builder = liveCore.getBuilder();
        Config.MixStreamConfig mixStreamConfig = interactConfig.getMixStreamConfig();
        if (builder != null && mixStreamConfig != null) {
            mixStreamConfig.setVideoSize(builder.getVideoWidth(), builder.getVideoHeight());
            mixStreamConfig.setVideoFrameRate(builder.getVideoFps());
            mixStreamConfig.setVideoBitrate(builder.getVideoBitrate() / 1000);
            if (builder.getVideoEncoder() == 2) {
                videoCodec = Config.VideoCodec.BYTEVC1;
            } else {
                videoCodec = Config.VideoCodec.H264;
            }
            mixStreamConfig.setVideoCodec(videoCodec);
            mixStreamConfig.setVideoProfile(getVideoProfile(builder.getVideoEncoder(), builder.getVideoProfile()));
            mixStreamConfig.setVideoGop(builder.getVideoGopSec());
            mixStreamConfig.setAudioSampleRate(builder.getAudioSampleHZ());
            mixStreamConfig.setAudioChannels(builder.getAudioChannel());
            if (builder.getAudioProfile() == 2) {
                audioProfile = Config.AudioProfile.HE;
            } else {
                audioProfile = Config.AudioProfile.LC;
            }
            mixStreamConfig.setAudioProfile(audioProfile);
            mixStreamConfig.setAudioBitrate(builder.getAudioBitrate() / 1000);
        }
    }
}
