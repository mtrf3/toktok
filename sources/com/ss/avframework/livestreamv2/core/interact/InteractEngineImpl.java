package com.ss.avframework.livestreamv2.core.interact;

import X.C16880lQ;
import X.Q7L;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.media.MediaEngine;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import com.ss.avframework.livestreamv2.core.interact.utils.InteractThreadUtils;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import com.ss.ttlivestreamer.livestreamv2.utils.UrlUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class InteractEngineImpl implements InteractEngine, InteractLogService.LogCallback, LiveCore.ILiveForInteractListener {
    public static AtomicInteger mAtomicInteger = new AtomicInteger(0);
    public static InteractEngineImpl sInteractEngine;
    public String m1stAddClientStack;
    public ArrayList<Client> mClientsList;
    public InteractConfig mConfig;
    public InteractEngineBuilder mEngineBuilder;
    public boolean mIsDispose;
    public LiveCore mLiveCore;
    public LiveCore.Builder.ILogMonitor mLogMonitor;
    public MediaEngine mMediaEngine;
    public int mRegionCount;
    public RTCEngineWrapper mRtcEngine;
    public JSONObject mRtcEngineParamters;
    public Map<String, Integer> mRtcMaps;
    public Runnable mTaskAfterPushStream;
    public final Object mTaskFence = new Object();
    public Runnable mStopLiveStreamTimeoutRunnable = new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.1
        @Override // java.lang.Runnable
        public void run() {
            com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$1__run$___twin___() {
            LiveCore liveCore = InteractEngineImpl.this.mEngineBuilder.getLiveCore();
            if (liveCore != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("timeout if rtmp still pushing, status:");
                LIZ.append(liveCore.status());
                AVLog.logKibana(4, "InteractEngineImpl", X1D.LIZIZ(LIZ), null);
                if (liveCore.status() != 7) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("stop stream timeout with duration:");
                    LIZ2.append(InteractEngineImpl.this.mEngineBuilder.getVPassInteractCfg().interactDelayStopStreamTime);
                    AVLog.logKibana(4, "InteractEngineImpl", X1D.LIZIZ(LIZ2), null);
                    InteractEngineImpl.this.stopLiveStream();
                }
            }
        }

        public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public JSONObject mMixOnClientParams = null;
    public String mRtcAppid = "";
    public String mInteractId = "";

    public synchronized void checkReleaseRtcEngine() {
        ArrayList<Client> arrayList = this.mClientsList;
        if (arrayList != null && arrayList.size() == 0 && InteractThreadUtils.getWorkThreadHandler() != null && !InteractThreadUtils.getWorkThreadHandler().post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.11
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$11__run$___twin___() {
                InteractEngineImpl.this.destroyLiveRTCEngine();
                InteractEngineImpl.this.mRtcEngine = null;
            }

            public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            destroyLiveRTCEngine();
            this.mRtcEngine = null;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.InteractEngine
    public synchronized void dispose() {
        if (this.mIsDispose) {
            return;
        }
        this.mIsDispose = true;
        stopClientAndDestoryEngine();
        MediaEngine mediaEngine = this.mMediaEngine;
        if (mediaEngine != null) {
            mediaEngine.unRegisterFrameAvailableListener();
        }
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.12
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$12__run$___twin___() {
                MediaEngine mediaEngine2 = InteractEngineImpl.this.mMediaEngine;
                if (mediaEngine2 != null) {
                    mediaEngine2.stop();
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                boolean LIZ;
                try {
                    anonymousClass12.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$12__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        InteractThreadUtils.destroyThread();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.ILiveForInteractListener
    public void onWarning(int i, int i2, int i3, Object... objArr) {
    }

    public void startPushData(Client client) {
    }

    private void checkInteractCfg() {
        boolean z;
        boolean z2;
        InteractConfig interactConfig = this.mConfig;
        VPassInteractCfg vPassInteractCfg = this.mEngineBuilder.getVPassInteractCfg();
        if (interactConfig == null || vPassInteractCfg == null) {
            return;
        }
        boolean z3 = false;
        if (interactConfig.getCharacter() == Config.Character.ANCHOR) {
            z = true;
            if (interactConfig.getMixStreamType() == Config.MixStreamType.NONE) {
                this.mConfig.setMixStreamType(Config.MixStreamType.SERVER_MIX);
            }
            if (interactConfig.getMixStreamType() != Config.MixStreamType.NONE && interactConfig.isNeedCheckClientMixerParams()) {
                this.mMixOnClientParams = vPassInteractCfg.mixOnClient;
                checkMixOnClientParams();
            }
        } else {
            z = false;
        }
        interactConfig.setLogReportInterval(5);
        interactConfig.setRoiOn(true);
        interactConfig.setEnableInteractConnectionStatics(false);
        interactConfig.setEnableRemoteUserStatics(vPassInteractCfg.enable_interact_remote_statics);
        boolean isEnableReportLiveCoreInfo = interactConfig.isEnableReportLiveCoreInfo();
        if (vPassInteractCfg.enable_report_livecore_info || isEnableReportLiveCoreInfo) {
            z2 = true;
        } else {
            z2 = false;
        }
        interactConfig.setEnableReportLiveCoreInfo(z2);
        LiveCore.Builder builder = this.mEngineBuilder.getLiveCore().getBuilder();
        if (z) {
            updateRtcMixParam();
        } else {
            Config.MixStreamType mixStreamType = interactConfig.getMixStreamType();
            Config.MixStreamType mixStreamType2 = Config.MixStreamType.NONE;
            if (mixStreamType != mixStreamType2) {
                AVLog.iow("InteractEngineImpl", "Guest doesn't need mix stream!");
                interactConfig.setMixStreamType(mixStreamType2);
            }
        }
        this.mEngineBuilder.setMixStreamType(interactConfig.getMixStreamType());
        InteractEngineBuilder interactEngineBuilder = this.mEngineBuilder;
        if (builder.getAdmType() == 1) {
            z3 = true;
        }
        interactEngineBuilder.setByteAudioEnabled(z3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdmType: ");
        LIZ.append(builder.getAdmType());
        AVLog.w("InteractEngineImpl", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AdmType: ");
        LIZ2.append(builder.getAdmType());
        AVLog.iow("InteractEngineImpl", X1D.LIZIZ(LIZ2));
        interactConfig.setSharedEGLContext14(GLThreadManager.getEGLContext());
        if (interactConfig.getHandler() == null) {
            interactConfig.setHandler(InteractThreadUtils.getWorkThreadHandler());
        }
        MediaEngine mediaEngine = this.mMediaEngine;
        if (mediaEngine == null) {
            return;
        }
        mediaEngine.setConfig(this.mConfig);
    }

    private boolean checkLiveStreamUrlChanged() {
        InteractEngineBuilder interactEngineBuilder = this.mEngineBuilder;
        String str = interactEngineBuilder.mOriginUrl;
        interactEngineBuilder.updateOriginUrl();
        return !str.equals(this.mEngineBuilder.mOriginUrl);
    }

    private void checkMixOnClientParams() {
        Config.MixStreamType mixStreamType;
        try {
            if (this.mMixOnClientParams != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mixOnClient Params:");
                LIZ.append(this.mMixOnClientParams.toString());
                AVLog.logKibana(5, "InteractEngineImpl", X1D.LIZIZ(LIZ), null);
                boolean checkVendorClientMixPercentage = checkVendorClientMixPercentage();
                if (this.mConfig.getMixStreamType() != Config.MixStreamType.NONE) {
                    if (checkVendorClientMixPercentage) {
                        if (this.mEngineBuilder.getVPassInteractCfg().interactUsingRtcClientMix) {
                            this.mConfig.setMixStreamType(Config.MixStreamType.RTC_CLIENT_MIX);
                        } else {
                            this.mConfig.setMixStreamType(Config.MixStreamType.CLIENT_MIX);
                        }
                    } else {
                        this.mConfig.setMixStreamType(Config.MixStreamType.SERVER_MIX);
                    }
                }
            }
        } catch (Exception unused) {
        }
        int mixType = RTCEngineWrapper.getMixType(this.mConfig.getRtcExtInfo());
        if (mixType == 0 || mixType == 1) {
            InteractConfig interactConfig = this.mConfig;
            if (mixType == 1) {
                mixStreamType = Config.MixStreamType.CLIENT_MIX;
            } else {
                mixStreamType = Config.MixStreamType.SERVER_MIX;
            }
            interactConfig.setMixStreamType(mixStreamType);
        }
    }

    private void disableBuiltInNS() {
        AudioDeviceModule adm;
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null && (adm = liveCore.getADM()) != null) {
            adm.enableBuiltInNS(false);
        }
    }

    private void sendPushRestartMessage() {
        InteractConfig interactConfig = this.mConfig;
        if (interactConfig != null) {
            interactConfig.setMixStreamRtmpUrl(null);
        }
        ArrayList<Client> arrayList = this.mClientsList;
        if (arrayList != null && !arrayList.isEmpty()) {
            synchronized (this.mClientsList) {
                Iterator<Client> it = this.mClientsList.iterator();
                while (it.hasNext()) {
                    Client next = it.next();
                    if (next instanceof ClientImpl) {
                        ((ClientImpl) next).restartServerMix();
                    }
                }
            }
        }
    }

    private void setByteRtcSoLoader() {
        RTCEngine.setRtcNativeLibraryLoader(new RTCNativeLibraryLoader() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.2
            @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoader
            public boolean load(String str) {
                int i;
                try {
                    boolean loadLibrary = LibraryLoader.loadLibrary(str);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("RtcNativeLibraryLoader load(");
                    LIZ.append(str);
                    LIZ.append("): ");
                    LIZ.append(loadLibrary);
                    AVLog.ioi("InteractEngineImpl", X1D.LIZIZ(LIZ));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_key", "load_rtc_library");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("loadLibraryPath", str);
                    jSONObject2.put("LibraryLoaderName", C16880lQ.LJLLJ(LibraryLoader.class));
                    jSONObject.put("message", jSONObject2.toString());
                    if (loadLibrary) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    jSONObject.put("error_code", i);
                    InteractEngineImpl.this.onLogReport("live_client_monitor_log", jSONObject);
                    return loadLibrary;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("RtcNativeLibraryLoader load(");
                    LIZ2.append(str);
                    LIZ2.append(") error");
                    AVLog.logToIODevice(6, "InteractEngineImpl", X1D.LIZIZ(LIZ2), e);
                    return false;
                }
            }
        });
        RTCVideo.setRtcNativeLibraryLoader(new RTCNativeLibraryLoader() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.3
            @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoader
            public boolean load(String str) {
                int i;
                try {
                    boolean loadLibrary = LibraryLoader.loadLibrary(str);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("RtcNativeLibraryLoader load(");
                    LIZ.append(str);
                    LIZ.append("): ");
                    LIZ.append(loadLibrary);
                    AVLog.ioi("InteractEngineImpl", X1D.LIZIZ(LIZ));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_key", "load_rtc_library");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("loadLibraryPath", str);
                    jSONObject2.put("LibraryLoaderName", C16880lQ.LJLLJ(LibraryLoader.class));
                    jSONObject.put("message", jSONObject2.toString());
                    if (loadLibrary) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    jSONObject.put("error_code", i);
                    InteractEngineImpl.this.onLogReport("live_client_monitor_log", jSONObject);
                    return loadLibrary;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("RtcNativeLibraryLoader load(");
                    LIZ2.append(str);
                    LIZ2.append(") error");
                    AVLog.logToIODevice(6, "InteractEngineImpl", X1D.LIZIZ(LIZ2), e);
                    return false;
                }
            }
        });
    }

    private void setRtcEglContextChecker() {
        try {
            Class<?> cls = Class.forName("com.ss.video.rtc.engine.RtcEngine");
            Class<?> cls2 = Class.forName("com.ss.video.rtc.engine.utils.RtcEglContextChecker");
            Method method = cls.getMethod("setRtcEglContextChecker", cls2);
            if (method != null) {
                method.invoke(null, Proxy.newProxyInstance(InteractEngineImpl.class.getClassLoader(), new Class[]{cls2}, new RtcEglContextCheckerInvocationHandler()));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    private void stopClientAndDestoryEngine() {
        synchronized (this.mClientsList) {
            ArrayList<Client> arrayList = this.mClientsList;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Client> it = this.mClientsList.iterator();
                while (it.hasNext()) {
                    Client next = it.next();
                    if (next != null) {
                        next.stop();
                    }
                }
                this.mClientsList.clear();
            }
        }
        if (InteractThreadUtils.getWorkThreadHandler() != null && !InteractThreadUtils.getWorkThreadHandler().post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.10
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$10__run$___twin___() {
                InteractEngineImpl.this.destroyLiveRTCEngine();
                InteractEngineImpl.this.mRtcEngine = null;
            }

            public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            destroyLiveRTCEngine();
            this.mRtcEngine = null;
        }
    }

    private void stopInteractTask() {
        synchronized (this.mTaskFence) {
            Runnable runnable = this.mTaskAfterPushStream;
            if (runnable != null) {
                runnable.run();
            }
            this.mTaskAfterPushStream = null;
        }
    }

    public boolean checkVendorClientMixPercentage() {
        int currentTimeMillis = (int) (System.currentTimeMillis() % 100);
        try {
            JSONObject jSONObject = this.mMixOnClientParams;
            if (jSONObject == null || jSONObject.isNull("byte")) {
                return false;
            }
            if (JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(this.mMixOnClientParams, "byte"), this.mConfig.getInteractMode().toString()) <= currentTimeMillis) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public void destroyLiveRTCEngine() {
        RTCEngineWrapper rTCEngineWrapper = this.mRtcEngine;
        if (rTCEngineWrapper != null) {
            rTCEngineWrapper.doDestroy();
            this.mRtcEngine = null;
        }
    }

    public IInputVideoStream getOriginInputVideoStream() {
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            return liveCore.getOriginInputVideoStream();
        }
        return null;
    }

    public void interactStart() {
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.onInteractEvent(1, 0, new Object[0]);
        }
    }

    public void joinChannel() {
        AVLog.iod("InteractEngineImpl", "joinChannel");
        if (this.mMediaEngine != null) {
            if (!getBuilder().getVPassInteractCfg().using_surface_deliver) {
                this.mMediaEngine.registerFrameAvailableListener();
            } else {
                this.mMediaEngine.registerSurfacePublishListener();
                this.mLiveCore.addAudioFrameAvailableListener(this.mMediaEngine);
            }
        }
    }

    public boolean needChangeInteractModeWhenSwitchMode() {
        try {
            JSONObject jSONObject = this.mMixOnClientParams;
            if (jSONObject == null || jSONObject.isNull("checkMixTypeOnSwitchMode")) {
                return false;
            }
            if (!JSONObjectProtectorUtils.getBoolean(this.mMixOnClientParams, "checkMixTypeOnSwitchMode")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void removeStopStreamTimeoutTask() {
        AVLog.logKibana(5, "InteractEngineImpl", "remove delay stop timeout task", null);
        InteractThreadUtils.removeWorkerCallback(this.mStopLiveStreamTimeoutRunnable);
    }

    public void startServerMix() {
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.onInteractEvent(5, 0, new Object[0]);
        }
    }

    public void stopLiveStream() {
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null && liveCore.status() != 7) {
            liveCore.stop();
            AudioDeviceModule adm = liveCore.getADM();
            if (adm != null) {
                adm.enableAudioPushStream(false);
            }
        }
    }

    public void stopServerMix() {
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.onInteractEvent(6, 0, new Object[0]);
        }
    }

    public void updateRtcMixParam() {
        Config.VideoCodec videoCodec;
        Config.AudioProfile audioProfile;
        LiveCore.Builder builder = this.mEngineBuilder.getLiveCore().getBuilder();
        Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        if (!this.mConfig.isMixStreamConfigIndependent() && builder != null && mixStreamConfig != null) {
            mixStreamConfig.setVideoSize(builder.getVideoWidth(), builder.getVideoHeight());
            mixStreamConfig.setVideoFrameRate(builder.getVideoFps());
            mixStreamConfig.setVideoBitrate(builder.getVideoBitrate() / 1000);
            if (builder.getVideoEncoder() == 2) {
                videoCodec = Config.VideoCodec.BYTEVC1;
            } else {
                videoCodec = Config.VideoCodec.H264;
            }
            mixStreamConfig.setVideoCodec(videoCodec);
            mixStreamConfig.setVideoProfile(getVideoProfile(builder.getVideoEncoder(), builder.getVideoProfile()));
            mixStreamConfig.setVideoGop(builder.getVideoGopSec());
            mixStreamConfig.setAudioSampleRate(builder.getAudioSampleHZ());
            mixStreamConfig.setAudioChannels(builder.getAudioChannel());
            if (builder.getAudioProfile() == 2) {
                audioProfile = Config.AudioProfile.HE;
            } else {
                audioProfile = Config.AudioProfile.LC;
            }
            mixStreamConfig.setAudioProfile(audioProfile);
            mixStreamConfig.setAudioBitrate(builder.getAudioBitrate() / 1000);
        }
        mixStreamConfig.setBackgroundColor(this.mConfig.getBackgroundColorValue());
        InteractEngineBuilder interactEngineBuilder = this.mEngineBuilder;
        if (interactEngineBuilder != null && interactEngineBuilder.getVPassInteractCfg() != null) {
            int i = this.mEngineBuilder.getVPassInteractCfg().interactServerMixUsingBFrame;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        mixStreamConfig.setVideoSupportBFrame(Boolean.FALSE);
                    } else {
                        mixStreamConfig.setVideoSupportBFrame(Boolean.valueOf(builder.isEnableVideoBFrame()));
                    }
                } else {
                    mixStreamConfig.setVideoSupportBFrame(Boolean.FALSE);
                }
            } else {
                mixStreamConfig.setVideoSupportBFrame(Boolean.TRUE);
            }
            int i2 = this.mEngineBuilder.getVPassInteractCfg().interactClientMixUseingOriginalFrame;
            InteractConfig interactConfig = this.mConfig;
            if (i2 != 0) {
                z = false;
            }
            interactConfig.setRtcClientMixUseOriginStream(z);
            this.mConfig.setSyncClientAudioMixLengthMs(this.mEngineBuilder.getVPassInteractCfg().interactMixSyncClientAudioLengthMs);
            this.mConfig.setSyncQueueLengthMs(this.mEngineBuilder.getVPassInteractCfg().interactMixSyncQueueLengthMs);
            this.mConfig.setUseVideoRangeDefault(this.mEngineBuilder.getVPassInteractCfg().interactUseVideoRangeDefault);
            this.mConfig.setChorusCharacter(Config.ChorusCharacter.NO_USE);
        } else {
            mixStreamConfig.setVideoSupportBFrame(Boolean.FALSE);
        }
        this.mEngineBuilder.updateOriginUrl();
        String str = this.mEngineBuilder.mOriginUrl;
        if (!TextUtils.isEmpty(this.mConfig.getMixStreamRtmpUrl())) {
            str = this.mConfig.getMixStreamRtmpUrl();
        }
        String DecodeUrl = UrlUtils.DecodeUrl(str);
        if (!TextUtils.isEmpty(DecodeUrl)) {
            mixStreamConfig.setStreamUrl(DecodeUrl);
            mixStreamConfig.setStreamUniqueIdentifier(this.mEngineBuilder.mUUID);
        } else {
            AVLog.ioe("InteractEngineImpl", "Live stream url is null....");
        }
    }

    private void startMixStream() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startMixStream interactDelayStopStream:");
        LIZ.append(this.mEngineBuilder.getVPassInteractCfg().interactDelayStopStream);
        AVLog.logKibana(4, "InteractEngineImpl", X1D.LIZIZ(LIZ), null);
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            AVLog.iod("InteractEngineImpl", "livecore switch audio mode to MODE_VOICE_COMMUNICATION");
            liveCore.switchAudioMode(7);
            if (this.mEngineBuilder.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
                startServerMix();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("startMixStream interactDelayStopStream:");
                LIZ2.append(this.mEngineBuilder.getVPassInteractCfg().interactDelayStopStream);
                AVLog.logKibana(3, "InteractEngineImpl", X1D.LIZIZ(LIZ2), null);
                if (this.mEngineBuilder.getVPassInteractCfg().interactDelayStopStream == 0) {
                    stopLiveStream();
                }
            }
        }
        if (this.mEngineBuilder.getVPassInteractCfg().enablePushStreamSwitchAfterServerMixStream && checkLiveStreamUrlChanged()) {
            sendPushRestartMessage();
        }
    }

    public void interactStop() {
        IInputVideoStream originInputVideoStream = getOriginInputVideoStream();
        if (originInputVideoStream != null) {
            VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
            FILL.setMode(2);
            originInputVideoStream.setMixerDescription(FILL);
        }
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.onInteractEvent(2, 0, new Object[0]);
        }
    }

    /* loaded from: classes12.dex */
    public static class RtcEglContextCheckerInvocationHandler implements InvocationHandler {
        public RtcEglContextCheckerInvocationHandler() {
        }

        private boolean isProxyOfSameInterfaces(Object obj, Class<?> cls) {
            if (cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()))) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z = false;
            if (objArr == null) {
                objArr = new Object[0];
            }
            if (objArr.length == 0 && method.getName().equals("EglContextDestoryStart")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("invoke method: ");
                LIZ.append(method.getName());
                AVLog.d("InteractEngineImpl", X1D.LIZIZ(LIZ));
                GLThreadManager.nativeLockGlShareContext();
                return obj;
            }
            if (objArr.length == 0 && method.getName().equals("EglContextDestoryEnd")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("invoke method: ");
                LIZ2.append(method.getName());
                AVLog.d("InteractEngineImpl", X1D.LIZIZ(LIZ2));
                GLThreadManager.nativeUnLockGlShareContext();
                return obj;
            }
            if (objArr.length == 0 && method.getName().equals("hashCode")) {
                return Integer.valueOf(hashCode());
            }
            if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    return Boolean.FALSE;
                }
                if (obj == obj2) {
                    return Boolean.TRUE;
                }
                if (isProxyOfSameInterfaces(obj2, obj.getClass()) && equals(Proxy.getInvocationHandler(obj2))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (objArr.length == 0 && method.getName().equals("toString")) {
                return toString();
            }
            return obj;
        }
    }

    private void startRtcPublish() {
        startMixStream();
    }

    public InteractEngineBuilder getBuilder() {
        return this.mEngineBuilder;
    }

    public List<Client> getClientList() {
        return this.mClientsList;
    }

    public InteractEngineImpl(LiveCore liveCore) {
        this.mLiveCore = liveCore;
        InteractThreadUtils.initThread();
        this.mEngineBuilder = new InteractEngineBuilder(this.mLiveCore);
        this.mLogMonitor = this.mLiveCore.getBuilder().getLogMonitor();
        this.mMediaEngine = new MediaEngine(this, this.mLiveCore, this.mEngineBuilder);
        setByteRtcSoLoader();
        this.mRtcMaps = new HashMap();
        this.mClientsList = new ArrayList<>();
        this.mRtcEngineParamters = new JSONObject();
        setRtcEglContextChecker();
    }

    private void dealInteractConfig(InteractConfig interactConfig) {
        if (interactConfig.getRtcABTestConfig() != null) {
            try {
                JSONObject jSONObject = this.mRtcEngineParamters;
                if (jSONObject != null) {
                    jSONObject.put("rtc.ab_label", interactConfig.getRtcABTestConfig());
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (interactConfig.isAlignTo16() && !this.mLiveCore.getBuilder().isAlignTo16()) {
            interactConfig.setAlignTo16(false);
        }
        this.mLiveCore.setPublishMixBgColor(interactConfig.getBackgroundColorValue());
    }

    private String dealUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("http://")) {
                return str.replace("http", "wss");
            }
            if (!str.contains("https://")) {
                return str;
            }
            return str.replace("https", "wss");
        }
        return str;
    }

    private void reportCreateClientFailed(final String str) {
        Handler logUppThreadHandler = InteractThreadUtils.getLogUppThreadHandler();
        if (logUppThreadHandler != null) {
            logUppThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$5__run$___twin___() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("event_key", "create_interact_client_fail");
                        jSONObject.put("message", str);
                        LiveCore.Builder.ILogMonitor iLogMonitor = InteractEngineImpl.this.mLogMonitor;
                        if (iLogMonitor != null) {
                            iLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
                        }
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void updateFpsInfo(int i) {
        ArrayList<Client> arrayList = this.mClientsList;
        if (arrayList != null && !arrayList.isEmpty()) {
            synchronized (this.mClientsList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fps", i);
                    JSONObject put = new JSONObject().put("PushBase", jSONObject);
                    Iterator<Client> it = this.mClientsList.iterator();
                    while (it.hasNext()) {
                        Client next = it.next();
                        if (next instanceof ClientImpl) {
                            next.updateSdkParams(put.toString());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void addClients(Client client) {
        if (client == null) {
            return;
        }
        client.setInteractEventListener(new Client.InteractEventListener() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.9
            @Override // com.ss.avframework.livestreamv2.core.interact.Client.InteractEventListener
            public void onInteractStart(Client client2) {
                InteractEngineImpl.this.interactStart();
            }

            @Override // com.ss.avframework.livestreamv2.core.interact.Client.InteractEventListener
            public void onInteractStop(Client client2) {
                InteractEngineImpl.this.interactStop();
            }

            @Override // com.ss.avframework.livestreamv2.core.interact.Client.InteractEventListener
            public void notifyLiveStreamAdjustResolution(Client client2, boolean z, int i, int i2) {
                LiveCore.Builder builder;
                InteractEngineImpl interactEngineImpl = InteractEngineImpl.this;
                LiveCore liveCore = interactEngineImpl.mLiveCore;
                if (liveCore != null && interactEngineImpl.mEngineBuilder.getVPassInteractCfg().enable_adjust_resolution_in_pk && (builder = liveCore.getBuilder()) != null) {
                    int videoWidth = builder.getVideoWidth();
                    int videoHeight = builder.getVideoHeight();
                    int max = Math.max(videoWidth / 2, i);
                    int max2 = Math.max(videoHeight / 2, i2);
                    if (z) {
                        liveCore.adaptedVideoResolution(videoWidth, videoHeight);
                    } else {
                        liveCore.adaptedVideoResolution(max, max2);
                    }
                }
            }

            @Override // com.ss.avframework.livestreamv2.core.interact.Client.InteractEventListener
            public void onInteractInfoReport(Client client2, String str, int i, long j, Object... objArr) {
                InteractEngineImpl.this.interactInfoReport(client2.getRtcEngineWrapper().getRtcExtInfo().interactId, client2.getConfig().getMixStreamType(), i, j, str, objArr);
            }
        });
        synchronized (this.mClientsList) {
            if (this.mClientsList.isEmpty()) {
                this.m1stAddClientStack = Log.getStackTraceString(new Exception());
            } else {
                String stackTraceString = Log.getStackTraceString(new Exception());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Created more than 1 clients.\nstack 1: ");
                LIZ.append(this.m1stAddClientStack);
                LIZ.append("\nstack 2: ");
                LIZ.append(stackTraceString);
                AVLog.logKibana(6, "InteractEngineImpl", X1D.LIZIZ(LIZ), null);
            }
            this.mClientsList.add(client);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.InteractEngine
    public Client create(final InteractConfig interactConfig) {
        dealInteractConfig(interactConfig);
        this.mConfig = interactConfig;
        checkInteractCfg();
        final Client[] clientArr = new Client[1];
        Handler workThreadHandler = InteractThreadUtils.getWorkThreadHandler();
        if (workThreadHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(workThreadHandler, new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$7__run$___twin___() {
                    boolean z;
                    clientArr[0] = InteractEngineImpl.this.createClient(interactConfig);
                    InteractEngineImpl.this.addClients(clientArr[0]);
                    if (interactConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Create interact client(");
                    LIZ.append(interactConfig.getCharacter());
                    LIZ.append(",");
                    LIZ.append(InteractEngineImpl.this.mEngineBuilder.getMixStreamType());
                    LIZ.append(" mix with textureView ");
                    LIZ.append(z);
                    LIZ.append(") ");
                    LIZ.append(clientArr[0]);
                    AVLog.iod("InteractEngineImpl", X1D.LIZIZ(LIZ));
                }

                public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ;
                    try {
                        anonymousClass7.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$7__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        return clientArr[0];
    }

    public Client createClient(InteractConfig interactConfig) {
        boolean z;
        InteractAudioSinkFactory interactAudioSinkFactory;
        String str;
        RTCEngineWrapper rTCEngineWrapper;
        InteractAudioClientFactory interactAudioClientFactory = null;
        if (interactConfig == null) {
            AVLog.ioe("InteractEngineImpl", "create client interact config is null");
            reportCreateClientFailed("interact config is null");
            return null;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (this.mRtcEngine == null) {
            try {
                JSONObject jSONObject = this.mRtcEngineParamters;
                if (jSONObject != null) {
                    jSONObject.put("rtc.env", interactConfig.getRtcEnv().ordinal());
                    this.mRtcEngineParamters.put("rtc.device_id", interactConfig.getDeviceId());
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            LiveCore liveCore = this.mLiveCore;
            if (liveCore != null && liveCore.getBuilder() != null && this.mLiveCore.getBuilder().getSdkParams() != null && this.mLiveCore.getBuilder().getSdkParams().optJSONObject("PushBase") != null && this.mLiveCore.getBuilder().getSdkParams().optJSONObject("PushBase").optInt("enableTTUrlDispatcherNew") != 0) {
                z = true;
            } else {
                z = false;
            }
            if (setRtcParameters(interactConfig, z) != 0) {
                reportCreateClientFailed(Q7L.LIZJ("set rtc parameters failed, enableTTUrlDispatcherNew:", z));
                return null;
            }
            RTCEngineWrapper rTCEngineWrapper2 = new RTCEngineWrapper(interactConfig.getContext(), interactConfig.getRtcExtInfo(), null, interactConfig.getSharedEGLContext14(), this.mRtcEngineParamters);
            this.mRtcEngine = rTCEngineWrapper2;
            if (rTCEngineWrapper2.getRtcEngine() == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create rtc engine failed, rtcExtInfo:");
                LIZ.append(interactConfig.getRtcExtInfo());
                LIZ.append(" context:");
                LIZ.append(interactConfig.getContext());
                LIZ.append(" rtcEngineParameters:");
                LIZ.append(this.mRtcEngineParamters);
                reportCreateClientFailed(X1D.LIZIZ(LIZ));
                return null;
            }
            this.mRtcAppid = this.mRtcEngine.getAppId();
        }
        MediaEngine mediaEngine = this.mMediaEngine;
        if (mediaEngine != null && (rTCEngineWrapper = this.mRtcEngine) != null) {
            mediaEngine.setRtcEngine(rTCEngineWrapper);
        }
        if (this.mRtcEngine != null && !this.mRtcAppid.equalsIgnoreCase(RTCEngineWrapper.getAppId(interactConfig.getRtcExtInfo()))) {
            this.mRtcEngine.doDestroy();
            try {
                JSONObject jSONObject2 = this.mRtcEngineParamters;
                if (jSONObject2 != null) {
                    jSONObject2.put("rtc.env", interactConfig.getRtcEnv().ordinal());
                    this.mRtcEngineParamters.put("rtc.device_id", interactConfig.getDeviceId());
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
            LiveCore liveCore2 = this.mLiveCore;
            if (liveCore2 != null && liveCore2.getBuilder() != null && this.mLiveCore.getBuilder().getSdkParams() != null && this.mLiveCore.getBuilder().getSdkParams().optJSONObject("PushBase") != null) {
                if (this.mLiveCore.getBuilder().getSdkParams().optJSONObject("PushBase").optInt("enableTTUrlDispatcherNew") == 0) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (setRtcParameters(interactConfig, z3) != 0) {
                reportCreateClientFailed(Q7L.LIZJ("set rtc parameters failed, enableTTUrlDispatcherNew:", z3));
                return null;
            }
            RTCEngineWrapper rTCEngineWrapper3 = new RTCEngineWrapper(interactConfig.getContext(), interactConfig.getRtcExtInfo(), null, null, this.mRtcEngineParamters);
            this.mRtcEngine = rTCEngineWrapper3;
            if (rTCEngineWrapper3.getRtcEngine() == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("create rtc engine failed, rtcExtInfo:");
                LIZ2.append(interactConfig.getRtcExtInfo());
                LIZ2.append(" context:");
                LIZ2.append(interactConfig.getContext());
                LIZ2.append(" rtcEngineParameters:");
                LIZ2.append(this.mRtcEngineParamters);
                reportCreateClientFailed(X1D.LIZIZ(LIZ2));
                return null;
            }
            this.mRtcAppid = this.mRtcEngine.getAppId();
        }
        if (!this.mEngineBuilder.isByteAudioEnabled()) {
            interactAudioClientFactory = this.mMediaEngine.getAudioClientFactory();
            interactAudioSinkFactory = this.mMediaEngine.getInteractAudioSinkFactory();
        } else {
            interactAudioSinkFactory = null;
        }
        ClientImpl clientImpl = new ClientImpl(this.mRtcEngine, interactConfig, this.mMediaEngine.getVideoClientFactory(), this.mMediaEngine.getInteractVideoSinkFactory(), interactAudioClientFactory, interactAudioSinkFactory, this.mMediaEngine, this);
        RTCEngineWrapper rTCEngineWrapper4 = this.mRtcEngine;
        if (rTCEngineWrapper4 != null && rTCEngineWrapper4.getRtcExtInfo() != null) {
            String str2 = this.mRtcEngine.getRtcExtInfo().interactId;
            this.mInteractId = str2;
            this.mMediaEngine.setInteractId(str2);
        }
        LiveCore liveCore3 = this.mLiveCore;
        if (liveCore3 != null) {
            liveCore3.registerInteractListener(this);
            IFilterManager videoFilterMgr = this.mLiveCore.getVideoFilterMgr();
            if (videoFilterMgr != null && (str = this.mInteractId) != null) {
                videoFilterMgr.setContourInfoIndex(str);
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Create Interact Client ");
        LIZ3.append(clientImpl);
        LIZ3.append(" with mix type ");
        LIZ3.append(interactConfig.getMixStreamType());
        LIZ3.append(", AudioClientFactory ");
        LIZ3.append(interactAudioSinkFactory);
        LIZ3.append(", AudioSinkFactory ");
        LIZ3.append(interactAudioClientFactory);
        AVLog.iod("InteractEngineImpl", X1D.LIZIZ(LIZ3));
        return clientImpl;
    }

    public void onRegionChanged(int i) {
        if (this.mRegionCount > 1 ? i <= 1 : i > 1) {
            LiveCore liveCore = this.mLiveCore;
            if (liveCore != null) {
                liveCore.requestKeyFrame();
            }
        }
        this.mRegionCount = i;
    }

    public int queryRtcId(String str) {
        synchronized (this.mRtcMaps) {
            for (Map.Entry<String, Integer> entry : this.mRtcMaps.entrySet()) {
                if (entry.getKey().equals(str)) {
                    return entry.getValue().intValue();
                }
            }
            int incrementAndGet = mAtomicInteger.incrementAndGet();
            this.mRtcMaps.put(str, Integer.valueOf(incrementAndGet));
            return incrementAndGet;
        }
    }

    public boolean removeClient(Client client) {
        synchronized (this.mClientsList) {
            ArrayList<Client> arrayList = this.mClientsList;
            if (arrayList != null && !arrayList.isEmpty() && client != null) {
                return this.mClientsList.remove(client);
            }
            return false;
        }
    }

    public void setMixOnClientParams(JSONObject jSONObject) {
        this.mMixOnClientParams = jSONObject;
    }

    public void start(Client client) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Start client： ");
        LIZ.append(client);
        LIZ.append("");
        AVLog.iod("InteractEngineImpl", X1D.LIZIZ(LIZ));
        startMixStream();
        if (this.mMediaEngine != null) {
            if (!getBuilder().getVPassInteractCfg().using_surface_deliver) {
                this.mMediaEngine.registerFrameAvailableListener();
            } else {
                this.mMediaEngine.registerSurfacePublishListener();
                this.mLiveCore.addAudioFrameAvailableListener(this.mMediaEngine);
            }
        }
        disableBuiltInNS();
    }

    public void startInteract(Client client) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startInteract at client: ");
        LIZ.append(client);
        AVLog.iod("InteractEngineImpl", X1D.LIZIZ(LIZ));
        disableBuiltInNS();
        startMixStream();
    }

    public void switchMixType(Config.MixStreamType mixStreamType) {
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore == null || mixStreamType == this.mEngineBuilder.getMixStreamType()) {
            return;
        }
        Config.MixStreamType mixStreamType2 = Config.MixStreamType.SERVER_MIX;
        if (mixStreamType == mixStreamType2) {
            this.mEngineBuilder.setMixStreamType(mixStreamType2);
            liveCore.addSeiField("app_data", null, -1);
            liveCore.addSeiField("canvas", null, -1);
            liveCore.addSeiField("source", null, -1);
            if (!this.mEngineBuilder.getVPassInteractCfg().enablePushStreamSwitchAfterServerMixStream) {
                liveCore.stop();
            }
            updateRtcMixParam();
            return;
        }
        Config.MixStreamType mixStreamType3 = Config.MixStreamType.CLIENT_MIX;
        if (mixStreamType == mixStreamType3) {
            this.mEngineBuilder.setMixStreamType(mixStreamType3);
            List<String> urls = liveCore.getUrls();
            if (urls == null || urls.isEmpty()) {
                return;
            }
            liveCore.start(urls);
            return;
        }
        Config.MixStreamType mixStreamType4 = Config.MixStreamType.RTC_CLIENT_MIX;
        if (mixStreamType != mixStreamType4) {
            return;
        }
        this.mEngineBuilder.setMixStreamType(mixStreamType4);
        List<String> urls2 = liveCore.getUrls();
        if (urls2 != null && !urls2.isEmpty()) {
            liveCore.start(urls2);
        }
        updateRtcMixParam();
    }

    private Config.VideoProfile getVideoProfile(int i, int i2) {
        if (i == 2) {
            return Config.VideoProfile.MAIN;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return Config.VideoProfile.BASELINE;
            }
            return Config.VideoProfile.HIGH;
        }
        return Config.VideoProfile.MAIN;
    }

    private void reportInteractEngineError(final int i, final String str) {
        AVLog.ioe("live_client_monitor_log", "");
        Handler logUppThreadHandler = InteractThreadUtils.getLogUppThreadHandler();
        if (logUppThreadHandler != null) {
            logUppThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$6__run$___twin___() {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    LiveCore.Builder.ILogMonitor iLogMonitor;
                    try {
                        JSONObject put = new JSONObject().put("event_key", "rtc_occur_error").put("mode", "rtc");
                        InteractConfig interactConfig = InteractEngineImpl.this.mConfig;
                        String str7 = null;
                        if (interactConfig != null) {
                            str2 = interactConfig.getProjectKey();
                        } else {
                            str2 = null;
                        }
                        JSONObject put2 = put.put("project_key", str2).put("report_version", 5).put("product_line", "live");
                        InteractConfig interactConfig2 = InteractEngineImpl.this.mConfig;
                        if (interactConfig2 != null) {
                            str3 = interactConfig2.getRtcExtInfo();
                        } else {
                            str3 = null;
                        }
                        JSONObject put3 = put2.put("sdkParams", str3);
                        InteractConfig interactConfig3 = InteractEngineImpl.this.mConfig;
                        if (interactConfig3 != null && interactConfig3.getInteractMode() != null) {
                            str4 = InteractEngineImpl.this.mConfig.getInteractMode().toString();
                        } else {
                            str4 = null;
                        }
                        JSONObject put4 = put3.put("rtc_type", str4).put("live_sdk_version", "15.0.1_1");
                        InteractConfig interactConfig4 = InteractEngineImpl.this.mConfig;
                        if (interactConfig4 != null) {
                            str5 = interactConfig4.getAppChannel();
                        } else {
                            str5 = null;
                        }
                        JSONObject put5 = put4.put("rtc_app_channel", str5);
                        InteractConfig interactConfig5 = InteractEngineImpl.this.mConfig;
                        if (interactConfig5 != null && interactConfig5.getMixStreamType() != null) {
                            str7 = InteractEngineImpl.this.mConfig.getMixStreamType().toString();
                        }
                        JSONObject put6 = put5.put("mix_type", str7);
                        InteractConfig interactConfig6 = InteractEngineImpl.this.mConfig;
                        if (interactConfig6 != null && interactConfig6.getMixStreamConfig() != null) {
                            str6 = InteractEngineImpl.this.mConfig.getMixStreamConfig().getStreamName();
                        } else {
                            str6 = "";
                        }
                        JSONObject put7 = put6.put("stream_name", str6).put("message", str).put("error_code", i);
                        if (put7 != null && (iLogMonitor = InteractEngineImpl.this.mLogMonitor) != null) {
                            iLogMonitor.onLogMonitor("live_client_monitor_log", put7);
                        }
                    } catch (JSONException e) {
                        AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                    boolean LIZ;
                    try {
                        anonymousClass6.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$6__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|11|(5:(3:15|16|(1:18)(8:19|20|21|22|23|25|26|28))|(1:(2:39|(7:41|21|22|23|25|26|28)(1:42))(6:44|22|23|25|26|28))(1:45)|25|26|28)|36|43|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a4, code lost:
    
        r0 = e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int setRtcParameters(com.ss.avframework.livestreamv2.core.interact.model.InteractConfig r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.setRtcParameters(com.ss.avframework.livestreamv2.core.interact.model.InteractConfig, boolean):int");
    }

    private void updateAuthInfo(JSONObject jSONObject, int i) {
        Client.FrameType frameType = Client.FrameType.SEI;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i == 4) {
                    frameType = Client.FrameType.METADATA_SEI;
                }
            } else {
                frameType = Client.FrameType.METADATA;
            }
        } else {
            frameType = Client.FrameType.DEFAULT_OCCUPY;
        }
        ArrayList<Client> arrayList = this.mClientsList;
        if (arrayList != null) {
            Iterator<Client> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().updateAuthInfo(jSONObject, frameType);
            }
        }
    }

    private void updateSeiInfo(String str, Object obj) {
        InteractVideoClientFactory videoClientFactory = this.mMediaEngine.getVideoClientFactory();
        if (videoClientFactory != null) {
            videoClientFactory.needSaveSei(str, obj);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.LogCallback
    public void onLogReport(final String str, JSONObject jSONObject) {
        Handler logUppThreadHandler = InteractThreadUtils.getLogUppThreadHandler();
        try {
            final JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (logUppThreadHandler != null) {
                logUppThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$4__run$___twin___() {
                        LiveCore.Builder.ILogMonitor iLogMonitor = InteractEngineImpl.this.mLogMonitor;
                        if (iLogMonitor != null) {
                            iLogMonitor.onLogMonitor(str, jSONObject2);
                        }
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                        boolean LIZ;
                        try {
                            anonymousClass4.com_ss_avframework_livestreamv2_core_interact_InteractEngineImpl$4__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        } catch (JSONException e) {
            AVLog.logToIODevice(6, "InteractEngineImpl", "log report function error", e);
        }
    }

    public void setVideoCaptureResolution(int i, int i2) {
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            liveCore.adaptedVideoResolution(i, i2);
        }
    }

    public void stop(Client client, InteractConfig interactConfig, Runnable runnable) {
        List<String> urls;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stop clientFactory at client: ");
        LIZ.append(client);
        AVLog.iod("InteractEngineImpl", X1D.LIZIZ(LIZ));
        synchronized (this.mTaskFence) {
            this.mTaskAfterPushStream = runnable;
        }
        if (getBuilder().getVPassInteractCfg().using_surface_deliver) {
            this.mMediaEngine.unregisterSurfacePublishListener();
        }
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            Config.MixStreamType mixStreamType = this.mEngineBuilder.getMixStreamType();
            Config.MixStreamType mixStreamType2 = Config.MixStreamType.SERVER_MIX;
            if (mixStreamType == mixStreamType2 && this.mEngineBuilder.getVPassInteractCfg().interactDelayStopStream == 1 && this.mEngineBuilder.getVPassInteractCfg().interactDelayStopStreamTime > 0) {
                removeStopStreamTimeoutTask();
            }
            AVLog.iod("InteractEngineImpl", "livecore switch audio mode to MODE_MIC");
            liveCore.switchAudioMode(1);
            AudioDeviceModule adm = liveCore.getADM();
            if (adm != null) {
                adm.EnableServerCfg();
                adm.enableBuiltInNS(true);
                adm.enableAudioPushStream(true);
            }
            if (this.mEngineBuilder.getMixStreamType() == mixStreamType2 && (urls = liveCore.getUrls()) != null && !urls.isEmpty()) {
                stopServerMix();
                liveCore.setPushStreamAfterServerMix(true);
                liveCore.start(liveCore.getUrls());
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.ILiveForInteractListener
    public void onInfo(int i, int i2, int i3, Object... objArr) {
        Object obj;
        ArrayList<Client> arrayList;
        ArrayList<Client> arrayList2;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 15) {
                        if (i != 34) {
                            if (i != 43) {
                                if (i != 39) {
                                    if (i != 40 || (arrayList2 = this.mClientsList) == null || arrayList2.isEmpty()) {
                                        return;
                                    }
                                    synchronized (this.mClientsList) {
                                        Iterator<Client> it = this.mClientsList.iterator();
                                        while (it.hasNext()) {
                                            Client next = it.next();
                                            if (next instanceof ClientImpl) {
                                                if (this.mLiveCore != null && this.mEngineBuilder.mMixStreamType == Config.MixStreamType.RTC_CLIENT_MIX) {
                                                    ((ClientImpl) next).resetRtcClientMixVideoTrack();
                                                }
                                                if (this.mLiveCore != null && this.mEngineBuilder.mMixStreamType == Config.MixStreamType.CLIENT_MIX) {
                                                    ((ClientImpl) next).composeCurrentWaterMarks();
                                                }
                                            }
                                        }
                                    }
                                    return;
                                }
                                if (!checkLiveStreamUrlChanged()) {
                                    return;
                                }
                                sendPushRestartMessage();
                                return;
                            }
                            InteractEngineBuilder interactEngineBuilder = this.mEngineBuilder;
                            if (interactEngineBuilder.mMixStreamType != Config.MixStreamType.RTC_CLIENT_MIX) {
                                return;
                            }
                            LiveCore.Builder builder = interactEngineBuilder.getLiveCore().getBuilder();
                            Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
                            if ((builder.getVideoWidth() == mixStreamConfig.getVideoWidth() && builder.getVideoHeight() == mixStreamConfig.getVideoHeight()) || (arrayList = this.mClientsList) == null || arrayList.isEmpty()) {
                                return;
                            }
                            synchronized (this.mClientsList) {
                                AVLog.iod("InteractEngineImpl", "rtc client video resolution adjust");
                                updateRtcMixParam();
                                Iterator<Client> it2 = this.mClientsList.iterator();
                                while (it2.hasNext()) {
                                    Client next2 = it2.next();
                                    if ((next2 instanceof ClientImpl) && this.mLiveCore != null && this.mEngineBuilder.mMixStreamType == Config.MixStreamType.RTC_CLIENT_MIX) {
                                        next2.invalidateSei();
                                    }
                                }
                            }
                            return;
                        }
                        updateFpsInfo(i2);
                        return;
                    }
                } else {
                    if (objArr == null || objArr.length <= 1) {
                        return;
                    }
                    Object obj2 = objArr[0];
                    if (!(obj2 instanceof String) || (obj = objArr[1]) == null) {
                        return;
                    }
                    updateSeiInfo((String) obj2, obj);
                    return;
                }
            } else {
                if (objArr == null || objArr.length <= 0) {
                    return;
                }
                Object obj3 = objArr[0];
                if (!(obj3 instanceof JSONObject)) {
                    return;
                }
                updateAuthInfo((JSONObject) obj3, i2);
                return;
            }
        } else {
            ArrayList<Client> arrayList3 = this.mClientsList;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                synchronized (this.mClientsList) {
                    Iterator<Client> it3 = this.mClientsList.iterator();
                    while (it3.hasNext()) {
                        Client next3 = it3.next();
                        if (next3 instanceof ClientImpl) {
                            next3.composeCurrentWaterMarks();
                        }
                    }
                }
            }
        }
        stopInteractTask();
    }

    public void interactInfoReport(String str, Object obj, int i, long j, String str2, Object... objArr) {
        int i2 = 0;
        int i3 = 3;
        if (i != 12) {
            if (i != 13 || !this.mLiveCore.getBuilder().getSdkSetting().switchParams.getImPerfAlarm() || objArr.length != 3) {
                return;
            }
            int parseInt = CastIntegerProtector.parseInt(objArr[0].toString());
            int parseInt2 = CastIntegerProtector.parseInt(objArr[1].toString());
            int parseInt3 = CastIntegerProtector.parseInt(objArr[2].toString());
            TEBundle tEBundle = new TEBundle();
            tEBundle.setInt("width", parseInt);
            tEBundle.setInt("height", parseInt2);
            tEBundle.setInt("fps", parseInt3);
            tEBundle.setString("from", "performance");
            this.mLiveCore.updateSdkParams(tEBundle);
            tEBundle.release();
            return;
        }
        if (!objArr[0].toString().equals(str)) {
            return;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        if (intValue != 1 && intValue != 2) {
            if (intValue != 3) {
                if (intValue == 4) {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        LiveCore liveCore = this.mLiveCore;
        if (liveCore == null) {
            return;
        }
        if (obj == Config.MixStreamType.CLIENT_MIX || obj == Config.MixStreamType.RTC_CLIENT_MIX) {
            i3 = 2;
        }
        liveCore.onOuterInfo(101, i3, i2);
    }

    public void dealSeiInfo(int i, String str, int i2, int i3, int i4, long j, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer2.position(0);
            byteBuffer2.put(byteBuffer);
            byteBuffer.rewind();
            byteBuffer2.position(0);
        } else {
            byteBuffer2 = byteBuffer;
        }
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            liveCore.pushRtcSeiData(i, str, i2, i3, i4, null, 0, j, byteBuffer2);
        }
    }
}
