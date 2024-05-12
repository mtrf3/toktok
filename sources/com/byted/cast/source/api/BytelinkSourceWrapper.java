package com.byted.cast.source.api;

import X.X1D;
import X.ZZT;
import android.content.Context;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.CommonOptionConstants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.MainThreadExecutor;
import com.byted.cast.common.api.FirewallError;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.IGetDeviceInfoListener;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IPlayerListener;
import com.byted.cast.common.api.IRegisterResultListener;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.ISendResultListener;
import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.IWriteCacheListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DanmakuSetting;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.bean.Resolution;
import com.byted.cast.common.bean.Speed;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.config.IMediaInfoListener;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.byted.cast.sdk.RTCStatistics;
import com.byted.cast.sdk.RTCVideoProfile;
import com.byted.cast.source.browser.api.ByteLinkServiceInfo;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class BytelinkSourceWrapper implements ICastSource {
    public ByteLinkSource bytelinkSource;
    public ByteLinkServiceInfo mBrowseServiceInfo;
    public IBrowseListener mBrowserListener;
    public ContextManager.CastContext mCastContext;
    public Context mContext;
    public IInitListener mIInitListener;
    public ByteLinkServiceInfo mLinkServiceInfo;
    public CastLogger mLogger;
    public IMessageListener mMessageListener;
    public IMirrorListener mMirrorListener;
    public CastMonitor mMonitor;
    public ServiceInfo mServiceInfo;
    public MainThreadExecutor mainThreadExecutor = new MainThreadExecutor();
    public String mDeviceId = "";
    public String nsd_service_name = "";
    public boolean mIsBinded = false;
    public int nsd_server_port = 3230;
    public ByteLinkPlayerInfo mPlayerInfo = new ByteLinkPlayerInfo();
    public boolean bConnectByUser = false;
    public boolean isFirstDevice = true;
    public boolean isStartBrowse = false;
    public List<ByteLinkServiceInfo> mInfoList = new ArrayList();
    public boolean browseEnabled = false;
    public String mMirrorConnectId = "";
    public IConnectListener connectListener = new a();
    public com.byted.cast.source.browser.api.IBrowseListener browseListener = new b();
    public IByteLinkPlayerListener playListener = new c();

    /* loaded from: classes29.dex */
    public class a implements IConnectListener {
        public a() {
        }

        @Override // com.byted.cast.source.api.IConnectListener
        public void onConnect(ByteLinkServiceInfo byteLinkServiceInfo, int i) {
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onConnect ");
            LIZ.append(byteLinkServiceInfo);
            LIZ.append(" extra ");
            LIZ.append(i);
            LIZ.append(", mServiceInfo:");
            LIZ.append(BytelinkSourceWrapper.this.mServiceInfo);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            if (bytelinkSourceWrapper.bConnectByUser) {
                bytelinkSourceWrapper.mLinkServiceInfo = byteLinkServiceInfo;
                BytelinkSourceWrapper.this.mServiceInfo.height = byteLinkServiceInfo.getHeight();
                BytelinkSourceWrapper.this.mServiceInfo.width = byteLinkServiceInfo.getWidth();
                BytelinkSourceWrapper.this.mServiceInfo.fps = byteLinkServiceInfo.getFps();
                BytelinkSourceWrapper.this.mServiceInfo.deviceID = byteLinkServiceInfo.getDeviceID();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cmd", "setConnectId");
                jSONObject.put("connectId", byteLinkServiceInfo.getConnectId());
                jSONObject.put("browseId", BytelinkSourceWrapper.this.mMonitor.getSourceMonitor().getBrowseId());
                jSONObject.put("mirrorVersion", "3.10.2.1.overseas-tt");
                jSONObject.put("deviceId", BytelinkSourceWrapper.this.mDeviceId);
                BytelinkSourceWrapper.this.bytelinkSource.sendMetaData(jSONObject.toString());
                jSONObject.put("serviceInfo", BytelinkSourceWrapper.this.mServiceInfo);
                CastLogger castLogger2 = BytelinkSourceWrapper.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sendConnectId, json:");
                LIZ2.append(jSONObject);
                castLogger2.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ2));
                BytelinkSourceWrapper.this.mMonitor.sendCustomEvent("source", "bytelink_BytelinkClient_sendCastToken", jSONObject.toString(), byteLinkServiceInfo.getConnectId());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            BytelinkSourceWrapper bytelinkSourceWrapper2 = BytelinkSourceWrapper.this;
            IMirrorListener iMirrorListener = bytelinkSourceWrapper2.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onConnect(bytelinkSourceWrapper2.mServiceInfo, i);
            }
        }

        @Override // com.byted.cast.source.api.IConnectListener
        public void onDisconnect(ByteLinkServiceInfo byteLinkServiceInfo, int i, int i2, String str) {
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDisconnect what: ");
            LIZ.append(i);
            LIZ.append(" extra: ");
            LIZ.append(i2);
            LIZ.append(", msg:");
            LIZ.append(str);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            BytelinkSourceWrapper.this.mLinkServiceInfo = null;
            BytelinkSourceWrapper.this.bConnectByUser = false;
            Dispatcher.getInstance().shutdownScheduleService(BytelinkSourceWrapper.this.mMonitor.sourceConnectID);
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            IMirrorListener iMirrorListener = bytelinkSourceWrapper.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onDisconnect(bytelinkSourceWrapper.mServiceInfo, i, i2);
            }
            BytelinkSourceWrapper bytelinkSourceWrapper2 = BytelinkSourceWrapper.this;
            bytelinkSourceWrapper2.mMonitor.sendCustomEvent("source", "bytelink_onDisConnect", bytelinkSourceWrapper2.getMonitorContent(i, i2, str, bytelinkSourceWrapper2.mServiceInfo), byteLinkServiceInfo.getConnectId());
        }

        @Override // com.byted.cast.source.api.IConnectListener
        public void onReadyToSwitch(ByteLinkServiceInfo byteLinkServiceInfo) {
            IMirrorListener iMirrorListener = BytelinkSourceWrapper.this.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onMirrorModeChange(byteLinkServiceInfo.get_RtcLink() ? 1 : 0);
            }
            BytelinkSourceWrapper.this.mLogger.i("BytelinkSourceWrapper", "onReadyToSwitch: ".concat(byteLinkServiceInfo.get_RtcLink() ? "rtclink" : "bytelink"));
            BytelinkSourceWrapper.this.bytelinkSource.connect(byteLinkServiceInfo);
        }
    }

    /* loaded from: classes29.dex */
    public class c implements IByteLinkPlayerListener {
        public c() {
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onCompletion() {
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onError(int i, int i2, String str) {
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError what:");
            LIZ.append(i);
            LIZ.append(" extra:");
            LIZ.append(i2);
            LIZ.append(", msg:");
            LIZ.append(str);
            castLogger.e("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            Dispatcher.getInstance().shutdownScheduleService(BytelinkSourceWrapper.this.mMonitor.sourceConnectID);
            IMirrorListener iMirrorListener = BytelinkSourceWrapper.this.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onError(3, 211005, i2, str);
            }
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            bytelinkSourceWrapper.mMonitor.sendCustomEvent("source", "bytelink_onError", bytelinkSourceWrapper.getMonitorContent(i, i2, str, bytelinkSourceWrapper.mServiceInfo), BytelinkSourceWrapper.this.mMirrorConnectId);
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onInfo(int i, int i2, String str) {
            IMirrorListener iMirrorListener = BytelinkSourceWrapper.this.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onInfo(3, i, i2, str);
            }
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            bytelinkSourceWrapper.mMonitor.sendCustomEvent("source", "bytelink_onInfo", bytelinkSourceWrapper.getMonitorContent(i, i2, str, bytelinkSourceWrapper.mServiceInfo), BytelinkSourceWrapper.this.mMirrorConnectId);
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onLoading() {
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onMonitorEvent(ByteLinkServiceInfo byteLinkServiceInfo, String str, String str2) {
            try {
                JSONObject jSONObject = TextUtils.isEmpty(str2) ? new JSONObject() : new JSONObject(str2);
                ServiceInfo serviceInfo = BytelinkSourceWrapper.this.mServiceInfo;
                jSONObject.put("serviceInfo", serviceInfo != null ? serviceInfo.toString() : "");
                jSONObject.put("mirrorVersion", "3.10.2.1.overseas-tt");
                String jSONObject2 = jSONObject.toString();
                CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onMonitorEvent, eventType:");
                LIZ.append(str);
                LIZ.append(", content:");
                LIZ.append(jSONObject2);
                castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
                BytelinkSourceWrapper.this.mMonitor.sendCustomEvent("source", str, jSONObject2, !TextUtils.isEmpty(byteLinkServiceInfo.getConnectId()) ? byteLinkServiceInfo.getConnectId() : BytelinkSourceWrapper.this.mMirrorConnectId);
            } catch (JSONException e) {
                CastLogger castLogger2 = BytelinkSourceWrapper.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onMonitorEvent error:");
                LIZ2.append(e);
                castLogger2.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ2));
            }
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onPause() {
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onPositionUpdate(long j, long j2) {
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onRecvMetaData(String str) {
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRecvMetaData: meta=");
            LIZ.append(str);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            IMessageListener iMessageListener = bytelinkSourceWrapper.mMessageListener;
            if (iMessageListener != null) {
                iMessageListener.onMessage(bytelinkSourceWrapper.mServiceInfo, str);
            }
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onRecvMetaData(String str, String str2) {
            JSONObject jSONObject;
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRecvMetaData: ip=");
            LIZ.append(str);
            LIZ.append("meta=");
            LIZ.append(str2);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (TextUtils.equals("invite", JSONObjectProtectorUtils.getString(jSONObject, "cmd"))) {
                int i = JSONObjectProtectorUtils.getInt(jSONObject, "port");
                if (((!TextUtils.isEmpty(str) && i > 0) || BytelinkSourceWrapper.this.mMirrorListener != null) && BytelinkSourceWrapper.this.mMirrorListener.onInvite(str, i)) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("cmd", "inviteAccepted");
                        BytelinkSourceWrapper.this.bytelinkSource.sendMetaData(str, jSONObject2.toString());
                        return;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("cmd", "inviteDenied");
                    BytelinkSourceWrapper.this.bytelinkSource.sendMetaData(str, jSONObject3.toString());
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                e.printStackTrace();
            }
            if (BytelinkSourceWrapper.this.mMessageListener != null) {
                ServiceInfo serviceInfo = new ServiceInfo();
                serviceInfo.ip = "reverseDisconnect";
                BytelinkSourceWrapper.this.mMessageListener.onMessage(serviceInfo, str2);
            }
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onSeekComplete(int i) {
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onStart() {
            BytelinkSourceWrapper.this.mLogger.i("BytelinkSourceWrapper", "onCastSuccess");
            IMirrorListener iMirrorListener = BytelinkSourceWrapper.this.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onStart(3);
            }
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onStat(String str) {
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStat:");
            LIZ.append(str);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            bytelinkSourceWrapper.mMonitor.sendCustomEvent("source", "bytelink_latency_stat", bytelinkSourceWrapper.getMonitorContentFromJson(str), BytelinkSourceWrapper.this.mMirrorConnectId);
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onStop() {
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStop, bConnectByUser=");
            LIZ.append(BytelinkSourceWrapper.this.bConnectByUser);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            Dispatcher.getInstance().shutdownScheduleService(BytelinkSourceWrapper.this.mMonitor.sourceConnectID);
            IMirrorListener iMirrorListener = BytelinkSourceWrapper.this.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onStop(3);
            }
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onStuckStat(String str) {
            CastLogger castLogger = BytelinkSourceWrapper.this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStuckStat:");
            LIZ.append(str);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            bytelinkSourceWrapper.mMonitor.sendCustomEvent("source", "bytelink_stuck_stat", bytelinkSourceWrapper.getMonitorContentFromJson(str), BytelinkSourceWrapper.this.mMirrorConnectId);
        }

        @Override // com.byted.cast.source.api.IByteLinkPlayerListener
        public void onVolumeChanged(float f) {
        }
    }

    /* loaded from: classes29.dex */
    public class d implements IByteLinkDisplayListener {
        public d(BytelinkSourceWrapper bytelinkSourceWrapper) {
        }

        @Override // com.byted.cast.source.api.IByteLinkDisplayListener
        public void onPaused() {
        }

        @Override // com.byted.cast.source.api.IByteLinkDisplayListener
        public void onResumed() {
        }

        @Override // com.byted.cast.source.api.IByteLinkDisplayListener
        public void onStopped() {
        }
    }

    public BytelinkSourceWrapper(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mMonitor = ContextManager.getMonitor(castContext);
        this.mLogger = ContextManager.getLogger(castContext);
        this.mPlayerInfo.setResolutionLevel(202);
        this.mPlayerInfo.setFps(60);
        this.mPlayerInfo.setAudioSource(3);
        this.mPlayerInfo.setStreamType(0);
        this.mPlayerInfo.setCaptureType(1);
        this.mPlayerInfo.setVideoTransProto(1);
        this.mPlayerInfo.setAudioTransProto(0);
        this.mPlayerInfo.setCodecId(0);
        this.bytelinkSource = new ByteLinkSource(this.mCastContext);
    }

    private String getMonitorContentFromServiceInfo(ServiceInfo serviceInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mirrorVersion", "3.10.2.1.overseas-tt");
            jSONObject.put("serviceInfo", serviceInfo != null ? serviceInfo.toString() : "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        return jSONObject2 != null ? jSONObject2 : "";
    }

    private void initMirrorConnectID() {
        this.mMirrorConnectId = UUID.randomUUID().toString();
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initMirrorConnectID: ");
        LIZ.append(this.mMirrorConnectId);
        castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
    }

    private void setDebugMode(boolean z) {
        IInitListener iInitListener;
        if (this.bytelinkSource.setLogLevel(z ? 3 : 5) || (iInitListener = this.mIInitListener) == null) {
            return;
        }
        iInitListener.onFail(10017, "ERROR_BYTELINK_SETLOGLEVEL_FAILED", null);
    }

    private int transAudioSrc(int i, boolean z) {
        if (!z) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 3 : 5;
        }
        return 4;
    }

    private int transBitrate(int i) {
        if (i != 4) {
            return i != 5 ? 7000 : 10000;
        }
        return 16000;
    }

    private Point transResolution(int i) {
        if (i == 1) {
            return new Point(1920, 1080);
        }
        if (i == 2) {
            return new Point(1280, 720);
        }
        if (i == 4) {
            return new Point(2560, 1440);
        }
        if (i == 5) {
            return new Point(3840, 2160);
        }
        ServiceInfo serviceInfo = this.mServiceInfo;
        return new Point(serviceInfo.width, serviceInfo.height);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void addDramaList(DramaBean[] dramaBeanArr, String str, IResultListener iResultListener) {
        ZZT.LIZ(this, dramaBeanArr, str, iResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void addOutputSurface(Surface surface) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addOutputSurface:");
            LIZ.append(surface);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setOption(10005, surface);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void addVolume() {
        ZZT.LIZJ(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void changeCameraID(int i) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changeCameraID:");
            LIZ.append(i);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            ByteLinkSource byteLinkSource = this.bytelinkSource;
            Object[] objArr = new Object[1];
            objArr[0] = i == 0 ? RTCVideoProfile.CAMERA_FACING_ID.CAMERA_FACING_FRONT : RTCVideoProfile.CAMERA_FACING_ID.CAMERA_FACING_BACK;
            byteLinkSource.setOption(10007, objArr);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void changeDanmakuSetting(DanmakuSetting danmakuSetting) {
        ZZT.LJ(this, danmakuSetting);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void changeResolution(Resolution resolution) {
        ZZT.LJFF(this, resolution);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void changeSpeed(Speed speed) {
        ZZT.LJI(this, speed);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void clearDramaList() {
        ZZT.LJII(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void connect(ServiceInfo serviceInfo) {
        initMirrorConnectID();
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect, connectId:");
        LIZ.append(this.mMirrorConnectId);
        LIZ.append(", info");
        LIZ.append(serviceInfo);
        castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
        this.bConnectByUser = true;
        ByteLinkServiceInfo byteLinkServiceInfo = new ByteLinkServiceInfo(serviceInfo.ip, serviceInfo.portMirror, this.mMirrorConnectId, true);
        this.mServiceInfo = serviceInfo;
        int i = serviceInfo.firewall;
        if (FirewallError.mayConnect(i)) {
            this.mServiceInfo.types = "ByteLink";
            this.bytelinkSource.connect(byteLinkServiceInfo);
            return;
        }
        CastLogger castLogger2 = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startMirror blocked by firewall:");
        LIZ2.append(i);
        castLogger2.w("BytelinkSourceWrapper", X1D.LIZIZ(LIZ2));
        IMirrorListener iMirrorListener = this.mMirrorListener;
        if (iMirrorListener != null) {
            iMirrorListener.onError(3, 212002, FirewallError.getFirewallErr(i), FirewallError.getFirewallErrorMsg(i));
        }
        this.mMonitor.sendCustomEvent("source", "bytelink_onError", getMonitorContent(212002, FirewallError.getFirewallErr(i), FirewallError.getFirewallErrorMsg(i), this.mServiceInfo), this.mMirrorConnectId);
        Dispatcher.getInstance().shutdownScheduleService(this.mMonitor.sourceConnectID);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void destroy() {
        this.bConnectByUser = false;
        disConnect(null);
        this.bytelinkSource.destroy();
        this.mIsBinded = false;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ boolean detect(ServiceInfo serviceInfo, int i, int i2) {
        return ZZT.LJIIJ(this, serviceInfo, i, i2);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public boolean disConnect(ServiceInfo serviceInfo) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disConnect, info:");
        LIZ.append(serviceInfo);
        castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
        return this.bytelinkSource.disConnect(serviceInfo != null ? serviceInfo.protocols.contains("RtcLink") ? new ByteLinkServiceInfo(serviceInfo.rtc_appId, serviceInfo.rtc_token, serviceInfo.rtc_roomId, serviceInfo.rtc_userId) : new ByteLinkServiceInfo(serviceInfo.ip, serviceInfo.portMirror, this.mMirrorConnectId, this.bConnectByUser) : null);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void disableQueryPlayState() {
        ZZT.LJIIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void enableAudio(boolean z) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enableAudio:");
            LIZ.append(z);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setOption(10017, Boolean.valueOf(z));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void enableFlash(boolean z) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enableFlash:");
            LIZ.append(z);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setOption(10016, Boolean.valueOf(z));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void enableQueryPlayState() {
        ZZT.LJIILL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ ServiceInfo getCurrentPlayServiceInfo() {
        return ZZT.LJIILLIIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getDeviceInfo(ServiceInfo serviceInfo, IGetDeviceInfoListener iGetDeviceInfoListener) {
        ZZT.LJIIZILJ(this, serviceInfo, iGetDeviceInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String getFlvUrl() {
        return ZZT.LJIJ(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String getHttpPlayUrl() {
        return ZZT.LJIJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String getHttpUrl() {
        return ZZT.LJIJJ(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String getLocalUrl(String str, String str2) {
        return ZZT.LJIJJLI(this, str, str2);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getMediaInfo(ServiceInfo serviceInfo) {
        ZZT.LJIL(this, serviceInfo);
    }

    public String getMonitorContent(int i, int i2, String str, ServiceInfo serviceInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorType", i);
            jSONObject.put("errorCode", i2);
            jSONObject.put("errorMsg", str);
            jSONObject.put("mirrorVersion", "3.10.2.1.overseas-tt");
            jSONObject.put("serviceInfo", serviceInfo != null ? serviceInfo.toString() : "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        return jSONObject2 != null ? jSONObject2 : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getMonitorContentFromJson(java.lang.String r4) {
        /*
            r3 = this;
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lf
            r2.<init>(r4)     // Catch: org.json.JSONException -> Lf
            java.lang.String r1 = "mirrorVersion"
            java.lang.String r0 = "3.10.2.1.overseas-tt"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> Ld
            goto L14
        Ld:
            r0 = move-exception
            goto L11
        Lf:
            r0 = move-exception
            r2 = 0
        L11:
            r0.printStackTrace()
        L14:
            java.lang.String r1 = ""
            if (r2 == 0) goto L20
            java.lang.String r0 = r2.toString()
        L1c:
            if (r0 == 0) goto L1f
            r1 = r0
        L1f:
            return r1
        L20:
            r0 = r1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.api.BytelinkSourceWrapper.getMonitorContentFromJson(java.lang.String):java.lang.String");
    }

    public String getMonitorContentFromServiceInfos(List<ServiceInfo> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mirrorVersion", "3.10.2.1.overseas-tt");
            jSONObject.put("serviceInfos", list.size() > 0 ? list.toString() : "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        return jSONObject2 != null ? jSONObject2 : "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getMsg(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
        ZZT.LJJ(this, serviceInfo, str, iSendResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ Object getOption(int i, Object... objArr) {
        return ZZT.LJJI(this, i, objArr);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String getRtmpUrl() {
        return ZZT.LJJIFFI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ ServiceInfo getServiceInfo() {
        return ZZT.LJJII(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ DeviceInfo getSinkDeviceInfo(String str, int i) {
        return ZZT.LJJIII(this, str, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void getSinkDeviceInfo(ServiceInfo serviceInfo, ISinkDeviceInfoListener iSinkDeviceInfoListener) {
        ZZT.LJJIIJ(this, serviceInfo, iSinkDeviceInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ List getSsdpServiceInfoList() {
        return ZZT.LJJIIJZLJL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public Statistics getStatistics() {
        Statistics statistics = new Statistics();
        Iterator<RTCStatistics.NetworkStatistics> it = this.bytelinkSource.getStatistics().nx.iterator();
        if (it.hasNext()) {
            RTCStatistics.NetworkStatistics next = it.next();
            statistics.nx.rtt = next.videoRtt;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getStatistics rtt=");
        LIZ.append(statistics.nx.rtt);
        LIZ.append("  encoderCost=");
        LIZ.append(statistics.cx.videoEncodeElapse);
        castLogger.d("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
        return statistics;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public String getVersion() {
        Object option = this.bytelinkSource.getOption(10010, new Object());
        return option instanceof String ? String.valueOf(option) : "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void init(Context context, Config config, IInitListener iInitListener) {
        if (this.mIsBinded) {
            if (iInitListener != null) {
                iInitListener.onFail(10018, "ERROR_BYTELINK_ALREADY_BIND", null);
                return;
            }
            return;
        }
        this.mContext = context;
        this.mIInitListener = iInitListener;
        this.mDeviceId = config.getDeviceId();
        setDebugMode(config.isEnableDebug());
        ByteLinkSource byteLinkSource = this.bytelinkSource;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(config.isEnableFileLog());
        byteLinkSource.setOption(CommonOptionConstants.OPTION_SET_FILE_LOG_ENABLED, objArr);
        this.bytelinkSource.init(this.mContext, this.mDeviceId, this.mPlayerInfo);
        this.bytelinkSource.setBrowseResultListener(this.browseListener);
        this.bytelinkSource.setPlayerListener(this.playListener);
        this.bytelinkSource.setConnectListener(this.connectListener);
        this.bytelinkSource.setDispalyListener(new d(this));
        this.mIsBinded = true;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void onDiskCacheFoundService(ServiceInfo serviceInfo) {
        ZZT.LJJIJ(this, serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void onNetworkChangeReady() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void onSsdpDeviceOffline(ServiceInfo serviceInfo) {
        ZZT.LJJIJIIJIL(this, serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void pause() {
        ZZT.LJJIJIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ boolean ping(String str, int i) {
        return ZZT.LJJIJL(this, str, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void play(PlayerInfo playerInfo) {
        ZZT.LJJIJLIJ(this, playerInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void play(ServiceInfo serviceInfo, Uri uri, int i) {
        ZZT.LJJIL(this, serviceInfo, uri, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void playDramaId(String str) {
        ZZT.LJJIZ(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void playNextDrama() {
        ZZT.LJJJ(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void playPreDrama() {
        ZZT.LJJJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void register(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        ZZT.LJJJIL(this, serviceInfo, iRegisterResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void removeOutputSurface(Surface surface) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeOutputSurface:");
            LIZ.append(surface);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setOption(10019, surface);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void resume() {
        ZZT.LJJJJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void seekTo(long j, int i) {
        ZZT.LJJJJIZL(this, j, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void send(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("send, message:");
            LIZ.append(str);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.sendMetaData(str);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void sendData(int i, byte[] bArr, long j, long j2, long j3, long j4) {
        ZZT.LJJJJJL(this, i, bArr, j, j2, j3, j4);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ String sendSync(ServiceInfo serviceInfo, String str) {
        return ZZT.LJJJJL(this, serviceInfo, str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setAudioMixScale(int i) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setAudioMixScale:");
            LIZ.append(i);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setAudioMixScale(i);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setAuthorizationResult(int i) {
        ZZT.LJJJJLL(this, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setBrowseResultListener(IBrowseListener iBrowseListener) {
        this.mBrowserListener = iBrowseListener;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setConnectListener(com.byted.cast.common.api.IConnectListener iConnectListener) {
        ZZT.LJJJJZ(this, iConnectListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setInputSurfaceCallback(ISurfaceListener iSurfaceListener) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInputSurfaceCallback:");
            LIZ.append(iSurfaceListener);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setOption(10014, iSurfaceListener);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        this.bytelinkSource.setLibraryLoader(iLibraryLoader);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setLogger(ILogger iLogger) {
        this.bytelinkSource.setLogger(iLogger);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMediaInfoListener(IMediaInfoListener iMediaInfoListener) {
        ZZT.LJJJLZIJ(this, iMediaInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setMediaProjection(MediaProjection mediaProjection) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setMediaProjection:");
            LIZ.append(mediaProjection);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setOption(10015, mediaProjection);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setMessageListener(IMessageListener iMessageListener) {
        this.mMessageListener = iMessageListener;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMirrorInfo(MirrorInfo mirrorInfo) {
        ZZT.LJJLI(this, mirrorInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setMirrorListener(IMirrorListener iMirrorListener) {
        this.mMirrorListener = iMirrorListener;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setOption(int i, Object... objArr) {
        if (i == 10005) {
            Object obj = objArr[0];
            if (obj instanceof Surface) {
                this.bytelinkSource.setOption(10005, obj);
                return;
            }
            return;
        }
        if (i == 10007) {
            Object obj2 = objArr[0];
            if (obj2 instanceof Integer) {
                Integer num = (Integer) obj2;
                CastLogger castLogger = this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OPTION_SET_CAMERA_ID, cameraID:");
                LIZ.append(num);
                castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
                ByteLinkSource byteLinkSource = this.bytelinkSource;
                Object[] objArr2 = new Object[1];
                objArr2[0] = num.intValue() == 0 ? RTCVideoProfile.CAMERA_FACING_ID.CAMERA_FACING_FRONT : RTCVideoProfile.CAMERA_FACING_ID.CAMERA_FACING_BACK;
                byteLinkSource.setOption(10007, objArr2);
                return;
            }
            return;
        }
        if (i == 10017) {
            Object obj3 = objArr[0];
            if (obj3 instanceof Boolean) {
                this.bytelinkSource.setOption(10017, obj3);
                return;
            }
            return;
        }
        if (i == 10035) {
            Object obj4 = objArr[0];
            if (obj4 instanceof String) {
                String str = (String) obj4;
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("OPTION_SEND_MESSAGE, json:");
                LIZ2.append(str);
                castLogger2.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ2));
                this.bytelinkSource.sendMetaData(str);
                return;
            }
            return;
        }
        if (i != 10091) {
            ByteLinkSource byteLinkSource2 = this.bytelinkSource;
            if (byteLinkSource2 != null) {
                byteLinkSource2.setOption(i, objArr);
                return;
            }
            return;
        }
        Object obj5 = objArr[0];
        if (obj5 instanceof Boolean) {
            this.browseEnabled = ((Boolean) obj5).booleanValue();
            CastLogger castLogger3 = this.mLogger;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("OPTION_ENABLE_BYTELINK_BROWSE:");
            LIZ3.append(this.browseEnabled);
            castLogger3.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ3));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPlayerListener(IPlayerListener iPlayerListener) {
        ZZT.LJJLIIIJILLIZJL(this, iPlayerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPlayerListener(com.byted.cast.common.source.IPlayerListener iPlayerListener) {
        ZZT.LJJLIIIJJI(this, iPlayerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPrivateChannel(String str) {
        ZZT.LJJLIIIJJIZ(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setRepeatMode(int i, IResultListener iResultListener) {
        ZZT.LJJLIIIJL(this, i, iResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setServerInfo(PlayerInfo playerInfo) {
        ZZT.LJJLIIIJLJLI(this, playerInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setServerListener(IServerListener iServerListener) {
        ZZT.LJJLIIIJLLLLLLLZ(this, iServerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setSsdpBrowseResultListener(IBrowseListener iBrowseListener) {
        ZZT.LJJLIIJ(this, iBrowseListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setSsdpPrivateChannel(String str) {
        ZZT.LJJLIL(this, str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setSsdpWriteCacheListener(IWriteCacheListener iWriteCacheListener) {
        ZZT.LJJLJ(this, iWriteCacheListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void setSurfaceFillType(int i) {
        if (this.bytelinkSource != null) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSurfaceFillType:");
            LIZ.append(i);
            castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
            this.bytelinkSource.setOption(10065, Integer.valueOf(i));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setVolume(int i) {
        ZZT.LJJLL(this, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startBrowse() {
        if (this.browseEnabled) {
            this.bytelinkSource.startBrowse(this.nsd_service_name);
            if (this.isStartBrowse) {
                return;
            }
            this.isStartBrowse = true;
            this.mMonitor.sendCustomEvent("source", "bytelink_start_browse", getMonitorContentFromServiceInfo(null), this.mMirrorConnectId);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startMirror(MirrorInfo mirrorInfo) {
        ByteLinkServiceInfo byteLinkServiceInfo;
        int i;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startMirror:");
        LIZ.append(mirrorInfo);
        castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
        if (mirrorInfo.getServiceInfo().protocols.contains("RtcLink")) {
            try {
                Class.forName("com.byted.cast.rtc.ByteRtcConnector");
            } catch (Exception e) {
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("can't find class ByteRTC:");
                LIZ2.append(e);
                castLogger2.w("BytelinkSourceWrapper", X1D.LIZIZ(LIZ2));
                return;
            }
        }
        if (mirrorInfo.getVirtualDisplayName() != "") {
            this.bytelinkSource.setOption(10013, mirrorInfo.getVirtualDisplayName());
        }
        if (mirrorInfo.getVirtualDisplayFlag() != -1) {
            this.bytelinkSource.setOption(10012, Integer.valueOf(mirrorInfo.getVirtualDisplayFlag()));
        }
        if (mirrorInfo.getVirtualDisplayWidth() != -1 && mirrorInfo.getVirtualDisplayHeight() != -1) {
            this.bytelinkSource.setOption(10064, Integer.valueOf(mirrorInfo.getVirtualDisplayWidth()), Integer.valueOf(mirrorInfo.getVirtualDisplayHeight()));
        }
        if (mirrorInfo.isEncodeSizeToScreen()) {
            this.bytelinkSource.setOption(10053, Boolean.valueOf(mirrorInfo.isEncodeSizeToScreen()));
        }
        if (mirrorInfo.getVideoTransportType() != -1) {
            this.bytelinkSource.setOption(10027, Integer.valueOf(mirrorInfo.getVideoTransportType()));
        }
        initMirrorConnectID();
        ServiceInfo serviceInfo = mirrorInfo.getServiceInfo();
        this.mServiceInfo = serviceInfo;
        int i2 = serviceInfo != null ? serviceInfo.firewall : 0;
        if (!FirewallError.mayConnect(i2)) {
            CastLogger castLogger3 = this.mLogger;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startMirror blocked by firewall:");
            LIZ3.append(i2);
            castLogger3.w("BytelinkSourceWrapper", X1D.LIZIZ(LIZ3));
            IMirrorListener iMirrorListener = this.mMirrorListener;
            if (iMirrorListener != null) {
                iMirrorListener.onError(3, 212002, FirewallError.getFirewallErr(i2), FirewallError.getFirewallErrorMsg(i2));
            }
            this.mMonitor.sendCustomEvent("source", "bytelink_onError", getMonitorContent(212002, FirewallError.getFirewallErr(i2), FirewallError.getFirewallErrorMsg(i2), this.mServiceInfo), this.mMirrorConnectId);
            Dispatcher.getInstance().shutdownScheduleService(this.mMonitor.sourceConnectID);
            return;
        }
        this.bytelinkSource.setCastToken(this.mMirrorConnectId);
        this.bytelinkSource.setBitRate(mirrorInfo.getBitrate() <= 0 ? transBitrate(mirrorInfo.getBitRateLevel()) : mirrorInfo.getBitrate());
        this.bytelinkSource.setCodecId(mirrorInfo.getCodecId());
        this.bytelinkSource.setAudioSource(transAudioSrc(mirrorInfo.getAudioSource(), mirrorInfo.isAudioEnable()));
        this.bytelinkSource.setAudioMix(mirrorInfo.isEnableAudioMix());
        this.bytelinkSource.setOption(10006, Integer.valueOf(mirrorInfo.getVideoSrc()));
        ByteLinkSource byteLinkSource = this.bytelinkSource;
        Object[] objArr = new Object[1];
        objArr[0] = mirrorInfo.getCameraId() == 0 ? RTCVideoProfile.CAMERA_FACING_ID.CAMERA_FACING_FRONT : RTCVideoProfile.CAMERA_FACING_ID.CAMERA_FACING_BACK;
        byteLinkSource.setOption(10007, objArr);
        int i3 = this.mServiceInfo.width;
        if (i3 <= 0 || i3 > 3840) {
            CastLogger castLogger4 = this.mLogger;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("startMirror mServiceInfo.width: ");
            LIZ4.append(this.mServiceInfo.width);
            castLogger4.w("BytelinkSourceWrapper", X1D.LIZIZ(LIZ4));
            this.mServiceInfo.width = 1920;
        }
        int i4 = this.mServiceInfo.height;
        if (i4 <= 0 || i4 > 2160) {
            CastLogger castLogger5 = this.mLogger;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("startMirror mServiceInfo.height: ");
            LIZ5.append(this.mServiceInfo.height);
            castLogger5.w("BytelinkSourceWrapper", X1D.LIZIZ(LIZ5));
            this.mServiceInfo.height = 1080;
        }
        if (this.mServiceInfo.protocols.contains("RtcLink")) {
            ServiceInfo serviceInfo2 = this.mServiceInfo;
            serviceInfo2.types = "RtcLink";
            byteLinkServiceInfo = new ByteLinkServiceInfo(serviceInfo2.rtc_appId, serviceInfo2.rtc_token, serviceInfo2.rtc_roomId, serviceInfo2.rtc_userId);
            byteLinkServiceInfo.set_RtcLink(true);
        } else {
            this.mServiceInfo.types = "ByteLink";
            byteLinkServiceInfo = new ByteLinkServiceInfo(mirrorInfo.getServiceInfo().ip, mirrorInfo.getServiceInfo().portMirror, this.mMirrorConnectId, this.bConnectByUser);
            byteLinkServiceInfo.set_RtcLink(false);
        }
        byteLinkServiceInfo.setFeatures(mirrorInfo.getServiceInfo().features);
        if (mirrorInfo.getResolutionLevel() == -1) {
            byteLinkServiceInfo.setWidth(mirrorInfo.getEncodeWidth());
            i = mirrorInfo.getEncodeHeight();
        } else {
            Point transResolution = transResolution(mirrorInfo.getResolutionLevel());
            byteLinkServiceInfo.setWidth(transResolution.x);
            i = transResolution.y;
        }
        byteLinkServiceInfo.setHeight(i);
        int i5 = this.mServiceInfo.fps;
        if (i5 != -1) {
            byteLinkServiceInfo.setFps(i5);
        }
        this.mLogger.i("BytelinkSourceWrapper", "zhy test startMirror:" + mirrorInfo.getServerMode());
        byteLinkServiceInfo.setCaptureType(mirrorInfo.getServerMode());
        this.mBrowseServiceInfo = byteLinkServiceInfo;
        this.bytelinkSource.startMirror(byteLinkServiceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startRecorder() {
        if (this.bytelinkSource != null) {
            this.mLogger.i("BytelinkSourceWrapper", "startRecorder:");
            this.bytelinkSource.startRecorder();
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void startServer(String str) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void startSsdpBrowse() {
        ZZT.LJL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void stop() {
        ZZT.LJLI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopBrowse() {
        if (this.browseEnabled) {
            this.isFirstDevice = true;
            this.isStartBrowse = false;
            this.bytelinkSource.stopBrowse();
            this.mMonitor.sendCustomEvent("source", "bytelink_stop_browse", getMonitorContentFromServiceInfo(null), this.mMirrorConnectId);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopMirror() {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopMirror:");
        LIZ.append(this.mBrowseServiceInfo);
        castLogger.i("BytelinkSourceWrapper", X1D.LIZIZ(LIZ));
        Dispatcher.getInstance().shutdownScheduleService(this.mMonitor.sourceConnectID);
        this.bytelinkSource.stopCast();
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopRecorder() {
        if (this.bytelinkSource != null) {
            this.mLogger.i("BytelinkSourceWrapper", "stopRecorder:");
            this.bytelinkSource.stopRecorder();
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public void stopServer() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void stopSsdpBrowse() {
        ZZT.LJLILLLLZI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void subVolume() {
        ZZT.LJLJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void unregister(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        ZZT.LJLJJI(this, serviceInfo, iRegisterResultListener);
    }

    /* loaded from: classes29.dex */
    public class b implements com.byted.cast.source.browser.api.IBrowseListener {
        public b() {
        }

        @Override // com.byted.cast.source.browser.api.IBrowseListener
        public void onBrowse(int i, List<ByteLinkServiceInfo> list) {
            if (i == 4) {
                return;
            }
            if (list != null) {
                BytelinkSourceWrapper.this.mInfoList.clear();
                BytelinkSourceWrapper.this.mInfoList.addAll(list);
            }
            BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
            if (bytelinkSourceWrapper.mBrowserListener != null) {
                bytelinkSourceWrapper.mainThreadExecutor.execute(new a(i));
            }
        }

        /* loaded from: classes29.dex */
        public class a implements Runnable {
            public final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            public void com_byted_cast_source_api_BytelinkSourceWrapper$b$a__run$___twin___() {
                ArrayList arrayList = new ArrayList();
                for (ByteLinkServiceInfo byteLinkServiceInfo : BytelinkSourceWrapper.this.mInfoList) {
                    ServiceInfo serviceInfo = new ServiceInfo();
                    serviceInfo.name = byteLinkServiceInfo.getName();
                    serviceInfo.ip = byteLinkServiceInfo.getIp();
                    serviceInfo.port = byteLinkServiceInfo.getPort();
                    serviceInfo.portMirror = byteLinkServiceInfo.getPort();
                    serviceInfo.height = byteLinkServiceInfo.getHeight();
                    serviceInfo.width = byteLinkServiceInfo.getWidth();
                    serviceInfo.fps = byteLinkServiceInfo.getFps();
                    serviceInfo.features = byteLinkServiceInfo.getFeatures();
                    serviceInfo.deviceID = byteLinkServiceInfo.getDeviceID();
                    serviceInfo.protocols = "ByteLink,";
                    serviceInfo.rtc_appId = byteLinkServiceInfo.get_RtcAppId();
                    serviceInfo.rtc_token = byteLinkServiceInfo.get_RtcToken();
                    serviceInfo.rtc_roomId = byteLinkServiceInfo.get_RtcRoomId();
                    serviceInfo.rtc_userId = byteLinkServiceInfo.get_RtcUserId();
                    arrayList.add(serviceInfo);
                }
                BytelinkSourceWrapper.this.mBrowserListener.onBrowse(this.a, arrayList);
                BytelinkSourceWrapper bytelinkSourceWrapper = BytelinkSourceWrapper.this;
                bytelinkSourceWrapper.mMonitor.sendCustomEvent("source", "bytelink_onBrowse", bytelinkSourceWrapper.getMonitorContentFromServiceInfos(arrayList), BytelinkSourceWrapper.this.mMirrorConnectId);
                BytelinkSourceWrapper bytelinkSourceWrapper2 = BytelinkSourceWrapper.this;
                if (bytelinkSourceWrapper2.isFirstDevice && this.a == 1) {
                    bytelinkSourceWrapper2.isFirstDevice = false;
                    BytelinkSourceWrapper bytelinkSourceWrapper3 = BytelinkSourceWrapper.this;
                    bytelinkSourceWrapper3.mMonitor.sendCustomEvent("source", "bytelink_browse_success", bytelinkSourceWrapper3.getMonitorContentFromServiceInfos(arrayList), BytelinkSourceWrapper.this.mMirrorConnectId);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_source_api_BytelinkSourceWrapper$b$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_byted_cast_source_api_BytelinkSourceWrapper$b$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(a aVar) {
                boolean LIZ;
                try {
                    aVar.com_byted_cast_source_api_BytelinkSourceWrapper$b$a__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }
    }
}
