package com.ss.avframework.livestreamv2.core.interact.livertc;

import X.C16880lQ;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCInfoMode;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCChannelState;
import com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import com.ss.avframework.livestreamv2.core.interact.utils.InteractThreadUtils;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
import com.ss.bytertc.engine.type.ChannelProfile;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import defpackage.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class RTCEngineWrapper implements ILiveRtcEventObserver {
    public static boolean sRTCEngineCreated;
    public LiveRTCInfoMode liveRTCInfoMode;
    public VideoEncoderConfig mClientMixVideoPreset;
    public Context mContext;
    public RTCHandlerProxy mHandlerProxy;
    public LiveRTCExtInfo mLiveRtcExtInfo;
    public int mLiveVideoMode;
    public VideoEncoderConfig mLiveVideoPreset;
    public InteractLogService mLogService;
    public int mMixStreamType;
    public MuteState mMuteAllRemoteAudioStreams;
    public MuteState mMuteLocalAudioStream;
    public RTCChannelState mRtcChannelState;
    public String mRtcExtInfo;
    public RTCPhoneStateListener mRtcPhoneStateListener;
    public ByteBuffer mSeiBuffer;
    public VideoEncoderConfig mServerMixVideoParam;
    public VideoEncoderConfig mServerMixVideoPreset;
    public ScheduledExecutorService mWorkExecutor;
    public Thread mWorkerThread;
    public RTCVideo rtcEngine;
    public RTCRoomImpl rtcRoom;

    private void resetLiveRtcParam() {
        this.mLiveVideoMode = 0;
        this.mMixStreamType = 0;
        VideoEncoderConfig videoEncoderConfig = LiveRTCInfoMode.LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mClientMixVideoPreset = videoEncoderConfig;
        this.mServerMixVideoPreset = videoEncoderConfig;
        this.mLiveVideoPreset = videoEncoderConfig;
        this.mServerMixVideoParam = videoEncoderConfig;
        this.mLiveRtcExtInfo.reset();
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.livertc.ILiveRtcEventObserver
    public void onStreamAdd(RTCStream rTCStream) {
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.livertc.ILiveRtcEventObserver
    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    private void configVideoParam() {
        IRTCVideoEventHandler handler;
        ArrayList arrayList = new ArrayList();
        int i = this.mLiveVideoMode;
        if (i != 0 && i != 1 && i != 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("live vieo mode is error, live mode: ");
            LIZ.append(this.mLiveVideoMode);
            LogUtil.e("LiveRtcEngine", X1D.LIZIZ(LIZ));
            RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
            if (rTCHandlerProxy != null && (handler = rTCHandlerProxy.getHandler()) != null) {
                handler.onError(8001);
            }
            arrayList.add(this.mLiveVideoPreset);
            this.rtcEngine.setVideoEncoderConfig((VideoEncoderConfig[]) arrayList.toArray(new VideoEncoderConfig[arrayList.size()]));
            return;
        }
        VideoEncoderConfig videoEncoderConfig = this.mLiveVideoPreset;
        if (videoEncoderConfig == null) {
            return;
        }
        arrayList.add(videoEncoderConfig);
        this.rtcEngine.setVideoEncoderConfig((VideoEncoderConfig[]) arrayList.toArray(new VideoEncoderConfig[arrayList.size()]));
    }

    private void createRtcRoom() {
        LiveRTCExtInfo liveRTCExtInfo = this.mLiveRtcExtInfo;
        if (liveRTCExtInfo != null && !TextUtils.isEmpty(liveRTCExtInfo.channelId) && this.rtcEngine != null) {
            if (this.rtcRoom != null) {
                destroyRtcRoom();
            }
            RTCRoomImpl rTCRoomImpl = (RTCRoomImpl) this.rtcEngine.createRTCRoom(this.mLiveRtcExtInfo.channelId);
            this.rtcRoom = rTCRoomImpl;
            if (rTCRoomImpl == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create rtcRoom failed && roomId:");
                LIZ.append(this.mLiveRtcExtInfo.channelId);
                AVLog.ioi("LiveRtcEngine", X1D.LIZIZ(LIZ));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create rtcRoom success && roomId:");
            LIZ2.append(this.mLiveRtcExtInfo.channelId);
            AVLog.ioi("LiveRtcEngine", X1D.LIZIZ(LIZ2));
        }
    }

    public static String getRTCSDKVersion() {
        if (sRTCEngineCreated) {
            return RTCVideo.getSDKVersion();
        }
        return "";
    }

    private void storageRTCDeviceId() {
        Context context;
        String str = System.getenv("K_BYTERTC_DEVICE_ID");
        if (str != null && (context = this.mContext) != null) {
            F9J.LIZIZ(context, 0, "interact").edit().putString("rtc_device_id", str).apply();
        }
    }

    public void destroyRtcRoom() {
        RTCRoomImpl rTCRoomImpl = this.rtcRoom;
        if (rTCRoomImpl != null) {
            rTCRoomImpl.destroy();
            this.rtcRoom = null;
        }
    }

    public void disableRtcPhoneListener() {
        ScheduledExecutorService scheduledExecutorService = this.mWorkExecutor;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.mWorkExecutor.execute(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$3__run$___twin___() {
                    TelephonyManager telephonyManager;
                    RTCEngineWrapper rTCEngineWrapper = RTCEngineWrapper.this;
                    Context context = rTCEngineWrapper.mContext;
                    if (context != null && rTCEngineWrapper.mRtcPhoneStateListener != null && (telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone")) != null) {
                        telephonyManager.listen(RTCEngineWrapper.this.mRtcPhoneStateListener, 0);
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void doDestroy() {
        this.mLiveRtcExtInfo.reset();
        resetLiveRtcParam();
        disableRtcPhoneListener();
        ScheduledExecutorService scheduledExecutorService = this.mWorkExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        LiveRTCInfoMode liveRTCInfoMode = this.liveRTCInfoMode;
        if (liveRTCInfoMode != null) {
            liveRTCInfoMode.destroy();
        }
        destroyRtcRoom();
        RTCVideo.destroyRTCVideo();
        RTCVideo.setRtcNativeLibraryLoader(new RTCNativeLibraryLoaderImpl());
    }

    public void enableRtcPhoneListener() {
        ScheduledExecutorService scheduledExecutorService = this.mWorkExecutor;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.mWorkExecutor.execute(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$2__run$___twin___() {
                    TelephonyManager telephonyManager;
                    RTCEngineWrapper rTCEngineWrapper = RTCEngineWrapper.this;
                    Context context = rTCEngineWrapper.mContext;
                    if (context != null && rTCEngineWrapper.mRtcPhoneStateListener != null && (telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone")) != null) {
                        telephonyManager.listen(RTCEngineWrapper.this.mRtcPhoneStateListener, 32);
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public String getAppId() {
        JSONObject optJSONObject;
        String str = "";
        try {
            if (TextUtils.isEmpty(this.mRtcExtInfo) || (optJSONObject = new JSONObject(this.mRtcExtInfo).optJSONObject("live_rtc_engine_config")) == null) {
                return "";
            }
            str = optJSONObject.optString("rtc_app_id");
            return str;
        } catch (JSONException e) {
            LogUtil.e("LiveRtcEngine", "get app id exception", e);
            return str;
        }
    }

    public String getRoomId() {
        return this.mLiveRtcExtInfo.channelId;
    }

    public RTCVideo getRtcEngine() {
        RTCVideo rTCVideo = this.rtcEngine;
        if (rTCVideo != null) {
            return rTCVideo;
        }
        return null;
    }

    public LiveRTCExtInfo getRtcExtInfo() {
        LiveRTCInfoMode liveRTCInfoMode = this.liveRTCInfoMode;
        if (liveRTCInfoMode != null) {
            return liveRTCInfoMode.getRtcExtInfo();
        }
        return null;
    }

    public RTCRoomImpl getRtcRoom() {
        if (this.rtcRoom == null) {
            createRtcRoom();
        }
        return this.rtcRoom;
    }

    public boolean isAllRemoteAudioMute() {
        boolean z;
        synchronized (this.mMuteAllRemoteAudioStreams) {
            if (this.mMuteAllRemoteAudioStreams == MuteState.MUTE_STATE_ON) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean isLocalAudioMute() {
        boolean z;
        synchronized (this.mMuteLocalAudioStream) {
            if (this.mMuteLocalAudioStream == MuteState.MUTE_STATE_ON) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean isSpeakerPhoneOn() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((AudioManager) C16880lQ.LLILL(context, "audio")).isSpeakerphoneOn();
    }

    public void leaveRoom() {
        if (this.mRtcChannelState.getChannelState() == RTCChannelState.ChannelState.CHANNEL_STATE_LEAVE_CHANNEL) {
            return;
        }
        RTCRoomImpl rTCRoomImpl = this.rtcRoom;
        if (rTCRoomImpl != null) {
            rTCRoomImpl.leaveRoom();
        }
        this.rtcEngine.setBusinessId("");
        this.mRtcChannelState.leaveChannel();
        resetLiveRtcParam();
    }

    public void callEndResumeAudio() {
        if (InteractThreadUtils.getWorkThreadHandler() == null) {
            return;
        }
        if (C16880lQ.LLLLIIIILLL() != InteractThreadUtils.getWorkThreadHandler().getLooper().getThread()) {
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$5__run$___twin___() {
                    RTCEngineWrapper.this.callEndResumeAudio();
                }

                public static void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        if (this.rtcEngine == null) {
            return;
        }
        InteractLogService interactLogService = this.mLogService;
        if (interactLogService != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("phone state: call end, isLocalAudioMute:");
            LIZ.append(isLocalAudioMute());
            LIZ.append(", isAllRemoteAudioMute:");
            LIZ.append(isAllRemoteAudioMute());
            interactLogService.onHandlePhoneCall(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("phone state: call end, isLocalAudioMute:");
        LIZ2.append(isLocalAudioMute());
        LIZ2.append(", isAllRemoteAudioMute:");
        LIZ2.append(isAllRemoteAudioMute());
        AVLog.ioi("LiveRtcEngine", X1D.LIZIZ(LIZ2));
        if (isLocalAudioMute()) {
            this.rtcRoom.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
        } else {
            this.rtcRoom.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
        }
        if (isAllRemoteAudioMute()) {
            this.rtcRoom.pauseAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
        } else {
            this.rtcRoom.resumeAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
        }
    }

    public void callStartMuteAudio() {
        if (InteractThreadUtils.getWorkThreadHandler() == null) {
            return;
        }
        if (C16880lQ.LLLLIIIILLL() != InteractThreadUtils.getWorkThreadHandler().getLooper().getThread()) {
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$4__run$___twin___() {
                    RTCEngineWrapper.this.callStartMuteAudio();
                }

                public static void com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    boolean LIZ;
                    try {
                        anonymousClass4.com_ss_avframework_livestreamv2_core_interact_livertc_RTCEngineWrapper$4__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        if (this.rtcEngine == null) {
            return;
        }
        InteractLogService interactLogService = this.mLogService;
        if (interactLogService != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("phone state: call start, isLocalAudioMute:");
            LIZ.append(isLocalAudioMute());
            LIZ.append(", isAllRemoteAudioMute:");
            LIZ.append(isAllRemoteAudioMute());
            interactLogService.onHandlePhoneCall(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("phone state: call start, isLocalAudioMute:");
        LIZ2.append(isLocalAudioMute());
        LIZ2.append(", isAllRemoteAudioMute:");
        LIZ2.append(isAllRemoteAudioMute());
        AVLog.ioi("LiveRtcEngine", X1D.LIZIZ(LIZ2));
        this.rtcRoom.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
        this.rtcRoom.pauseAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
    }

    public LiveRTCExtInfo getLiveRTCExtInfo() {
        return this.mLiveRtcExtInfo;
    }

    public LiveRTCInfoMode getLiveRTCInfoMode() {
        return this.liveRTCInfoMode;
    }

    public static String getAppId(String str) {
        String str2 = null;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("live_rtc_engine_config");
            if (optJSONObject == null) {
                return null;
            }
            str2 = optJSONObject.optString("rtc_app_id");
            return str2;
        } catch (JSONException e) {
            LogUtil.e("LiveRtcEngine", "get app id exception", e);
            return str2;
        }
    }

    public static int getMixType(String str) {
        try {
            int i = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "live_rtc_video_param"), "rtc_mix_type");
            if (i < 0 || i > 3) {
                return 2;
            }
            return i;
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseRTCExtInfo happen exception");
            LIZ.append(e.getStackTrace().toString());
            LogUtil.w("LiveRtcEngine", X1D.LIZIZ(LIZ));
            return 2;
        }
    }

    public static String getRTCDeviceId(Context context) {
        if (context == null) {
            return "not defined, please start interact";
        }
        return F9J.LIZIZ(context, 0, "interact").getString("rtc_device_id", "not defined, please start interact");
    }

    public static JSONObject parseEngineParameters(String str) {
        JSONObject jSONObject = new JSONObject();
        LogUtil.i("LiveRtcEngine", i0.LJFF("rtcExtInfo:", str));
        if (str != null && !"".equals(str)) {
            try {
                String optString = new JSONObject(str).optString("rtc.ab_label");
                if (!optString.isEmpty()) {
                    jSONObject.put("rtc.ab_label", optString);
                }
            } catch (JSONException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("parseRTCExtInfo happen exception");
                LIZ.append(e.getStackTrace().toString());
                LogUtil.w("LiveRtcEngine", X1D.LIZIZ(LIZ));
            }
        }
        return jSONObject;
    }

    private void updateRtcVideoParam(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        LiveRTCInfoMode liveRTCInfoMode = this.liveRTCInfoMode;
        if (liveRTCInfoMode != null) {
            liveRTCInfoMode.parseLiveRtcVideoParam(jSONObject);
            this.mLiveVideoMode = this.liveRTCInfoMode.getLiveMode();
            this.mLiveVideoPreset = this.liveRTCInfoMode.getLiveVideoPreset();
        }
        configVideoParam();
    }

    public int joinRoom(String str) {
        this.mRtcChannelState.joinChannel();
        return this.rtcRoom.joinRoom(this.mLiveRtcExtInfo.token, new UserInfo(this.mLiveRtcExtInfo.interactId, ""), new RTCRoomConfig(ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING, true, true, true));
    }

    public void muteAllRemoteAudio(MuteState muteState) {
        if (this.rtcEngine != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("muteAllRemoteAudio, MuteState:");
            LIZ.append(muteState.toString());
            AVLog.ioi("LiveRtcEngine", X1D.LIZIZ(LIZ));
            synchronized (this.mMuteAllRemoteAudioStreams) {
                this.mMuteAllRemoteAudioStreams = muteState;
            }
            RTCRoomImpl rTCRoomImpl = this.rtcRoom;
            if (rTCRoomImpl != null) {
                if (muteState == MuteState.MUTE_STATE_ON) {
                    rTCRoomImpl.pauseAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
                } else {
                    rTCRoomImpl.resumeAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
                }
            }
        }
    }

    public void muteLocalAudio(MuteState muteState) {
        if (this.rtcEngine != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("muteLocalAudio, MuteState:");
            LIZ.append(muteState.toString());
            AVLog.ioi("LiveRtcEngine", X1D.LIZIZ(LIZ));
            synchronized (this.mMuteLocalAudioStream) {
                this.mMuteLocalAudioStream = muteState;
            }
            RTCRoomImpl rTCRoomImpl = this.rtcRoom;
            if (rTCRoomImpl != null) {
                if (muteState == MuteState.MUTE_STATE_ON) {
                    rTCRoomImpl.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
                } else {
                    rTCRoomImpl.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
                }
            }
        }
    }

    public void setInteractLogServer(InteractLogService interactLogService) {
        this.mLogService = interactLogService;
    }

    public void setRtcEngineEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler) {
        RTCHandlerProxy rTCHandlerProxy = new RTCHandlerProxy(iRTCVideoEventHandler, this);
        this.mHandlerProxy = rTCHandlerProxy;
        this.rtcEngine.setRtcVideoEventHandler(rTCHandlerProxy);
    }

    public void setRtcExtInfo(String str) {
        RTCHandlerProxy rTCHandlerProxy;
        ScheduledExecutorService scheduledExecutorService;
        if (this.liveRTCInfoMode == null && (rTCHandlerProxy = this.mHandlerProxy) != null && (scheduledExecutorService = this.mWorkExecutor) != null) {
            this.liveRTCInfoMode = new LiveRTCInfoMode(rTCHandlerProxy, scheduledExecutorService);
        }
        this.liveRTCInfoMode.parseRTCExtInfo(str);
        this.mLiveRtcExtInfo = this.liveRTCInfoMode.getRtcExtInfo();
        this.mLiveVideoMode = this.liveRTCInfoMode.getLiveMode();
        this.mLiveVideoPreset = this.liveRTCInfoMode.getLiveVideoPreset();
        this.mClientMixVideoPreset = this.liveRTCInfoMode.getClientMixVideoPreset();
        this.mServerMixVideoPreset = this.liveRTCInfoMode.getServerMixVideoPreset();
        this.mServerMixVideoParam = this.liveRTCInfoMode.getServerMixVideoParam();
        createRtcRoom();
    }

    public void setRtcRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        if (this.rtcRoom == null) {
            this.rtcRoom = getRtcRoom();
        }
        this.rtcRoom.setRTCRoomEventHandler(iRTCRoomEventHandler);
    }

    public int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr) {
        if (this.mLiveVideoMode == 0) {
            return this.rtcEngine.setVideoEncoderConfig(videoEncoderConfigArr);
        }
        return 0;
    }

    public int updateRtcExtInfo(String str) {
        int i = -1;
        if (str == null) {
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("rtc_business_id");
            if (optString != null && !optString.isEmpty()) {
                this.mLiveRtcExtInfo.businessId = optString;
                this.rtcEngine.setBusinessId(optString);
            }
            updateRtcVideoParam(jSONObject.optJSONObject("live_rtc_video_param"));
            i = 0;
            return 0;
        } catch (JSONException e) {
            LogUtil.e("LiveRtcEngine", i0.LJFF("update rtc info happen exception rtcExtInfo:", str), e);
            return i;
        }
    }

    public int configureEngine(LiveInfo liveInfo, IRTCVideoEventHandler iRTCVideoEventHandler) {
        int i = liveInfo.mixType;
        this.mMixStreamType = i;
        if (3 == this.mLiveVideoMode) {
            if (1 == i) {
                this.mLiveVideoPreset = this.mClientMixVideoPreset;
            } else {
                this.mLiveVideoPreset = this.mServerMixVideoPreset;
            }
        }
        LiveRTCInfoMode liveRTCInfoMode = this.liveRTCInfoMode;
        if (liveRTCInfoMode != null) {
            liveRTCInfoMode.setMixStreamType(i);
            this.liveRTCInfoMode.setLiveVideoPreset(this.mLiveVideoPreset);
        }
        String str = this.mLiveRtcExtInfo.businessId;
        if (str != null && !"".equals(str)) {
            this.rtcEngine.setBusinessId(this.mLiveRtcExtInfo.businessId);
        }
        configVideoParam();
        return 0;
    }

    public RTCEngineWrapper(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, JSONObject jSONObject) {
        VideoEncoderConfig videoEncoderConfig = LiveRTCInfoMode.LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mLiveVideoPreset = videoEncoderConfig;
        this.mClientMixVideoPreset = videoEncoderConfig;
        this.mServerMixVideoPreset = videoEncoderConfig;
        this.mServerMixVideoParam = videoEncoderConfig;
        this.mLiveRtcExtInfo = new LiveRTCExtInfo();
        this.mRtcChannelState = new RTCChannelState();
        MuteState muteState = MuteState.MUTE_STATE_OFF;
        this.mMuteLocalAudioStream = muteState;
        this.mMuteAllRemoteAudioStreams = muteState;
        this.mHandlerProxy = null;
        RTCVideo createRTCVideo = RTCVideo.createRTCVideo(context, getAppId(str), iRTCVideoEventHandler, obj, jSONObject);
        this.rtcEngine = createRTCVideo;
        if (createRTCVideo == null) {
            return;
        }
        createRtcRoom();
        setRtcEngineEventHandler(iRTCVideoEventHandler);
        this.mContext = context;
        this.mRtcExtInfo = str;
        storageRTCDeviceId();
        this.mRtcPhoneStateListener = new RTCPhoneStateListener(context, this);
        this.mWorkExecutor = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                RTCEngineWrapper.this.mWorkerThread = new PthreadThread(runnable, "RTCEngineWrapper$1");
                RTCEngineWrapper.this.mWorkerThread.setName("live-rtc-worker-thread");
                RTCEngineWrapper.this.mWorkerThread.setDaemon(C16880lQ.LLLLIIIILLL().isDaemon());
                return RTCEngineWrapper.this.mWorkerThread;
            }
        });
        setRtcExtInfo(str);
        sRTCEngineCreated = true;
    }
}
