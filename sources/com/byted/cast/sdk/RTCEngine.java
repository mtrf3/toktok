package com.byted.cast.sdk;

import X.V0N;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.Surface;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.IAudioDataListener;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.ISinkDataListener;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.engine.VoipEngine;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.Logger;
import com.byted.cast.sdk.RTCSetting;
import com.byted.cast.sdk.core.RTCEngineImpl;
import com.byted.cast.sdk.utils.Utils;
import java.util.TimeZone;

/* loaded from: classes29.dex */
public abstract class RTCEngine {
    public static boolean isSource;

    public static String version() {
        return "3.10.2.1.overseas-tt";
    }

    public abstract void castCancel();

    public abstract void castRequest();

    public abstract void changeSurfaceFillType(int i);

    public abstract void connect(String str, int i, String str2, String str3);

    public abstract void decodeInput(String str, long j);

    public abstract void decodeOutput(String str, long j);

    public abstract void destroy();

    public abstract void disconnect();

    public abstract void dumpMediaData(int i, int i2);

    public abstract void enableSetMaxFps(boolean z);

    public abstract int getAudioSessionId(String str);

    public abstract RTCStatistics getStatistics();

    public abstract boolean inputExternalAudioFrame(byte[] bArr, int i);

    public abstract boolean inputExternalScreenFrame(byte[] bArr, int i, int i2, MediaSetting.VideoFormat videoFormat, int i3);

    public abstract boolean inputExternalVideoFrame(byte[] bArr, int i, int i2, MediaSetting.VideoFormat videoFormat, int i3);

    public abstract void kickOutSource(String str);

    public abstract void onScreenRecordRequestResult(int i, int i2, Intent intent);

    public abstract void prepareVideoEncoder();

    public abstract void reinit(Context context, RTCSetting rTCSetting, GLSurfaceView gLSurfaceView, IRTCEngineEventListener iRTCEngineEventListener, boolean z);

    public abstract void removePreviewSurface(Surface surface);

    public abstract void render(String str, long j);

    public abstract void requestIdrFromSource(String str);

    public abstract void requestScreenRecord(Activity activity, int i);

    public abstract void sendMetaData(String str);

    public abstract void sendMetaData(String str, String str2);

    public abstract void setApplication(Application application);

    public abstract void setAudioDataListener(Boolean bool, IAudioDataListener iAudioDataListener);

    public abstract void setAudioDropPolicyByMs(int i, int i2);

    public abstract void setAudioEnable(boolean z);

    public abstract void setAudioMaxDelayByMs(int i);

    public abstract void setAudioMix(Boolean bool);

    public abstract void setAudioMixScale(int i);

    public abstract void setAudioProfile(RTCAudioProfile rTCAudioProfile);

    public abstract void setAudioVolume(float f, float f2);

    public abstract void setBitrate(int i);

    public abstract void setCaptureSource(RTCSetting.VIDEO_SOURCE_TYPE video_source_type);

    public abstract void setCastToken(String str);

    public abstract void setFlashEnable(boolean z);

    public abstract void setInputPreviewSurface(Surface surface);

    public abstract void setInputSurfaceListener(ISurfaceListener iSurfaceListener);

    public abstract void setMediaProjection(MediaProjection mediaProjection);

    public abstract void setPinCode(String str);

    public abstract void setPlayerVolume(String str, float f);

    public abstract void setRecorderNeedResize(boolean z);

    public abstract void setScreenProfile(RTCScreenProfile rTCScreenProfile);

    public abstract void setSinkDataListener(Boolean bool, Boolean bool2, ISinkDataListener iSinkDataListener);

    public abstract void setSinkFeatures(int i);

    public abstract void setTransType(RTCSetting.TRANS_TYPE trans_type, RTCSetting.TRANS_TYPE trans_type2);

    public abstract void setVideoCodecID(RTCSetting.VCODEC_ID vcodec_id);

    public abstract void setVideoProfile(RTCVideoProfile rTCVideoProfile);

    public abstract void setVideoSourceType(RTCSetting.VIDEO_SOURCE_TYPE video_source_type);

    public abstract void setVideoSurface(String str, Surface surface);

    public abstract void setVirtualDisplayFlag(int i);

    public abstract void setVirtualDisplayName(String str);

    public abstract void setVirtualDisplayWH(int i, int i2);

    public abstract int sinkInitAndJoinRoom(String str, String str2, String str3, String str4);

    public abstract int sourceInitAndJoinRoom(String str, String str2, String str3, String str4);

    public abstract void startScreenRecord();

    public abstract void stopScreenRecord();

    public abstract void switchCamera(String str);

    /* loaded from: classes29.dex */
    public enum ConnectState {
        CLOSE,
        CONNECTING,
        CONNECTED,
        CONNECT_FAILED,
        DISCONNECTED,
        RECONNECTING,
        RECONNECTED,
        RECONNECT_FAILED,
        ERROR;

        public static ConnectState valueOf(String str) {
            return (ConnectState) V0N.LJJJ(ConnectState.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum ExitReason {
        REASON_DISCONNECT,
        REASON_NETWORK_ERROR,
        REASON_KICK_OUT,
        REASON_FATAL_ERROR,
        REASON_HEART_BEAT_ERROR,
        REASON_RECONNECT_FAILED,
        REASON_RECEIVE_SIGNAL_FAILED,
        REASON_WIFI_DISCONNECTED;

        public static ExitReason valueOf(String str) {
            return (ExitReason) V0N.LJJJ(ExitReason.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum RuntimeEnv {
        TESTING,
        ONLINE,
        CUSTOM;

        public static RuntimeEnv valueOf(String str) {
            return (RuntimeEnv) V0N.LJJJ(RuntimeEnv.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum VideoFormat {
        VIDEO_FORMAT_NV12,
        VIDEO_FORMAT_NV21,
        VIDEO_FORMAT_I420,
        VIDEO_FORMAT_YUYV422,
        VIDEO_FORMAT_YVYU422,
        VIDEO_FORMAT_YUV422P,
        VIDEO_FORMAT_RGB565,
        VIDEO_FORMAT_RGB24,
        VIDEO_FORMAT_BGR24,
        VIDEO_FORMAT_ARGB,
        VIDEO_FORMAT_RGBA,
        VIDEO_FORMAT_ABGR,
        VIDEO_FORMAT_BGRA,
        VIDEO_FORMAT_ES_H264,
        VIDEO_FORMAT_ES_H265;

        public static VideoFormat valueOf(String str) {
            return (VideoFormat) V0N.LJJJ(VideoFormat.class, str);
        }
    }

    public static void deinit(ContextManager.CastContext castContext) {
        VoipEngine.deinitialize(castContext);
    }

    public static ExitReason valueOf(int i) {
        switch (i) {
            case 0:
                return ExitReason.REASON_DISCONNECT;
            case 1:
                return ExitReason.REASON_NETWORK_ERROR;
            case 2:
                return ExitReason.REASON_KICK_OUT;
            case 3:
                return ExitReason.REASON_FATAL_ERROR;
            case 4:
                return ExitReason.REASON_HEART_BEAT_ERROR;
            case 5:
                return ExitReason.REASON_RECONNECT_FAILED;
            case 6:
                return ExitReason.REASON_RECEIVE_SIGNAL_FAILED;
            case 7:
                return ExitReason.REASON_WIFI_DISCONNECTED;
            default:
                return ExitReason.REASON_FATAL_ERROR;
        }
    }

    public static void setFileLogEnabled(ContextManager.CastContext castContext, boolean z) {
        VoipEngine.setFileLogEnabled(castContext, z);
    }

    public static void setLibraryLoader(ContextManager.CastContext castContext, ILibraryLoader iLibraryLoader) {
        VoipEngine.setLibraryLoader(iLibraryLoader);
    }

    public static boolean setLogLevel(ContextManager.CastContext castContext, int i) {
        if (isSource) {
            Logger.setLogLevel(i);
        }
        return VoipEngine.setLogLevel(castContext, i);
    }

    public static void setLogger(ContextManager.CastContext castContext, ILogger iLogger) {
        if (isSource) {
            Logger.setLogger(iLogger);
        }
        VoipEngine.setLogger(castContext, iLogger);
    }

    public static void init(Context context, ContextManager.CastContext castContext, boolean z) {
        isSource = z;
        init(context, castContext, RuntimeEnv.ONLINE, "", 3230, Utils.getScreenSize(context).x, Utils.getScreenSize(context).y, 30, z);
    }

    public static RTCEngine create(Context context, ContextManager.CastContext castContext, RTCSetting rTCSetting, IRTCEngineEventListener iRTCEngineEventListener, boolean z) {
        return new RTCEngineImpl(context, castContext, rTCSetting, iRTCEngineEventListener, z);
    }

    public static RTCEngine create(Context context, ContextManager.CastContext castContext, RTCSetting rTCSetting, GLSurfaceView gLSurfaceView, IRTCEngineEventListener iRTCEngineEventListener, boolean z) {
        return new RTCEngineImpl(context, castContext, rTCSetting, gLSurfaceView, iRTCEngineEventListener, z);
    }

    public static void init(Context context, ContextManager.CastContext castContext, RuntimeEnv runtimeEnv, String str, int i, int i2, int i3, int i4, boolean z) {
        VoipEngine.DeviceParams deviceParams = new VoipEngine.DeviceParams();
        deviceParams.deviceId = Utils.getDeviceId(context);
        deviceParams.sdkVersion = "3.10.2.1.overseas-tt";
        deviceParams.app = Utils.getAppName(context);
        deviceParams.appVersion = Utils.getAppVersion(context);
        deviceParams.appPackage = Utils.getPackageName(context);
        deviceParams.os = "Android";
        deviceParams.osVersion = Utils.osVersion();
        deviceParams.deviceModel = Build.MODEL;
        deviceParams.cpuType = Build.CPU_ABI;
        deviceParams.timeZone = TimeZone.getDefault().getID();
        deviceParams.width = i2;
        deviceParams.height = i3;
        deviceParams.fps = i4;
        VoipEngine.initialize(context, castContext, runtimeEnv, deviceParams, str, i, z);
    }
}
