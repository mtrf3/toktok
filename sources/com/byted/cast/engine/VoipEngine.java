package com.byted.cast.engine;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.sdk.RTCAudioProfile;
import com.byted.cast.sdk.RTCEngine;
import com.byted.cast.sdk.RTCMediaKind;
import com.byted.cast.sdk.RTCScreenProfile;
import com.byted.cast.sdk.RTCSetting;
import com.byted.cast.sdk.RTCVideoProfile;
import com.byted.cast.sdk.render.video.IVideoFrameListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class VoipEngine implements IVideoFrameListener {
    public static boolean bInited;
    public static boolean bLibraryLoaded;
    public static final RTCEngine.ConnectState[] mConnectStates = {RTCEngine.ConnectState.CLOSE, RTCEngine.ConnectState.CONNECTING, RTCEngine.ConnectState.CONNECTED, RTCEngine.ConnectState.CONNECT_FAILED, RTCEngine.ConnectState.DISCONNECTED, RTCEngine.ConnectState.RECONNECTING, RTCEngine.ConnectState.RECONNECTED, RTCEngine.ConnectState.RECONNECT_FAILED, RTCEngine.ConnectState.ERROR};
    public static ILibraryLoader sLibraryLoader;
    public ContextManager.CastContext mCastContext;
    public CastLogger mLogger;
    public OnVoipEngineListener mOnVoipEngineListener;
    public long mVoipContext = -1;
    public List<OnVoipStreamEventListener> mVoipStreamEventListeners = new ArrayList();
    public List<VoipVideoRender> mVideoRenders = new ArrayList();
    public HashMap<Pair<String, RTCMediaKind>, Integer> mPublished = new HashMap<>();

    /* loaded from: classes29.dex */
    public interface OnVoipEngineListener {
        void onAudioFrame(String str, RTCSetting.ACODEC_ID acodec_id, byte[] bArr, long j);

        void onAudioPcm(String str, byte[] bArr, long j);

        void onAudioSetVolume(String str, float f, float f2);

        void onCancelRequest(String str);

        void onCancelSuccess();

        void onCastControl(int i, int i2);

        void onCastPause(RTCMediaKind rTCMediaKind);

        boolean onCastRequest(String str, String str2);

        void onCastResume(RTCMediaKind rTCMediaKind);

        void onCastSuccess();

        void onConnect(String str, String str2);

        void onConnectStateChanged(RTCEngine.ConnectState connectState);

        void onConnectSuccess(int i, int i2, int i3);

        void onDisconnect(RTCEngine.ExitReason exitReason, String str);

        void onDisconnect(String str, RTCEngine.ExitReason exitReason, String str2);

        void onError(int i, String str);

        void onIdrRequest(RTCMediaKind rTCMediaKind);

        void onLogMonitor(String str, String[][] strArr);

        void onMonitorEvent(String str, String str2);

        void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap);

        void onRecvMetaData(String str);

        void onRecvMetaData(String str, String str2);

        void onSetbitrateRequest(RTCMediaKind rTCMediaKind, int i);

        void onSinkLatencyStat(String str, String str2);

        void onSinkStuckStat(String str, String str2);

        void onStat(String str);

        void onStuckStat(String str);

        void onUpdateRtt(int i);

        void onVideoFrame(String str, RTCMediaKind rTCMediaKind, int i, int i2, int i3, boolean z);

        void onVideoFrame(String str, RTCSetting.VCODEC_ID vcodec_id, byte[] bArr, long j);

        void onVideoSizeChanged(String str, int i, int i2);
    }

    /* loaded from: classes29.dex */
    public interface OnVoipStreamEventListener {
        void onStreamPublished(String str, RTCMediaKind rTCMediaKind, int i);

        void onStreamSubscribed(String str, RTCMediaKind rTCMediaKind);

        void onStreamUnpublished(String str, RTCMediaKind rTCMediaKind);

        void onStreamUnsubscribed(String str, RTCMediaKind rTCMediaKind);
    }

    /* loaded from: classes29.dex */
    public static class VoipEngineHolder {
        public static final VoipEngine mInstance = new VoipEngine(null);
    }

    private native long create(String str, String str2);

    private native void decodeInput(long j, String str, long j2);

    private native void decodeOutput(long j, String str, long j2);

    public static native void deinit(String str);

    private native void destroy(String str, long j);

    public static native void dumpMediaData(long j, int i, int i2);

    private native int getAudioData(long j, byte[] bArr, int i, int i2);

    private native String getStatistics(long j);

    public static native void init(String str, String str2);

    private native void inputAudioData(long j, byte[] bArr, int i, int i2, long j2);

    private native void inputScreenData(long j, byte[] bArr, int i, int i2, int i3, int i4, long j2, int i5, int i6);

    private native void inputVideoData(long j, byte[] bArr, int i, int i2, int i3, int i4, boolean z);

    private native void kickOutSource(long j, String str);

    public static native void nativeSetFileLogEnabled(String str, boolean z);

    public static native void nativeSetLogLevel(String str, int i);

    private native void notifyDeviceEvent(long j, int i, Object obj, Object obj2, Object obj3);

    private native void renderFrame(long j, String str, long j2);

    private native void sendMetaDataTo(long j, String str, String str2);

    private native void setAudioDropPolicyByMs(long j, int i, int i2);

    private native void setAudioMaxDelayByMs(long j, int i);

    private native void setAudioVolume(long j, float f, float f2);

    private native void setPinCode(long j, String str);

    public static int transLogLevelToNative(int i) {
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 2 : -1;
        }
        return 0;
    }

    public native void addVideoRender(long j, long j2);

    public native void castCancel(long j);

    public native void castRequest(long j);

    public native void connect(long j, String str, int i, String str2, String str3);

    public native void disconnect(long j);

    public native void removeVideoRender(long j, long j2);

    public native void sendMetaData(long j, String str);

    public native void setCastToken(long j, String str);

    public native void setMediaProfile(long j, int i, String str);

    public native void setTransType(long j, int i, int i2);

    public native void setVideoSurface(long j, String str, Surface surface);

    /* loaded from: classes29.dex */
    public static class DeviceParams {
        public String app;
        public String appPackage;
        public String appVersion;
        public String cpuType;
        public String deviceId;
        public String deviceModel;
        public int fps;
        public int height;
        public String os;
        public String osVersion;
        public String sdkVersion;
        public String timeZone;
        public int width;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeviceParams{deviceId='");
            LIZ.append(this.deviceId);
            LIZ.append('\'');
            LIZ.append(", sdkVersion='");
            LIZ.append(this.sdkVersion);
            LIZ.append('\'');
            LIZ.append(", app='");
            LIZ.append(this.app);
            LIZ.append('\'');
            LIZ.append(", appVersion='");
            LIZ.append(this.appVersion);
            LIZ.append('\'');
            LIZ.append(", appPackage='");
            LIZ.append(this.appPackage);
            LIZ.append('\'');
            LIZ.append(", os='");
            LIZ.append(this.os);
            LIZ.append('\'');
            LIZ.append(", osVersion='");
            LIZ.append(this.osVersion);
            LIZ.append('\'');
            LIZ.append(", deviceModel='");
            LIZ.append(this.deviceModel);
            LIZ.append('\'');
            LIZ.append(", cpuType='");
            LIZ.append(this.cpuType);
            LIZ.append('\'');
            LIZ.append(", timeZone='");
            LIZ.append(this.timeZone);
            LIZ.append('\'');
            LIZ.append(", width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(", fps=");
            LIZ.append(this.fps);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    public static boolean loadLibrary() {
        if (bLibraryLoaded) {
            return true;
        }
        if (!loadLibrary("bat") || !loadLibrary("voip") || !loadLibrary("bytelink")) {
            return false;
        }
        bLibraryLoaded = true;
        return true;
    }

    private void onCancelSuccess() {
        this.mLogger.i("VoipEngine", "onCancelSuccess");
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onCancelSuccess();
        }
    }

    private void onCastSuccess() {
        this.mLogger.i("VoipEngine", "onCastSuccess ");
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onCastSuccess();
        }
    }

    public void castCancel() {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "castCancel voip engine not inited !");
        } else {
            this.mLogger.i("VoipEngine", "CastCancel");
            castCancel(this.mVoipContext);
        }
    }

    public void castRequest() {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "castRequest voip engine not inited !");
        } else {
            this.mLogger.i("VoipEngine", "CastRequest");
            castRequest(this.mVoipContext);
        }
    }

    public void destroy() {
        String str;
        this.mLogger.i("VoipEngine", "destroy");
        if (this.mVoipContext != -1) {
            ContextManager.CastContext castContext = this.mCastContext;
            if (castContext != null) {
                str = castContext.getContextId();
            } else {
                str = "bytelink_sink";
            }
            this.mLogger.i("VoipEngine", "real destroy");
            destroy(str, this.mVoipContext);
            this.mVoipContext = -1L;
        }
        this.mVideoRenders.clear();
        this.mVoipStreamEventListeners.clear();
    }

    public void disconnect() {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "disconnect voip engine not inited !");
        } else {
            this.mLogger.i("VoipEngine", "disconnect");
            disconnect(this.mVoipContext);
        }
    }

    public String getStatistics() {
        long j = this.mVoipContext;
        if (j == -1) {
            this.mLogger.w("VoipEngine", "voip engine not inited!");
            return "";
        }
        return getStatistics(j);
    }

    public static VoipEngine getInstance() {
        return VoipEngineHolder.mInstance;
    }

    public VoipEngine(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    private String createAudioProfile(RTCAudioProfile rTCAudioProfile) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Capturesamplerate", rTCAudioProfile.getRecordSampleRate());
            jSONObject.put("Playbacksamplerate", rTCAudioProfile.getPlaySampleRate());
            jSONObject.put("bitrate", rTCAudioProfile.getBitrate());
            jSONObject.put("maxBitrate", rTCAudioProfile.getMaxBitrate());
            jSONObject.put("echoDetectionEnable", rTCAudioProfile.isEchoDetectionEnabled());
            jSONObject.put("aec", rTCAudioProfile.getAECType().ordinal());
            jSONObject.put("anc", rTCAudioProfile.getANCType().ordinal());
            jSONObject.put("agc", rTCAudioProfile.getAGCType().ordinal());
            return jSONObject.toString();
        } catch (JSONException e) {
            this.mLogger.e("VoipEngine", e.getMessage());
            return null;
        }
    }

    public static JSONObject createDeviceParams(DeviceParams deviceParams) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", deviceParams.deviceId);
            jSONObject.put("sdkVersion", deviceParams.sdkVersion);
            jSONObject.put("app", deviceParams.app);
            jSONObject.put("appVersion", deviceParams.appVersion);
            jSONObject.put("appPackage", deviceParams.appPackage);
            jSONObject.put("os", deviceParams.os);
            jSONObject.put("osVersion", deviceParams.osVersion);
            jSONObject.put("deviceModel", deviceParams.deviceModel);
            jSONObject.put("cpuType", deviceParams.cpuType);
            jSONObject.put("timeZone", deviceParams.timeZone);
            jSONObject.put("width", deviceParams.width);
            jSONObject.put("height", deviceParams.height);
            jSONObject.put("fps", deviceParams.fps);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String createEngineProfile(RTCSetting rTCSetting) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("decodeType", rTCSetting.getDecodeType().ordinal());
            jSONObject.put("streamType", rTCSetting.getStreamType().ordinal());
            jSONObject.put("avsyncType", rTCSetting.getAVSyncType().ordinal());
            jSONObject.put("audioTransType", rTCSetting.getAudioTransType().ordinal());
            jSONObject.put("videoTransType", rTCSetting.getVideoTransType().ordinal());
            jSONObject.put("bEnableAudioCallback", rTCSetting.isbEnableAudioCallback());
            jSONObject.put("bEnableAudioMixer", rTCSetting.isbEnableAudioMixer());
            jSONObject.put("latencyMs", rTCSetting.getLatencyMs());
            jSONObject.put("bDecodedByUser", rTCSetting.isDecodedByUser());
            jSONObject.put("bEnableVideoNativeDecode", rTCSetting.isEnableVideoNativeDecode());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    private String createScreenProfile(RTCScreenProfile rTCScreenProfile) {
        int ordinal;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("codecId", rTCScreenProfile.getCodecId().ordinal());
            jSONObject.put("bitrate", rTCScreenProfile.getBitrate());
            jSONObject.put("maxBitrate", rTCScreenProfile.getMaxBitrate());
            if (rTCScreenProfile.getBitrateMode() == null) {
                ordinal = 0;
            } else {
                ordinal = rTCScreenProfile.getBitrateMode().ordinal();
            }
            jSONObject.put("bitrateMode", ordinal);
            jSONObject.put("width", rTCScreenProfile.getWidth());
            jSONObject.put("height", rTCScreenProfile.getHeight());
            jSONObject.put("fps", rTCScreenProfile.getFps());
            jSONObject.put("scc", rTCScreenProfile.getSccType().ordinal());
            jSONObject.put("fixedResolution", rTCScreenProfile.isFixedResolution());
            return jSONObject.toString();
        } catch (JSONException e) {
            this.mLogger.e("VoipEngine", e.getMessage());
            return null;
        }
    }

    private String createVideoProfile(RTCVideoProfile rTCVideoProfile) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("codecId", rTCVideoProfile.getCodecId().ordinal());
            jSONObject.put("bitrate", rTCVideoProfile.getBitrate());
            jSONObject.put("maxBitrate", rTCVideoProfile.getMaxBitrate());
            jSONObject.put("bitrateMode", rTCVideoProfile.getBitrateMode().ordinal());
            jSONObject.put("ltr", rTCVideoProfile.isLtrEnabled());
            jSONObject.put("layers", rTCVideoProfile.getLayers());
            jSONObject.put("fixedResolution", rTCVideoProfile.isFixedResolution());
            return jSONObject.toString();
        } catch (JSONException e) {
            this.mLogger.e("VoipEngine", e.getMessage());
            return null;
        }
    }

    public static synchronized void deinitialize(ContextManager.CastContext castContext) {
        String str;
        synchronized (VoipEngine.class) {
            if (!bInited) {
                return;
            }
            ContextManager.getLogger(castContext).i("VoipEngine", "deinitialize");
            if (castContext == null) {
                str = "bytelink_sink";
            } else {
                str = castContext.getContextId();
            }
            deinit(str);
            bInited = false;
            bLibraryLoaded = false;
        }
    }

    public static boolean loadLibrary(String str) {
        ILibraryLoader iLibraryLoader = sLibraryLoader;
        boolean z = false;
        try {
            if (iLibraryLoader != null) {
                z = iLibraryLoader.loadLibrary(str);
            } else {
                C16880lQ.LLJJJIL(str);
                z = true;
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    private void onCancelRequest(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelRequest: ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onCancelRequest(str);
        }
    }

    private void onCastPause(int i) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onCastPause(RTCMediaKind.valueOf(i));
        }
    }

    private void onCastResume(int i) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onCastResume(RTCMediaKind.valueOf(i));
        }
    }

    private void onConnectStateChanged(int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnectStateChanged: ");
        LIZ.append(i);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null && i >= 0) {
            RTCEngine.ConnectState[] connectStateArr = mConnectStates;
            if (i < connectStateArr.length) {
                onVoipEngineListener.onConnectStateChanged(connectStateArr[i]);
            }
        }
    }

    private void onIdrRequest(int i) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onIdrRequest(RTCMediaKind.valueOf(i));
        }
    }

    private void onRecvMetaData(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRecvMetaData: ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onRecvMetaData(str);
        }
    }

    private void onStat(String str) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onStat(str);
        }
    }

    private void onStuckStat(String str) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onStuckStat(str);
        }
    }

    private void onUpdateRtt(int i) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onUpdateRtt(i);
        }
    }

    public static void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        sLibraryLoader = iLibraryLoader;
        loadLibrary();
    }

    public void addOnVoipStreamEventListener(OnVoipStreamEventListener onVoipStreamEventListener) {
        this.mVoipStreamEventListeners.add(onVoipStreamEventListener);
        for (Map.Entry<Pair<String, RTCMediaKind>, Integer> entry : this.mPublished.entrySet()) {
            onVoipStreamEventListener.onStreamPublished((String) entry.getKey().first, (RTCMediaKind) entry.getKey().second, entry.getValue().intValue());
        }
    }

    public void addVideoRender(VoipVideoRender voipVideoRender) {
        long j = this.mVoipContext;
        if (j == -1) {
            this.mVideoRenders.add(voipVideoRender);
        } else {
            addVideoRender(j, voipVideoRender.getRenderContext());
        }
    }

    public boolean create(RTCSetting rTCSetting) {
        String str;
        if (this.mVoipContext != -1) {
            this.mLogger.w("VoipEngine", "already created");
            return false;
        }
        String createEngineProfile = createEngineProfile(rTCSetting);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create: ");
        LIZ.append(createEngineProfile);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        ContextManager.CastContext castContext = this.mCastContext;
        if (castContext != null) {
            str = castContext.getContextId();
        } else {
            str = "bytelink_sink";
        }
        this.mVoipContext = create(str, createEngineProfile);
        Iterator<VoipVideoRender> it = this.mVideoRenders.iterator();
        while (it.hasNext()) {
            addVideoRender(this.mVoipContext, it.next().getRenderContext());
        }
        return true;
    }

    public void kickOutSource(String str) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "kickOutSource voip engine not inited !");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KickOutSource: ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        kickOutSource(this.mVoipContext, str);
    }

    public void removeOnVoipStreamEventListener(OnVoipStreamEventListener onVoipStreamEventListener) {
        this.mVoipStreamEventListeners.remove(onVoipStreamEventListener);
    }

    public void removeVideoRender(VoipVideoRender voipVideoRender) {
        long j = this.mVoipContext;
        if (j == -1) {
            this.mVideoRenders.remove(voipVideoRender);
        } else {
            removeVideoRender(j, voipVideoRender.getRenderContext());
        }
    }

    public void sendMetaData(String str) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "sendMetaData voip engine not inited !");
        } else {
            this.mLogger.i("VoipEngine", "sendMetaData");
            sendMetaData(this.mVoipContext, str);
        }
    }

    public void setAudioMaxDelayByMs(int i) {
        long j = this.mVoipContext;
        if (j == -1) {
            return;
        }
        setAudioMaxDelayByMs(j, i);
    }

    public void setAudioProfile(RTCAudioProfile rTCAudioProfile) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "setAudioProfile, voip engine not inited !");
            return;
        }
        String createAudioProfile = createAudioProfile(rTCAudioProfile);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioProfile: ");
        LIZ.append(createAudioProfile);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        setMediaProfile(this.mVoipContext, RTCMediaKind.AUDIO.value(), createAudioProfile);
    }

    public void setCastToken(String str) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "setCastToken voip engine not inited !");
        } else {
            this.mLogger.i("VoipEngine", "setCastToken");
            setCastToken(this.mVoipContext, str);
        }
    }

    public void setOnVoipEngineListener(OnVoipEngineListener onVoipEngineListener) {
        this.mOnVoipEngineListener = onVoipEngineListener;
    }

    public void setPinCode(String str) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "setPinCode voip engine not inited !");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SetPinCode: ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        setPinCode(this.mVoipContext, str);
    }

    public void setScreenProfile(RTCScreenProfile rTCScreenProfile) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "setScreenProfile voip engine not inited !");
            return;
        }
        String createScreenProfile = createScreenProfile(rTCScreenProfile);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setScreenProfile: ");
        LIZ.append(createScreenProfile);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        setMediaProfile(this.mVoipContext, RTCMediaKind.SCREEN.value(), createScreenProfile);
    }

    public void setVideoProfile(RTCVideoProfile rTCVideoProfile) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "setVideoProfile voip engine not inited !");
            return;
        }
        String createVideoProfile = createVideoProfile(rTCVideoProfile);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoProfile: ");
        LIZ.append(createVideoProfile);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        setMediaProfile(this.mVoipContext, RTCMediaKind.VIDEO.value(), createVideoProfile);
    }

    private void onCastControl(int i, int i2) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onCastControl(i, i2);
        }
    }

    private boolean onCastRequest(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCastRequest: ");
        LIZ.append(str);
        LIZ.append(" token ");
        LIZ.append(str2);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            return onVoipEngineListener.onCastRequest(str, str2);
        }
        return true;
    }

    private void onConnect(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnect: ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onConnect(str, str2);
        }
    }

    private void onDisconnect(int i, String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDisconnect: ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onDisconnect(RTCEngine.valueOf(i), str);
        }
    }

    private void onError(int i, String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError: ");
        LIZ.append(i);
        LIZ.append(", ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onError(i, str);
        }
    }

    private void onLogMonitor(String str, String[][] strArr) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onLogMonitor(str, strArr);
        }
    }

    private void onMonitorEvent(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMonitorEvent, eventType:");
        LIZ.append(str);
        LIZ.append(", eventContent:");
        LIZ.append(str2);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onMonitorEvent(str, str2);
        }
    }

    private void onRecvMetaData(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRecvMetaData: ");
        LIZ.append(str2);
        LIZ.append(" from:");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onRecvMetaData(str, str2);
        }
    }

    private void onSetbitrateRequest(int i, int i2) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onSetbitrateRequest(RTCMediaKind.valueOf(i), i2);
        }
    }

    private void onSinkLatencyStat(String str, String str2) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onSinkLatencyStat(str, str2);
        }
    }

    private void onSinkStuckStat(String str, String str2) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onSinkStuckStat(str, str2);
        }
    }

    public static void setFileLogEnabled(ContextManager.CastContext castContext, boolean z) {
        String str;
        CastLogger logger = ContextManager.getLogger(castContext);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setFileLogEnabled:");
        LIZ.append(z);
        logger.i("VoipEngine", X1D.LIZIZ(LIZ));
        if (!loadLibrary()) {
            ContextManager.getLogger(castContext).w("VoipEngine", "setFileLogEnabled, loadLibrary failed!");
            return;
        }
        if (castContext != null) {
            str = castContext.getContextId();
        } else {
            str = "bytelink_sink";
        }
        nativeSetFileLogEnabled(str, z);
    }

    public static boolean setLogLevel(ContextManager.CastContext castContext, int i) {
        String str;
        CastLogger logger = ContextManager.getLogger(castContext);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLogLevel: ");
        LIZ.append(i);
        logger.i("VoipEngine", X1D.LIZIZ(LIZ));
        if (!loadLibrary()) {
            ContextManager.getLogger(castContext).w("VoipEngine", "setLogLevel, loadLibrary failed!");
            return false;
        }
        if (castContext != null) {
            str = castContext.getContextId();
        } else {
            str = "bytelink_sink";
        }
        nativeSetLogLevel(str, transLogLevelToNative(i));
        return true;
    }

    public static void setLogger(ContextManager.CastContext castContext, ILogger iLogger) {
        ContextManager.getLogger(castContext).setLogger(iLogger);
        CastLogger logger = ContextManager.getLogger(castContext);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLogger:");
        LIZ.append(iLogger);
        logger.i("VoipEngine", X1D.LIZIZ(LIZ));
    }

    public void dumpMediaData(int i, int i2) {
        if (this.mVoipContext == -1) {
            this.mLogger.w("VoipEngine", "voip engine not inited!");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dumpMediaData: ");
        LIZ.append(i2);
        LIZ.append("s");
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        dumpMediaData(this.mVoipContext, i, i2);
    }

    @Override // com.byted.cast.sdk.render.video.IVideoFrameListener
    public void onDecodeIn(String str, long j) {
        long j2 = this.mVoipContext;
        if (j2 == -1) {
            this.mLogger.v("VoipEngine", "onDecodeIn voip engine not inited !");
        } else {
            decodeInput(j2, str, j);
        }
    }

    @Override // com.byted.cast.sdk.render.video.IVideoFrameListener
    public void onDecoded(String str, long j) {
        long j2 = this.mVoipContext;
        if (j2 == -1) {
            this.mLogger.v("VoipEngine", "onDecoded voip engine not inited !");
        } else {
            decodeOutput(j2, str, j);
        }
    }

    @Override // com.byted.cast.sdk.render.video.IVideoFrameListener
    public void onRendered(String str, long j) {
        long j2 = this.mVoipContext;
        if (j2 == -1) {
            this.mLogger.v("VoipEngine", "onRendered voip engine not inited !");
        } else {
            renderFrame(j2, str, j);
        }
    }

    public void sendMetaData(String str, String str2) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "sendMetaData voip engine not inited !");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendMetaData: ");
        LIZ.append(str);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        sendMetaDataTo(this.mVoipContext, str, str2);
    }

    public void setAudioDropPolicyByMs(int i, int i2) {
        long j = this.mVoipContext;
        if (j == -1) {
            return;
        }
        setAudioDropPolicyByMs(j, i, i2);
    }

    public void setAudioVolume(float f, float f2) {
        long j = this.mVoipContext;
        if (j == -1) {
            this.mLogger.v("VoipEngine", "setAudioVolume voip engine not inited !");
        } else {
            setAudioVolume(j, f, f2);
        }
    }

    public void setTransType(RTCSetting.TRANS_TYPE trans_type, RTCSetting.TRANS_TYPE trans_type2) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "setTransType voip engine not inited !");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setTransType audio: ");
        LIZ.append(trans_type.toString());
        LIZ.append(" video: ");
        LIZ.append(trans_type2.toString());
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        setTransType(this.mVoipContext, trans_type.ordinal(), trans_type2.ordinal());
    }

    public void setVideoSurface(String str, Surface surface) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "setVideoSurface voip engine not inited !");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoSurface: ");
        LIZ.append(surface);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        setVideoSurface(this.mVoipContext, str, surface);
    }

    private void onAudioPcm(String str, byte[] bArr, long j) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onAudioPcm(str, bArr, j);
        }
    }

    private void onAudioSetVolume(String str, float f, float f2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioSetVolume: ratio=");
        LIZ.append(f);
        LIZ.append(" volume=");
        LIZ.append(f2);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onAudioSetVolume(str, f, f2);
        }
    }

    private void onConnectSuccess(int i, int i2, int i3) {
        this.mLogger.i("VoipEngine", "onConnectSuccess ");
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onConnectSuccess(i, i2, i3);
        }
    }

    private void onDisconnect(String str, int i, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDisconnect: ");
        LIZ.append(str);
        LIZ.append(" ");
        LIZ.append(str2);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onDisconnect(str, RTCEngine.valueOf(i), str2);
        }
    }

    private void onNotifyLatency(String str, long j, HashMap<String, Long> hashMap) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onNotifyLatency(str, Long.valueOf(j), hashMap);
        }
    }

    private void onVideoSizeChanged(String str, int i, int i2) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onVideoSizeChanged(str, i, i2);
        }
    }

    public int readRemoteAudioFrame(byte[] bArr, int i, int i2) {
        long j = this.mVoipContext;
        if (j == -1) {
            this.mLogger.v("VoipEngine", "readRemoteAudioFrame voip engine not inited !");
            return -1;
        }
        return getAudioData(j, bArr, i, i2);
    }

    private void onAudioFrame(String str, int i, byte[] bArr, long j) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onAudioFrame(str, RTCSetting.valueOfAudio(i), bArr, j);
        }
    }

    private void onVideoFrame(String str, int i, byte[] bArr, long j) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onVideoFrame(str, RTCSetting.valueOfVideo(i), bArr, j);
        }
    }

    public void connect(String str, int i, String str2, String str3) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "connect voip engine not inited !");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect: ");
        LIZ.append("xxx.xxx.xxx.xxx");
        LIZ.append(" : ");
        LIZ.append(i);
        castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        connect(this.mVoipContext, str, i, str2, str3);
    }

    public void inputAudioFrame(byte[] bArr, int i, MediaSetting.ACODEC_ID acodec_id, long j) {
        long j2 = this.mVoipContext;
        if (j2 == -1) {
            this.mLogger.v("VoipEngine", "inputAudioFrame voip engine not inited !");
        } else {
            inputAudioData(j2, bArr, i, acodec_id.ordinal(), j);
        }
    }

    public void notifyDeviceEvent(int i, Object obj, Object obj2, Object obj3) {
        if (this.mVoipContext == -1) {
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyDeviceEvent: ");
        LIZ.append(i);
        castLogger.v("VoipEngine", X1D.LIZIZ(LIZ));
        notifyDeviceEvent(this.mVoipContext, i, obj, obj2, obj3);
    }

    private void onVideoEvent(String str, int i, int i2, int i3, int i4, boolean z) {
        OnVoipEngineListener onVoipEngineListener = this.mOnVoipEngineListener;
        if (onVoipEngineListener != null) {
            onVoipEngineListener.onVideoFrame(str, RTCMediaKind.valueOf(i), i2, i3, i4, z);
        }
    }

    public void inputVideoFrame(byte[] bArr, int i, int i2, MediaSetting.VideoFormat videoFormat, int i3, boolean z) {
        long j = this.mVoipContext;
        if (j == -1) {
            this.mLogger.v("VoipEngine", "inputVideoFrame voip engine not inited !");
        } else {
            inputVideoData(j, bArr, i, i2, videoFormat.ordinal(), i3, z);
        }
    }

    public static String createSystemProfile(RTCEngine.RuntimeEnv runtimeEnv, DeviceParams deviceParams, String str, String str2, String str3, int i, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("env", runtimeEnv.ordinal());
            jSONObject.put("device", createDeviceParams(deviceParams));
            jSONObject.put("documentPath", str);
            jSONObject.put("mediaServerAddr", "");
            jSONObject.put("castSourceOnly", z);
            jSONObject.put("name", str2);
            jSONObject.put("localPort", i);
            jSONObject.put("localIP", str3);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void initialize(Context context, ContextManager.CastContext castContext, RTCEngine.RuntimeEnv runtimeEnv, DeviceParams deviceParams, String str, int i, boolean z) {
        initialize(context, castContext, runtimeEnv, deviceParams, str, "", i, z);
    }

    public static synchronized void initialize(Context context, ContextManager.CastContext castContext, RTCEngine.RuntimeEnv runtimeEnv, DeviceParams deviceParams, String str, String str2, int i, boolean z) {
        String str3;
        synchronized (VoipEngine.class) {
            if (bInited) {
                return;
            }
            if (!loadLibrary()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLIIJI(context, null));
            LIZ.append("/bytelink/");
            String createSystemProfile = createSystemProfile(runtimeEnv, deviceParams, X1D.LIZIZ(LIZ), str, str2, i, z);
            CastLogger logger = ContextManager.getLogger(castContext);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initialize: profile = ");
            LIZ2.append(createSystemProfile);
            logger.i("VoipEngine", X1D.LIZIZ(LIZ2));
            if (castContext == null) {
                str3 = "bytelink_sink";
            } else {
                str3 = castContext.getContextId();
            }
            init(str3, createSystemProfile);
            bInited = true;
        }
    }

    public void inputScreenFrame(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4, int i5) {
        if (this.mVoipContext == -1) {
            this.mLogger.v("VoipEngine", "inputScreenFrame voip engine not inited !");
            return;
        }
        if (i5 == 1) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("inputScreenFrame: ");
            LIZ.append(i2);
            LIZ.append("x");
            LIZ.append(i3);
            LIZ.append(", format = ");
            LIZ.append(videoFormat);
            LIZ.append(", rotation = ");
            LIZ.append(i4);
            LIZ.append(", timestamp:");
            LIZ.append(j);
            castLogger.i("VoipEngine", X1D.LIZIZ(LIZ));
        }
        inputScreenData(this.mVoipContext, bArr, i, i2, i3, videoFormat.ordinal(), j, i4, i5);
    }
}
