package com.ss.ttlivestreamer.livestreamv2.core;

import X.C16880lQ;
import X.C63806P2k;
import X.X1D;
import android.media.AudioManager;
import android.os.Handler;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.MediaSource;
import com.ss.ttlivestreamer.core.engine.MediaTrack;
import com.ss.ttlivestreamer.core.engine.VsyncModule;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GLTracer;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamReport;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie;
import com.ss.ttlivestreamer.livestreamv2.log.ILogUploader;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class LiveCore implements ILiveStream {
    public static AtomicLong sUploadLogIndex = new AtomicLong(0);
    public static String sUploadLogUUID = UUID.randomUUID().toString().replace("-", "");
    public ILiveCoreWarningListener mWarningListener;

    /* loaded from: classes12.dex */
    public static class Builder extends LiveStreamBuilder {
        public boolean enableRtcExtraDataPeriodSend;
        public String mStrSdkParams;
        public IVideoEffectProcessor mVideoEffectProcessor;
        public ILogMonitor mLogMonitor = new ILogMonitor() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCore.Builder.1
            @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.Builder.ILogMonitor
            public void onLogMonitor(String str, JSONObject jSONObject) {
            }
        };
        public String mAdmRecordingType = "opensles";
        public String mAdmPlayerType = "opensles";
        public boolean mMergeRtcExtraDataToLiveStream = false;

        /* loaded from: classes12.dex */
        public interface ILogMonitor {
            void onLogMonitor(String str, JSONObject jSONObject);
        }

        private void parseLocalSdkParams() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder
        public Builder setLogUploader(ILogUploader iLogUploader) {
            return this;
        }

        public Builder setUsingExternAudioCaptureOnServerInteractMode(boolean z) {
            return this;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder
        public LiveCore createDummy() {
            return new DummyLiveCoreImpl();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder
        public LiveCore create() {
            parseLocalSdkParams();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sdkParams Params:");
            LIZ.append(getSdkParams());
            AVLog.logKibana(5, "SDK_PARAMS", X1D.LIZIZ(LIZ), null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sdkParams Params:");
            LIZ2.append(getSdkParams());
            AVLog.iow("SDK_PARAMS", X1D.LIZIZ(LIZ2));
            return new LiveCoreImpl(this);
        }

        public JSONObject getAdmServerCfg() {
            return getPushBase().admServerConfig;
        }

        public int getAdmType() {
            getPushBase();
            if (getAudioCaptureDevice() != 5) {
                return 0;
            }
            return getPushBase().admType;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder
        public ILogMonitor getLiveCoreLogMonitor() {
            return getLogMonitor();
        }

        public boolean isEnableADMRenderReadMode() {
            return getSdkSetting().admRenderMode;
        }

        public boolean isEnableAecOnHeadsetMode() {
            return getPushBase().enableAecOnHeadsetMode;
        }

        public boolean usingAecV2Algorithm() {
            return getSdkSetting().enableAecV2Algorithm;
        }

        public boolean usingAudioAgcOnAecV2Mode() {
            return getSdkSetting().agcEnableOnAecV2Mode;
        }

        public int usingAudioRNNoise() {
            return getSdkSetting().nsModeOnAecV2;
        }

        public ILogMonitor getLogMonitor() {
            return this.mLogMonitor;
        }

        public IVideoEffectProcessor getVideoEffectProcessor() {
            return this.mVideoEffectProcessor;
        }

        public boolean isEnableRtcExtraDataPeriodSend() {
            return this.enableRtcExtraDataPeriodSend;
        }

        public boolean needMergeRtcExtraDataToLiveStream() {
            return this.mMergeRtcExtraDataToLiveStream;
        }

        private Builder setEnableRtcExtraDataPeriodSend(boolean z) {
            this.enableRtcExtraDataPeriodSend = z;
            return this;
        }

        public void enableAecOnHeadsetMode(boolean z) {
            getPushBase().enableAecOnHeadsetMode = z;
        }

        public String getAdmApiType(boolean z) {
            String str;
            LiveSdkSetting sdkSetting = getSdkSetting();
            if (z) {
                str = sdkSetting.admRecordingType;
            } else {
                str = sdkSetting.admPlayerType;
            }
            if (AudioDeviceModule.isValidAdmApiType(str)) {
                return str;
            }
            if (z) {
                return this.mAdmRecordingType;
            }
            return this.mAdmPlayerType;
        }

        public Builder setLogMonitor(ILogMonitor iLogMonitor) {
            this.mLogMonitor = iLogMonitor;
            this.mLogUploader = new ILogUploader() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCore.Builder.2
                @Override // com.ss.ttlivestreamer.livestreamv2.log.ILogUploader
                public void uploadLog(JSONObject jSONObject) {
                    try {
                        jSONObject.put("livecore_event_index", LiveCore.sUploadLogIndex.incrementAndGet());
                        jSONObject.put("livecore_app_alive_uuid", LiveCore.sUploadLogUUID);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    Builder.this.mLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
                }
            };
            return this;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder
        public /* bridge */ /* synthetic */ LiveStreamBuilder setLogUploader(ILogUploader iLogUploader) {
            setLogUploader(iLogUploader);
            return this;
        }

        public void setMergeRtcExtraDataToLiveStream(boolean z) {
            this.mMergeRtcExtraDataToLiveStream = z;
        }

        public void setUsingAecV2Algorithm(boolean z) {
            getSdkSetting().enableAecV2Algorithm = z;
        }

        public Builder setVideoEffectProcessor(IVideoEffectProcessor iVideoEffectProcessor) {
            this.mVideoEffectProcessor = iVideoEffectProcessor;
            return this;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder
        public Builder setupSdkParams(String str) {
            super.setupSdkParams(str);
            if (str != null && !str.isEmpty()) {
                if (getInteract().mixOnClient == null) {
                    try {
                        getInteract().mixOnClient = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.mSdkParams, "PushBase"), "mixOnClient");
                    } catch (Exception unused) {
                        AVLog.ioe("LiveCore", "Don't have a mixOnClient params");
                    }
                }
                GLThreadManager.enableGlobalGlContextMutex(getSdkSetting().enableGlobalGlSharedContextMutex);
                GLTracer.setEnableGlTracer(getSdkSetting().enableGLTracer);
                if (NumberInit.isDefined(Integer.valueOf(getPushBase().liveGlVersion))) {
                    GLThreadManager.setGLVersion(getPushBase().liveGlVersion);
                }
                if (NumberInit.isDefined(Integer.valueOf(getSdkSetting().logLevel))) {
                    AVLog.setLevel(getSdkSetting().logLevel);
                }
            }
            return this;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder
        public /* bridge */ /* synthetic */ LiveStreamBuilder setupSdkParams(String str) {
            setupSdkParams(str);
            return this;
        }

        public ILiveStream createLiveStream(Handler handler, Handler handler2) {
            return createLiveStream(handler, handler2, null, null);
        }

        public void setAdmApiType(String str, boolean z) {
            if (AudioDeviceModule.isValidAdmApiType(str)) {
                if (z) {
                    this.mAdmRecordingType = str;
                } else {
                    this.mAdmPlayerType = str;
                }
            }
        }

        public void setAdmType(int i, JSONObject jSONObject) {
            if (i == 0 || i == 1) {
                getPushBase().admType = i;
                getPushBase().admServerConfig = jSONObject;
            }
        }

        public void setUsingAecV2Algorithm(boolean z, int i) {
            getSdkSetting().enableAecV2Algorithm = z;
            getSdkSetting().nsModeOnAecV2 = i;
        }

        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
            return createLiveStream(handler, handler2, audioDeviceModule, null);
        }

        public void setUsingAecV2Algorithm(boolean z, int i, boolean z2) {
            getSdkSetting().enableAecV2Algorithm = z;
            getSdkSetting().nsModeOnAecV2 = i;
            getSdkSetting().agcEnableOnAecV2Mode = z2;
        }

        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
            return super.create(handler, handler2, audioDeviceModule, iVideoEffectProcessor);
        }
    }

    /* loaded from: classes12.dex */
    public interface ILiveCoreVideoFrameAvailableListener extends ILiveStream.ITextureFrameAvailableListener {
        void onI420FrameAvailable(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr);
    }

    /* loaded from: classes12.dex */
    public interface ILiveCoreWarningListener {
        void onWarning(int i, int i2, Exception exc);
    }

    /* loaded from: classes12.dex */
    public interface ILiveForInteractListener {
        void onInfo(int i, int i2, int i3, Object... objArr);

        void onWarning(int i, int i2, int i3, Object... objArr);
    }

    /* loaded from: classes12.dex */
    public interface RtcExtraDataListener {
        void onRtcData(String str, String str2);

        void onRtcData(String str, ByteBuffer byteBuffer);
    }

    public abstract void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void addSurfaceAvailableListener(SurfaceWithExtData surfaceWithExtData);

    public abstract void addTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public void changeToKTVMode(boolean z, IKaraokeMovie iKaraokeMovie) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public /* synthetic */ int configEffectDowngradingStrategy(JSONObject jSONObject) {
        return C63806P2k.LIZ(this, jSONObject);
    }

    public abstract VideoFrameRenderer createFrameRender(View view, Handler handler, boolean z);

    public abstract VideoFrameRenderer createFrameRender(String str, int i, int i2);

    public abstract IAVPlayer createPlayer();

    public abstract IPushFrameAfterCapture createPushFrameAfterCapture(int i, int i2);

    public abstract MediaTrack createTrack(MediaSource mediaSource, String str);

    public abstract boolean enableMirror(long j, boolean z);

    public abstract AudioDeviceModule getADM();

    public abstract IAudioDeviceControl getAudioDeviceControl();

    public JSONObject getAudioDiagnosisScore() {
        return null;
    }

    public abstract View getCurrentDisplay();

    public JSONObject getDebugInfo() {
        return null;
    }

    public abstract Builder getInternalBuilder();

    public abstract ILayerControl getLayerControl();

    public abstract void getLiveCoreReportInfo(LiveStreamReport liveStreamReport);

    public abstract int getMirrorState();

    public abstract boolean getPreviewFitMode();

    public abstract boolean getPreviewMirror(boolean z);

    public int getScreenAudioLevel() {
        return 0;
    }

    public abstract List<String> getUrls();

    public abstract VsyncModule getVsyncModule();

    public abstract Handler getWorkThreadHandler();

    public boolean isCameraRunning() {
        return false;
    }

    public boolean isMicRunning() {
        return false;
    }

    public boolean isPushingBlackFrame() {
        return false;
    }

    public boolean isScreenCaptureRunning() {
        return false;
    }

    public abstract void onInteractEvent(int i, int i2, Object... objArr);

    public void onOuterInfo(int i, int i2, int i3) {
    }

    public void pause(Cert cert) {
    }

    public void pushRtcSeiData(int i, String str, int i2, int i3, int i4, float[] fArr, int i5, long j, ByteBuffer byteBuffer) {
    }

    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback, Cert cert) {
    }

    public void registerInteractListener(ILiveForInteractListener iLiveForInteractListener) {
    }

    public void release(Cert cert) {
    }

    public abstract void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    public abstract void removeSurfaceAvailableListener(SurfaceWithExtData surfaceWithExtData);

    public abstract void removeTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    public void resetSdkParams() {
    }

    public void resume(Cert cert) {
    }

    public void setAudioMute(boolean z, Cert cert) {
    }

    public void setAudioMute(boolean z, Cert cert, String str) {
    }

    public void setAudioMute(boolean z, String str) {
    }

    public abstract void setDisplay(View view);

    public abstract void setDisplay(View view, long j);

    public abstract void setDisplayMixBgColor(int i);

    public abstract void setDisplayPlanarRender(boolean z);

    public abstract void setOnlyAddSeiToRTC(boolean z);

    public abstract void setPreviewFitMode(boolean z);

    public abstract void setPreviewMirror(boolean z, boolean z2);

    public void setPushStreamAfterServerMix(boolean z) {
    }

    public void setRtcExtraDataListener(RtcExtraDataListener rtcExtraDataListener) {
    }

    public void setScreenInteralAudioVolume(float f) {
    }

    public void setScreenMicAudioVolume(float f) {
    }

    public void startAudioCapture(Cert cert) {
    }

    public abstract int startAudioPlayer();

    public void startVideoCapture(Cert cert) {
    }

    public void stopAudioCapture(Cert cert) {
    }

    public abstract int stopAudioPlayer();

    public void stopVideoCapture(Cert cert) {
    }

    public void switchAudioCapture(int i, Cert cert) {
    }

    public void switchVideoCapture(int i, Cert cert) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public /* synthetic */ int tryToExecuteEffectDowningStrategy(int i, int i2) {
        return C63806P2k.LIZIZ(this, i, i2);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public /* synthetic */ int turnOffEffectDowngradingStrategy() {
        return C63806P2k.LIZJ(this);
    }

    public final Builder getBuilder() {
        return getInternalBuilder();
    }

    public void setWarningListener(ILiveCoreWarningListener iLiveCoreWarningListener) {
        this.mWarningListener = iLiveCoreWarningListener;
    }
}
