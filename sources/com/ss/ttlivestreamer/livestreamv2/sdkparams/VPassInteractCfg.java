package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.livecore.base.tinyjson.annotations.Serialized;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class VPassInteractCfg {

    @Serialized("convert_texture_with_share_gl_thread")
    public boolean convert_texture_with_share_gl_thread;

    @Serialized("disableSpatialAudioWhenPlayBGM")
    public boolean disableSpatialAudioWhenPlayBGM;

    @Serialized("enableCombineRtcSei")
    public boolean enableCombineRtcSei;

    @Serialized("enableGuestAudioPipelineOpt")
    public boolean enableGuestAudioPipelineOpt;

    @Serialized("enable_push_stream_switch_after_server_mix_stream")
    public boolean enablePushStreamSwitchAfterServerMixStream;

    @Serialized("enable_render_fixed_size")
    public boolean enable_render_fixed_size;

    @Serialized("enable_report_livecore_info")
    public boolean enable_report_livecore_info;

    @Serialized("interactClientMixUseingOriginalFrame")
    public int interactClientMixUseingOriginalFrame;

    @Serialized("interactDelayStopRtc")
    public int interactDelayStopRtc;

    @Serialized("interactDelayStopStream")
    public int interactDelayStopStream;

    @Serialized("interactDelayStopStreamTime")
    public int interactDelayStopStreamTime;

    @Serialized("InteractDeleteTextureWhenResize")
    public boolean interactDeleteTextureWhenResize;

    @Serialized("interactJoinMicOptCdn")
    public JSONArray interactJoinMicOptCdn;

    @Serialized("interactUseVideoRangeDefault")
    public boolean interactUseVideoRangeDefault;

    @Serialized("interactUseVideoRangeDefaultDrawer")
    public boolean interactUseVideoRangeDefaultDrawer;

    @Serialized("interactUsingRtcClientMix")
    public boolean interactUsingRtcClientMix;

    @Serialized("mixOnClient")
    public JSONObject mixOnClient;

    @Serialized("optimizeSwDecodeProcess")
    public boolean optimizeSwDecodeProcess;

    @Serialized("rtcDeliverType")
    public int rtcDeliverType;

    @Serialized("RtcOnLoggerMessageLevel")
    public int rtconLoggerMessageLevel;

    @Serialized("spatialAudioAngle")
    public int spatialAudioAngle;

    @Serialized("using_share_gl_thread")
    public boolean using_share_gl_thread;

    @Serialized("using_surface_deliver")
    public boolean using_surface_deliver;

    @Serialized("fixRemoteYuvProjection")
    public boolean isFixRemoteYuvProjection = true;

    @Serialized("InteractVideoSinkUseGlFinish")
    public boolean interactVideoSinkUseGlFinish = true;

    @Serialized("videoRangeModeInRtc")
    public boolean videoRangeModeInRtc = true;

    @Serialized("enable_interact_remote_statics")
    public boolean enable_interact_remote_statics = true;

    @Serialized("EnableSendContourInfoToRtc")
    public boolean enableSendContourInfoToRtc = true;

    @Serialized("enable_adjust_resolution_in_pk")
    public boolean enable_adjust_resolution_in_pk = true;

    @Serialized("clearSinkDelay")
    public boolean clearSinkDelay = true;

    @Serialized("transcoding_data_send_interval")
    public int transcoding_data_send_interval = 5;

    @Serialized("interactServerMixUsingBFrame")
    public int interactServerMixUsingBFrame = 1;

    @Serialized("interactMixSyncClientAudioLengthMs")
    public int interactMixSyncClientAudioLengthMs = 10;

    @Serialized("interactMixSyncQueueLengthMs")
    public int interactMixSyncQueueLengthMs = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @Serialized("spatialAudioAudiencePos")
    public int spatialAudioAudiencePos = 100;
}
