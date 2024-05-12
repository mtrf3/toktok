package com.ss.avframework.livestreamv2.core.interact.mixer;

import X.C16880lQ;
import X.C22510uV;
import X.X1D;
import X.YE1;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.realx.video.YuvHelper;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.ClientImpl;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl;
import com.ss.avframework.livestreamv2.core.interact.InteractVideoSink;
import com.ss.avframework.livestreamv2.core.interact.InteractVideoSinkFactory;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCExtInfo;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.avframework.livestreamv2.core.interact.utils.InteractThreadUtils;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingType;
import com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.MixedStreamType;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ClientStreamMixer extends StreamMixer {
    public static HandlerThread mMixThread;
    public static Handler mMixThreadHandler;
    public long countMixVideoDeliver;
    public long countMixVideoReceive;
    public boolean isSetAudioStream;
    public boolean isSetVideoStream;
    public InteractEngineBuilder mBuilder;
    public long mChorusAudioTimeStampMs;
    public AudioDeviceModule.AudioRenderSink mChorusSink;
    public ClientImpl mClientImpl;
    public InteractConfig mConfig;
    public Map<String, IInputVideoStream> mImgStream;
    public InteractEngineImpl mInteractEngine;
    public boolean mIsSingleChorusStarted;
    public LiveCore mLiveCore;
    public Map<String, IInputVideoStream> mMixVideoStreamMap;
    public long mOriginAudioTs;
    public long mOriginRemoteAudioTs;
    public int mRegionCount;
    public RTCVideo mRtcEngine;
    public LiveRTCExtInfo mRtcExtInfo;
    public VideoMixer.VideoMixerDescription mSelfVideoMixerDescription;
    public StreamMixManager mStreamMixManager;
    public String mTaskId;
    public final String TAG = "ClientStreamMixer";
    public int audioSampleSize = 44100;
    public int audioChannels = 2;

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.mixer.ClientStreamMixer$5, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass5 {
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

    private void stopChorus() {
        if (mMixThreadHandler == null) {
            AVLog.iow("ClientStreamMixer", "stopChorus mMixThreadHandler is null, why");
        }
        AVLog.iow("ClientStreamMixer", "call stopChorus");
        if (!this.mConfig.getChorusOnlySendPts()) {
            LiveCore liveCore = this.mBuilder.getLiveCore();
            if (liveCore != null) {
                liveCore.setOnlyAddSeiToRTC(false);
                LiveCoreKaraokFilter liveCoreKaraokFilter = (LiveCoreKaraokFilter) liveCore.getAudioFilterMgr();
                if (liveCoreKaraokFilter != null) {
                    liveCoreKaraokFilter.setChorusMode(false);
                }
            }
            AVLog.ioi("ClientStreamMixer", "resume remote video sink");
            Iterator<Map.Entry<String, InteractVideoSink>> it = ((InteractVideoSinkFactory) this.mClientImpl.getmVideoSinkFactory()).getAllVideoSink().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().pausePushVideo(false);
            }
        }
        this.mRtcEngine.stopPushStreamToCDN(this.mTaskId);
        Handler handler = mMixThreadHandler;
        if (handler != null && handler.getLooper() != null) {
            mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ClientStreamMixer.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$2__run$___twin___() {
                    ClientStreamMixer clientStreamMixer = ClientStreamMixer.this;
                    if (clientStreamMixer.isSetVideoStream) {
                        clientStreamMixer.isSetVideoStream = false;
                        clientStreamMixer.resetInputVideoStream();
                    }
                    ClientStreamMixer clientStreamMixer2 = ClientStreamMixer.this;
                    if (clientStreamMixer2.isSetAudioStream) {
                        clientStreamMixer2.isSetAudioStream = false;
                        clientStreamMixer2.resetChorusAudioChange();
                        AudioDeviceModule.AudioRenderSink audioRenderSink = ClientStreamMixer.this.mChorusSink;
                        if (audioRenderSink != null) {
                            audioRenderSink.release();
                            ClientStreamMixer.this.mChorusSink = null;
                        }
                    }
                    ClientStreamMixer.mMixThreadHandler = null;
                    HandlerThread handlerThread = ClientStreamMixer.mMixThread;
                    ClientStreamMixer.mMixThread = null;
                    if (handlerThread != null) {
                        try {
                            handlerThread.quitSafely();
                        } catch (Throwable unused) {
                            handlerThread.quit();
                        }
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void initInputVideoStream() {
        if (this.mLiveCore != null) {
            AVLog.ioi("ClientStreamMixer", "clear local video sink");
            this.mLiveCore.getOriginInputVideoStream().getMixerDescription().setVisibility(false);
            this.mLiveCore.getOriginInputVideoStream().setMixerDescription(VideoMixer.VideoMixerDescription.INVISIABLE());
        }
        AVLog.ioi("ClientStreamMixer", "clear remote video sink");
        Iterator<Map.Entry<String, InteractVideoSink>> it = ((InteractVideoSinkFactory) this.mClientImpl.getmVideoSinkFactory()).getAllVideoSink().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setIsChorusSinger(true);
        }
    }

    public void removeAllInputImgStream() {
        Map<String, IInputVideoStream> map = this.mImgStream;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, IInputVideoStream> entry : this.mImgStream.entrySet()) {
                entry.getValue().getMixerDescription().flags = 8L;
                entry.getValue().release();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("IInputVideoStream stop: ");
                LIZ.append(entry.getKey());
                AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ));
            }
            this.mImgStream.clear();
        }
    }

    public void resetChorusAudioChange() {
        AVLog.ioi("ClientStreamMixer", "reset Chorus Audio Change");
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore != null) {
            AudioDeviceModule adm = liveCore.getADM();
            if (adm != null) {
                adm.enableRemoteAudio(true);
                adm.enableLocalRecord(true);
            }
            IFilterManager videoFilterMgr = liveCore.getVideoFilterMgr();
            if (videoFilterMgr != null) {
                videoFilterMgr.setRenderSinkOnlyMixWithRTC(false);
            }
            IAudioFilterManager audioFilterMgr = liveCore.getAudioFilterMgr();
            if (audioFilterMgr != null) {
                audioFilterMgr.setOnlyMixWithRTC(false);
            }
        }
    }

    public void resetInputVideoStream() {
        AVLog.ioi("ClientStreamMixer", "reset remote video sink");
        Iterator<Map.Entry<String, InteractVideoSink>> it = ((InteractVideoSinkFactory) this.mClientImpl.getmVideoSinkFactory()).getAllVideoSink().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setIsChorusSinger(false);
        }
        Map<String, IInputVideoStream> map = this.mMixVideoStreamMap;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, IInputVideoStream> entry : this.mMixVideoStreamMap.entrySet()) {
                entry.getValue().getMixerDescription().flags = 8L;
                entry.getValue().release();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("IInputVideoStream stop: ");
                LIZ.append(entry.getKey());
                AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ));
            }
            this.mMixVideoStreamMap.clear();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void stopMixStream() {
        super.stopMixStream();
        removeAllInputImgStream();
        if (this.mIsSingleChorusStarted) {
            this.mIsSingleChorusStarted = false;
            stopChorus();
        }
    }

    public boolean getChorusReadyState() {
        return this.isSetVideoStream;
    }

    private void composeSei(String str) {
        int videoWidth;
        int videoHeight;
        String str2;
        try {
            LiveCore liveCore = this.mBuilder.getLiveCore();
            if (liveCore == null) {
                return;
            }
            if (this.mClientImpl.mSeiCleared) {
                AVLog.ioe("ClientStreamMixer", "Interact sei already cleared, don't add again!");
                return;
            }
            if (this.mConfig.getUpdateTalkSeiAB()) {
                if (str != null) {
                    str2 = str;
                } else {
                    str2 = "";
                }
                liveCore.addSeiField("app_data", str2, 1, false, false);
                liveCore.addSeiField("ts", Long.valueOf(System.currentTimeMillis()), 1, false, true);
            }
            if (this.mConfig.getMixStreamConfig() != null) {
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
                liveCore.addSeiField("canvas", new JSONObject().put("w", videoWidth).put("h", videoHeight).put("bgnd", this.mConfig.getMixStreamConfig().getBackgroundColorString()), -1);
            }
            if (str == null) {
                str = "";
            }
            liveCore.addSeiField("app_data", str, -1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LiveCore_Android_MixStream_");
            LIZ.append(this.mRtcExtInfo.vendorName);
            liveCore.addSeiField("source", X1D.LIZIZ(LIZ), -1);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    private void pushImageFrame(Map.Entry<String, Client.RTCWaterMarkRegion> entry) {
        Client.RTCWaterMarkRegion value = entry.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("image origin width: ");
        LIZ.append(value.getImage().getWidth());
        LIZ.append(", origin height: ");
        LIZ.append(value.getImage().getHeight());
        AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ));
        int width = ((value.getImage().getWidth() + 1) / 2) * 2;
        int height = ((value.getImage().getHeight() + 1) / 2) * 2;
        int i = width * height;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i * 3) / 2);
        int[] iArr = new int[i];
        value.getImage().getPixels(iArr, 0, width, 0, 0, value.getImage().getWidth(), value.getImage().getHeight());
        convertArgb8888ToI420(allocateDirect, iArr, width, height);
        allocateDirect.position(0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("image adjust width: ");
        LIZ2.append(width);
        LIZ2.append(", origin height: ");
        LIZ2.append(height);
        AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ2));
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.setLeft(value.getX());
        videoMixerDescription.setTop(value.getY());
        videoMixerDescription.setRight(value.getW() + value.getX());
        videoMixerDescription.setBottom(value.getH() + value.getY());
        videoMixerDescription.setzOrder(value.getZorder());
        if (AnonymousClass5.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$RTCWaterMarkRegion$TranscoderImageRenderMode[value.getRenderMode().ordinal()] != 1) {
            videoMixerDescription.setMode(1);
        } else {
            videoMixerDescription.setMode(2);
        }
        IInputVideoStream iInputVideoStream = this.mImgStream.get(entry.getKey());
        if (iInputVideoStream != null) {
            iInputVideoStream.setMixerDescription(videoMixerDescription);
            iInputVideoStream.pushVideoFrame(allocateDirect, width, height, 0, System.currentTimeMillis() * 1000);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IInputVideoStream pushVideoFrame");
            LIZ3.append(entry.getKey());
            AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ3));
        }
    }

    private void startChorus(MixedStreamConfig mixedStreamConfig) {
        if (this.mIsSingleChorusStarted) {
            AVLog.iow("ClientStreamMixer", "chorus has call start");
            return;
        }
        AVLog.iow("ClientStreamMixer", "call startChorus");
        if (mMixThread == null) {
            HandlerThread handlerThread = new HandlerThread("InteractMixThread", TTLSThreadConfigHelper.getPriority("InteractMixThread", 0));
            mMixThread = handlerThread;
            handlerThread.start();
            mMixThreadHandler = new Handler(mMixThread.getLooper());
        }
        mixedStreamConfig.setExpectedMixingType(ByteRTCStreamMixingType.STREAM_MIXING_BY_CLIENT);
        Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        this.audioChannels = mixStreamConfig.getAudioChannels();
        this.audioSampleSize = mixStreamConfig.getAudioSampleRateValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveTranscoding ");
        LIZ.append(mixedStreamConfig.getTranscodeMessage().toString());
        AVLog.iod("ClientStreamMixer", X1D.LIZIZ(LIZ));
        this.countMixVideoReceive = 0L;
        this.countMixVideoDeliver = 0L;
        if (!this.isSetAudioStream && this.mConfig.getChorusCharacter() != Config.ChorusCharacter.NO_USE && !this.mConfig.getChorusOnlySendPts()) {
            this.isSetAudioStream = true;
            LiveCore liveCore = this.mBuilder.getLiveCore();
            if (liveCore != null) {
                liveCore.setOnlyAddSeiToRTC(true);
                LiveCoreKaraokFilter liveCoreKaraokFilter = (LiveCoreKaraokFilter) liveCore.getAudioFilterMgr();
                if (liveCoreKaraokFilter != null) {
                    liveCoreKaraokFilter.setChorusMode(true);
                }
                AudioDeviceModule adm = liveCore.getADM();
                if (adm != null) {
                    adm.enableLocalRecord(false);
                    adm.enableRemoteAudio(false);
                    if (this.mChorusSink == null) {
                        AudioDeviceModule.AudioRenderSink createRenderSink = adm.createRenderSink();
                        this.mChorusSink = createRenderSink;
                        createRenderSink.setQuirks(2L);
                        this.mChorusSink.enableMix2Output(false);
                    }
                }
                IFilterManager videoFilterMgr = liveCore.getVideoFilterMgr();
                if (videoFilterMgr != null) {
                    videoFilterMgr.setRenderSinkOnlyMixWithRTC(true);
                }
                IAudioFilterManager audioFilterMgr = liveCore.getAudioFilterMgr();
                if (audioFilterMgr != null) {
                    audioFilterMgr.setOnlyMixWithRTC(true);
                }
            }
            AVLog.ioi("ClientStreamMixer", "pause remote video sink");
            Iterator<Map.Entry<String, InteractVideoSink>> it = ((InteractVideoSinkFactory) this.mClientImpl.getmVideoSinkFactory()).getAllVideoSink().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().pausePushVideo(true);
            }
        }
        this.mRtcEngine.startPushMixedStreamToCDN(this.mTaskId, mixedStreamConfig, new IMixedStreamObserver() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ClientStreamMixer.1
            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public boolean isSupportClientPushStream() {
                return true;
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingDataFrame(String str, byte[] bArr, long j) {
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingVideoFrame(String str, VideoFrame videoFrame) {
                videoFrame.release();
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingAudioFrame(String str, final byte[] bArr, int i, final long j) {
                Handler handler;
                if (ClientStreamMixer.this.mConfig.getChorusCharacter() == Config.ChorusCharacter.NO_USE || ClientStreamMixer.this.mConfig.getChorusOnlySendPts() || (handler = ClientStreamMixer.mMixThreadHandler) == null || handler.getLooper() == null) {
                    return;
                }
                ClientStreamMixer.mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ClientStreamMixer.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$1__run$___twin___() {
                        ClientStreamMixer clientStreamMixer = ClientStreamMixer.this;
                        if (!clientStreamMixer.mIsSingleChorusStarted) {
                            return;
                        }
                        long j2 = clientStreamMixer.mChorusAudioTimeStampMs;
                        if (j2 == 0) {
                            clientStreamMixer.mChorusAudioTimeStampMs = TimeUtils.nativeNanoTime() / 1000000;
                            ClientStreamMixer clientStreamMixer2 = ClientStreamMixer.this;
                            clientStreamMixer2.mOriginAudioTs = clientStreamMixer2.mChorusAudioTimeStampMs;
                            clientStreamMixer2.mOriginRemoteAudioTs = j;
                        } else {
                            clientStreamMixer.mChorusAudioTimeStampMs = j2 + 10;
                        }
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                        allocateDirect.put(bArr);
                        ClientStreamMixer clientStreamMixer3 = ClientStreamMixer.this;
                        AudioDeviceModule.AudioRenderSink audioRenderSink = clientStreamMixer3.mChorusSink;
                        if (audioRenderSink != null) {
                            int i2 = clientStreamMixer3.audioSampleSize;
                            audioRenderSink.onData(allocateDirect, i2 / 100, i2, clientStreamMixer3.audioChannels, (clientStreamMixer3.mOriginAudioTs + j) - clientStreamMixer3.mOriginRemoteAudioTs);
                        }
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00361 runnableC00361) {
                        boolean LIZ2;
                        try {
                            runnableC00361.com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$1__run$___twin___();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, MixedStreamType mixedStreamType) {
                if (byteRTCStreamMixingEvent == null || mixedStreamType == null) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Received onStreamMixingEvent, eventType: ");
                YE1.LIZLLL(LIZ2, byteRTCStreamMixingEvent.toString(), " taskId: ", str, " error: ");
                LIZ2.append(byteRTCTranscoderErrorCode);
                LIZ2.append(" mixType: ");
                LIZ2.append(mixedStreamType.toString());
                AVLog.iod("ClientStreamMixer", X1D.LIZIZ(LIZ2));
                AVLog.debugTrace(byteRTCStreamMixingEvent, str, byteRTCTranscoderErrorCode, mixedStreamType);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("mix event: ");
                YE1.LIZLLL(LIZ3, byteRTCStreamMixingEvent.toString(), ", taskId: ", str, ", error: ");
                LIZ3.append(byteRTCTranscoderErrorCode.toString());
                LIZ3.append(", mixType: ");
                LIZ3.append(mixedStreamType.toString());
                String LIZIZ = X1D.LIZIZ(LIZ3);
                if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_UPDATE) {
                    return;
                }
                ClientStreamMixer.this.mStreamMixManager.onStreamMixEvent(byteRTCStreamMixingEvent, LIZIZ, byteRTCTranscoderErrorCode.value(), mixedStreamType.value());
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onCacheSyncVideoFrames(String str, final String[] strArr, final VideoFrame[] videoFrameArr, final byte[][] bArr, final int i) {
                if (ClientStreamMixer.this.mConfig.getChorusCharacter() != Config.ChorusCharacter.NO_USE && !ClientStreamMixer.this.mConfig.getChorusOnlySendPts()) {
                    ClientStreamMixer clientStreamMixer = ClientStreamMixer.this;
                    long j = clientStreamMixer.countMixVideoReceive;
                    if (j <= clientStreamMixer.countMixVideoDeliver && clientStreamMixer.mIsSingleChorusStarted) {
                        clientStreamMixer.countMixVideoReceive = j + i;
                        final long nativeNanoTime = TimeUtils.nativeNanoTime();
                        Handler handler = ClientStreamMixer.mMixThreadHandler;
                        if (handler != null && handler.getLooper() != null) {
                            ClientStreamMixer.mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ClientStreamMixer.1.2
                                public void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$2__run$___twin___() {
                                    int i2 = 0;
                                    int i3 = 0;
                                    while (i3 < i) {
                                        VideoFrame videoFrame = videoFrameArr[i3];
                                        if (!ClientStreamMixer.this.mMixVideoStreamMap.containsKey(strArr[i3])) {
                                            videoFrame.release();
                                            ClientStreamMixer.this.countMixVideoDeliver++;
                                        } else {
                                            int width = (((videoFrame.getWidth() + 8) - 1) / 8) * 8;
                                            int height = (((videoFrame.getHeight() + 4) - 1) / 4) * 4;
                                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((((width + 1) / 2) * ((height + 1) / 2) * 2) + (width * height));
                                            if (videoFrame.getPixelFormat() != VideoPixelFormat.I420) {
                                                videoFrame.release();
                                                ClientStreamMixer.this.countMixVideoDeliver++;
                                            } else {
                                                YuvHelper.I420Copy(videoFrame.getPlaneData(i2), videoFrame.getPlaneStride(i2), videoFrame.getPlaneData(1), videoFrame.getPlaneStride(1), videoFrame.getPlaneData(2), videoFrame.getPlaneStride(2), allocateDirect, width, height);
                                                allocateDirect.position(i2);
                                                if (ClientStreamMixer.this.mMixVideoStreamMap.containsKey(strArr[i3])) {
                                                    ClientStreamMixer.this.mMixVideoStreamMap.get(strArr[i3]).pushVideoFrame(allocateDirect, width, height, i2, nativeNanoTime / 1000);
                                                }
                                                ClientStreamMixer clientStreamMixer2 = ClientStreamMixer.this;
                                                if (!clientStreamMixer2.isSetVideoStream) {
                                                    clientStreamMixer2.initInputVideoStream();
                                                    ClientStreamMixer.this.isSetVideoStream = true;
                                                }
                                                videoFrame.release();
                                                ClientStreamMixer clientStreamMixer3 = ClientStreamMixer.this;
                                                clientStreamMixer3.countMixVideoDeliver++;
                                                LiveCore liveCore2 = clientStreamMixer3.mBuilder.getLiveCore();
                                                if (liveCore2 != null) {
                                                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr[i3].length);
                                                    allocateDirect2.put(bArr[i3]);
                                                    allocateDirect2.rewind();
                                                    String nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(i2, allocateDirect2);
                                                    if (nativeParseStringFromByteBuffer != null) {
                                                        if (strArr[i3].equals(ClientStreamMixer.this.mRtcExtInfo.interactId)) {
                                                            try {
                                                                if (new JSONObject(nativeParseStringFromByteBuffer).has("ktv_sei")) {
                                                                    ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(nativeParseStringFromByteBuffer.getBytes().length);
                                                                    allocateDirect3.put(nativeParseStringFromByteBuffer.getBytes());
                                                                    allocateDirect3.rewind();
                                                                    StringBuilder LIZ2 = X1D.LIZ();
                                                                    LIZ2.append(strArr[i3]);
                                                                    LIZ2.append(":send sei:");
                                                                    LIZ2.append(nativeParseStringFromByteBuffer);
                                                                    AVLog.iow("ClientStreamMixer", X1D.LIZIZ(LIZ2));
                                                                    try {
                                                                        liveCore2.pushRtcSeiData(9999, strArr[i3], 0, 0, 0, null, 0, nativeNanoTime / 1000000, allocateDirect3);
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        C16880lQ.LLLLIIL(e);
                                                                        i3++;
                                                                        i2 = 0;
                                                                    }
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                            }
                                                        } else if (ClientStreamMixer.this.mConfig.getChorusCharacter() == Config.ChorusCharacter.OTHER_SINGER) {
                                                            try {
                                                                if (new JSONObject(nativeParseStringFromByteBuffer).has("ktv_sei")) {
                                                                    ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(nativeParseStringFromByteBuffer.getBytes().length);
                                                                    allocateDirect4.put(nativeParseStringFromByteBuffer.getBytes());
                                                                    allocateDirect4.rewind();
                                                                    StringBuilder LIZ3 = X1D.LIZ();
                                                                    LIZ3.append(strArr[i3]);
                                                                    LIZ3.append(":send sei:");
                                                                    LIZ3.append(nativeParseStringFromByteBuffer);
                                                                    AVLog.iow("ClientStreamMixer", X1D.LIZIZ(LIZ3));
                                                                    liveCore2.pushRtcSeiData(9999, strArr[i3], 0, 0, 0, null, 0, nativeNanoTime / 1000000, allocateDirect4);
                                                                }
                                                            } catch (Exception e3) {
                                                                C16880lQ.LLLLIIL(e3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i3++;
                                        i2 = 0;
                                    }
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                }

                                public static void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                                    boolean LIZ2;
                                    try {
                                        anonymousClass2.com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$1$2__run$___twin___();
                                    } finally {
                                        if (LIZ2) {
                                        }
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                for (int i2 = 0; i2 < i; i2++) {
                    videoFrameArr[i2].release();
                }
            }
        });
    }

    private void updateAudioSpatialInfo(List<Region> list) {
        Client.RTCSpatialAudioPosition mixAudienceSpatialAudioPosition = this.mStreamMixManager.getMixAudienceSpatialAudioPosition();
        Client.RTCSpatialAudioHumanOrientation mixAudienceSpatialAudioOrientation = this.mStreamMixManager.getMixAudienceSpatialAudioOrientation();
        boolean enableMixSpatialAudio = this.mStreamMixManager.getEnableMixSpatialAudio();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(mixAudienceSpatialAudioOrientation.forward.x);
            jSONArray.put(mixAudienceSpatialAudioOrientation.forward.y);
            jSONArray.put(mixAudienceSpatialAudioOrientation.forward.z);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(mixAudienceSpatialAudioOrientation.right.x);
            jSONArray2.put(mixAudienceSpatialAudioOrientation.right.y);
            jSONArray2.put(mixAudienceSpatialAudioOrientation.right.z);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(mixAudienceSpatialAudioOrientation.up.x);
            jSONArray3.put(mixAudienceSpatialAudioOrientation.up.y);
            jSONArray3.put(mixAudienceSpatialAudioOrientation.up.z);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("forward", jSONArray);
            jSONObject3.put("right", jSONArray2);
            jSONObject3.put("up", jSONArray3);
            JSONArray jSONArray4 = new JSONArray();
            jSONArray4.put(mixAudienceSpatialAudioPosition.x);
            jSONArray4.put(mixAudienceSpatialAudioPosition.y);
            jSONArray4.put(mixAudienceSpatialAudioPosition.z);
            JSONArray jSONArray5 = new JSONArray();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    Region region = (Region) ListProtector.get(list, i);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray6 = new JSONArray();
                    jSONArray6.put(region.getSpatialPosX());
                    jSONArray6.put(region.getSpatialPosY());
                    jSONArray6.put(region.getSpatialPosZ());
                    jSONObject4.put("user_id", region.getInteractId());
                    jSONObject4.put("position", jSONArray6);
                    jSONArray5.put(jSONObject4);
                }
            }
            jSONObject2.put("audience_spatial_orientation", jSONObject3);
            jSONObject2.put("audience_spatial_position", jSONArray4);
            jSONObject2.put("enable_spatial_render", enableMixSpatialAudio);
            jSONObject2.put("users_info", jSONArray5);
            jSONObject.put("rtc.client_mix_spatia_info", jSONObject2);
            this.mRtcEngine.setRuntimeParameters(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    private void updateVideoMixRegions(final List<Region> list) {
        Handler handler = mMixThreadHandler;
        if (handler != null && handler.getLooper() != null) {
            mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ClientStreamMixer.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$3__run$___twin___() {
                    LiveCore liveCore;
                    List list2 = list;
                    if (list2 != null && list2.size() > 0) {
                        for (Region region : list) {
                            String interactId = region.getInteractId();
                            if (!ClientStreamMixer.this.mMixVideoStreamMap.containsKey(interactId) && (liveCore = ClientStreamMixer.this.mBuilder.getLiveCore()) != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("MixVideoId-");
                                LIZ.append(region.getInteractId());
                                IInputVideoStream createInputVideoStream = liveCore.createInputVideoStream(X1D.LIZIZ(LIZ));
                                if (createInputVideoStream == null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("IInputVideoStream create failed");
                                    LIZ2.append(interactId);
                                    AVLog.iow("ClientStreamMixer", X1D.LIZIZ(LIZ2));
                                } else {
                                    ClientStreamMixer.this.mMixVideoStreamMap.put(interactId, createInputVideoStream);
                                    createInputVideoStream.start();
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("IInputVideoStream create");
                                    LIZ3.append(interactId);
                                    AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ3));
                                }
                            }
                            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
                            videoMixerDescription.setLeft((float) region.getX());
                            videoMixerDescription.setTop((float) region.getY());
                            videoMixerDescription.setRight((float) (region.getWidth() + region.getX()));
                            videoMixerDescription.setBottom((float) (region.getHeight() + region.getY()));
                            videoMixerDescription.setzOrder(region.getZorder());
                            if (region.getRenderMode() != 1) {
                                videoMixerDescription.setMode(1);
                            } else {
                                videoMixerDescription.setMode(2);
                            }
                            IInputVideoStream iInputVideoStream = ClientStreamMixer.this.mMixVideoStreamMap.get(interactId);
                            if (iInputVideoStream != null) {
                                iInputVideoStream.setMixerDescription(videoMixerDescription);
                            }
                        }
                    }
                    HashSet hashSet = new HashSet();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((Region) it.next()).getInteractId());
                    }
                    Iterator<Map.Entry<String, IInputVideoStream>> it2 = ClientStreamMixer.this.mMixVideoStreamMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<String, IInputVideoStream> next = it2.next();
                        if (!hashSet.contains(next.getKey())) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("IInputVideoStream stop");
                            LIZ4.append(next.getKey());
                            AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ4));
                            IInputVideoStream value = next.getValue();
                            if (value != null) {
                                value.getMixerDescription().flags = 8L;
                                value.release();
                            }
                            it2.remove();
                        }
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void addImageInputStream(String str) {
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (!this.mImgStream.containsKey(str) && liveCore != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MixImageId-");
            LIZ.append(str);
            IInputVideoStream createInputVideoStream = liveCore.createInputVideoStream(X1D.LIZIZ(LIZ));
            if (createInputVideoStream == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IInputVideoStream create null");
                LIZ2.append(str);
                AVLog.iow("ClientStreamMixer", X1D.LIZIZ(LIZ2));
                return;
            }
            this.mImgStream.put(str, createInputVideoStream);
            createInputVideoStream.start();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IInputVideoStream create");
            LIZ3.append(str);
            AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ3));
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void startMixStream(MixedStreamConfig mixedStreamConfig) {
        super.startMixStream(mixedStreamConfig);
        this.mClientImpl.composeCurrentWaterMarks();
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void updateMixStream(MixedStreamConfig mixedStreamConfig) {
        mixedStreamConfig.setExpectedMixingType(ByteRTCStreamMixingType.STREAM_MIXING_BY_CLIENT);
        this.mRtcEngine.updatePushMixedStreamToCDN(this.mTaskId, mixedStreamConfig);
    }

    public ClientStreamMixer(RTCVideo rTCVideo, StreamMixManager streamMixManager) {
        this.mRtcEngine = rTCVideo;
        this.mStreamMixManager = streamMixManager;
        this.mMixType = Config.MixStreamType.CLIENT_MIX;
        this.mBuilder = streamMixManager.getEngineBuilder();
        this.mConfig = this.mStreamMixManager.getInteractConfig();
        this.mClientImpl = this.mStreamMixManager.getClient();
        this.mInteractEngine = this.mStreamMixManager.getInteractEngine();
        this.mRtcExtInfo = this.mStreamMixManager.getRtcExtInfo();
        this.mImgStream = new HashMap();
        this.mTaskId = "";
        InteractEngineBuilder interactEngineBuilder = this.mBuilder;
        if (interactEngineBuilder != null) {
            this.mLiveCore = interactEngineBuilder.getLiveCore();
        }
        this.mMixVideoStreamMap = new HashMap();
    }

    public static void convertArgb8888ToI420(ByteBuffer byteBuffer, int[] iArr, int i, int i2) {
        int i3;
        int i4 = i * i2;
        int i5 = (i4 * 5) / 4;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = iArr[i7];
                int i11 = (16711680 & i10) >> 16;
                int i12 = (65280 & i10) >> 8;
                int i13 = (i10 & 255) >> 0;
                int LIZ = (C22510uV.LIZ(i13, 25, (i12 * 129) + (i11 * 66), 128) >> 8) + 16;
                int LIZ2 = (C22510uV.LIZ(i13, 112, (i11 * (-38)) - (i12 * 74), 128) >> 8) + 128;
                int i14 = (((((i11 * 112) - (i12 * 94)) - (i13 * 18)) + 128) >> 8) + 128;
                int i15 = i6 + 1;
                if (LIZ < 0) {
                    LIZ = 0;
                } else if (LIZ > 255) {
                    LIZ = 255;
                }
                byteBuffer.put(i6, (byte) LIZ);
                if (i8 % 2 == 0 && i9 % 2 == 0) {
                    int i16 = i4 + 1;
                    if (LIZ2 < 0) {
                        LIZ2 = 0;
                        i3 = 255;
                    } else {
                        i3 = 255;
                        if (LIZ2 > 255) {
                            LIZ2 = 255;
                        }
                    }
                    byteBuffer.put(i4, (byte) LIZ2);
                    int i17 = i5 + 1;
                    if (i14 < 0) {
                        i14 = 0;
                    } else if (i14 > i3) {
                        i14 = 255;
                    }
                    byteBuffer.put(i5, (byte) i14);
                    i5 = i17;
                    i4 = i16;
                }
                i7++;
                i9++;
                i6 = i15;
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void updateMixStream(final List<Region> list, final String str, final boolean z, final boolean z2, final Map<String, Client.RTCWaterMarkRegion> map) {
        boolean z3;
        VideoMixer.VideoMixerDescription mixerDescription;
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (this.mConfig.getCharacter() != Config.Character.ANCHOR || this.mConfig.getMixStreamType() != Config.MixStreamType.CLIENT_MIX || liveCore == null || InteractThreadUtils.getWorkThreadHandler() == null) {
            return;
        }
        if (C16880lQ.LLLLIIIILLL() != InteractThreadUtils.getWorkThreadHandler().getLooper().getThread()) {
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.ClientStreamMixer.4
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$4__run$___twin___() {
                    ClientStreamMixer.this.updateMixStream(list, str, z, z2, map);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    boolean LIZ;
                    try {
                        anonymousClass4.com_ss_avframework_livestreamv2_core_interact_mixer_ClientStreamMixer$4__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        ClientImpl clientImpl = this.mClientImpl;
        if (clientImpl.mStopped || clientImpl.mDisposed) {
            AVLog.ioe("ClientStreamMixer", "don't need invalidateSei after stopped");
            return;
        }
        if (z2 && map != null) {
            if (map.size() > 0) {
                for (Map.Entry<String, Client.RTCWaterMarkRegion> entry : map.entrySet()) {
                    if (!this.mImgStream.containsKey(entry.getKey())) {
                        addImageInputStream(entry.getKey());
                    }
                    pushImageFrame(entry);
                }
            }
            Iterator<Map.Entry<String, IInputVideoStream>> it = this.mImgStream.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, IInputVideoStream> next = it.next();
                if (!map.containsKey(next.getKey())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("IInputVideoStream stop");
                    LIZ.append(next.getKey());
                    AVLog.ioi("ClientStreamMixer", X1D.LIZIZ(LIZ));
                    next.getValue().getMixerDescription().flags = 8L;
                    next.getValue().release();
                    it.remove();
                }
            }
        }
        AVLog.debugTrace(list, str);
        composeSei(str);
        if (!z) {
            return;
        }
        Config.ChorusCharacter chorusCharacter = this.mConfig.getChorusCharacter();
        Config.ChorusCharacter chorusCharacter2 = Config.ChorusCharacter.NO_USE;
        if (chorusCharacter != chorusCharacter2) {
            MixedStreamConfig createLiveTranscoding = this.mStreamMixManager.createLiveTranscoding(false);
            if (createLiveTranscoding == null) {
                AVLog.ioi("ClientStreamMixer", "createLiveTranscoding return null");
                return;
            }
            this.mStreamMixManager.convertRegionsToLiveTranscoding(list, createLiveTranscoding);
            if (!this.mIsSingleChorusStarted) {
                startChorus(createLiveTranscoding);
                this.mIsSingleChorusStarted = true;
            } else {
                updateMixStream(createLiveTranscoding);
            }
            updateVideoMixRegions(list);
        } else if (this.mIsSingleChorusStarted) {
            this.mIsSingleChorusStarted = false;
            stopChorus();
        }
        if (this.mInteractEngine != null) {
            if (((this.mRegionCount <= 1 && list.size() > 1) || (this.mRegionCount > 1 && list.size() <= 1)) && this.mBuilder.getLiveCore() != null) {
                this.mBuilder.getLiveCore().requestKeyFrame();
            }
            this.mRegionCount = list.size();
        }
        if (this.mConfig.getChorusCharacter() == chorusCharacter2 || this.mConfig.getChorusOnlySendPts()) {
            IInputVideoStream iInputVideoStream = null;
            boolean z4 = false;
            for (Region region : list) {
                if (region.getInteractId().equals(this.mClientImpl.mInteractId)) {
                    iInputVideoStream = liveCore.getOriginInputVideoStream();
                    AVLog.ioi("ClientStreamMixer", "set local video sink update");
                    z4 = true;
                    z3 = true;
                } else {
                    InteractVideoSink videoSink = ((InteractVideoSinkFactory) this.mClientImpl.getmVideoSinkFactory()).getVideoSink(region.getInteractId());
                    if (videoSink != null) {
                        iInputVideoStream = videoSink.getOutVideoStream();
                    }
                    AVLog.ioi("ClientStreamMixer", "set remote video sink update");
                    z3 = false;
                }
                if (iInputVideoStream != null && (mixerDescription = iInputVideoStream.getMixerDescription()) != null) {
                    mixerDescription.left = (float) region.getX();
                    mixerDescription.top = (float) region.getY();
                    mixerDescription.right = mixerDescription.left + ((float) region.getWidth());
                    mixerDescription.bottom = mixerDescription.top + ((float) region.getHeight());
                    mixerDescription.zOrder = region.getZorder();
                    mixerDescription.setMode(2);
                    mixerDescription.setVisibility(!region.isMuteVideo());
                    iInputVideoStream.setMixerDescription(mixerDescription);
                    if (z3) {
                        this.mSelfVideoMixerDescription = mixerDescription;
                    }
                }
            }
            if (!z4) {
                AVLog.ioe("ClientStreamMixer", "Didn't find my region.");
            }
        }
        updateAudioSpatialInfo(list);
    }
}
