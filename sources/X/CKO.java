package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastVideoE2EDelaySampleSetting;
import com.bytedance.android.livesdk.broadcast.setting.OverrideCaptureResolutionFixSetting;
import com.bytedance.android.livesdk.broadcast.setting.RemoteVideoFrozenSetting;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.MobileGameStreamInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAccessVeLivePusherSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAdmNsTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBackgroundTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreCameraLogLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectSDKConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableCopyOesCheckDeviceSupportSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableCopyOesSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableEffectConfigLogSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableEffectLogSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnablePtsAdjustSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVECamera2Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.QualcommGpuHintSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSLayerVideoMixerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSMainVideoMixerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSUseCameraCaptureVideoPtsInRtc;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSVideoCaptureReleaseLockOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSVideoEncodeLockOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestMicEffectSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAndroidCaptureResolutionFixSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEffectNewEngineConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveStreamABThreadPrioritSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSGpuTurboSettings;
import com.bytedance.android.livesdk.livesetting.performance.TTLSThreadPrioritySettings;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCameraCaptureSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePushStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableStreamPreviewSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestStreamConfigSetting;
import com.bytedance.android.livesdk.model.ByteAudioConfig;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.utils.LiveStreamGpuHintSettings;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPrioritySettings;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadType;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.TaintSceneDetectParamsWrapper;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CKO implements InterfaceC21020s6, InterfaceC08140Tq {
    public static final float[] LJIJJ = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public final C14090gv LIZ;
    public final C21010s5 LIZIZ;
    public ILiveStream.ILiveStreamErrorListener LIZJ;
    public ILiveStream.ILiveStreamInfoListener LIZLLL;
    public LiveCore LJ;
    public volatile InteractEngineImpl LJFF;
    public Client LJI;
    public InterfaceC21030s7 LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public final Handler LJIIL;
    public final ARunnableS41S0100000_5 LJIILIIL;
    public final ARunnableS41S0100000_5 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final CKT LJIILLIIL;
    public boolean LJIIZILJ;
    public final CKR LJIJ;
    public InterfaceC21000s4 LJIJI;

    @Override // X.InterfaceC21020s6
    public final void LJIIZILJ() {
        this.LJIJI = null;
    }

    static {
        C31147CKh.LIZIZ();
    }

    @Override // X.InterfaceC08140Tq
    public final int LJI() {
        LiveCore.Builder builder;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (builder = liveCore.getBuilder()) != null) {
            return builder.getCaptureAdaptedHeight();
        }
        return 0;
    }

    @Override // X.InterfaceC21020s6
    public final AudioDeviceModule LJII() {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            return liveCore.getADM();
        }
        return null;
    }

    @Override // X.InterfaceC08140Tq
    public final int LJIILJJIL() {
        LiveCore.Builder builder;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (builder = liveCore.getBuilder()) != null) {
            return builder.getCaptureAdaptedWidth();
        }
        return 0;
    }

    @Override // X.InterfaceC21020s6
    public final long LJIL() {
        Double d;
        AudioDeviceModule adm;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (adm = liveCore.getADM()) != null) {
            d = Double.valueOf(adm.getOption(2));
        } else {
            d = null;
        }
        if (d == null) {
            C0NB.LJ("LiveStreamTag", "getCurrentMicrophoneDB() return null");
            return 0L;
        }
        long doubleValue = (long) d.doubleValue();
        long j = 1000;
        long j2 = doubleValue / j;
        if (j2 < 0) {
            return doubleValue;
        }
        Long.signum(j2);
        return Math.max(j2, doubleValue - (j * j2));
    }

    @Override // X.InterfaceC21020s6
    public final int LJJ() {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (videoCapturerControl = liveCore.getVideoCapturerControl()) != null) {
            return videoCapturerControl.queryZoomAbility(true, false);
        }
        return -1;
    }

    @Override // X.InterfaceC21020s6
    public final IAudioFilterManager getAudioFilterMgr() {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            return liveCore.getAudioFilterMgr();
        }
        return null;
    }

    @Override // X.InterfaceC21020s6
    public final int getExposureCompensationRange() {
        IVideoCapturerControl.Range range;
        int i;
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (videoCapturerControl = liveCore.getVideoCapturerControl()) != null) {
            range = videoCapturerControl.getExposureCompensationRange();
        } else {
            range = null;
        }
        int i2 = 0;
        if (range != null) {
            i = (int) range.min;
            i2 = (int) range.max;
        } else {
            i = 0;
        }
        return Math.abs(i2) + Math.abs(i);
    }

    @Override // X.InterfaceC21020s6
    public final IFilterManager getVideoFilterMgr() {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            return liveCore.getVideoFilterMgr();
        }
        return null;
    }

    @Override // X.InterfaceC21020s6
    public final void stop() {
        if (this.LJIIIIZZ != 10008) {
            this.LJIIIIZZ = 0;
        }
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.stop();
        }
        IAVPlayer iAVPlayer = C2R.LIZIZ;
        if (iAVPlayer != null) {
            iAVPlayer.stop();
        }
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onStop();
        }
        this.LJIIL.removeCallbacks(this.LJIILJJIL);
    }

    @Override // X.InterfaceC21020s6
    public final LiveCore getLiveCore() {
        return this.LJ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0s5] */
    public CKO(C14090gv config) {
        int i;
        JSONObject jSONObject;
        AudioDeviceModule adm;
        Object obj;
        LiveCore.Builder builder;
        LiveCore.Builder builder2;
        o.LJIIIZ(config, "config");
        this.LIZ = config;
        this.LIZIZ = new Object() { // from class: X.0s5
        };
        this.LJIIIIZZ = -1;
        this.LJIIL = new Handler(C16880lQ.LLJJJJ());
        this.LJIILIIL = new ARunnableS41S0100000_5(this, 9);
        this.LJIILJJIL = new ARunnableS41S0100000_5(this, 10);
        this.LJIILL = C221108m2.LIZIZ(C31140CKa.LJLIL);
        this.LJIILLIIL = new CKT(this);
        this.LJIJ = new CKR(this);
        try {
            MediaEngineFactory.nativeSetupClassLoader();
        } catch (Throwable unused) {
        }
        LiveCore.Builder builder3 = new LiveCore.Builder();
        LiveStreamBuilder.AppInfo appInfo = new LiveStreamBuilder.AppInfo();
        appInfo.setAppID(String.valueOf(C7N.LJIIL().appId()));
        appInfo.setAppVersion(C7N.LJIIL().getVersionCode());
        appInfo.setDeviceId(C7N.LJIIL().getServerDeviceId());
        builder3.setAppInfo(appInfo);
        LiveStreamThreadPrioritySettings liveStreamThreadPrioritySettings = new LiveStreamThreadPrioritySettings();
        for (EnumC31148CKi enumC31148CKi : EnumC31148CKi.values()) {
            LiveStreamThreadType threadType = enumC31148CKi.getThreadType();
            LiveStreamABThreadPrioritSettings liveStreamABThreadPrioritSettings = LiveStreamABThreadPrioritSettings.INSTANCE;
            liveStreamThreadPrioritySettings.addSettings(threadType, liveStreamABThreadPrioritSettings.isEnabled(enumC31148CKi), liveStreamABThreadPrioritSettings.getThreadPriority(enumC31148CKi));
        }
        builder3.setPrioritySettings(liveStreamThreadPrioritySettings);
        builder3.setThreadConfigs(TTLSThreadPrioritySettings.INSTANCE.getThreadConfigs());
        builder3.setVideoE2EDelaySampleInterval(BroadcastVideoE2EDelaySampleSetting.INSTANCE.getValue());
        QualcommGpuHintSettings qualcommGpuHintSettings = QualcommGpuHintSettings.INSTANCE;
        builder3.setGpuHintSettings(new LiveStreamGpuHintSettings(qualcommGpuHintSettings.getType(), qualcommGpuHintSettings.getTime(), qualcommGpuHintSettings.isEnable()));
        builder3.setGpuTurboDisabled(LiveTTLSGpuTurboSettings.INSTANCE.isGpuTurboDisabled());
        builder3.setEnableVideoEncodeAccelera(this.LIZ.LJIILIIL);
        builder3.setVideoProfile(this.LIZ.LJIILJJIL);
        builder3.setLogMonitor(new CKP(this.LIZ));
        builder3.setContext(this.LIZ.LIZ);
        builder3.setProjectKey(this.LIZ.LJJIJIIJI);
        builder3.setUploadLogInterval(5000L);
        builder3.setVideoFps(this.LIZ.LJI);
        builder3.setVideoBitrate(this.LIZ.LIZLLL * 1000);
        builder3.setVideoMaxBitrate(this.LIZ.LJFF * 1000);
        builder3.setVideoMinBitrate(this.LIZ.LJ * 1000);
        builder3.setVideoWidth(this.LIZ.LJIIJJI);
        builder3.setVideoHeight(this.LIZ.LJIIL);
        builder3.setVideoCaptureDevice(this.LIZ.LJIL);
        builder3.setUsingVECamera2API(LiveVECamera2Setting.INSTANCE.enable());
        builder3.setUseCameraVideoPtsInRtc(TTLSUseCameraCaptureVideoPtsInRtc.INSTANCE.enabled());
        builder3.setAudioChannel(2);
        builder3.setAudioProfile(this.LIZ.LJIJ);
        if (this.LIZ.LJIJ == 1) {
            i = 128000;
        } else {
            i = 64000;
        }
        builder3.setAudioBitrate(i);
        builder3.setAudioCaptureChannel(2);
        builder3.setAudioSampleHZ(this.LIZ.LJIIZILJ);
        builder3.setAudioCaptureDevice(this.LIZ.LJJ);
        ByteAudioConfig byteAudioConfig = this.LIZ.LJJI;
        if (byteAudioConfig != null && byteAudioConfig.admType >= 0) {
            String str = byteAudioConfig.admServerCfg;
            o.LJIIIIZZ(str, "config.mByteAudioConfig.admServerCfg");
            if (str.length() > 0) {
                builder3.setAdmType(this.LIZ.LJJI.admType, new JSONObject(this.LIZ.LJJI.admServerCfg));
            }
        }
        builder3.setUsingLiveStreamAudioCapture(this.LIZ.LJJIJ);
        builder3.setRtmpReconnectCounts(this.LIZ.LJIILL);
        builder3.setRtmpReconnectIntervalSeconds(5);
        builder3.setVideoEncoder(this.LIZ.LJJIIJ);
        builder3.setEnableVideoBFrame(this.LIZ.LJJIII);
        builder3.setVideoGopSec(this.LIZ.LJJII);
        builder3.setBitrateAdaptStrategy(this.LIZ.LJJIFFI);
        builder3.setRoiOn(this.LIZ.LJJIIJZLJL ? 1 : 0, true);
        builder3.setRoiOn(this.LIZ.LJJIIZ ? 1 : 0, false);
        String str2 = this.LIZ.LJJIIZI;
        builder3.setRoiAssetDir(str2 == null ? "" : str2);
        builder3.setBgMode(this.LIZ.LJJIZ);
        builder3.setAudioQuantizeGapPeriod(LinkMicGuestMicEffectSetting.INSTANCE.getValue());
        builder3.setEnableScopeMonitor(this.LIZ.LJJJIL);
        builder3.setFilterLogSwitch(this.LIZ.LJJJJ);
        builder3.getSdkSetting().enableCopyOesProcess = LiveEnableCopyOesSetting.INSTANCE.getValue();
        builder3.getSdkSetting().enableCopyOesProcessCheckSupport = LiveEnableCopyOesCheckDeviceSupportSetting.INSTANCE.getValue();
        builder3.getSdkSetting().enablePtsAdjust = LiveEnablePtsAdjustSetting.INSTANCE.getValue();
        builder3.setInitEncodeAndPublish(this.LIZ.LJJJJI);
        builder3.setEnableKTV(this.LIZ.LJJJJIZL);
        builder3.setEnablePitchShift(this.LIZ.LJJJJJ);
        TestStreamConfigSetting testStreamConfigSetting = TestStreamConfigSetting.INSTANCE;
        if (testStreamConfigSetting.getValue() != null && testStreamConfigSetting.getValue().mEnable) {
            C14090gv c14090gv = this.LIZ;
            java.util.Map<String, String> stringMap = testStreamConfigSetting.getValue().getStringMap();
            o.LJIIIIZZ(stringMap, "TestStreamConfigSetting.getValue().stringMap");
            String str3 = this.LIZ.LJJIJIIJIL;
            o.LJIIIIZZ(str3, "config.mSdkParams");
            JSONObject jSONObject2 = new JSONObject(str3);
            JSONObject jSONObject3 = new JSONObject(JSONObjectProtectorUtils.getString(jSONObject2, "PushBase"));
            for (Map.Entry<String, String> entry : stringMap.entrySet()) {
                jSONObject3.put(entry.getKey(), entry.getValue());
            }
            jSONObject2.put("PushBase", jSONObject3);
            String jSONObject4 = jSONObject2.toString();
            o.LJIIIIZZ(jSONObject4, "jsonObject.toString()");
            c14090gv.LJJIJIIJIL = jSONObject4;
        }
        if (LinkmicSdkAndroidCaptureResolutionFixSetting.INSTANCE.isFix()) {
            builder3.getPushBase().disableUpdateVideoCapture = false;
        }
        int i2 = this.LIZ.LJII;
        if (i2 > 0) {
            builder3.setVideoCaptureFps(i2);
        }
        int i3 = this.LIZ.LJIIIIZZ;
        if (i3 == 1) {
            builder3.getVideoCaptureParams().enableChangeCameraFpsWhenRunning = true;
        } else if (i3 == 2) {
            builder3.getVideoCaptureParams().enableChangeCameraFpsWhenRunning = false;
        }
        builder3.setupSdkParams(this.LIZ.LJJIJIIJIL);
        C14090gv c14090gv2 = this.LIZ;
        if (c14090gv2.LIZJ == 2) {
            Point LIZIZ = C22850v3.LIZIZ(c14090gv2.LJIIIZ, c14090gv2.LJIIJ, builder3.getVideoWidth(), builder3.getVideoHeight());
            builder3.setVideoWidth(LIZIZ.x);
            builder3.setVideoHeight(LIZIZ.y);
            builder3.setVideoCaptureWidth(builder3.getVideoWidth());
            builder3.setVideoCaptureHeight(builder3.getVideoHeight());
            builder3.setHWEncodeOesDirectly(true);
            if (((IGameService) CN1.LIZ(IGameService.class)).rH()) {
                ((IGameService) CN1.LIZ(IGameService.class)).sm(builder3);
            }
            DataChannelGlobal.LJLJJI.tv0(MobileGameStreamInfo.class, new C31145CKf(builder3.getVideoMinBitrate(), builder3.getVideoBitrate(), builder3.getVideoMaxBitrate()));
        } else {
            if (!OverrideCaptureResolutionFixSetting.INSTANCE.getValue()) {
                builder3.setVideoCaptureWidth(this.LIZ.LJIIIZ);
                builder3.setVideoCaptureHeight(this.LIZ.LJIIJ);
            }
            builder3.setAssetManager(this.LIZ.LJJIJIL);
            builder3.setEffectModePath(this.LIZ.LJJIJLIJ);
            builder3.setEffectResourceFinder(this.LIZ.LJJIJL);
            builder3.setEffectAlgorithmAB(this.LIZ.LJJIL);
            builder3.setUseNewEffectEngine(true);
            builder3.setEffectPlatformConfig(LiveEffectNewEngineConfigSetting.INSTANCE.getValue());
        }
        builder3.setLiveAuthString(this.LIZ.LJJJ);
        builder3.setCameraLogLevel(LiveCoreCameraLogLevelSetting.INSTANCE.getValue());
        builder3.setEnableVelivePusher(LiveAccessVeLivePusherSetting.INSTANCE.enableVelivePusher());
        TTLSMainVideoMixerSwitchSetting tTLSMainVideoMixerSwitchSetting = TTLSMainVideoMixerSwitchSetting.INSTANCE;
        builder3.setVideoMixerSwitch(tTLSMainVideoMixerSwitchSetting.enableMainVideoMixerSwitch());
        builder3.setVideoLayerMixerSwitch(TTLSLayerVideoMixerSwitchSetting.INSTANCE.enableLayerVideoMixerSwitch());
        builder3.setEncodeLockOptimize(TTLSVideoEncodeLockOptimizeSetting.INSTANCE.enableVideoEncodeLockOptimize());
        builder3.setCaptureReleaseLockOptimize(TTLSVideoCaptureReleaseLockOptimizeSetting.INSTANCE.enableVideoCaptureReleaseLockOptimize());
        C0NB.LJ("LiveStream4", "builder.isEnableForceGlFinish: " + builder3.isEnableForceGlFinish());
        Intent intent = this.LIZ.LJIJJLI;
        if (intent != null) {
            builder3.setScreenCaptureIntent(intent);
        }
        int i4 = this.LIZ.LJJJJJL;
        if (i4 >= 0) {
            builder3.setPauseFps(i4);
        }
        builder3.setPauseDisableEffectSwitch(this.LIZ.LJJJJL);
        LiveCore create = builder3.create();
        create.setErrorListener(this.LJIILLIIL);
        create.setInfoListener(this.LJIJ);
        if (this.LIZ.LIZJ == 2) {
            create.enableMixer(true, true);
            if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
                create.enableMixer(false, true);
            } else {
                create.enableMixer(false, false);
            }
        } else {
            create.enableMixer(true, true);
            create.enableMixer(false, tTLSMainVideoMixerSwitchSetting.enableMainVideoMixerSwitch());
        }
        IFilterManager videoFilterMgr = create.getVideoFilterMgr();
        try {
            jSONObject = new JSONObject(LiveEffectSDKConfigSetting.INSTANCE.getValue());
        } catch (JSONException unused2) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("effect_config_live_enable_console_logging", LiveEnableEffectConfigLogSetting.INSTANCE.enable());
        jSONObject.put("enable_console_logging", LiveEnableEffectLogSetting.INSTANCE.enable());
        videoFilterMgr.setABInfoToEffect(jSONObject, "live");
        create.getVideoFilterMgr().setLicenseToEffect("live", true);
        this.LJ = create;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("videoFps=");
            LiveCore liveCore = this.LJ;
            Object obj2 = null;
            if (liveCore != null && (builder2 = liveCore.getBuilder()) != null) {
                obj = Integer.valueOf(builder2.getVideoFps());
            } else {
                obj = null;
            }
            LIZ.append(obj);
            LIZ.append(", videoCaptureFps=");
            LiveCore liveCore2 = this.LJ;
            if (liveCore2 != null && (builder = liveCore2.getBuilder()) != null) {
                obj2 = Integer.valueOf(builder.getVideoCaptureFps());
            }
            LIZ.append(obj2);
            C0NB.LJIIIZ("LiveStreamTag", X1D.LIZIZ(LIZ));
        }
        LiveAdmNsTypeSetting liveAdmNsTypeSetting = LiveAdmNsTypeSetting.INSTANCE;
        if (liveAdmNsTypeSetting.getAdmNsType() == 3) {
            TEBundle tEBundle = new TEBundle();
            if (new File(C78983UzD.LJJIIJZLJL(CKX.LIZ(""))).exists()) {
                C28721BOz.LIZ();
                BP1.LIZ("#NsModelDownloaded", "livecore load");
                CKX.LIZIZ(tEBundle);
                LiveCore liveCore3 = this.LJ;
                if (liveCore3 != null) {
                    liveCore3.updateSdkParams(tEBundle);
                }
            } else {
                CKX.LIZIZ = this.LJ;
                C79258V8s.LIZ.LIZIZ(CKX.LIZ(liveAdmNsTypeSetting.getAdmNsUrl()), new AqS171S0100000_5(tEBundle, 44));
            }
        }
        if (liveAdmNsTypeSetting.getAdmNsType() == 4) {
            TEBundle tEBundle2 = new TEBundle();
            CKX.LIZJ = 4;
            if (new File(C78983UzD.LJJIIJZLJL(CKX.LIZ(""))).exists()) {
                C28721BOz.LIZ();
                BP1.LIZ("#NsModelDownloaded", "livecore load");
                CKX.LIZIZ(tEBundle2);
                LiveCore liveCore4 = this.LJ;
                if (liveCore4 != null) {
                    liveCore4.updateSdkParams(tEBundle2);
                }
            } else {
                CKX.LIZIZ = this.LJ;
                C79258V8s.LIZ.LIZIZ(CKX.LIZ(liveAdmNsTypeSetting.getAdmNsUrl()), new AqS171S0100000_5(tEBundle2, 44));
            }
        }
        if (new File(C78983UzD.LJJIIJZLJL(CKW.LIZ())).exists()) {
            C28721BOz.LIZ();
            BP1.LIZ("#AudioMetricModelDownloaded", "livecore load");
            LiveCore liveCore5 = this.LJ;
            if (liveCore5 != null && (adm = liveCore5.getADM()) != null) {
                adm.setDiagnosisModelPath(C78983UzD.LJJIIJZLJL(CKW.LIZ()));
            }
        } else {
            CKW.LIZ = this.LJ;
            C31824CeK LIZ2 = CKW.LIZ();
            C79258V8s.LIZ.LIZIZ(LIZ2, new AqS171S0100000_5(LIZ2, 42));
        }
        if (this.LIZ.LJJJI && C30922CBq.LIZIZ) {
            InterfaceC92693kP LJJJLIIL = new C73620Suu(AbstractC73672Svk.LJJIJIL(0).LJIIL(2L, TimeUnit.SECONDS)).LJJJJJL(Long.MAX_VALUE, C73674Svm.LJI).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 16), new InterfaceC64592gB() { // from class: X.9CZ
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj3) {
                }
            });
            C73318Sq2 cb = (C73318Sq2) this.LJIILL.getValue();
            o.LJIIIZ(cb, "cb");
            cb.LIZ(LJJJLIIL);
        }
        LivePerformanceManager LIZ3 = B4U.LIZ();
        C30749C4z c30749C4z = new C30749C4z(this);
        LIZ3.getClass();
        LIZ3.LLJILJILJ = new WeakReference<>(c30749C4z);
    }

    @Override // X.InterfaceC21020s6
    public final int LIZIZ(float f) {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (videoCapturerControl = liveCore.getVideoCapturerControl()) != null) {
            return videoCapturerControl.startZoom(true, f);
        }
        return -1;
    }

    @Override // X.InterfaceC21020s6
    public final void LIZJ(Cert cert) {
        o.LJIIIZ(cert, "cert");
        if (LiveBackgroundTimeOutSetting.INSTANCE.enable()) {
            this.LJIIL.postDelayed(this.LJIILIIL, this.LIZ.LJIILLIIL);
        }
        Client client = this.LJI;
        if (client != null) {
            client.pause();
        }
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.setAudioMute(true, cert);
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null) {
            liveCore2.pause(cert);
        }
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onPause();
        }
        IAVPlayer iAVPlayer = C2R.LIZIZ;
        if (iAVPlayer != null) {
            iAVPlayer.stop();
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LIZLLL(Cert cert) {
        o.LJIIIZ(cert, "cert");
        InterfaceC21030s7 interfaceC21030s7 = this.LJII;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.s2(this.LJ, cert);
        }
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.startAudioCapture(cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJFF(Cert cert) {
        o.LJIIIZ(cert, "cert");
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.startVideoCapture(cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIIIIZZ(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        LiveCore liveCore;
        if (iTextureFrameAvailableListener != null && (liveCore = this.LJ) != null) {
            liveCore.removeTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIIIZ(float f) {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.setScreenInteralAudioVolume(f);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIIJ(List<String> list) {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.stop();
        }
        if (((ArrayList) list).size() <= 0) {
            start(this.LIZ.LIZIZ);
            return;
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null) {
            liveCore2.start(list);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIIJJI(AbstractC39330Fc6 cert) {
        o.LJIIIZ(cert, "cert");
        Client client = this.LJI;
        if (client != null) {
            client.resume();
        }
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.resume(cert);
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null) {
            liveCore2.setAudioMute(this.LJIIIZ, cert);
        }
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onResume();
        }
        this.LJIIL.removeCallbacks(this.LJIILIIL);
    }

    @Override // X.InterfaceC21020s6
    public final void LJIILLIIL(Cert cert) {
        o.LJIIIZ(cert, "cert");
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.stopVideoCapture(cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIJ(boolean z) {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.enableMirror(!z, true);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIJI(Cert cert) {
        o.LJIIIZ(cert, "cert");
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.stopAudioCapture(cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIJJ(float f) {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.setScreenMicAudioVolume(f);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIJJLI(AbstractC39330Fc6 cert) {
        LiveCore.Builder.ILogMonitor iLogMonitor;
        LiveCore liveCore;
        LiveCore.Builder.ILogMonitor iLogMonitor2;
        LiveCore.Builder builder;
        LiveCore.Builder builder2;
        o.LJIIIZ(cert, "cert");
        InteractEngineImpl interactEngineImpl = this.LJFF;
        if (interactEngineImpl != null) {
            interactEngineImpl.dispose();
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null && (builder2 = liveCore2.getBuilder()) != null) {
            iLogMonitor = builder2.getLogMonitor();
        } else {
            iLogMonitor = null;
        }
        if (iLogMonitor instanceof CKP) {
            LiveCore liveCore3 = this.LJ;
            if (liveCore3 != null && (builder = liveCore3.getBuilder()) != null) {
                iLogMonitor2 = builder.getLogMonitor();
            } else {
                iLogMonitor2 = null;
            }
            o.LJII(iLogMonitor2, "null cannot be cast to non-null type com.bytedance.android.livesdk.broadcast.stream.LogMonitor");
            ((CKP) iLogMonitor2).LIZLLL = null;
        }
        LiveCore liveCore4 = this.LJ;
        if (liveCore4 != null) {
            liveCore4.enableMixer(true, false);
        }
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            if (this.LIZ.LIZJ != 2 && (liveCore = this.LJ) != null) {
                liveCore.enableMixer(false, false);
            }
        } else {
            LiveCore liveCore5 = this.LJ;
            if (liveCore5 != null) {
                liveCore5.enableMixer(false, false);
            }
        }
        IAVPlayer iAVPlayer = C2R.LIZIZ;
        if (iAVPlayer != null) {
            iAVPlayer.stop();
        }
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onRelease();
        }
        LiveCore liveCore6 = this.LJ;
        if (liveCore6 != null) {
            liveCore6.stop();
        }
        LiveCore liveCore7 = this.LJ;
        if (liveCore7 != null) {
            liveCore7.release(cert);
        }
        this.LJ = null;
        this.LJIIL.removeCallbacksAndMessages(null);
        this.LJII = null;
        ((C73318Sq2) this.LJIILL.getValue()).LIZLLL();
    }

    @Override // X.InterfaceC21020s6
    public final void LJJI(C78862UxG c78862UxG) {
        LiveCore.Builder builder;
        LiveCore liveCore = this.LJ;
        int i = 1;
        if (liveCore != null && (builder = liveCore.getBuilder()) != null && builder.getVideoCaptureDevice() == 1) {
            i = 2;
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null) {
            liveCore2.switchVideoCapture(i, c78862UxG);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJJIFFI(C1KW c1kw) {
        this.LJIJI = c1kw;
    }

    @Override // X.InterfaceC21020s6
    public final void LJJII(AbstractC39330Fc6 cert) {
        LiveCore liveCore;
        o.LJIIIZ(cert, "cert");
        if (!TestDisableCameraCaptureSetting.INSTANCE.getValue() && (liveCore = this.LJ) != null) {
            liveCore.startVideoCapture(cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJJIIJ(AbstractC39330Fc6 cert) {
        LiveCore.Builder builder;
        o.LJIIIZ(cert, "cert");
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (builder = liveCore.getBuilder()) != null) {
            builder.setBgMode(2);
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null) {
            liveCore2.resume(cert);
        }
        LiveCore liveCore3 = this.LJ;
        if (liveCore3 != null) {
            liveCore3.setAudioMute(this.LJIIIZ, cert);
        }
        this.LJIIL.removeCallbacks(this.LJIILIIL);
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onResume();
        }
        getClass();
        InterfaceC21030s7 interfaceC21030s7 = this.LJII;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.hc(this.LJ, cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJJIIZI(Cert cert) {
        o.LJIIIZ(cert, "cert");
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.stopVideoCapture(cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJJIJ(View displayView) {
        View view;
        LiveCore liveCore;
        o.LJIIIZ(displayView, "displayView");
        if (TestDisableStreamPreviewSetting.INSTANCE.getValue()) {
            return;
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null) {
            view = liveCore2.getCurrentDisplay();
        } else {
            view = null;
        }
        if (!o.LJ(view, displayView) && (liveCore = this.LJ) != null) {
            liveCore.setDisplay(displayView);
        }
    }

    public final void LJJIJIIJI(long j) {
        Client client = this.LJI;
        if (client != null) {
            client.setLocalTimeGapWithServer((int) j);
        }
    }

    @Override // X.InterfaceC21020s6
    public final Client create(InteractConfig config) {
        Client client;
        o.LJIIIZ(config, "config");
        config.setAppChannel(C7N.LJIIL().getChannel());
        config.setDeviceId(C7N.LJIIL().getServerDeviceId());
        config.setAppId(String.valueOf(C7N.LJIIL().appId()));
        if (C107244Iu.LIZIZ(config.getAppVersion())) {
            config.setAppVersion(C7N.LJIIL().getVersionCode());
        }
        if (this.LJFF == null) {
            synchronized (CKO.class) {
                if (this.LJFF == null) {
                    this.LJFF = new InteractEngineImpl(this.LJ);
                }
            }
        }
        config.setVideoFrozenLimitMSec(RemoteVideoFrozenSetting.INSTANCE.getValue());
        InteractEngineImpl interactEngineImpl = this.LJFF;
        if (interactEngineImpl != null) {
            client = interactEngineImpl.create(config);
        } else {
            client = null;
        }
        this.LJI = client;
        if (client == null) {
            C0K2.LIZ("create interact client failed", new Throwable());
        }
        return this.LJI;
    }

    @Override // X.InterfaceC21020s6
    public final void setErrorListener(ILiveStream.ILiveStreamErrorListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZJ = listener;
    }

    @Override // X.InterfaceC21020s6
    public final void setExposureCompensation(float f) {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (videoCapturerControl = liveCore.getVideoCapturerControl()) != null) {
            videoCapturerControl.setExposureCompensation(f);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void setInfoListener(ILiveStream.ILiveStreamInfoListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZLLL = listener;
    }

    @Override // X.InterfaceC21020s6
    public final void setStreamCallback(InterfaceC21030s7 interfaceC21030s7) {
        LiveCore.Builder.ILogMonitor iLogMonitor;
        LiveCore.Builder builder;
        LiveCore.Builder builder2;
        this.LJII = interfaceC21030s7;
        LiveCore liveCore = this.LJ;
        LiveCore.Builder.ILogMonitor iLogMonitor2 = null;
        if (liveCore != null && (builder2 = liveCore.getBuilder()) != null) {
            iLogMonitor = builder2.getLogMonitor();
        } else {
            iLogMonitor = null;
        }
        if (iLogMonitor instanceof CKP) {
            LiveCore liveCore2 = this.LJ;
            if (liveCore2 != null && (builder = liveCore2.getBuilder()) != null) {
                iLogMonitor2 = builder.getLogMonitor();
            }
            o.LJII(iLogMonitor2, "null cannot be cast to non-null type com.bytedance.android.livesdk.broadcast.stream.LogMonitor");
            ((CKP) iLogMonitor2).LIZLLL = interfaceC21030s7;
        }
    }

    @Override // X.InterfaceC21020s6
    public final void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        LiveCore liveCore;
        if (iTextureFrameAvailableListener != null && (liveCore = this.LJ) != null) {
            liveCore.addTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void start(List<String> list) {
        if (TestDisablePushStreamSetting.INSTANCE.getValue()) {
            return;
        }
        if (list == null || list.size() <= 0) {
            start(this.LIZ.LIZIZ);
            return;
        }
        InterfaceC21030s7 interfaceC21030s7 = this.LJII;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.v3();
        }
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.start(list);
        }
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onStart();
        }
        this.LJIIL.postDelayed(this.LJIILJJIL, 3000L);
    }

    @Override // X.InterfaceC21020s6
    public final void start(String str) {
        if (TestDisablePushStreamSetting.INSTANCE.getValue()) {
            return;
        }
        if (str == null || str.length() == 0) {
            str = this.LIZ.LIZIZ;
        }
        InterfaceC21030s7 interfaceC21030s7 = this.LJII;
        if (interfaceC21030s7 != null) {
            interfaceC21030s7.v3();
        }
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.start(str);
        }
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onStart();
        }
        this.LJIIL.postDelayed(this.LJIILJJIL, 3000L);
    }

    @Override // X.InterfaceC21020s6
    public final void LJ(Bundle bundle, C30529ByX callback) {
        o.LJIIIZ(callback, "callback");
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.catchVideo(bundle, callback);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIIL(boolean z, AbstractC39330Fc6 cert) {
        o.LJIIIZ(cert, "cert");
        this.LJIIIZ = z;
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.setAudioMute(z, cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIILIIL(Bundle bundle, CKK ckk) {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.catchMediaData(bundle, (ILiveStream.CatchPicCallback) ckk);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJIILL(Bitmap bgParam, Cert cert) {
        LiveCore.Builder builder;
        o.LJIIIZ(bgParam, "bgParam");
        o.LJIIIZ(cert, "cert");
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.setAudioMute(true, cert);
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null) {
            liveCore2.setBackGroundPhotoPath(bgParam);
        }
        LiveCore liveCore3 = this.LJ;
        if (liveCore3 != null && (builder = liveCore3.getBuilder()) != null) {
            builder.setBgMode(3);
        }
        InterfaceC21000s4 interfaceC21000s4 = this.LJIJI;
        if (interfaceC21000s4 != null) {
            interfaceC21000s4.onPause();
        }
        IAVPlayer iAVPlayer = C2R.LIZIZ;
        if (iAVPlayer != null) {
            iAVPlayer.stop();
        }
        LiveCore liveCore4 = this.LJ;
        if (liveCore4 != null) {
            liveCore4.pause(cert);
        }
        getClass();
    }

    @Override // X.InterfaceC21020s6
    public final void LJJIIJZLJL(int i, Cert cert) {
        o.LJIIIZ(cert, "cert");
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.switchVideoCapture(i, cert);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void LJJIIZ(Bundle bundle, CKV ckv) {
        ILayerControl layerControl;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (layerControl = liveCore.getLayerControl()) != null) {
            layerControl.catchImage(bundle.getFloat("x", 0.0f), bundle.getFloat("y", 0.0f), bundle.getFloat("w", 0.0f), bundle.getFloat("h", 0.0f), ckv);
        }
    }

    @Override // X.InterfaceC21020s6, X.InterfaceC08140Tq
    public final boolean LIZ(String str, JSONObject jSONObject, boolean z) {
        C22950vD.LIZ(jSONObject);
        LiveCore liveCore = this.LJ;
        if (liveCore != null && liveCore.addSeiField(str, jSONObject, 1, false, z) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21020s6
    public final void LJJIII(boolean z, String str, BZG bzg) {
        IVideoCapturerControl videoCapturerControl;
        IVideoCapturerControl videoCapturerControl2;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (videoCapturerControl2 = liveCore.getVideoCapturerControl()) != null) {
            TaintSceneDetectParamsWrapper taintSceneDetectParamsWrapper = new TaintSceneDetectParamsWrapper();
            taintSceneDetectParamsWrapper.modelPath = str;
            videoCapturerControl2.addCameraAlgorithm(taintSceneDetectParamsWrapper, z);
        }
        LiveCore liveCore2 = this.LJ;
        if (liveCore2 != null && (videoCapturerControl = liveCore2.getVideoCapturerControl()) != null) {
            videoCapturerControl.setLensCallback(new BZH(bzg));
        }
    }

    public final void LJJIJIIJIL(int i, int i2, int i3, long j) {
        LiveCore liveCore = this.LJ;
        if (liveCore != null) {
            liveCore.pushVideoFrame(i, false, i2, i3, 180, LJIJJ, j * 1000);
        }
    }

    @Override // X.InterfaceC21020s6
    public final void setFocusAreas(int i, int i2, int i3, int i4) {
        IVideoCapturerControl videoCapturerControl;
        LiveCore liveCore = this.LJ;
        if (liveCore != null && (videoCapturerControl = liveCore.getVideoCapturerControl()) != null) {
            videoCapturerControl.setFocusAreas(i, i2, i3, i4);
        }
    }
}
