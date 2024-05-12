package com.byted.cast.sink.api;

import X.X1D;
import X.ZZS;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.MD5;
import com.byted.cast.common.MainThreadExecutor;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.api.CodecType;
import com.byted.cast.common.api.IActionListener;
import com.byted.cast.common.api.IAudioDataListener;
import com.byted.cast.common.api.IBrowseDataListener;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.api.IMediaServiceListener;
import com.byted.cast.common.api.IReverseControl;
import com.byted.cast.common.api.ISendResultListener;
import com.byted.cast.common.api.ISinkDataListener;
import com.byted.cast.common.api.cloud.ICastIdListener;
import com.byted.cast.common.api.multiple.IMultipleActiveControl;
import com.byted.cast.common.api.multiple.IMultipleLoader;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.IMessageListener;
import com.byted.cast.common.sink.IMirrorListener;
import com.byted.cast.common.sink.ISourceDeviceInfoListener;
import com.byted.cast.common.sink.ServiceInfo;
import com.byted.cast.common.sink.Statistics;
import com.byted.cast.sdk.RTCStatistics;
import com.byted.cast.sink.api.BytelinkSinkWrapper;
import com.byted.cast.sink.api.CastInfo;
import com.byted.cast.sink.api.multiple.IMultipleReverseControl;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class BytelinkSinkWrapper implements ICastSink, IOnLogMonitor {
    public Application mApplication;
    public IAudioDataListener mAudioDataListener;
    public Boolean mAutoPlayAudio;
    public String mBrowseId;
    public ByteLinkSink mByteLinkSink;
    public Boolean mCallbackDataToUser;
    public ContextManager.CastContext mCastContext;
    public com.byted.cast.common.sink.ClientInfo mClientInfo;
    public String mConnectId;
    public Context mContext;
    public Boolean mEnablePlaying;
    public Boolean mEnableVideoNativeDecode;
    public long mFirstVideoFrameTimeMs;
    public IMultipleLoader mLoader;
    public CastLogger mLogger;
    public Boolean mMediaRenderExists;
    public IMediaServiceListener mMediaServiceListener;
    public IMessageListener mMessageListener;
    public CastMonitor mMonitor;
    public IMultipleActiveControl mMultiActiveControl;
    public com.byted.cast.common.api.IServerListener mServerListener;
    public ISinkDataListener mSinkDataListener;
    public String mSourceMirrorVersion;
    public int mState;
    public long mVideoStartTimeMs;
    public MainThreadExecutor mainThreadExecutor;
    public com.byted.cast.sink.api.multiple.IMultipleActiveControl multiactivecontrol;
    public com.byted.cast.sink.api.multiple.IMultipleLoader multipleLoader;
    public IMultipleReverseControl multipleReverseCtrl;
    public IServerListener serverListener;
    public boolean bUseOldInterface = true;
    public IMirrorListener mMirrorListener = new a();
    public boolean mIsBinded = false;
    public int mAVSyncType = 0;
    public int mRenderMode = 0;

    /* loaded from: classes29.dex */
    public class a implements IMirrorListener {
        public a() {
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onAudioOutput(String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j) {
            IAudioDataListener iAudioDataListener;
            if (acodec_id == CodecType.ACODEC_ID.AUTO && (iAudioDataListener = BytelinkSinkWrapper.this.mAudioDataListener) != null) {
                iAudioDataListener.onAudioOutput(str, bArr, i, i2, i3, i4, j);
                return;
            }
            ISinkDataListener iSinkDataListener = BytelinkSinkWrapper.this.mSinkDataListener;
            if (iSinkDataListener != null) {
                iSinkDataListener.onAudioOutput(str, acodec_id, bArr, i, i2, i3, i4, j);
            }
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onCast(int i, com.byted.cast.common.sink.CastInfo castInfo) {
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onError(String str, int i, String str2) {
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onInviteResult(boolean z) {
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap) {
            ISinkDataListener iSinkDataListener = BytelinkSinkWrapper.this.mSinkDataListener;
            if (iSinkDataListener != null) {
                iSinkDataListener.onNotifyLatency(str, l, hashMap);
            }
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onSinkLatencyStat(int i, String str, String str2) {
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onSinkStuckStat(int i, String str, String str2) {
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onStatistics(Statistics statistics) {
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onVideoOutput(String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j, int i3) {
            ISinkDataListener iSinkDataListener = BytelinkSinkWrapper.this.mSinkDataListener;
            if (iSinkDataListener != null) {
                iSinkDataListener.onVideoOutput(str, vcodec_id, bArr, i, i2, j, i3);
            }
        }

        @Override // com.byted.cast.common.sink.IMirrorListener
        public void onVolume(String str, int i) {
            IMediaServiceListener iMediaServiceListener = BytelinkSinkWrapper.this.mMediaServiceListener;
            if (iMediaServiceListener != null) {
                iMediaServiceListener.onVolume(str, i);
            }
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVolume:");
            LIZ.append(str);
            LIZ.append(i);
            castLogger.d(X1D.LIZIZ(LIZ));
        }
    }

    /* loaded from: classes29.dex */
    public class b implements IAudioDataListener {
        public b() {
        }

        @Override // com.byted.cast.common.api.IAudioDataListener
        public void onAudioOutput(String str, byte[] bArr, int i, int i2, int i3, int i4, long j) {
            IMirrorListener iMirrorListener;
            BytelinkSinkWrapper bytelinkSinkWrapper = BytelinkSinkWrapper.this;
            if (bytelinkSinkWrapper.bUseOldInterface || (iMirrorListener = bytelinkSinkWrapper.mMirrorListener) == null) {
                return;
            }
            iMirrorListener.onAudioOutput(str, CodecType.ACODEC_ID.AUTO, bArr, i, i2, i3, i4, j);
        }
    }

    /* loaded from: classes29.dex */
    public class c implements ISinkDataListener {
        public c() {
        }

        @Override // com.byted.cast.common.api.ISinkDataListener
        public void onAudioOutput(String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j) {
            IMirrorListener iMirrorListener;
            BytelinkSinkWrapper bytelinkSinkWrapper = BytelinkSinkWrapper.this;
            if (bytelinkSinkWrapper.bUseOldInterface || (iMirrorListener = bytelinkSinkWrapper.mMirrorListener) == null) {
                return;
            }
            iMirrorListener.onAudioOutput(str, acodec_id, bArr, i, i2, i3, i4, j);
        }

        @Override // com.byted.cast.common.api.ISinkDataListener
        public void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap) {
            IMirrorListener iMirrorListener;
            BytelinkSinkWrapper bytelinkSinkWrapper = BytelinkSinkWrapper.this;
            if (bytelinkSinkWrapper.bUseOldInterface || (iMirrorListener = bytelinkSinkWrapper.mMirrorListener) == null) {
                return;
            }
            iMirrorListener.onNotifyLatency(str, l, hashMap);
        }

        @Override // com.byted.cast.common.api.ISinkDataListener
        public void onVideoOutput(String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j, int i3) {
            IMirrorListener iMirrorListener;
            BytelinkSinkWrapper bytelinkSinkWrapper = BytelinkSinkWrapper.this;
            if (bytelinkSinkWrapper.bUseOldInterface || (iMirrorListener = bytelinkSinkWrapper.mMirrorListener) == null) {
                return;
            }
            iMirrorListener.onVideoOutput(str, vcodec_id, bArr, i, i2, j, i3);
        }
    }

    /* loaded from: classes29.dex */
    public class f implements IMultipleLoader {
        public f() {
        }

        @Override // com.byted.cast.common.api.multiple.IMultipleLoader
        public void loadAudio(String str, Context context, FrameLayout frameLayout) {
            BytelinkSinkWrapper.this.multipleLoader.loadAudio(str, context, frameLayout);
        }

        @Override // com.byted.cast.common.api.multiple.IMultipleLoader
        public void loadMirror(String str, Context context, FrameLayout frameLayout) {
            BytelinkSinkWrapper.this.multipleLoader.loadMirror(str, context, frameLayout);
        }

        @Override // com.byted.cast.common.api.multiple.IMultipleLoader
        public void loadPhoto(String str, Context context, FrameLayout frameLayout) {
            BytelinkSinkWrapper.this.multipleLoader.loadPhoto(str, context, frameLayout);
        }

        @Override // com.byted.cast.common.api.multiple.IMultipleLoader
        public void loadVideo(String str, Context context, FrameLayout frameLayout) {
            BytelinkSinkWrapper.this.multipleLoader.loadVideo(str, context, frameLayout);
        }
    }

    /* loaded from: classes29.dex */
    public class g implements IPreemptListener {
        public final /* synthetic */ com.byted.cast.common.sink.IPreemptListener a;

        public g(BytelinkSinkWrapper bytelinkSinkWrapper, com.byted.cast.common.sink.IPreemptListener iPreemptListener) {
            this.a = iPreemptListener;
        }

        @Override // com.byted.cast.sink.api.IPreemptListener
        public void onPreempt(ClientInfo clientInfo) {
            if (this.a != null) {
                com.byted.cast.common.sink.ClientInfo clientInfo2 = new com.byted.cast.common.sink.ClientInfo();
                clientInfo2.clientID = clientInfo.clientID;
                clientInfo2.icon = clientInfo.icon;
                clientInfo2.mirrorSourceType = clientInfo.mirrorSourceType;
                clientInfo2.name = clientInfo.name;
                clientInfo2.sourceType = clientInfo.sourceType;
                clientInfo2.ip = clientInfo.ip;
                this.a.onPreempt("ByteLink", clientInfo2);
            }
        }
    }

    /* loaded from: classes29.dex */
    public class h implements IMultipleActiveControl {
        public h() {
        }

        @Override // com.byted.cast.common.api.multiple.IMultipleActiveControl
        public float getPlayerVolume(String str) {
            return BytelinkSinkWrapper.this.multiactivecontrol.getPlayerVolume(str);
        }

        @Override // com.byted.cast.common.api.IActiveControl
        public void pause(String str) {
        }

        @Override // com.byted.cast.common.api.IActiveControl
        public void seekComplete(String str, int i) {
        }

        @Override // com.byted.cast.common.api.IActiveControl
        public void seekStart(String str, int i) {
        }

        @Override // com.byted.cast.common.api.multiple.IMultipleActiveControl
        public void setPlayerVolume(String str, float f) {
            BytelinkSinkWrapper.this.multiactivecontrol.setPlayerVolume(str, f);
        }

        @Override // com.byted.cast.common.api.IActiveControl
        public void start(String str) {
        }

        @Override // com.byted.cast.common.api.IActiveControl
        public void stop(String str, boolean z) {
            BytelinkSinkWrapper.this.multiactivecontrol.stop(str, z);
        }

        @Override // com.byted.cast.common.api.IActiveControl
        public void updateVolume(String str) {
            BytelinkSinkWrapper.this.multiactivecontrol.updateVolume(str);
        }
    }

    public BytelinkSinkWrapper() {
        Boolean bool = Boolean.TRUE;
        this.mAutoPlayAudio = bool;
        this.mAudioDataListener = new b();
        this.mSinkDataListener = new c();
        Boolean bool2 = Boolean.FALSE;
        this.mCallbackDataToUser = bool2;
        this.mEnablePlaying = bool;
        this.mEnableVideoNativeDecode = bool2;
        this.mState = 100;
        this.mConnectId = "";
        this.mBrowseId = "";
        this.mSourceMirrorVersion = "";
        this.mVideoStartTimeMs = 0L;
        this.mFirstVideoFrameTimeMs = 0L;
        this.mClientInfo = null;
        this.mainThreadExecutor = new MainThreadExecutor();
        this.serverListener = new d();
        this.multipleReverseCtrl = new e();
        this.mLoader = new f();
        this.mMultiActiveControl = new h();
        this.mCastContext = null;
        this.mLogger = ContextManager.getLogger(null);
        this.mMonitor = ContextManager.getMonitor(this.mCastContext);
        ByteLinkSink byteLinkSink = ByteLinkSink.getInstance(this.mCastContext);
        this.mByteLinkSink = byteLinkSink;
        byteLinkSink.setOnLogMonitor(this);
        this.mByteLinkSink.setLogLevel(4);
        try {
            Class.forName("com.byted.cast.render.MediaRender");
            this.mMediaRenderExists = bool;
        } catch (Exception unused) {
            this.mMediaRenderExists = Boolean.FALSE;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mMediaRenderExists=");
        LIZ.append(this.mMediaRenderExists);
        castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
    }

    private void setDebugMode(boolean z) {
        ByteLinkSink byteLinkSink;
        int i;
        if (z) {
            byteLinkSink = this.mByteLinkSink;
            i = 3;
        } else {
            byteLinkSink = this.mByteLinkSink;
            i = 5;
        }
        byteLinkSink.setLogLevel(i);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void addCastIdListener(ICastIdListener iCastIdListener) {
        ZZS.LIZ(this, iCastIdListener);
    }

    public com.byted.cast.common.sink.CastInfo conversionCastInfo(CastInfo castInfo) {
        com.byted.cast.common.sink.CastInfo castInfo2 = new com.byted.cast.common.sink.CastInfo();
        if (castInfo != null) {
            castInfo2 = new com.byted.cast.common.sink.CastInfo();
            castInfo2.sourceDeviceType = castInfo.sourceDeviceType;
            castInfo2.protocol = castInfo.protocol;
            castInfo2.mediaArtist = castInfo.mediaArtist;
            castInfo2.mediaAlbumUrl = castInfo.mediaAlbumUrl;
            castInfo2.mediaAlbum = castInfo.mediaAlbum;
            castInfo2.audioSessionId = castInfo.audioSessionId;
            castInfo2.handleInside = castInfo.handleInside;
            castInfo2.clientID = castInfo.clientID;
            castInfo2.connectID = castInfo.token;
            castInfo2.castType = 2;
            castInfo2.infoType = castInfo.infoType;
            castInfo2.url = castInfo.url;
            castInfo2.mediaTitle = castInfo.mediaTitle;
            castInfo2.mimeType = castInfo.mimeType;
            if (castInfo.startInfo != null) {
                CastInfo.StartInfo startInfo = new CastInfo.StartInfo();
                CastInfo.StartInfo startInfo2 = castInfo.startInfo;
                startInfo.width = startInfo2.width;
                startInfo.type = startInfo2.type;
                startInfo.height = startInfo2.height;
                startInfo.frameRate = startInfo2.frameRate;
                startInfo.bitRate = startInfo2.bitRate;
                castInfo2.startInfo = startInfo;
            }
            if (castInfo.stopInfo != null) {
                CastInfo.StopInfo stopInfo = new CastInfo.StopInfo();
                CastInfo.StopInfo stopInfo2 = castInfo.stopInfo;
                stopInfo.stopReason = stopInfo2.stopReason;
                stopInfo.stopDetail = stopInfo2.stopDetail;
                castInfo2.stopInfo = stopInfo;
            }
            if (castInfo.sizeInfo != null) {
                CastInfo.SizeInfo sizeInfo = new CastInfo.SizeInfo();
                CastInfo.SizeInfo sizeInfo2 = castInfo.sizeInfo;
                sizeInfo.width = sizeInfo2.width;
                sizeInfo.height = sizeInfo2.height;
                castInfo2.sizeInfo = sizeInfo;
            }
        }
        return castInfo2;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void deliverIntent(Intent intent) {
        ZZS.LIZIZ(this, intent);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void destroy() {
        this.mLogger.i("BytelinkSinkWrapper", "destroy");
        this.mByteLinkSink.destroy();
        this.mIsBinded = false;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ DeviceInfo getDeviceInfo(String str) {
        return ZZS.LIZJ(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public IMultipleActiveControl getMultipleActiveControl() {
        return this.mMultiActiveControl;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public IMultipleLoader getMultipleLoader() {
        return this.mLoader;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public Object getOption(int i, Object... objArr) {
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ List getRegisterList() {
        return ZZS.LJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public ServiceInfo getServiceInfo() {
        ServerInfo serverInfo = this.mByteLinkSink.getServerInfo();
        if (serverInfo == null) {
            return null;
        }
        ServiceInfo serviceInfo = new ServiceInfo();
        serviceInfo.enableVideoNativeDecode = this.mEnableVideoNativeDecode.booleanValue();
        serviceInfo.ip = "";
        serviceInfo.name = serverInfo.deviceName;
        serviceInfo.portMirror = serverInfo.serverPort;
        serviceInfo.width = serverInfo.width;
        serviceInfo.height = serverInfo.height;
        serviceInfo.fps = serverInfo.fps;
        serviceInfo.features = serverInfo.features;
        serviceInfo.deviceID = serverInfo.deviceID;
        serviceInfo.bytelinkVersion = (String) this.mByteLinkSink.getOption(32, "");
        return serviceInfo;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public Statistics getStatistics() {
        Statistics statistics = new Statistics();
        for (RTCStatistics.NetworkStatistics networkStatistics : this.mByteLinkSink.getStatistics().nx) {
            Statistics.NetworkStatistics networkStatistics2 = new Statistics.NetworkStatistics();
            networkStatistics2.ClientId = networkStatistics.userId;
            networkStatistics2.rtt = networkStatistics.videoRtt;
            statistics.nx.add(networkStatistics2);
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getStatistics client:");
            LIZ.append(networkStatistics2.ClientId);
            LIZ.append(" rtt=");
            LIZ.append(networkStatistics2.rtt);
            castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
        }
        return statistics;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public String getVersion() {
        Object option = this.mByteLinkSink.getOption(32, new Object());
        return option instanceof String ? String.valueOf(option) : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r10 != null) goto L37;
     */
    @Override // com.byted.cast.common.api.ICastSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r9, com.byted.cast.common.config.Config r10, com.byted.cast.common.config.IInitListener r11) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sink.api.BytelinkSinkWrapper.init(android.content.Context, com.byted.cast.common.config.Config, com.byted.cast.common.config.IInitListener):void");
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void notifyPreempt(boolean z, com.byted.cast.common.sink.ClientInfo clientInfo) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyPreempt:");
        LIZ.append(z);
        LIZ.append(", mState:");
        LIZ.append(this.mState);
        LIZ.append(", clientInfo:");
        LIZ.append(clientInfo);
        castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
        if (this.mState == 100) {
            this.mLogger.d("BytelinkSinkWrapper", "notifyPreempt, no need preempt");
            return;
        }
        ClientInfo clientInfo2 = new ClientInfo();
        clientInfo2.clientID = clientInfo.clientID;
        clientInfo2.name = clientInfo.name;
        clientInfo2.icon = clientInfo.icon;
        clientInfo2.sourceType = clientInfo.sourceType;
        clientInfo2.mirrorSourceType = clientInfo.mirrorSourceType;
        clientInfo2.ip = clientInfo.ip;
        this.mByteLinkSink.notifyPreempt(z, clientInfo2);
    }

    @Override // com.byted.cast.sink.api.IOnLogMonitor
    public void onLogMonitor(String str, String[][] strArr) {
        this.mMonitor.sendCustomEvent("ByteLinkMonitor", str, strArr);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void requestIdrFromSource(com.byted.cast.common.sink.CastInfo castInfo) {
        ByteLinkSink byteLinkSink = this.mByteLinkSink;
        if (byteLinkSink != null) {
            byteLinkSink.requestIdrFromSource(castInfo.clientID);
        }
    }

    @Override // com.byted.cast.common.api.ICastSink
    public boolean reverseConnect(String str, int i) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reverseConnect: ip=");
        LIZ.append(str);
        LIZ.append(", port=");
        LIZ.append(i);
        castLogger.i("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
        return this.mByteLinkSink.reverseConnect(str, i);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public boolean reverseDisconnect() {
        this.mLogger.i("BytelinkSinkWrapper", "reverseDisconnect");
        return this.mByteLinkSink.reverseDisconnect();
    }

    @Override // com.byted.cast.common.api.ICastSink
    public boolean reverseInvite() {
        this.mLogger.i("BytelinkSinkWrapper", "reverseInvite");
        return this.mByteLinkSink.reverseInvite();
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void send(com.byted.cast.common.sink.CastInfo castInfo, String str, ISendResultListener iSendResultListener) {
        ByteLinkSink byteLinkSink = this.mByteLinkSink;
        if (byteLinkSink != null) {
            byteLinkSink.sendMetaData(castInfo.clientID, str);
        }
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void send(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
        ZZS.LJIILL(this, serviceInfo, str, iSendResultListener);
    }

    public void sendSinkEvent(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("sourceMirrorVersion", this.mSourceMirrorVersion);
            jSONObject.put("sinkMirrorVersion", "3.10.2.1.overseas-tt");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSinkEvent, event:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(jSONObject);
        castLogger.v("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
        Monitor.sendCustomEvent("sink", str, jSONObject.toString(), this.mConnectId, this.mBrowseId);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ String sendSync(ServiceInfo serviceInfo, String str) {
        return ZZS.LJIILLIIL(this, serviceInfo, str);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setActionListener(IActionListener iActionListener) {
        ZZS.LJIIZILJ(this, iActionListener);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setBrowseDataListener(IBrowseDataListener iBrowseDataListener) {
        ZZS.LJIJ(this, iBrowseDataListener);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setLogEnabled(boolean z) {
        ZZS.LJIJI(this, z);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void setMediaServiceEnable(boolean z) {
        if (z) {
            this.mByteLinkSink.setOption(25, Boolean.TRUE);
        }
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void setMediaServiceListener(IMediaServiceListener iMediaServiceListener) {
        this.mMediaServiceListener = iMediaServiceListener;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void setMessageListener(IMessageListener iMessageListener) {
        this.mMessageListener = iMessageListener;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void setMirrorListener(IMirrorListener iMirrorListener) {
        this.mMirrorListener = iMirrorListener;
        this.bUseOldInterface = false;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public Object setOption(int i, Object... objArr) {
        if (i == 10026) {
            Object obj = objArr[0];
            if (!(obj instanceof Boolean)) {
                return null;
            }
            Object obj2 = objArr[1];
            if (!(obj2 instanceof IAudioDataListener)) {
                return null;
            }
            this.mAutoPlayAudio = (Boolean) obj;
            this.mAudioDataListener = (IAudioDataListener) obj2;
        } else if (i == 10028) {
            Object obj3 = objArr[0];
            if (!(obj3 instanceof Boolean)) {
                return null;
            }
            Object obj4 = objArr[1];
            if (!(obj4 instanceof Boolean)) {
                return null;
            }
            Object obj5 = objArr[2];
            if (!(obj5 instanceof ISinkDataListener)) {
                return null;
            }
            this.mCallbackDataToUser = (Boolean) obj3;
            this.mEnablePlaying = (Boolean) obj4;
            this.mSinkDataListener = (ISinkDataListener) obj5;
        } else {
            if (i != 10032) {
                if (i != 10079) {
                    ByteLinkSink byteLinkSink = this.mByteLinkSink;
                    if (byteLinkSink == null) {
                        return null;
                    }
                    byteLinkSink.setOption(i, objArr);
                    return null;
                }
                Object obj6 = objArr[0];
                if (!(obj6 instanceof Application)) {
                    return null;
                }
                this.mApplication = (Application) obj6;
                CastLogger castLogger = this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OPTION_SET_APPLICATION:");
                LIZ.append(this.mApplication);
                castLogger.i("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
                return null;
            }
            Object obj7 = objArr[0];
            if (!(obj7 instanceof Boolean)) {
                return null;
            }
            this.mEnableVideoNativeDecode = (Boolean) obj7;
        }
        this.bUseOldInterface = true;
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void setPreemptListener(com.byted.cast.common.sink.IPreemptListener iPreemptListener) {
        this.mByteLinkSink.setPreemptListener(new g(this, iPreemptListener));
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setPrivateChannel(String str) {
        ZZS.LJJII(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setReverseControl(IReverseControl iReverseControl) {
        ZZS.LJJIII(this, iReverseControl);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void setServerListener(com.byted.cast.common.api.IServerListener iServerListener) {
        this.mServerListener = iServerListener;
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setServerListener(com.byted.cast.common.sink.IServerListener iServerListener) {
        ZZS.LJJIIJ(this, iServerListener);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setSourceDeviceInfoListener(ISourceDeviceInfoListener iSourceDeviceInfoListener) {
        ZZS.LJJIIJZLJL(this, iSourceDeviceInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void setSsdpPrivateChannel(String str) {
        ZZS.LJJIIZ(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void startServer(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startService:");
        LIZ.append(str);
        castLogger.i("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
        this.mByteLinkSink.startServer(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("serviceName", str);
            jSONObject.put("protocol", "ByteLink");
            sendSinkEvent("bytecast_start_server", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void startSsdpServer(String str) {
        ZZS.LJJIIZI(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public void stopServer() {
        this.mLogger.i("BytelinkSinkWrapper", "stopServer");
        this.mByteLinkSink.stopServer();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("protocol", "ByteLink");
            sendSinkEvent("bytecast_stop_server", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void stopSsdpServer() {
        ZZS.LJJIJ(this);
    }

    @Override // com.byted.cast.common.api.ICastSink
    public final /* synthetic */ void upDateServerName(String str) {
        ZZS.LJJIJIIJI(this, str);
    }

    /* loaded from: classes29.dex */
    public class d implements IServerListener {
        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, String str, String str2) {
            com.byted.cast.common.api.IServerListener iServerListener = BytelinkSinkWrapper.this.mServerListener;
            if (iServerListener != null) {
                iServerListener.onSinkLatencyStat(i, str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, String str, String str2) {
            com.byted.cast.common.api.IServerListener iServerListener = BytelinkSinkWrapper.this.mServerListener;
            if (iServerListener != null) {
                iServerListener.onSinkStuckStat(i, str, str2);
            }
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onCast(int i, CastInfo castInfo) {
            BytelinkSinkWrapper bytelinkSinkWrapper;
            int i2;
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCast, id:");
            LIZ.append(i);
            LIZ.append(", ");
            LIZ.append(castInfo);
            LIZ.append(", infoType:");
            LIZ.append(castInfo.infoType);
            castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            switch (castInfo.infoType) {
                case 100:
                    bytelinkSinkWrapper = BytelinkSinkWrapper.this;
                    i2 = 101;
                    break;
                case 101:
                    bytelinkSinkWrapper = BytelinkSinkWrapper.this;
                    i2 = 102;
                    break;
                case 102:
                    bytelinkSinkWrapper = BytelinkSinkWrapper.this;
                    i2 = 100;
                    break;
            }
            bytelinkSinkWrapper.mState = i2;
            BytelinkSinkWrapper bytelinkSinkWrapper2 = BytelinkSinkWrapper.this;
            if (bytelinkSinkWrapper2.mServerListener != null) {
                bytelinkSinkWrapper2.mainThreadExecutor.execute(new RunnableC0010d(castInfo, i));
            }
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onConnect(int i, ClientInfo clientInfo) {
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onConnect, id:");
            LIZ.append(i);
            castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            BytelinkSinkWrapper.this.mainThreadExecutor.execute(new e(clientInfo, i));
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onDisconnect(int i, ClientInfo clientInfo) {
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDisconnect, id:");
            LIZ.append(i);
            castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            BytelinkSinkWrapper.this.mainThreadExecutor.execute(new f(clientInfo, i));
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onError(int i, int i2, int i3, String str) {
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError, serviceId:");
            LIZ.append(i);
            LIZ.append(", what:");
            LIZ.append(i2);
            LIZ.append(", extra:");
            LIZ.append(i3);
            castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            BytelinkSinkWrapper bytelinkSinkWrapper = BytelinkSinkWrapper.this;
            if (bytelinkSinkWrapper.mServerListener != null) {
                bytelinkSinkWrapper.mainThreadExecutor.execute(new c(i, i2, i3, str));
            }
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onFirstVideoFrame(String str) {
            BytelinkSinkWrapper.this.mLogger.i("BytelinkSinkWrapper", "onFirstVideoFrame");
            BytelinkSinkWrapper.this.mFirstVideoFrameTimeMs = System.nanoTime() / 1000000;
            BytelinkSinkWrapper bytelinkSinkWrapper = BytelinkSinkWrapper.this;
            long j = bytelinkSinkWrapper.mFirstVideoFrameTimeMs - bytelinkSinkWrapper.mVideoStartTimeMs;
            if (j > 10000) {
                j = 1;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("total_delay", j);
                jSONObject.put("protocol", "ByteLink");
                jSONObject.put("userId", MD5.hexdigest(str));
                BytelinkSinkWrapper.this.sendSinkEvent("loadMirror", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onMonitorEvent(String str, String str2) {
            try {
                BytelinkSinkWrapper.this.sendSinkEvent(str, new JSONObject(str2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00dd  */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00db -> B:12:0x00e7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00dd -> B:12:0x00e7). Please report as a decompilation issue!!! */
        @Override // com.byted.cast.sink.api.IServerListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onRecvMetaData(int r9, com.byted.cast.sink.api.ClientInfo r10, java.lang.String r11) {
            /*
                r8 = this;
                java.lang.String r5 = "browseId"
                java.lang.String r6 = "connectId"
                com.byted.cast.sink.api.BytelinkSinkWrapper r0 = com.byted.cast.sink.api.BytelinkSinkWrapper.this
                com.byted.cast.common.CastLogger r2 = r0.mLogger
                java.lang.StringBuilder r1 = X.X1D.LIZ()
                java.lang.String r0 = "onRecvMetaData, meta:"
                r1.append(r0)
                r1.append(r11)
                java.lang.String r0 = X.X1D.LIZIZ(r1)
                java.lang.String r3 = "BytelinkSinkWrapper"
                r2.i(r3, r0)
                r2 = 1
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lce
                r7.<init>(r11)     // Catch: org.json.JSONException -> Lce
                java.lang.String r0 = "cmd"
                java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r7, r0)     // Catch: org.json.JSONException -> Lce
                java.lang.String r0 = "setConnectId"
                boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: org.json.JSONException -> Lce
                r4 = 0
                if (r0 == 0) goto L90
                com.byted.cast.sink.api.BytelinkSinkWrapper r1 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r7, r6)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper.access$1302(r1, r0)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper r1 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r7, r5)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper.access$1402(r1, r0)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper r1 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = "mirrorVersion"
                java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r7, r0)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper.access$1502(r1, r0)     // Catch: org.json.JSONException -> Ld0
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld0
                r4.<init>()     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper r0 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = r0.mConnectId     // Catch: org.json.JSONException -> Ld0
                r4.put(r6, r0)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper r0 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = r0.mBrowseId     // Catch: org.json.JSONException -> Ld0
                r4.put(r5, r0)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper r0 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.common.sink.ClientInfo r0 = r0.mClientInfo     // Catch: org.json.JSONException -> Ld0
                if (r0 == 0) goto L71
                java.lang.String r1 = "clientInfo"
                java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> Ld0
                r4.put(r1, r0)     // Catch: org.json.JSONException -> Ld0
            L71:
                com.byted.cast.sink.api.BytelinkSinkWrapper r0 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.common.CastLogger r2 = r0.mLogger     // Catch: org.json.JSONException -> Ld0
                java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = "send onConnect event:"
                r1.append(r0)     // Catch: org.json.JSONException -> Ld0
                r1.append(r4)     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: org.json.JSONException -> Ld0
                r2.i(r3, r0)     // Catch: org.json.JSONException -> Ld0
                com.byted.cast.sink.api.BytelinkSinkWrapper r1 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Ld0
                java.lang.String r0 = "bytelink_onConnect"
                r1.sendSinkEvent(r0, r4)     // Catch: org.json.JSONException -> Ld0
                goto Le7
            L90:
                java.lang.String r0 = "inviteAccepted"
                boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: org.json.JSONException -> Lce
                if (r0 == 0) goto Laf
                com.byted.cast.sink.api.BytelinkSinkWrapper r0 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Lce
                com.byted.cast.common.CastLogger r1 = r0.mLogger     // Catch: org.json.JSONException -> Lce
                java.lang.String r0 = "onRecvMetaData: Invite Cast Accepted"
                r1.i(r3, r0)     // Catch: org.json.JSONException -> Lce
                com.byted.cast.sink.api.BytelinkSinkWrapper r1 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Lce
                boolean r0 = r1.bUseOldInterface     // Catch: org.json.JSONException -> Lce
                if (r0 != 0) goto Ld7
                com.byted.cast.common.sink.IMirrorListener r0 = r1.mMirrorListener     // Catch: org.json.JSONException -> Lce
                if (r0 == 0) goto Ld7
                r0.onInviteResult(r2)     // Catch: org.json.JSONException -> Lce
                goto Le7
            Laf:
                java.lang.String r0 = "inviteDenied"
                boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: org.json.JSONException -> Lce
                if (r0 == 0) goto Ld7
                com.byted.cast.sink.api.BytelinkSinkWrapper r0 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Lce
                com.byted.cast.common.CastLogger r1 = r0.mLogger     // Catch: org.json.JSONException -> Lce
                java.lang.String r0 = "onRecvMetaData: Invite Cast Denied"
                r1.i(r3, r0)     // Catch: org.json.JSONException -> Lce
                com.byted.cast.sink.api.BytelinkSinkWrapper r1 = com.byted.cast.sink.api.BytelinkSinkWrapper.this     // Catch: org.json.JSONException -> Lce
                boolean r0 = r1.bUseOldInterface     // Catch: org.json.JSONException -> Lce
                if (r0 != 0) goto Ld7
                com.byted.cast.common.sink.IMirrorListener r0 = r1.mMirrorListener     // Catch: org.json.JSONException -> Lce
                if (r0 == 0) goto Ld7
                r0.onInviteResult(r4)     // Catch: org.json.JSONException -> Lce
                goto Le7
            Lce:
                r0 = move-exception
                goto Ld2
            Ld0:
                r0 = move-exception
                r2 = 0
            Ld2:
                r0.printStackTrace()
                if (r2 == 0) goto Le7
            Ld7:
                com.byted.cast.sink.api.BytelinkSinkWrapper r1 = com.byted.cast.sink.api.BytelinkSinkWrapper.this
                com.byted.cast.common.sink.IMessageListener r0 = r1.mMessageListener
                if (r0 == 0) goto Le7
                com.byted.cast.common.MainThreadExecutor r1 = r1.mainThreadExecutor
                com.byted.cast.sink.api.BytelinkSinkWrapper$d$g r0 = new com.byted.cast.sink.api.BytelinkSinkWrapper$d$g
                r0.<init>(r10, r11)
                r1.execute(r0)
            Le7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sink.api.BytelinkSinkWrapper.d.onRecvMetaData(int, com.byted.cast.sink.api.ClientInfo, java.lang.String):void");
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onSinkLatencyStat(final int i, final String str, final String str2) {
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSinkLatencyStat:");
            LIZ.append(str2);
            castLogger.v("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            BytelinkSinkWrapper.this.mainThreadExecutor.execute(new Runnable() { // from class: X.Zai
                @Override // java.lang.Runnable
                public final void run() {
                    BytelinkSinkWrapper.d.this.a(i, str, str2);
                }
            });
            try {
                BytelinkSinkWrapper.this.sendSinkEvent("bytelink_latency_stat", new JSONObject(str2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onSinkStuckStat(final int i, final String str, final String str2) {
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSinkStuckStat:");
            LIZ.append(str2);
            castLogger.i("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            BytelinkSinkWrapper.this.mainThreadExecutor.execute(new Runnable() { // from class: X.Zah
                @Override // java.lang.Runnable
                public final void run() {
                    BytelinkSinkWrapper.d.this.b(i, str, str2);
                }
            });
            try {
                BytelinkSinkWrapper.this.sendSinkEvent("bytelink_stuck_stat", new JSONObject(str2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onStart(int i, ServerInfo serverInfo) {
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("server started, devicename:");
            LIZ.append(serverInfo.deviceName);
            LIZ.append(", port:");
            LIZ.append(serverInfo.serverPort);
            castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            BytelinkSinkWrapper.this.mainThreadExecutor.execute(new a(serverInfo, i));
        }

        @Override // com.byted.cast.sink.api.IServerListener
        public void onStop(int i) {
            BytelinkSinkWrapper.this.mLogger.d("BytelinkSinkWrapper", "server stopped.");
            BytelinkSinkWrapper bytelinkSinkWrapper = BytelinkSinkWrapper.this;
            if (bytelinkSinkWrapper.mServerListener != null) {
                bytelinkSinkWrapper.mainThreadExecutor.execute(new b(i));
            }
        }

        /* loaded from: classes29.dex */
        public class a implements Runnable {
            public final /* synthetic */ ServerInfo a;
            public final /* synthetic */ int b;

            public a(ServerInfo serverInfo, int i) {
                this.a = serverInfo;
                this.b = i;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$d$a__run$___twin___() {
                if (this.a == null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("what", 1000);
                        jSONObject.put("code", 10010002);
                        jSONObject.put("msg", "serviceinfo is null");
                        jSONObject.put("serviceId", this.b);
                        jSONObject.put("protocol", "ByteLink");
                        BytelinkSinkWrapper.this.sendSinkEvent("bytecast_start_server_failure", jSONObject);
                        return;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                com.byted.cast.common.sink.ServerInfo serverInfo = new com.byted.cast.common.sink.ServerInfo();
                ServerInfo serverInfo2 = this.a;
                serverInfo.surfaceType = serverInfo2.surfaceType;
                serverInfo.showFps = serverInfo2.showFps;
                serverInfo.serviceStatus = serverInfo2.serviceStatus;
                serverInfo.serverPort = serverInfo2.serverPort;
                serverInfo.resolution = serverInfo2.resolution;
                serverInfo.remotePort = serverInfo2.remotePort;
                serverInfo.playerType = serverInfo2.playerType;
                serverInfo.networkName = serverInfo2.networkName;
                serverInfo.netDelay = serverInfo2.netDelay;
                serverInfo.maxFps = serverInfo2.maxFps;
                serverInfo.localPreemptModel = serverInfo2.localPreemptModel;
                serverInfo.language = serverInfo2.language;
                serverInfo.forceResetMirrorPlayer = serverInfo2.forceResetMirrorPlayer;
                serverInfo.displayMode = serverInfo2.displayMode;
                serverInfo.deviceName = serverInfo2.deviceName;
                serverInfo.cloudPreemptModel = serverInfo2.cloudPreemptModel;
                serverInfo.aliasName = "ByteLink";
                BytelinkSinkWrapper.this.mServerListener.onStart(this.b, serverInfo);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("serviceId", this.b);
                    jSONObject2.put("serviceInfo", serverInfo);
                    jSONObject2.put("protocol", "ByteLink");
                    jSONObject2.put("serverPort", serverInfo.serverPort);
                    BytelinkSinkWrapper.this.sendSinkEvent("bytecast_start_server_success", jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$d$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$d$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(a aVar) {
                boolean LIZ;
                try {
                    aVar.com_byted_cast_sink_api_BytelinkSinkWrapper$d$a__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }

        /* loaded from: classes29.dex */
        public class b implements Runnable {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$d$b__run$___twin___() {
                BytelinkSinkWrapper.this.mServerListener.onStop(this.a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("serviceId", this.a);
                    BytelinkSinkWrapper.this.sendSinkEvent("bytelink_server_onStop", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$d$b_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$d$b_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(b bVar) {
                boolean LIZ;
                try {
                    bVar.com_byted_cast_sink_api_BytelinkSinkWrapper$d$b__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }

        /* loaded from: classes29.dex */
        public class c implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ String d;

            public c(int i, int i2, int i3, String str) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = str;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$d$c__run$___twin___() {
                BytelinkSinkWrapper bytelinkSinkWrapper;
                String str;
                BytelinkSinkWrapper.this.mServerListener.onError(this.a, this.b, this.c);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("what", this.b);
                    jSONObject.put("code", this.c);
                    jSONObject.put("msg", this.d);
                    jSONObject.put("serviceId", this.a);
                    jSONObject.put("protocol", "ByteLink");
                    if (this.b == 1000 && this.c == 10010001) {
                        bytelinkSinkWrapper = BytelinkSinkWrapper.this;
                        str = "bytecast_start_server_failure";
                    } else {
                        bytelinkSinkWrapper = BytelinkSinkWrapper.this;
                        str = "bytelink_onError";
                    }
                    bytelinkSinkWrapper.sendSinkEvent(str, jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$d$c_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$d$c_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(c cVar) {
                boolean LIZ;
                try {
                    cVar.com_byted_cast_sink_api_BytelinkSinkWrapper$d$c__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }

        /* renamed from: com.byted.cast.sink.api.BytelinkSinkWrapper$d$d, reason: collision with other inner class name */
        /* loaded from: classes29.dex */
        public class RunnableC0010d implements Runnable {
            public final /* synthetic */ CastInfo a;
            public final /* synthetic */ int b;

            public RunnableC0010d(CastInfo castInfo, int i) {
                this.a = castInfo;
                this.b = i;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$d$d__run$___twin___() {
                BytelinkSinkWrapper bytelinkSinkWrapper;
                String str;
                CastInfo castInfo = this.a;
                castInfo.protocol = 3;
                com.byted.cast.common.sink.CastInfo conversionCastInfo = BytelinkSinkWrapper.this.conversionCastInfo(castInfo);
                CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onCast, castInfo: ");
                LIZ.append(this.a);
                LIZ.append(" infoType:");
                LIZ.append(this.a.infoType);
                castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
                CastLogger castLogger2 = BytelinkSinkWrapper.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onCast, info: ");
                LIZ2.append(conversionCastInfo);
                LIZ2.append(" hashcode:");
                LIZ2.append(conversionCastInfo.hashCode());
                castLogger2.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ2));
                BytelinkSinkWrapper.this.mServerListener.onCast(this.b, conversionCastInfo);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("castInfo", conversionCastInfo);
                    jSONObject.put("protocol", "ByteLink");
                    jSONObject.put("userId", MD5.hexdigest(this.a.clientID.split("_")[0].trim()));
                    int i = this.a.infoType;
                    long j = 0;
                    if (i != 100) {
                        if (i == 102) {
                            long nanoTime = System.nanoTime() / 1000000;
                            long j2 = BytelinkSinkWrapper.this.mFirstVideoFrameTimeMs;
                            if (j2 != 0) {
                                long j3 = nanoTime - j2;
                                if (j3 >= 0) {
                                    j = j3;
                                }
                            }
                            jSONObject.put("total_duration", j);
                            bytelinkSinkWrapper = BytelinkSinkWrapper.this;
                            str = "bytecast_oncast_stop";
                        }
                        BytelinkSinkWrapper.this.sendSinkEvent("bytelink_onCast", jSONObject);
                    }
                    BytelinkSinkWrapper.this.mFirstVideoFrameTimeMs = 0L;
                    BytelinkSinkWrapper.this.mVideoStartTimeMs = System.nanoTime() / 1000000;
                    bytelinkSinkWrapper = BytelinkSinkWrapper.this;
                    str = "bytecast_on_cast_request";
                    bytelinkSinkWrapper.sendSinkEvent(str, jSONObject);
                    BytelinkSinkWrapper.this.sendSinkEvent("bytelink_onCast", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$d$d_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$d$d_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC0010d runnableC0010d) {
                boolean LIZ;
                try {
                    runnableC0010d.com_byted_cast_sink_api_BytelinkSinkWrapper$d$d__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }

        /* loaded from: classes29.dex */
        public class e implements Runnable {
            public final /* synthetic */ ClientInfo a;
            public final /* synthetic */ int b;

            public e(ClientInfo clientInfo, int i) {
                this.a = clientInfo;
                this.b = i;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$d$e__run$___twin___() {
                com.byted.cast.common.sink.ClientInfo clientInfo;
                if (this.a != null) {
                    clientInfo = new com.byted.cast.common.sink.ClientInfo();
                    ClientInfo clientInfo2 = this.a;
                    clientInfo.clientID = clientInfo2.clientID;
                    clientInfo.ip = clientInfo2.ip;
                    clientInfo.name = clientInfo2.name;
                    clientInfo.mirrorSourceType = clientInfo2.mirrorSourceType;
                } else {
                    clientInfo = null;
                }
                com.byted.cast.common.api.IServerListener iServerListener = BytelinkSinkWrapper.this.mServerListener;
                if (iServerListener != null) {
                    iServerListener.onConnect(this.b, clientInfo);
                }
                CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on connect id:");
                LIZ.append(this.b);
                LIZ.append(",info:");
                LIZ.append(clientInfo);
                castLogger.d("ServerListener", X1D.LIZIZ(LIZ));
                BytelinkSinkWrapper.this.mClientInfo = clientInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$d$e_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$d$e_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(e eVar) {
                boolean LIZ;
                try {
                    eVar.com_byted_cast_sink_api_BytelinkSinkWrapper$d$e__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }

        /* loaded from: classes29.dex */
        public class f implements Runnable {
            public final /* synthetic */ ClientInfo a;
            public final /* synthetic */ int b;

            public f(ClientInfo clientInfo, int i) {
                this.a = clientInfo;
                this.b = i;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$d$f__run$___twin___() {
                com.byted.cast.common.sink.ClientInfo clientInfo;
                if (this.a != null) {
                    clientInfo = new com.byted.cast.common.sink.ClientInfo();
                    ClientInfo clientInfo2 = this.a;
                    clientInfo.clientID = clientInfo2.clientID;
                    clientInfo.ip = clientInfo2.ip;
                    clientInfo.name = clientInfo2.name;
                    clientInfo.mirrorSourceType = clientInfo2.mirrorSourceType;
                } else {
                    clientInfo = null;
                }
                com.byted.cast.common.api.IServerListener iServerListener = BytelinkSinkWrapper.this.mServerListener;
                if (iServerListener != null) {
                    iServerListener.onDisconnect(this.b, clientInfo);
                }
                CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on disconnect id:");
                LIZ.append(this.b);
                LIZ.append(",info:");
                LIZ.append(clientInfo);
                castLogger.d("ServerListener", X1D.LIZIZ(LIZ));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("clientInfo", clientInfo);
                    BytelinkSinkWrapper.this.sendSinkEvent("bytelink_onDisConnect", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$d$f_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$d$f_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(f fVar) {
                boolean LIZ;
                try {
                    fVar.com_byted_cast_sink_api_BytelinkSinkWrapper$d$f__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }

        /* loaded from: classes29.dex */
        public class g implements Runnable {
            public final /* synthetic */ ClientInfo a;
            public final /* synthetic */ String b;

            public g(ClientInfo clientInfo, String str) {
                this.a = clientInfo;
                this.b = str;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$d$g__run$___twin___() {
                ServiceInfo serviceInfo = new ServiceInfo();
                ClientInfo clientInfo = this.a;
                serviceInfo.ip = clientInfo.ip;
                serviceInfo.name = clientInfo.name;
                BytelinkSinkWrapper.this.mMessageListener.onMessage(serviceInfo, this.b);
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$d$g_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$d$g_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(g gVar) {
                boolean LIZ;
                try {
                    gVar.com_byted_cast_sink_api_BytelinkSinkWrapper$d$g__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }
    }

    /* loaded from: classes29.dex */
    public class e implements IMultipleReverseControl {
        public e() {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public int getCurrentPosition(String str) {
            return 0;
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public int getDuration(String str) {
            return 0;
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public void lowerVolume(String str) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public boolean pause(String str) {
            return false;
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public void raiseVolume(String str) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public void seekTo(String str, int i) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public void sendMetaData(String str) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public void setVolume(String str, int i) {
            CastLogger castLogger = BytelinkSinkWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVolume: ");
            LIZ.append(i);
            castLogger.d("BytelinkSinkWrapper", X1D.LIZIZ(LIZ));
            BytelinkSinkWrapper.this.mainThreadExecutor.execute(new a(str, i));
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public boolean start(String str) {
            return false;
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleReverseControl
        public boolean stop(String str) {
            return false;
        }

        /* loaded from: classes29.dex */
        public class a implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ int b;

            public a(String str, int i) {
                this.a = str;
                this.b = i;
            }

            public void com_byted_cast_sink_api_BytelinkSinkWrapper$e$a__run$___twin___() {
                IMirrorListener iMirrorListener = BytelinkSinkWrapper.this.mMirrorListener;
                if (iMirrorListener != null) {
                    iMirrorListener.onVolume(this.a, this.b);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("sessionId", this.a);
                        jSONObject.put("volume", this.b);
                        BytelinkSinkWrapper.this.sendSinkEvent("bytelink_onVolume", jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_sink_api_BytelinkSinkWrapper$e$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_sink_api_BytelinkSinkWrapper$e$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(a aVar) {
                boolean LIZ;
                try {
                    aVar.com_byted_cast_sink_api_BytelinkSinkWrapper$e$a__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }
    }
}
