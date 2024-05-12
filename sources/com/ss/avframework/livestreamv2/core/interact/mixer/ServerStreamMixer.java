package com.ss.avframework.livestreamv2.core.interact.mixer;

import X.C16880lQ;
import X.X1D;
import X.YE1;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCExtInfo;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCInfoMode;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.MixedStreamType;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ServerStreamMixer extends StreamMixer {
    public final String TAG = "ServerStreamMixer";
    public LiveRTCExtInfo mLiveRtcExtInfo;
    public RTCVideo mRtcEngine;
    public RTCEngineWrapper mRtcEngineWrapper;
    public StreamMixManager mStreamMixManager;
    public String mTaskId;

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void stopMixStream() {
        super.stopMixStream();
        this.mRtcEngine.stopPushStreamToCDN(this.mTaskId);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void startMixStream(MixedStreamConfig mixedStreamConfig) {
        super.startMixStream(mixedStreamConfig);
        if (this.mRtcEngineWrapper.getLiveRTCInfoMode().getServerMixVideoParam() == LiveRTCInfoMode.LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET && this.mLiveRtcExtInfo.mixMaxBitrateKbps > 0 && mixedStreamConfig != null && mixedStreamConfig.getVideoConfig() != null) {
            mixedStreamConfig.getVideoConfig().setBitrate(this.mLiveRtcExtInfo.mixMaxBitrateKbps);
        }
        AVLog.logKibana(4, "ServerStreamMixer", "startLiveTranscoding", null);
        this.mRtcEngine.startPushMixedStreamToCDN(this.mTaskId, mixedStreamConfig, new IMixedStreamObserver() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ServerStreamMixer.1
            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public boolean isSupportClientPushStream() {
                return false;
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i) {
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingAudioFrame(String str, byte[] bArr, int i, long j) {
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingDataFrame(String str, byte[] bArr, long j) {
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingVideoFrame(String str, VideoFrame videoFrame) {
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, MixedStreamType mixedStreamType) {
                if (byteRTCStreamMixingEvent == null || mixedStreamType == null || !str.equals(ServerStreamMixer.this.mTaskId)) {
                    return;
                }
                if (LogUtil.logFilterSwitch()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Received onStreamMixingEvent, eventType: ");
                    LIZ.append(byteRTCStreamMixingEvent);
                    LIZ.append(" taskId: ");
                    LIZ.append(str);
                    LIZ.append(" error: ");
                    LIZ.append(byteRTCTranscoderErrorCode);
                    LIZ.append(" mixType: ");
                    LIZ.append(mixedStreamType);
                    AVLog.iod("ServerStreamMixer", X1D.LIZIZ(LIZ));
                }
                AVLog.debugTrace(byteRTCStreamMixingEvent, str, byteRTCTranscoderErrorCode, mixedStreamType);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mix event: ");
                YE1.LIZLLL(LIZ2, byteRTCStreamMixingEvent.toString(), ", taskId: ", str, ", error: ");
                LIZ2.append(byteRTCTranscoderErrorCode.toString());
                LIZ2.append(", mixType: ");
                LIZ2.append(mixedStreamType.toString());
                String LIZIZ = X1D.LIZIZ(LIZ2);
                if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_UPDATE) {
                    return;
                }
                ServerStreamMixer.this.mStreamMixManager.onStreamMixEvent(byteRTCStreamMixingEvent, LIZIZ, byteRTCTranscoderErrorCode.value(), mixedStreamType.value());
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void updateMixStream(MixedStreamConfig mixedStreamConfig) {
        if (this.mLiveRtcExtInfo.mixMaxBitrateKbps > 0 && mixedStreamConfig != null && mixedStreamConfig.getVideoConfig() != null) {
            mixedStreamConfig.getVideoConfig().setBitrate(this.mLiveRtcExtInfo.mixMaxBitrateKbps);
        }
        this.mRtcEngine.updatePushMixedStreamToCDN(this.mTaskId, mixedStreamConfig);
    }

    public ServerStreamMixer(RTCVideo rTCVideo, StreamMixManager streamMixManager, String str) {
        this.mTaskId = "";
        this.mRtcEngine = rTCVideo;
        this.mStreamMixManager = streamMixManager;
        this.mMixType = Config.MixStreamType.SERVER_MIX;
        RTCEngineWrapper rTCEngineWrapper = streamMixManager.getRTCEngineWrapper();
        this.mRtcEngineWrapper = rTCEngineWrapper;
        this.mLiveRtcExtInfo = rTCEngineWrapper.getLiveRTCExtInfo();
        this.mTaskId = str;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void updateMixStream(final List<Region> list, final String str, final boolean z, final boolean z2, final Map<String, Client.RTCWaterMarkRegion> map) {
        String str2;
        InteractConfig interactConfig = this.mStreamMixManager.getInteractConfig();
        JSONObject authInfoCache = this.mStreamMixManager.getAuthInfoCache();
        if (interactConfig.getCharacter() != Config.Character.ANCHOR || interactConfig.getMixStreamType() != Config.MixStreamType.SERVER_MIX || TextUtils.isEmpty(interactConfig.getMixStreamConfig().getStreamUrl())) {
            return;
        }
        if (interactConfig.getHandler() != null && C16880lQ.LLLLIIIILLL() != interactConfig.getHandler().getLooper().getThread()) {
            interactConfig.getHandler().post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ServerStreamMixer.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_mixer_ServerStreamMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_mixer_ServerStreamMixer$2__run$___twin___() {
                    ServerStreamMixer.this.updateMixStream(list, str, z, z2, map);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_mixer_ServerStreamMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_avframework_livestreamv2_core_interact_mixer_ServerStreamMixer$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        MixedStreamConfig createLiveTranscoding = this.mStreamMixManager.createLiveTranscoding(false);
        if (createLiveTranscoding == null) {
            return;
        }
        AVLog.debugTrace(list, str);
        this.mStreamMixManager.convertRegionsToLiveTranscoding(list, createLiveTranscoding);
        if (LogUtil.logFilterSwitch()) {
            if (str != null) {
                str2 = str;
            } else {
                str2 = "";
            }
            AVLog.i("ServerStreamMixer", str2);
        }
        createLiveTranscoding.getLayout().setUserConfigExtraInfo(str);
        if (authInfoCache != null && !TextUtils.isEmpty(interactConfig.getMixStreamConfig().getStreamUrl())) {
            Matcher matcher = PatternProtector.compile("stream-[0-9]+([0-9]{5})").matcher(interactConfig.getMixStreamConfig().getStreamUrl());
            if (matcher.find()) {
                try {
                    authInfoCache.put("streamName", matcher.group());
                    createLiveTranscoding.setAuthInfo(authInfoCache);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        if (map != null) {
            this.mStreamMixManager.convertImageRegionsToLiveTranscoding(z2, map, createLiveTranscoding);
        }
        updateMixStream(createLiveTranscoding);
    }
}
