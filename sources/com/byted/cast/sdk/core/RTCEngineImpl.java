package com.byted.cast.sdk.core;

import X.C16880lQ;
import X.C90177ZaH;
import X.X1D;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.projection.MediaProjection;
import android.net.Network;
import android.opengl.GLSurfaceView;
import android.os.IBinder;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.CodecType;
import com.byted.cast.common.api.IAudioDataListener;
import com.byted.cast.common.api.ISinkDataListener;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.engine.VoipEngine;
import com.byted.cast.mediacommon.IMediaRecorder;
import com.byted.cast.mediacommon.IMediaRecorderCallback;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.render.ILatencyListener;
import com.byted.cast.mediacommon.render.IMediaRender;
import com.byted.cast.mediacommon.render.IVideoFrameListener;
import com.byted.cast.mediacommon.render.MediaRenderState;
import com.byted.cast.mediacommon.render.parameters.CodecId;
import com.byted.cast.mediacommon.render.parameters.MediaParameter;
import com.byted.cast.mediacommon.render.parameters.MediaRenderErrorCode;
import com.byted.cast.mediacommon.render.parameters.VideoParameter;
import com.byted.cast.mediacommon.utils.Logger;
import com.byted.cast.sdk.IRTCEngineEventListener;
import com.byted.cast.sdk.RTCAudioProfile;
import com.byted.cast.sdk.RTCEngine;
import com.byted.cast.sdk.RTCMediaKind;
import com.byted.cast.sdk.RTCScreenProfile;
import com.byted.cast.sdk.RTCSetting;
import com.byted.cast.sdk.RTCStatistics;
import com.byted.cast.sdk.RTCVideoProfile;
import com.byted.cast.sdk.core.RTCEngineImpl;
import com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback;
import com.byted.cast.sdk.core.rtc.IRemoteMirrorConnector;
import com.byted.cast.sdk.monitor.AudioMonitor;
import com.byted.cast.sdk.monitor.DeviceMonitor;
import com.byted.cast.sdk.monitor.ForegroundMonitor;
import com.byted.cast.sdk.monitor.NetworkChangeReceiver;
import com.byted.cast.sdk.monitor.NetworkMonitor;
import com.byted.cast.sdk.monitor.PerformanceMonitor;
import com.byted.cast.sdk.monitor.ScreenMonitor;
import com.byted.cast.sdk.render.audio.AudioActivePlayer;
import com.byted.cast.sdk.render.audio.AudioPassivePlayer;
import com.byted.cast.sdk.render.audio.IAudioListener;
import com.byted.cast.sdk.render.video.NAL;
import com.byted.cast.sdk.render.video.SPS;
import com.byted.cast.sdk.render.video.VideoPlayer;
import com.byted.cast.sdk.render.video.golomb;
import com.byted.cast.sdk.service.OnKillApp;
import com.byted.cast.sdk.utils.HexDump;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class RTCEngineImpl extends RTCEngine implements VoipEngine.OnVoipEngineListener, AudioActivePlayer.IAudioFrameReader, DeviceMonitor.DeviceMonitorListener, NetworkChangeReceiver.NetworkChangeListener, OnKillApp.IKilledListener, ScreenMonitor.ScreenStateListener, ForegroundMonitor.ForegroundListener, IAudioListener {
    public static Map<Integer, Float> bpsMap;
    public int bitrateKps;
    public int bitrateKpsActual;
    public int bitrateKpsActual_last;
    public AudioActivePlayer mAudioActivePlayer;
    public IAudioDataListener mAudioDataListener;
    public Map<String, AudioPassivePlayer> mAudioPassivePlayers;
    public boolean mAutoPlayAudio;
    public Boolean mCallbackDataToUser;
    public ContextManager.CastContext mCastContext;
    public final Object mCastStateLock;
    public Context mContext;
    public RtpAudioPacket mCurAudioData;
    public DeviceMonitor mDeviceMonitor;
    public boolean mDupAudio;
    public int mDupAudioSeq;
    public Boolean mEnablePlaying;
    public golomb mGolomb;
    public Map<String, Boolean> mIsCastingMap;
    public Map<String, Boolean> mIsFirstFrameMap;
    public boolean mIsMediaRender;
    public boolean mIsScreenOn;
    public boolean mIsScreenStreamExist;
    public boolean mIsSource;
    public KeyguardManager mKeyguardManager;
    public OnKillApp mKilledApp;
    public CastLogger mLogger;
    public IMediaRecorder mMediaRecorder;
    public Map<String, IMediaRender> mMediaRenders;
    public MediaSetting mMediaSetting;
    public CastMonitor mMonitor;
    public List<DeviceMonitor.DeviceEvent> mMonitorDeviceEvents;
    public NetworkChangeReceiver mNetworkMonitor;
    public RtpAudioPacket mPreAudioData;
    public RtpAudioPacket mPrePreAudioData;
    public Surface mPreviewSurface;
    public RTCEventNotifier mRTCEventNotifier;
    public final IRemoteMirrorCallback mRemoteMirrorCallback;
    public IRemoteMirrorConnector mRemoteMirrorConnector;
    public boolean mRemoteMirrorJoined;
    public boolean mRoleSource;
    public boolean mScreenLocked;
    public ScreenMonitor mScreenMonitor;
    public RTCSetting mSetting;
    public ISinkDataListener mSinkDataListener;
    public Map<String, VideoInfo> mSinkVideoInfos;
    public Map<String, Surface> mSurfaces;
    public byte[] mVideoCodecInfo;
    public Map<String, VideoPlayer> mVideoPlayers;
    public VoipEngine mVoipEngine;
    public IMediaRecorderCallback recorderCallback;
    public ServiceConnection serviceConnection;
    public ExecutorService singleExecutor;
    public byte[] spspps;
    public volatile long start_recorder_time;
    public ISurfaceListener surfaceListener;

    @Override // com.byted.cast.sdk.monitor.ScreenMonitor.ScreenStateListener
    public void onScreenOff() {
        this.mIsScreenOn = false;
        KeyguardManager keyguardManager = this.mKeyguardManager;
        if (keyguardManager != null) {
            this.mScreenLocked = keyguardManager.inKeyguardRestrictedInputMode();
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenOff:");
        LIZ.append(this.mIsScreenOn);
        LIZ.append(", mScreenLocked:");
        LIZ.append(this.mScreenLocked);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
    }

    @Override // com.byted.cast.sdk.monitor.ScreenMonitor.ScreenStateListener
    public void onScreenOn() {
        this.mIsScreenOn = true;
        KeyguardManager keyguardManager = this.mKeyguardManager;
        if (keyguardManager != null) {
            this.mScreenLocked = keyguardManager.inKeyguardRestrictedInputMode();
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenOn:");
        LIZ.append(this.mIsScreenOn);
        LIZ.append(", mScreenLocked:");
        LIZ.append(this.mScreenLocked);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
    }

    /* renamed from: com.byted.cast.sdk.core.RTCEngineImpl$6, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$sdk$RTCSetting$VCODEC_ID;

        static {
            int[] iArr = new int[RTCSetting.VCODEC_ID.values().length];
            $SwitchMap$com$byted$cast$sdk$RTCSetting$VCODEC_ID = iArr;
            try {
                iArr[RTCSetting.VCODEC_ID.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$RTCSetting$VCODEC_ID[RTCSetting.VCODEC_ID.H264.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$RTCSetting$VCODEC_ID[RTCSetting.VCODEC_ID.H265.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$RTCSetting$VCODEC_ID[RTCSetting.VCODEC_ID.LOSSLESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        bpsMap = hashMap;
        hashMap.put(10, Float.valueOf(1.0f));
        bpsMap.put(50, Float.valueOf(0.8f));
        bpsMap.put(80, Float.valueOf(0.7f));
        bpsMap.put(100, Float.valueOf(0.5f));
        bpsMap.put(10000, Float.valueOf(0.2f));
    }

    private boolean createConnector() {
        try {
            IRemoteMirrorConnector iRemoteMirrorConnector = (IRemoteMirrorConnector) Class.forName("com.byted.cast.rtc.ByteRtcConnector").newInstance();
            this.mRemoteMirrorConnector = iRemoteMirrorConnector;
            iRemoteMirrorConnector.setRTCCallback(this.mRemoteMirrorCallback);
            this.mRemoteMirrorConnector.init(this.mContext, this.mSetting.getScreenProfile().getWidth(), this.mSetting.getScreenProfile().getHeight(), this.mSetting.getScreenProfile().getFps(), this.mSetting.getScreenProfile().getMaxBitrate());
            return true;
        } catch (Exception e) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("can't find class ByteRTC:");
            LIZ.append(e);
            castLogger.w("RTCEngineImpl", X1D.LIZIZ(LIZ));
            this.mRemoteMirrorConnector = null;
            return false;
        }
    }

    private void createMediaRecorderCallback() {
        this.mLogger.i("RTCEngineImpl", "createMediaRecorderCallback");
        this.recorderCallback = new IMediaRecorderCallback() { // from class: com.byted.cast.sdk.core.RTCEngineImpl.1
            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioEncoder(String str, int i, int i2, int i3, int i4) {
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoEncoder(String str, int i, int i2, int i3, int i4) {
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onPaused() {
                RTCEngineImpl.this.mRTCEventNotifier.onPaused();
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onResumed() {
                RTCEngineImpl.this.mRTCEventNotifier.onResumed();
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onStopped() {
                RTCEngineImpl.this.mRTCEventNotifier.onStopped();
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioRecordFailed(int i) {
                CastLogger castLogger = RTCEngineImpl.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onAudioRecordFailed code=");
                LIZ.append(i);
                castLogger.e("RTCEngineImpl", X1D.LIZIZ(LIZ));
                RTCEngineImpl.this.mRTCEventNotifier.onError(14004004, "onAudioRecordFailed");
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoRecordError(int i, String str) {
                RTCEngineImpl.this.mRTCEventNotifier.onError(i, str);
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioFrameAvailable(byte[] bArr, int i, MediaSetting.ACODEC_ID acodec_id, long j) {
                RTCEngineImpl.this.mLogger.d("RTCEngineImpl", "onAudioFrameAvailable, data:" + bArr + ", size:" + i + ", format:" + acodec_id + ", timestampUs:" + j);
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                if (rTCEngineImpl.mDupAudio) {
                    rTCEngineImpl.mPrePreAudioData = rTCEngineImpl.mPreAudioData;
                    rTCEngineImpl.mPreAudioData = rTCEngineImpl.mCurAudioData;
                    int i2 = rTCEngineImpl.mDupAudioSeq + 1;
                    rTCEngineImpl.mDupAudioSeq = i2;
                    rTCEngineImpl.mCurAudioData = new RtpAudioPacket(bArr, i2, i);
                    RTCEngineImpl rTCEngineImpl2 = RTCEngineImpl.this;
                    if (rTCEngineImpl2.mPrePreAudioData != null) {
                        rTCEngineImpl2.mLogger.d("RTCEngineImpl", "onAudioFrameAvailable, doInputAudioFrame, data.length:" + RTCEngineImpl.this.mPrePreAudioData.mSize + ", timestampUs:" + RTCEngineImpl.this.mPrePreAudioData.mRtpTimeStamp);
                        RTCEngineImpl rTCEngineImpl3 = RTCEngineImpl.this;
                        RtpAudioPacket rtpAudioPacket = rTCEngineImpl3.mPrePreAudioData;
                        rTCEngineImpl3.doInputAudioFrame(rtpAudioPacket.mData, rtpAudioPacket.mSize, acodec_id, rtpAudioPacket.mRtpTimeStamp);
                    }
                    RTCEngineImpl rTCEngineImpl4 = RTCEngineImpl.this;
                    if (rTCEngineImpl4.mPreAudioData != null) {
                        rTCEngineImpl4.mLogger.d("RTCEngineImpl", "onAudioFrameAvailable, doInputAudioFrame, data.length:" + RTCEngineImpl.this.mPreAudioData.mSize + ", timestampUs:" + RTCEngineImpl.this.mPreAudioData.mRtpTimeStamp);
                        RTCEngineImpl rTCEngineImpl5 = RTCEngineImpl.this;
                        RtpAudioPacket rtpAudioPacket2 = rTCEngineImpl5.mPreAudioData;
                        rTCEngineImpl5.doInputAudioFrame(rtpAudioPacket2.mData, rtpAudioPacket2.mSize, acodec_id, rtpAudioPacket2.mRtpTimeStamp);
                    }
                    RTCEngineImpl rTCEngineImpl6 = RTCEngineImpl.this;
                    if (rTCEngineImpl6.mCurAudioData != null) {
                        rTCEngineImpl6.mLogger.d("RTCEngineImpl", "onAudioFrameAvailable, doInputAudioFrame, data.length:" + RTCEngineImpl.this.mCurAudioData.mSize + ", timestampUs:" + RTCEngineImpl.this.mCurAudioData.mRtpTimeStamp);
                        RTCEngineImpl rTCEngineImpl7 = RTCEngineImpl.this;
                        RtpAudioPacket rtpAudioPacket3 = rTCEngineImpl7.mCurAudioData;
                        rTCEngineImpl7.doInputAudioFrame(rtpAudioPacket3.mData, rtpAudioPacket3.mSize, acodec_id, rtpAudioPacket3.mRtpTimeStamp);
                        return;
                    }
                    return;
                }
                rTCEngineImpl.doInputAudioFrame(bArr, i, acodec_id, j);
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioPcm(byte[] bArr, int i, int i2, int i3, int i4, long j) {
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                if (rTCEngineImpl.mRemoteMirrorJoined) {
                    rTCEngineImpl.inputAudioViaRTC(bArr, i, i2, i3, i4, j);
                }
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoFrameCodec(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4) {
                CastLogger castLogger = RTCEngineImpl.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onVideoFrameCodec, size:");
                LIZ.append(i);
                LIZ.append(", w:");
                LIZ.append(i2);
                LIZ.append(", h:");
                LIZ.append(i3);
                LIZ.append(", rotation:");
                LIZ.append(i4);
                LIZ.append(", dump:");
                int i5 = 32;
                if (bArr.length <= 32) {
                    i5 = bArr.length;
                }
                LIZ.append(HexDump.toHexString(bArr, 0, i5));
                castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                byte[] bArr2 = new byte[bArr.length];
                rTCEngineImpl.spspps = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, i);
                RTCEngineImpl rTCEngineImpl2 = RTCEngineImpl.this;
                if (rTCEngineImpl2.mRemoteMirrorJoined) {
                    rTCEngineImpl2.mVideoCodecInfo = Arrays.copyOf(bArr, i);
                } else {
                    rTCEngineImpl2.doInputScreenFrame(bArr, i, i2, i3, videoFormat, j, i4, 1);
                }
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoFrameAvailable(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4, int i5) {
                CastLogger castLogger = RTCEngineImpl.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onVideoFrameAvailable, size:");
                LIZ.append(i);
                LIZ.append(", w:");
                LIZ.append(i2);
                LIZ.append(", h:");
                LIZ.append(i3);
                LIZ.append(", rotation:");
                LIZ.append(i4);
                LIZ.append(", dump:");
                int i6 = 32;
                if (bArr.length <= 32) {
                    i6 = bArr.length;
                }
                LIZ.append(HexDump.toHexString(bArr, 0, i6));
                castLogger.v("RTCEngineImpl", X1D.LIZIZ(LIZ));
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                if (rTCEngineImpl.mRemoteMirrorJoined) {
                    rTCEngineImpl.inputVideoViaRTC(bArr, i, i2, i3, videoFormat, j, i4, i5);
                } else {
                    rTCEngineImpl.doInputScreenFrame(bArr, i, i2, i3, videoFormat, j, i4, i5);
                }
            }
        };
    }

    private void unregisterServices() {
        ScreenMonitor screenMonitor;
        try {
            Context context = this.mContext;
            if (context != null) {
                context.unbindService(this.serviceConnection);
            }
            NetworkChangeReceiver networkChangeReceiver = this.mNetworkMonitor;
            if (networkChangeReceiver != null) {
                networkChangeReceiver.unregister();
                this.mNetworkMonitor = null;
            }
            if (!this.mIsSource && (screenMonitor = this.mScreenMonitor) != null) {
                screenMonitor.unregister();
                this.mScreenMonitor = null;
            }
            this.mDeviceMonitor.unmonitor(this.mMonitorDeviceEvents);
        } catch (Exception e) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unregisterServices failed:");
            LIZ.append(e);
            castLogger.w("RTCEngineImpl", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void castCancel() {
        this.mLogger.i("RTCEngineImpl", "castCancel+");
        synchronized (this.mCastStateLock) {
            if (this.mMediaRecorder != null) {
                C90177ZaH.LJJJIL(this.mLogger);
                C90177ZaH.LJJJJ(this.mMonitor);
                this.mMediaRecorder.removeMediaRecorderCallback(this.recorderCallback);
                this.mMediaRecorder.stop();
                this.mDupAudioSeq = 0;
                this.mCurAudioData = null;
                this.mPreAudioData = null;
                this.mPrePreAudioData = null;
            }
            if (this.mRemoteMirrorJoined) {
                this.mRTCEventNotifier.onCancelSuccess();
                disconnect();
            } else {
                this.mVoipEngine.castCancel();
            }
        }
        this.mLogger.i("RTCEngineImpl", "castCancel-");
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void castRequest() {
        this.mLogger.i("RTCEngineImpl", "castRequest ");
        if (this.mRemoteMirrorJoined) {
            this.mRTCEventNotifier.onCastSuccess();
            return;
        }
        synchronized (this.mCastStateLock) {
            this.mVoipEngine.castRequest();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void destroy() {
        this.mLogger.i("RTCEngineImpl", "destroy +");
        synchronized (this.mCastStateLock) {
            unregisterServices();
            try {
                this.mVoipEngine.setOnVoipEngineListener(null);
                if (!this.mRemoteMirrorJoined && this.mMediaRecorder != null) {
                    C90177ZaH.LJJJIL(this.mLogger);
                    C90177ZaH.LJJJJ(this.mMonitor);
                    this.mMediaRecorder.removeMediaRecorderCallback(this.recorderCallback);
                    this.mMediaRecorder.stop();
                }
                AudioActivePlayer audioActivePlayer = this.mAudioActivePlayer;
                if (audioActivePlayer != null) {
                    audioActivePlayer.stop();
                } else {
                    for (String str : this.mAudioPassivePlayers.keySet()) {
                        if (!TextUtils.equals(str, "bytelink-remote-mirror")) {
                            this.mAudioPassivePlayers.get(str).stopPlay();
                            this.mAudioPassivePlayers.remove(str);
                        }
                    }
                }
                for (String str2 : this.mVideoPlayers.keySet()) {
                    if (!TextUtils.equals(str2, "bytelink-remote-mirror")) {
                        this.mVideoPlayers.get(str2).stopPlay();
                        this.mVideoPlayers.remove(str2);
                    }
                }
                this.mVoipEngine.destroy();
                this.mRTCEventNotifier.remove();
                this.mSetting = null;
                this.mContext = null;
            } catch (Exception e) {
                CastLogger castLogger = this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed destroy:");
                LIZ.append(e);
                castLogger.w("RTCEngineImpl", X1D.LIZIZ(LIZ));
            }
        }
        this.mLogger.i("RTCEngineImpl", "destroy -");
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void disconnect() {
        this.mLogger.i("RTCEngineImpl", "disconnect");
        if (this.mRemoteMirrorJoined) {
            this.mLogger.i("RTCEngineImpl", "disconnect RTC");
            IRemoteMirrorConnector iRemoteMirrorConnector = this.mRemoteMirrorConnector;
            if (iRemoteMirrorConnector != null) {
                iRemoteMirrorConnector.leaveRoom();
            }
            this.mRTCEventNotifier.onMonitorEvent("rtclink_source_leave_room", "");
            this.mRemoteMirrorJoined = false;
            this.mRTCEventNotifier.onDisconnect(RTCEngine.ExitReason.REASON_KICK_OUT, "rtc_active");
            return;
        }
        synchronized (this.mCastStateLock) {
            this.mLogger.i("RTCEngineImpl", "disconnect Bytelink");
            this.mVoipEngine.disconnect();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public RTCStatistics getStatistics() {
        RTCStatistics fromJson = RTCStatistics.fromJson(this.mVoipEngine.getStatistics());
        if (fromJson == null) {
            return new RTCStatistics();
        }
        return fromJson;
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onCancelSuccess() {
        this.mLogger.i("RTCEngineImpl", "onCancelSuccess: Source +");
        this.mRTCEventNotifier.onCancelSuccess();
        this.mLogger.i("RTCEngineImpl", "onCancelSuccess: Source -");
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onCastSuccess() {
        this.mLogger.i("RTCEngineImpl", "onCastSuccess: Source+");
        this.mDupAudioSeq = 0;
        this.mCurAudioData = null;
        this.mPreAudioData = null;
        this.mPrePreAudioData = null;
        this.mRTCEventNotifier.onCastSuccess();
        this.mLogger.i("RTCEngineImpl", "onCastSuccess: Source-");
    }

    @Override // com.byted.cast.sdk.monitor.ForegroundMonitor.ForegroundListener
    public void onIntoBackground() {
        this.mLogger.i("RTCEngineImpl", "onIntoBackground");
        for (Map.Entry<String, Boolean> entry : this.mIsCastingMap.entrySet()) {
            if (entry.getValue().booleanValue()) {
                RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
                if (rTCEventNotifier != null) {
                    rTCEventNotifier.onIntoBackground(entry.getKey());
                }
                stopVideoPlayback(entry.getKey());
            }
        }
    }

    @Override // com.byted.cast.sdk.monitor.ForegroundMonitor.ForegroundListener
    public void onIntoForeground() {
        this.mLogger.i("RTCEngineImpl", "onIntoForeground");
        for (Map.Entry<String, Boolean> entry : this.mIsCastingMap.entrySet()) {
            if (entry.getValue().booleanValue()) {
                startVideoPlayback(entry.getKey(), false);
                RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
                if (rTCEventNotifier != null) {
                    rTCEventNotifier.onIntoForeground(entry.getKey());
                }
            }
        }
    }

    @Override // com.byted.cast.sdk.monitor.ScreenMonitor.ScreenStateListener
    public void onKeyguardUnlock() {
        KeyguardManager keyguardManager = this.mKeyguardManager;
        if (keyguardManager != null) {
            this.mScreenLocked = keyguardManager.inKeyguardRestrictedInputMode();
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onKeyguardUnlock, mScreenLocked:");
        LIZ.append(this.mScreenLocked);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
    }

    @Override // com.byted.cast.sdk.service.OnKillApp.IKilledListener
    public void onKilled() {
        this.mLogger.i("RTCEngineImpl", "onKilled");
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onKilled();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void prepareVideoEncoder() {
        this.mLogger.i("RTCEngineImpl", "prepareVideoEncoder");
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.prepareVideoEncoder();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void startScreenRecord() {
        this.mLogger.i("RTCEngineImpl", "startScreenRecord");
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.addMediaRecorderCallback(this.recorderCallback);
            this.mMediaRecorder.start();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void stopScreenRecord() {
        this.mLogger.i("RTCEngineImpl", "stopScreenRecord");
        synchronized (this.mCastStateLock) {
            if (this.mMediaRecorder != null) {
                C90177ZaH.LJJJIL(this.mLogger);
                C90177ZaH.LJJJJ(this.mMonitor);
                this.mMediaRecorder.removeMediaRecorderCallback(this.recorderCallback);
                this.mMediaRecorder.stop();
            }
        }
    }

    /* loaded from: classes29.dex */
    public class VideoInfo {
        public int height;
        public int width;

        public VideoInfo() {
        }
    }

    private void removeSurface(String str) {
        Surface surface = this.mSurfaces.get(str);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeSurface:");
        LIZ.append(str);
        LIZ.append(", surface:");
        LIZ.append(surface);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (surface != null) {
            this.mSurfaces.remove(str);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void changeSurfaceFillType(int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeSurfaceFillType");
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.changeSurfaceFillType(MediaSetting.FILL_TYPE.values()[i]);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void enableSetMaxFps(boolean z) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableSetMaxFps");
        LIZ.append(z);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.enableSetMaxFps(z);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public int getAudioSessionId(String str) {
        for (String str2 : this.mAudioPassivePlayers.keySet()) {
            if (TextUtils.equals(str, str2)) {
                AudioPassivePlayer audioPassivePlayer = this.mAudioPassivePlayers.get(str2);
                if (audioPassivePlayer != null) {
                    return audioPassivePlayer.getAudioSessionId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void kickOutSource(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOutSource: ");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        synchronized (this.mCastStateLock) {
            stopAudioPlayback(str);
            stopVideoPlayback(str);
            if (this.mIsMediaRender && this.mMediaRenders.get(str) != null) {
                this.mMediaRenders.remove(str);
            }
            if ("bytelink-remote-mirror".equals(str)) {
                IRemoteMirrorConnector iRemoteMirrorConnector = this.mRemoteMirrorConnector;
                if (iRemoteMirrorConnector != null) {
                    iRemoteMirrorConnector.leaveRoom();
                }
                this.mRTCEventNotifier.onMonitorEvent("rtclink_sink_leave_room", "");
                this.mRemoteMirrorJoined = false;
            } else {
                this.mVoipEngine.kickOutSource(str);
            }
        }
    }

    @Override // com.byted.cast.sdk.monitor.NetworkChangeReceiver.NetworkChangeListener
    public void onAvailable(Network network) {
        this.mLogger.i("RTCEngineImpl", "onAvailable");
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onCancelRequest(String str) {
        this.mLogger.i("RTCEngineImpl", "onCancelRequest: Sink");
        Map<String, Boolean> map = this.mIsFirstFrameMap;
        Boolean bool = Boolean.FALSE;
        map.put(str, bool);
        this.mIsCastingMap.put(str, bool);
        this.mRTCEventNotifier.onCancelRequest(str);
        stopAudioPlayback(str);
        stopVideoPlayback(str);
        if (this.mIsMediaRender && this.mMediaRenders.get(str) != null) {
            this.mMediaRenders.remove(str);
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onCastPause(RTCMediaKind rTCMediaKind) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCastPause: ");
        LIZ.append(rTCMediaKind.toString());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.pause();
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onCastResume(RTCMediaKind rTCMediaKind) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCastResume: ");
        LIZ.append(rTCMediaKind.toString());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.resume();
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onConnectStateChanged(RTCEngine.ConnectState connectState) {
        if (connectState == RTCEngine.ConnectState.DISCONNECTED) {
            this.mIsScreenStreamExist = false;
        }
        this.mRTCEventNotifier.onConnectStateChanged(connectState);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onIdrRequest(RTCMediaKind rTCMediaKind) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onIdrRequest: ");
        LIZ.append(rTCMediaKind.toString());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.requestIDR();
        }
    }

    @Override // com.byted.cast.sdk.monitor.NetworkChangeReceiver.NetworkChangeListener
    public void onLost(Network network) {
        this.mLogger.i("RTCEngineImpl", "onLost");
        onDisconnect(RTCEngine.ExitReason.REASON_WIFI_DISCONNECTED, "wifi is disconnected");
    }

    @Override // com.byted.cast.sdk.monitor.DeviceMonitor.DeviceMonitorListener
    public void onPerformanceUpdated(PerformanceMonitor.Performance performance) {
        this.mVoipEngine.notifyDeviceEvent(DeviceMonitor.DeviceEvent.EVENT_PERFORMANCE_UPDATED.ordinal(), performance.toString(), null, null);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onRecvMetaData(String str) {
        try {
            if (TextUtils.equals(JSONObjectProtectorUtils.getString(new JSONObject(str), "cmd"), "requestIDR")) {
                this.mLogger.i("RTCEngineImpl", "onRecvMetaData, receive request IDR from sink!");
                onIdrRequest(RTCMediaKind.SCREEN);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.mRTCEventNotifier.onRecvMetaData(str);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onStat(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStat:");
        LIZ.append(str);
        castLogger.v("RTCEngineImpl", X1D.LIZIZ(LIZ));
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onStat(str);
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onStuckStat(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStuckStat:");
        LIZ.append(str);
        castLogger.v("RTCEngineImpl", X1D.LIZIZ(LIZ));
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onStuckStat(str);
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onUpdateRtt(int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateRtt: ");
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (this.mMediaRecorder != null) {
            Integer num = 0;
            Iterator<Integer> it = bpsMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (i < next.intValue()) {
                    num = next;
                    break;
                }
            }
            if (num.intValue() != 0) {
                this.bitrateKpsActual = (int) (this.bitrateKps * bpsMap.get(num).floatValue());
            }
            if (this.bitrateKpsActual_last != this.bitrateKpsActual) {
                this.mLogger.i("RTCEngineImpl", "setBitrateKps: " + this.bitrateKpsActual);
                this.mMediaRecorder.setBitrateKps(this.bitrateKpsActual);
                this.bitrateKpsActual_last = this.bitrateKpsActual;
            }
        }
    }

    @Override // com.byted.cast.sdk.render.audio.AudioActivePlayer.IAudioFrameReader
    public int readAudioFrame(byte[] bArr) {
        return this.mVoipEngine.readRemoteAudioFrame(bArr, bArr.length, this.mSetting.getAudioProfile().getPlaySampleRate());
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void removePreviewSurface(Surface surface) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removePreviewSurface");
        LIZ.append(surface);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.removeSurface(surface);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void requestIdrFromSource(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestIdrFromSource, userId:");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cmd", "requestIDR");
            sendMetaData(str, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void sendMetaData(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendMetaData+, json:");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        synchronized (this.mCastStateLock) {
            this.mVoipEngine.sendMetaData(str);
        }
        this.mLogger.i("RTCEngineImpl", "sendMetaData-");
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setApplication(Application application) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setApplication:");
        LIZ.append(application);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        ForegroundMonitor.init(application, this);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioEnable(boolean z) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioEnable");
        LIZ.append(z);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setAudioEnable(z);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioMaxDelayByMs(int i) {
        this.mVoipEngine.setAudioMaxDelayByMs(i);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioMix(Boolean bool) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioMix");
        LIZ.append(bool);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        MediaSetting mediaSetting = this.mMediaSetting;
        if (mediaSetting != null) {
            mediaSetting.getAudioProfile().setEnableAudioMix(bool.booleanValue());
        }
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.enableAudioMix(bool.booleanValue());
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioMixScale(int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioMixScale");
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setAudioMixScale(i);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioProfile(RTCAudioProfile rTCAudioProfile) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioProfile: ");
        LIZ.append(rTCAudioProfile.toString());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mVoipEngine.setAudioProfile(rTCAudioProfile);
        if (!this.mSetting.isExternalAudioSource()) {
            this.mSetting.setAudioProfile(rTCAudioProfile);
            this.mMediaSetting.getAudioProfile().setAudioSource(rTCAudioProfile.getAudioSource());
            this.mMediaSetting.getAudioProfile().setBitwidth(rTCAudioProfile.getBitwidth());
            this.mMediaSetting.getAudioProfile().setBitrate(rTCAudioProfile.getBitrate(), rTCAudioProfile.getMaxBitrate());
            this.mMediaSetting.getAudioProfile().setSampleRate(rTCAudioProfile.getRecordSampleRate());
            this.mMediaSetting.getAudioProfile().setEnabled(rTCAudioProfile.isEnabled());
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setBitrate(int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setBitrate: ");
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.bitrateKps = i;
        this.bitrateKpsActual = i;
        this.bitrateKpsActual_last = i;
        try {
            IMediaRecorder iMediaRecorder = this.mMediaRecorder;
            if (iMediaRecorder != null) {
                iMediaRecorder.setBitrateKps(i);
            }
        } catch (IllegalStateException e) {
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setBitrate in wrong state:");
            LIZ2.append(e);
            castLogger2.w("RTCEngineImpl", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setCaptureSource(RTCSetting.VIDEO_SOURCE_TYPE video_source_type) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCaptureSource");
        LIZ.append(video_source_type);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        synchronized (this.mCastStateLock) {
            IMediaRecorder iMediaRecorder = this.mMediaRecorder;
            if (iMediaRecorder != null) {
                if (video_source_type == RTCSetting.VIDEO_SOURCE_TYPE.SCREEN) {
                    iMediaRecorder.requestMediaRecord();
                }
                this.mMediaRecorder.setCaptureSource(MediaSetting.VIDEO_SOURCE_TYPE.values()[video_source_type.ordinal()]);
            }
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setCastToken(String str) {
        this.mLogger.i("RTCEngineImpl", "setCastToken+");
        synchronized (this.mCastStateLock) {
            this.mVoipEngine.setCastToken(str);
        }
        this.mLogger.i("RTCEngineImpl", "setCastToken-");
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setFlashEnable(boolean z) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setFlashEnable");
        LIZ.append(z);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setFlashEnable(z);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setInputPreviewSurface(Surface surface) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setInputPreviewSurface: ");
        LIZ.append(surface);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mPreviewSurface = surface;
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setPreviewSurface(surface);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setInputSurfaceListener(ISurfaceListener iSurfaceListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setInputSurfaceListener:");
        LIZ.append(iSurfaceListener);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.surfaceListener = iSurfaceListener;
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setInputSurfaceListener(iSurfaceListener);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setMediaProjection(MediaProjection mediaProjection) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMediaProjection");
        LIZ.append(mediaProjection);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setMediaProjection(mediaProjection);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setPinCode(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPinCode: ");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mVoipEngine.setPinCode(str);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setRecorderNeedResize(boolean z) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRecorderNeedResize");
        LIZ.append(z);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setResizeScreen(z);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setScreenProfile(RTCScreenProfile rTCScreenProfile) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setScreenProfile: ");
        LIZ.append(rTCScreenProfile.toString());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mVoipEngine.setScreenProfile(rTCScreenProfile);
        if (!this.mSetting.isExternalScreenSource()) {
            this.mSetting.setScreenProfile(rTCScreenProfile);
            IMediaRecorder iMediaRecorder = this.mMediaRecorder;
            if (iMediaRecorder != null) {
                iMediaRecorder.setDisplay(rTCScreenProfile.getWidth(), rTCScreenProfile.getHeight(), rTCScreenProfile.getBitrate(), rTCScreenProfile.getFps());
                this.mMediaRecorder.setVirtualDisplayFlag(rTCScreenProfile.getVirtualDisplayFlag());
                this.mMediaRecorder.setVideoCodecID(MediaSetting.VCODEC_ID.values()[rTCScreenProfile.getCodecId().ordinal()]);
            }
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setSinkFeatures(int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSinkFeatures: features=");
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if ((i & 1) != 0) {
            this.mLogger.i("RTCEngineImpl", "setSinkFeatures: enable FEATURE_AUDIO_DUP");
            this.mDupAudio = true;
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setVideoCodecID(RTCSetting.VCODEC_ID vcodec_id) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoCodecID:");
        LIZ.append(vcodec_id);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (this.mMediaRecorder != null) {
            MediaSetting.VCODEC_ID vcodec_id2 = MediaSetting.VCODEC_ID.H264;
            int i = AnonymousClass6.$SwitchMap$com$byted$cast$sdk$RTCSetting$VCODEC_ID[vcodec_id.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            vcodec_id2 = MediaSetting.VCODEC_ID.LOSSLESS;
                        }
                    } else {
                        vcodec_id2 = MediaSetting.VCODEC_ID.H265;
                    }
                }
            } else {
                vcodec_id2 = MediaSetting.VCODEC_ID.AUTO;
            }
            this.mMediaRecorder.setVideoCodecID(vcodec_id2);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setVideoProfile(RTCVideoProfile rTCVideoProfile) {
        String str;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoProfile: ");
        LIZ.append(rTCVideoProfile);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mVoipEngine.setVideoProfile(rTCVideoProfile);
        if (!this.mSetting.isExternalScreenSource()) {
            this.mSetting.setVideoProfile(rTCVideoProfile);
            this.mMediaSetting.getVideoProfile().setCameraInfo(rTCVideoProfile.getCameraId().ordinal());
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setVideoProfile: cameraid");
            LIZ2.append(rTCVideoProfile.getCameraId());
            castLogger2.i("RTCEngineImpl", X1D.LIZIZ(LIZ2));
            IMediaRecorder iMediaRecorder = this.mMediaRecorder;
            if (iMediaRecorder != null) {
                if (rTCVideoProfile.getCameraId().ordinal() == 0) {
                    str = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str = "1";
                }
                iMediaRecorder.switchCamera(str);
            }
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setVideoSourceType(RTCSetting.VIDEO_SOURCE_TYPE video_source_type) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoSourceType: ");
        LIZ.append(video_source_type);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (!this.mSetting.isExternalScreenSource()) {
            this.mSetting.setVideoSourceType(video_source_type);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setVirtualDisplayFlag(int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVirtualDisplayFlag");
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setVirtualDisplayFlag(i);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setVirtualDisplayName(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVirtualDisplayName");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setVirtualDisplayName(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        if (r9.mAudioPassivePlayers.get(r1) == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startAudioPlayback(java.lang.String r10) {
        /*
            r9 = this;
            com.byted.cast.common.CastLogger r3 = r9.mLogger
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "startAudioPlayback userId="
            r1.append(r0)
            r5 = r10
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r2 = "RTCEngineImpl"
            r3.i(r2, r0)
            boolean r0 = r9.mIsMediaRender
            if (r0 == 0) goto L68
            java.util.Map<java.lang.String, com.byted.cast.mediacommon.render.IMediaRender> r0 = r9.mMediaRenders
            java.lang.Object r1 = r0.get(r5)
            com.byted.cast.mediacommon.render.IMediaRender r1 = (com.byted.cast.mediacommon.render.IMediaRender) r1
            com.byted.cast.common.CastLogger r3 = r9.mLogger
            java.lang.String r0 = "mediarender start audio player"
            r3.i(r2, r0)
            com.byted.cast.mediacommon.render.parameters.AudioParameter r2 = new com.byted.cast.mediacommon.render.parameters.AudioParameter
            r2.<init>()
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r0 = r0.getAudioProfile()
            int r0 = r0.getPlaySampleRate()
            r2.sampleRate = r0
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r0 = r0.getAudioProfile()
            int r0 = r0.getNumberOfChannels()
            r2.channels = r0
            com.byted.cast.mediacommon.render.parameters.CodecId r0 = com.byted.cast.mediacommon.render.parameters.CodecId.AACLC
            r2.codecId = r0
            int r0 = r2.sampleRate
            int r0 = com.byted.cast.mediacommon.AudioProfile.getFrameSize(r0)
            r2.frameSize = r0
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r0 = r0.getAudioProfile()
            int r0 = r0.getBitwidth()
            r2.bitWidth = r0
            r0 = 0
            r1.setAudioParameter(r0, r2)
            r1.startAudioPlayer(r0)
            return
        L68:
            com.byted.cast.sdk.render.audio.AudioActivePlayer r4 = r9.mAudioActivePlayer
            if (r4 == 0) goto L98
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r0 = r0.getAudioProfile()
            int r3 = r0.getAudioStreamType()
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r0 = r0.getAudioProfile()
            int r2 = r0.getPlaySampleRate()
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r0 = r0.getAudioProfile()
            int r1 = r0.getNumberOfChannels()
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r0 = r0.getAudioProfile()
            int r0 = r0.getBitwidth()
            r4.start(r3, r2, r1, r0)
        L97:
            return
        L98:
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.audio.AudioPassivePlayer> r0 = r9.mAudioPassivePlayers
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        La2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.equals(r5, r1)
            if (r0 == 0) goto La2
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.audio.AudioPassivePlayer> r0 = r9.mAudioPassivePlayers
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto Ld7
        Lbc:
            com.byted.cast.sdk.render.audio.AudioPassivePlayer r4 = new com.byted.cast.sdk.render.audio.AudioPassivePlayer
            com.byted.cast.common.ContextManager$CastContext r6 = r9.mCastContext
            boolean r0 = r9.mAutoPlayAudio
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            com.byted.cast.sdk.RTCSetting r0 = r9.mSetting
            com.byted.cast.sdk.RTCAudioProfile r8 = r0.getAudioProfile()
            r4.<init>(r5, r6, r7, r8, r9)
            r4.startPlay()
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.audio.AudioPassivePlayer> r0 = r9.mAudioPassivePlayers
            r0.put(r5, r4)
        Ld7:
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.audio.AudioPassivePlayer> r0 = r9.mAudioPassivePlayers
            int r1 = r0.size()
            r0 = 5
            if (r1 <= r0) goto L97
            com.byted.cast.common.CastLogger r1 = r9.mLogger
            java.lang.String r0 = "There are already 5 AudioPlayers !"
            r1.e(r2, r0)
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.audio.AudioPassivePlayer> r0 = r9.mAudioPassivePlayers
            r0.remove(r5)
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sdk.core.RTCEngineImpl.startAudioPlayback(java.lang.String):void");
    }

    public void stopAudioPlayback(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopAudioPlayback userId=");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (this.mIsMediaRender) {
            IMediaRender iMediaRender = this.mMediaRenders.get(str);
            if (iMediaRender != null) {
                iMediaRender.stopAudioPlayer(0);
                return;
            }
            return;
        }
        AudioActivePlayer audioActivePlayer = this.mAudioActivePlayer;
        if (audioActivePlayer != null) {
            audioActivePlayer.stop();
            return;
        }
        AudioPassivePlayer audioPassivePlayer = this.mAudioPassivePlayers.get(str);
        if (audioPassivePlayer == null) {
            return;
        }
        this.mAudioPassivePlayers.remove(str);
        audioPassivePlayer.stopPlay();
    }

    public void stopVideoPlayback(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopVideoPlayback userId=");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (this.mIsMediaRender) {
            IMediaRender iMediaRender = this.mMediaRenders.get(str);
            if (iMediaRender != null) {
                iMediaRender.stopVideoPlayer(0);
            }
        } else {
            VideoPlayer videoPlayer = this.mVideoPlayers.get(str);
            if (videoPlayer != null) {
                this.mVideoPlayers.remove(str);
                videoPlayer.stopPlay();
            }
        }
        removeSurface(str);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void switchCamera(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchCamera");
        LIZ.append(str);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.switchCamera(str);
        }
    }

    private void registerServices(Context context, boolean z) {
        this.mDeviceMonitor = new DeviceMonitor(context, this.mCastContext);
        ArrayList arrayList = new ArrayList();
        this.mMonitorDeviceEvents = arrayList;
        if (z) {
            arrayList.add(DeviceMonitor.DeviceEvent.EVENT_AP_CHANGED);
        } else {
            arrayList.add(DeviceMonitor.DeviceEvent.EVENT_NETWORK_CHANGED);
            ScreenMonitor screenMonitor = new ScreenMonitor(context, this);
            this.mScreenMonitor = screenMonitor;
            screenMonitor.register();
            KeyguardManager keyguardManager = (KeyguardManager) C16880lQ.LLILL(context, "keyguard");
            this.mKeyguardManager = keyguardManager;
            this.mScreenLocked = keyguardManager.inKeyguardRestrictedInputMode();
            this.mIsScreenOn = ((PowerManager) C16880lQ.LLILL(context, "power")).isScreenOn();
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RTCEngineImpl(), mIsScreenOn:");
            LIZ.append(this.mIsScreenOn);
            LIZ.append(", mScreenLocked:");
            LIZ.append(this.mScreenLocked);
            castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        }
        this.mDeviceMonitor.monitor(this, this.mMonitorDeviceEvents);
        NetworkChangeReceiver networkChangeReceiver = new NetworkChangeReceiver(context, this);
        this.mNetworkMonitor = networkChangeReceiver;
        networkChangeReceiver.register();
        try {
            Intent intent = new Intent(context, (Class<?>) OnKillApp.class);
            C16880lQ.LLLL(context, intent);
            C16880lQ.LLLJL(context, intent, this.serviceConnection, 1);
        } catch (IllegalArgumentException unused) {
            this.mLogger.w("RTCEngineImpl", "Failed to start OnKillApp service (process is idle).");
        } catch (IllegalStateException unused2) {
            this.mLogger.w("RTCEngineImpl", "Failed start OnKillApp service, app is in background");
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void decodeInput(String str, long j) {
        this.mVoipEngine.onDecodeIn(str, j);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void decodeOutput(String str, long j) {
        this.mVoipEngine.onDecoded(str, j);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void dumpMediaData(int i, int i2) {
        this.mVoipEngine.dumpMediaData(i, i2);
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.requestIDR();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public boolean inputExternalAudioFrame(byte[] bArr, int i) {
        if (!this.mSetting.isExternalAudioSource()) {
            this.mLogger.w("RTCEngineImpl", "failed to inputExternalAudioFrame because external audio source not enabled !");
            return false;
        }
        doInputAudioFrame(bArr, i, MediaSetting.ACODEC_ID.AUTO, 0L);
        return true;
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onCastControl(int i, int i2) {
        this.mRTCEventNotifier.onCastControl(i, i2);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public boolean onCastRequest(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCastRequest: Sink, enable native:");
        LIZ.append(this.mSetting.isEnableVideoNativeDecode());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (this.mIsMediaRender && !this.mMediaRenders.containsKey(str)) {
            try {
                IMediaRender iMediaRender = (IMediaRender) Class.forName("com.byted.cast.render.MediaRender").newInstance();
                iMediaRender.init(str);
                iMediaRender.setVideoFrameListener(new IVideoFrameListener() { // from class: com.byted.cast.sdk.core.RTCEngineImpl.3
                    @Override // com.byted.cast.mediacommon.render.IVideoFrameListener
                    public void onError(String str3, int i, int i2) {
                        CastLogger castLogger2 = RTCEngineImpl.this.mLogger;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onError: MediaRender, userId=");
                        LIZ2.append(str3);
                        LIZ2.append(", playerId=");
                        LIZ2.append(i);
                        LIZ2.append(", errorCode=");
                        LIZ2.append(i2);
                        castLogger2.e("RTCEngineImpl", X1D.LIZIZ(LIZ2));
                        if (i2 == MediaRenderErrorCode.MEDIARENDER_INIT_ERROR) {
                            CastLogger castLogger3 = RTCEngineImpl.this.mLogger;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("onError: MEDIARENDER_INIT_ERROR, userId=");
                            LIZ3.append(str3);
                            castLogger3.e("RTCEngineImpl", X1D.LIZIZ(LIZ3));
                            RTCEngineImpl.this.mRTCEventNotifier.onError(10011001, "MEDIARENDER_INIT_ERROR");
                            return;
                        }
                        if (i2 == MediaRenderErrorCode.MEDIARENDER_DECODE_ERROR) {
                            CastLogger castLogger4 = RTCEngineImpl.this.mLogger;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("onError: MEDIARENDER_DECODE_ERROR, userId=");
                            LIZ4.append(str3);
                            castLogger4.e("RTCEngineImpl", X1D.LIZIZ(LIZ4));
                            RTCEngineImpl.this.mRTCEventNotifier.onError(10011002, "MEDIARENDER_DECODE_ERROR");
                            return;
                        }
                        if (i2 == MediaRenderErrorCode.MEDIARENDER_SURFACE_ERROR) {
                            CastLogger castLogger5 = RTCEngineImpl.this.mLogger;
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("onError: MEDIARENDER_SURFACE_ERROR, userId=");
                            LIZ5.append(str3);
                            castLogger5.e("RTCEngineImpl", X1D.LIZIZ(LIZ5));
                            RTCEngineImpl.this.mRTCEventNotifier.onError(10011003, "MEDIARENDER_SURFACE_ERROR");
                            return;
                        }
                        if (i2 != MediaRenderErrorCode.MEDIARENDER_RENDER_ERROR) {
                            return;
                        }
                        CastLogger castLogger6 = RTCEngineImpl.this.mLogger;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("onError: MEDIARENDER_RENDER_ERROR, userId=");
                        LIZ6.append(str3);
                        castLogger6.e("RTCEngineImpl", X1D.LIZIZ(LIZ6));
                        RTCEngineImpl.this.mRTCEventNotifier.onError(10011004, "MEDIARENDER_RENDER_ERROR");
                    }

                    @Override // com.byted.cast.mediacommon.render.IVideoFrameListener
                    public void OnVideoSizeChanged(String str3, int i, int i2, int i3, int i4) {
                        RTCEngineImpl.this.onVideoSizeChanged(str3, i2, i3);
                    }
                });
                iMediaRender.setParameter(MediaParameter.Render_context, this.mContext);
                iMediaRender.setParameter(MediaParameter.Render_IsOpenJitterBuffer, Boolean.TRUE);
                iMediaRender.setParameter(MediaParameter.Video_JitterBuffer_Mode, 0);
                iMediaRender.setParameter(MediaParameter.Render_videoLatencyListener, new ILatencyListener() { // from class: com.byted.cast.sdk.core.RTCEngineImpl.4
                    @Override // com.byted.cast.mediacommon.render.ILatencyListener
                    public void onRenderIn(String str3, int i, long j, long j2) {
                    }

                    @Override // com.byted.cast.mediacommon.render.ILatencyListener
                    public void onDecodeIn(String str3, int i, long j, long j2) {
                        RTCEngineImpl.this.mVoipEngine.onDecodeIn(str3, j);
                    }

                    @Override // com.byted.cast.mediacommon.render.ILatencyListener
                    public void onDecoded(String str3, int i, long j, long j2) {
                        RTCEngineImpl.this.mVoipEngine.onDecoded(str3, j);
                    }

                    @Override // com.byted.cast.mediacommon.render.ILatencyListener
                    public void onRendered(String str3, int i, long j, long j2) {
                        RTCEngineImpl.this.mVoipEngine.onRendered(str3, j);
                    }
                });
                this.mMediaRenders.put(str, iMediaRender);
            } catch (Throwable th) {
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Create MediaRender FAIL : ");
                LIZ2.append(th.toString());
                castLogger2.e("RTCEngineImpl", X1D.LIZIZ(LIZ2));
            }
        }
        startAudioPlayback(str);
        if (!this.mSetting.isEnableVideoNativeDecode()) {
            startVideoPlayback(str, false);
        }
        Map<String, Boolean> map = this.mIsFirstFrameMap;
        Boolean bool = Boolean.TRUE;
        map.put(str, bool);
        this.mIsCastingMap.put(str, bool);
        return this.mRTCEventNotifier.onCastRequest(str, str2);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onConnect(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnect userId=");
        LIZ.append(str);
        LIZ.append(" name=");
        LIZ.append(str2);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (!this.mIsSource) {
            Map<String, Boolean> map = this.mIsFirstFrameMap;
            Boolean bool = Boolean.FALSE;
            map.put(str, bool);
            this.mIsCastingMap.put(str, bool);
        }
        this.mRTCEventNotifier.onConnect(str, str2);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onDisconnect(RTCEngine.ExitReason exitReason, String str) {
        this.mLogger.i("RTCEngineImpl", str);
        if (this.mMediaRecorder != null) {
            C90177ZaH.LJJJIL(this.mLogger);
            C90177ZaH.LJJJJ(this.mMonitor);
            this.mMediaRecorder.removeMediaRecorderCallback(this.recorderCallback);
            this.mMediaRecorder.stop();
        }
        this.mRTCEventNotifier.onDisconnect(exitReason, str);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onError(int i, String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(" ");
        LIZ.append(str);
        castLogger.e("RTCEngineImpl", X1D.LIZIZ(LIZ));
        Iterator<String> it = this.mIsFirstFrameMap.keySet().iterator();
        while (it.hasNext()) {
            this.mIsFirstFrameMap.put(it.next(), Boolean.FALSE);
        }
        this.mRTCEventNotifier.onError(i, str);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onLogMonitor(String str, String[][] strArr) {
        this.mRTCEventNotifier.onLogMonitor(str, strArr);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onMonitorEvent(String str, String str2) {
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onMonitorEvent(str, str2);
        }
    }

    @Override // com.byted.cast.sdk.monitor.DeviceMonitor.DeviceMonitorListener
    public void onNetworkChanged(NetworkMonitor.NetworkType networkType, NetworkMonitor.NetworkType networkType2) {
        this.mVoipEngine.notifyDeviceEvent(DeviceMonitor.DeviceEvent.EVENT_NETWORK_CHANGED.ordinal(), Integer.valueOf(networkType.ordinal()), Integer.valueOf(networkType2.ordinal()), null);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onRecvMetaData(String str, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRecvMetaData: userId=");
        LIZ.append(str);
        LIZ.append(", json=");
        LIZ.append(str2);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mRTCEventNotifier.onRecvMetaData(str, str2);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onSetbitrateRequest(RTCMediaKind rTCMediaKind, int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSetbitrateRequest: ");
        LIZ.append(rTCMediaKind.toString());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setBitrateKps(i);
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onSinkLatencyStat(String str, String str2) {
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onSinkLatencyStat(str, str2);
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onSinkStuckStat(String str, String str2) {
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onSinkStuckStat(str, str2);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void render(String str, long j) {
        this.mVoipEngine.onRendered(str, j);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void requestScreenRecord(Activity activity, int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestScreenRecord");
        LIZ.append(activity);
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mLogger.e("RTCEngineImpl", "Unused Interface!!!");
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void sendMetaData(String str, String str2) {
        this.mLogger.i("RTCEngineImpl", "sendMetaData+");
        synchronized (this.mCastStateLock) {
            this.mVoipEngine.sendMetaData(str, str2);
        }
        this.mLogger.i("RTCEngineImpl", "sendMetaData-");
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioDataListener(Boolean bool, IAudioDataListener iAudioDataListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioDataListener, autoPlayAudio:");
        LIZ.append(bool);
        LIZ.append(", listener:");
        LIZ.append(iAudioDataListener);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mAudioDataListener = iAudioDataListener;
        this.mAutoPlayAudio = bool.booleanValue();
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioDropPolicyByMs(int i, int i2) {
        this.mVoipEngine.setAudioDropPolicyByMs(i, i2);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setAudioVolume(float f, float f2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioVolume");
        LIZ.append(f);
        LIZ.append(f2);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        synchronized (this.mCastStateLock) {
            this.mVoipEngine.setAudioVolume(f, f2);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setPlayerVolume(String str, float f) {
        if (this.mIsMediaRender) {
            IMediaRender iMediaRender = this.mMediaRenders.get(str);
            if (iMediaRender != null) {
                float floatValue = ((Float) iMediaRender.getParameter(MediaParameter.Audio_Render_max_vol)).floatValue();
                iMediaRender.setParameter(MediaParameter.Audio_Render_volume, Float.valueOf(Math.max(Math.min(f, floatValue), ((Float) iMediaRender.getParameter(MediaParameter.Audio_Render_min_vol)).floatValue())));
                return;
            }
            return;
        }
        for (String str2 : this.mAudioPassivePlayers.keySet()) {
            if (TextUtils.equals(str, str2)) {
                AudioPassivePlayer audioPassivePlayer = this.mAudioPassivePlayers.get(str2);
                if (audioPassivePlayer == null) {
                    return;
                }
                audioPassivePlayer.setVolume(f);
                return;
            }
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setTransType(RTCSetting.TRANS_TYPE trans_type, RTCSetting.TRANS_TYPE trans_type2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setTransType audio: ");
        LIZ.append(trans_type.toString());
        LIZ.append(" video: ");
        LIZ.append(trans_type2.toString());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mVoipEngine.setTransType(trans_type, trans_type2);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setVideoSurface(String str, Surface surface) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoSurface: userId=");
        LIZ.append(str);
        LIZ.append(", surface=");
        LIZ.append(surface);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        stopVideoPlayback(str);
        this.mSurfaces.put(str, surface);
        if (this.mSurfaces.size() > 5) {
            this.mLogger.e("RTCEngineImpl", "There are already 5 Surfaces !");
            this.mSurfaces.remove(str);
        }
        this.mVoipEngine.setVideoSurface(str, surface);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cmd", "requestIDR");
            sendMetaData(str, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setVirtualDisplayWH(int i, int i2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVirtualDisplayWH");
        LIZ.append(i);
        LIZ.append("x");
        LIZ.append(i2);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.setVirtualDisplayWH(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r4.mVideoPlayers.get(r1) == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startVideoPlayback(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            com.byted.cast.common.CastLogger r2 = r4.mLogger
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "startVideoPlayback userId="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r3 = "RTCEngineImpl"
            r2.i(r3, r0)
            boolean r0 = r4.mIsMediaRender
            if (r0 == 0) goto L1c
            return
        L1c:
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.video.VideoPlayer> r0 = r4.mVideoPlayers
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.equals(r5, r1)
            if (r0 == 0) goto L26
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.video.VideoPlayer> r0 = r4.mVideoPlayers
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L58
        L40:
            com.byted.cast.sdk.render.video.VideoPlayer r2 = new com.byted.cast.sdk.render.video.VideoPlayer
            com.byted.cast.common.ContextManager$CastContext r1 = r4.mCastContext
            com.byted.cast.sdk.core.RTCEventNotifier r0 = r4.mRTCEventNotifier
            r2.<init>(r5, r1, r0)
            if (r6 != 0) goto L50
            com.byted.cast.engine.VoipEngine r0 = r4.mVoipEngine
            r2.setVideoFrameListener(r0)
        L50:
            r2.startPlay()
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.video.VideoPlayer> r0 = r4.mVideoPlayers
            r0.put(r5, r2)
        L58:
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.video.VideoPlayer> r0 = r4.mVideoPlayers
            int r1 = r0.size()
            r0 = 5
            if (r1 <= r0) goto L6d
            com.byted.cast.common.CastLogger r1 = r4.mLogger
            java.lang.String r0 = "There are already 5 AudioPlayers !"
            r1.e(r3, r0)
            java.util.Map<java.lang.String, com.byted.cast.sdk.render.video.VideoPlayer> r0 = r4.mVideoPlayers
            r0.remove(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sdk.core.RTCEngineImpl.startVideoPlayback(java.lang.String, boolean):void");
    }

    @Override // com.byted.cast.sdk.monitor.DeviceMonitor.DeviceMonitorListener
    public void onAudioChanged(AudioMonitor.AudioDevice audioDevice, boolean z, int i) {
        this.mVoipEngine.notifyDeviceEvent(DeviceMonitor.DeviceEvent.EVENT_AUDIO_DEVICE_CHANGED.ordinal(), Integer.valueOf(audioDevice.getValue()), Boolean.valueOf(z), Integer.valueOf(i));
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onAudioPcm(String str, byte[] bArr, long j) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on_audio_stream_data: ");
        LIZ.append(bArr.length);
        LIZ.append(", timestamp: ");
        LIZ.append(j);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        AudioPassivePlayer audioPassivePlayer = this.mAudioPassivePlayers.get(str);
        if (audioPassivePlayer == null) {
            return;
        }
        audioPassivePlayer.addPcm(bArr, j);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onAudioSetVolume(String str, float f, float f2) {
        this.mLogger.i("RTCEngineImpl", "onAudioSetVolume: Sink");
        this.mRTCEventNotifier.onAudioSetVolume(str, f, f2);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onConnectSuccess(int i, int i2, int i3) {
        this.mLogger.i("RTCEngineImpl", "onConnectSuccess: Source+");
        this.mRTCEventNotifier.onConnectSuccess(i, i2, i3);
        this.mLogger.i("RTCEngineImpl", "onConnectSuccess: Source-");
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onDisconnect(String str, RTCEngine.ExitReason exitReason, String str2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDisconnect userId=");
        LIZ.append(str);
        LIZ.append(" reason=");
        LIZ.append(exitReason);
        LIZ.append(" message=");
        LIZ.append(str2);
        LIZ.append(" mIsSource=");
        LIZ.append(this.mIsSource);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (!this.mIsSource) {
            Map<String, Boolean> map = this.mIsFirstFrameMap;
            Boolean bool = Boolean.FALSE;
            map.put(str, bool);
            this.mIsCastingMap.put(str, bool);
            stopAudioPlayback(str);
            stopVideoPlayback(str);
            if (this.mIsMediaRender && this.mMediaRenders.get(str) != null) {
                this.mMediaRenders.remove(str);
            }
        }
        this.mRTCEventNotifier.onDisconnect(str, exitReason, str2);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap) {
        ISinkDataListener iSinkDataListener = this.mSinkDataListener;
        if (iSinkDataListener != null) {
            iSinkDataListener.onNotifyLatency(str, l, hashMap);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void onScreenRecordRequestResult(int i, int i2, Intent intent) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenRecordRequestResult");
        LIZ.append(i);
        LIZ.append(i2);
        LIZ.append(intent);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mLogger.e("RTCEngineImpl", "Unused Interface!!!");
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onVideoSizeChanged(String str, int i, int i2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoSizeChanged ");
        LIZ.append(i);
        LIZ.append(" ");
        LIZ.append(i2);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (i < i2) {
            this.mRTCEventNotifier.OnVideoSizeChanged(str, i, i2, 0);
        } else {
            this.mRTCEventNotifier.OnVideoSizeChanged(str, i, i2, 1);
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void setSinkDataListener(Boolean bool, Boolean bool2, ISinkDataListener iSinkDataListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSinkDataListener, ISinkDataListener:");
        LIZ.append(iSinkDataListener);
        LIZ.append(", callbackToUser:");
        LIZ.append(bool);
        LIZ.append(", enablePlaying:");
        LIZ.append(bool2);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mCallbackDataToUser = bool;
        this.mEnablePlaying = bool2;
        this.mSinkDataListener = iSinkDataListener;
    }

    /* loaded from: classes29.dex */
    public class RtpAudioPacket {
        public byte[] mData;
        public long mRtpTimeStamp;
        public int mSeq;
        public int mSize;

        public RtpAudioPacket(byte[] bArr, int i, int i2) {
            this.mData = bArr;
            this.mSeq = i;
            this.mSize = i2;
            this.mRtpTimeStamp = i * 1024;
        }
    }

    private void playAudio(String str, RTCSetting.ACODEC_ID acodec_id, byte[] bArr, long j) {
        if (this.mIsMediaRender) {
            IMediaRender iMediaRender = this.mMediaRenders.get(str);
            if (iMediaRender != null && iMediaRender.getAudioState(0) == MediaRenderState.STATE_EXECUTING) {
                iMediaRender.sendAudioPacket(0, bArr, j);
                return;
            }
            return;
        }
        AudioPassivePlayer audioPassivePlayer = this.mAudioPassivePlayers.get(str);
        if (audioPassivePlayer == null) {
            return;
        }
        audioPassivePlayer.addFrame(bArr, j);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void connect(String str, int i, String str2, String str3) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect: ");
        LIZ.append("xxx.xxx.xxx.xxx");
        LIZ.append(",  = ");
        LIZ.append(i);
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        synchronized (this.mCastStateLock) {
            if (str != null) {
                if (!"".equals(str)) {
                    this.mVoipEngine.connect(str, i, str2, str3);
                }
            }
            this.mLogger.e("RTCEngineImpl", "connect failed, userId must be set !");
        }
    }

    public void doInputAudioFrame(byte[] bArr, int i, MediaSetting.ACODEC_ID acodec_id, long j) {
        this.mVoipEngine.inputAudioFrame(bArr, i, acodec_id, j);
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onAudioFrame(String str, RTCSetting.ACODEC_ID acodec_id, byte[] bArr, long j) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioFrame: ");
        LIZ.append(bArr.length);
        LIZ.append(" timestamp: ");
        LIZ.append(j);
        castLogger.v("RTCEngineImpl", X1D.LIZIZ(LIZ));
        if (!this.mCallbackDataToUser.booleanValue()) {
            playAudio(str, acodec_id, bArr, j);
            return;
        }
        CodecType.ACODEC_ID valueOfAudio = CodecType.valueOfAudio(acodec_id.ordinal());
        ISinkDataListener iSinkDataListener = this.mSinkDataListener;
        if (iSinkDataListener != null) {
            iSinkDataListener.onAudioOutput(str, valueOfAudio, bArr, this.mSetting.getAudioProfile().getRecordSampleRate(), this.mSetting.getAudioProfile().getNumberOfChannels(), this.mSetting.getAudioProfile().getBitwidth(), this.mSetting.getAudioProfile().getBitrate(), j);
        }
        if (!this.mEnablePlaying.booleanValue()) {
            return;
        }
        playAudio(str, acodec_id, bArr, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x016e, code lost:
    
        if (r14 == 7) goto L10;
     */
    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onVideoFrame(java.lang.String r23, com.byted.cast.sdk.RTCSetting.VCODEC_ID r24, byte[] r25, long r26) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sdk.core.RTCEngineImpl.onVideoFrame(java.lang.String, com.byted.cast.sdk.RTCSetting$VCODEC_ID, byte[], long):void");
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public int sinkInitAndJoinRoom(String str, String str2, String str3, String str4) {
        if (this.mRemoteMirrorConnector == null && !createConnector()) {
            this.mLogger.e("RTCEngineImpl", "RTC: sinkInitAndJoinRoom: [ERROR] No RTC Impl");
            return -1;
        }
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onMonitorEvent("rtclink_sink_join_room", "");
        }
        return this.mRemoteMirrorConnector.sinkInitAndJoinRoom(str, str2, str3, str4);
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public int sourceInitAndJoinRoom(String str, String str2, String str3, String str4) {
        if (this.mRemoteMirrorConnector == null && !createConnector()) {
            this.mLogger.e("RTCEngineImpl", "RTC: sourceInitAndJoinRoom: [ERROR] No RTC Impl");
            return -1;
        }
        RTCEventNotifier rTCEventNotifier = this.mRTCEventNotifier;
        if (rTCEventNotifier != null) {
            rTCEventNotifier.onMonitorEvent("rtclink_source_join_room", "");
        }
        return this.mRemoteMirrorConnector.sourceInitAndJoinRoom(str, str2, str3, str4);
    }

    public RTCEngineImpl(Context context, ContextManager.CastContext castContext, RTCSetting rTCSetting, IRTCEngineEventListener iRTCEngineEventListener, boolean z) {
        this(context, castContext, rTCSetting, null, iRTCEngineEventListener, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playVideo$0(String str, int i, byte[] bArr, RTCSetting.VCODEC_ID vcodec_id, long j) {
        CodecId codecId;
        if (this.mIsMediaRender) {
            IMediaRender iMediaRender = this.mMediaRenders.get(str);
            if (iMediaRender == null) {
                return;
            }
            if (iMediaRender.getVideoState(0) == MediaRenderState.STATE_UNINITIALIZED && this.mSurfaces.containsKey(str)) {
                if (i == 7) {
                    SPS Parse = this.mGolomb.Parse(bArr, vcodec_id);
                    VideoParameter videoParameter = new VideoParameter();
                    if (vcodec_id == RTCSetting.VCODEC_ID.H264) {
                        codecId = CodecId.H264;
                    } else {
                        codecId = CodecId.H265;
                    }
                    videoParameter.codecId = codecId;
                    videoParameter.width = Parse.width;
                    videoParameter.height = Parse.height;
                    iMediaRender.setSurface(0, this.mSurfaces.get(str));
                    iMediaRender.setVideoParameter(0, videoParameter);
                    iMediaRender.startVideoPlayer(0);
                } else {
                    CastLogger castLogger = this.mLogger;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("need sps, this frame is ");
                    LIZ.append(i);
                    castLogger.w("RTCEngineImpl", X1D.LIZIZ(LIZ));
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("cmd", "requestIDR");
                        sendMetaData(str, jSONObject.toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } else if (!this.mSurfaces.containsKey(str)) {
                this.mLogger.w("RTCEngineImpl", "no surface");
            }
            if (iMediaRender.getVideoState(0) == MediaRenderState.STATE_EXECUTING) {
                iMediaRender.sendVideoPacket(0, bArr, j);
                return;
            }
            return;
        }
        VideoPlayer videoPlayer = this.mVideoPlayers.get(str);
        if (videoPlayer == null) {
            return;
        }
        CastLogger castLogger2 = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onVideoFrame, player.isInit():");
        LIZ2.append(videoPlayer.isInit());
        LIZ2.append(", surface:");
        LIZ2.append(this.mSurfaces.get(str));
        castLogger2.v("RTCEngineImpl", X1D.LIZIZ(LIZ2));
        if (!this.mScreenLocked) {
            if (!videoPlayer.isInit() && i == 7) {
                Surface surface = this.mSurfaces.get(str);
                CastLogger castLogger3 = this.mLogger;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onVideoFrame, player.isInit():");
                LIZ3.append(videoPlayer.isInit());
                LIZ3.append(", userId:");
                LIZ3.append(str);
                LIZ3.append(", surface:");
                LIZ3.append(surface);
                castLogger3.i("RTCEngineImpl", X1D.LIZIZ(LIZ3));
                if (surface != null) {
                    videoPlayer.init(surface, vcodec_id, bArr);
                    videoPlayer.queueBuffer(bArr, j);
                    return;
                }
                return;
            }
            if (videoPlayer.isInit()) {
                videoPlayer.queueBuffer(bArr, j);
            }
        }
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public boolean inputExternalScreenFrame(byte[] bArr, int i, int i2, MediaSetting.VideoFormat videoFormat, int i3) {
        if (!this.mSetting.isExternalScreenSource()) {
            this.mLogger.w("RTCEngineImpl", "failed to inputExternalScreenFrame because external audio source not enabled !");
            return false;
        }
        doInputScreenFrame(bArr, 0, i, i2, videoFormat, 0L, i3, 0);
        return true;
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public boolean inputExternalVideoFrame(byte[] bArr, int i, int i2, MediaSetting.VideoFormat videoFormat, int i3) {
        if (!this.mSetting.isExternalVideoSource()) {
            this.mLogger.w("RTCEngineImpl", "failed to inputExternalVideoFrame because external video source not enabled !");
            return false;
        }
        doInputVideoFrame(bArr, i, i2, videoFormat, i3, false);
        return true;
    }

    public void playVideo(final String str, final RTCSetting.VCODEC_ID vcodec_id, final byte[] bArr, final long j, final int i) {
        this.singleExecutor.execute(new Runnable() { // from class: X.ZaM
            @Override // java.lang.Runnable
            public final void run() {
                RTCEngineImpl.this.lambda$playVideo$0(str, i, bArr, vcodec_id, j);
            }
        });
    }

    @Override // com.byted.cast.sdk.RTCEngine
    public void reinit(Context context, RTCSetting rTCSetting, GLSurfaceView gLSurfaceView, IRTCEngineEventListener iRTCEngineEventListener, boolean z) {
        this.mRTCEventNotifier = new RTCEventNotifier(iRTCEngineEventListener);
        this.mContext = context;
        this.mRoleSource = z;
        this.mSetting = rTCSetting;
        MediaSetting mediaSetting = new MediaSetting(false, false);
        this.mMediaSetting = mediaSetting;
        mediaSetting.getAudioProfile().setHwNSEnabled(true);
        this.mMediaSetting.getAudioProfile().setHwAECEnabled(true);
        this.mMediaSetting.setConfig(ContextManager.getConfigManager(this.mCastContext).getInitConfig());
        if (this.mRoleSource) {
            try {
                Class<?> cls = Class.forName("com.byted.cast.capture.ByteMediaRecorder");
                this.mMediaRecorder = (IMediaRecorder) cls.getMethod("getInstance", Context.class, MediaSetting.class).invoke(cls, this.mContext, this.mMediaSetting);
            } catch (Throwable th) {
                this.mMediaRecorder = null;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create ByteMediaRecorder fail : ");
                LIZ.append(th.toString());
                Logger.e("RTCEngineImpl", X1D.LIZIZ(LIZ));
            }
            if (this.mMediaRecorder != null) {
                C90177ZaH.LJJJ(this.mMonitor);
            }
        }
        this.mVoipEngine.create(rTCSetting);
        this.mVoipEngine.setOnVoipEngineListener(this);
        if (this.mSetting.getAudioProfile().isEnabled() && !this.mSetting.isbEnableAudioCallback()) {
            this.mAudioActivePlayer = new AudioActivePlayer(this, this.mCastContext);
        }
        this.mVoipEngine.setVideoProfile(this.mSetting.getVideoProfile());
        this.mVoipEngine.setScreenProfile(this.mSetting.getScreenProfile());
        this.mVoipEngine.setAudioProfile(this.mSetting.getAudioProfile());
        registerServices(this.mContext, z);
        this.mLogger.i("RTCEngineImpl", "reinit(), gitInfo: 1.61ac5e2");
    }

    public RTCEngineImpl(Context context, ContextManager.CastContext castContext, RTCSetting rTCSetting, GLSurfaceView gLSurfaceView, IRTCEngineEventListener iRTCEngineEventListener, boolean z) {
        this.mAudioPassivePlayers = new HashMap();
        this.mVideoPlayers = new HashMap();
        this.mSurfaces = new HashMap();
        this.mAudioDataListener = null;
        this.mSinkDataListener = null;
        this.mCallbackDataToUser = Boolean.FALSE;
        this.mEnablePlaying = Boolean.TRUE;
        this.mAutoPlayAudio = true;
        this.mIsSource = false;
        this.mIsScreenOn = false;
        this.mScreenLocked = false;
        this.mVoipEngine = new VoipEngine(this.mCastContext);
        this.singleExecutor = C16880lQ.LLLLZLLIL();
        this.mIsMediaRender = true;
        this.mMediaRenders = new HashMap();
        this.mDupAudio = false;
        this.mDupAudioSeq = 0;
        this.mCurAudioData = null;
        this.mPreAudioData = null;
        this.mPrePreAudioData = null;
        this.mIsFirstFrameMap = new HashMap();
        this.mIsCastingMap = new HashMap();
        this.mCastStateLock = new Object();
        this.mSinkVideoInfos = new HashMap();
        this.mGolomb = new golomb(this.mCastContext);
        this.recorderCallback = null;
        this.spspps = null;
        this.start_recorder_time = 0L;
        this.serviceConnection = new ServiceConnection() { // from class: com.byted.cast.sdk.core.RTCEngineImpl.2
            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                RTCEngineImpl.this.mKilledApp = null;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                RTCEngineImpl.this.mLogger.i("RTCEngineImpl", "onServiceConnected");
                RTCEngineImpl.this.mKilledApp = ((OnKillApp.MyBinder) iBinder).getService();
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                rTCEngineImpl.mKilledApp.setKilledListener(rTCEngineImpl);
            }
        };
        this.mRemoteMirrorCallback = new IRemoteMirrorCallback() { // from class: com.byted.cast.sdk.core.RTCEngineImpl.5
            private void cancelRtcCancel() {
                RTCEngineImpl.this.mLogger.i("RTCEngineImpl", "cancelRtcCancel+");
                synchronized (RTCEngineImpl.this.mCastStateLock) {
                    RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                    if (rTCEngineImpl.mMediaRecorder != null) {
                        C90177ZaH.LJJJIL(rTCEngineImpl.mLogger);
                        C90177ZaH.LJJJJ(RTCEngineImpl.this.mMonitor);
                        RTCEngineImpl rTCEngineImpl2 = RTCEngineImpl.this;
                        rTCEngineImpl2.mMediaRecorder.removeMediaRecorderCallback(rTCEngineImpl2.recorderCallback);
                        RTCEngineImpl.this.mMediaRecorder.stop();
                        RTCEngineImpl rTCEngineImpl3 = RTCEngineImpl.this;
                        rTCEngineImpl3.mDupAudioSeq = 0;
                        rTCEngineImpl3.mCurAudioData = null;
                        rTCEngineImpl3.mPreAudioData = null;
                        rTCEngineImpl3.mPrePreAudioData = null;
                    }
                    RTCEngineImpl rTCEngineImpl4 = RTCEngineImpl.this;
                    if (rTCEngineImpl4.mRemoteMirrorJoined) {
                        rTCEngineImpl4.mRTCEventNotifier.onCancelSuccess();
                        IRemoteMirrorConnector iRemoteMirrorConnector = RTCEngineImpl.this.mRemoteMirrorConnector;
                        if (iRemoteMirrorConnector != null) {
                            iRemoteMirrorConnector.leaveRoom();
                        }
                        RTCEngineImpl.this.mRTCEventNotifier.onMonitorEvent("rtclink_source_leave_room", "");
                        RTCEngineImpl rTCEngineImpl5 = RTCEngineImpl.this;
                        rTCEngineImpl5.mRemoteMirrorJoined = false;
                        rTCEngineImpl5.mRTCEventNotifier.onDisconnect(RTCEngine.ExitReason.REASON_KICK_OUT, "rtc_passive");
                    }
                }
                RTCEngineImpl.this.mLogger.i("RTCEngineImpl", "cancelRtcCancel-");
            }

            @Override // com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback
            public void onRequestKeyFrame() {
                IMediaRecorder iMediaRecorder = RTCEngineImpl.this.mMediaRecorder;
                if (iMediaRecorder != null) {
                    iMediaRecorder.requestIDR();
                }
            }

            @Override // com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback
            public void onStreamAdd(String str) {
                CastLogger castLogger = RTCEngineImpl.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RTC: onStreamAdd: uid=");
                LIZ.append(str);
                castLogger.d("RTCEngineImpl", X1D.LIZIZ(LIZ));
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                if (rTCEngineImpl.mRoleSource) {
                    return;
                }
                rTCEngineImpl.mLogger.i("RTCEngineImpl", "RTC: onStreamAdd: invoke onCastRequest");
                RTCEngineImpl.this.mRTCEventNotifier.onCastRequest("bytelink-remote-mirror", str);
                RTCEngineImpl rTCEngineImpl2 = RTCEngineImpl.this;
                if (rTCEngineImpl2.mIsMediaRender && !rTCEngineImpl2.mMediaRenders.containsKey("bytelink-remote-mirror")) {
                    try {
                        IMediaRender iMediaRender = (IMediaRender) Class.forName("com.byted.cast.render.MediaRender").newInstance();
                        iMediaRender.init("bytelink-remote-mirror");
                        iMediaRender.setVideoFrameListener(new IVideoFrameListener() { // from class: com.byted.cast.sdk.core.RTCEngineImpl.5.1
                            @Override // com.byted.cast.mediacommon.render.IVideoFrameListener
                            public void onError(String str2, int i, int i2) {
                                CastLogger castLogger2 = RTCEngineImpl.this.mLogger;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("onError: MediaRender, userId=");
                                LIZ2.append(str2);
                                LIZ2.append(", playerId=");
                                LIZ2.append(i);
                                LIZ2.append(", errorCode=");
                                LIZ2.append(i2);
                                castLogger2.e("RTCEngineImpl", X1D.LIZIZ(LIZ2));
                                if (i2 == MediaRenderErrorCode.MEDIARENDER_INIT_ERROR) {
                                    CastLogger castLogger3 = RTCEngineImpl.this.mLogger;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("onError: MEDIARENDER_INIT_ERROR, userId=");
                                    LIZ3.append(str2);
                                    castLogger3.e("RTCEngineImpl", X1D.LIZIZ(LIZ3));
                                    RTCEngineImpl.this.mRTCEventNotifier.onError(10011001, "MEDIARENDER_INIT_ERROR");
                                    return;
                                }
                                if (i2 == MediaRenderErrorCode.MEDIARENDER_DECODE_ERROR) {
                                    CastLogger castLogger4 = RTCEngineImpl.this.mLogger;
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("onError: MEDIARENDER_DECODE_ERROR, userId=");
                                    LIZ4.append(str2);
                                    castLogger4.e("RTCEngineImpl", X1D.LIZIZ(LIZ4));
                                    RTCEngineImpl.this.mRTCEventNotifier.onError(10011002, "MEDIARENDER_DECODE_ERROR");
                                    return;
                                }
                                if (i2 == MediaRenderErrorCode.MEDIARENDER_SURFACE_ERROR) {
                                    CastLogger castLogger5 = RTCEngineImpl.this.mLogger;
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("onError: MEDIARENDER_SURFACE_ERROR, userId=");
                                    LIZ5.append(str2);
                                    castLogger5.e("RTCEngineImpl", X1D.LIZIZ(LIZ5));
                                    RTCEngineImpl.this.mRTCEventNotifier.onError(10011003, "MEDIARENDER_SURFACE_ERROR");
                                    return;
                                }
                                if (i2 != MediaRenderErrorCode.MEDIARENDER_RENDER_ERROR) {
                                    return;
                                }
                                CastLogger castLogger6 = RTCEngineImpl.this.mLogger;
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append("onError: MEDIARENDER_RENDER_ERROR, userId=");
                                LIZ6.append(str2);
                                castLogger6.e("RTCEngineImpl", X1D.LIZIZ(LIZ6));
                                RTCEngineImpl.this.mRTCEventNotifier.onError(10011004, "MEDIARENDER_RENDER_ERROR");
                            }

                            @Override // com.byted.cast.mediacommon.render.IVideoFrameListener
                            public void OnVideoSizeChanged(String str2, int i, int i2, int i3, int i4) {
                                RTCEngineImpl.this.onVideoSizeChanged(str2, i2, i3);
                            }
                        });
                        iMediaRender.setParameter(MediaParameter.Render_context, RTCEngineImpl.this.mContext);
                        iMediaRender.setParameter(MediaParameter.Render_IsOpenJitterBuffer, Boolean.FALSE);
                        iMediaRender.setParameter(MediaParameter.Render_videoLatencyListener, new ILatencyListener() { // from class: com.byted.cast.sdk.core.RTCEngineImpl.5.2
                            @Override // com.byted.cast.mediacommon.render.ILatencyListener
                            public void onRenderIn(String str2, int i, long j, long j2) {
                            }

                            @Override // com.byted.cast.mediacommon.render.ILatencyListener
                            public void onDecodeIn(String str2, int i, long j, long j2) {
                                RTCEngineImpl.this.mVoipEngine.onDecodeIn(str2, j);
                            }

                            @Override // com.byted.cast.mediacommon.render.ILatencyListener
                            public void onDecoded(String str2, int i, long j, long j2) {
                                RTCEngineImpl.this.mVoipEngine.onDecoded(str2, j);
                            }

                            @Override // com.byted.cast.mediacommon.render.ILatencyListener
                            public void onRendered(String str2, int i, long j, long j2) {
                                RTCEngineImpl.this.mVoipEngine.onRendered(str2, j);
                            }
                        });
                        RTCEngineImpl.this.mMediaRenders.put("bytelink-remote-mirror", iMediaRender);
                    } catch (Throwable th) {
                        CastLogger castLogger2 = RTCEngineImpl.this.mLogger;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Create MediaRender FAIL : ");
                        LIZ2.append(th.toString());
                        castLogger2.e("RTCEngineImpl", X1D.LIZIZ(LIZ2));
                    }
                }
                RTCEngineImpl.this.startAudioPlayback("bytelink-remote-mirror");
                RTCEngineImpl.this.startVideoPlayback("bytelink-remote-mirror", true);
            }

            @Override // com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback
            public void onUserJoined(String str) {
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                if (rTCEngineImpl.mRoleSource) {
                    rTCEngineImpl.mRTCEventNotifier.onMonitorEvent("rtclink_source_peer_join_room", "");
                } else {
                    rTCEngineImpl.mRTCEventNotifier.onMonitorEvent("rtclink_sink_peer_join_room", "");
                }
            }

            @Override // com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback
            public void onAudioFrame(byte[] bArr, long j) {
                CastLogger castLogger = RTCEngineImpl.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RTC: onAudioFrame length=");
                LIZ.append(bArr.length);
                LIZ.append(", pts=");
                LIZ.append(j);
                castLogger.d("RTCEngineImpl", X1D.LIZIZ(LIZ));
                if ((!RTCEngineImpl.this.mCallbackDataToUser.booleanValue() || RTCEngineImpl.this.mEnablePlaying.booleanValue()) && j != 0) {
                    RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                    if (rTCEngineImpl.mIsMediaRender) {
                        IMediaRender iMediaRender = rTCEngineImpl.mMediaRenders.get("bytelink-remote-mirror");
                        if (iMediaRender != null && iMediaRender.getAudioState(0) == MediaRenderState.STATE_EXECUTING) {
                            iMediaRender.sendAudioPacket(0, bArr, j);
                            return;
                        }
                        return;
                    }
                    AudioPassivePlayer audioPassivePlayer = rTCEngineImpl.mAudioPassivePlayers.get("bytelink-remote-mirror");
                    if (audioPassivePlayer == null) {
                        return;
                    }
                    audioPassivePlayer.addPcm(bArr, j);
                }
            }

            @Override // com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback
            public void onUserLeave(String str, int i) {
                RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                if (rTCEngineImpl.mRoleSource) {
                    cancelRtcCancel();
                    return;
                }
                rTCEngineImpl.stopAudioPlayback("bytelink-remote-mirror");
                RTCEngineImpl.this.stopVideoPlayback("bytelink-remote-mirror");
                RTCEngineImpl rTCEngineImpl2 = RTCEngineImpl.this;
                if (rTCEngineImpl2.mIsMediaRender && rTCEngineImpl2.mMediaRenders.get("bytelink-remote-mirror") != null) {
                    RTCEngineImpl.this.mMediaRenders.remove("bytelink-remote-mirror");
                }
                RTCEngineImpl.this.mRTCEventNotifier.onCancelRequest("bytelink-remote-mirror");
            }

            @Override // com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback
            public void onVideoFrame(byte[] bArr, long j) {
                CastLogger castLogger = RTCEngineImpl.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RTC: onVideoFrame pts=");
                LIZ.append(j);
                castLogger.d("RTCEngineImpl", X1D.LIZIZ(LIZ));
                if (!RTCEngineImpl.this.mCallbackDataToUser.booleanValue() || RTCEngineImpl.this.mEnablePlaying.booleanValue()) {
                    int length = bArr.length;
                    RTCSetting.VCODEC_ID vcodec_id = RTCSetting.VCODEC_ID.H264;
                    int detectNALType = NAL.detectNALType(new NAL(bArr, length, vcodec_id));
                    RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                    if (rTCEngineImpl.mIsMediaRender) {
                        IMediaRender iMediaRender = rTCEngineImpl.mMediaRenders.get("bytelink-remote-mirror");
                        if (iMediaRender == null) {
                            return;
                        }
                        if (iMediaRender.getVideoState(0) == MediaRenderState.STATE_UNINITIALIZED && RTCEngineImpl.this.mSurfaces.containsKey("bytelink-remote-mirror")) {
                            if (detectNALType == 7) {
                                SPS Parse = RTCEngineImpl.this.mGolomb.Parse(bArr, vcodec_id);
                                VideoParameter videoParameter = new VideoParameter();
                                videoParameter.codecId = CodecId.H264;
                                videoParameter.width = Parse.width;
                                videoParameter.height = Parse.height;
                                iMediaRender.setSurface(0, RTCEngineImpl.this.mSurfaces.get("bytelink-remote-mirror"));
                                iMediaRender.setVideoParameter(0, videoParameter);
                                iMediaRender.startVideoPlayer(0);
                            } else {
                                CastLogger castLogger2 = RTCEngineImpl.this.mLogger;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("need sps, this frame is ");
                                LIZ2.append(detectNALType);
                                castLogger2.w("RTCEngineImpl", X1D.LIZIZ(LIZ2));
                                RTCEngineImpl.this.mLogger.i("RTCEngineImpl", "RTC: onVideoFrame: requestRemoteVideoKeyFrame");
                                IRemoteMirrorConnector iRemoteMirrorConnector = RTCEngineImpl.this.mRemoteMirrorConnector;
                                if (iRemoteMirrorConnector != null) {
                                    iRemoteMirrorConnector.requestRemoteVideoKeyFrame();
                                }
                            }
                        } else if (!RTCEngineImpl.this.mSurfaces.containsKey("bytelink-remote-mirror")) {
                            RTCEngineImpl.this.mLogger.w("RTCEngineImpl", "no surface");
                        }
                        if (iMediaRender.getVideoState(0) == MediaRenderState.STATE_EXECUTING) {
                            iMediaRender.sendVideoPacket(0, bArr, j);
                            return;
                        }
                        return;
                    }
                    VideoPlayer videoPlayer = rTCEngineImpl.mVideoPlayers.get("bytelink-remote-mirror");
                    if (videoPlayer == null) {
                        return;
                    }
                    CastLogger castLogger3 = RTCEngineImpl.this.mLogger;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("onVideoFrame, player.isInit():");
                    LIZ3.append(videoPlayer.isInit());
                    LIZ3.append(", surface:");
                    LIZ3.append(RTCEngineImpl.this.mSurfaces.get("bytelink-remote-mirror"));
                    castLogger3.v("RTCEngineImpl", X1D.LIZIZ(LIZ3));
                    if (!RTCEngineImpl.this.mScreenLocked) {
                        if (!videoPlayer.isInit() && detectNALType == 7) {
                            Surface surface = RTCEngineImpl.this.mSurfaces.get("bytelink-remote-mirror");
                            CastLogger castLogger4 = RTCEngineImpl.this.mLogger;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("onVideoFrame, player.isInit():");
                            LIZ4.append(videoPlayer.isInit());
                            LIZ4.append(", userId:");
                            LIZ4.append("bytelink-remote-mirror");
                            LIZ4.append(", surface:");
                            LIZ4.append(surface);
                            castLogger4.i("RTCEngineImpl", X1D.LIZIZ(LIZ4));
                            if (surface != null) {
                                videoPlayer.init(surface, vcodec_id, bArr);
                                RTCEngineImpl.this.mLogger.i("RTCEngineImpl", "RTC: onVideoFrame: requestRemoteVideoKeyFrame");
                                IRemoteMirrorConnector iRemoteMirrorConnector2 = RTCEngineImpl.this.mRemoteMirrorConnector;
                                if (iRemoteMirrorConnector2 != null) {
                                    iRemoteMirrorConnector2.requestRemoteVideoKeyFrame();
                                }
                                videoPlayer.queueBuffer(bArr, j);
                                return;
                            }
                            CastLogger castLogger5 = RTCEngineImpl.this.mLogger;
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("RTC: onVideoFrame pts=");
                            LIZ5.append(j);
                            LIZ5.append("  no surface");
                            castLogger5.d("RTCEngineImpl", X1D.LIZIZ(LIZ5));
                            return;
                        }
                        if (videoPlayer.isInit()) {
                            videoPlayer.queueBuffer(bArr, j);
                            return;
                        }
                        CastLogger castLogger6 = RTCEngineImpl.this.mLogger;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("RTC: onVideoFrame pts=");
                        LIZ6.append(j);
                        LIZ6.append("  drop");
                        castLogger6.d("RTCEngineImpl", X1D.LIZIZ(LIZ6));
                    }
                }
            }

            @Override // com.byted.cast.sdk.core.rtc.IRemoteMirrorCallback
            public void onJoinRoomResult(String str, String str2, int i) {
                if (i != 0) {
                    IRemoteMirrorConnector iRemoteMirrorConnector = RTCEngineImpl.this.mRemoteMirrorConnector;
                    if (iRemoteMirrorConnector != null) {
                        iRemoteMirrorConnector.leaveRoom();
                    }
                    RTCEngineImpl rTCEngineImpl = RTCEngineImpl.this;
                    rTCEngineImpl.mRemoteMirrorJoined = false;
                    if (rTCEngineImpl.mRoleSource) {
                        rTCEngineImpl.mRTCEventNotifier.onDisconnect(RTCEngine.ExitReason.REASON_KICK_OUT, "rtc_join");
                        RTCEngineImpl.this.mRTCEventNotifier.onMonitorEvent("rtclink_source_join_failure", "");
                        return;
                    } else {
                        rTCEngineImpl.mRTCEventNotifier.onDisconnect("bytelink-remote-mirror", RTCEngine.ExitReason.REASON_FATAL_ERROR, "rtc_join");
                        RTCEngineImpl.this.mRTCEventNotifier.onMonitorEvent("rtclink_sink_join_failure", "");
                        return;
                    }
                }
                RTCEngineImpl rTCEngineImpl2 = RTCEngineImpl.this;
                rTCEngineImpl2.mRemoteMirrorJoined = true;
                if (rTCEngineImpl2.mRoleSource) {
                    rTCEngineImpl2.mRTCEventNotifier.onConnectSuccess(rTCEngineImpl2.mSetting.getScreenProfile().getWidth(), RTCEngineImpl.this.mSetting.getScreenProfile().getHeight(), RTCEngineImpl.this.mSetting.getScreenProfile().getFps());
                    RTCEngineImpl.this.mRTCEventNotifier.onMonitorEvent("rtclink_source_join_success", "");
                } else {
                    rTCEngineImpl2.mLogger.i("RTCEngineImpl", "RTC: onJoinRoomResult: invoke onConnect");
                    RTCEngineImpl.this.mRTCEventNotifier.onConnect("bytelink-remote-mirror", str2);
                    RTCEngineImpl.this.mRTCEventNotifier.onMonitorEvent("rtclink_sink_join_success", "");
                }
            }
        };
        this.mCastContext = castContext;
        this.mVoipEngine = new VoipEngine(this.mCastContext);
        this.mLogger = ContextManager.getLogger(this.mCastContext);
        this.mMonitor = ContextManager.getMonitor(this.mCastContext);
        this.mRTCEventNotifier = new RTCEventNotifier(iRTCEngineEventListener);
        this.mContext = context;
        this.mIsSource = z;
        this.mRoleSource = z;
        this.mSetting = rTCSetting;
        MediaSetting mediaSetting = new MediaSetting(false, false);
        this.mMediaSetting = mediaSetting;
        mediaSetting.getAudioProfile().setHwNSEnabled(true);
        this.mMediaSetting.getAudioProfile().setHwAECEnabled(true);
        this.mMediaSetting.getAudioProfile().setAudioEnablePause(false);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTCEngineImpl ctor, EnableSourceOpengl:");
        LIZ.append(this.mSetting.isEnableSourceOpengl());
        castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        this.mMediaSetting.getVideoProfile().enableOpenGL(this.mSetting.isEnableSourceOpengl());
        this.mMediaSetting.setConfig(ContextManager.getConfigManager(castContext).getInitConfig());
        if (this.mRoleSource) {
            createMediaRecorderCallback();
            try {
                Class<?> cls = Class.forName("com.byted.cast.capture.ByteMediaRecorder");
                this.mMediaRecorder = (IMediaRecorder) cls.getMethod("getInstance", Context.class, MediaSetting.class).invoke(cls, this.mContext, this.mMediaSetting);
            } catch (Throwable th) {
                this.mMediaRecorder = null;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("create ByteMediaRecorder fail : ");
                LIZ2.append(th.toString());
                Logger.e("RTCEngineImpl", X1D.LIZIZ(LIZ2));
            }
            if (this.mMediaRecorder != null) {
                C90177ZaH.LJJIZ(this.mLogger);
            }
        }
        this.mVoipEngine.create(rTCSetting);
        this.mVoipEngine.setOnVoipEngineListener(this);
        if (this.mSetting.getAudioProfile().isEnabled() && !this.mSetting.isbEnableAudioCallback()) {
            this.mAudioActivePlayer = new AudioActivePlayer(this, this.mCastContext);
        }
        this.mVoipEngine.setVideoProfile(this.mSetting.getVideoProfile());
        this.mVoipEngine.setScreenProfile(this.mSetting.getScreenProfile());
        this.mVoipEngine.setAudioProfile(this.mSetting.getAudioProfile());
        registerServices(context, z);
        this.mLogger.i("RTCEngineImpl", "RTCEngineImpl(), gitInfo: 1.61ac5e2");
    }

    private void doInputVideoFrame(byte[] bArr, int i, int i2, MediaSetting.VideoFormat videoFormat, int i3, boolean z) {
        this.mVoipEngine.inputVideoFrame(bArr, i, i2, videoFormat, i3, z);
    }

    public void inputAudioViaRTC(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        int sendAudioFrame;
        IRemoteMirrorConnector iRemoteMirrorConnector = this.mRemoteMirrorConnector;
        if (iRemoteMirrorConnector == null) {
            sendAudioFrame = -1;
        } else {
            sendAudioFrame = iRemoteMirrorConnector.sendAudioFrame(bArr, i, i2, i3, i4, j);
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTC: inputAudioViaRTC: ret=");
        LIZ.append(sendAudioFrame);
        LIZ.append(" dateLen=");
        LIZ.append(bArr.length);
        LIZ.append(" sampleRate=");
        LIZ.append(i);
        LIZ.append(" channel=");
        LIZ.append(i2);
        LIZ.append(" bitwidth=");
        LIZ.append(i3);
        LIZ.append(" bitrates=");
        LIZ.append(i4);
        LIZ.append(" timestampUs=");
        LIZ.append(j);
        castLogger.d("RTCEngineImpl", X1D.LIZIZ(LIZ));
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipEngineListener
    public void onVideoFrame(String str, RTCMediaKind rTCMediaKind, int i, int i2, int i3, boolean z) {
        if (z) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFirstVideoFrame:  userId = ");
            LIZ.append(str);
            LIZ.append("-");
            LIZ.append(rTCMediaKind.toString());
            LIZ.append(", ");
            LIZ.append(i);
            LIZ.append(" x ");
            LIZ.append(i2);
            LIZ.append(", ");
            LIZ.append(i3);
            castLogger.i("RTCEngineImpl", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.byted.cast.sdk.render.audio.IAudioListener
    public void onAudioOutput(String str, byte[] bArr, int i, int i2, int i3, int i4, long j) {
        IAudioDataListener iAudioDataListener = this.mAudioDataListener;
        if (iAudioDataListener != null) {
            iAudioDataListener.onAudioOutput(str, bArr, i, i2, i3, i4, j);
        }
    }

    public void doInputScreenFrame(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4, int i5) {
        this.mVoipEngine.inputScreenFrame(bArr, i, i2, i3, videoFormat, j, i4, i5);
    }

    public void inputVideoViaRTC(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4, int i5) {
        boolean sendVideoFrame;
        IRemoteMirrorConnector iRemoteMirrorConnector = this.mRemoteMirrorConnector;
        if (iRemoteMirrorConnector == null) {
            sendVideoFrame = false;
        } else {
            sendVideoFrame = iRemoteMirrorConnector.sendVideoFrame(bArr, this.mVideoCodecInfo, i, i2, i3, j, i4, i5);
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTC: inputVideoViaRTC: ret=");
        LIZ.append(sendVideoFrame);
        LIZ.append(" dataLen=");
        LIZ.append(i);
        LIZ.append(" width=");
        LIZ.append(i2);
        LIZ.append(" height=");
        LIZ.append(i3);
        LIZ.append(" timestamp=");
        LIZ.append(j);
        LIZ.append(" rotation=");
        LIZ.append(i4);
        LIZ.append(" idr=");
        LIZ.append(i5);
        castLogger.d("RTCEngineImpl", X1D.LIZIZ(LIZ));
    }
}
