package com.ss.avframework.livestreamv2.core.interact.livertc;

import X.C25620zW;
import X.X1D;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import defpackage.i0;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveRTCInfoMode {
    public String mAppId;
    public VideoEncoderConfig mClientMixVideoPreset;
    public RTCHandlerProxy mHandlerProxy;
    public LiveRTCExtInfo mLiveRtcExtInfo;
    public int mLiveVideoMode;
    public VideoEncoderConfig mLiveVideoPreset;
    public int mMaxTransCodingCbIntervalSecond;
    public int mMixStreamType;
    public VideoEncoderConfig mProfileVideoPreset;
    public String mRtcExtInfo;
    public VideoEncoderConfig mServerMixVideoParam;
    public VideoEncoderConfig mServerMixVideoPreset;
    public ScheduledExecutorService mWorkExecutor;

    /* loaded from: classes12.dex */
    public static class LiveVideoPreset {
        public static final VideoEncoderConfig DEFAULT_LIVE_VIDEO_PRESET = new VideoEncoderConfig(368, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 15, 800, 0);
        public static final VideoEncoderConfig HD_LIVE_VIDEO_PRESET = new VideoEncoderConfig(368, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 15, 800, 0);
        public static final VideoEncoderConfig SD_LIVE_VIDEO_PRESET = new VideoEncoderConfig(272, 480, 15, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 0);
    }

    public void destroy() {
        this.mAppId = null;
        if (!this.mWorkExecutor.isShutdown()) {
            this.mWorkExecutor.shutdown();
        }
    }

    public String getAppId() {
        String str = this.mAppId;
        if (str != null) {
            return str;
        }
        return null;
    }

    public String getBusinessId() {
        return this.mLiveRtcExtInfo.businessId;
    }

    public VideoEncoderConfig getRtcVideoResolution() {
        if (this.mLiveVideoMode != 0) {
            return this.mLiveVideoPreset;
        }
        return this.mLiveVideoPreset;
    }

    public VideoEncoderConfig getClientMixVideoPreset() {
        return this.mClientMixVideoPreset;
    }

    public int getLiveMode() {
        return this.mLiveVideoMode;
    }

    public VideoEncoderConfig getLiveVideoPreset() {
        return this.mLiveVideoPreset;
    }

    public LiveRTCExtInfo getRtcExtInfo() {
        return this.mLiveRtcExtInfo;
    }

    public VideoEncoderConfig getRtcProfileVideoResolution() {
        return this.mProfileVideoPreset;
    }

    public VideoEncoderConfig getServerMixVideoParam() {
        return this.mServerMixVideoParam;
    }

    public VideoEncoderConfig getServerMixVideoPreset() {
        return this.mServerMixVideoPreset;
    }

    /* loaded from: classes12.dex */
    public class LiveMixStreamMode {
        public LiveMixStreamMode() {
        }
    }

    /* loaded from: classes12.dex */
    public class LiveRtcVideoMode {
        public LiveRtcVideoMode() {
        }
    }

    private void parseLiveRtcOther(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("max_transcoding_cb_interval_second")) {
            this.mMaxTransCodingCbIntervalSecond = jSONObject.optInt("max_transcoding_cb_interval_second");
        }
    }

    private void parseRtcMixParam(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            this.mLiveRtcExtInfo.mixMaxBitrateKbps = jSONObject.optInt("video_bitrate_kbps");
            this.mLiveRtcExtInfo.mixStreamTaskId = jSONObject.optString("task_id");
            if (jSONObject.has("mix_video_param_server") && (optJSONObject = jSONObject.optJSONObject("mix_video_param_server")) != null) {
                this.mServerMixVideoParam = parseVideoPreset(optJSONObject);
            }
        }
    }

    private void parseRtcPerformanceProfile(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("rtc_performance_low")) != null) {
            this.mProfileVideoPreset = parseVideoPreset(optJSONObject);
        }
    }

    private VideoEncoderConfig parseVideoPreset(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new VideoEncoderConfig(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("fps"), jSONObject.optInt("bitrate_kbps"), 0);
        }
        return null;
    }

    public void parseLiveRtcVideoParam(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("rtc_video_param_mode");
            this.mLiveVideoMode = optInt;
            if (optInt != 0) {
                if (optInt != 1) {
                    if (optInt != 3) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("sLiveVideoMode type error, sLiveVideoMode:");
                        LIZ.append(this.mLiveVideoMode);
                        LogUtil.e("LiveRtcEngine", X1D.LIZIZ(LIZ));
                        RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
                        if (rTCHandlerProxy != null) {
                            rTCHandlerProxy.getHandler();
                        }
                        this.mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
                    } else {
                        JSONObject optJSONObject = jSONObject.optJSONObject("rtc_video_param_1v1_client");
                        if (optJSONObject != null) {
                            this.mClientMixVideoPreset = parseVideoPreset(optJSONObject);
                        }
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("rtc_video_param_1v1_server");
                        if (optJSONObject2 != null) {
                            this.mServerMixVideoPreset = parseVideoPreset(optJSONObject2);
                        }
                        if (this.mMixStreamType == 1) {
                            this.mLiveVideoPreset = this.mClientMixVideoPreset;
                        } else {
                            this.mLiveVideoPreset = this.mServerMixVideoPreset;
                        }
                    }
                } else {
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("rtc_video_param_server_define");
                    if (optJSONObject3 != null) {
                        this.mLiveVideoPreset = parseVideoPreset(optJSONObject3);
                    }
                }
            } else {
                this.mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
            }
            parseRtcMixParam(jSONObject.optJSONObject("rtc_mix_param"));
            parseRtcPerformanceProfile(jSONObject.optJSONObject("rtc_performance_profiles"));
        }
    }

    public int parseRTCExtInfo(String str) {
        final IRTCVideoEventHandler handler;
        this.mRtcExtInfo = str;
        LogUtil.i("LiveRtcEngine", i0.LJFF("rtcExtInfo:", str));
        if (str == null || "".equals(str)) {
            RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
            if (rTCHandlerProxy != null && (handler = rTCHandlerProxy.getHandler()) != null) {
                this.mWorkExecutor.execute(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCInfoMode.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$1__run$___twin___() {
                        handler.onError(8303);
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
            if (optJSONObject != null) {
                String str2 = this.mAppId;
                if (str2 == null) {
                    this.mAppId = optJSONObject.optString("rtc_app_id");
                } else if (!str2.equals(optJSONObject.optString("rtc_app_id"))) {
                    this.mWorkExecutor.execute(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCInfoMode.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$2__run$___twin___() {
                            IRTCVideoEventHandler handler2;
                            RTCHandlerProxy rTCHandlerProxy2 = LiveRTCInfoMode.this.mHandlerProxy;
                            if (rTCHandlerProxy2 != null && (handler2 = rTCHandlerProxy2.getHandler()) != null) {
                                handler2.onError(8004);
                            }
                        }

                        public static void com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                            boolean LIZ;
                            try {
                                anonymousClass2.com_ss_avframework_livestreamv2_core_interact_livertc_LiveRTCInfoMode$2__run$___twin___();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                }
                this.mLiveRtcExtInfo.token = optJSONObject.optString("rtc_token");
                this.mLiveRtcExtInfo.vendor = optJSONObject.optInt("rtc_vendor");
                this.mLiveRtcExtInfo.appSignature = Base64.decode(optJSONObject.optString("rtc_app_sign"), 0);
                this.mLiveRtcExtInfo.channelId = optJSONObject.optString("rtc_channel_id");
                this.mLiveRtcExtInfo.interactId = optJSONObject.optString("rtc_user_id");
                this.mLiveRtcExtInfo.interactIdMode = optJSONObject.optInt("rtc_user_id_mode");
                LiveRTCExtInfo liveRTCExtInfo = this.mLiveRtcExtInfo;
                liveRTCExtInfo.vendorName = "byte";
                liveRTCExtInfo.userId = optJSONObject.optString("user_id");
            }
            parseLiveRtcVideoParam(jSONObject.optJSONObject("live_rtc_video_param"));
            parseLiveRtcOther(jSONObject.optJSONObject("rtc_other"));
            this.mLiveRtcExtInfo.businessId = jSONObject.optString("rtc_business_id");
            StringBuilder LIZIZ = C25620zW.LIZIZ("rtcExtInfo:", str, " sAppID:");
            LIZIZ.append(this.mAppId);
            LIZIZ.append(" sToken:");
            LIZIZ.append(this.mLiveRtcExtInfo.token);
            LIZIZ.append(" rtc_vendor");
            LIZIZ.append(this.mLiveRtcExtInfo.vendor);
            LIZIZ.append(" rtc_app_sign:");
            LIZIZ.append(this.mLiveRtcExtInfo.appSignature);
            LIZIZ.append(" mChannelId:");
            LIZIZ.append(this.mLiveRtcExtInfo.channelId);
            LIZIZ.append(" mUserId");
            LIZIZ.append(this.mLiveRtcExtInfo.interactId);
            LIZIZ.append(" mEnableInteractIdIntMode");
            LIZIZ.append(this.mLiveRtcExtInfo.interactIdMode);
            LIZIZ.append(" mTraceId");
            LIZIZ.append(this.mLiveRtcExtInfo.userId);
            LogUtil.i("LiveRtcEngine", X1D.LIZIZ(LIZIZ));
            return 0;
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseRTCExtInfo happen exception");
            LIZ.append(e.getStackTrace().toString());
            LogUtil.w("LiveRtcEngine", X1D.LIZIZ(LIZ));
            return -1;
        }
    }

    public void setLiveVideoPreset(VideoEncoderConfig videoEncoderConfig) {
        this.mLiveVideoPreset = videoEncoderConfig;
    }

    public void setMixStreamType(int i) {
        this.mMixStreamType = i;
    }

    public LiveRTCInfoMode(RTCHandlerProxy rTCHandlerProxy, ScheduledExecutorService scheduledExecutorService) {
        VideoEncoderConfig videoEncoderConfig = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mLiveVideoPreset = videoEncoderConfig;
        this.mClientMixVideoPreset = videoEncoderConfig;
        this.mServerMixVideoPreset = videoEncoderConfig;
        this.mServerMixVideoParam = videoEncoderConfig;
        this.mMaxTransCodingCbIntervalSecond = 5;
        this.mLiveRtcExtInfo = new LiveRTCExtInfo();
        this.mHandlerProxy = rTCHandlerProxy;
        this.mWorkExecutor = scheduledExecutorService;
    }
}
