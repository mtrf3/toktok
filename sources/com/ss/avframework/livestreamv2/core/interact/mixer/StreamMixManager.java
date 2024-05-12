package com.ss.avframework.livestreamv2.core.interact.mixer;

import X.AnonymousClass028;
import X.C16880lQ;
import X.C25620zW;
import X.C48263Iwt;
import X.KMP;
import X.X1D;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.ClientImpl;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCExtInfo;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCInfoMode;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics;
import com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import com.ss.avframework.livestreamv2.core.interact.utils.InteractThreadUtils;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Orientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class StreamMixManager {
    public JSONObject authInfoCache;
    public boolean liveTranscodingState;
    public InteractEngineBuilder mBuilder;
    public boolean mChorusReadyState;
    public ClientImpl mClientImpl;
    public InteractConfig mConfig;
    public String mCurTaskId;
    public InteractEngineImpl mInteractEngine;
    public Client.Listener mInteractListenerProxy;
    public IInteractStatics mInteractStatics;
    public IRTCVideoEventHandler mInternalRtcCallback;
    public InteractLogService mLogService;
    public RTCVideo mRtcEngine;
    public RTCEngineWrapper mRtcEngineWrapper;
    public LiveRTCExtInfo mRtcExtInfo;
    public StreamMixer mStreamMixer;
    public Runnable mTaskOnStreamPublished;
    public VPassInteractCfg mVPassInteractCfg;
    public String roomId;
    public VideoEncoderConfig videoStreamDescription;
    public final String TAG = "StreamMixManager";
    public Client.RTCSpatialAudioPosition mixAudienceSpatialAudioPosition = new Client.RTCSpatialAudioPosition(0.0f, 0.0f, 0.0f);
    public Client.RTCSpatialAudioHumanOrientation mixAudienceSpatialAudioOrientation = new Client.RTCSpatialAudioHumanOrientation();
    public Client.RTCAudioVolumeIndication mixRTCAudioVolumeIndication = new Client.RTCAudioVolumeIndication();
    public boolean enableMixSpatialAudio = false;
    public boolean mBgmIsPlaying = false;
    public boolean mIsSwitchServerMix = false;
    public Config.MixStreamType mPreStreamMixerType = Config.MixStreamType.NONE;

    public void configMixTranscoding() {
        int videoWidth;
        int videoHeight;
        LiveRTCExtInfo rtcExtInfo;
        int i;
        int i2;
        MixedStreamConfig createLiveTranscoding = createLiveTranscoding(true);
        if (createLiveTranscoding == null) {
            if (this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
                if (this.mConfig.getMixStreamConfig() == null) {
                    AVLog.ioe("StreamMixManager", "Fail to init LiveTranscoding: MixStreamConfig is null");
                    return;
                }
                if (TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Fail to init LiveTranscoding: stream url is ");
                    LIZ.append(this.mConfig.getMixStreamConfig().getStreamUrl());
                    AVLog.ioe("StreamMixManager", X1D.LIZIZ(LIZ));
                    return;
                }
                AVLog.ioe("StreamMixManager", "Fail to init LiveTranscoding: unknown reason");
                return;
            }
            return;
        }
        Client.StreamMixer streamMixer = this.mConfig.getStreamMixer();
        if (streamMixer == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("InteractConfig.getStreamMixer is null: interact mode ");
            LIZ2.append(this.mConfig.getInteractMode());
            LIZ2.append(", character ");
            LIZ2.append(this.mConfig.getCharacter());
            LIZ2.append(", mix type ");
            LIZ2.append(this.mConfig.getMixStreamType());
            LIZ2.append(". Create client stack: ");
            LIZ2.append(this.mConfig.getCreateClientStack());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            AVLog.ioe("StreamMixManager", LIZIZ);
            AVLog.logKibana(6, "StreamMixManager", LIZIZ, null);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(LIZIZ);
            if (!AnonymousClass028.LJI(androidRuntimeException, "StreamMixManager.configMixTranscoding")) {
                return;
            } else {
                throw androidRuntimeException;
            }
        }
        Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        if (this.mConfig.isMixStreamConfigIndependent()) {
            synchronized (mixStreamConfig) {
                videoWidth = mixStreamConfig.getVideoWidth();
                videoHeight = mixStreamConfig.getVideoHeight();
            }
        } else {
            videoWidth = mixStreamConfig.getVideoWidth();
            videoHeight = mixStreamConfig.getVideoHeight();
        }
        VideoEncoderConfig videoEncoderConfig = this.videoStreamDescription;
        if (videoEncoderConfig != null && (i = videoEncoderConfig.width) > 0 && (i2 = videoEncoderConfig.height) > 0) {
            videoHeight = i2;
            videoWidth = i;
        }
        List<Region> formRegionList = this.mClientImpl.formRegionList();
        ClientImpl clientImpl = this.mClientImpl;
        if (clientImpl != null && clientImpl.getRtcEngineWrapper() != null && this.mClientImpl.getRtcEngineWrapper().getRtcExtInfo() != null && (rtcExtInfo = this.mClientImpl.getRtcEngineWrapper().getRtcExtInfo()) != null && rtcExtInfo.channelId != null) {
            String str = this.mClientImpl.getRtcEngineWrapper().getRtcExtInfo().channelId;
            this.roomId = str;
            createLiveTranscoding.setRoomID(str);
        }
        String mixStream = streamMixer.mixStream(videoWidth, videoHeight, formRegionList);
        if (formRegionList == null || formRegionList.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startMixStream with empty regions, sei: ");
            LIZ3.append(mixStream);
            LIZ3.append(", region is invalid");
            AVLog.iow("StreamMixManager", X1D.LIZIZ(LIZ3));
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("startMixStream mixStream result: sei", mixStream, ", region:");
        LIZIZ2.append(convertMixStreamLayout(formRegionList));
        AVLog.iow("StreamMixManager", X1D.LIZIZ(LIZIZ2));
        if (streamMixer.updateMixAudioVolumeIndication(this.mixRTCAudioVolumeIndication)) {
            MixedStreamConfig.MixedStreamServerControlConfig mixedStreamServerControlConfig = new MixedStreamConfig.MixedStreamServerControlConfig();
            mixedStreamServerControlConfig.setEnableVolumeIndication(true);
            mixedStreamServerControlConfig.setVolumeIndicationInterval(this.mixRTCAudioVolumeIndication.volumeIndicationInterval);
            mixedStreamServerControlConfig.setTalkVolume(this.mixRTCAudioVolumeIndication.talkVolume);
            mixedStreamServerControlConfig.setIsAddVolumeValue(this.mixRTCAudioVolumeIndication.isAddVolumeValue);
            mixedStreamServerControlConfig.setSeiContentMode(MixedStreamConfig.MixedStreamSEIContentMode.values()[this.mixRTCAudioVolumeIndication.contentMode.value()]);
            createLiveTranscoding.setServerControlConfig(mixedStreamServerControlConfig);
        }
        convertRegionsToLiveTranscoding(formRegionList, createLiveTranscoding);
        createLiveTranscoding.getLayout().setUserConfigExtraInfo(mixStream);
        if (this.authInfoCache != null && !TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
            Matcher matcher = PatternProtector.compile("stream-[0-9]+([0-9]{5})").matcher(this.mConfig.getMixStreamConfig().getStreamUrl());
            if (matcher.find()) {
                try {
                    this.authInfoCache.put("streamName", matcher.group());
                    createLiveTranscoding.setAuthInfo(this.authInfoCache);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            this.authInfoCache = null;
        }
        this.liveTranscodingState = true;
        startLiveTranscoding(createLiveTranscoding);
        createLiveTranscoding.setAuthInfo(null);
        InteractLogService interactLogService = this.mLogService;
        if (interactLogService != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("");
            LIZ4.append(this);
            LIZ4.append(createLiveTranscoding.toString());
            interactLogService.onEngineAPICall("enableLiveTranscoding", X1D.LIZIZ(LIZ4));
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixManager$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$RTCWaterMarkRegion$TranscoderImageRenderMode;

        static {
            int[] iArr = new int[Client.RTCWaterMarkRegion.TranscoderImageRenderMode.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$RTCWaterMarkRegion$TranscoderImageRenderMode = iArr;
            try {
                iArr[Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$RTCWaterMarkRegion$TranscoderImageRenderMode[Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$RTCWaterMarkRegion$TranscoderImageRenderMode[Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_ADAPTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean getChorusReadyState() {
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer instanceof ClientStreamMixer) {
            return ((ClientStreamMixer) streamMixer).getChorusReadyState();
        }
        return false;
    }

    public boolean getMixStartState() {
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer != null) {
            return streamMixer.mStart;
        }
        return false;
    }

    public void resetRtcClientMixVideoTrack() {
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer != null && (streamMixer instanceof RtcClientStreamMixer) && getMixStartState()) {
            ((RtcClientStreamMixer) this.mStreamMixer).resetOriginVideoTrack();
        }
    }

    public void stopInteract() {
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR) {
            if (this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX || this.mConfig.getMixStreamType() == Config.MixStreamType.RTC_CLIENT_MIX) {
                this.mRtcEngine.stopLiveTranscoding("");
                InteractLogService interactLogService = this.mLogService;
                if (interactLogService != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(this);
                    interactLogService.onEngineAPICall("disableLiveTranscoding", X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public void stopLiveTranscoding() {
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer != null) {
            streamMixer.stopMixStream();
        }
        this.liveTranscodingState = false;
        InteractLogService interactLogService = this.mLogService;
        if (interactLogService != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(this);
            interactLogService.onEngineAPICall("disableLiveTranscoding", X1D.LIZIZ(LIZ));
        }
    }

    public void updateServerMixParam() {
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer == null || this.mInteractEngine == null) {
            return;
        }
        streamMixer.stopMixStream();
        String streamUrl = this.mConfig.getMixStreamConfig().getStreamUrl();
        this.mInteractEngine.updateRtcMixParam();
        String streamUrl2 = this.mConfig.getMixStreamConfig().getStreamUrl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("change server mix url from: ");
        LIZ.append(streamUrl);
        LIZ.append(", to: ");
        LIZ.append(streamUrl2);
        AVLog.ioi("StreamMixManager", X1D.LIZIZ(LIZ));
        String replace = UUID.randomUUID().toString().replace("-", "");
        this.mCurTaskId = replace;
        this.mStreamMixer = new ServerStreamMixer(this.mRtcEngine, this, replace);
        configMixTranscoding();
        this.mClientImpl.composeCurrentWaterMarks();
    }

    public JSONObject getAuthInfoCache() {
        return this.authInfoCache;
    }

    public ClientImpl getClient() {
        return this.mClientImpl;
    }

    public boolean getEnableMixSpatialAudio() {
        return this.enableMixSpatialAudio;
    }

    public InteractEngineBuilder getEngineBuilder() {
        return this.mBuilder;
    }

    public InteractConfig getInteractConfig() {
        return this.mConfig;
    }

    public InteractEngineImpl getInteractEngine() {
        return this.mInteractEngine;
    }

    public boolean getLiveTranscodingState() {
        return this.liveTranscodingState;
    }

    public Client.RTCSpatialAudioHumanOrientation getMixAudienceSpatialAudioOrientation() {
        return this.mixAudienceSpatialAudioOrientation;
    }

    public Client.RTCSpatialAudioPosition getMixAudienceSpatialAudioPosition() {
        return this.mixAudienceSpatialAudioPosition;
    }

    public RTCEngineWrapper getRTCEngineWrapper() {
        return this.mRtcEngineWrapper;
    }

    public LiveRTCExtInfo getRtcExtInfo() {
        return this.mRtcExtInfo;
    }

    public void configureSpatialAudioParams(List<Region> list) {
        boolean z;
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        InteractConfig interactConfig = this.mConfig;
        if (interactConfig == null || this.mVPassInteractCfg == null) {
            this.enableMixSpatialAudio = false;
            return;
        }
        if (Config.LinkMicScene.CO_HOST == interactConfig.getScene() && (i4 = this.mVPassInteractCfg.spatialAudioAngle) > 0 && i4 <= 90) {
            z = true;
        } else {
            z = false;
        }
        this.enableMixSpatialAudio = z;
        if (!z) {
            return;
        }
        if (this.mVPassInteractCfg.disableSpatialAudioWhenPlayBGM && this.mBgmIsPlaying) {
            this.enableMixSpatialAudio = false;
            return;
        }
        int size = list.size();
        if (size < 2) {
            this.enableMixSpatialAudio = false;
            return;
        }
        double radians = Math.toRadians(this.mVPassInteractCfg.spatialAudioAngle);
        int i5 = this.mVPassInteractCfg.spatialAudioAudiencePos;
        if (i5 > 0 && i5 < 1001) {
            f = i5;
        } else {
            f = 100.0f;
        }
        float tan = (float) (Math.tan(radians) * f);
        this.enableMixSpatialAudio = false;
        if (2 == size) {
            if (Math.abs(((Region) ListProtector.get(list, 0)).getY() - ((Region) ListProtector.get(list, 1)).getY()) < 0.001d) {
                if (((Region) ListProtector.get(list, 1)).getX() > ((Region) ListProtector.get(list, 0)).getX()) {
                    ((Region) ListProtector.get(list, 0)).setSpatialAudioPos(0.0f, -tan, 0.0f);
                    ((Region) ListProtector.get(list, 1)).setSpatialAudioPos(0.0f, tan, 0.0f);
                } else {
                    ((Region) ListProtector.get(list, 1)).setSpatialAudioPos(0.0f, -tan, 0.0f);
                    ((Region) ListProtector.get(list, 0)).setSpatialAudioPos(0.0f, tan, 0.0f);
                }
                this.enableMixSpatialAudio = true;
            } else {
                return;
            }
        } else if (3 == size) {
            if (((Region) ListProtector.get(list, 0)).getX() < 0.001d) {
                if (Math.abs(((Region) ListProtector.get(list, 1)).getX() - ((Region) ListProtector.get(list, 2)).getX()) < 0.001d) {
                    if (((Region) ListProtector.get(list, 1)).getY() > ((Region) ListProtector.get(list, 2)).getY()) {
                        i = 1;
                        i2 = 2;
                    } else {
                        i = 2;
                        i2 = 1;
                    }
                    this.enableMixSpatialAudio = true;
                    i3 = 0;
                } else {
                    return;
                }
            } else if (((Region) ListProtector.get(list, 1)).getX() < 1.0E-5d) {
                if (Math.abs(((Region) ListProtector.get(list, 0)).getX() - ((Region) ListProtector.get(list, 2)).getX()) < 0.001d) {
                    if (((Region) ListProtector.get(list, 0)).getY() > ((Region) ListProtector.get(list, 2)).getY()) {
                        i = 0;
                        i2 = 2;
                    } else {
                        i = 2;
                        i2 = 0;
                    }
                    this.enableMixSpatialAudio = true;
                    i3 = 1;
                } else {
                    return;
                }
            } else if (((Region) ListProtector.get(list, 2)).getX() < 1.0E-5d && Math.abs(((Region) ListProtector.get(list, 0)).getX() - ((Region) ListProtector.get(list, 1)).getX()) < 0.001d) {
                if (((Region) ListProtector.get(list, 0)).getY() > ((Region) ListProtector.get(list, 1)).getY()) {
                    i = 0;
                    i2 = 1;
                } else {
                    i = 1;
                    i2 = 0;
                }
                this.enableMixSpatialAudio = true;
                i3 = 2;
            } else {
                return;
            }
            if (this.enableMixSpatialAudio) {
                float f2 = tan / 1.414f;
                ((Region) ListProtector.get(list, i3)).setSpatialAudioPos(0.0f, -tan, 0.0f);
                ((Region) ListProtector.get(list, i)).setSpatialAudioPos(f2, f2, 0.0f);
                ((Region) ListProtector.get(list, i2)).setSpatialAudioPos(-f2, f2, 0.0f);
            }
        } else if (4 == size) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            do {
                if (((Region) ListProtector.get(list, i6)).getX() < 0.001d) {
                    i7++;
                    if (i7 > 2) {
                        return;
                    } else {
                        iArr[i7 - 1] = i6;
                    }
                } else {
                    i8++;
                    if (i8 > 2) {
                        return;
                    } else {
                        iArr2[i8 - 1] = i6;
                    }
                }
                i6++;
            } while (i6 < size);
            if (2 == i7 && 2 == i8) {
                float f3 = tan / 1.414f;
                if (((Region) ListProtector.get(list, iArr[0])).getY() > ((Region) ListProtector.get(list, iArr[1])).getY()) {
                    float f4 = -f3;
                    ((Region) ListProtector.get(list, iArr[0])).setSpatialAudioPos(f3, f4, 0.0f);
                    ((Region) ListProtector.get(list, iArr[1])).setSpatialAudioPos(f4, f4, 0.0f);
                } else {
                    float f5 = -f3;
                    ((Region) ListProtector.get(list, iArr[1])).setSpatialAudioPos(f3, f5, 0.0f);
                    ((Region) ListProtector.get(list, iArr[0])).setSpatialAudioPos(f5, f5, 0.0f);
                }
                if (((Region) ListProtector.get(list, iArr2[0])).getY() > ((Region) ListProtector.get(list, iArr2[1])).getY()) {
                    ((Region) ListProtector.get(list, iArr2[0])).setSpatialAudioPos(f3, f3, 0.0f);
                    ((Region) ListProtector.get(list, iArr2[1])).setSpatialAudioPos(-f3, f3, 0.0f);
                } else {
                    ((Region) ListProtector.get(list, iArr2[1])).setSpatialAudioPos(f3, f3, 0.0f);
                    ((Region) ListProtector.get(list, iArr2[0])).setSpatialAudioPos(-f3, f3, 0.0f);
                }
                this.enableMixSpatialAudio = true;
            } else {
                return;
            }
        }
        if (this.enableMixSpatialAudio) {
            Client.RTCSpatialAudioHumanOrientation rTCSpatialAudioHumanOrientation = this.mixAudienceSpatialAudioOrientation;
            Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation = rTCSpatialAudioHumanOrientation.forward;
            rTCSpatialAudioOrientation.x = 0.0f;
            rTCSpatialAudioOrientation.y = 0.0f;
            rTCSpatialAudioOrientation.z = -1.0f;
            Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation2 = rTCSpatialAudioHumanOrientation.right;
            rTCSpatialAudioOrientation2.x = 0.0f;
            rTCSpatialAudioOrientation2.y = 1.0f;
            rTCSpatialAudioOrientation2.z = 0.0f;
            Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation3 = rTCSpatialAudioHumanOrientation.up;
            rTCSpatialAudioOrientation3.x = 1.0f;
            rTCSpatialAudioOrientation3.y = 0.0f;
            rTCSpatialAudioOrientation3.z = 0.0f;
            Client.RTCSpatialAudioPosition rTCSpatialAudioPosition = this.mixAudienceSpatialAudioPosition;
            rTCSpatialAudioPosition.x = 0.0f;
            rTCSpatialAudioPosition.y = 0.0f;
            rTCSpatialAudioPosition.z = f;
        }
    }

    public String convertMixStreamLayout(List<Region> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            try {
                for (Region region : list) {
                    if (region != null) {
                        jSONArray.put(new JSONObject().put("uid", region.getInteractId()).put("left", region.getX()).put("top", region.getY()).put("width", region.getWidth()).put("height", region.getHeight()).put("zOrder", region.getZorder()).put("mute", region.isMuteAudio()).put("spatialAudioX", region.getSpatialPosX()).put("spatialAudioY", region.getSpatialPosY()).put("spatialAudioZ", region.getSpatialPosZ()));
                    }
                }
            } catch (JSONException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create layout json message happen exception: ");
                LIZ.append(e);
                AVLog.ioe("StreamMixManager", X1D.LIZIZ(LIZ));
                return null;
            }
        }
        return jSONArray.toString();
    }

    public MixedStreamConfig createLiveTranscoding(boolean z) {
        MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType mixedStreamVideoCodecType;
        boolean z2;
        MixedStreamConfig.MixedStreamAudioProfile mixedStreamAudioProfile;
        boolean z3;
        boolean z4;
        String str;
        if (this.mConfig.getMixStreamType() != Config.MixStreamType.NONE && this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.getMixStreamConfig() != null && !TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
            Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
            MixedStreamConfig defaultMixedStreamConfig = MixedStreamConfig.defaultMixedStreamConfig();
            defaultMixedStreamConfig.setRoomID(this.mRtcExtInfo.channelId);
            defaultMixedStreamConfig.setUserID(this.mRtcExtInfo.interactId);
            MixedStreamConfig.MixedStreamVideoConfig videoConfig = defaultMixedStreamConfig.getVideoConfig();
            videoConfig.setBitrate(mixStreamConfig.getVideoBitrate());
            videoConfig.setFps(mixStreamConfig.getVideoFrameRate());
            videoConfig.setWidth(mixStreamConfig.getVideoWidth());
            videoConfig.setHeight(mixStreamConfig.getVideoHeight());
            if (mixStreamConfig.getVideoCodec() == Config.VideoCodec.BYTEVC1) {
                mixedStreamVideoCodecType = MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1;
            } else {
                mixedStreamVideoCodecType = MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
            }
            videoConfig.setVideoCodec(mixedStreamVideoCodecType);
            videoConfig.setGop((int) mixStreamConfig.getVideoGop());
            if (mixStreamConfig.getVideoSupportBFrame().booleanValue() && this.mConfig.isEnableVideoBFrameOnMixStream()) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoConfig.setEnableBframe(z2);
            MixedStreamConfig.MixedStreamAudioConfig audioConfig = defaultMixedStreamConfig.getAudioConfig();
            audioConfig.setChannels(mixStreamConfig.getAudioChannels());
            audioConfig.setSampleRate(mixStreamConfig.getAudioSampleRateValue());
            if (mixStreamConfig.getAudioProfile() == Config.AudioProfile.HE) {
                mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV1;
            } else {
                mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
            }
            audioConfig.setAudioProfile(mixedStreamAudioProfile);
            audioConfig.setBitrate(mixStreamConfig.getAudioBitrate());
            HumanOrientation humanOrientation = new HumanOrientation();
            Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation = this.mixAudienceSpatialAudioOrientation.forward;
            humanOrientation.forward = new Orientation(rTCSpatialAudioOrientation.x, rTCSpatialAudioOrientation.y, rTCSpatialAudioOrientation.z);
            Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation2 = this.mixAudienceSpatialAudioOrientation.right;
            humanOrientation.right = new Orientation(rTCSpatialAudioOrientation2.x, rTCSpatialAudioOrientation2.y, rTCSpatialAudioOrientation2.z);
            Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation3 = this.mixAudienceSpatialAudioOrientation.up;
            humanOrientation.up = new Orientation(rTCSpatialAudioOrientation3.x, rTCSpatialAudioOrientation3.y, rTCSpatialAudioOrientation3.z);
            MixedStreamConfig.MixedStreamSpatialConfig spatialConfig = defaultMixedStreamConfig.getSpatialConfig();
            spatialConfig.setEnableSpatialRender(this.enableMixSpatialAudio);
            Client.RTCSpatialAudioPosition rTCSpatialAudioPosition = this.mixAudienceSpatialAudioPosition;
            spatialConfig.setAudienceSpatialPosition(rTCSpatialAudioPosition.x, rTCSpatialAudioPosition.y, rTCSpatialAudioPosition.z);
            spatialConfig.setAudienceSpatialOrientation(humanOrientation);
            MixedStreamConfig.MixedStreamClientMixConfig clientMixConfig = defaultMixedStreamConfig.getClientMixConfig();
            clientMixConfig.setVideoFormat(MixedStreamConfig.MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_TEXTURE_2D);
            clientMixConfig.setUseAudioMixer(false);
            MixedStreamConfig.MixedStreamSyncControlConfig syncControlConfig = defaultMixedStreamConfig.getSyncControlConfig();
            if (this.mConfig.getChorusCharacter() != Config.ChorusCharacter.NO_USE) {
                z3 = true;
            } else {
                z3 = false;
            }
            syncControlConfig.setEnableSync(z3);
            syncControlConfig.setMaxCacheTimeMs(this.mConfig.syncQueueLengthMs());
            if (this.mConfig.getMixStreamType() == Config.MixStreamType.RTC_CLIENT_MIX) {
                z4 = true;
            } else {
                z4 = false;
            }
            syncControlConfig.setVideoNeedSdkMix(z4);
            if (this.mConfig.getChorusCharacter() == Config.ChorusCharacter.MAIN_SINGER) {
                str = this.mRtcExtInfo.interactId;
            } else {
                str = "";
            }
            syncControlConfig.setBaseUserID(str);
            VideoEncoderConfig videoEncoderConfig = this.videoStreamDescription;
            if (videoEncoderConfig != null) {
                if (videoEncoderConfig.width > 0 && videoEncoderConfig.height > 0) {
                    defaultMixedStreamConfig.getVideoConfig().setWidth(this.videoStreamDescription.width);
                    defaultMixedStreamConfig.getVideoConfig().setHeight(this.videoStreamDescription.height);
                }
                if (this.videoStreamDescription.maxBitrate > 0) {
                    defaultMixedStreamConfig.getVideoConfig().setBitrate(this.videoStreamDescription.maxBitrate);
                }
                if (this.videoStreamDescription.frameRate > 0) {
                    defaultMixedStreamConfig.getVideoConfig().setFps(this.videoStreamDescription.frameRate);
                }
            }
            if (z) {
                mixStreamConfig.updateStreamUrlPriority();
            }
            defaultMixedStreamConfig.setPushURL(mixStreamConfig.getStreamUrl());
            MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
            mixedStreamLayoutConfig.setBackgroundColor(C16880lQ.LLLZ("#%06x", new Object[]{Integer.valueOf(mixStreamConfig.getBackgroundColor())}));
            defaultMixedStreamConfig.setLayout(mixedStreamLayoutConfig);
            return defaultMixedStreamConfig;
        }
        return null;
    }

    public void setStreamPublishedTask(Runnable runnable) {
        this.mTaskOnStreamPublished = runnable;
    }

    public void startLiveTranscoding(MixedStreamConfig mixedStreamConfig) {
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer != null) {
            streamMixer.startMixStream(mixedStreamConfig);
        }
    }

    public void switchMixStreamType(Config.MixStreamType mixStreamType) {
        if (mixStreamType == Config.MixStreamType.CLIENT_MIX) {
            this.mStreamMixer = new ClientStreamMixer(this.mRtcEngine, this);
        } else if (mixStreamType == Config.MixStreamType.SERVER_MIX) {
            this.mStreamMixer = new ServerStreamMixer(this.mRtcEngine, this, this.mCurTaskId);
        } else if (mixStreamType == Config.MixStreamType.RTC_CLIENT_MIX) {
            this.mStreamMixer = new RtcClientStreamMixer(this.mRtcEngine, this);
        }
        LiveRTCInfoMode liveRTCInfoMode = this.mRtcEngineWrapper.getLiveRTCInfoMode();
        if (this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX && liveRTCInfoMode.getServerMixVideoParam() != null && liveRTCInfoMode.getServerMixVideoParam() != LiveRTCInfoMode.LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET) {
            this.videoStreamDescription = liveRTCInfoMode.getServerMixVideoParam();
        }
    }

    public void switchMixType(Config.MixStreamType mixStreamType) {
        if (mixStreamType == this.mConfig.getMixStreamType()) {
            return;
        }
        stopLiveTranscoding();
        this.mConfig.setMixStreamType(mixStreamType);
        this.mClientImpl.setConfig(this.mConfig);
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer != null) {
            this.mPreStreamMixerType = streamMixer.mMixType;
        }
        switchMixStreamType(this.mConfig.getMixStreamType());
        configMixTranscoding();
        if (mixStreamType == Config.MixStreamType.SERVER_MIX) {
            this.mIsSwitchServerMix = true;
            this.mLogService.onPublishStream(0);
        } else {
            if (mixStreamType == Config.MixStreamType.CLIENT_MIX || mixStreamType != Config.MixStreamType.RTC_CLIENT_MIX) {
                return;
            }
            this.mLogService.onPublishStream(0);
        }
    }

    public void updateAuthInfo(JSONObject jSONObject) {
        this.authInfoCache = jSONObject;
    }

    public void updateBgmPlayingStatus(boolean z) {
        this.mBgmIsPlaying = z;
    }

    public void updateLiveTranscoding(MixedStreamConfig mixedStreamConfig) {
        StreamMixer streamMixer = this.mStreamMixer;
        if (streamMixer != null) {
            streamMixer.updateMixStream(mixedStreamConfig);
        }
    }

    private void initStreamMixer(RTCVideo rTCVideo, Config config) {
        Config.MixStreamType mixStreamType = config.getMixStreamType();
        Config.MixStreamType mixStreamType2 = Config.MixStreamType.SERVER_MIX;
        if (mixStreamType == mixStreamType2) {
            this.mStreamMixer = new ServerStreamMixer(rTCVideo, this, this.mCurTaskId);
        } else if (config.getMixStreamType() == Config.MixStreamType.RTC_CLIENT_MIX) {
            this.mStreamMixer = new RtcClientStreamMixer(rTCVideo, this);
        } else if (config.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) {
            this.mStreamMixer = new ClientStreamMixer(rTCVideo, this);
        }
        if (config.getMixStreamType() == mixStreamType2) {
            LiveRTCInfoMode liveRTCInfoMode = this.mRtcEngineWrapper.getLiveRTCInfoMode();
            if (liveRTCInfoMode.getServerMixVideoParam() != null && liveRTCInfoMode.getServerMixVideoParam() != LiveRTCInfoMode.LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET) {
                this.videoStreamDescription = liveRTCInfoMode.getServerMixVideoParam();
            }
        }
    }

    public void convertRegionsToLiveTranscoding(List<Region> list, MixedStreamConfig mixedStreamConfig) {
        double d;
        MixedStreamConfig.MixedStreamMediaType mixedStreamMediaType;
        MixedStreamConfig.MixedStreamLayoutConfig layout = mixedStreamConfig.getLayout();
        MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
        mixedStreamLayoutConfig.setBackgroundColor(layout.getBackgroundColor());
        mixedStreamLayoutConfig.setUserConfigExtraInfo(layout.getUserConfigExtraInfo());
        ArrayList arrayList = new ArrayList();
        for (Region region : list) {
            if (!TextUtils.isEmpty(region.getInteractId())) {
                String interactId = region.getInteractId();
                double x = region.getX();
                double y = region.getY();
                double width = region.getWidth();
                double height = region.getHeight();
                int zorder = region.getZorder();
                if (region.isMuteVideo()) {
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                } else {
                    d = 1.0d;
                }
                MixedStreamConfig.MixedStreamLayoutRegionConfig initTranscodingUser = initTranscodingUser(interactId, x, y, width, height, zorder, d);
                if (region.isMuteAudio()) {
                    mixedStreamMediaType = MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
                } else {
                    mixedStreamMediaType = MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
                }
                initTranscodingUser.setMediaType(mixedStreamMediaType);
                initTranscodingUser.setCornerRadius(region.getCornerRadius());
                int renderMode = region.getRenderMode();
                if (renderMode != 1) {
                    if (renderMode != 2) {
                        if (renderMode != 3) {
                            initTranscodingUser.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN);
                        } else {
                            initTranscodingUser.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE);
                        }
                    } else {
                        initTranscodingUser.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_FIT);
                    }
                } else {
                    initTranscodingUser.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN);
                }
                initTranscodingUser.setSpatialPosition(new Position(region.getSpatialPosX(), region.getSpatialPosY(), region.getSpatialPosZ()));
                initTranscodingUser.setApplySpatialAudio(true);
                arrayList.add(initTranscodingUser);
            }
        }
        mixedStreamLayoutConfig.setRegions((MixedStreamConfig.MixedStreamLayoutRegionConfig[]) arrayList.toArray(new MixedStreamConfig.MixedStreamLayoutRegionConfig[arrayList.size()]));
        mixedStreamConfig.setLayout(mixedStreamLayoutConfig);
    }

    private void onSwitchServerMixEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, int i, int i2) {
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_SUCCESS) {
            this.mInteractListenerProxy.onInfo(this.mClientImpl, 401, i, Integer.valueOf(i2));
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_FAILED) {
            String LJ = KMP.LJ("switch to server mix failed, postprocess error code: ", i);
            this.mLogService.onErrorOccurs(8304, LJ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switch to server mix failed, error_msg");
            LIZ.append(LJ);
            AVLog.iod("StreamMixManager", X1D.LIZIZ(LIZ));
            this.mInteractListenerProxy.onInfo(this.mClientImpl, 401, 8304L, Integer.valueOf(i2));
            Config.MixStreamType mixStreamType = this.mPreStreamMixerType;
            if (mixStreamType != Config.MixStreamType.NONE) {
                this.mClientImpl.switchMixType(mixStreamType);
            }
        }
        this.mIsSwitchServerMix = false;
    }

    public void convertImageRegionsToLiveTranscoding(boolean z, Map<String, Client.RTCWaterMarkRegion> map, MixedStreamConfig mixedStreamConfig) {
        if (map == null || map.size() == 0) {
            return;
        }
        MixedStreamConfig.MixedStreamLayoutConfig layout = mixedStreamConfig.getLayout();
        MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
        mixedStreamLayoutConfig.setBackgroundColor(layout.getBackgroundColor());
        mixedStreamLayoutConfig.setUserConfigExtraInfo(layout.getUserConfigExtraInfo());
        ArrayList arrayList = new ArrayList();
        MixedStreamConfig.MixedStreamLayoutRegionConfig[] regions = layout.getRegions();
        for (MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : regions) {
            arrayList.add(mixedStreamLayoutRegionConfig);
        }
        for (Map.Entry<String, Client.RTCWaterMarkRegion> entry : map.entrySet()) {
            MixedStreamConfig.MixedStreamRenderMode mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_FIT;
            int i = AnonymousClass3.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$RTCWaterMarkRegion$TranscoderImageRenderMode[entry.getValue().getRenderMode().ordinal()];
            if (i != 1) {
                if (i != 2 && i == 3) {
                    mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE;
                }
            } else {
                mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
            }
            MixedStreamConfig.MixedStreamLayoutRegionConfig initTranscodingUser = initTranscodingUser(entry.getKey(), entry.getValue().getX(), entry.getValue().getY(), entry.getValue().getW(), entry.getValue().getH(), entry.getValue().getZorder(), entry.getValue().getAlpha());
            initTranscodingUser.setMediaType(MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY);
            initTranscodingUser.setRenderMode(mixedStreamRenderMode);
            initTranscodingUser.setRegionContentType(MixedStreamConfig.MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE);
            if (z) {
                initTranscodingUser.setImageWaterMarkConfig(new MixedStreamConfig.MixedStreamLayoutRegionConfig.MixedStreamLayoutRegionImageWaterMarkConfig(entry.getValue().getImage().getWidth(), entry.getValue().getImage().getHeight()));
                ByteBuffer allocate = ByteBuffer.allocate(entry.getValue().getImage().getByteCount());
                entry.getValue().getImage().copyPixelsToBuffer(allocate);
                initTranscodingUser.setImageWaterMark(allocate.array());
            }
            arrayList.add(initTranscodingUser);
        }
        mixedStreamLayoutConfig.setRegions((MixedStreamConfig.MixedStreamLayoutRegionConfig[]) arrayList.toArray(new MixedStreamConfig.MixedStreamLayoutRegionConfig[arrayList.size()]));
        mixedStreamConfig.setLayout(mixedStreamLayoutConfig);
    }

    public void onStreamMixEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, int i, int i2) {
        this.mLogService.onStreamStateChange(i, str, 0);
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_MIX_IMAGE_EVENT) {
            this.mInteractListenerProxy.onInfo(this.mClientImpl, 402, i, Integer.valueOf(i2));
            String LIZLLL = C48263Iwt.LIZLLL("image mix failed: ", i, ", mixType: ", i2);
            this.mLogService.onErrorOccurs(8305, LIZLLL);
            AVLog.iod("StreamMixManager", LIZLLL);
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_SINGLE_CHORUS_EVENT) {
            this.mInteractListenerProxy.onInfo(this.mClientImpl, 403, i, Integer.valueOf(i2));
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_SUCCESS) {
            this.mInteractStatics.calcDurationFromLiveToInteract();
            final boolean isServerMixStreamPublishedReceived = this.mClientImpl.isServerMixStreamPublishedReceived();
            if (this.mVPassInteractCfg.interactDelayStopStream == 1) {
                AVLog.logKibana(3, "StreamMixManager", "STREAM_MIXING_START_SUCCESS stop livecore", null);
                this.mClientImpl.onServerMixSuccess();
            }
            if (this.mIsSwitchServerMix) {
                onSwitchServerMixEvent(byteRTCStreamMixingEvent, i, i2);
            }
            if (!this.mClientImpl.mClientStarted || !this.mVPassInteractCfg.enablePushStreamSwitchAfterServerMixStream || this.mTaskOnStreamPublished == null || isServerMixStreamPublishedReceived) {
                return;
            } else {
                this.mConfig.getHandler().post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$1__run$___twin___() {
                        StreamMixManager streamMixManager = StreamMixManager.this;
                        if (streamMixManager.mClientImpl.mClientStarted && streamMixManager.mVPassInteractCfg.enablePushStreamSwitchAfterServerMixStream && !isServerMixStreamPublishedReceived) {
                            AVLog.iod("StreamMixManager", "Received onStreamPublished callback, let livecore to stop push stream");
                            StreamMixManager.this.mClientImpl.setServerMixStreamPublishedReceived(true);
                            Runnable runnable = StreamMixManager.this.mTaskOnStreamPublished;
                            if (runnable != null) {
                                runnable.run();
                            }
                            StreamMixManager.this.mTaskOnStreamPublished = null;
                        }
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_FAILED) {
            if (this.mIsSwitchServerMix) {
                onSwitchServerMixEvent(byteRTCStreamMixingEvent, i, i2);
            } else {
                this.mInternalRtcCallback.onError(i);
            }
        }
    }

    public boolean updateMixStream(final boolean z, final List<Region> list, final boolean z2, final Map<String, Client.RTCWaterMarkRegion> map) {
        int videoWidth;
        int videoHeight;
        int i;
        int i2;
        boolean z3 = false;
        AVLog.debugTrace(new Object[0]);
        Client.StreamMixer streamMixer = this.mConfig.getStreamMixer();
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.getMixStreamType() != Config.MixStreamType.NONE && streamMixer != null) {
            if (!getMixStartState()) {
                AVLog.iow("StreamMixManager", "updateMixStream before startMixStream, return");
                return false;
            }
            Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
            if (this.mConfig.isMixStreamConfigIndependent()) {
                synchronized (mixStreamConfig) {
                    videoWidth = mixStreamConfig.getVideoWidth();
                    videoHeight = mixStreamConfig.getVideoHeight();
                }
            } else {
                videoWidth = mixStreamConfig.getVideoWidth();
                videoHeight = mixStreamConfig.getVideoHeight();
            }
            VideoEncoderConfig videoEncoderConfig = this.videoStreamDescription;
            if (videoEncoderConfig != null && (i = videoEncoderConfig.width) > 0 && (i2 = videoEncoderConfig.height) > 0) {
                videoHeight = i2;
                videoWidth = i;
            }
            final String mixStream = streamMixer.mixStream(videoWidth, videoHeight, list);
            StringBuilder LIZIZ = C25620zW.LIZIZ("updateMixStream mixStream result: sei", mixStream, ", region:");
            LIZIZ.append(convertMixStreamLayout(list));
            AVLog.iow("StreamMixManager", X1D.LIZIZ(LIZIZ));
            configureSpatialAudioParams(list);
            if (list != null && !list.isEmpty()) {
                if (InteractThreadUtils.getWorkThreadHandler() != null) {
                    InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixManager.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$2__run$___twin___() {
                            StreamMixer streamMixer2 = StreamMixManager.this.mStreamMixer;
                            if (streamMixer2 != null) {
                                streamMixer2.updateMixStream(list, mixStream, z, z2, map);
                            }
                        }

                        public static void com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                            boolean LIZ;
                            try {
                                anonymousClass2.com_ss_avframework_livestreamv2_core_interact_mixer_StreamMixManager$2__run$___twin___();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                }
                if (this.mLogService != null) {
                    InteractConfig interactConfig = this.mConfig;
                    if (interactConfig != null && interactConfig.getScene() == Config.LinkMicScene.CO_HOST) {
                        z3 = true;
                    }
                    InteractLogService interactLogService = this.mLogService;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(convertMixStreamLayout(list));
                    LIZ.append(", enableSpatailAudio: ");
                    LIZ.append(this.enableMixSpatialAudio);
                    LIZ.append(", isCohost: ");
                    LIZ.append(z3);
                    interactLogService.onRtcUpdateLayout(X1D.LIZIZ(LIZ));
                }
                return true;
            }
        }
        return false;
    }

    private MixedStreamConfig.MixedStreamLayoutRegionConfig initTranscodingUser(String str, double d, double d2, double d3, double d4, int i, double d5) {
        MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig = new MixedStreamConfig.MixedStreamLayoutRegionConfig();
        mixedStreamLayoutRegionConfig.setUserID(str);
        mixedStreamLayoutRegionConfig.setLocationX(d);
        mixedStreamLayoutRegionConfig.setLocationY(d2);
        mixedStreamLayoutRegionConfig.setWidthProportion(d3);
        mixedStreamLayoutRegionConfig.setHeightProportion(d4);
        mixedStreamLayoutRegionConfig.setZOrder(i);
        mixedStreamLayoutRegionConfig.setAlpha(d5);
        if (str.equals(this.mRtcExtInfo.interactId)) {
            mixedStreamLayoutRegionConfig.setIsLocalUser(true);
        }
        if (!TextUtils.isEmpty(this.roomId)) {
            mixedStreamLayoutRegionConfig.setRoomID(this.roomId);
        }
        return mixedStreamLayoutRegionConfig;
    }

    public StreamMixManager(ClientImpl clientImpl, InteractConfig interactConfig, RTCVideo rTCVideo, InteractLogService interactLogService, IInteractStatics iInteractStatics, VPassInteractCfg vPassInteractCfg, IRTCVideoEventHandler iRTCVideoEventHandler, LiveRTCExtInfo liveRTCExtInfo, InteractEngineImpl interactEngineImpl, Client.Listener listener, RTCEngineWrapper rTCEngineWrapper) {
        this.mClientImpl = clientImpl;
        this.mConfig = interactConfig;
        this.mRtcEngine = rTCVideo;
        this.mLogService = interactLogService;
        this.mInteractStatics = iInteractStatics;
        this.mVPassInteractCfg = vPassInteractCfg;
        this.mInternalRtcCallback = iRTCVideoEventHandler;
        this.mRtcExtInfo = liveRTCExtInfo;
        this.mInteractEngine = interactEngineImpl;
        this.mBuilder = interactEngineImpl.getBuilder();
        this.mInteractListenerProxy = listener;
        this.mRtcEngineWrapper = rTCEngineWrapper;
        this.mCurTaskId = liveRTCExtInfo.mixStreamTaskId;
        if (interactConfig.isMixStreamConfigIndependent() && TextUtils.isEmpty(this.mCurTaskId)) {
            this.mCurTaskId = interactConfig.getMixStreamConfig().getTaskId();
        }
        initStreamMixer(rTCVideo, this.mConfig);
    }
}
