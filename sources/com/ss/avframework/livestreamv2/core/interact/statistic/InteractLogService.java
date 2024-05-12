package com.ss.avframework.livestreamv2.core.interact.statistic;

import X.C16880lQ;
import X.X1D;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCExtInfo;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.ss.avframework.livestreamv2.core.interact.utils.InteractThreadUtils;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class InteractLogService {
    public Config mConfig;
    public long mFirstRemoteUserJoinedTs;
    public LogCallback mLogCallback;
    public LiveRTCExtInfo mRtcExtInfo;
    public long mStartJoiningTs;
    public long mStartReconnectTs;
    public boolean mbStreamPublished;
    public String mByteRtcVersion = "";
    public String mThirdPartySdkVersion = "";
    public boolean mFirstJoin = true;
    public boolean isFirstLocalExternalVideoFrame = true;
    public boolean isFirstLocalExternalAudioFrame = true;
    public final AtomicLong sLogId = new AtomicLong(0);
    public long mRtcJoinChannelTimeCost = 0;
    public long mRtcSubscribeVideoTimeCost = 0;
    public long mRtcSubscribeAudioTimeCost = 0;
    public long mRtcVideoFirstFrameTimeCost = 0;
    public long mRtcAudioFirstFrameTimeCost = 0;
    public int mPushedAudioFramesNormal = 0;
    public int mPushedVideoFramesNormal = 0;
    public int mPushedAudioFramesAbNormal = 0;
    public int mPushedVideoFramesAbNormal = 0;
    public ConcurrentHashMap<String, Boolean> mUserFirstAudioFrameChecker = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Boolean> mUserFirstVideoFrameChecker = new ConcurrentHashMap<>();

    /* loaded from: classes12.dex */
    public interface LogCallback {
        void onLogReport(String str, JSONObject jSONObject);
    }

    public void onFirstLocalExternalAudioFrame() {
        if (this.mStartJoiningTs <= 0 || !this.isFirstLocalExternalAudioFrame) {
            return;
        }
        this.isFirstLocalExternalAudioFrame = false;
        final long currentTimeMillis = System.currentTimeMillis();
        final long currentTimeMillis2 = System.currentTimeMillis() - this.mStartJoiningTs;
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$5__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_first_local_audio", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("elapsed", currentTimeMillis2);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onFirstLocalExternalVideoFrame() {
        if (this.mStartJoiningTs <= 0 || !this.isFirstLocalExternalVideoFrame) {
            return;
        }
        this.isFirstLocalExternalVideoFrame = false;
        final long currentTimeMillis = System.currentTimeMillis();
        final long currentTimeMillis2 = System.currentTimeMillis() - this.mStartJoiningTs;
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$4__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_first_local_video", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("elapsed", currentTimeMillis2);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onJoinChannelSuccess() {
        final long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mRtcJoinChannelTimeCost = j;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$3__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_join_channel_success", currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        JSONObject put = createCommonLog.put("elapsed", j);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("");
                        LIZ.append(InteractLogService.this.mRtcExtInfo.userId);
                        put.put("account", X1D.LIZIZ(LIZ)).put("first_joined", InteractLogService.this.mFirstJoin);
                        InteractLogService.this.reportLog(createCommonLog);
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        this.mFirstJoin = false;
    }

    public void onLeaveChannelReturn() {
        final long j;
        this.isFirstLocalExternalAudioFrame = true;
        this.isFirstLocalExternalVideoFrame = true;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mStartJoiningTs = 0L;
        } else {
            j = 0;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.10
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$10__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_leave_channel_callback", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("elapsed", j);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onReconnected() {
        final long j = 0;
        if (this.mStartReconnectTs != 0) {
            j = System.currentTimeMillis() - this.mStartReconnectTs;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.15
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$15__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_reconnected", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("elapsed", j);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                boolean LIZ;
                try {
                    anonymousClass15.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$15__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService$38, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass38 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioProfile;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Character;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Type;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$VideoCodec;

        static {
            int[] iArr = new int[Config.VideoCodec.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$VideoCodec = iArr;
            try {
                iArr[Config.VideoCodec.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$VideoCodec[Config.VideoCodec.BYTEVC1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Config.AudioProfile.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioProfile = iArr2;
            try {
                iArr2[Config.AudioProfile.LC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioProfile[Config.AudioProfile.HE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[Config.Type.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Type = iArr3;
            try {
                iArr3[Config.Type.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Type[Config.Type.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[Config.Character.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Character = iArr4;
            try {
                iArr4[Config.Character.ANCHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Character[Config.Character.GUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public JSONObject getStaticsMessage() {
        int i = this.mPushedAudioFramesAbNormal;
        int i2 = this.mPushedAudioFramesNormal;
        int i3 = this.mPushedVideoFramesAbNormal;
        int i4 = this.mPushedVideoFramesNormal;
        this.mPushedAudioFramesAbNormal = 0;
        this.mPushedAudioFramesNormal = 0;
        this.mPushedVideoFramesAbNormal = 0;
        this.mPushedVideoFramesNormal = 0;
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(i4);
            LIZ.append(",");
            LIZ.append(i3);
            LIZ.append(",");
            LIZ.append(i2);
            LIZ.append(",");
            LIZ.append(i);
            jSONObject.put("statics", X1D.LIZIZ(LIZ));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void onCallJoinChannel() {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$2__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("call_join_channel", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                InteractLogService.this.reportLog(createCommonLog);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onConnectionLost() {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.11
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$11__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_connect_lost", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                InteractLogService.this.reportLog(createCommonLog);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onReconnecting() {
        this.mStartReconnectTs = System.currentTimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.14
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$14__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_reconnect", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                InteractLogService.this.reportLog(createCommonLog);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static String byteBufferToString(ByteBuffer byteBuffer) {
        try {
            CharBuffer decode = Charset.forName("UTF-8").newDecoder().decode(byteBuffer);
            byteBuffer.flip();
            return decode.toString();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    private String getCharacterName(Config.Character character) {
        int i = AnonymousClass38.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Character[character.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "unknown";
            }
            return "guest";
        }
        return "host";
    }

    private String parseInteractTypeString(Config.Type type) {
        int i = AnonymousClass38.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Type[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "unknown";
            }
            return "audio";
        }
        return "video";
    }

    public String genMixAudioReportJson(Config.MixStreamConfig mixStreamConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("audio_sample_rate", mixStreamConfig.getAudioSampleRateValue());
            jSONObject.put("audio_channel", mixStreamConfig.getAudioChannels());
            jSONObject.put("audio_profile", mixStreamConfig.getAudioProfile().toString());
            jSONObject.put("audio_bitrate", mixStreamConfig.getAudioBitrate());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String genMixVideoReportJson(Config.MixStreamConfig mixStreamConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", mixStreamConfig.getVideoWidth());
            jSONObject.put("height", mixStreamConfig.getVideoHeight());
            jSONObject.put("fps", mixStreamConfig.getVideoFrameRate());
            jSONObject.put("codec", mixStreamConfig.getVideoCodec());
            jSONObject.put("video_profile", mixStreamConfig.getVideoProfile().toString().toLowerCase());
            jSONObject.put("video_bitrate", mixStreamConfig.getVideoBitrate());
            jSONObject.put("gop", mixStreamConfig.getVideoGop());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAudioProfile(Config.AudioProfile audioProfile) {
        int i = AnonymousClass38.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioProfile[audioProfile.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "HE";
        }
        return "LC";
    }

    public String getRemoteStaticsInfo(Map<String, RemoteUserStatistics.RemoteUserInfo> map) {
        String str = "";
        if (map == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str2 : map.keySet()) {
                RemoteUserStatistics.RemoteUserInfo remoteUserInfo = map.get(str2);
                if (remoteUserInfo != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("user_id", str2).put("recv_video_bitrate", remoteUserInfo.videoBitrate).put("recv_vdecode_fps", remoteUserInfo.videoDecodeFps).put("recv_vrender_fps", remoteUserInfo.videoRenderFps).put("recv_video_loss", remoteUserInfo.videoLossRate).put("recv_audio_bitrate", remoteUserInfo.audioBitrate).put("recv_audio_delay", remoteUserInfo.audioDelay).put("recv_audio_loss", remoteUserInfo.audioLossRate).put("recv_audio_volume", remoteUserInfo.audioVoiceVolume);
                    if (this.mConfig.isHeartbeatExtEnable()) {
                        jSONObject.put("recv_video_width", remoteUserInfo.videoWidth).put("recv_video_height", remoteUserInfo.videoHeight);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            str = jSONArray.toString();
            return str;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public String getVideoCodec(Config.VideoCodec videoCodec) {
        int i = AnonymousClass38.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$VideoCodec[videoCodec.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "bytevc1";
        }
        return "h264";
    }

    public String getVideoQuality(Config.VideoQuality videoQuality) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(videoQuality.getOrigWidth());
        LIZ.append("x");
        LIZ.append(videoQuality.getOrigHeight());
        LIZ.append("x");
        LIZ.append(videoQuality.getFps());
        LIZ.append("x");
        LIZ.append(videoQuality.getBitrate());
        return X1D.LIZIZ(LIZ);
    }

    public void onFirstPublicStreamAudioFrame(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.37
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$37__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_callback", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("callback_name", "onFirstPublicStreamAudioFrame").put("publicStreamId", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass37 anonymousClass37) {
                boolean LIZ;
                try {
                    anonymousClass37.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$37__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onFirstRemoteVideoRender(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.18
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$18__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_first_remote_video_render", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("remote_rtc_user_id", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                boolean LIZ;
                try {
                    anonymousClass18.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$18__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onHandlePhoneCall(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.34
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$34__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_handle_phone_call", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("message", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass34 anonymousClass34) {
                boolean LIZ;
                try {
                    anonymousClass34.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$34__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onInteractConnectionTimeCount(final long[] jArr) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.25
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$25__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("interact_connection_time", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("from_live_broadcast_to_interact", jArr[0]).put("from_interact_to_live_broadcast", jArr[1]);
                    createCommonLog.put("message", jSONObject.toString());
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass25 anonymousClass25) {
                boolean LIZ;
                try {
                    anonymousClass25.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$25__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onNetworkChanged(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.17
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$17__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_network_changed", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("access", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                boolean LIZ;
                try {
                    anonymousClass17.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$17__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onPublishStream(final int i) {
        if (this.mbStreamPublished) {
            return;
        }
        this.mbStreamPublished = true;
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.19
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$19__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_publish_stream", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("error_code", i);
                    if (InteractLogService.this.mConfig.getMixStreamConfig() != null) {
                        Config.MixStreamConfig mixStreamConfig = InteractLogService.this.mConfig.getMixStreamConfig();
                        createCommonLog.put("url", mixStreamConfig.getStreamUrl()).put("audio_profile", InteractLogService.this.getAudioProfile(mixStreamConfig.getAudioProfile())).put("meta_video_bitrate", mixStreamConfig.getVideoBitrate()).put("meta_video_framerate", mixStreamConfig.getVideoFrameRate()).put("width", mixStreamConfig.getVideoWidth()).put("height", mixStreamConfig.getVideoHeight()).put("video_codec", InteractLogService.this.getVideoCodec(mixStreamConfig.getVideoCodec())).put("live_stream_session_id", mixStreamConfig.getStreamUniqueId());
                    }
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
                boolean LIZ;
                try {
                    anonymousClass19.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$19__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onRtcUpdateLayout(final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.26
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$26__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_update_layout", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("message", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass26 anonymousClass26) {
                boolean LIZ;
                try {
                    anonymousClass26.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$26__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void reportLog(JSONObject jSONObject) {
        AVLog.debugTrace(jSONObject);
        LogCallback logCallback = this.mLogCallback;
        if (logCallback != null) {
            try {
                if (LogUtil.logFilterSwitch() && !"rtc_push_stream".equals(JSONObjectProtectorUtils.getString(jSONObject, "event_key"))) {
                    AVLog.ioi("live_client_monitor_log", jSONObject.toString());
                }
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
            logCallback.onLogReport("live_client_monitor_log", jSONObject);
        }
    }

    private void onReportRtcStat(final String str, final long j) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$8__run$___twin___() {
                String str2;
                JSONObject createCommonLog = InteractLogService.this.createCommonLog(str, currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    if (j > 0) {
                        str2 = "success";
                    } else {
                        str2 = "failed";
                    }
                    createCommonLog.put("result", str2);
                    createCommonLog.put("stat_elapsed", j);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.iow("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void addVideoFramesReport(final boolean z, final boolean z2) {
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.35
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$35__run$___twin___() {
                if (z) {
                    if (z2) {
                        InteractLogService.this.mPushedAudioFramesNormal++;
                        return;
                    } else {
                        InteractLogService.this.mPushedAudioFramesAbNormal++;
                        return;
                    }
                }
                if (z2) {
                    InteractLogService.this.mPushedVideoFramesNormal++;
                } else {
                    InteractLogService.this.mPushedVideoFramesAbNormal++;
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass35 anonymousClass35) {
                boolean LIZ;
                try {
                    anonymousClass35.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$35__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public JSONObject createCommonLog(String str, long j) {
        String str2;
        try {
            JSONObject put = new JSONObject().put("version", BuildConfig.VERSION_NAME).put("event_key", str).put("mode", "rtc").put("timestamp", j).put("project_key", this.mConfig.getProjectKey()).put("report_version", 5).put("product_line", "live").put("sdkParams", this.mConfig.getRtcExtInfo()).put("rtc_channel_id", this.mRtcExtInfo.channelId).put("rtc_user_id", this.mRtcExtInfo.interactId).put("rtc_type", this.mConfig.getInteractMode().toString()).put("rtc_interact_type", parseInteractTypeString(this.mConfig.getType())).put("rtc_vendor", this.mRtcExtInfo.vendorName).put("rtc_role", getCharacterName(this.mConfig.getCharacter())).put("rtc_version", this.mThirdPartySdkVersion).put("rtc_sdk_version", this.mByteRtcVersion).put("live_sdk_version", "15.0.1_1").put("rtc_app_channel", this.mConfig.getAppChannel()).put("rtc_report_id", this.sLogId.incrementAndGet()).put("mix_type", this.mConfig.getMixStreamType().toString());
            if (this.mConfig.getMixStreamConfig() != null) {
                str2 = this.mConfig.getMixStreamConfig().getStreamName();
            } else {
                str2 = "";
            }
            return put.put("stream_name", str2);
        } catch (JSONException e) {
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            return null;
        }
    }

    public void onConnectFailed(final int i, final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.16
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$16__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_connect_fail", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("error_code", i).put("message", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                boolean LIZ;
                try {
                    anonymousClass16.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$16__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onEngineAPICall(final String str, final String str2) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.27
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$27__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_api_call", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("engine_api_name", str).put("api_parameter_info", str2);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass27 anonymousClass27) {
                boolean LIZ;
                try {
                    anonymousClass27.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$27__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onErrorOccurs(final int i, final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.12
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$12__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_occur_error", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("error_code", i);
                    createCommonLog.put("message", str);
                    createCommonLog.put("rtc_token", InteractLogService.this.mRtcExtInfo.token);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                boolean LIZ;
                try {
                    anonymousClass12.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$12__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onExtVideoFrameChanged(final int i, final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.21
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$21__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("ext_video_frame_changed", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("error_code", i).put("message", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
                boolean LIZ;
                try {
                    anonymousClass21.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$21__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onFirstPublicStreamVideoFrameDecoded(final String str, final VideoFrameInfo videoFrameInfo) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.36
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$36__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_callback", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("callback_name", "onFirstPublicStreamVideoFrameDecoded").put("publicStreamId", str).put("videoInfo", videoFrameInfo.toString());
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass36 anonymousClass36) {
                boolean LIZ;
                try {
                    anonymousClass36.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$36__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onFirstRemoteFrame(final boolean z, final String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.mStartJoiningTs;
        final long j2 = 0;
        if (j != 0) {
            j2 = currentTimeMillis - j;
        }
        if (z) {
            this.mRtcSubscribeAudioTimeCost = currentTimeMillis - this.mFirstRemoteUserJoinedTs;
            this.mRtcAudioFirstFrameTimeCost = currentTimeMillis - j;
        } else {
            this.mRtcSubscribeVideoTimeCost = currentTimeMillis - this.mFirstRemoteUserJoinedTs;
            this.mRtcVideoFirstFrameTimeCost = currentTimeMillis - j;
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$6__run$___twin___() {
                String str2;
                ConcurrentHashMap<String, Boolean> concurrentHashMap;
                InteractLogService interactLogService = InteractLogService.this;
                if (z) {
                    str2 = "rtc_first_remote_audio";
                } else {
                    str2 = "rtc_first_remote_video";
                }
                JSONObject createCommonLog = interactLogService.createCommonLog(str2, currentTimeMillis2);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    if (z) {
                        concurrentHashMap = InteractLogService.this.mUserFirstAudioFrameChecker;
                    } else {
                        concurrentHashMap = InteractLogService.this.mUserFirstVideoFrameChecker;
                    }
                    Boolean bool = Boolean.TRUE;
                    if (concurrentHashMap.containsKey(str)) {
                        bool = concurrentHashMap.get(str);
                    }
                    createCommonLog.put("remote_rtc_user_id", str).put("elapsed", j2).put("first_joined", bool);
                    concurrentHashMap.put(str, Boolean.FALSE);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onRemoteUserOnlineOffline(final boolean z, final String str) {
        final long j;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        } else {
            j = 0;
        }
        if (z) {
            this.mFirstRemoteUserJoinedTs = System.currentTimeMillis();
            this.mRtcSubscribeVideoTimeCost = 0L;
            this.mRtcSubscribeAudioTimeCost = 0L;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.7
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$7__run$___twin___() {
                String str2;
                InteractLogService interactLogService = InteractLogService.this;
                if (z) {
                    str2 = "rtc_remote_user_joined";
                } else {
                    str2 = "rtc_remote_user_offline";
                }
                JSONObject createCommonLog = interactLogService.createCommonLog(str2, currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("remote_rtc_user_id", str).put("elapsed", j);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        if (z) {
            if (!this.mUserFirstVideoFrameChecker.containsKey(str)) {
                this.mUserFirstVideoFrameChecker.put(str, Boolean.TRUE);
            }
            if (!this.mUserFirstAudioFrameChecker.containsKey(str)) {
                this.mUserFirstAudioFrameChecker.put(str, Boolean.TRUE);
            }
        }
    }

    public void onRemoteVideoFrozen(final String str, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.22
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$22__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_remote_video_frozen", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("remote_rtc_user_id", str).put("elapsed", i);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
                boolean LIZ;
                try {
                    anonymousClass22.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$22__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onWarningOccurs(final int i, final String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.13
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$13__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_occur_warning", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("error_code", i);
                    createCommonLog.put("message", str);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void putLiveCoreInfoToMessage(JSONObject jSONObject, LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo) {
        Config.MixStreamType mixStreamType;
        Config config = this.mConfig;
        if (config != null && localUserStatisticInfo != null && config.isEnableReportLiveCoreInfo() && (mixStreamType = config.getMixStreamType()) != null) {
            if (mixStreamType == Config.MixStreamType.SERVER_MIX || mixStreamType == Config.MixStreamType.NONE) {
                try {
                    jSONObject.put("video_frame_elapse_v2", localUserStatisticInfo.mVideoFrameElapse).put("averageExposureTime", localUserStatisticInfo.mCamExposureTime).put("averageCameraFps", localUserStatisticInfo.mCamAvgFps).put("cameraISOInfo", localUserStatisticInfo.mCamISOInfo).put("filter_nobuffer_cnt", localUserStatisticInfo.mFilterNoBufferCnt);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public void setRtcSdkVersions(String str, String str2) {
        this.mByteRtcVersion = str;
        this.mThirdPartySdkVersion = str2;
    }

    public InteractLogService(LiveRTCExtInfo liveRTCExtInfo, Config config, LogCallback logCallback) {
        this.mRtcExtInfo = liveRTCExtInfo;
        this.mConfig = config;
        this.mLogCallback = logCallback;
    }

    public void onEngineCallBack(final String str, final String str2, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.29
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$29__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_callback", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("engine_callback_name", str).put("callback_parameter_info", str2).put("callback_error_code", i);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass29 anonymousClass29) {
                boolean LIZ;
                try {
                    anonymousClass29.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$29__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onInteractStatus(final LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo, final Map<String, RemoteUserStatistics.RemoteUserInfo> map, final ProcInfoStatistics.ProcInfo procInfo) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.24
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$24__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_push_stream", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo2 = localUserStatisticInfo;
                    if (localUserStatisticInfo2 != null) {
                        createCommonLog.put("send_audio_bitrate", localUserStatisticInfo2.mSendAudioBitrate).put("receive_audio_bitrate", localUserStatisticInfo.mReceiveAudioBitrate).put("send_video_bitrate", localUserStatisticInfo.mSendVideoBitrate).put("receive_video_bitrate", localUserStatisticInfo.mReceiveVideoBitrate).put("user_count", localUserStatisticInfo.mUserCount).put("real_video_framerate", localUserStatisticInfo.mSendVideoFrameRate).put("send_vencode_fps", localUserStatisticInfo.mSendVideoEncoderOutputFrameRate).put("send_encode_fps", localUserStatisticInfo.mSendVideoEncoderOutputFrameRate).put("rtc_tx_quality", localUserStatisticInfo.mNetWorkQuality).put("preview_fps", localUserStatisticInfo.mVideoSourceFrameRate).put("asource_fps", localUserStatisticInfo.mAudioSourceFrameRate).put("width", localUserStatisticInfo.mEncodeWidth).put("height", localUserStatisticInfo.mEncodeHeight).put("rms", localUserStatisticInfo.mRMS).put("in_cap_fps", (int) localUserStatisticInfo.mInCapFps).put("out_cap_fps", (int) localUserStatisticInfo.mOutCapFps).put("preview_fps", (int) localUserStatisticInfo.mPreviewFps);
                        if (InteractLogService.this.mConfig.isHeartbeatExtEnable()) {
                            createCommonLog.put("adpt_res_w", localUserStatisticInfo.mAdaptResWidth).put("adpt_res_h", localUserStatisticInfo.mAdaptResHeight);
                        }
                        LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo3 = localUserStatisticInfo;
                        int i = localUserStatisticInfo3.mCurrentCaptureDevice;
                        if (i == 1 || i == 2) {
                            createCommonLog.put("camera_type", localUserStatisticInfo3.mCamType);
                            createCommonLog.put("camera_capture_width", localUserStatisticInfo.mCamCaptureWidth);
                            createCommonLog.put("camera_capture_height", localUserStatisticInfo.mCamCaptureHeight);
                            createCommonLog.put("camera_avg_result_fps", localUserStatisticInfo.mCamResultFps);
                            createCommonLog.put("camera_real_fps_range", localUserStatisticInfo.mFpsRange);
                        }
                    }
                    createCommonLog.put("remote_user_info", InteractLogService.this.getRemoteStaticsInfo(map));
                    ProcInfoStatistics.ProcInfo procInfo2 = procInfo;
                    if (procInfo2 != null) {
                        createCommonLog.put("rtc_app_cpu", (int) procInfo2.appCpuUsed).put("rtc_sys_cpu", (int) procInfo.totalCpuUsed).put("rtc_app_memory", (int) procInfo.appUsedMemory).put("rtc_sys_memory", (int) procInfo.systemUsedMemory);
                    }
                    if (localUserStatisticInfo != null) {
                        JSONObject staticsMessage = InteractLogService.this.getStaticsMessage();
                        staticsMessage.put("local_mic_db", localUserStatisticInfo.mLocalMicVolumedB);
                        staticsMessage.put("adm_status", localUserStatisticInfo.mAdmStatus);
                        staticsMessage.put("rtc_push_frame_elapse", localUserStatisticInfo.mRtcPushElapseMs);
                        staticsMessage.put("rtc_last_message", localUserStatisticInfo.mLastMessage);
                        JSONObject jSONObject = localUserStatisticInfo.mCameraStatus;
                        if (jSONObject != null && jSONObject.length() > 0) {
                            staticsMessage.put("camera", localUserStatisticInfo.mCameraStatus);
                        }
                        InteractLogService.this.putLiveCoreInfoToMessage(staticsMessage, localUserStatisticInfo);
                        createCommonLog.put("message", staticsMessage.toString());
                    }
                    InteractLogService interactLogService = InteractLogService.this;
                    Config config = interactLogService.mConfig;
                    if (config != null) {
                        createCommonLog.put("video_codec", interactLogService.getVideoCodec(config.getMixStreamConfig().getVideoCodec()));
                    }
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass24 anonymousClass24) {
                boolean LIZ;
                try {
                    anonymousClass24.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$24__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onLeavingChannel(final long j, final String str, final String str2) {
        final long j2;
        if (this.mStartJoiningTs != 0) {
            j2 = System.currentTimeMillis() - this.mStartJoiningTs;
        } else {
            j2 = 0;
        }
        onReportRtcStat("rtc_join_channel_stat", this.mRtcJoinChannelTimeCost);
        onReportRtcStat("rtc_subscribe_audio_stat", this.mRtcSubscribeAudioTimeCost);
        onReportRtcStat("rtc_subscribe_video_stat", this.mRtcSubscribeVideoTimeCost);
        onReportRtcStat("rtc_video_first_frame_stat", this.mRtcVideoFirstFrameTimeCost);
        onReportRtcStat("rtc_audio_first_frame_stat", this.mRtcAudioFirstFrameTimeCost);
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.9
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$9__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_leave_channel", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("elapsed", j2).put("pull_streams_video_duration", j).put("remote_video_color_range", str).put("transform_color_range", str2);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onMediaStateChanged(final String str, final int i, final String str2) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.30
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$30__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_media_state_changed", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("message", str).put("state", i).put("remote_rtc_user_id", str2);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass30 anonymousClass30) {
                boolean LIZ;
                try {
                    anonymousClass30.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$30__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onPlayPublicStreamResult(final String str, final String str2, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.32
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$32__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_callback", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("message", str).put("publicStreamId", str2).put("errCode", i);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass32 anonymousClass32) {
                boolean LIZ;
                try {
                    anonymousClass32.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$32__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onProviderEvent(final String str, final String str2, final String str3) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.23
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$23__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_provider_event", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("event_name", str).put("direction", str2).put("message", str3);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
                boolean LIZ;
                try {
                    anonymousClass23.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$23__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onPushPublicStreamResult(final String str, final String str2, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.31
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$31__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_callback", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("message", str).put("publicStreamId", str2).put("errCode", i);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass31 anonymousClass31) {
                boolean LIZ;
                try {
                    anonymousClass31.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$31__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onRTCEngineMediaAPICall(final String str, final String str2, final String str3) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.28
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$28__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_api_call", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("engine_api_name", str).put("api_parameter_info", str2).put("message", str3);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass28 anonymousClass28) {
                boolean LIZ;
                try {
                    anonymousClass28.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$28__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onStreamStateChange(final int i, final String str, final int i2) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.20
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$20__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_stream_state_changed", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("error_code", i).put("message", str).put("state", i2);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
                boolean LIZ;
                try {
                    anonymousClass20.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$20__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onJoiningChannel(final int i, final String str, final String str2, final String str3) {
        this.mStartJoiningTs = System.currentTimeMillis();
        this.mRtcJoinChannelTimeCost = 0L;
        this.mRtcSubscribeAudioTimeCost = 0L;
        this.mRtcSubscribeVideoTimeCost = 0L;
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$1__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_join_channel", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    Config.VideoQuality videoQuality = InteractLogService.this.mConfig.getVideoQuality();
                    Config.MixStreamConfig mixStreamConfig = InteractLogService.this.mConfig.getMixStreamConfig();
                    JSONObject put = createCommonLog.put("error_code", i).put("rtc_video_profile", InteractLogService.this.getVideoQuality(videoQuality));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(InteractLogService.this.mRtcExtInfo.userId);
                    JSONObject put2 = put.put("account", X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("");
                    LIZ2.append(InteractLogService.this.mConfig.getBusinessId());
                    JSONObject put3 = put2.put("business_id", X1D.LIZIZ(LIZ2));
                    String str4 = str;
                    if (str4 == null) {
                        str4 = "";
                    }
                    JSONObject put4 = put3.put("rtc_token", str4).put("width", videoQuality.getWidth()).put("height", videoQuality.getHeight()).put("fps", videoQuality.getFps()).put("video_bitrate", videoQuality.getBitrate()).put("rtc_mix_audio_profile", InteractLogService.this.genMixAudioReportJson(mixStreamConfig)).put("mix_video_profile", InteractLogService.this.genMixVideoReportJson(mixStreamConfig));
                    String str5 = str2;
                    put4.put("rtc_app_id", str5 != null ? str5 : "").put("message", str3);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.iow("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onPublicStreamSEIMessageReceived(final String str, final String str2, final ByteBuffer byteBuffer, final int i) {
        final long currentTimeMillis = System.currentTimeMillis();
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.33
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$33__run$___twin___() {
                JSONObject createCommonLog = InteractLogService.this.createCommonLog("rtc_engine_callback", currentTimeMillis);
                if (createCommonLog == null) {
                    return;
                }
                try {
                    createCommonLog.put("message", str).put("publicStreamId", str2).put("messageReceived", InteractLogService.byteBufferToString(byteBuffer)).put("sourceType", i);
                    InteractLogService.this.reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass33 anonymousClass33) {
                boolean LIZ;
                try {
                    anonymousClass33.com_ss_avframework_livestreamv2_core_interact_statistic_InteractLogService$33__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
