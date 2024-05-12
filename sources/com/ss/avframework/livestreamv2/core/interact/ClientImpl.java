package com.ss.avframework.livestreamv2.core.interact;

import X.C012403c;
import X.C08380Uo;
import X.C0NY;
import X.C16880lQ;
import X.C25620zW;
import X.C48263Iwt;
import X.C59895Nf1;
import X.C7MY;
import X.JBR;
import X.KMP;
import X.X1D;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioCallback;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkWrapper;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveInfo;
import com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCExtInfo;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCRoomHandlerProxy;
import com.ss.avframework.livestreamv2.core.interact.media.MediaEngine;
import com.ss.avframework.livestreamv2.core.interact.mixer.StreamMixManager;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics;
import com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import com.ss.avframework.livestreamv2.core.interact.statistic.InteractStaticsImpl;
import com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;
import com.ss.avframework.livestreamv2.core.interact.utils.InteractThreadUtils;
import com.ss.avframework.livestreamv2.core.interact.video.RemoteRenderEventHandler;
import com.ss.avframework.livestreamv2.core.interact.video.RemoteYuvColorRangeReporter;
import com.ss.avframework.livestreamv2.core.interact.video.VideoCallback;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClient;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSinkWrapper;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.audio.ISpatialAudio;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.data.AudioSourceType;
import com.ss.bytertc.engine.data.DataMessageSourceType;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.Orientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.type.AudioScenarioType;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.PublicStreamErrorCode;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.IAudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import com.ss.ttlivestreamer.livestreamv2.utils.PrivacyCertManager;
import defpackage.b1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ClientImpl implements Client, IAudioFilterManager.IBgmPlayingStatusCallback {
    public JSONObject authInfoCache;
    public AudioClient mAudioClient;
    public AudioClientFactory mAudioClientFactory;
    public AudioSinkWrapper mAudioSink;
    public AudioSinkFactory mAudioSinkFactory;
    public InteractEngineBuilder mBuilder;
    public boolean mClientStarted;
    public int mColorRange;
    public InteractConfig mConfig;
    public boolean mDisposed;
    public Client.InteractEventListener mEventListener;
    public Client.IAudioFrameObserver mExternalAudioFrameObserver;
    public GLThread mGLThread;
    public Handler mGLTreadHandler;
    public boolean mHorizontalMirror;
    public InteractEngineImpl mInteractEngine;
    public String mInteractId;
    public Client.Listener mInteractListener;
    public IInteractStatics mInteractStatics;
    public LogReportRunnable mLogReportRunnable;
    public InteractLogService mLogService;
    public MediaEngine mMediaEngine;
    public int mOutChannelCount;
    public int mOutSampleRate;
    public JSONObject mPreviewResolution;
    public RemoteYuvColorRangeReporter mRemoteColorRange;
    public String mRoomId;
    public RTCVideo mRtcEngine;
    public LiveRTCExtInfo mRtcExtInfo;
    public RTCRoomImpl mRtcRoom;
    public boolean mServerMixStreamPublishedReceived;
    public final boolean mSingleViewMode;
    public boolean mStopped;
    public StreamMixManager mStreamMixManager;
    public Runnable mTaskOnStreamPublished;
    public VPassInteractCfg mVPassInteractCfg;
    public boolean mVerticalMirror;
    public VideoClient mVideoClient;
    public VideoClientFactory mVideoClientFactory;
    public VideoSinkFactory mVideoSinkFactory;
    public Map<String, Client.RTCWaterMarkRegion> mWaterMarkRegions;
    public boolean needPublishFrame;
    public RTCEngineWrapper rtcEngineWrapper;
    public RTCRoomHandlerProxy rtcRoomHandlerProxy;
    public boolean useCapturePts;
    public final String TAG = "ClientImpl";
    public int[] mAdaptedRes = new int[2];
    public Map<String, VideoSinkWrapper> mVideoSinkMap = new ConcurrentHashMap();
    public boolean mEnableRemoteAllRender = true;
    public boolean mOnlyConsumeAllRemoteSei = false;
    public Map<String, Long> mFirstRemoteVideoFrameTimestamp = new ConcurrentHashMap();
    public AtomicLong mPullStreamsDuration = new AtomicLong();
    public List<String> mGuestList = new ArrayList();
    public Map<String, Boolean> mTalkingStates = new ConcurrentHashMap();
    public long mLastUpdateTalkingStateSeiTs = 0;
    public volatile boolean mNeedUpdateTalkingStateSei = false;
    public int mUpdateTalkingStateSeiDelayCount = 0;
    public boolean mStartInteractCalled = false;
    public boolean mVideoFrameSent = false;
    public String mVideoClientLastError = "";
    public String mAudioClientLastError = "";
    public JSONObject seiInfoCache = null;
    public JSONObject metaDataCache = null;
    public boolean mMuteLocalVideoStreamStat = false;
    public Client.ICatchedVideoFrameCallback mVideoFrameCallback = null;
    public boolean mIsResume = true;
    public int mExternSurfaceVideoWidth = 0;
    public int mExternSurfaceVideoHeight = 0;
    public long lastTime = 0;
    public int repeatTimes = 0;
    public ByteBuffer mSeiBuffered = null;
    public boolean mIsNeedCopyFrame = false;
    public IInputVideoStream mInputVideoStream = null;
    public boolean mSeiCleared = false;
    public VideoMixer.VideoMixerDescription mSelfVideoMixerDescription = null;
    public int localVolume = 0;
    public boolean localTalking = false;
    public IAudioFrameObserver mInternalAudioFrameObserver = new IAudioFrameObserver() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.39
        public long lastPrintTime;

        @Override // com.ss.bytertc.engine.IAudioFrameObserver
        public void onRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame) {
        }

        @Override // com.ss.bytertc.engine.IAudioFrameObserver
        public void onMixedAudioFrame(IAudioFrame iAudioFrame) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastPrintTime > 20000) {
                AVLog.w("ClientImpl", "onMixedAudioFrame");
                this.lastPrintTime = currentTimeMillis;
            }
            Client.IAudioFrameObserver iAudioFrameObserver = ClientImpl.this.mExternalAudioFrameObserver;
            if (iAudioFrameObserver != null && iAudioFrameObserver.wantMixedAudioFrame()) {
                iAudioFrameObserver.onMixedAudioFrame(iAudioFrame.getDataBuffer(), iAudioFrame.data_size(), iAudioFrame.sample_rate().value(), iAudioFrame.channel().value(), iAudioFrame.timestamp_us());
            }
        }

        @Override // com.ss.bytertc.engine.IAudioFrameObserver
        public void onPlaybackAudioFrame(IAudioFrame iAudioFrame) {
            Client.IAudioFrameObserver iAudioFrameObserver = ClientImpl.this.mExternalAudioFrameObserver;
            if (iAudioFrameObserver != null && iAudioFrameObserver.wantPlaybackAudioFrame()) {
                iAudioFrameObserver.onPlaybackAudioFrame(iAudioFrame.getDataBuffer(), iAudioFrame.data_size(), iAudioFrame.sample_rate().value(), iAudioFrame.channel().value(), iAudioFrame.timestamp_us());
            }
        }

        @Override // com.ss.bytertc.engine.IAudioFrameObserver
        public void onRecordAudioFrame(IAudioFrame iAudioFrame) {
            Client.IAudioFrameObserver iAudioFrameObserver = ClientImpl.this.mExternalAudioFrameObserver;
            if (iAudioFrameObserver != null && iAudioFrameObserver.wantRecordAudioFrame()) {
                iAudioFrameObserver.onRecordAudioFrame(iAudioFrame.getDataBuffer(), iAudioFrame.data_size(), iAudioFrame.sample_rate().value(), iAudioFrame.channel().value(), iAudioFrame.timestamp_us());
            }
        }
    };
    public Client.Listener mInteractListenerProxy = new AnonymousClass40();
    public IRTCEngineEventHandler mRtcCallback = new IRTCEngineEventHandler() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.43
    };
    public IRTCRoomEventHandler mRoomEventHandler = new IRTCRoomEventHandler() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.44
        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onAVSyncStateChange(AVSyncState aVSyncState) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onAudioStreamBanned(String str, boolean z) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomError(int i) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomWarning(int i) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onStreamAdd(RTCStream rTCStream) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onStreamStateChanged(String str, String str2, int i, String str3) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onTokenWillExpire() {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onVideoStreamBanned(String str, boolean z) {
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onForwardStreamEvent(forwardStreamEventInfoArr);
            Client.Listener listener = ClientImpl.this.mInteractListenerProxy;
            if (listener != null) {
                for (ForwardStreamEventInfo forwardStreamEventInfo : forwardStreamEventInfoArr) {
                    listener.onInfo(ClientImpl.this, 304, 0L, forwardStreamEventInfo.event, forwardStreamEventInfo.roomId);
                }
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onForwardStreamStateChanged(forwardStreamStateInfoArr);
            Client.Listener listener = ClientImpl.this.mInteractListenerProxy;
            if (listener != null) {
                for (ForwardStreamStateInfo forwardStreamStateInfo : forwardStreamStateInfoArr) {
                    int i = AnonymousClass72.$SwitchMap$com$ss$bytertc$engine$data$ForwardStreamStateInfo$ForwardStreamState[forwardStreamStateInfo.state.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                listener.onInfo(ClientImpl.this, 303, 0L, forwardStreamStateInfo.error, forwardStreamStateInfo.roomId);
                            }
                        } else {
                            listener.onInfo(ClientImpl.this, 302, 0L, forwardStreamStateInfo.error, forwardStreamStateInfo.roomId);
                        }
                    } else {
                        listener.onInfo(ClientImpl.this, 301, 0L, forwardStreamStateInfo.error, forwardStreamStateInfo.roomId);
                    }
                }
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onLeaveRoom(rTCRoomStats);
            ClientImpl.this.mLogService.onLeaveChannelReturn();
            ClientImpl.this.mInteractStatics.calcDurationFromInteractToLive();
            long[] jArr = new long[2];
            ClientImpl.this.mInteractStatics.getInteractConnectDurationInfo(jArr);
            ClientImpl.this.mLogService.onInteractConnectionTimeCount(jArr);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onLocalStreamStats(LocalStreamStats localStreamStats) {
            ClientImpl.this.mRtcCallback.onLocalStreamStats(localStreamStats);
            ClientImpl.this.mInteractStatics.onLocalNetworkQuality(localStreamStats.txQuality);
            ClientImpl.this.mInteractStatics.onLocalVideoStats(localStreamStats.videoStats);
            ClientImpl.this.mInteractStatics.onLocalAudioStats(localStreamStats.audioStats);
            ClientImpl clientImpl = ClientImpl.this;
            Client.InteractEventListener interactEventListener = clientImpl.mEventListener;
            if (interactEventListener != null) {
                String str = clientImpl.mInteractId;
                interactEventListener.onInteractInfoReport(clientImpl, str, 12, 0L, str, Integer.valueOf(localStreamStats.txQuality), Integer.valueOf(localStreamStats.rxQuality));
            }
            ClientImpl clientImpl2 = ClientImpl.this;
            clientImpl2.mInteractListenerProxy.onInfo(clientImpl2, 12, 0L, clientImpl2.mInteractId, Integer.valueOf(localStreamStats.txQuality), Integer.valueOf(localStreamStats.rxQuality));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
            ClientImpl.this.mRtcCallback.onRemoteStreamStats(remoteStreamStats);
            ClientImpl.this.mInteractStatics.onRemoteVideoStats(remoteStreamStats);
            ClientImpl.this.mInteractStatics.onRemoteAudioStats(remoteStreamStats);
            ClientImpl clientImpl = ClientImpl.this;
            Client.InteractEventListener interactEventListener = clientImpl.mEventListener;
            if (interactEventListener != null) {
                interactEventListener.onInteractInfoReport(clientImpl, clientImpl.mInteractId, 12, 0L, remoteStreamStats.uid, Integer.valueOf(remoteStreamStats.txQuality), Integer.valueOf(remoteStreamStats.rxQuality));
            }
            ClientImpl clientImpl2 = ClientImpl.this;
            clientImpl2.mInteractListenerProxy.onInfo(clientImpl2, 12, 0L, remoteStreamStats.uid, Integer.valueOf(remoteStreamStats.txQuality), Integer.valueOf(remoteStreamStats.rxQuality));
            ClientImpl clientImpl3 = ClientImpl.this;
            clientImpl3.mInteractListenerProxy.onInfo(clientImpl3, 1, remoteStreamStats.audioStats.jitterBufferDelay, new Object[0]);
            ClientImpl clientImpl4 = ClientImpl.this;
            clientImpl4.mInteractListenerProxy.onInfo(clientImpl4, 24, 0L, 0, remoteStreamStats);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomStats(RTCRoomStats rTCRoomStats) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onRoomStats(rTCRoomStats);
            ClientImpl.this.mInteractStatics.onLocalRtcStats(rTCRoomStats);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 2, rTCRoomStats.txVideoKBitRate, Integer.valueOf(rTCRoomStats.txAudioKBitRate));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomMessageReceived(String str, String str2) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onRoomMessageReceived(str, str2);
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListenerProxy;
            if (listener != null) {
                listener.onInfo(clientImpl, 204, 0L, str, str2, 0);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomMessageSendResult(long j, int i) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onRoomMessageSendResult(j, i);
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListenerProxy;
            if (listener != null) {
                listener.onInfo(clientImpl, 203, 0L, Long.valueOf(j), Integer.valueOf(i), 0);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onStreamPublishSuccess(String str, boolean z) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onStreamPublishSuccess(str, z);
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListenerProxy;
            if (listener != null) {
                listener.onInfo(clientImpl, 105, 0L, str, 0, 0);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
            ClientImpl.this.mRtcCallback.onUserBinaryMessageReceived(str, byteBuffer);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 21, 0L, str, byteBuffer);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserJoined(final UserInfo userInfo, int i) {
            AVLog.debugTrace(userInfo.getUid(), Integer.valueOf(i));
            ClientImpl.this.mRtcCallback.onUserJoined(userInfo, i);
            if (userInfo.getUid().equals(ClientImpl.this.mInteractId)) {
                AVLog.iow("ClientImpl", "Received my onUserJoined");
                return;
            }
            if (ClientImpl.this.mDisposed) {
                AVLog.logKibana(6, "ClientImpl", "client has been disposed,should not handle callback", null);
            }
            ClientImpl.this.mLogService.onRemoteUserOnlineOffline(true, userInfo.getUid());
            ClientImpl.this.mInteractStatics.addRemoteUser(userInfo.getUid());
            ClientImpl.this.recordGuestJoinAndLeave(userInfo.getUid(), true);
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.44.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                /* JADX WARN: Code restructure failed: missing block: B:41:0x016f, code lost:
                
                    if (r4 != null) goto L34;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$2__run$___twin___() {
                    /*
                        Method dump skipped, instructions count: 456
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.ClientImpl.AnonymousClass44.AnonymousClass2.com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$2__run$___twin___():void");
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserLeave(final String str, final int i) {
            AVLog.debugTrace(str, Integer.valueOf(i));
            if (ClientImpl.this.getConfig().getCharacter() == Config.Character.ANCHOR && ClientImpl.this.getConfig().getInteractMode() == Config.InteractMode.PK && ClientImpl.this.isClientMix()) {
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mEventListener != null) {
                    VideoEncoderConfig rtcVideoResolution = clientImpl.getRtcVideoResolution();
                    ClientImpl clientImpl2 = ClientImpl.this;
                    Client.InteractEventListener interactEventListener = clientImpl2.mEventListener;
                    if (interactEventListener != null) {
                        interactEventListener.notifyLiveStreamAdjustResolution(clientImpl2, true, rtcVideoResolution.width, rtcVideoResolution.height);
                    }
                }
            }
            ClientImpl.this.mRtcCallback.onUserLeave(str, i);
            if (str.equals(ClientImpl.this.mInteractId)) {
                AVLog.iow("ClientImpl", "Received my onUserOffline");
                return;
            }
            ClientImpl.this.mLogService.onRemoteUserOnlineOffline(false, str);
            ClientImpl.this.mInteractStatics.removeRemoteUser(str);
            ClientImpl.this.recordGuestJoinAndLeave(str, false);
            ClientImpl.this.mTalkingStates.remove(str);
            if (ClientImpl.this.mFirstRemoteVideoFrameTimestamp.containsKey(str)) {
                Long l = ClientImpl.this.mFirstRemoteVideoFrameTimestamp.get(str);
                if (l != null) {
                    long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                    if (currentTimeMillis > 0) {
                        ClientImpl.this.mPullStreamsDuration.addAndGet(currentTimeMillis);
                    }
                }
                ClientImpl.this.mFirstRemoteVideoFrameTimestamp.remove(str);
            }
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.44.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$3__run$___twin___() {
                    ClientImpl clientImpl3 = ClientImpl.this;
                    if (clientImpl3.mVideoSinkFactory != null) {
                        synchronized (clientImpl3.mVideoSinkMap) {
                            VideoSinkWrapper remove = ClientImpl.this.mVideoSinkMap.remove(str);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("remove sink uid:");
                            LIZ.append(str);
                            LIZ.append(",[");
                            LIZ.append(this);
                            LIZ.append("]");
                            AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                            if (remove != null) {
                                remove.release();
                            }
                        }
                    }
                    ClientImpl.this.updateMixStream(true, false);
                    ClientImpl clientImpl4 = ClientImpl.this;
                    clientImpl4.mInteractListenerProxy.onInfo(clientImpl4, 8, i, str);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_avframework_livestreamv2_core_interact_ClientImpl$44$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserMessageReceived(String str, String str2) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onUserMessageReceived(str, str2);
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListenerProxy;
            if (listener != null) {
                listener.onInfo(clientImpl, 202, 0L, str, str2, 0);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserMessageSendResult(long j, int i) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onUserMessageSendResult(j, i);
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListenerProxy;
            if (listener != null) {
                listener.onInfo(clientImpl, 201, 0L, Long.valueOf(j), Integer.valueOf(i), 0);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
            AVLog.debugTrace(str, mediaStreamType);
            ClientImpl.this.mRtcCallback.onUserPublishStream(str, mediaStreamType);
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mInteractListenerProxy.onInfo(clientImpl, 16, 0L, str, Boolean.FALSE);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserPublishStreamAudio", 0, str);
            }
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                ClientImpl clientImpl2 = ClientImpl.this;
                clientImpl2.mInteractListenerProxy.onInfo(clientImpl2, 15, 0L, str, Boolean.FALSE);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserPublishStreamVideo", 0, str);
                ClientImpl.this.updateMixStream(true, false);
            }
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                ClientImpl clientImpl3 = ClientImpl.this;
                Client.Listener listener = clientImpl3.mInteractListenerProxy;
                Boolean bool = Boolean.FALSE;
                listener.onInfo(clientImpl3, 16, 0L, str, bool);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserPublishStreamAudio", 0, str);
                ClientImpl clientImpl4 = ClientImpl.this;
                clientImpl4.mInteractListenerProxy.onInfo(clientImpl4, 15, 0L, str, bool);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserPublishStreamVideo", 0, str);
                ClientImpl.this.updateMixStream(true, false);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
            AVLog.debugTrace(str, mediaStreamType);
            ClientImpl.this.mRtcCallback.onUserUnPublishStream(str, mediaStreamType, streamRemoveReason);
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mInteractListenerProxy.onInfo(clientImpl, 16, 0L, str, Boolean.TRUE);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserUnPublishStreamAudio", 1, str);
            }
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                ClientImpl clientImpl2 = ClientImpl.this;
                clientImpl2.mInteractListenerProxy.onInfo(clientImpl2, 15, 0L, str, Boolean.TRUE);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserUnPublishStreamVideo", 1, str);
                ClientImpl.this.updateMixStream(true, false);
            }
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                ClientImpl clientImpl3 = ClientImpl.this;
                Client.Listener listener = clientImpl3.mInteractListenerProxy;
                Boolean bool = Boolean.TRUE;
                listener.onInfo(clientImpl3, 16, 0L, str, bool);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserUnPublishStreamAudio", 1, str);
                ClientImpl clientImpl4 = ClientImpl.this;
                clientImpl4.mInteractListenerProxy.onInfo(clientImpl4, 15, 0L, str, bool);
                ClientImpl.this.mLogService.onMediaStateChanged("onUserUnPublishStreamVideo", 1, str);
                ClientImpl.this.updateMixStream(true, false);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00a9  */
        @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onRoomStateChanged(java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.ClientImpl.AnonymousClass44.onRoomStateChanged(java.lang.String, java.lang.String, int, java.lang.String):void");
        }
    };
    public IRTCVideoEventHandler mInternalRtcCallback = new IRTCVideoEventHandler() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.45
        private void mixStreamUpdate(boolean z) {
            if (!ClientImpl.this.mConfig.getUpdateTalkSeiAB()) {
                if (z) {
                    ClientImpl.this.updateMixStream(false, false);
                    return;
                }
                return;
            }
            if (z) {
                ClientImpl.this.mNeedUpdateTalkingStateSei = true;
                if (ClientImpl.this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
                    ClientImpl.this.updateMixStream(false, false);
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!ClientImpl.this.mNeedUpdateTalkingStateSei) {
                return;
            }
            if (currentTimeMillis - ClientImpl.this.mLastUpdateTalkingStateSeiTs < r0.mConfig.getUpdateTalkSeiInterval() || !ClientImpl.this.isClientMix()) {
                return;
            }
            ClientImpl.this.updateMixStream(false, false);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mLastUpdateTalkingStateSeiTs = currentTimeMillis;
            clientImpl.mNeedUpdateTalkingStateSei = false;
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
            AVLog.debugTrace(audioPlaybackDevice.toString());
            ClientImpl.this.mRtcCallback.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onError(int i) {
            AVLog.debugTrace(Integer.valueOf(i));
            ClientImpl.this.mRtcCallback.onError(i);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onError(clientImpl, -3, i, new Exception(KMP.LJ("onError, code: ", i)));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
            AVLog.debugTrace(0);
            ClientImpl.this.mRtcCallback.onFirstLocalAudioFrame(streamIndex);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onFirstPublicStreamAudioFrame(String str) {
            AVLog.debugTrace(str);
            AVLog.ioi("ClientImpl", "onFirstPublicStreamAudioFrame");
            ClientImpl.this.mRtcCallback.onFirstPublicStreamAudioFrame(str);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 505, 0L, str);
            ClientImpl.this.mLogService.onFirstPublicStreamAudioFrame(str);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
            AVLog.debugTrace(remoteStreamKey.getUserId(), remoteStreamKey.getRoomId());
            ClientImpl.this.mRtcCallback.onFirstRemoteAudioFrame(remoteStreamKey);
            if (remoteStreamKey.getUserId().equals(ClientImpl.this.mInteractId)) {
                AVLog.iow("ClientImpl", "Received my onFirstRemoteAudioFrame");
                return;
            }
            ClientImpl.this.mLogService.onFirstRemoteFrame(true, remoteStreamKey.getUserId());
            String str = InteractEngine.AUDIO_LAYER_NAME;
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListener;
            if (listener != null) {
                listener.onInfo(clientImpl, 10, 0L, remoteStreamKey.getUserId(), str);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
            boolean z;
            ClientImpl.this.mRtcCallback.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
            int volumeThreshold = ClientImpl.this.mConfig.getVolumeThreshold();
            String[] strArr = new String[1];
            boolean[] zArr = new boolean[1];
            int[] iArr = new int[1];
            boolean z2 = false;
            for (int i = 0; i < localAudioPropertiesInfoArr.length; i++) {
                LocalAudioPropertiesInfo localAudioPropertiesInfo = localAudioPropertiesInfoArr[i];
                if (localAudioPropertiesInfo.streamIndex == StreamIndex.STREAM_INDEX_MAIN) {
                    ClientImpl clientImpl = ClientImpl.this;
                    int i2 = localAudioPropertiesInfo.audioPropertiesInfo.linearVolume;
                    clientImpl.localVolume = i2;
                    if (i2 > volumeThreshold) {
                        z = true;
                    } else {
                        z = false;
                    }
                    clientImpl.localTalking = z;
                    String str = clientImpl.mInteractId;
                    strArr[i] = str;
                    zArr[i] = z;
                    iArr[i] = i2;
                    boolean talkingState = clientImpl.getTalkingState(str);
                    ClientImpl clientImpl2 = ClientImpl.this;
                    boolean z3 = clientImpl2.localTalking;
                    if (talkingState != z3) {
                        z2 = true;
                    }
                    clientImpl2.mTalkingStates.put(clientImpl2.mInteractId, Boolean.valueOf(z3));
                }
            }
            mixStreamUpdate(z2);
            ClientImpl clientImpl3 = ClientImpl.this;
            Client.Listener listener = clientImpl3.mInteractListener;
            if (listener != null) {
                listener.onInfo(clientImpl3, 9, 0L, strArr, zArr, iArr);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onNetworkTypeChanged(int i) {
            AVLog.debugTrace(Integer.valueOf(i));
            ClientImpl.this.mRtcCallback.onNetworkTypeChanged(i);
            InteractLogService interactLogService = ClientImpl.this.mLogService;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(i);
            interactLogService.onNetworkChanged(X1D.LIZIZ(LIZ));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onSimulcastSubscribeFallback(remoteStreamSwitch);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onWarning(int i) {
            AVLog.debugTrace(Integer.valueOf(i));
            ClientImpl.this.mRtcCallback.onWarning(i);
            ClientImpl.this.mLogService.onWarningOccurs(i, "");
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 6, i, KMP.LJ("onWarning, code: ", i));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onConnectionStateChanged(int i, int i2) {
            AVLog.debugTrace(Integer.valueOf(i), Integer.valueOf(i2));
            ClientImpl.this.mRtcCallback.onConnectionStateChanged(i, i2);
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListener;
            if (listener != null) {
                listener.onInfo(clientImpl, 6, i, C48263Iwt.LIZLLL("onConnectionStateChanged: state ", i, ", reason ", i2));
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            AVLog.debugTrace(Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            ClientImpl.this.mRtcCallback.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
            AVLog.debugTrace(str, videoFrameInfo.toString());
            AVLog.ioi("ClientImpl", "onFirstPublicStreamVideoFrameDecoded");
            ClientImpl.this.mRtcCallback.onFirstPublicStreamVideoFrameDecoded(str, videoFrameInfo);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 504, 0L, str, videoFrameInfo);
            ClientImpl.this.mLogService.onFirstPublicStreamVideoFrameDecoded(str, videoFrameInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onFirstRemoteVideoFrameDecoded(final RemoteStreamKey remoteStreamKey, final VideoFrameInfo videoFrameInfo) {
            TextureView textureView;
            AVLog.debugTrace(remoteStreamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()), 0);
            AVLog.ioi("ClientImpl", "onFirstRemoteVideoFrame");
            ClientImpl.this.mRtcCallback.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
            if (remoteStreamKey.getUserId().equals(ClientImpl.this.mInteractId)) {
                AVLog.iow("ClientImpl", "Received my onFirstRemoteVideoFrame");
                return;
            }
            ClientImpl.this.mLogService.onFirstRemoteFrame(false, remoteStreamKey.getUserId());
            if (!ClientImpl.this.mFirstRemoteVideoFrameTimestamp.containsKey(remoteStreamKey.getUserId())) {
                ClientImpl.this.mFirstRemoteVideoFrameTimestamp.put(remoteStreamKey.getUserId(), Long.valueOf(System.currentTimeMillis()));
            }
            if (ClientImpl.this.mVideoSinkFactory != null) {
                InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.45.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1__run$___twin___() {
                        VideoSinkWrapper videoSinkWrapper;
                        View view;
                        synchronized (ClientImpl.this.mVideoSinkMap) {
                            videoSinkWrapper = ClientImpl.this.mVideoSinkMap.get(remoteStreamKey.getUserId());
                        }
                        if (videoSinkWrapper == null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Received user ");
                            LIZ.append(remoteStreamKey.getUserId());
                            LIZ.append("'s first video frame before his joining room.");
                            AVLog.ioe("ClientImpl", X1D.LIZIZ(LIZ));
                            return;
                        }
                        if (ClientImpl.this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
                            view = videoSinkWrapper.getSurfaceView();
                        } else if (ClientImpl.this.mConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
                            view = videoSinkWrapper.getTextureView();
                        } else {
                            view = null;
                        }
                        ClientImpl clientImpl = ClientImpl.this;
                        if (!clientImpl.mSingleViewMode) {
                            if (clientImpl.mPreviewResolution == null) {
                                clientImpl.mPreviewResolution = new JSONObject();
                            }
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("Height", view.getHeight());
                                jSONObject.put("Width", view.getWidth());
                                ClientImpl.this.mPreviewResolution.put(remoteStreamKey.getUserId(), jSONObject);
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            ClientImpl clientImpl2 = ClientImpl.this;
                            Client.Listener listener = clientImpl2.mInteractListener;
                            if (listener != null) {
                                listener.onInfo(clientImpl2, 11, 0L, remoteStreamKey.getUserId(), view, Integer.valueOf(ClientImpl.this.mInteractEngine.queryRtcId(remoteStreamKey.getUserId())), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
                            }
                        } else {
                            VideoFrameRenderer videoFrameRender = videoSinkWrapper.getVideoFrameRender();
                            ClientImpl clientImpl3 = ClientImpl.this;
                            clientImpl3.mInteractListenerProxy.onInfo(clientImpl3, 11, 1L, remoteStreamKey.getUserId(), videoFrameRender, Integer.valueOf(ClientImpl.this.mInteractEngine.queryRtcId(remoteStreamKey.getUserId())), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
                        }
                        final JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("key", "rtc_first_remote_video_msg_sent");
                            jSONObject2.put("rtc_channel_id", ClientImpl.this.mRtcExtInfo.channelId);
                            jSONObject2.put("timestamp", System.currentTimeMillis());
                        } catch (Exception unused) {
                        }
                        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.45.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1$1__run$___twin___() {
                                AVLog.logKibana(4, "ClientImpl", jSONObject2.toString(), null);
                            }

                            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00341 runnableC00341) {
                                boolean LIZ2;
                                try {
                                    runnableC00341.com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1$1__run$___twin___();
                                } finally {
                                    if (LIZ2) {
                                    }
                                }
                            }
                        });
                        AVLog.ioi("ClientImpl", "MSG_INFO_FIRST_REMOTE_VIDEO with rtc render video internal: uid " + remoteStreamKey.getUserId() + ", view " + view + ", width " + videoFrameInfo.getWidth() + ", height " + videoFrameInfo.getHeight());
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mVideoSinkFactory is null [");
            LIZ.append(this);
            LIZ.append("]");
            AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
            if (ClientImpl.this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
                SurfaceView surfaceView = new SurfaceView(ClientImpl.this.mConfig.getContext());
                surfaceView.setZOrderMediaOverlay(false);
                ClientImpl.this.mRtcEngine.setRemoteVideoCanvas(new RemoteStreamKey(ClientImpl.this.mRoomId, remoteStreamKey.getUserId(), StreamIndex.STREAM_INDEX_MAIN), new VideoCanvas(surfaceView, 1));
                textureView = surfaceView;
            } else {
                TextureView textureView2 = new TextureView(ClientImpl.this.mConfig.getContext());
                ClientImpl.this.mRtcEngine.setRemoteVideoCanvas(new RemoteStreamKey(ClientImpl.this.mRoomId, remoteStreamKey.getUserId(), StreamIndex.STREAM_INDEX_MAIN), new VideoCanvas(textureView2, 1));
                textureView = textureView2;
            }
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 11, 0L, remoteStreamKey.getUserId(), textureView, Integer.valueOf(ClientImpl.this.mInteractEngine.queryRtcId(remoteStreamKey.getUserId())), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "rtc_first_remote_video_msg_sent");
                jSONObject.put("rtc_channel_id", ClientImpl.this.mRtcExtInfo.channelId);
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.45.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$2__run$___twin___() {
                    AVLog.logKibana(4, "ClientImpl", jSONObject.toString(), null);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ2;
                    try {
                        anonymousClass2.com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$2__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("MSG_INFO_FIRST_REMOTE_VIDEO with rtc render video internal: uid ");
            LIZ2.append(remoteStreamKey.getUserId());
            LIZ2.append(", view ");
            LIZ2.append(textureView);
            LIZ2.append(", width ");
            LIZ2.append(videoFrameInfo.getWidth());
            LIZ2.append(", height ");
            LIZ2.append(videoFrameInfo.getHeight());
            AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ2));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onLogReport(String str, JSONObject jSONObject) {
            ClientImpl.this.mRtcCallback.onLogReport(str, jSONObject);
            ClientImpl.this.mInteractEngine.onLogReport(str, jSONObject);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
            AVLog.debugTrace(str, publicStreamErrorCode);
            ClientImpl.this.mRtcCallback.onPlayPublicStreamResult(str, publicStreamErrorCode);
            ClientImpl.this.mLogService.onPlayPublicStreamResult("onPlayPublicStreamResult", str, publicStreamErrorCode.value());
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 502, 0L, str, Integer.valueOf(publicStreamErrorCode.value()));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
            boolean z;
            String str;
            ClientImpl.this.mRtcCallback.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
            ClientImpl.this.mInteractStatics.onRemoteAudioVolumeIndication(remoteAudioPropertiesInfoArr, i);
            int length = remoteAudioPropertiesInfoArr.length;
            String[] strArr = new String[length];
            boolean[] zArr = new boolean[length];
            int[] iArr = new int[length];
            int volumeThreshold = ClientImpl.this.mConfig.getVolumeThreshold();
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                RemoteAudioPropertiesInfo remoteAudioPropertiesInfo = remoteAudioPropertiesInfoArr[i2];
                String userId = remoteAudioPropertiesInfo.streamKey.getUserId();
                int i3 = remoteAudioPropertiesInfo.audioPropertiesInfo.linearVolume;
                if (i3 >= volumeThreshold) {
                    z = true;
                } else {
                    z = false;
                }
                strArr[i2] = userId;
                zArr[i2] = z;
                iArr[i2] = i3;
                if (ClientImpl.this.getTalkingState(userId) != z) {
                    z2 = true;
                }
                ClientImpl.this.mTalkingStates.put(userId, Boolean.valueOf(z));
                if (z2) {
                    Object[] objArr = new Object[1];
                    StringBuilder LIZJ = b1.LIZJ(userId, " is ");
                    if (z) {
                        str = "talking";
                    } else {
                        str = "not talking";
                    }
                    LIZJ.append(str);
                    objArr[0] = X1D.LIZIZ(LIZJ);
                    AVLog.debugTrace(objArr);
                }
            }
            mixStreamUpdate(z2);
            ClientImpl clientImpl = ClientImpl.this;
            Client.Listener listener = clientImpl.mInteractListener;
            if (listener != null) {
                listener.onInfo(clientImpl, 9, 0L, strArr, zArr, iArr);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            AVLog.debugTrace(remoteStreamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            ClientImpl.this.mRtcCallback.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 19, 0L, remoteStreamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onUserStartAudioCapture(String str, String str2) {
            AVLog.debugTrace(str2, Boolean.TRUE);
            ClientImpl.this.mRtcCallback.onUserStartAudioCapture(str2);
            ClientImpl.this.mLogService.onMediaStateChanged("onUserStartAudioCapture", 1, str2);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onUserStartVideoCapture(String str, String str2) {
            AVLog.debugTrace(str2, Boolean.TRUE);
            ClientImpl.this.mRtcCallback.onUserStartVideoCapture(str2);
            ClientImpl.this.mLogService.onMediaStateChanged("onUserStartVideoCapture", 1, str2);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onUserStopAudioCapture(String str, String str2) {
            AVLog.debugTrace(str2, Boolean.FALSE);
            ClientImpl.this.mRtcCallback.onUserStopAudioCapture(str2);
            ClientImpl.this.mLogService.onMediaStateChanged("onUserStopAudioCapture", 0, str2);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onUserStopVideoCapture(String str, String str2) {
            AVLog.debugTrace(str2, Boolean.FALSE);
            ClientImpl.this.mRtcCallback.onUserStopVideoCapture(str2);
            ClientImpl.this.mLogService.onMediaStateChanged("onUserStopVideoCapture", 0, str2);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onAudioMixingStateChanged(int i, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onAudioMixingStateChanged(i, audioMixingState, audioMixingError);
            if (audioMixingState == AudioMixingState.AUDIO_MIXING_STATE_FINISHED) {
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mInteractListenerProxy.onInfo(clientImpl, 20, i, new Object[0]);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
            AVLog.debugTrace(localVideoStreamState, localVideoStreamError);
            ClientImpl.this.mRtcCallback.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
            ClientImpl.this.mRtcCallback.onLoggerMessage(logLevel, str, th);
            int i = AnonymousClass72.$SwitchMap$com$ss$bytertc$engine$utils$LogUtil$LogLevel[logLevel.ordinal()];
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 4;
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return;
                            } else {
                                i2 = 6;
                            }
                        } else {
                            i2 = 5;
                        }
                    }
                } else {
                    i2 = 3;
                }
            }
            AVLog.ILogFilter logIODevice = AVLog.getLogIODevice();
            if (logIODevice != null && i2 >= ClientImpl.this.mVPassInteractCfg.rtconLoggerMessageLevel) {
                logIODevice.print(5, "BYTE_RTC", C012403c.LIZLLL("[", i2, "] ", str), th);
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
            AVLog.debugTrace(str, dataMessageSourceType);
            ClientImpl.this.mRtcCallback.onPublicStreamSEIMessageReceived(str, byteBuffer, dataMessageSourceType);
            ClientImpl.this.mLogService.onPublicStreamSEIMessageReceived("onPublicStreamSEIMessageReceived", str, byteBuffer, dataMessageSourceType.value());
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 503, 0L, str, byteBuffer, dataMessageSourceType);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
            AVLog.debugTrace(str2, publicStreamErrorCode);
            ClientImpl.this.mRtcCallback.onPushPublicStreamResult(str2, publicStreamErrorCode);
            ClientImpl.this.mLogService.onPushPublicStreamResult("onPushPublicStreamResult", str2, publicStreamErrorCode.value());
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mInteractListenerProxy.onInfo(clientImpl, 501, 0L, str2, publicStreamErrorCode);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
            AVLog.debugTrace(remoteStreamKey.getUserId(), remoteVideoState);
            ClientImpl.this.mInteractStatics.onRemoteVideoStateChanged(remoteStreamKey.getUserId(), remoteVideoState, remoteVideoStateChangeReason);
            ClientImpl.this.mRtcCallback.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
            super.onVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
            if (ClientImpl.this.mVPassInteractCfg.interactDelayStopStream == 1 && firstFrameSendState == FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT) {
                InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.45.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$3__run$___twin___() {
                        ClientImpl clientImpl = ClientImpl.this;
                        clientImpl.mVideoFrameSent = true;
                        clientImpl.tryStartMixTranscoding();
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                        boolean LIZ;
                        try {
                            anonymousClass3.com_ss_avframework_livestreamv2_core_interact_ClientImpl$45$3__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }

        @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
        public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
            AVLog.debugTrace(new Object[0]);
            ClientImpl.this.mRtcCallback.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, sourceWantedData);
            ClientImpl clientImpl = ClientImpl.this;
            Client.InteractEventListener interactEventListener = clientImpl.mEventListener;
            if (interactEventListener != null) {
                interactEventListener.onInteractInfoReport(clientImpl, clientImpl.mInteractId, 12, 0L, Integer.valueOf(sourceWantedData.width), Integer.valueOf(sourceWantedData.height), Integer.valueOf(sourceWantedData.frameRate));
            }
            ClientImpl clientImpl2 = ClientImpl.this;
            Client.Listener listener = clientImpl2.mInteractListenerProxy;
            if (listener != null) {
                listener.onInfo(clientImpl2, 13, 0L, Integer.valueOf(sourceWantedData.width), Integer.valueOf(sourceWantedData.height), Integer.valueOf(sourceWantedData.frameRate));
            }
        }
    };
    public RemoteRenderEventHandler mRemoteRenderEventHandler = new RemoteRenderEventHandler() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.48
        @Override // com.ss.avframework.livestreamv2.core.interact.video.RemoteRenderEventHandler
        public void onFirstVideoRenderEvent(String str, int i, int i2) {
            ClientImpl.this.notifyAdjustResolution();
            ClientImpl.this.sendFirstRemoteVideoRenderMessage(str, i, i2);
            ClientImpl.this.updateMixStream(true, false);
        }
    };
    public VideoCallback rtcVideoCallback = new VideoCallback() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.52
        public int extVideoHeight;
        public int extVideoWidth;
        public long lastTime;
        public ByteBuffer mSeiBuffer;
        public int repeatTimes;

        @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoCallback
        public void onVideoWarning(String str) {
            ClientImpl.this.mVideoClientLastError = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x019d A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
        @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean updateVideoFrame(java.nio.ByteBuffer r15, int r16, int r17, long r18, java.lang.Object... r20) {
            /*
                Method dump skipped, instructions count: 679
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.ClientImpl.AnonymousClass52.updateVideoFrame(java.nio.ByteBuffer, int, int, long, java.lang.Object[]):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x023c A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0297  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0226  */
        @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean updateVideoFrame(javax.microedition.khronos.egl.EGLContext r20, android.opengl.EGLContext r21, int r22, boolean r23, float[] r24, int r25, int r26, long r27, java.lang.Object... r29) {
            /*
                Method dump skipped, instructions count: 864
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.ClientImpl.AnonymousClass52.updateVideoFrame(javax.microedition.khronos.egl.EGLContext, android.opengl.EGLContext, int, boolean, float[], int, int, long, java.lang.Object[]):boolean");
        }
    };
    public AudioCallback rtcAudioCallback = new AudioCallback() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.53
        public long lastTime;
        public byte[] mByteArray;
        public int repeatTimes;

        @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioCallback
        public void onAudioWarning(String str) {
            ClientImpl.this.mAudioClientLastError = str;
        }

        @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioCallback
        public boolean updateAudioFrame(Buffer buffer, int i, long j) {
            AudioClientFactory audioClientFactory;
            AudioSampleRate audioSampleRate;
            AudioChannel audioChannel;
            boolean z;
            ClientImpl clientImpl = ClientImpl.this;
            if (!clientImpl.needPublishFrame || (audioClientFactory = clientImpl.mAudioClientFactory) == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioClient ignore needPublishFrame=");
                LIZ.append(ClientImpl.this.needPublishFrame);
                LIZ.append(" mAudioClientFactory=");
                Object obj = ClientImpl.this.mAudioClientFactory;
                if (obj == null) {
                    obj = "null";
                }
                LIZ.append(obj);
                onAudioWarning(X1D.LIZIZ(LIZ));
                return false;
            }
            if (!(buffer instanceof ByteBuffer)) {
                onAudioWarning("AudioClient non ByteBuffer");
                return false;
            }
            int sampleRate = audioClientFactory.getSampleRate();
            int channelCount = ClientImpl.this.mAudioClientFactory.getChannelCount();
            if (i * 100 != sampleRate) {
                StringBuilder LJ = C7MY.LJ("AudioClient invalid frame length ", i, " VS ");
                LJ.append(sampleRate / 100);
                onAudioWarning(X1D.LIZIZ(LJ));
                return false;
            }
            this.repeatTimes++;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastTime >= 10000) {
                this.lastTime = currentTimeMillis;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" (repeat ");
                AVLog.debugTrace(buffer, Integer.valueOf(i), Long.valueOf(j), C08380Uo.LIZ(LIZ2, this.repeatTimes, " times)", LIZ2));
                this.repeatTimes = 0;
            }
            ClientImpl.this.mLogService.onFirstLocalExternalAudioFrame();
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            int i2 = i * channelCount * 2;
            try {
                byte[] bArr = this.mByteArray;
                if (bArr == null || bArr.length != i2) {
                    this.mByteArray = new byte[i2];
                }
                byteBuffer.get(this.mByteArray, 0, i2);
                AudioFrame audioFrame = new AudioFrame();
                audioFrame.buffer = this.mByteArray;
                audioFrame.samples = i;
                if (sampleRate != 8000) {
                    if (sampleRate != 16000) {
                        if (sampleRate != 32000) {
                            if (sampleRate != 44100) {
                                if (sampleRate != 48000) {
                                    audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_44100;
                                } else {
                                    audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_48000;
                                }
                            } else {
                                audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_44100;
                            }
                        } else {
                            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_32000;
                        }
                    } else {
                        audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_16000;
                    }
                } else {
                    audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_8000;
                }
                if (channelCount != -1) {
                    if (channelCount != 2) {
                        audioChannel = AudioChannel.AUDIO_CHANNEL_MONO;
                    } else {
                        audioChannel = AudioChannel.AUDIO_CHANNEL_STEREO;
                    }
                } else {
                    audioChannel = AudioChannel.AUDIO_CHANNEL_AUTO;
                }
                audioFrame.sampleRate = audioSampleRate;
                audioFrame.channel = audioChannel;
                int pushExternalAudioFrame = ClientImpl.this.mRtcEngine.pushExternalAudioFrame(audioFrame);
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                if (interactLogService != null) {
                    if (pushExternalAudioFrame == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interactLogService.addVideoFramesReport(true, z);
                }
                if (pushExternalAudioFrame < 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("RTC push audioFrame failed(");
                    LIZ3.append(pushExternalAudioFrame);
                    LIZ3.append(")");
                    onAudioWarning(X1D.LIZIZ(LIZ3));
                    return false;
                }
            } catch (Exception e) {
                StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "RTC push audioFrame exception(");
                LIZIZ.append(e.getMessage());
                LIZIZ.append(")");
                onAudioWarning(X1D.LIZIZ(LIZIZ));
            }
            return true;
        }
    };

    /* loaded from: classes12.dex */
    public class LogReportRunnable implements Runnable {
        public boolean started;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_avframework_livestreamv2_core_interact_ClientImpl$LogReportRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void start() {
            AVLog.debugTrace(this, Boolean.valueOf(this.started));
            if (!this.started) {
                this.started = true;
                if (ClientImpl.this.mConfig.getHandler() != null) {
                    InteractThreadUtils.postWorkTask(this);
                }
            }
        }

        public void stop() {
            AVLog.debugTrace(this, Boolean.valueOf(this.started));
            if (this.started) {
                this.started = false;
                if (ClientImpl.this.mConfig.getHandler() != null) {
                    InteractThreadUtils.removeWorkerCallback(this);
                }
            }
        }

        public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$LogReportRunnable__run$___twin___() {
            if (!this.started) {
                return;
            }
            AVLog.debugTrace(this);
            ClientImpl clientImpl = ClientImpl.this;
            LocalUserStatistics.LocalUserStatisticInfo localStatisticResult = clientImpl.mInteractStatics.getLocalStatisticResult(clientImpl.mInteractEngine.getBuilder().getLiveCore());
            reportLastMessage(localStatisticResult);
            if (ClientImpl.this.needPublishFrame) {
                setupRtcPushElapseInfo(localStatisticResult);
                if (ClientImpl.this.mConfig.isHeartbeatExtEnable()) {
                    try {
                        ClientImpl.this.mBuilder.getLiveCore().getAdaptedVideoResolution(ClientImpl.this.mAdaptedRes);
                        int[] iArr = ClientImpl.this.mAdaptedRes;
                        localStatisticResult.mAdaptResWidth = iArr[0];
                        localStatisticResult.mAdaptResHeight = iArr[1];
                    } catch (Throwable unused) {
                    }
                }
                ClientImpl clientImpl2 = ClientImpl.this;
                clientImpl2.mLogService.onInteractStatus(localStatisticResult, clientImpl2.mInteractStatics.getRemoteStatisticResult(), ClientImpl.this.mInteractStatics.getProcInfo());
            }
            if (this.started && InteractThreadUtils.getLogUppThreadHandler() != null) {
                InteractThreadUtils.postLogUpDelayed(this, ClientImpl.this.mConfig.getLogReportInterval() * 1000);
            }
        }

        public LogReportRunnable() {
        }

        public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$LogReportRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(LogReportRunnable logReportRunnable) {
            boolean LIZ;
            try {
                logReportRunnable.com_ss_avframework_livestreamv2_core_interact_ClientImpl$LogReportRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        private void reportLastMessage(LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(ClientImpl.this.mVideoClientLastError);
            LIZ.append("|");
            LIZ.append(ClientImpl.this.mAudioClientLastError);
            localUserStatisticInfo.mLastMessage = X1D.LIZIZ(LIZ);
            ClientImpl clientImpl = ClientImpl.this;
            clientImpl.mVideoClientLastError = "";
            clientImpl.mAudioClientLastError = "";
        }

        private void setupRtcPushElapseInfo(LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo) {
            int i;
            Statistics statistics;
            Statistics statistics2;
            VideoClient videoClient = ClientImpl.this.mVideoClient;
            int i2 = 9999;
            if (videoClient != null && (statistics2 = videoClient.getStatistics()) != null) {
                i = (int) (statistics2.getAverageSize() + 0.5d);
                localUserStatisticInfo.mVideoSourceFrameRate = statistics2.getSize();
                if (i > 9999) {
                    i = 9999;
                }
            } else {
                i = 0;
            }
            AudioClient audioClient = ClientImpl.this.mAudioClient;
            if (audioClient != null && (statistics = audioClient.getStatistics()) != null) {
                int averageSize = (int) (statistics.getAverageSize() + 0.5d);
                localUserStatisticInfo.mAudioSourceFrameRate = statistics.getSize();
                if (averageSize <= 9999) {
                    i2 = averageSize;
                }
            } else {
                i2 = 0;
            }
            localUserStatisticInfo.mRtcPushElapseMs = (i * 10000) + i2;
        }
    }

    private void configAudioSourceAndAudioSink() {
        AudioClientFactory audioClientFactory = this.mAudioClientFactory;
        if (audioClientFactory != null && this.mAudioSinkFactory != null) {
            int sampleRate = audioClientFactory.getSampleRate();
            this.mAudioClientFactory.getChannelCount();
            int sampleRate2 = this.mAudioSinkFactory.getSampleRate();
            this.mAudioSinkFactory.getChannelCount();
            if (sampleRate != sampleRate2) {
                Client.Listener listener = this.mInteractListener;
                if (listener != null) {
                    listener.onError(this, -1, 0L, new Exception("External AudioClient and AudioSink should have same sample rate."));
                    return;
                }
                return;
            }
            AVLog.iow("ClientImpl", "LiveRtcEngine.setExternalAudioSource(true) and LiveRtcEngine.setExternalAudioSink(true)");
            this.mRtcEngine.setAudioRenderType(AudioRenderType.AUDIO_RENDER_TYPE_EXTERNAL);
            this.mRtcEngine.setAudioSourceType(AudioSourceType.AUDIO_SOURCE_TYPE_EXTERNAL);
            AudioClient create = this.mAudioClientFactory.create();
            this.mAudioClient = create;
            create.prepare(this.rtcAudioCallback);
            this.mAudioSink = new AudioSinkWrapper(this.mAudioSinkFactory, this.rtcEngineWrapper);
            return;
        }
        AVLog.iow("ClientImpl", "LiveRtcEngine.setExternalAudioSource(false) and LiveRtcEngine.setExternalAudioSink(false)");
        this.mRtcEngine.setAudioRenderType(AudioRenderType.AUDIO_RENDER_TYPE_INTERNAL);
        this.mRtcEngine.setAudioSourceType(AudioSourceType.AUDIO_SOURCE_TYPE_INTERNAL);
    }

    public synchronized void clearAllSinkWrappers() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current video sink wrappers count:");
        LIZ.append(this.mVideoSinkMap.size());
        LIZ.append(",[");
        LIZ.append(this);
        LIZ.append("]");
        AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
        for (VideoSinkWrapper videoSinkWrapper : this.mVideoSinkMap.values()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("release ");
            LIZ2.append(videoSinkWrapper);
            AVLog.iow("ClientImpl", X1D.LIZIZ(LIZ2));
            videoSinkWrapper.release();
        }
        this.mVideoSinkMap.clear();
    }

    public void clearSei() {
        this.mSeiCleared = true;
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore == null) {
            return;
        }
        liveCore.addSeiField("app_data", null, -1);
        liveCore.addSeiField("canvas", null, -1);
        liveCore.addSeiField("source", null, -1);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public RTCRoom createRtcRoom() {
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void invalidateSei() {
        AVLog.debugTrace(new Object[0]);
        boolean updateMixStream = updateMixStream(true, false);
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(this);
        LIZ.append(" mixStreamDone: ");
        LIZ.append(updateMixStream);
        interactLogService.onEngineAPICall("invalidateSei", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public boolean isDualStream() {
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public boolean isMultiRoomClient() {
        return false;
    }

    public void joinChannelInternal() {
        int i;
        Client.Listener listener;
        MuteState muteState;
        this.mLogService.setRtcSdkVersions(RTCEngine.getSdkVersion(), RTCEngine.getSdkVersion());
        if (this.mConfig.getDefaultAudioRoutetoSpeakerphone()) {
            this.mRtcEngine.setAudioPlaybackDevice(AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE);
        }
        RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
        boolean z = true;
        if (rTCRoomImpl != null) {
            rTCRoomImpl.setUserVisibility(true);
        }
        if (this.mConfig.getVolumeCallbackInterval() > 0) {
            this.mRtcEngine.enableAudioPropertiesReport(new AudioPropertiesConfig(this.mConfig.getVolumeCallbackInterval()));
        }
        configAudioSourceAndAudioSink();
        setAudioFrameObserverInternal();
        enableLocalAudio(false, "location: joinChannelInternal");
        if (this.rtcEngineWrapper != null) {
            InteractLogService interactLogService = this.mLogService;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("muteState:");
            MuteState muteState2 = MuteState.MUTE_STATE_OFF;
            LIZ.append(muteState2);
            interactLogService.onRTCEngineMediaAPICall("muteLocalAudio", X1D.LIZIZ(LIZ), "location: joinChannelInternal");
            this.rtcEngineWrapper.muteLocalAudio(muteState2);
            InteractLogService interactLogService2 = this.mLogService;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("muteState:");
            if (this.mEnableRemoteAllRender) {
                muteState = muteState2;
            } else {
                muteState = MuteState.MUTE_STATE_ON;
            }
            LIZ2.append(muteState);
            interactLogService2.onRTCEngineMediaAPICall("muteAllRemoteAudio", X1D.LIZIZ(LIZ2), "location: joinChannelInternal");
            RTCEngineWrapper rTCEngineWrapper = this.rtcEngineWrapper;
            if (!this.mEnableRemoteAllRender) {
                muteState2 = MuteState.MUTE_STATE_ON;
            }
            rTCEngineWrapper.muteAllRemoteAudio(muteState2);
        }
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            if (this.mVideoClientFactory != null) {
                this.mLogService.onRTCEngineMediaAPICall("publishStream", "mediaType:video", "location: joinChannelInternal");
                this.mRtcRoom.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                this.mLogService.onRTCEngineMediaAPICall("resumeAllSubscribedStream", "mediaType:video", "location: joinChannelInternal");
                this.mRtcRoom.resumeAllSubscribedStream(PauseResumeControlMediaType.VIDEO);
                this.mRtcEngine.setVideoSourceType(StreamIndex.STREAM_INDEX_MAIN, VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL);
                VideoClient create = this.mVideoClientFactory.create();
                this.mVideoClient = create;
                create.prepare(this.rtcVideoCallback);
            } else {
                throw new AndroidRuntimeException("External video capturer should be set.");
            }
        }
        if (getConfig() != null && isClientMix()) {
            i = 1;
        } else {
            i = 0;
        }
        this.rtcEngineWrapper.configureEngine(new LiveInfo(i), this.mInternalRtcCallback);
        Config.VideoQuality videoQuality = this.mConfig.getVideoQuality();
        int videoEncoderConfig = this.rtcEngineWrapper.setVideoEncoderConfig(new VideoEncoderConfig[]{new VideoEncoderConfig(videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getFps(), videoQuality.getBitrate(), 0)});
        if (videoEncoderConfig < 0) {
            Client.Listener listener2 = this.mInteractListener;
            if (listener2 != null) {
                listener2.onError(this, -1, videoEncoderConfig, new Exception("setVideoResolution failed"));
                return;
            }
            return;
        }
        VideoEncoderConfig rtcVideoResolution = this.rtcEngineWrapper.getLiveRTCInfoMode().getRtcVideoResolution();
        if (rtcVideoResolution != null && rtcVideoResolution.width > 0 && rtcVideoResolution.height > 0) {
            int i2 = rtcVideoResolution.frameRate;
            if (i2 <= 0) {
                i2 = videoQuality.getFps();
            }
            int i3 = rtcVideoResolution.maxBitrate;
            if (i3 <= 0) {
                i3 = videoQuality.getBitrate();
            }
            this.mConfig.setVideoQuality(new Config.VideoQuality(rtcVideoResolution.width, rtcVideoResolution.height, i2, i3));
        }
        String str = this.mRtcExtInfo.channelId;
        if ((str == null || str.equals(CardStruct.IStatusCode.DEFAULT)) && (listener = this.mInteractListener) != null) {
            listener.onError(this, -1, 0L, new Exception("channel name illegal"));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mAudioClientFactory == null) {
                z = false;
            }
            jSONObject.put("external_audio", z);
            if (!this.mConfig.isEnableAudioOnStart()) {
                jSONObject.put("enable_local_audio", false);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        int joinRoom = this.rtcEngineWrapper.joinRoom(null);
        this.mLogService.onJoiningChannel(joinRoom, this.mRtcExtInfo.token, this.rtcEngineWrapper.getAppId(), jSONObject.toString());
        if (joinRoom < 0) {
            AVLog.ioi("ClientImpl", "joinChannel() failed= code:" + joinRoom);
            Client.Listener listener3 = this.mInteractListener;
            if (listener3 != null) {
                listener3.onError(this, -1, joinRoom, new Exception("joinChannel failed"));
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setSingleViewMode(boolean z) {
    }

    public void startInternal() {
        boolean z;
        int i;
        Client.Listener listener;
        Client.Listener listener2;
        boolean z2;
        this.mServerMixStreamPublishedReceived = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start() ");
        LIZ.append(this);
        AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
        this.mLogService.setRtcSdkVersions(RTCEngine.getSdkVersion(), RTCEngine.getSdkVersion());
        RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
        if (rTCRoomImpl != null) {
            rTCRoomImpl.setUserVisibility(true);
        }
        if (this.mConfig.getVolumeCallbackInterval() > 0) {
            this.mRtcEngine.enableAudioPropertiesReport(new AudioPropertiesConfig(this.mConfig.getVolumeCallbackInterval()));
        }
        configAudioSourceAndAudioSink();
        setAudioFrameObserverInternal();
        if (this.mConfig.isEnableAudioOnStart() && this.mIsResume) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LiveRtcEngine.enableLocalAudio(");
        LIZ2.append(z);
        LIZ2.append(")");
        AVLog.iow("ClientImpl", X1D.LIZIZ(LIZ2));
        enableLocalAudio(z, "location: startInternal");
        if (this.rtcEngineWrapper != null) {
            InteractLogService interactLogService = this.mLogService;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("muteState:");
            MuteState muteState = MuteState.MUTE_STATE_OFF;
            LIZ3.append(muteState);
            interactLogService.onRTCEngineMediaAPICall("muteLocalAudio", X1D.LIZIZ(LIZ3), "location: startInternal");
            this.rtcEngineWrapper.muteLocalAudio(muteState);
            InteractLogService interactLogService2 = this.mLogService;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("muteState:");
            LIZ4.append(muteState);
            interactLogService2.onRTCEngineMediaAPICall("muteAllRemoteAudio", X1D.LIZIZ(LIZ4), "location: startInternal");
            this.rtcEngineWrapper.muteAllRemoteAudio(muteState);
        }
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            if (this.mVideoClientFactory != null) {
                if (this.mMuteLocalVideoStreamStat) {
                    this.mLogService.onRTCEngineMediaAPICall("unpublishStream", "mediaType: video", "location: startInternal");
                    this.mRtcRoom.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                } else {
                    this.mLogService.onRTCEngineMediaAPICall("publishStream", "mediaType: video", "location: startInternal");
                    this.mRtcRoom.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                }
                this.mLogService.onRTCEngineMediaAPICall("resumeAllSubscribedStream", "mediaType: video", "location: startInternal");
                this.mRtcRoom.resumeAllSubscribedStream(PauseResumeControlMediaType.VIDEO);
                this.mRtcEngine.setVideoSourceType(StreamIndex.STREAM_INDEX_MAIN, VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL);
                VideoClient create = this.mVideoClientFactory.create();
                this.mVideoClient = create;
                create.prepare(this.rtcVideoCallback);
            } else {
                throw new AndroidRuntimeException("External video capturer should be set.");
            }
        } else {
            AVLog.iow("ClientImpl", "LiveRtcEngine.enableLocalVideo(false)");
        }
        if (getConfig() != null && isClientMix()) {
            i = 1;
        } else {
            i = 0;
        }
        this.rtcEngineWrapper.configureEngine(new LiveInfo(i), this.mInternalRtcCallback);
        Config.VideoQuality videoQuality = this.mConfig.getVideoQuality();
        int videoEncoderConfig = this.rtcEngineWrapper.setVideoEncoderConfig(new VideoEncoderConfig[]{new VideoEncoderConfig(videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getFps(), videoQuality.getBitrate(), 0)});
        if (videoEncoderConfig < 0) {
            Client.Listener listener3 = this.mInteractListener;
            if (listener3 != null) {
                listener3.onError(this, -1, videoEncoderConfig, new Exception("setVideoResolution failed"));
                return;
            }
            return;
        }
        VideoEncoderConfig rtcVideoResolution = this.rtcEngineWrapper.getLiveRTCInfoMode().getRtcVideoResolution();
        if (rtcVideoResolution != null && rtcVideoResolution.width > 0 && rtcVideoResolution.height > 0) {
            int i2 = rtcVideoResolution.frameRate;
            if (i2 <= 0) {
                i2 = videoQuality.getFps();
            }
            int i3 = rtcVideoResolution.maxBitrate;
            if (i3 <= 0) {
                i3 = videoQuality.getBitrate();
            }
            this.mConfig.setVideoQuality(new Config.VideoQuality(rtcVideoResolution.width, rtcVideoResolution.height, i2, i3));
        }
        this.mLogService.onPublishStream(0);
        String str = this.mRtcExtInfo.channelId;
        if ((str == null || str.equals(CardStruct.IStatusCode.DEFAULT)) && (listener = this.mInteractListener) != null) {
            listener.onError(this, -1, 0L, new Exception("channel name illegal"));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mAudioClientFactory != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject.put("external_audio", z2);
            if (!z) {
                jSONObject.put("enable_local_audio", false);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        int joinRoom = this.rtcEngineWrapper.joinRoom(null);
        this.mLogService.onJoiningChannel(joinRoom, this.mRtcExtInfo.token, this.rtcEngineWrapper.getAppId(), jSONObject.toString());
        if (joinRoom < 0 && (listener2 = this.mInteractListener) != null) {
            listener2.onError(this, -1, joinRoom, new Exception("joinChannel failed"));
        }
        this.mStreamMixManager.configMixTranscoding();
        Client.InteractEventListener interactEventListener = this.mEventListener;
        if (interactEventListener != null) {
            interactEventListener.onInteractStart(this);
        }
        this.needPublishFrame = true;
    }

    public void stopInternal() {
        VideoClient videoClient;
        this.mStopped = true;
        this.needPublishFrame = false;
        AVLog.debugTrace(new Object[0]);
        if (isClientMix() && this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.getInteractMode() == Config.InteractMode.PK && this.mEventListener != null) {
            VideoEncoderConfig rtcVideoResolution = getRtcVideoResolution();
            Client.InteractEventListener interactEventListener = this.mEventListener;
            if (interactEventListener != null) {
                interactEventListener.notifyLiveStreamAdjustResolution(this, true, rtcVideoResolution.width, rtcVideoResolution.height);
            }
        }
        if (this.mConfig.getType() == Config.Type.VIDEO && this.mVideoClientFactory != null && (videoClient = this.mVideoClient) != null) {
            synchronized (videoClient) {
                this.mVideoClient.stop();
                this.mVideoClient.release();
                this.mVideoClientFactory.destroy(this.mVideoClient);
                this.mVideoClient = null;
            }
        }
        if (!this.mVPassInteractCfg.clearSinkDelay) {
            clearAllSinkWrappers();
        }
        Iterator<String> it = this.mFirstRemoteVideoFrameTimestamp.keySet().iterator();
        while (it.hasNext()) {
            Long l = this.mFirstRemoteVideoFrameTimestamp.get(it.next());
            if (l != null) {
                long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                if (currentTimeMillis > 0) {
                    this.mPullStreamsDuration.addAndGet(currentTimeMillis);
                }
            }
        }
        this.mFirstRemoteVideoFrameTimestamp.clear();
        AudioClient audioClient = this.mAudioClient;
        if (audioClient != null) {
            synchronized (audioClient) {
                this.mAudioClient.stop();
                this.mAudioClient.release();
                this.mAudioClientFactory.destroy(this.mAudioClient);
                this.mAudioClient = null;
            }
        }
        AudioSinkWrapper audioSinkWrapper = this.mAudioSink;
        if (audioSinkWrapper != null) {
            synchronized (audioSinkWrapper) {
                this.mAudioSink.stop();
                this.mAudioSink.release();
                this.mAudioSink = null;
            }
        }
        this.mExternalAudioFrameObserver = null;
        setAudioFrameObserverInternal();
        if (this.rtcEngineWrapper != null) {
            InteractLogService interactLogService = this.mLogService;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("muteState:");
            MuteState muteState = MuteState.MUTE_STATE_ON;
            LIZ.append(muteState);
            interactLogService.onRTCEngineMediaAPICall("muteLocalAudio", X1D.LIZIZ(LIZ), "location: stopInternal");
            this.rtcEngineWrapper.muteLocalAudio(muteState);
            InteractLogService interactLogService2 = this.mLogService;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("muteState:");
            LIZ2.append(muteState);
            interactLogService2.onRTCEngineMediaAPICall("muteAllRemoteAudio", X1D.LIZIZ(LIZ2), "location: stopInternal");
            this.rtcEngineWrapper.muteAllRemoteAudio(muteState);
        }
        enableLocalAudio(false, "location: stopInternal");
        this.mWaterMarkRegions.clear();
        this.mStreamMixManager.stopLiveTranscoding();
        this.mStreamMixManager.stopInteract();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Check remote yuv color range average cost ");
        LIZ3.append(this.mRemoteColorRange.getAverageCheckCost());
        LIZ3.append("ms per frame");
        AVLog.iow("ClientImpl", X1D.LIZIZ(LIZ3));
        this.mLogService.onLeavingChannel(this.mPullStreamsDuration.get(), this.mRemoteColorRange.getRemoteYuvFrameColorRange(), this.mRemoteColorRange.getYuv2RgbFrameColorRange());
        RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
        if (rTCRoomImpl != null) {
            rTCRoomImpl.leaveRoom();
        }
        resetRtcEngine(this.mRtcEngine);
        this.mGuestList.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("LeaveChannel cost ");
        LIZ4.append(System.currentTimeMillis() - currentTimeMillis2);
        LIZ4.append("ms");
        AVLog.iow("ClientImpl", X1D.LIZIZ(LIZ4));
        this.mInteractListenerProxy.onInfo(this, 5, 0L, new Object[0]);
        Client.InteractEventListener interactEventListener2 = this.mEventListener;
        if (interactEventListener2 != null) {
            interactEventListener2.onInteractStop(this);
        }
        if (this.mConfig.isNeedResetLayoutAfterInteract()) {
            try {
                ILayerControl.ILayer localOriginLayer = this.mInteractEngine.getBuilder().getLiveCore().getLayerControl().getLocalOriginLayer();
                VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
                FILL.setMode(2);
                FILL.setzOrder(0);
                localOriginLayer.updateDescription(FILL);
            } catch (Exception e) {
                AVLog.logKibana(6, "ClientExt", "Stop interact without reset layour.", e);
            }
        }
        if (this.mVPassInteractCfg.clearSinkDelay) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("begin clearAllSinkWrappers [");
            LIZ5.append(this);
            LIZ5.append("]");
            AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ5));
            clearAllSinkWrappers();
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("end clearAllSinkWrappers [");
            LIZ6.append(this);
            LIZ6.append("]");
            AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ6));
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("end release [");
        LIZ7.append(this);
        LIZ7.append("]");
        AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ7));
        invalidateSei();
        if (isClientMix()) {
            clearSei();
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientImpl$72, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass72 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$PerformanceProfile;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$ForwardStreamStateInfo$ForwardStreamState;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$utils$LogUtil$LogLevel;

        static {
            int[] iArr = new int[LogUtil.LogLevel.values().length];
            $SwitchMap$com$ss$bytertc$engine$utils$LogUtil$LogLevel = iArr;
            try {
                iArr[LogUtil.LogLevel.LOG_LEVEL_TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$utils$LogUtil$LogLevel[LogUtil.LogLevel.LOG_LEVEL_DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$utils$LogUtil$LogLevel[LogUtil.LogLevel.LOG_LEVEL_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$utils$LogUtil$LogLevel[LogUtil.LogLevel.LOG_LEVEL_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$utils$LogUtil$LogLevel[LogUtil.LogLevel.LOG_LEVEL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ForwardStreamStateInfo.ForwardStreamState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$ForwardStreamStateInfo$ForwardStreamState = iArr2;
            try {
                iArr2[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ForwardStreamStateInfo$ForwardStreamState[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ForwardStreamStateInfo$ForwardStreamState[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Client.PerformanceProfile.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$PerformanceProfile = iArr3;
            try {
                iArr3[Client.PerformanceProfile.PERFORMANCE_PROFILE_HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$PerformanceProfile[Client.PerformanceProfile.PERFORMANCE_PROFILE_MID.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$PerformanceProfile[Client.PerformanceProfile.PERFORMANCE_PROFILE_LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientImpl$9, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass9 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_avframework_livestreamv2_core_interact_ClientImpl$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$9__run$___twin___() {
            boolean z;
            boolean z2;
            InteractEngineBuilder interactEngineBuilder;
            LiveCore liveCore;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("begin release [");
            LIZ.append(this);
            LIZ.append("]");
            AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
            InteractLogService interactLogService = ClientImpl.this.mLogService;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(this);
            LIZ2.append(" ,TimeStamp:");
            LIZ2.append(System.currentTimeMillis());
            interactLogService.onEngineAPICall("stop", X1D.LIZIZ(LIZ2));
            ClientImpl clientImpl = ClientImpl.this;
            boolean z3 = false;
            clientImpl.mStartInteractCalled = false;
            clientImpl.mVideoFrameSent = false;
            if (clientImpl.mVPassInteractCfg.disableSpatialAudioWhenPlayBGM && (interactEngineBuilder = clientImpl.mBuilder) != null && (liveCore = interactEngineBuilder.getLiveCore()) != null && liveCore.getAudioFilterMgr() != null) {
                liveCore.getAudioFilterMgr().setBgmStatusCallback(null);
            }
            ClientImpl clientImpl2 = ClientImpl.this;
            if (!clientImpl2.mClientStarted) {
                AVLog.iow("ClientImpl", "client already stopped stop again, why?");
                return;
            }
            clientImpl2.mClientStarted = false;
            LiveCore liveCore2 = clientImpl2.mBuilder.getLiveCore();
            if (liveCore2 != null && liveCore2.getBuilder() != null) {
                ClientImpl.this.mInteractEngine.setVideoCaptureResolution(liveCore2.getBuilder().getVideoWidth(), liveCore2.getBuilder().getVideoHeight());
            }
            ClientImpl.this.mInteractStatics.setInteractStopTime();
            ClientImpl.this.checkAudioCaptureCert();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("optimize open: ");
            VPassInteractCfg vPassInteractCfg = ClientImpl.this.mVPassInteractCfg;
            if (vPassInteractCfg.enablePushStreamSwitchAfterServerMixStream || vPassInteractCfg.interactDelayStopRtc == 1) {
                z = true;
            } else {
                z = false;
            }
            LIZ3.append(z);
            LIZ3.append(" mixStreamType: ");
            Config.MixStreamType mixStreamType = ClientImpl.this.mBuilder.getMixStreamType();
            Config.MixStreamType mixStreamType2 = Config.MixStreamType.SERVER_MIX;
            if (mixStreamType == mixStreamType2) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZ3.append(z2);
            LIZ3.append(" isAnchor : ");
            Config.Character character = ClientImpl.this.mConfig.getCharacter();
            Config.Character character2 = Config.Character.ANCHOR;
            if (character == character2) {
                z3 = true;
            }
            LIZ3.append(z3);
            AVLog.iod("ClientImpl", X1D.LIZIZ(LIZ3));
            ClientImpl clientImpl3 = ClientImpl.this;
            VPassInteractCfg vPassInteractCfg2 = clientImpl3.mVPassInteractCfg;
            if ((vPassInteractCfg2.enablePushStreamSwitchAfterServerMixStream || vPassInteractCfg2.interactDelayStopRtc == 1) && clientImpl3.mBuilder.getMixStreamType() == mixStreamType2 && ClientImpl.this.mConfig.getCharacter() == character2) {
                AVLog.iod("ClientImpl", "stop interact with optimize");
                ClientImpl clientImpl4 = ClientImpl.this;
                clientImpl4.mInteractEngine.stop(clientImpl4, clientImpl4.mConfig, new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1__run$___twin___() {
                        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.9.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1$1__run$___twin___() {
                                ClientImpl.this.stopInternal();
                                ClientImpl.this.invalidateSei();
                                if (ClientImpl.this.isClientMix()) {
                                    ClientImpl.this.clearSei();
                                }
                            }

                            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00351 runnableC00351) {
                                boolean LIZ4;
                                try {
                                    runnableC00351.com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1$1__run$___twin___();
                                } finally {
                                    if (LIZ4) {
                                    }
                                }
                            }
                        });
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ4;
                        try {
                            anonymousClass1.com_ss_avframework_livestreamv2_core_interact_ClientImpl$9$1__run$___twin___();
                        } finally {
                            if (LIZ4) {
                            }
                        }
                    }
                });
            } else {
                ClientImpl.this.stopInternal();
                ClientImpl clientImpl5 = ClientImpl.this;
                clientImpl5.mInteractEngine.stop(clientImpl5, clientImpl5.mConfig, null);
            }
            ClientImpl.this.stopLogReport();
        }

        public AnonymousClass9() {
        }

        public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
            boolean LIZ;
            try {
                anonymousClass9.com_ss_avframework_livestreamv2_core_interact_ClientImpl$9__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    private JSONObject getRtcDownResolution() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, VideoSinkWrapper> entry : this.mVideoSinkMap.entrySet()) {
                jSONObject2.put("Height", entry.getValue().getRtcDownHeight());
                jSONObject2.put("Width", entry.getValue().getRtcDownWidth());
                jSONObject.put(entry.getKey(), jSONObject2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    private void setAudioFrameObserverInternal() {
        if (this.mExternalAudioFrameObserver != null) {
            this.mRtcEngine.enableAudioFrameCallback(AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_MIXED, new AudioFormat(AudioSampleRate.fromId(this.mOutSampleRate), AudioChannel.fromId(this.mOutChannelCount)));
            this.mRtcEngine.registerAudioFrameObserver(this.mInternalAudioFrameObserver);
        } else {
            this.mRtcEngine.disableAudioFrameCallback(AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_MIXED);
            this.mRtcEngine.registerAudioFrameObserver(null);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int composeCurrentWaterMarks() {
        this.mLogService.onEngineAPICall("composeCurrentWaterMarks", "");
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.64
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$64_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$64__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mWaterMarkRegions != null) {
                    clientImpl.updateMixStream(true, true);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$64_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass64 anonymousClass64) {
                boolean LIZ;
                try {
                    anonymousClass64.com_ss_avframework_livestreamv2_core_interact_ClientImpl$64__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void disableRtcPhoneListener() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.22
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$22__run$___twin___() {
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                interactLogService.onEngineAPICall("disableRtcPhoneListener", X1D.LIZIZ(LIZ));
                ClientImpl.this.rtcEngineWrapper.disableRtcPhoneListener();
                ClientImpl.this.rtcEngineWrapper.setInteractLogServer(null);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
                boolean LIZ;
                try {
                    anonymousClass22.com_ss_avframework_livestreamv2_core_interact_ClientImpl$22__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void dispose() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.11
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$11__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dispose ");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,TimeStamp:");
                LIZ2.append(System.currentTimeMillis());
                interactLogService.onEngineAPICall("dispose", X1D.LIZIZ(LIZ2));
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mInteractEngine.removeClient(clientImpl)) {
                    ClientImpl clientImpl2 = ClientImpl.this;
                    clientImpl2.mDisposed = true;
                    clientImpl2.mStopped = true;
                    clientImpl2.needPublishFrame = false;
                    AVLog.debugTrace(new Object[0]);
                    ClientImpl clientImpl3 = ClientImpl.this;
                    clientImpl3.mEventListener = null;
                    clientImpl3.mLogService = new InteractLogService(new LiveRTCExtInfo(), new Config(), null);
                    ClientImpl clientImpl4 = ClientImpl.this;
                    clientImpl4.mExternalAudioFrameObserver = null;
                    clientImpl4.rtcAudioCallback = null;
                    clientImpl4.rtcVideoCallback = null;
                    if (clientImpl4.isGuest()) {
                        ClientImpl.this.mInteractEngine.checkReleaseRtcEngine();
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_avframework_livestreamv2_core_interact_ClientImpl$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void enableRtcPhoneListener() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.21
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$21__run$___twin___() {
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                interactLogService.onEngineAPICall("enableRtcPhoneListener", X1D.LIZIZ(LIZ));
                ClientImpl.this.rtcEngineWrapper.enableRtcPhoneListener();
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.rtcEngineWrapper.setInteractLogServer(clientImpl.mLogService);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
                boolean LIZ;
                try {
                    anonymousClass21.com_ss_avframework_livestreamv2_core_interact_ClientImpl$21__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public List<Region> formRegionList() {
        ArrayList arrayList;
        synchronized (this.mGuestList) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.mInteractId);
            arrayList2.addAll(this.mGuestList);
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Region region = new Region();
                region.interactId(str);
                region.talking(getTalkingState(str));
                if (getRenderedStat(str) || str.equalsIgnoreCase(this.mInteractId)) {
                    arrayList.add(region);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public String getBusinessId() {
        RTCEngineWrapper rTCEngineWrapper = this.rtcEngineWrapper;
        if (rTCEngineWrapper != null && rTCEngineWrapper.getLiveRTCInfoMode() != null) {
            return this.rtcEngineWrapper.getLiveRTCInfoMode().getBusinessId();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public JSONObject getDebugInfo() {
        String str;
        JSONObject jSONObject = new JSONObject();
        Config config = getConfig();
        if (config != null) {
            try {
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (config.getMixStreamType() != Config.MixStreamType.NONE) {
                if (config.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
                    str = "server_mix";
                } else if (config.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) {
                    str = "client_mix";
                } else {
                    str = "rtc_client_mix";
                }
                jSONObject.put("MixStreamType", str);
                jSONObject.put("RtcDownResolution", getRtcDownResolution());
                jSONObject.put("PreviewResolution", this.mPreviewResolution);
                jSONObject.put("ClientAddition", (Object) null);
                return jSONObject;
            }
        }
        str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        jSONObject.put("MixStreamType", str);
        jSONObject.put("RtcDownResolution", getRtcDownResolution());
        jSONObject.put("PreviewResolution", this.mPreviewResolution);
        jSONObject.put("ClientAddition", (Object) null);
        return jSONObject;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public boolean getLocalAudioStreamMuteState() {
        RTCEngineWrapper rTCEngineWrapper = this.rtcEngineWrapper;
        if (rTCEngineWrapper != null) {
            return rTCEngineWrapper.isLocalAudioMute();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.avframework.livestreamv2.core.interact.Client.MixStreamParamInfo getMixStreamParamInfo() {
        /*
            r6 = this;
            com.ss.avframework.livestreamv2.core.interact.model.InteractConfig r0 = r6.mConfig
            r3 = 0
            if (r0 == 0) goto La4
            com.ss.avframework.livestreamv2.core.interact.model.Config$MixStreamConfig r0 = r0.getMixStreamConfig()
            if (r0 == 0) goto La4
            com.ss.avframework.livestreamv2.core.interact.model.InteractConfig r0 = r6.mConfig
            com.ss.avframework.livestreamv2.core.interact.model.Config$MixStreamConfig r5 = r0.getMixStreamConfig()
            com.ss.avframework.livestreamv2.core.interact.livertc.LiveRTCExtInfo r4 = r6.mRtcExtInfo
            boolean r0 = r6.isClientMix()
            if (r0 == 0) goto La0
            com.ss.avframework.livestreamv2.core.interact.model.Config$MixStreamType r2 = com.ss.avframework.livestreamv2.core.interact.model.Config.MixStreamType.CLIENT_MIX
        L1b:
            if (r5 == 0) goto La4
            if (r4 == 0) goto La4
            com.ss.avframework.livestreamv2.core.interact.Client$MixStreamParamInfo$Builder r1 = new com.ss.avframework.livestreamv2.core.interact.Client$MixStreamParamInfo$Builder
            r1.<init>()
            int r0 = r5.getVideoWidth()
            r1.setMixVideoWidth(r0)
            int r0 = r5.getVideoHeight()
            r1.setMixVideoHeight(r0)
            int r0 = r5.getVideoBitrate()
            r1.setMixVideoBitrate(r0)
            int r0 = r5.getVideoFrameRate()
            r1.setMixVideoFps(r0)
            com.ss.avframework.livestreamv2.core.interact.model.Config$VideoProfile r0 = r5.getVideoProfile()
            r1.setMixVideoProfile(r0)
            com.ss.avframework.livestreamv2.core.interact.model.Config$VideoCodec r0 = r5.getVideoCodec()
            r1.setMixVideoCodec(r0)
            float r0 = r5.getVideoGop()
            r1.setMixVideoGop(r0)
            int r0 = r5.getAudioBitrate()
            r1.setMixAudioBitrate(r0)
            int r0 = r5.getAudioChannels()
            r1.setMixAudioChannel(r0)
            int r0 = r5.getAudioSampleRateValue()
            r1.setMixAudioSampleRate(r0)
            java.lang.Boolean r0 = r5.getVideoSupportBFrame()
            boolean r0 = r0.booleanValue()
            r1.setEnableBFrame(r0)
            java.lang.String r0 = r5.getStreamUrl()
            r1.setPublishUrl(r0)
            java.lang.String r0 = r4.interactId
            r1.setUserId(r0)
            java.lang.String r0 = r4.channelId
            r1.setRoomId(r0)
            java.lang.String r0 = r4.mixStreamTaskId
            r1.setTaskId(r0)
            r1.setMixType(r2)
            com.ss.avframework.livestreamv2.core.interact.Client$MixStreamParamInfo r2 = r1.build()
        L92:
            com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService r1 = r6.mLogService
            if (r2 == 0) goto L9a
            java.lang.String r3 = r2.toString()
        L9a:
            java.lang.String r0 = "getMixStreamParamInfo"
            r1.onEngineAPICall(r0, r3)
            return r2
        La0:
            com.ss.avframework.livestreamv2.core.interact.model.Config$MixStreamType r2 = com.ss.avframework.livestreamv2.core.interact.model.Config.MixStreamType.SERVER_MIX
            goto L1b
        La4:
            r2 = r3
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.ClientImpl.getMixStreamParamInfo():com.ss.avframework.livestreamv2.core.interact.Client$MixStreamParamInfo");
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public JSONArray getRemoteVideoFrozenInfo() {
        if (this.mInteractStatics == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<String, List<RemoteUserStatistics.VideoFrozenInfo>> entry : this.mInteractStatics.getRemoteVideoFrozenInfo().entrySet()) {
                JSONArray jSONArray2 = new JSONArray();
                for (RemoteUserStatistics.VideoFrozenInfo videoFrozenInfo : entry.getValue()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", videoFrozenInfo.getDurationMSec());
                    jSONObject.put("reason", videoFrozenInfo.getReason());
                    jSONArray2.put(jSONObject);
                }
                jSONArray.put(jSONArray2);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public RTCVideo getRtcEngine() {
        RTCEngineWrapper rTCEngineWrapper = this.rtcEngineWrapper;
        if (rTCEngineWrapper != null) {
            return rTCEngineWrapper.getRtcEngine();
        }
        return null;
    }

    public VideoEncoderConfig getRtcVideoResolution() {
        RTCEngineWrapper rTCEngineWrapper = this.rtcEngineWrapper;
        if (rTCEngineWrapper != null) {
            return rTCEngineWrapper.getLiveRTCInfoMode().getRtcVideoResolution();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public JSONArray getVideoE2EDelayMSec() {
        if (this.mInteractStatics == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<Map.Entry<String, Integer>> it = this.mInteractStatics.getVideoE2EDelayMSec().entrySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getValue());
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public boolean isClientMix() {
        InteractConfig interactConfig = this.mConfig;
        if (interactConfig != null) {
            return interactConfig.isClientMix();
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public boolean isGuest() {
        if (this.mConfig.getCharacter() == Config.Character.GUEST) {
            return true;
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void joinChannel() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$2__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("joinChannel()");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,TimeStamp:");
                LIZ2.append(System.currentTimeMillis());
                interactLogService.onEngineAPICall("joinChannel", X1D.LIZIZ(LIZ2));
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mClientStarted) {
                    AVLog.iow("ClientImpl", "client already started, joinChannel again, why?");
                    return;
                }
                clientImpl.mClientStarted = true;
                clientImpl.mSeiCleared = false;
                InteractEngineImpl interactEngineImpl = clientImpl.mInteractEngine;
                if (interactEngineImpl != null) {
                    interactEngineImpl.joinChannel();
                }
                ClientImpl.this.mLogService.onCallJoinChannel();
                ClientImpl.this.joinChannelInternal();
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_avframework_livestreamv2_core_interact_ClientImpl$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void onServerMixSuccess() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$6__run$___twin___() {
                InteractEngineImpl interactEngineImpl = ClientImpl.this.mInteractEngine;
                if (interactEngineImpl != null) {
                    interactEngineImpl.removeStopStreamTimeoutTask();
                    LiveCore liveCore = ClientImpl.this.mInteractEngine.getBuilder().getLiveCore();
                    if (liveCore != null) {
                        liveCore.stop();
                        AudioDeviceModule adm = liveCore.getADM();
                        if (adm != null) {
                            adm.enableAudioPushStream(false);
                        }
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_avframework_livestreamv2_core_interact_ClientImpl$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void pause() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.7
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$7__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("pause ");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,TimeStamp:");
                LIZ2.append(System.currentTimeMillis());
                interactLogService.onEngineAPICall("pause", X1D.LIZIZ(LIZ2));
                ClientImpl.this.mIsResume = false;
                AVLog.debugTrace(new Object[0]);
                if (!ClientImpl.this.mConfig.isEnableAudioOnBackground()) {
                    ClientImpl.this.enableLocalAudio(false, "location: pause");
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_ss_avframework_livestreamv2_core_interact_ClientImpl$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void pauseForwardStreamToAllRooms() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.57
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$57_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$57__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mRtcRoom != null) {
                    clientImpl.mLogService.onEngineAPICall("pauseForwardStreamToAllRooms", "");
                    ClientImpl.this.mRtcRoom.pauseForwardStreamToAllRooms();
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$57_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass57 anonymousClass57) {
                boolean LIZ;
                try {
                    anonymousClass57.com_ss_avframework_livestreamv2_core_interact_ClientImpl$57__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int removeAllWaterMarks() {
        this.mLogService.onEngineAPICall("removeAllWaterMarks", "");
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.63
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$63_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$63__run$___twin___() {
                Map<String, Client.RTCWaterMarkRegion> map = ClientImpl.this.mWaterMarkRegions;
                if (map != null) {
                    map.clear();
                    ClientImpl.this.updateMixStream(true, true);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$63_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass63 anonymousClass63) {
                boolean LIZ;
                try {
                    anonymousClass63.com_ss_avframework_livestreamv2_core_interact_ClientImpl$63__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    public void resetRtcClientMixVideoTrack() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$5__run$___twin___() {
                if (ClientImpl.this.mConfig.getCharacter() != Config.Character.ANCHOR || ClientImpl.this.mConfig.getMixStreamType() == Config.MixStreamType.NONE || ClientImpl.this.mConfig.getStreamMixer() == null) {
                    return;
                }
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mStreamMixManager == null || clientImpl.mConfig.getMixStreamType() != Config.MixStreamType.RTC_CLIENT_MIX || !ClientImpl.this.mStreamMixManager.getMixStartState()) {
                    return;
                }
                AVLog.iow("ClientImpl", "resetRtcClientMixVideoTrack!");
                ClientImpl.this.mStreamMixManager.resetRtcClientMixVideoTrack();
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_avframework_livestreamv2_core_interact_ClientImpl$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void restartServerMix() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.51
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$51__run$___twin___() {
                AVLog.ioi("ClientImpl", "restartServerMix");
                ClientImpl.this.mLogService.onEngineAPICall("sendSdkControlMsg", "restartServerMix");
                if (ClientImpl.this.mConfig.getCharacter() != Config.Character.ANCHOR || ClientImpl.this.mConfig.getMixStreamType() == Config.MixStreamType.NONE || ClientImpl.this.mConfig.getStreamMixer() == null || ClientImpl.this.mConfig.isClientMix()) {
                    return;
                }
                ClientImpl.this.mStreamMixManager.updateServerMixParam();
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass51 anonymousClass51) {
                boolean LIZ;
                try {
                    anonymousClass51.com_ss_avframework_livestreamv2_core_interact_ClientImpl$51__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void resume() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$8__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" resume ");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,TimeStamp:");
                LIZ2.append(System.currentTimeMillis());
                interactLogService.onEngineAPICall("resume", X1D.LIZIZ(LIZ2));
                ClientImpl.this.mIsResume = true;
                AVLog.debugTrace(new Object[0]);
                if (!ClientImpl.this.mConfig.isEnableAudioOnBackground()) {
                    ClientImpl.this.enableLocalAudio(true, "location: resume");
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_avframework_livestreamv2_core_interact_ClientImpl$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void resumeForwardStreamToAllRooms() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.58
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$58_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$58__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mRtcRoom != null) {
                    clientImpl.mLogService.onEngineAPICall("resumeForwardStreamToAllRooms", "");
                    ClientImpl.this.mRtcRoom.resumeForwardStreamToAllRooms();
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$58_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass58 anonymousClass58) {
                boolean LIZ;
                try {
                    anonymousClass58.com_ss_avframework_livestreamv2_core_interact_ClientImpl$58__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void start() {
        InteractThreadUtils.postWorkTask(new PrivacyCertManager.RunnableWithCert(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$1__run$___twin___() {
                boolean z;
                boolean z2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start()");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,TimeStamp:");
                LIZ2.append(System.currentTimeMillis());
                interactLogService.onEngineAPICall("start", X1D.LIZIZ(LIZ2));
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mClientStarted) {
                    AVLog.iow("ClientImpl", "client already started start again, why?");
                    return;
                }
                clientImpl.mClientStarted = true;
                clientImpl.mInteractStatics.setInteractStartTime();
                ClientImpl clientImpl2 = ClientImpl.this;
                clientImpl2.mSeiCleared = false;
                clientImpl2.checkAudioCaptureCert();
                ClientImpl.this.mLogService.onCallJoinChannel();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("optimize open: ");
                LIZ3.append(ClientImpl.this.mVPassInteractCfg.enablePushStreamSwitchAfterServerMixStream);
                LIZ3.append(" mixStreamType: ");
                Config.MixStreamType mixStreamType = ClientImpl.this.mBuilder.getMixStreamType();
                Config.MixStreamType mixStreamType2 = Config.MixStreamType.SERVER_MIX;
                if (mixStreamType == mixStreamType2) {
                    z = true;
                } else {
                    z = false;
                }
                LIZ3.append(z);
                LIZ3.append(" isAnchor: ");
                Config.Character character = ClientImpl.this.mConfig.getCharacter();
                Config.Character character2 = Config.Character.ANCHOR;
                if (character == character2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LIZ3.append(z2);
                AVLog.iod("ClientImpl", X1D.LIZIZ(LIZ3));
                ClientImpl clientImpl3 = ClientImpl.this;
                if (clientImpl3.mVPassInteractCfg.enablePushStreamSwitchAfterServerMixStream && clientImpl3.mBuilder.getMixStreamType() == mixStreamType2 && ClientImpl.this.mConfig.getCharacter() == character2) {
                    AVLog.iod("ClientImpl", "start interact with optimize");
                    ClientImpl.this.mTaskOnStreamPublished = new PrivacyCertManager.RunnableWithCert(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_avframework_livestreamv2_core_interact_ClientImpl$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$1$1__run$___twin___() {
                            ClientImpl clientImpl4 = ClientImpl.this;
                            clientImpl4.mInteractEngine.start(clientImpl4);
                        }

                        public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00331 runnableC00331) {
                            boolean LIZ4;
                            try {
                                runnableC00331.com_ss_avframework_livestreamv2_core_interact_ClientImpl$1$1__run$___twin___();
                            } finally {
                                if (LIZ4) {
                                }
                            }
                        }
                    }, new int[]{1});
                    ClientImpl clientImpl4 = ClientImpl.this;
                    clientImpl4.mStreamMixManager.setStreamPublishedTask(clientImpl4.mTaskOnStreamPublished);
                    ClientImpl.this.startInternal();
                    return;
                }
                AVLog.iod("ClientImpl", "start interact without optimize");
                ClientImpl clientImpl5 = ClientImpl.this;
                clientImpl5.mInteractEngine.start(clientImpl5);
                ClientImpl.this.startInternal();
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_avframework_livestreamv2_core_interact_ClientImpl$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, new int[]{1}));
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void startInteract() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$4__run$___twin___() {
                InteractEngineBuilder interactEngineBuilder;
                LiveCore liveCore;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startInteract()");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,TimeStamp:");
                LIZ2.append(System.currentTimeMillis());
                interactLogService.onEngineAPICall("startInteract", X1D.LIZIZ(LIZ2));
                ClientImpl clientImpl = ClientImpl.this;
                if (!clientImpl.mClientStarted) {
                    AVLog.iow("ClientImpl", "client not joinChannel before startInteract!");
                    return;
                }
                VPassInteractCfg vPassInteractCfg = clientImpl.mVPassInteractCfg;
                if (vPassInteractCfg != null && vPassInteractCfg.disableSpatialAudioWhenPlayBGM && (interactEngineBuilder = clientImpl.mBuilder) != null && (liveCore = interactEngineBuilder.getLiveCore()) != null && liveCore.getAudioFilterMgr() != null) {
                    liveCore.getAudioFilterMgr().setBgmStatusCallback(ClientImpl.this);
                }
                ClientImpl clientImpl2 = ClientImpl.this;
                clientImpl2.mStartInteractCalled = true;
                clientImpl2.mInteractStatics.setInteractStartTime();
                ClientImpl.this.checkAudioCaptureCert();
                ClientImpl clientImpl3 = ClientImpl.this;
                clientImpl3.mInteractEngine.startInteract(clientImpl3);
                ClientImpl clientImpl4 = ClientImpl.this;
                if (clientImpl4.mVPassInteractCfg.interactDelayStopStream == 0) {
                    clientImpl4.mStreamMixManager.configMixTranscoding();
                } else {
                    clientImpl4.tryStartMixTranscoding();
                }
                ClientImpl.this.mLogService.onPublishStream(0);
                ClientImpl clientImpl5 = ClientImpl.this;
                Client.InteractEventListener interactEventListener = clientImpl5.mEventListener;
                if (interactEventListener != null) {
                    interactEventListener.onInteractStart(clientImpl5);
                }
                ClientImpl.this.invalidateSei();
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_avframework_livestreamv2_core_interact_ClientImpl$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void startPushData() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$3__run$___twin___() {
                boolean z;
                LiveCore liveCore;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startPushData()");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,TimeStamp:");
                LIZ2.append(System.currentTimeMillis());
                interactLogService.onEngineAPICall("startPushData", X1D.LIZIZ(LIZ2));
                ClientImpl clientImpl = ClientImpl.this;
                if (!clientImpl.mClientStarted) {
                    AVLog.iow("ClientImpl", "client not joinChannel before startPushData!");
                    return;
                }
                if (clientImpl.needPublishFrame) {
                    AVLog.iow("ClientImpl", "client already push data, need not call again");
                    return;
                }
                if (clientImpl.mConfig.getCharacter() != Config.Character.ANCHOR) {
                    ClientImpl clientImpl2 = ClientImpl.this;
                    if (clientImpl2.mVPassInteractCfg.enableGuestAudioPipelineOpt && (liveCore = clientImpl2.mBuilder.getLiveCore()) != null && liveCore.getADM() != null) {
                        AVLog.logKibana(5, "ClientImpl", "guest enableAudioPushStreamForLive false", null);
                        liveCore.getADM().disableAudioStreamForLive();
                    }
                }
                ClientImpl clientImpl3 = ClientImpl.this;
                clientImpl3.mInteractEngine.startPushData(clientImpl3);
                if (ClientImpl.this.mConfig.isEnableAudioOnStart() && ClientImpl.this.mIsResume) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("LiveRtcEngine.enableLocalAudio(");
                LIZ3.append(z);
                LIZ3.append(")");
                AVLog.iow("ClientImpl", X1D.LIZIZ(LIZ3));
                ClientImpl.this.enableLocalAudio(z, "location: startPushData");
                ClientImpl.this.needPublishFrame = true;
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_avframework_livestreamv2_core_interact_ClientImpl$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void stop() {
        InteractThreadUtils.postWorkTask(new AnonymousClass9());
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int stopChorus() {
        this.mLogService.onEngineAPICall("stopChorus", "");
        if (this.mRtcEngine != null) {
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.71
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$71_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$71__run$___twin___() {
                    ClientImpl.this.mConfig.setChorusCharacter(Config.ChorusCharacter.NO_USE);
                    ClientImpl clientImpl = ClientImpl.this;
                    clientImpl.mIsNeedCopyFrame = false;
                    clientImpl.updateMixStream(true, true);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$71_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass71 anonymousClass71) {
                    boolean LIZ;
                    try {
                        anonymousClass71.com_ss_avframework_livestreamv2_core_interact_ClientImpl$71__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return 0;
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void stopForwardStreamToRooms() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.55
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$55_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$55__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mRtcRoom != null) {
                    clientImpl.mLogService.onEngineAPICall("stopForwardStreamToRooms", "");
                    ClientImpl.this.mRtcRoom.stopForwardStreamToRooms();
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$55_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass55 anonymousClass55) {
                boolean LIZ;
                try {
                    anonymousClass55.com_ss_avframework_livestreamv2_core_interact_ClientImpl$55__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void stopLiveCore() {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.10
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$10__run$___twin___() {
                LiveCore liveCore = ClientImpl.this.mInteractEngine.getBuilder().getLiveCore();
                if (liveCore != null) {
                    liveCore.stop();
                    AudioDeviceModule adm = liveCore.getADM();
                    if (adm != null) {
                        adm.enableAudioPushStream(false);
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_avframework_livestreamv2_core_interact_ClientImpl$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void stopLogReport() {
        LogReportRunnable logReportRunnable = this.mLogReportRunnable;
        if (logReportRunnable != null) {
            logReportRunnable.stop();
        }
        this.mLogReportRunnable = null;
    }

    public void tryStartMixTranscoding() {
        StreamMixManager streamMixManager;
        if (this.mStartInteractCalled && this.mVideoFrameSent && (streamMixManager = this.mStreamMixManager) != null) {
            streamMixManager.configMixTranscoding();
        }
    }

    public boolean checkAudioCaptureCert() {
        PrivacyCertManager.CertUnit popCert = PrivacyCertManager.getInstance().popCert(1);
        if (popCert == null) {
            return true;
        }
        try {
            popCert.check();
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Method \"");
            AVLog.logToIODevice(6, "ClientImpl", JBR.LJFF(LIZ, popCert.methodName, "\" check audio cert failed.", LIZ), e);
            return false;
        }
    }

    public void notifyAdjustResolution() {
        if (getConfig().getCharacter() == Config.Character.ANCHOR && getConfig().getInteractMode() == Config.InteractMode.PK && isClientMix() && this.mEventListener != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyAdjustResolution in pk mode.client:");
            LIZ.append(this);
            AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
            VideoEncoderConfig rtcVideoResolution = getRtcVideoResolution();
            Client.InteractEventListener interactEventListener = this.mEventListener;
            if (interactEventListener != null) {
                interactEventListener.notifyLiveStreamAdjustResolution(this, false, rtcVideoResolution.width, rtcVideoResolution.height);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public Config getConfig() {
        return this.mConfig;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public boolean getLocalVideoStreamMuteState() {
        return this.mMuteLocalVideoStreamStat;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public RTCEngineWrapper getRtcEngineWrapper() {
        return this.rtcEngineWrapper;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public RTCRoom getRtcRoom() {
        return this.mRtcRoom;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRoomEventHandler;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public String getRtcRoomId() {
        return this.mRoomId;
    }

    public VideoSinkFactory getmVideoSinkFactory() {
        return this.mVideoSinkFactory;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public boolean isNeedPublishFrame() {
        return this.needPublishFrame;
    }

    public boolean isServerMixStreamPublishedReceived() {
        return this.mServerMixStreamPublishedReceived;
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientImpl$40, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass40 implements Client.Listener {
        public AnonymousClass40() {
        }

        @Override // com.ss.avframework.livestreamv2.core.interact.Client.Listener
        public void onError(final Client client, final int i, final long j, final Exception exc) {
            Handler workThreadHandler = InteractThreadUtils.getWorkThreadHandler();
            if (workThreadHandler != null && workThreadHandler.getLooper().getThread() != C16880lQ.LLLLIIIILLL()) {
                workThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.40.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$2__run$___twin___() {
                        AnonymousClass40.this.onError(client, i, j, exc);
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return;
            }
            AVLog.debugTrace(Integer.valueOf(i), Long.valueOf(j), exc.toString());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("code2: ");
            LIZ.append(j);
            LIZ.append(". Message: ");
            LIZ.append(exc.getMessage());
            LIZ.append(". Stack: ");
            LIZ.append(Log.getStackTraceString(exc));
            String LIZIZ = X1D.LIZIZ(LIZ);
            InteractLogService interactLogService = ClientImpl.this.mLogService;
            if (interactLogService != null) {
                interactLogService.onErrorOccurs((int) j, LIZIZ);
            }
            Client.Listener listener = ClientImpl.this.mInteractListener;
            if (listener != null) {
                listener.onError(client, i, j, exc);
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.interact.Client.Listener
        public void onInfo(final Client client, final int i, final long j, final Object... objArr) {
            Handler workThreadHandler = InteractThreadUtils.getWorkThreadHandler();
            if (workThreadHandler != null && workThreadHandler.getLooper().getThread() != C16880lQ.LLLLIIIILLL()) {
                workThreadHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.40.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$1__run$___twin___() {
                        AnonymousClass40.this.onInfo(client, i, j, objArr);
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_avframework_livestreamv2_core_interact_ClientImpl$40$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return;
            }
            Client.Listener listener = ClientImpl.this.mInteractListener;
            if (listener != null) {
                listener.onInfo(client, i, j, objArr);
            }
        }
    }

    private boolean checkWaterMarkRegionValid(Client.RTCWaterMarkRegion rTCWaterMarkRegion) {
        if (rTCWaterMarkRegion == null || rTCWaterMarkRegion.getX() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || rTCWaterMarkRegion.getX() > 1.0d || rTCWaterMarkRegion.getY() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || rTCWaterMarkRegion.getY() > 1.0d || rTCWaterMarkRegion.getW() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || rTCWaterMarkRegion.getW() > 1.0d || rTCWaterMarkRegion.getH() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || rTCWaterMarkRegion.getH() > 1.0d || rTCWaterMarkRegion.getAlpha() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || rTCWaterMarkRegion.getAlpha() > 1.0d || rTCWaterMarkRegion.getZorder() < 0 || rTCWaterMarkRegion.getZorder() > 100) {
            return false;
        }
        if (rTCWaterMarkRegion.getImage() != null && rTCWaterMarkRegion.getImage().getConfig() != Bitmap.Config.ARGB_8888) {
            return false;
        }
        return true;
    }

    private PublicStreaming getPublicStreaming(String str) {
        double d;
        PublicStreaming defualtPublicStreaming = PublicStreaming.getDefualtPublicStreaming();
        List<Region> formRegionList = formRegionList();
        PublicStreaming.Layout.Builder builder = new PublicStreaming.Layout.Builder();
        PublicStreaming.Layout.Region region = new PublicStreaming.Layout.Region();
        for (Region region2 : formRegionList) {
            region.position(region2.getX(), region2.getY());
            region.size(region2.getWidth(), region2.getHeight());
            region.zorder(region2.getZorder());
            if (region2.isMuteVideo()) {
                d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            } else {
                d = 1.0d;
            }
            region.alpha(d);
            builder.addRegoin(region);
        }
        defualtPublicStreaming.setLayout(builder.build());
        return defualtPublicStreaming;
    }

    private boolean getRenderedStat(String str) {
        if (!this.mVideoSinkMap.containsKey(str) || this.mConfig.getInteractMode() != Config.InteractMode.PK) {
            return true;
        }
        VideoSinkWrapper videoSinkWrapper = this.mVideoSinkMap.get(str);
        if (videoSinkWrapper != null && videoSinkWrapper.hasRenderFirstFrame()) {
            return true;
        }
        return false;
    }

    private void resetRtcEngine(RTCVideo rTCVideo) {
        if (rTCVideo != null) {
            if (this.rtcEngineWrapper != null) {
                InteractLogService interactLogService = this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("muteState:");
                MuteState muteState = MuteState.MUTE_STATE_OFF;
                LIZ.append(muteState);
                interactLogService.onRTCEngineMediaAPICall("muteAllRemoteAudio", X1D.LIZIZ(LIZ), "location:resetRtcEngine");
                this.rtcEngineWrapper.muteAllRemoteAudio(muteState);
            }
            this.mLogService.onRTCEngineMediaAPICall("resumeAllSubscribedStream", "mediaType:video", "location:resetRtcEngine");
            rTCVideo.enableAudioPropertiesReport(new AudioPropertiesConfig(0));
            RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
            if (rTCRoomImpl != null) {
                rTCRoomImpl.resumeAllSubscribedStream(PauseResumeControlMediaType.VIDEO);
                this.mRtcRoom.setUserVisibility(true);
            }
        }
    }

    private void updateLiveRxtInfo(String str) {
        if (str != null && !"".equals(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("live_core_ext_info");
                if (optJSONObject != null) {
                    this.mBuilder.getLiveCore().updateSdkParams(optJSONObject.toString());
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateLiveRxtInfo happen exception:");
                LIZ.append(e.toString());
                AVLog.iow("ClientImpl", X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void enableAllRemoteRender(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.32
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$32__run$___twin___() {
                ClientImpl.this.enableAllRemoteRender(z, true);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass32 anonymousClass32) {
                boolean LIZ;
                try {
                    anonymousClass32.com_ss_avframework_livestreamv2_core_interact_ClientImpl$32__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void enableSpatialAudioRender(final boolean z) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable: ");
        LIZ.append(z);
        interactLogService.onEngineAPICall("enableSpatialAudioRender", X1D.LIZIZ(LIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.65
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$65_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$65__run$___twin___() {
                RTCRoomImpl rTCRoomImpl = ClientImpl.this.mRtcRoom;
                if (rTCRoomImpl != null) {
                    rTCRoomImpl.getSpatialAudio().enableSpatialAudio(z);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$65_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass65 anonymousClass65) {
                boolean LIZ2;
                try {
                    anonymousClass65.com_ss_avframework_livestreamv2_core_interact_ClientImpl$65__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void enableVideoBFrameOnMixStream(boolean z) {
        InteractConfig interactConfig = this.mConfig;
        if (interactConfig != null) {
            interactConfig.enableVideoBFrameOnMixStream(z);
        }
    }

    public boolean getTalkingState(String str) {
        if (this.mTalkingStates.containsKey(str)) {
            return this.mTalkingStates.get(str).booleanValue();
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void muteAllRemoteAudioStreams(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.17
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$17__run$___twin___() {
                MuteState muteState;
                AVLog.debugTrace(Boolean.valueOf(z));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", mute ");
                LIZ.append(z);
                interactLogService.onEngineAPICall("muteAllRemoteAudioStreams", X1D.LIZIZ(LIZ));
                RTCEngineWrapper rTCEngineWrapper = ClientImpl.this.rtcEngineWrapper;
                if (rTCEngineWrapper != null) {
                    if (z) {
                        muteState = MuteState.MUTE_STATE_ON;
                    } else {
                        muteState = MuteState.MUTE_STATE_OFF;
                    }
                    rTCEngineWrapper.muteAllRemoteAudio(muteState);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                boolean LIZ;
                try {
                    anonymousClass17.com_ss_avframework_livestreamv2_core_interact_ClientImpl$17__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void muteAllRemoteVideoStreams(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.18
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$18__run$___twin___() {
                AVLog.debugTrace(Boolean.valueOf(z));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", mute ");
                LIZ.append(z);
                interactLogService.onEngineAPICall("muteAllRemoteVideoStreams", X1D.LIZIZ(LIZ));
                if (z) {
                    ClientImpl.this.mRtcRoom.pauseAllSubscribedStream(PauseResumeControlMediaType.VIDEO);
                } else {
                    ClientImpl.this.mRtcRoom.resumeAllSubscribedStream(PauseResumeControlMediaType.VIDEO);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                boolean LIZ;
                try {
                    anonymousClass18.com_ss_avframework_livestreamv2_core_interact_ClientImpl$18__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void muteLocalAudio(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.16
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$16__run$___twin___() {
                MuteState muteState;
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mute ");
                LIZ.append(z);
                interactLogService.onEngineAPICall("muteLocalAudioStream", X1D.LIZIZ(LIZ));
                RTCEngineWrapper rTCEngineWrapper = ClientImpl.this.rtcEngineWrapper;
                if (rTCEngineWrapper != null) {
                    if (z) {
                        muteState = MuteState.MUTE_STATE_ON;
                    } else {
                        muteState = MuteState.MUTE_STATE_OFF;
                    }
                    rTCEngineWrapper.muteLocalAudio(muteState);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                boolean LIZ;
                try {
                    anonymousClass16.com_ss_avframework_livestreamv2_core_interact_ClientImpl$16__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void muteLocalVideo(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.15
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$15__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mMuteLocalVideoStreamStat = z;
                InteractLogService interactLogService = clientImpl.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mute ");
                LIZ.append(z);
                interactLogService.onEngineAPICall("muteLocalVideoStream", X1D.LIZIZ(LIZ));
                if (z) {
                    ClientImpl.this.mRtcRoom.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                } else {
                    ClientImpl.this.mRtcRoom.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                boolean LIZ;
                try {
                    anonymousClass15.com_ss_avframework_livestreamv2_core_interact_ClientImpl$15__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager.IBgmPlayingStatusCallback
    public void onPlayingStatusChange(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.47
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$47__run$___twin___() {
                StreamMixManager streamMixManager = ClientImpl.this.mStreamMixManager;
                if (streamMixManager != null) {
                    streamMixManager.updateBgmPlayingStatus(z);
                }
                ClientImpl.this.updateMixStream(false, false);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass47 anonymousClass47) {
                boolean LIZ;
                try {
                    anonymousClass47.com_ss_avframework_livestreamv2_core_interact_ClientImpl$47__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int removeWaterMarkWithId(final String str) {
        if (str == null || str.isEmpty()) {
            AVLog.ioe("ClientImpl", "removeWaterMarkWithId region param error, waterMarkId invalid");
            return -1;
        }
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("waterMarkId: ");
        LIZ.append(str);
        interactLogService.onEngineAPICall("removeWaterMarkWithId", X1D.LIZIZ(LIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.61
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$61_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$61__run$___twin___() {
                Map<String, Client.RTCWaterMarkRegion> map = ClientImpl.this.mWaterMarkRegions;
                if (map != null && map.containsKey(str)) {
                    ClientImpl.this.mWaterMarkRegions.remove(str);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$61_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass61 anonymousClass61) {
                boolean LIZ2;
                try {
                    anonymousClass61.com_ss_avframework_livestreamv2_core_interact_ClientImpl$61__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public long sendRoomMessage(final String str) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.25
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$25__run$___twin___() {
                AVLog.debugTrace(str);
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", message ");
                LIZ.append(str);
                interactLogService.onEngineAPICall("sendRoomMessage", X1D.LIZIZ(LIZ));
                ClientImpl.this.mRtcRoom.sendRoomMessage(str);
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass25 anonymousClass25) {
                boolean LIZ;
                try {
                    anonymousClass25.com_ss_avframework_livestreamv2_core_interact_ClientImpl$25__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0L;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void sendSdkControlMsg(final String str) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.31
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$31__run$___twin___() {
                AVLog.debugTrace(str);
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("issueJson: ");
                LIZ.append(str);
                interactLogService.onEngineAPICall("sendSdkControlMsg", X1D.LIZIZ(LIZ));
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.isNull("type") && "push".equals(JSONObjectProtectorUtils.getString(jSONObject, "type"))) {
                        ClientImpl.this.sendSdkControlMsgInternal(JSONObjectProtectorUtils.getString(jSONObject, "command"), new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "params")));
                    }
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("sendSdkControlMsg error:");
                    LIZ2.append(e);
                    AVLog.ioe("ClientImpl", X1D.LIZIZ(LIZ2));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass31 anonymousClass31) {
                boolean LIZ;
                try {
                    anonymousClass31.com_ss_avframework_livestreamv2_core_interact_ClientImpl$31__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setAudioScenario(final int i) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.13
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$13__run$___twin___() {
                AudioScenarioType audioScenarioType;
                int i2 = i;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                return;
                            } else {
                                audioScenarioType = AudioScenarioType.AUDIO_SCENARIO_MEDIA;
                            }
                        } else {
                            audioScenarioType = AudioScenarioType.AUDIO_SCENARIO_COMMUNICATION;
                        }
                    } else {
                        audioScenarioType = AudioScenarioType.AUDIO_SCENARIO_HIGHQUALITY_COMMUNICATION;
                    }
                } else {
                    audioScenarioType = AudioScenarioType.AUDIO_SCENARIO_MUSIC;
                }
                RTCVideo rTCVideo = ClientImpl.this.mRtcEngine;
                if (rTCVideo != null) {
                    rTCVideo.setAudioScenario(audioScenarioType);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_ss_avframework_livestreamv2_core_interact_ClientImpl$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setBusinessId(String str) {
        InteractConfig interactConfig = this.mConfig;
        if (interactConfig != null && !TextUtils.isEmpty(str)) {
            interactConfig.setBusinessId(str);
        }
        RTCVideo rTCVideo = this.mRtcEngine;
        if (rTCVideo != null) {
            rTCVideo.setBusinessId(str);
            InteractLogService interactLogService = this.mLogService;
            if (interactLogService != null) {
                if (str == null) {
                    str = "";
                }
                interactLogService.onEngineAPICall("setBusinessId", str);
            }
        }
    }

    public void setConfig(InteractConfig interactConfig) {
        this.mConfig = interactConfig;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setDirectRtcEventCallback(final IRTCEngineEventHandler iRTCEngineEventHandler) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.42
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$42_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$42__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                IRTCEngineEventHandler iRTCEngineEventHandler2 = iRTCEngineEventHandler;
                if (iRTCEngineEventHandler2 == null) {
                    iRTCEngineEventHandler2 = new IRTCEngineEventHandler() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.42.1
                    };
                }
                clientImpl.mRtcCallback = iRTCEngineEventHandler2;
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$42_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass42 anonymousClass42) {
                boolean LIZ;
                try {
                    anonymousClass42.com_ss_avframework_livestreamv2_core_interact_ClientImpl$42__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setInteractEventListener(final Client.InteractEventListener interactEventListener) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.46
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$46__run$___twin___() {
                ClientImpl.this.mEventListener = interactEventListener;
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass46 anonymousClass46) {
                boolean LIZ;
                try {
                    anonymousClass46.com_ss_avframework_livestreamv2_core_interact_ClientImpl$46__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setListener(final Client.Listener listener) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.41
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$41__run$___twin___() {
                AVLog.debugTrace(listener);
                ClientImpl.this.mInteractListener = listener;
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass41 anonymousClass41) {
                boolean LIZ;
                try {
                    anonymousClass41.com_ss_avframework_livestreamv2_core_interact_ClientImpl$41__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setLocalTimeGapWithServer(int i) {
        TimeUtils.setLocalTimeGapWithServer(i);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setOnlyConsumeAllRemoteSei(final boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setOnlyConsumeAllRemoteSei ");
        LIZ.append(this);
        AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(this);
        LIZ2.append("onlyConsumeSei");
        LIZ2.append(z);
        interactLogService.onEngineAPICall("setOnlyConsumeAllRemoteSei", X1D.LIZIZ(LIZ2));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.35
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$35__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mOnlyConsumeAllRemoteSei = z;
                for (VideoSinkWrapper videoSinkWrapper : clientImpl.mVideoSinkMap.values()) {
                    if (videoSinkWrapper != null) {
                        videoSinkWrapper.setOnlyNeedRemoteSei(z);
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass35 anonymousClass35) {
                boolean LIZ3;
                try {
                    anonymousClass35.com_ss_avframework_livestreamv2_core_interact_ClientImpl$35__run$___twin___();
                } finally {
                    if (LIZ3) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setPerformanceProfile(Client.PerformanceProfile performanceProfile) {
        int i = AnonymousClass72.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$Client$PerformanceProfile[performanceProfile.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                AVLog.iod("ClientImpl", "PerformanceProfile : PERFORMANCE_PROFILE_LOW");
                VideoEncoderConfig rtcProfileVideoResolution = this.rtcEngineWrapper.getLiveRTCInfoMode().getRtcProfileVideoResolution();
                if (rtcProfileVideoResolution == null) {
                    return;
                }
                int i2 = rtcProfileVideoResolution.width;
                int i3 = rtcProfileVideoResolution.height;
                this.mInteractEngine.setVideoCaptureResolution(i2, i3);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PerformanceProfile : PERFORMANCE_PROFILE_LOW: ");
                LIZ.append(i2);
                LIZ.append("X");
                LIZ.append(i3);
                AVLog.iod("ClientImpl", X1D.LIZIZ(LIZ));
                return;
            }
            VideoEncoderConfig rtcVideoResolution = this.rtcEngineWrapper.getLiveRTCInfoMode().getRtcVideoResolution();
            if (rtcVideoResolution == null) {
                return;
            }
            int i4 = rtcVideoResolution.width;
            int i5 = rtcVideoResolution.height;
            this.mInteractEngine.setVideoCaptureResolution(i4, i5);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PerformanceProfile : PERFORMANCE_PROFILE_MID: ");
            LIZ2.append(i4);
            LIZ2.append("X");
            LIZ2.append(i5);
            AVLog.iod("ClientImpl", X1D.LIZIZ(LIZ2));
            return;
        }
        AVLog.iod("ClientImpl", "PerformanceProfile : PERFORMANCE_PROFILE_HIGH: 720x1280");
        this.mInteractEngine.setVideoCaptureResolution(720, 1280);
    }

    public void setServerMixStreamPublishedReceived(boolean z) {
        this.mServerMixStreamPublishedReceived = z;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void start(Cert cert) {
        PrivacyCertManager.getInstance().saveCert(1, cert, "ClientImpl.start");
        start();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int startForwardStreamToRooms(List<Client.ForwardRoomInfo> list) {
        final ArrayList arrayList = new ArrayList(list);
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.54
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$54__run$___twin___() {
                String str;
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mRtcEngine != null && clientImpl.mClientStarted) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        str = "";
                        if (it.hasNext()) {
                            Client.ForwardRoomInfo forwardRoomInfo = (Client.ForwardRoomInfo) it.next();
                            if (forwardRoomInfo.rtcExtInfo != null) {
                                try {
                                    String optString = new JSONObject(forwardRoomInfo.rtcExtInfo).optJSONObject("live_rtc_engine_config").optString("rtc_token");
                                    if (optString != null) {
                                        str = optString;
                                    }
                                } catch (Exception e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                                ForwardStreamInfo forwardStreamInfo = new ForwardStreamInfo(forwardRoomInfo.roomId, str);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("room_id", forwardRoomInfo.roomId);
                                    jSONObject2.put("token", str);
                                    jSONArray.put(jSONObject2);
                                } catch (JSONException e2) {
                                    C16880lQ.LLLLIIL(e2);
                                }
                                arrayList2.add(forwardStreamInfo);
                            }
                        } else {
                            try {
                                break;
                            } catch (JSONException e3) {
                                C16880lQ.LLLLIIL(e3);
                            }
                        }
                    }
                    jSONObject.put("rooms_info", jSONArray);
                    str = jSONObject.toString();
                    ClientImpl.this.mLogService.onEngineAPICall("startForwardStreamToRooms", str);
                    int startForwardStreamToRooms = ClientImpl.this.mRtcRoom.startForwardStreamToRooms(arrayList2);
                    if (startForwardStreamToRooms < 0) {
                        String LIZIZ = C0NY.LIZIZ("error code: ", startForwardStreamToRooms, ". Message: startForwardStreamToRooms failed");
                        InteractLogService interactLogService = ClientImpl.this.mLogService;
                        if (interactLogService != null) {
                            interactLogService.onErrorOccurs(startForwardStreamToRooms, LIZIZ);
                        }
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass54 anonymousClass54) {
                boolean LIZ;
                try {
                    anonymousClass54.com_ss_avframework_livestreamv2_core_interact_ClientImpl$54__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void startInteract(Cert cert) {
        PrivacyCertManager.getInstance().saveCert(1, cert, "ClientImpl.startInteract");
        startInteract();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int startPlayPublicStream(String str) {
        RTCVideo rTCVideo = this.mRtcEngine;
        if (rTCVideo != null) {
            return rTCVideo.startPlayPublicStream(str);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void stop(Cert cert) {
        PrivacyCertManager.getInstance().saveCert(1, cert, "ClientImpl.stop");
        stop();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int stopPlayPublicStream(String str) {
        RTCVideo rTCVideo = this.mRtcEngine;
        if (rTCVideo != null) {
            return rTCVideo.stopPlayPublicStream(str);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int stopPushPublicStream(String str) {
        RTCVideo rTCVideo = this.mRtcEngine;
        if (rTCVideo != null) {
            return rTCVideo.stopPushPublicStream(str);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void switchAudio(final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.14
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$14__run$___twin___() {
                RTCEngineWrapper rTCEngineWrapper;
                MuteState muteState;
                AVLog.debugTrace(Boolean.valueOf(z));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", enable ");
                LIZ.append(z);
                interactLogService.onEngineAPICall("switchAudio", X1D.LIZIZ(LIZ));
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mRtcEngine != null && (rTCEngineWrapper = clientImpl.rtcEngineWrapper) != null) {
                    if (z) {
                        muteState = MuteState.MUTE_STATE_OFF;
                    } else {
                        muteState = MuteState.MUTE_STATE_ON;
                    }
                    rTCEngineWrapper.muteLocalAudio(muteState);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_ss_avframework_livestreamv2_core_interact_ClientImpl$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void switchInteractMode(final Config.InteractMode interactMode) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.27
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$27__run$___twin___() {
                ClientImpl.this.mConfig.setInteractMode(interactMode);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass27 anonymousClass27) {
                boolean LIZ;
                try {
                    anonymousClass27.com_ss_avframework_livestreamv2_core_interact_ClientImpl$27__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void switchMixType(final Config.MixStreamType mixStreamType) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.26
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$26__run$___twin___() {
                if (ClientImpl.this.mConfig.getCharacter() == Config.Character.ANCHOR) {
                    InteractLogService interactLogService = ClientImpl.this.mLogService;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("serverMode:");
                    LIZ.append(mixStreamType);
                    LIZ.append(", curMixMode:");
                    LIZ.append(ClientImpl.this.mConfig.getMixStreamType());
                    interactLogService.onEngineAPICall("switchMixType", X1D.LIZIZ(LIZ));
                    if (mixStreamType == ClientImpl.this.mConfig.getMixStreamType()) {
                        return;
                    }
                    boolean z = false;
                    if ((mixStreamType != Config.MixStreamType.CLIENT_MIX || ClientImpl.this.mConfig.getMixStreamType() != Config.MixStreamType.SERVER_MIX) && ClientImpl.this.mWaterMarkRegions.size() != 0) {
                        z = true;
                    }
                    ClientImpl.this.mInteractEngine.switchMixType(mixStreamType);
                    ClientImpl.this.mStreamMixManager.switchMixType(mixStreamType);
                    ClientImpl.this.updateMixStream(true, z);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass26 anonymousClass26) {
                boolean LIZ;
                try {
                    anonymousClass26.com_ss_avframework_livestreamv2_core_interact_ClientImpl$26__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void updateAudioScene(final String str) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(this);
        LIZ.append(", rtc.audio_scene_id ");
        LIZ.append(str);
        interactLogService.onEngineAPICall("updateSceneId", X1D.LIZIZ(LIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.28
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$28__run$___twin___() {
                if (ClientImpl.this.mRtcEngine != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("rtc.audio_scene_id", str);
                        ClientImpl.this.mRtcEngine.setRuntimeParameters(jSONObject);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass28 anonymousClass28) {
                boolean LIZ2;
                try {
                    anonymousClass28.com_ss_avframework_livestreamv2_core_interact_ClientImpl$28__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int updateForwardStreamToRooms(List<Client.ForwardRoomInfo> list) {
        final ArrayList arrayList = new ArrayList(list);
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.56
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$56_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$56__run$___twin___() {
                String str;
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mRtcEngine != null && clientImpl.mClientStarted) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        str = "";
                        if (it.hasNext()) {
                            Client.ForwardRoomInfo forwardRoomInfo = (Client.ForwardRoomInfo) it.next();
                            if (forwardRoomInfo.rtcExtInfo != null) {
                                try {
                                    String optString = new JSONObject(forwardRoomInfo.rtcExtInfo).optJSONObject("live_rtc_engine_config").optString("rtc_token");
                                    if (optString != null) {
                                        str = optString;
                                    }
                                } catch (Exception e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                                ForwardStreamInfo forwardStreamInfo = new ForwardStreamInfo(forwardRoomInfo.roomId, str);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("room_id", forwardRoomInfo.roomId);
                                    jSONObject2.put("token", str);
                                    jSONArray.put(jSONObject2);
                                } catch (JSONException e2) {
                                    C16880lQ.LLLLIIL(e2);
                                }
                                arrayList2.add(forwardStreamInfo);
                            }
                        } else {
                            try {
                                break;
                            } catch (JSONException e3) {
                                C16880lQ.LLLLIIL(e3);
                            }
                        }
                    }
                    jSONObject.put("rooms_info", jSONArray);
                    str = jSONObject.toString();
                    ClientImpl.this.mLogService.onEngineAPICall("updateForwardStreamToRooms", str);
                    int updateForwardStreamToRooms = ClientImpl.this.mRtcRoom.updateForwardStreamToRooms(arrayList2);
                    if (updateForwardStreamToRooms < 0) {
                        String LIZIZ = C0NY.LIZIZ("error code: ", updateForwardStreamToRooms, ". Message: updateForwardStreamToRooms failed");
                        InteractLogService interactLogService = ClientImpl.this.mLogService;
                        if (interactLogService != null) {
                            interactLogService.onErrorOccurs(updateForwardStreamToRooms, LIZIZ);
                        }
                    }
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$56_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass56 anonymousClass56) {
                boolean LIZ;
                try {
                    anonymousClass56.com_ss_avframework_livestreamv2_core_interact_ClientImpl$56__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int updateListenerSpatialAudioOrientation(final Client.RTCSpatialAudioHumanOrientation rTCSpatialAudioHumanOrientation) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForwardX: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.forward.x);
        LIZ.append(", ForwardY: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.forward.y);
        LIZ.append(", ForwardZ: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.forward.z);
        LIZ.append("RignhtX: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.right.x);
        LIZ.append(", RignhtY: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.right.y);
        LIZ.append(", RignhtZ: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.right.z);
        LIZ.append("UpX: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.up.x);
        LIZ.append(", UpY: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.up.y);
        LIZ.append(", UpZ: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.up.z);
        interactLogService.onEngineAPICall("updateListenerSpatialAudioOrientation", X1D.LIZIZ(LIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.69
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$69_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$69__run$___twin___() {
                RTCRoomImpl rTCRoomImpl = ClientImpl.this.mRtcRoom;
                if (rTCRoomImpl != null) {
                    ISpatialAudio spatialAudio = rTCRoomImpl.getSpatialAudio();
                    Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation = rTCSpatialAudioHumanOrientation.forward;
                    Orientation orientation = new Orientation(rTCSpatialAudioOrientation.x, rTCSpatialAudioOrientation.y, rTCSpatialAudioOrientation.z);
                    Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation2 = rTCSpatialAudioHumanOrientation.right;
                    Orientation orientation2 = new Orientation(rTCSpatialAudioOrientation2.x, rTCSpatialAudioOrientation2.y, rTCSpatialAudioOrientation2.z);
                    Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation3 = rTCSpatialAudioHumanOrientation.up;
                    spatialAudio.updateListenerOrientation(new HumanOrientation(orientation, orientation2, new Orientation(rTCSpatialAudioOrientation3.x, rTCSpatialAudioOrientation3.y, rTCSpatialAudioOrientation3.z)));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$69_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass69 anonymousClass69) {
                boolean LIZ2;
                try {
                    anonymousClass69.com_ss_avframework_livestreamv2_core_interact_ClientImpl$69__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int updateListenerSpatialAudioPosition(final Client.RTCSpatialAudioPosition rTCSpatialAudioPosition) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("posX: ");
        LIZ.append(rTCSpatialAudioPosition.x);
        LIZ.append(", posY: ");
        LIZ.append(rTCSpatialAudioPosition.y);
        LIZ.append(", posZ: ");
        LIZ.append(rTCSpatialAudioPosition.z);
        interactLogService.onEngineAPICall("updateListenerSpatialAudioPosition", X1D.LIZIZ(LIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.68
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$68_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$68__run$___twin___() {
                RTCRoomImpl rTCRoomImpl = ClientImpl.this.mRtcRoom;
                if (rTCRoomImpl != null) {
                    ISpatialAudio spatialAudio = rTCRoomImpl.getSpatialAudio();
                    Client.RTCSpatialAudioPosition rTCSpatialAudioPosition2 = rTCSpatialAudioPosition;
                    spatialAudio.updateListenerPosition(new Position(rTCSpatialAudioPosition2.x, rTCSpatialAudioPosition2.y, rTCSpatialAudioPosition2.z));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$68_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass68 anonymousClass68) {
                boolean LIZ2;
                try {
                    anonymousClass68.com_ss_avframework_livestreamv2_core_interact_ClientImpl$68__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void updateRtcExtInfo(final String str) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.29
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$29__run$___twin___() {
                AVLog.debugTrace(str);
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", config ");
                LIZ.append(str);
                interactLogService.onEngineAPICall("updateRtcExtInfo", X1D.LIZIZ(LIZ));
                ClientImpl.this.mConfig.setRtcExtInfo(str);
                ClientImpl.this.rtcEngineWrapper.updateRtcExtInfo(str);
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mRtcExtInfo = clientImpl.rtcEngineWrapper.getRtcExtInfo();
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass29 anonymousClass29) {
                boolean LIZ;
                try {
                    anonymousClass29.com_ss_avframework_livestreamv2_core_interact_ClientImpl$29__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void updateSdkParams(final String str) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.30
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$30__run$___twin___() {
                int i;
                int i2;
                InteractEngineImpl interactEngineImpl;
                try {
                    JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "PushBase");
                    if (!jSONObject.isNull("mixOnClient") && (interactEngineImpl = ClientImpl.this.mInteractEngine) != null) {
                        interactEngineImpl.setMixOnClientParams(JSONObjectProtectorUtils.getJSONObject(jSONObject, "mixOnClient"));
                    }
                } catch (JSONException unused) {
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update Sdk Params:");
                LIZ.append(str);
                AVLog.logKibana(4, "ClientImpl", X1D.LIZIZ(LIZ), null);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("update Sdk Params:");
                LIZ2.append(str);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ2));
                Config.MixStreamConfig mixStreamConfig = ClientImpl.this.mConfig.getMixStreamConfig();
                if (!ClientImpl.this.mConfig.isMixStreamConfigIndependent()) {
                    try {
                        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "PushBase");
                        if (!jSONObject2.isNull("width") && !jSONObject2.isNull("height")) {
                            int i3 = JSONObjectProtectorUtils.getInt(jSONObject2, "width");
                            int i4 = JSONObjectProtectorUtils.getInt(jSONObject2, "height");
                            if (ClientImpl.this.mConfig.getMixStreamType() != Config.MixStreamType.RTC_CLIENT_MIX && (mixStreamConfig.getVideoWidth() != i3 || mixStreamConfig.getVideoHeight() != i4)) {
                                mixStreamConfig.setVideoSize(i3, i4);
                            }
                        }
                        if (!jSONObject2.isNull("defaultBitrate") && (i2 = JSONObjectProtectorUtils.getInt(jSONObject2, "defaultBitrate")) > 10000) {
                            mixStreamConfig.setVideoBitrate(i2);
                        }
                        if (!jSONObject2.isNull("fps") && (i = JSONObjectProtectorUtils.getInt(jSONObject2, "fps")) > 0 && i <= 60 && mixStreamConfig.getVideoFrameRate() != i) {
                            mixStreamConfig.setVideoFrameRate(i);
                        }
                    } catch (Exception unused2) {
                    }
                }
                ClientImpl.this.updateMixStream(true, false);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass30 anonymousClass30) {
                boolean LIZ;
                try {
                    anonymousClass30.com_ss_avframework_livestreamv2_core_interact_ClientImpl$30__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int updateSpatialAudioPosition(final Client.RTCSpatialAudioPosition rTCSpatialAudioPosition) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("posX: ");
        LIZ.append(rTCSpatialAudioPosition.x);
        LIZ.append(", posY: ");
        LIZ.append(rTCSpatialAudioPosition.y);
        LIZ.append(", posZ: ");
        LIZ.append(rTCSpatialAudioPosition.z);
        interactLogService.onEngineAPICall("updateSpatialAudioPosition", X1D.LIZIZ(LIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.66
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$66_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$66__run$___twin___() {
                RTCRoomImpl rTCRoomImpl = ClientImpl.this.mRtcRoom;
                if (rTCRoomImpl != null) {
                    ISpatialAudio spatialAudio = rTCRoomImpl.getSpatialAudio();
                    Client.RTCSpatialAudioPosition rTCSpatialAudioPosition2 = rTCSpatialAudioPosition;
                    spatialAudio.updatePosition(new Position(rTCSpatialAudioPosition2.x, rTCSpatialAudioPosition2.y, rTCSpatialAudioPosition2.z));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$66_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass66 anonymousClass66) {
                boolean LIZ2;
                try {
                    anonymousClass66.com_ss_avframework_livestreamv2_core_interact_ClientImpl$66__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int updateSpatialAudioSelfOrientation(final Client.RTCSpatialAudioHumanOrientation rTCSpatialAudioHumanOrientation) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForwardX: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.forward.x);
        LIZ.append(", ForwardY: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.forward.y);
        LIZ.append(", ForwardZ: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.forward.z);
        LIZ.append("RignhtX: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.right.x);
        LIZ.append(", RignhtY: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.right.y);
        LIZ.append(", RignhtZ: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.right.z);
        LIZ.append("UpX: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.up.x);
        LIZ.append(", UpY: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.up.y);
        LIZ.append(", UpZ: ");
        LIZ.append(rTCSpatialAudioHumanOrientation.up.z);
        interactLogService.onEngineAPICall("updateSpatialAudioPosition", X1D.LIZIZ(LIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.67
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$67_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$67__run$___twin___() {
                RTCRoomImpl rTCRoomImpl = ClientImpl.this.mRtcRoom;
                if (rTCRoomImpl != null) {
                    ISpatialAudio spatialAudio = rTCRoomImpl.getSpatialAudio();
                    Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation = rTCSpatialAudioHumanOrientation.forward;
                    Orientation orientation = new Orientation(rTCSpatialAudioOrientation.x, rTCSpatialAudioOrientation.y, rTCSpatialAudioOrientation.z);
                    Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation2 = rTCSpatialAudioHumanOrientation.right;
                    Orientation orientation2 = new Orientation(rTCSpatialAudioOrientation2.x, rTCSpatialAudioOrientation2.y, rTCSpatialAudioOrientation2.z);
                    Client.RTCSpatialAudioOrientation rTCSpatialAudioOrientation3 = rTCSpatialAudioHumanOrientation.up;
                    spatialAudio.updateSelfOrientation(new HumanOrientation(orientation, orientation2, new Orientation(rTCSpatialAudioOrientation3.x, rTCSpatialAudioOrientation3.y, rTCSpatialAudioOrientation3.z)));
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$67_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass67 anonymousClass67) {
                boolean LIZ2;
                try {
                    anonymousClass67.com_ss_avframework_livestreamv2_core_interact_ClientImpl$67__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    private AudioFormat generateAudioForamt(int i, int i2) {
        AudioChannel audioChannel = AudioChannel.AUDIO_CHANNEL_MONO;
        if (i != 1 && i == 2) {
            audioChannel = AudioChannel.AUDIO_CHANNEL_STEREO;
        }
        AudioSampleRate audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_8000;
        if (i2 != 8000) {
            if (i2 != 16000) {
                if (i2 != 32000) {
                    if (i2 != 44100) {
                        if (i2 != 48000) {
                            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_44100;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("generateAudioForamt audio sample rate error samples:");
                            LIZ.append(i2);
                            AVLog.ioe("ClientImpl", X1D.LIZIZ(LIZ));
                        } else {
                            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_48000;
                        }
                    } else {
                        audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_44100;
                    }
                } else {
                    audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_32000;
                }
            } else {
                audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_16000;
            }
        }
        return new AudioFormat(audioSampleRate, audioChannel);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void enableAllRemoteRender(final boolean z, final boolean z2) {
        if (this.mBuilder != null) {
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.33
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$33__run$___twin___() {
                    MuteState muteState;
                    MuteState muteState2;
                    MuteState muteState3;
                    MuteState muteState4;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("enableAllRemoteRender, canRender: ");
                    LIZ.append(z);
                    LIZ.append(", enableAllSubscribeRemoteVideo: ");
                    LIZ.append(z2);
                    LIZ.append(this);
                    AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                    InteractLogService interactLogService = ClientImpl.this.mLogService;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("canRender: ");
                    LIZ2.append(z);
                    LIZ2.append(" , enableAllSubscribeRemoteVideo: ");
                    LIZ2.append(z2);
                    LIZ2.append(this);
                    LIZ2.append(" ,TimeStamp:");
                    LIZ2.append(System.currentTimeMillis());
                    interactLogService.onEngineAPICall("enableAllRemoteRender", X1D.LIZIZ(LIZ2));
                    if (z2) {
                        ClientImpl clientImpl = ClientImpl.this;
                        clientImpl.mEnableRemoteAllRender = z;
                        for (VideoSinkWrapper videoSinkWrapper : clientImpl.mVideoSinkMap.values()) {
                            videoSinkWrapper.setRenderAble(z);
                            videoSinkWrapper.setFirstRenderFrame();
                        }
                        ClientImpl clientImpl2 = ClientImpl.this;
                        if (clientImpl2.rtcEngineWrapper != null) {
                            InteractLogService interactLogService2 = clientImpl2.mLogService;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("muteState:");
                            if (z) {
                                muteState3 = MuteState.MUTE_STATE_OFF;
                            } else {
                                muteState3 = MuteState.MUTE_STATE_ON;
                            }
                            LIZ3.append(muteState3);
                            interactLogService2.onRTCEngineMediaAPICall("muteAllRemoteAudio", X1D.LIZIZ(LIZ3), "location:enableAllRemoteRender");
                            RTCEngineWrapper rTCEngineWrapper = ClientImpl.this.rtcEngineWrapper;
                            if (z) {
                                muteState4 = MuteState.MUTE_STATE_OFF;
                            } else {
                                muteState4 = MuteState.MUTE_STATE_ON;
                            }
                            rTCEngineWrapper.muteAllRemoteAudio(muteState4);
                            return;
                        }
                        return;
                    }
                    ClientImpl clientImpl3 = ClientImpl.this;
                    clientImpl3.mEnableRemoteAllRender = z;
                    for (VideoSinkWrapper videoSinkWrapper2 : clientImpl3.mVideoSinkMap.values()) {
                        videoSinkWrapper2.setRenderAble(z);
                        videoSinkWrapper2.setFirstRenderFrame();
                    }
                    ClientImpl clientImpl4 = ClientImpl.this;
                    if (clientImpl4.rtcEngineWrapper != null) {
                        InteractLogService interactLogService3 = clientImpl4.mLogService;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("muteState:");
                        if (z) {
                            muteState = MuteState.MUTE_STATE_OFF;
                        } else {
                            muteState = MuteState.MUTE_STATE_ON;
                        }
                        LIZ4.append(muteState);
                        interactLogService3.onRTCEngineMediaAPICall("muteAllRemoteAudio", X1D.LIZIZ(LIZ4), "location:enableAllRemoteRender");
                        RTCEngineWrapper rTCEngineWrapper2 = ClientImpl.this.rtcEngineWrapper;
                        if (z) {
                            muteState2 = MuteState.MUTE_STATE_OFF;
                        } else {
                            muteState2 = MuteState.MUTE_STATE_ON;
                        }
                        rTCEngineWrapper2.muteAllRemoteAudio(muteState2);
                    }
                    if (!z) {
                        ClientImpl.this.mLogService.onRTCEngineMediaAPICall("pauseAllSubscribedStream", "mediaType:video", "location:enableAllRemoteRender");
                        ClientImpl.this.mRtcRoom.pauseAllSubscribedStream(PauseResumeControlMediaType.VIDEO);
                    } else {
                        ClientImpl.this.mLogService.onRTCEngineMediaAPICall("resumeAllSubscribedStream", "mediaType:video", "location:enableAllRemoteRender");
                        ClientImpl.this.mRtcRoom.resumeAllSubscribedStream(PauseResumeControlMediaType.VIDEO);
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass33 anonymousClass33) {
                    boolean LIZ;
                    try {
                        anonymousClass33.com_ss_avframework_livestreamv2_core_interact_ClientImpl$33__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void enableLocalAudio(boolean z, String str) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable state: ");
        LIZ.append(z);
        interactLogService.onRTCEngineMediaAPICall("enableLocalAudio", X1D.LIZIZ(LIZ), str);
        if (!this.mInteractEngine.getBuilder().isByteAudioEnabled() || (this.mAudioClientFactory == null && this.mAudioSinkFactory == null)) {
            if (z) {
                this.mRtcEngine.startAudioCapture();
            } else {
                this.mRtcEngine.stopAudioCapture();
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void muteRemoteAudioStream(final String str, final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.19
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$19__run$___twin___() {
                AVLog.debugTrace(str, Boolean.valueOf(z));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", interactId ");
                LIZ.append(str);
                LIZ.append(", mute ");
                LIZ.append(z);
                interactLogService.onEngineAPICall("muteRemoteAudioStream", X1D.LIZIZ(LIZ));
                if (z) {
                    ClientImpl.this.mRtcRoom.unsubscribeStream(str, MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
                } else {
                    ClientImpl.this.mRtcRoom.subscribeStream(str, MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
                }
                ClientImpl.this.updateMixStream(false, false);
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
                boolean LIZ;
                try {
                    anonymousClass19.com_ss_avframework_livestreamv2_core_interact_ClientImpl$19__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void muteRemoteVideoStream(final String str, final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.20
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$20__run$___twin___() {
                AVLog.debugTrace(str, Boolean.valueOf(z));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", interactId ");
                LIZ.append(str);
                LIZ.append(", mute ");
                LIZ.append(z);
                interactLogService.onEngineAPICall("muteRemoteVideoStream", X1D.LIZIZ(LIZ));
                if (z) {
                    ClientImpl.this.mRtcRoom.unsubscribeStream(str, MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                } else {
                    ClientImpl.this.mRtcRoom.subscribeStream(str, MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                }
                ClientImpl.this.updateMixStream(true, false);
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
                boolean LIZ;
                try {
                    anonymousClass20.com_ss_avframework_livestreamv2_core_interact_ClientImpl$20__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void recordGuestJoinAndLeave(String str, boolean z) {
        AVLog.debugTrace(str, Boolean.valueOf(z));
        synchronized (this.mGuestList) {
            Iterator<String> it = this.mGuestList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    it.remove();
                }
            }
            if (z) {
                this.mGuestList.add(str);
            }
        }
    }

    public void sendSdkControlMsgInternal(String str, JSONObject jSONObject) {
        if ("switch_mix_type".equalsIgnoreCase(str) && !jSONObject.isNull("mix_type")) {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "mix_type");
            if ("server".equalsIgnoreCase(string)) {
                switchMixType(Config.MixStreamType.SERVER_MIX);
            } else if ("client".equalsIgnoreCase(string)) {
                switchMixType(Config.MixStreamType.CLIENT_MIX);
            } else {
                if (!"rtc_client".equalsIgnoreCase(string)) {
                    return;
                }
                switchMixType(Config.MixStreamType.RTC_CLIENT_MIX);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public long sendUserMessage(final String str, final String str2) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.24
            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$24__run$___twin___() {
                AVLog.debugTrace(str, str2);
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", interactId ");
                LIZ.append(str);
                LIZ.append(", message ");
                LIZ.append(str2);
                interactLogService.onEngineAPICall("sendUserMessage", X1D.LIZIZ(LIZ));
                ClientImpl.this.mRtcRoom.sendUserMessage(str, str2, MessageConfig.UNRELIABLE_ORDERED);
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass24 anonymousClass24) {
                boolean LIZ;
                try {
                    anonymousClass24.com_ss_avframework_livestreamv2_core_interact_ClientImpl$24__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0L;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setCatchedVideoFrameCallback(final String str, final Client.ICatchedVideoFrameCallback iCatchedVideoFrameCallback) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.37
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$37__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mVideoFrameCallback = iCatchedVideoFrameCallback;
                VideoSinkWrapper videoSinkWrapper = clientImpl.mVideoSinkMap.get(str);
                if (videoSinkWrapper != null) {
                    videoSinkWrapper.setNeedVideoFrameCallback();
                    videoSinkWrapper.setVideoRenderConfigCallBack(iCatchedVideoFrameCallback);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass37 anonymousClass37) {
                boolean LIZ;
                try {
                    anonymousClass37.com_ss_avframework_livestreamv2_core_interact_ClientImpl$37__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setFitMode(final String str, final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.36
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$36__run$___twin___() {
                VideoSinkWrapper videoSinkWrapper = ClientImpl.this.mVideoSinkMap.get(str);
                if (videoSinkWrapper != null) {
                    videoSinkWrapper.setFitMode(z);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass36 anonymousClass36) {
                boolean LIZ;
                try {
                    anonymousClass36.com_ss_avframework_livestreamv2_core_interact_ClientImpl$36__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int setLocalVideoDenoiseMode(Client.RTCStreamIndex rTCStreamIndex, boolean z) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable :");
        LIZ.append(z);
        interactLogService.onEngineAPICall("setLocalVideoDenoiseMode", X1D.LIZIZ(LIZ));
        if (this.mRtcEngine != null) {
            return 0;
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setOnlyConsumeRemoteSei(final String str, final boolean z) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.34
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$34__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setOnlyConsumeRemoteSei ");
                LIZ.append(this);
                AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(this);
                LIZ2.append(" ,interactId:");
                LIZ2.append(str);
                LIZ2.append(",onlyConsumeSei");
                LIZ2.append(z);
                interactLogService.onEngineAPICall("setOnlyConsumeRemoteSei", X1D.LIZIZ(LIZ2));
                VideoSinkWrapper videoSinkWrapper = ClientImpl.this.mVideoSinkMap.get(str);
                if (videoSinkWrapper != null) {
                    videoSinkWrapper.setOnlyNeedRemoteSei(z);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass34 anonymousClass34) {
                boolean LIZ;
                try {
                    anonymousClass34.com_ss_avframework_livestreamv2_core_interact_ClientImpl$34__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas) {
        RTCVideo rTCVideo = this.mRtcEngine;
        if (rTCVideo != null) {
            return rTCVideo.setPublicStreamVideoCanvas(str, videoCanvas);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setRemoteAudioPlaybackVolume(final String str, final float f) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.23
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$23__run$___twin___() {
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("interactId:");
                LIZ.append(str);
                LIZ.append(",volume:");
                LIZ.append(f);
                interactLogService.onEngineAPICall("setRemoteAudioPlaybackVolume", X1D.LIZIZ(LIZ));
                ClientImpl clientImpl = ClientImpl.this;
                clientImpl.mRtcEngine.setRemoteAudioPlaybackVolume(clientImpl.mRoomId, str, (int) (f * 100.0f));
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
                boolean LIZ;
                try {
                    anonymousClass23.com_ss_avframework_livestreamv2_core_interact_ClientImpl$23__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int setRemoteVideoSuperResolution(Client.RTCRemoteStreamInfo rTCRemoteStreamInfo, boolean z) {
        StreamIndex streamIndex;
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("streamKey :");
        LIZ.append(rTCRemoteStreamInfo.toString());
        LIZ.append("enable :");
        LIZ.append(z);
        interactLogService.onEngineAPICall("setRemoteVideoSuperResolution", X1D.LIZIZ(LIZ));
        if (this.mRtcEngine != null) {
            String str = rTCRemoteStreamInfo.roomId;
            String str2 = rTCRemoteStreamInfo.userId;
            if (rTCRemoteStreamInfo.streamIndex == Client.RTCStreamIndex.STREAM_INDEX_MAIN) {
                streamIndex = StreamIndex.STREAM_INDEX_MAIN;
            } else {
                streamIndex = StreamIndex.STREAM_INDEX_SCREEN;
            }
            RemoteStreamKey remoteStreamKey = new RemoteStreamKey(str, str2, streamIndex);
            if (z) {
                return this.mRtcEngine.setRemoteVideoSuperResolution(remoteStreamKey, VideoSuperResolutionMode.VIDEO_SUPER_RESOLUTION_MODE_ON);
            }
            return this.mRtcEngine.setRemoteVideoSuperResolution(remoteStreamKey, VideoSuperResolutionMode.VIDEO_SUPER_RESOLUTION_MODE_OFF);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int startChorus(final boolean z, final boolean z2) {
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isBase :");
        LIZ.append(z);
        LIZ.append(",onlySendPts :");
        LIZ.append(z2);
        interactLogService.onEngineAPICall("startChorus", X1D.LIZIZ(LIZ));
        if (this.mRtcEngine != null) {
            InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.70
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$70_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$70__run$___twin___() {
                    ClientImpl.this.mConfig.setChorusOnlySendPts(z2);
                    if (z) {
                        ClientImpl.this.mConfig.setChorusCharacter(Config.ChorusCharacter.MAIN_SINGER);
                        if (ClientImpl.this.mConfig.getMixStreamType() == Config.MixStreamType.CLIENT_MIX && !ClientImpl.this.mConfig.getChorusOnlySendPts()) {
                            ClientImpl.this.mIsNeedCopyFrame = true;
                        }
                    } else {
                        ClientImpl.this.mConfig.setChorusCharacter(Config.ChorusCharacter.OTHER_SINGER);
                    }
                    ClientImpl.this.updateMixStream(true, true);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$70_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass70 anonymousClass70) {
                    boolean LIZ2;
                    try {
                        anonymousClass70.com_ss_avframework_livestreamv2_core_interact_ClientImpl$70__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
            return 0;
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int startPushPublicStream(String str, PublicStreaming publicStreaming) {
        RTCVideo rTCVideo = this.mRtcEngine;
        if (rTCVideo != null) {
            return rTCVideo.startPushPublicStream(str, publicStreaming);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void updateAuthInfo(final JSONObject jSONObject, final Client.FrameType frameType) {
        if (jSONObject == null || frameType.ordinal() == 0) {
            return;
        }
        if (this.mConfig.getHandler() != null && C16880lQ.LLLLIIIILLL() != this.mConfig.getHandler().getLooper().getThread()) {
            this.mConfig.getHandler().post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.12
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$12__run$___twin___() {
                    ClientImpl.this.updateAuthInfo(jSONObject, frameType);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                    boolean LIZ;
                    try {
                        anonymousClass12.com_ss_avframework_livestreamv2_core_interact_ClientImpl$12__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        if (this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
            try {
                if (this.authInfoCache == null) {
                    this.authInfoCache = jSONObject;
                }
                this.authInfoCache.put("dynamicLabel", "TTLive");
                this.authInfoCache.put("frameType", frameType.ordinal());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (this.mStreamMixManager.getLiveTranscodingState()) {
                updateMixStream(false, false);
            }
        }
        this.mStreamMixManager.updateAuthInfo(this.authInfoCache);
    }

    public boolean updateMixStream(boolean z, boolean z2) {
        AVLog.debugTrace(new Object[0]);
        if (this.mConfig.getCharacter() != Config.Character.ANCHOR || this.mConfig.getMixStreamType() == Config.MixStreamType.NONE || this.mConfig.getStreamMixer() == null) {
            return false;
        }
        return this.mStreamMixManager.updateMixStream(z, formRegionList(), z2, this.mWaterMarkRegions);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int updatePublicStreamParam(String str, PublicStreaming publicStreaming) {
        RTCVideo rTCVideo = this.mRtcEngine;
        if (rTCVideo != null) {
            return rTCVideo.updatePublicStreamParam(str, publicStreaming);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int addWaterMarkWithId(final String str, final Client.RTCWaterMarkRegion rTCWaterMarkRegion, long j) {
        if (str == null || str.isEmpty()) {
            AVLog.ioe("ClientImpl", "addWaterMarkWithId region param error, waterMarkId invalid");
            return -1;
        }
        if (rTCWaterMarkRegion == null) {
            AVLog.ioe("ClientImpl", "addWaterMarkWithId region param error, region is null");
            return -1;
        }
        if (!checkWaterMarkRegionValid(rTCWaterMarkRegion)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addWaterMarkWithId region param error, region: ");
            LIZ.append(rTCWaterMarkRegion.toString());
            AVLog.ioe("ClientImpl", X1D.LIZIZ(LIZ));
            return -1;
        }
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZIZ = C25620zW.LIZIZ("waterMarkId: ", str, ", params: ");
        LIZIZ.append(rTCWaterMarkRegion.toString());
        LIZIZ.append(", pts: ");
        LIZIZ.append(j);
        interactLogService.onEngineAPICall("addWaterMarkWithId", X1D.LIZIZ(LIZIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.60
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$60_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$60__run$___twin___() {
                ClientImpl clientImpl = ClientImpl.this;
                if (clientImpl.mWaterMarkRegions == null) {
                    clientImpl.mWaterMarkRegions = new HashMap();
                }
                if (ClientImpl.this.mWaterMarkRegions.containsKey(str) && rTCWaterMarkRegion.getImage() == null) {
                    rTCWaterMarkRegion.setImage(ClientImpl.this.mWaterMarkRegions.get(str).getImage());
                }
                ClientImpl.this.mWaterMarkRegions.put(str, rTCWaterMarkRegion);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$60_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass60 anonymousClass60) {
                boolean LIZ2;
                try {
                    anonymousClass60.com_ss_avframework_livestreamv2_core_interact_ClientImpl$60__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void sendFirstRemoteVideoRenderMessage(String str, int i, int i2) {
        char c;
        TextureView textureView;
        Object obj;
        if (this.mVideoSinkFactory != null) {
            VideoSinkWrapper videoSinkWrapper = this.mVideoSinkMap.get(str);
            if (videoSinkWrapper == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Consume user ");
                LIZ.append(str);
                LIZ.append("'s buffer frame before he joins room.");
                AVLog.ioe("ClientImpl", X1D.LIZIZ(LIZ));
                return;
            }
            if (this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
                obj = videoSinkWrapper.getSurfaceView();
            } else if (this.mConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
                obj = videoSinkWrapper.getTextureView();
            } else {
                obj = null;
            }
            if (!this.mSingleViewMode) {
                this.mInteractListenerProxy.onInfo(this, 14, 0L, str, obj, Integer.valueOf(this.mInteractEngine.queryRtcId(str)), Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                this.mInteractListenerProxy.onInfo(this, 14, 1L, str, videoSinkWrapper.getVideoFrameRender(), Integer.valueOf(this.mInteractEngine.queryRtcId(str)), Integer.valueOf(i), Integer.valueOf(i2));
            }
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "rtc_first_remote_video_render_msg_sent");
                jSONObject.put("rtc_channel_id", this.mRtcExtInfo.channelId);
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.49
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_ClientImpl$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$49__run$___twin___() {
                    AVLog.logKibana(4, "ClientImpl", jSONObject.toString(), null);
                }

                public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass49 anonymousClass49) {
                    boolean LIZ2;
                    try {
                        anonymousClass49.com_ss_avframework_livestreamv2_core_interact_ClientImpl$49__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
            AVLog.ioi("ClientImpl", "MSG_INFO_FIRST_REMOTE_VIDEO_RENDER: uid " + str + ", view " + obj + ", width " + i + ", height " + i2);
            return;
        }
        if (this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
            SurfaceView surfaceView = new SurfaceView(this.mConfig.getContext());
            this.mRtcEngine.setRemoteVideoCanvas(new RemoteStreamKey(this.mRoomId, str, StreamIndex.STREAM_INDEX_MAIN), new VideoCanvas(surfaceView, 1));
            c = 1;
            textureView = surfaceView;
        } else {
            TextureView textureView2 = new TextureView(this.mConfig.getContext());
            c = 1;
            this.mRtcEngine.setRemoteVideoCanvas(new RemoteStreamKey(this.mRoomId, str, StreamIndex.STREAM_INDEX_MAIN), new VideoCanvas(textureView2, 1));
            textureView = textureView2;
        }
        Client.Listener listener = this.mInteractListenerProxy;
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[c] = textureView;
        objArr[2] = Integer.valueOf(this.mInteractEngine.queryRtcId(str));
        objArr[3] = Integer.valueOf(i);
        objArr[4] = Integer.valueOf(i2);
        listener.onInfo(this, 14, 0L, objArr);
        final JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("key", "rtc_first_remote_video_render_msg_sent");
            jSONObject2.put("rtc_channel_id", this.mRtcExtInfo.channelId);
            jSONObject2.put("timestamp", System.currentTimeMillis());
        } catch (Exception unused2) {
        }
        InteractThreadUtils.postLogUpTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.50
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$50__run$___twin___() {
                AVLog.logKibana(4, "ClientImpl", jSONObject2.toString(), null);
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass50 anonymousClass50) {
                boolean LIZ2;
                try {
                    anonymousClass50.com_ss_avframework_livestreamv2_core_interact_ClientImpl$50__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("MSG_INFO_FIRST_REMOTE_VIDEO_RENDER with rtc render video internal: uid ");
        LIZ2.append(str);
        LIZ2.append(", view ");
        LIZ2.append(textureView);
        LIZ2.append(", width ");
        LIZ2.append(i);
        LIZ2.append(", height ");
        LIZ2.append(i2);
        AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setAudioFrameObserver(final int i, final int i2, final Client.IAudioFrameObserver iAudioFrameObserver) {
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.38
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$38_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$38__run$___twin___() {
                InteractLogService interactLogService = ClientImpl.this.mLogService;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(this);
                LIZ.append(", samle rate ");
                LIZ.append(i);
                LIZ.append(", channel count ");
                LIZ.append(i2);
                LIZ.append(", observer ");
                LIZ.append(iAudioFrameObserver);
                interactLogService.onEngineAPICall("setAudioFrameObserver", X1D.LIZIZ(LIZ));
                ClientImpl clientImpl = ClientImpl.this;
                Client.IAudioFrameObserver iAudioFrameObserver2 = iAudioFrameObserver;
                clientImpl.mExternalAudioFrameObserver = iAudioFrameObserver2;
                int i3 = i;
                clientImpl.mOutSampleRate = i3;
                clientImpl.mOutChannelCount = i2;
                if (iAudioFrameObserver2 != null) {
                    clientImpl.mRtcEngine.enableAudioFrameCallback(AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_MIXED, new AudioFormat(AudioSampleRate.fromId(i3), AudioChannel.fromId(ClientImpl.this.mOutChannelCount)));
                    ClientImpl clientImpl2 = ClientImpl.this;
                    clientImpl2.mRtcEngine.registerAudioFrameObserver(clientImpl2.mInternalAudioFrameObserver);
                } else {
                    clientImpl.mRtcEngine.disableAudioFrameCallback(AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_MIXED);
                    ClientImpl.this.mRtcEngine.registerAudioFrameObserver(null);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$38_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass38 anonymousClass38) {
                boolean LIZ;
                try {
                    anonymousClass38.com_ss_avframework_livestreamv2_core_interact_ClientImpl$38__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public void setPublicStreamVideoSink(String str, IVideoSink iVideoSink, int i) {
        if (iVideoSink != null) {
            AVLog.ioi("ClientImpl", "setupRemoteVideoRender after receive onUserJoined");
            RTCVideo rTCVideo = this.mRtcEngine;
            if (rTCVideo != null) {
                rTCVideo.setPublicStreamVideoSink(str, iVideoSink, i);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    public int updateWaterMarkWithId(final String str, final Client.RTCWaterMarkRegion rTCWaterMarkRegion, long j) {
        if (rTCWaterMarkRegion == null) {
            AVLog.ioe("ClientImpl", "updateWaterMarkWithId region param error, region is null");
            return -1;
        }
        if (str == null || str.isEmpty()) {
            AVLog.ioe("ClientImpl", "updateWaterMarkWithId region param error, waterMarkId invalid");
            return -1;
        }
        if (!checkWaterMarkRegionValid(rTCWaterMarkRegion)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateWaterMarkWithId region param error, region: ");
            LIZ.append(rTCWaterMarkRegion.toString());
            AVLog.ioe("ClientImpl", X1D.LIZIZ(LIZ));
            return -1;
        }
        InteractLogService interactLogService = this.mLogService;
        StringBuilder LIZIZ = C25620zW.LIZIZ("waterMarkId: ", str, ", params: ");
        LIZIZ.append(rTCWaterMarkRegion.toString());
        LIZIZ.append(", pts: ");
        LIZIZ.append(j);
        interactLogService.onEngineAPICall("addWaterMarkWithId", X1D.LIZIZ(LIZIZ));
        InteractThreadUtils.postWorkTask(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.ClientImpl.62
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_ClientImpl$62_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_ClientImpl$62__run$___twin___() {
                Map<String, Client.RTCWaterMarkRegion> map = ClientImpl.this.mWaterMarkRegions;
                if (map != null) {
                    if (map.containsKey(str) && rTCWaterMarkRegion.getImage() == null) {
                        rTCWaterMarkRegion.setImage(ClientImpl.this.mWaterMarkRegions.get(str).getImage());
                    }
                    ClientImpl.this.mWaterMarkRegions.put(str, rTCWaterMarkRegion);
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_ClientImpl$62_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass62 anonymousClass62) {
                boolean LIZ2;
                try {
                    anonymousClass62.com_ss_avframework_livestreamv2_core_interact_ClientImpl$62__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if ((r14 instanceof java.nio.ByteBuffer) != false) goto L20;
     */
    @Override // com.ss.avframework.livestreamv2.core.interact.Client
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean pushSurfaceExternalVideoFrame(final com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper r19, com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData r20, int r21, float[] r22, com.bytedance.realx.video.EglBase r23) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.ClientImpl.pushSurfaceExternalVideoFrame(com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper, com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData, int, float[], com.bytedance.realx.video.EglBase):boolean");
    }

    public ClientImpl(RTCEngineWrapper rTCEngineWrapper, InteractConfig interactConfig, VideoClientFactory videoClientFactory, VideoSinkFactory videoSinkFactory, AudioClientFactory audioClientFactory, AudioSinkFactory audioSinkFactory, MediaEngine mediaEngine, InteractEngineImpl interactEngineImpl) {
        LiveCore.Builder builder;
        this.mColorRange = -1;
        this.useCapturePts = false;
        AVLog.debugTrace(new Object[0]);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("<init> ");
        LIZ.append(this);
        LIZ.append(" rtcExtInfo:");
        LIZ.append(interactConfig.getRtcExtInfo());
        AVLog.ioi("ClientImpl", X1D.LIZIZ(LIZ));
        InteractEngineBuilder builder2 = interactEngineImpl.getBuilder();
        this.mBuilder = builder2;
        this.mDisposed = false;
        this.mStopped = false;
        this.mInteractEngine = interactEngineImpl;
        this.mConfig = interactConfig;
        this.mMediaEngine = mediaEngine;
        this.mVPassInteractCfg = builder2.getVPassInteractCfg();
        this.rtcEngineWrapper = rTCEngineWrapper;
        this.mRtcEngine = rTCEngineWrapper.getRtcEngine();
        this.rtcEngineWrapper.setRtcExtInfo(interactConfig.getRtcExtInfo());
        this.rtcEngineWrapper.setRtcEngineEventHandler(this.mInternalRtcCallback);
        LiveRTCExtInfo rtcExtInfo = this.rtcEngineWrapper.getRtcExtInfo();
        this.mRtcExtInfo = rtcExtInfo;
        this.mInteractId = rtcExtInfo.interactId;
        this.mLogService = new InteractLogService(rtcExtInfo, this.mConfig, this.mInteractEngine);
        this.mInteractStatics = new InteractStaticsImpl(this.mConfig.getContext(), this.mConfig);
        this.mRtcRoom = this.rtcEngineWrapper.getRtcRoom();
        RTCRoomHandlerProxy rTCRoomHandlerProxy = new RTCRoomHandlerProxy(this.mRoomEventHandler);
        this.rtcRoomHandlerProxy = rTCRoomHandlerProxy;
        RTCRoomImpl rTCRoomImpl = this.mRtcRoom;
        if (rTCRoomImpl != null) {
            rTCRoomImpl.setRTCRoomEventHandler(rTCRoomHandlerProxy);
        }
        this.mStreamMixManager = new StreamMixManager(this, interactConfig, this.mRtcEngine, this.mLogService, this.mInteractStatics, this.mVPassInteractCfg, this.mInternalRtcCallback, this.mRtcExtInfo, interactEngineImpl, this.mInteractListenerProxy, this.rtcEngineWrapper);
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mVideoSinkFactory = videoSinkFactory;
        this.mAudioSinkFactory = audioSinkFactory;
        this.mSingleViewMode = this.mConfig.isSingleViewMode();
        if (this.mColorRange == -1) {
            VPassInteractCfg vPassInteractCfg = this.mVPassInteractCfg;
            if (vPassInteractCfg != null && vPassInteractCfg.videoRangeModeInRtc) {
                this.mColorRange = 1;
            } else {
                this.mColorRange = 0;
            }
        }
        this.mRemoteColorRange = new RemoteYuvColorRangeReporter();
        this.mWaterMarkRegions = new HashMap();
        this.mRoomId = this.mRtcExtInfo.channelId;
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore != null && (builder = liveCore.getBuilder()) != null) {
            this.useCapturePts = builder.useCapturePtsInRtc();
        }
    }
}
