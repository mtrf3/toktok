package com.ss.avframework.livestreamv2.core.interact.mixer;

import X.C16880lQ;
import X.X1D;
import X.YE1;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.realx.video.YuvHelper;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.ClientImpl;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCExtInfo;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.data.VideoFrameType;
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
import com.ss.ttlivestreamer.livestreamv2.IInputAudioStream;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class RtcClientStreamMixer extends StreamMixer {
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
    public InteractEngineImpl mInteractEngine;
    public boolean mIsSingleChorusStarted;
    public LiveCore mLiveCore;
    public LiveRTCExtInfo mLiveRtcExtInfo;
    public IInputAudioStream mMixAudioStream;
    public IInputVideoStream mMixVideoStream;
    public IInputAudioStream mOrigInputAudioStream;
    public IInputVideoStream mOrigInputVideoStream;
    public long mOriginAudioTs;
    public long mOriginRemoteAudioTs;
    public VideoMixer.VideoMixerDescription mOriginVideoDescription;
    public int mRegionCount;
    public RTCVideo mRtcEngine;
    public RTCEngineWrapper mRtcEngineWrapper;
    public StreamMixManager mStreamMixManager;
    public final String TAG = "RtcClientStreamMixer";
    public String mOrigInputVideoStreamName = "";
    public String mOrigInputAudioStreamName = "";
    public int audioSampleSize = 44100;
    public int audioChannels = 2;
    public String taskId = "";

    private void resetChorusAudioChange() {
        AVLog.ioi("RtcClientStreamMixer", "reset Chorus Audio Change");
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore != null) {
            liveCore.getADM().enableRemoteAudio(true);
            liveCore.getADM().enableLocalRecord(true);
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

    private void startChorus() {
        if (this.mIsSingleChorusStarted) {
            AVLog.iow("RtcClientStreamMixer", "chorus has call start");
            return;
        }
        AVLog.iow("RtcClientStreamMixer", "call startChorus");
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
                        AVLog.iow("RtcClientStreamMixer", "call setQuirks");
                    }
                }
                IFilterManager videoFilterMgr = liveCore.getVideoFilterMgr();
                if (videoFilterMgr != null) {
                    videoFilterMgr.setRenderSinkOnlyMixWithRTC(true);
                    AVLog.iow("RtcClientStreamMixer", "call setRenderSinkOnlyMixWithRTC");
                }
                IAudioFilterManager audioFilterMgr = liveCore.getAudioFilterMgr();
                if (audioFilterMgr != null) {
                    audioFilterMgr.setOnlyMixWithRTC(true);
                    AVLog.iow("RtcClientStreamMixer", "call setOnlyMixWithRTC");
                }
            }
        }
    }

    private void stopChorus() {
        AVLog.iow("RtcClientStreamMixer", "call stopChorus");
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore != null) {
            liveCore.setOnlyAddSeiToRTC(false);
            LiveCoreKaraokFilter liveCoreKaraokFilter = (LiveCoreKaraokFilter) liveCore.getAudioFilterMgr();
            if (liveCoreKaraokFilter != null) {
                liveCoreKaraokFilter.setChorusMode(false);
            }
        }
        if (this.isSetAudioStream) {
            this.isSetAudioStream = false;
            resetChorusAudioChange();
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mChorusSink;
            if (audioRenderSink != null) {
                audioRenderSink.release();
                this.mChorusSink = null;
            }
        }
    }

    public void initInputVideoStream() {
        if (this.mMixVideoStream == null) {
            this.mMixVideoStream = this.mLiveCore.createInputVideoStream();
        }
        if (this.mOrigInputVideoStream == null) {
            IInputVideoStream originInputVideoStream = this.mLiveCore.getOriginInputVideoStream();
            this.mOrigInputVideoStream = originInputVideoStream;
            this.mOrigInputVideoStreamName = originInputVideoStream.name();
            this.mOriginVideoDescription = this.mOrigInputVideoStream.getMixerDescription();
        }
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.copy(this.mOriginVideoDescription);
        VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
        FILL.setzOrder(5);
        FILL.setVisibility(true);
        FILL.setEnableAlphaMode(false);
        FILL.setMode(1);
        videoMixerDescription.setVisibility(false);
        videoMixerDescription.setzOrder(1);
        this.mOrigInputVideoStream.setMixerDescription(videoMixerDescription);
        IInputVideoStream iInputVideoStream = this.mMixVideoStream;
        if (iInputVideoStream != null) {
            iInputVideoStream.setMixerDescription(FILL);
            IInputVideoStream iInputVideoStream2 = this.mMixVideoStream;
            if (iInputVideoStream2 == null) {
                AVLog.iow("RtcClientStreamMixer", "mMixVideoStream is null, why");
                return;
            }
            iInputVideoStream2.start();
            AVLog.iow("RtcClientStreamMixer", "Set LiveCore Origin VideoTrack to RtcMix.");
            this.mLiveCore.setOriginVideoTrack(this.mMixVideoStream.name());
            this.mLiveCore.enableMixer(false, false);
        }
    }

    public void resetOriginVideoTrack() {
        Handler handler = mMixThreadHandler;
        if (handler != null && handler.getLooper() != null) {
            mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.RtcClientStreamMixer.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$3__run$___twin___() {
                    RtcClientStreamMixer rtcClientStreamMixer = RtcClientStreamMixer.this;
                    if (rtcClientStreamMixer.mMixVideoStream != null && rtcClientStreamMixer.mLiveCore != null && rtcClientStreamMixer.mStart) {
                        AVLog.iow("RtcClientStreamMixer", "ReSet LiveCore Origin VideoTrack to RtcMix.");
                        RtcClientStreamMixer rtcClientStreamMixer2 = RtcClientStreamMixer.this;
                        rtcClientStreamMixer2.mLiveCore.setOriginVideoTrack(rtcClientStreamMixer2.mMixVideoStream.name());
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void stopMixStream() {
        super.stopMixStream();
        AVLog.iow("RtcClientStreamMixer", "call stopMixStream");
        this.mRtcEngine.stopPushStreamToCDN(this.taskId);
        if (this.mIsSingleChorusStarted) {
            this.mIsSingleChorusStarted = false;
            stopChorus();
        }
        Handler handler = mMixThreadHandler;
        if (handler != null && handler.getLooper() != null) {
            mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.RtcClientStreamMixer.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$2__run$___twin___() {
                    RtcClientStreamMixer rtcClientStreamMixer = RtcClientStreamMixer.this;
                    rtcClientStreamMixer.isSetVideoStream = false;
                    IInputAudioStream iInputAudioStream = rtcClientStreamMixer.mOrigInputAudioStream;
                    if (iInputAudioStream != null) {
                        iInputAudioStream.start();
                        RtcClientStreamMixer rtcClientStreamMixer2 = RtcClientStreamMixer.this;
                        rtcClientStreamMixer2.mLiveCore.setOriginAudioTrack(rtcClientStreamMixer2.mOrigInputAudioStreamName);
                    }
                    IInputVideoStream iInputVideoStream = RtcClientStreamMixer.this.mOrigInputVideoStream;
                    if (iInputVideoStream != null) {
                        iInputVideoStream.start();
                        RtcClientStreamMixer.this.mLiveCore.enableMixer(false, true);
                        RtcClientStreamMixer rtcClientStreamMixer3 = RtcClientStreamMixer.this;
                        rtcClientStreamMixer3.mLiveCore.setOriginVideoTrack(rtcClientStreamMixer3.mOrigInputVideoStreamName);
                    }
                    IInputAudioStream iInputAudioStream2 = RtcClientStreamMixer.this.mMixAudioStream;
                    if (iInputAudioStream2 != null) {
                        iInputAudioStream2.release();
                    }
                    IInputVideoStream iInputVideoStream2 = RtcClientStreamMixer.this.mMixVideoStream;
                    if (iInputVideoStream2 != null) {
                        iInputVideoStream2.release();
                        RtcClientStreamMixer.this.mMixVideoStream = null;
                    }
                    RtcClientStreamMixer rtcClientStreamMixer4 = RtcClientStreamMixer.this;
                    IInputVideoStream iInputVideoStream3 = rtcClientStreamMixer4.mOrigInputVideoStream;
                    if (iInputVideoStream3 != null) {
                        iInputVideoStream3.setMixerDescription(rtcClientStreamMixer4.mOriginVideoDescription);
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        mMixThreadHandler = null;
        HandlerThread handlerThread = mMixThread;
        mMixThread = null;
        if (handlerThread != null) {
            try {
                handlerThread.quitSafely();
            } catch (Throwable unused) {
                handlerThread.quit();
            }
        }
    }

    public static ByteBuffer clone(ByteBuffer byteBuffer) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        allocateDirect.limit(allocateDirect.capacity());
        allocateDirect.put(byteBuffer);
        byteBuffer.rewind();
        allocateDirect.flip();
        return allocateDirect;
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
                AVLog.ioe("RtcClientStreamMixer", "Interact sei already cleared, don't add again!");
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
            LIZ.append(this.mLiveRtcExtInfo.vendorName);
            liveCore.addSeiField("source", X1D.LIZIZ(LIZ), -1);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void startMixStream(MixedStreamConfig mixedStreamConfig) {
        super.startMixStream(mixedStreamConfig);
        mixedStreamConfig.setExpectedMixingType(ByteRTCStreamMixingType.STREAM_MIXING_BY_CLIENT);
        Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        this.audioChannels = mixStreamConfig.getAudioChannels();
        this.audioSampleSize = mixStreamConfig.getAudioSampleRateValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveTranscoding ");
        LIZ.append(mixedStreamConfig.getTranscodeMessage().toString());
        AVLog.iod("RtcClientStreamMixer", X1D.LIZIZ(LIZ));
        if (this.mLiveRtcExtInfo.mixMaxBitrateKbps > 0 && mixedStreamConfig.getVideoConfig() != null) {
            mixedStreamConfig.getVideoConfig().setBitrate(this.mLiveRtcExtInfo.mixMaxBitrateKbps);
        }
        this.countMixVideoReceive = 0L;
        this.countMixVideoDeliver = 0L;
        if (!this.mIsSingleChorusStarted && this.mConfig.getChorusCharacter() != Config.ChorusCharacter.NO_USE && !this.mConfig.getChorusOnlySendPts()) {
            startChorus();
            this.mIsSingleChorusStarted = true;
        }
        this.mRtcEngine.startPushMixedStreamToCDN(this.taskId, mixedStreamConfig, new IMixedStreamObserver() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.RtcClientStreamMixer.1
            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public boolean isSupportClientPushStream() {
                return true;
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingVideoFrame(String str, final VideoFrame videoFrame) {
                RtcClientStreamMixer rtcClientStreamMixer = RtcClientStreamMixer.this;
                long j = rtcClientStreamMixer.countMixVideoReceive;
                if (j > rtcClientStreamMixer.countMixVideoDeliver || !rtcClientStreamMixer.mStart) {
                    videoFrame.release();
                    return;
                }
                rtcClientStreamMixer.countMixVideoReceive = j + 1;
                final long nativeNanoTime = TimeUtils.nativeNanoTime();
                Handler handler = RtcClientStreamMixer.mMixThreadHandler;
                if (handler != null && handler.getLooper() != null) {
                    RtcClientStreamMixer.mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.RtcClientStreamMixer.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$3__run$___twin___() {
                            boolean z;
                            RtcClientStreamMixer rtcClientStreamMixer2 = RtcClientStreamMixer.this;
                            if (!rtcClientStreamMixer2.isSetVideoStream && rtcClientStreamMixer2.countMixVideoReceive > 10) {
                                rtcClientStreamMixer2.initInputVideoStream();
                                RtcClientStreamMixer.this.isSetVideoStream = true;
                            }
                            if (RtcClientStreamMixer.this.mMixVideoStream != null) {
                                if (videoFrame.getFrameType() == VideoFrameType.GL_TEXTURE) {
                                    IInputVideoStream iInputVideoStream = RtcClientStreamMixer.this.mMixVideoStream;
                                    int textureID = videoFrame.getTextureID();
                                    if (videoFrame.getPixelFormat() == VideoPixelFormat.TEXTURE_OES) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    iInputVideoStream.pushVideoFrame(textureID, z, videoFrame.getWidth(), videoFrame.getHeight(), 0, videoFrame.getTextureMatrix(), nativeNanoTime / 1000);
                                } else {
                                    int width = videoFrame.getWidth();
                                    int height = videoFrame.getHeight();
                                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((((width + 1) / 2) * ((height + 1) / 2) * 2) + (width * height));
                                    if (videoFrame.getPixelFormat() != VideoPixelFormat.I420) {
                                        videoFrame.release();
                                        RtcClientStreamMixer.this.countMixVideoDeliver++;
                                        return;
                                    } else {
                                        YuvHelper.I420Copy(videoFrame.getPlaneData(0), videoFrame.getPlaneStride(0), videoFrame.getPlaneData(1), videoFrame.getPlaneStride(1), videoFrame.getPlaneData(2), videoFrame.getPlaneStride(2), allocateDirect, width, height);
                                        allocateDirect.position(0);
                                        RtcClientStreamMixer.this.mMixVideoStream.pushVideoFrame(allocateDirect, width, height, 0, nativeNanoTime / 1000);
                                    }
                                }
                            }
                            videoFrame.release();
                            RtcClientStreamMixer.this.countMixVideoDeliver++;
                        }

                        public static void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                            boolean LIZ2;
                            try {
                                anonymousClass3.com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$3__run$___twin___();
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    });
                }
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingDataFrame(String str, final byte[] bArr, long j) {
                if (RtcClientStreamMixer.this.mConfig.getChorusCharacter() == Config.ChorusCharacter.NO_USE || bArr.length <= 0) {
                    return;
                }
                TimeUtils.currentTimeMs();
                Handler handler = RtcClientStreamMixer.mMixThreadHandler;
                if (handler == null || handler.getLooper() == null) {
                    return;
                }
                RtcClientStreamMixer.mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.RtcClientStreamMixer.1.4
                    public void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$4__run$___twin___() {
                        long nativeNanoTime = TimeUtils.nativeNanoTime();
                        LiveCore liveCore = RtcClientStreamMixer.this.mBuilder.getLiveCore();
                        if (liveCore == null) {
                            return;
                        }
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                        allocateDirect.put(bArr);
                        allocateDirect.rewind();
                        String nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, allocateDirect);
                        if (nativeParseStringFromByteBuffer != null) {
                            try {
                                if (new JSONObject(nativeParseStringFromByteBuffer).has("ktv_sei")) {
                                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(nativeParseStringFromByteBuffer.getBytes().length);
                                    allocateDirect2.put(nativeParseStringFromByteBuffer.getBytes());
                                    allocateDirect2.rewind();
                                    liveCore.pushRtcSeiData(9999, RtcClientStreamMixer.this.mStreamMixManager.getRtcExtInfo().interactId, 0, 0, 0, null, 0, nativeNanoTime / 1000000, allocateDirect2);
                                }
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                        boolean LIZ2;
                        try {
                            anonymousClass4.com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$4__run$___twin___();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onMixingAudioFrame(String str, final byte[] bArr, final int i, final long j) {
                Handler handler;
                RtcClientStreamMixer rtcClientStreamMixer = RtcClientStreamMixer.this;
                if (rtcClientStreamMixer.mIsSingleChorusStarted && rtcClientStreamMixer.mConfig.getChorusCharacter() != Config.ChorusCharacter.NO_USE && !RtcClientStreamMixer.this.mConfig.getChorusOnlySendPts()) {
                    Handler handler2 = RtcClientStreamMixer.mMixThreadHandler;
                    if (handler2 != null && handler2.getLooper() != null) {
                        RtcClientStreamMixer.mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.RtcClientStreamMixer.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$1__run$___twin___() {
                                RtcClientStreamMixer rtcClientStreamMixer2 = RtcClientStreamMixer.this;
                                if (!rtcClientStreamMixer2.mIsSingleChorusStarted) {
                                    return;
                                }
                                long j2 = rtcClientStreamMixer2.mChorusAudioTimeStampMs;
                                if (j2 == 0) {
                                    rtcClientStreamMixer2.mChorusAudioTimeStampMs = TimeUtils.nativeNanoTime() / 1000000;
                                    RtcClientStreamMixer rtcClientStreamMixer3 = RtcClientStreamMixer.this;
                                    rtcClientStreamMixer3.mOriginAudioTs = rtcClientStreamMixer3.mChorusAudioTimeStampMs;
                                    rtcClientStreamMixer3.mOriginRemoteAudioTs = j;
                                } else {
                                    rtcClientStreamMixer2.mChorusAudioTimeStampMs = j2 + 10;
                                }
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                                allocateDirect.put(bArr);
                                RtcClientStreamMixer rtcClientStreamMixer4 = RtcClientStreamMixer.this;
                                AudioDeviceModule.AudioRenderSink audioRenderSink = rtcClientStreamMixer4.mChorusSink;
                                if (audioRenderSink != null) {
                                    int i2 = rtcClientStreamMixer4.audioSampleSize;
                                    audioRenderSink.onData(allocateDirect, i2 / 100, i2, rtcClientStreamMixer4.audioChannels, (rtcClientStreamMixer4.mOriginAudioTs + j) - rtcClientStreamMixer4.mOriginRemoteAudioTs);
                                }
                            }

                            public static void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00371 runnableC00371) {
                                boolean LIZ2;
                                try {
                                    runnableC00371.com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$1__run$___twin___();
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
                RtcClientStreamMixer rtcClientStreamMixer2 = RtcClientStreamMixer.this;
                if ((!rtcClientStreamMixer2.mIsSingleChorusStarted || rtcClientStreamMixer2.mConfig.getChorusCharacter() != Config.ChorusCharacter.NO_USE) && !RtcClientStreamMixer.this.mBuilder.isByteAudioEnabled() && (handler = RtcClientStreamMixer.mMixThreadHandler) != null && handler.getLooper() != null) {
                    RtcClientStreamMixer.mMixThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.mixer.RtcClientStreamMixer.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$2__run$___twin___() {
                            RtcClientStreamMixer rtcClientStreamMixer3 = RtcClientStreamMixer.this;
                            if (!rtcClientStreamMixer3.mStart) {
                                return;
                            }
                            if (!rtcClientStreamMixer3.isSetAudioStream) {
                                rtcClientStreamMixer3.isSetAudioStream = true;
                                if (rtcClientStreamMixer3.mMixAudioStream == null) {
                                    rtcClientStreamMixer3.mMixAudioStream = rtcClientStreamMixer3.mLiveCore.createInputAudioStream();
                                }
                                RtcClientStreamMixer rtcClientStreamMixer4 = RtcClientStreamMixer.this;
                                if (rtcClientStreamMixer4.mOrigInputAudioStream == null) {
                                    rtcClientStreamMixer4.mOrigInputAudioStream = rtcClientStreamMixer4.mLiveCore.getOriginInputAudioStream();
                                    RtcClientStreamMixer rtcClientStreamMixer5 = RtcClientStreamMixer.this;
                                    rtcClientStreamMixer5.mOrigInputAudioStreamName = rtcClientStreamMixer5.mOrigInputAudioStream.name();
                                }
                                RtcClientStreamMixer.this.mOrigInputAudioStream.release();
                                RtcClientStreamMixer.this.mMixAudioStream.start();
                                if (RtcClientStreamMixer.this.mMixAudioStream != null) {
                                    AVLog.iow("RtcClientStreamMixer", "Set LiveCore Origin AudioTrack to RtcMix");
                                    RtcClientStreamMixer rtcClientStreamMixer6 = RtcClientStreamMixer.this;
                                    rtcClientStreamMixer6.mLiveCore.setOriginAudioTrack(rtcClientStreamMixer6.mMixAudioStream.name());
                                    return;
                                }
                                return;
                            }
                            IInputAudioStream iInputAudioStream = rtcClientStreamMixer3.mMixAudioStream;
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            RtcClientStreamMixer rtcClientStreamMixer7 = RtcClientStreamMixer.this;
                            iInputAudioStream.pushAudioFrame(wrap, rtcClientStreamMixer7.audioSampleSize, rtcClientStreamMixer7.audioChannels, 16, i, TimeUtils.nativeNanoTime() / 1000);
                        }

                        public static void com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                            boolean LIZ2;
                            try {
                                anonymousClass2.com_ss_avframework_livestreamv2_core_interact_mixer_RtcClientStreamMixer$1$2__run$___twin___();
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    });
                }
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
                AVLog.iod("RtcClientStreamMixer", X1D.LIZIZ(LIZ2));
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
                RtcClientStreamMixer.this.mStreamMixManager.onStreamMixEvent(byteRTCStreamMixingEvent, LIZIZ, byteRTCTranscoderErrorCode.value(), mixedStreamType.value());
            }

            @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
            public void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i) {
                for (int i2 = 0; i2 < i; i2++) {
                    videoFrameArr[i2].release();
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void updateMixStream(MixedStreamConfig mixedStreamConfig) {
        mixedStreamConfig.setExpectedMixingType(ByteRTCStreamMixingType.STREAM_MIXING_BY_CLIENT);
        if (this.mLiveRtcExtInfo.mixMaxBitrateKbps > 0 && mixedStreamConfig.getVideoConfig() != null) {
            mixedStreamConfig.getVideoConfig().setBitrate(this.mLiveRtcExtInfo.mixMaxBitrateKbps);
        }
        if (!this.mIsSingleChorusStarted && this.mConfig.getChorusCharacter() != Config.ChorusCharacter.NO_USE && !this.mConfig.getChorusOnlySendPts()) {
            startChorus();
            this.mIsSingleChorusStarted = true;
        }
        if (this.mIsSingleChorusStarted && this.mConfig.getChorusCharacter() == Config.ChorusCharacter.NO_USE && !this.mConfig.getChorusOnlySendPts()) {
            this.mIsSingleChorusStarted = false;
            stopChorus();
        }
        this.mRtcEngine.updatePushMixedStreamToCDN(this.taskId, mixedStreamConfig);
    }

    public RtcClientStreamMixer(RTCVideo rTCVideo, StreamMixManager streamMixManager) {
        this.mRtcEngine = rTCVideo;
        this.mStreamMixManager = streamMixManager;
        this.mBuilder = streamMixManager.getEngineBuilder();
        this.mConfig = this.mStreamMixManager.getInteractConfig();
        InteractEngineBuilder interactEngineBuilder = this.mBuilder;
        if (interactEngineBuilder != null) {
            this.mLiveCore = interactEngineBuilder.getLiveCore();
        }
        this.mMixType = Config.MixStreamType.RTC_CLIENT_MIX;
        HandlerThread handlerThread = new HandlerThread("InteractMixThread", TTLSThreadConfigHelper.getPriority("InteractMixThread", 0));
        mMixThread = handlerThread;
        handlerThread.start();
        mMixThreadHandler = new Handler(mMixThread.getLooper());
        this.mClientImpl = this.mStreamMixManager.getClient();
        this.mInteractEngine = this.mStreamMixManager.getInteractEngine();
        RTCEngineWrapper rTCEngineWrapper = streamMixManager.getRTCEngineWrapper();
        this.mRtcEngineWrapper = rTCEngineWrapper;
        this.mLiveRtcExtInfo = rTCEngineWrapper.getLiveRTCExtInfo();
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixer
    public void updateMixStream(List<Region> list, String str, boolean z, boolean z2, Map<String, Client.RTCWaterMarkRegion> map) {
        MixedStreamConfig createLiveTranscoding;
        String str2;
        InteractConfig interactConfig = this.mStreamMixManager.getInteractConfig();
        JSONObject authInfoCache = this.mStreamMixManager.getAuthInfoCache();
        if (interactConfig.getCharacter() != Config.Character.ANCHOR || interactConfig.getMixStreamType() != Config.MixStreamType.RTC_CLIENT_MIX || TextUtils.isEmpty(interactConfig.getMixStreamConfig().getStreamUrl()) || (createLiveTranscoding = this.mStreamMixManager.createLiveTranscoding(false)) == null) {
            return;
        }
        AVLog.debugTrace(list, str);
        this.mStreamMixManager.convertRegionsToLiveTranscoding(list, createLiveTranscoding);
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        AVLog.i("RtcClientStreamMixer", str2);
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
        composeSei(str);
        if (map != null) {
            this.mStreamMixManager.convertImageRegionsToLiveTranscoding(z2, map, createLiveTranscoding);
        }
        if (!z) {
            return;
        }
        updateMixStream(createLiveTranscoding);
    }
}
