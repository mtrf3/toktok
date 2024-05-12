package com.byted.cast.source.a;

import X.C162476Zf;
import X.C16880lQ;
import X.C37692Eqm;
import X.C63832P3k;
import X.C90181ZaL;
import X.V0N;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Message;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.DisplayInfo;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.MirrorSettings;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.discovery.NsdFactory;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;
import com.byted.cast.common.discovery.NsdUtils;
import com.byted.cast.engine.VoipEngine;
import com.byted.cast.sdk.IRTCEngineEventListener;
import com.byted.cast.sdk.RTCAudioProfile;
import com.byted.cast.sdk.RTCEngine;
import com.byted.cast.sdk.RTCScreenProfile;
import com.byted.cast.sdk.RTCSetting;
import com.byted.cast.sdk.RTCStatistics;
import com.byted.cast.sdk.RTCVideoProfile;
import com.byted.cast.sdk.utils.JsonFormatter;
import com.byted.cast.sdk.utils.Utils;
import com.byted.cast.source.api.ByteLinkPlayerInfo;
import com.byted.cast.source.api.IByteLinkDisplayListener;
import com.byted.cast.source.api.IByteLinkPlayerListener;
import com.byted.cast.source.api.IConnectListener;
import com.byted.cast.source.browser.api.ByteLinkServiceInfo;
import com.byted.cast.source.browser.api.IBrowseListener;
import com.byted.cast.source.services.a;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class a implements a.b {
    public static final b F = new b();
    public String A;
    public boolean B;
    public final NsdListener C;
    public final IRTCEngineEventListener D;
    public final ContextManager.CastContext E;
    public final int a;
    public Context b;
    public INsdHelper c;
    public final String d;
    public RTCEngine e;
    public RTCSetting f;
    public String g;
    public int h;
    public ByteLinkServiceInfo i;
    public final Map<String, ByteLinkServiceInfo> j;
    public int k;
    public int l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public IBrowseListener f111n;
    public IConnectListener o;
    public IByteLinkDisplayListener p;
    public IByteLinkPlayerListener q;
    public ILibraryLoader r;
    public String s;
    public com.byted.cast.source.services.a t;
    public final Object u;
    public C0011a v;
    public CastLogger w;
    public String x;
    public String y;
    public String z;

    /* loaded from: classes29.dex */
    public static final class c {
        public final ByteLinkServiceInfo a;
        public final int b;
        public final int c;
        public final String d;
        public boolean e;

        public c(ByteLinkServiceInfo serviceInfo, int i, int i2, String msg, boolean z) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            o.LJIIJ(msg, "msg");
            this.a = serviceInfo;
            this.b = i;
            this.c = i2;
            this.d = msg;
            this.e = z;
        }

        public /* synthetic */ c(ByteLinkServiceInfo byteLinkServiceInfo, int i, int i2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteLinkServiceInfo, i, i2, str, (i3 & 16) != 0 ? false : z);
        }

        public final int a() {
            return this.c;
        }

        public final void a(boolean z) {
            this.e = z;
        }

        public final String b() {
            return this.d;
        }

        public final boolean c() {
            return this.e;
        }

        public final ByteLinkServiceInfo d() {
            return this.a;
        }

        public final int e() {
            return this.b;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ErrorContent(what=");
            LIZ.append(this.b);
            LIZ.append(", errorCode=");
            LIZ.append(this.c);
            LIZ.append(", msg='");
            LIZ.append(this.d);
            LIZ.append("', pending=");
            LIZ.append(this.e);
            LIZ.append(", serviceInfo=");
            LIZ.append(this.a);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes29.dex */
    public final class d implements IRTCEngineEventListener {
        public d() {
        }

        private final int a(RTCEngine.ExitReason exitReason) {
            switch (com.byted.cast.source.a.b.a[exitReason.ordinal()]) {
                case 1:
                    return 10022007;
                case 2:
                    return 10022008;
                case 3:
                    return 10022010;
                case 4:
                    return 10022014;
                case 5:
                    return 10022009;
                case 6:
                    return 10022011;
                case 7:
                    return 10022012;
                case 8:
                    return 10022013;
                default:
                    throw new C162476Zf();
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void OnVideoSizeChanged(String userId, int i, int i2, int i3) {
            o.LJIIJ(userId, "userId");
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onAudioSetVolume(String userId, float f, float f2) {
            o.LJIIJ(userId, "userId");
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCancelRequest(String userId) {
            o.LJIIJ(userId, "userId");
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public boolean onCastRequest(String userId, String token) {
            o.LJIIJ(userId, "userId");
            o.LJIIJ(token, "token");
            return false;
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onConnect(String userId, String name) {
            o.LJIIJ(userId, "userId");
            o.LJIIJ(name, "name");
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onConnectStateChanged(RTCEngine.ConnectState state) {
            o.LJIIJ(state, "state");
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onDisconnect(String userId, RTCEngine.ExitReason reason, String message) {
            o.LJIIJ(userId, "userId");
            o.LJIIJ(reason, "reason");
            o.LJIIJ(message, "message");
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public final /* synthetic */ void onFirstVideoFrame(String str) {
            C90181ZaL.LIZ(this, str);
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public final /* synthetic */ void onIntoBackground(String str) {
            C90181ZaL.LIZIZ(this, str);
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public final /* synthetic */ void onIntoForeground(String str) {
            C90181ZaL.LIZJ(this, str);
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onLogMonitor(String usrID, String[][] logger) {
            o.LJIIJ(usrID, "usrID");
            o.LJIIJ(logger, "logger");
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public final /* synthetic */ void onSinkLatencyStat(String str, String str2) {
            C90181ZaL.LIZLLL(this, str, str2);
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public final /* synthetic */ void onSinkStuckStat(String str, String str2) {
            C90181ZaL.LJ(this, str, str2);
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCancelSuccess() {
            C0011a c0011a;
            a.this.w.i("ByteLinkSourceImpl2", "onCancelSuccess, gitInfo:1.61ac5e2");
            ByteLinkServiceInfo byteLinkServiceInfo = a.this.i;
            if (byteLinkServiceInfo != null && (c0011a = a.this.v) != null) {
                c0011a.c(byteLinkServiceInfo);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCastSuccess() {
            RTCSetting.VIDEO_SOURCE_TYPE video_source_type;
            C0011a c0011a;
            CastLogger castLogger = a.this.w;
            StringBuilder sb = new StringBuilder("onCastSuccess, gitInfo:1.61ac5e2, videoSourceType:");
            RTCSetting rTCSetting = a.this.f;
            if (rTCSetting != null) {
                video_source_type = rTCSetting.getVideoSourceType();
            } else {
                video_source_type = null;
            }
            sb.append(video_source_type);
            castLogger.i("ByteLinkSourceImpl2", sb.toString());
            ByteLinkServiceInfo byteLinkServiceInfo = a.this.i;
            if (byteLinkServiceInfo != null && (c0011a = a.this.v) != null) {
                c0011a.e(byteLinkServiceInfo);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onKilled() {
            a.this.w.w("ByteLinkSourceImpl2", "Source mirror is killed");
            IByteLinkPlayerListener iByteLinkPlayerListener = a.this.q;
            if (iByteLinkPlayerListener != null) {
                iByteLinkPlayerListener.onInfo(300010, 10030014, "Source mirror is killed");
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onPaused() {
            a.this.w.i("ByteLinkSourceImpl2", "VirtualDisplayCallback onPaused ");
            IByteLinkDisplayListener iByteLinkDisplayListener = a.this.p;
            if (iByteLinkDisplayListener != null) {
                iByteLinkDisplayListener.onPaused();
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onResumed() {
            a.this.w.i("ByteLinkSourceImpl2", "VirtualDisplayCallback onResumed ");
            IByteLinkDisplayListener iByteLinkDisplayListener = a.this.p;
            if (iByteLinkDisplayListener != null) {
                iByteLinkDisplayListener.onResumed();
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onStopped() {
            a.this.w.i("ByteLinkSourceImpl2", "VirtualDisplayCallback onStopped ");
            IByteLinkDisplayListener iByteLinkDisplayListener = a.this.p;
            if (iByteLinkDisplayListener != null) {
                iByteLinkDisplayListener.onStopped();
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onRecvMetaData(String json) {
            o.LJIIJ(json, "json");
            a.this.w.i("ByteLinkSourceImpl2", "onRecvMetaData");
            IByteLinkPlayerListener iByteLinkPlayerListener = a.this.q;
            if (iByteLinkPlayerListener != null) {
                iByteLinkPlayerListener.onRecvMetaData(json);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onStat(String json) {
            o.LJIIJ(json, "json");
            IByteLinkPlayerListener iByteLinkPlayerListener = a.this.q;
            if (iByteLinkPlayerListener != null) {
                iByteLinkPlayerListener.onStat(json);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onStuckStat(String json) {
            o.LJIIJ(json, "json");
            IByteLinkPlayerListener iByteLinkPlayerListener = a.this.q;
            if (iByteLinkPlayerListener != null) {
                iByteLinkPlayerListener.onStuckStat(json);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCastControl(int i, int i2) {
            a.this.w.i("ByteLinkSourceImpl2", "onCastControl");
            synchronized (a.this.u) {
                RTCEngine rTCEngine = a.this.e;
                if (rTCEngine != null) {
                    rTCEngine.setBitrate(i2);
                }
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onDisconnect(RTCEngine.ExitReason reason, String message) {
            C0011a c0011a;
            C0011a c0011a2;
            C0011a c0011a3;
            o.LJIIJ(reason, "reason");
            o.LJIIJ(message, "message");
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDisconnect, gitInfo:1.61ac5e2, reason:");
            LIZ.append(reason);
            LIZ.append(", message:");
            LIZ.append(message);
            castLogger.e("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            int i = com.byted.cast.source.a.b.b[reason.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    ByteLinkServiceInfo byteLinkServiceInfo = a.this.i;
                    if (byteLinkServiceInfo != null && (c0011a3 = a.this.v) != null) {
                        c0011a3.i(new c(byteLinkServiceInfo, 211005, a(reason), message, true));
                        return;
                    }
                    return;
                }
                ByteLinkServiceInfo byteLinkServiceInfo2 = a.this.i;
                if (byteLinkServiceInfo2 == null || (c0011a2 = a.this.v) == null) {
                    return;
                }
                c0011a2.h(new c(byteLinkServiceInfo2, 211032, a(reason), message, true));
                return;
            }
            ByteLinkServiceInfo byteLinkServiceInfo3 = a.this.i;
            if (byteLinkServiceInfo3 == null || (c0011a = a.this.v) == null) {
                return;
            }
            c0011a.f(new c(byteLinkServiceInfo3, 200, a(reason), message, false, 16, null));
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0046. Please report as an issue. */
        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onError(int i, String description) {
            C0011a c0011a;
            C0011a c0011a2;
            C0011a c0011a3;
            C0011a c0011a4;
            C0011a c0011a5;
            o.LJIIJ(description, "description");
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError code ");
            LIZ.append(i);
            LIZ.append(" description ");
            LIZ.append(description);
            LIZ.append(", gitInfo:");
            LIZ.append("1.61ac5e2");
            castLogger.e("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            if (i != 211006) {
                if (i != 10030011) {
                    if (i != 10022005 && i != 10022006) {
                        switch (i) {
                            default:
                                switch (i) {
                                    case 10020007:
                                    case 10020008:
                                    case 10020009:
                                    case 10020010:
                                    case 10020011:
                                    case 10020012:
                                    case 10020013:
                                    case 10020014:
                                        break;
                                    default:
                                        switch (i) {
                                            case 10030001:
                                            case 10030002:
                                            case 10030005:
                                                break;
                                            case 10030003:
                                            case 10030004:
                                                ByteLinkServiceInfo byteLinkServiceInfo = a.this.i;
                                                if (byteLinkServiceInfo == null || (c0011a4 = a.this.v) == null) {
                                                    return;
                                                }
                                                c0011a4.a(new c(byteLinkServiceInfo, 211005, i, description, false, 16, null));
                                                return;
                                            default:
                                                switch (i) {
                                                    case 14004001:
                                                    case 14004002:
                                                    case 14004003:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 14004005:
                                                            case 14004006:
                                                            case 14004007:
                                                            case 14004008:
                                                                break;
                                                            default:
                                                                return;
                                                        }
                                                }
                                                ByteLinkServiceInfo byteLinkServiceInfo2 = a.this.i;
                                                if (byteLinkServiceInfo2 == null || (c0011a5 = a.this.v) == null) {
                                                    return;
                                                }
                                                c0011a5.b(new c(byteLinkServiceInfo2, 211005, i, description, false, 16, null));
                                                return;
                                        }
                                }
                            case 10020001:
                            case 10020002:
                            case 10020003:
                            case 10020004:
                                ByteLinkServiceInfo byteLinkServiceInfo3 = a.this.i;
                                if (byteLinkServiceInfo3 == null || (c0011a3 = a.this.v) == null) {
                                    return;
                                }
                                c0011a3.d(new c(byteLinkServiceInfo3, 201, i, description, false, 16, null));
                                return;
                        }
                    } else {
                        ByteLinkServiceInfo byteLinkServiceInfo4 = a.this.i;
                        if (byteLinkServiceInfo4 == null || (c0011a2 = a.this.v) == null) {
                            return;
                        }
                        c0011a2.e(new c(byteLinkServiceInfo4, 200, i, description, false, 16, null));
                        return;
                    }
                }
                ByteLinkServiceInfo byteLinkServiceInfo5 = a.this.i;
                if (byteLinkServiceInfo5 == null || (c0011a = a.this.v) == null) {
                    return;
                }
                c0011a.c(new c(byteLinkServiceInfo5, 211005, i, description, false, 16, null));
                return;
            }
            IByteLinkPlayerListener iByteLinkPlayerListener = a.this.q;
            if (iByteLinkPlayerListener == null) {
                return;
            }
            iByteLinkPlayerListener.onError(211005, i, description);
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onMonitorEvent(String eventType, String eventContent) {
            o.LJIIJ(eventType, "eventType");
            o.LJIIJ(eventContent, "eventContent");
            IByteLinkPlayerListener iByteLinkPlayerListener = a.this.q;
            if (iByteLinkPlayerListener != null) {
                iByteLinkPlayerListener.onMonitorEvent(a.this.i, eventType, eventContent);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onRecvMetaData(String userId, String json) {
            o.LJIIJ(userId, "userId");
            o.LJIIJ(json, "json");
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRecvMetaData: userId=");
            LIZ.append(userId);
            LIZ.append(", json=");
            LIZ.append(json);
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            IByteLinkPlayerListener iByteLinkPlayerListener = a.this.q;
            if (iByteLinkPlayerListener != null) {
                iByteLinkPlayerListener.onRecvMetaData(userId, json);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onConnectSuccess(int i, int i2, int i3) {
            C0011a c0011a;
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onConnectSuccess, w:");
            LIZ.append(i);
            LIZ.append(" h:");
            LIZ.append(i2);
            LIZ.append(" fps:");
            LIZ.append(i3);
            LIZ.append(" gitInfo:");
            LIZ.append("1.61ac5e2");
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            ByteLinkServiceInfo byteLinkServiceInfo = a.this.i;
            if (byteLinkServiceInfo != null && byteLinkServiceInfo.isConnectByUser()) {
                CastLogger castLogger2 = a.this.w;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("org serviceInfo:");
                LIZ2.append(a.this.i);
                LIZ2.append(", ret w:");
                LIZ2.append(i);
                LIZ2.append(", h:");
                LIZ2.append(i2);
                LIZ2.append(", fps:");
                LIZ2.append(i3);
                castLogger2.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ2));
                ByteLinkServiceInfo byteLinkServiceInfo2 = a.this.i;
                if (byteLinkServiceInfo2 != null) {
                    byteLinkServiceInfo2.setWidth(i);
                    byteLinkServiceInfo2.setHeight(i2);
                    byteLinkServiceInfo2.setFps(i3);
                }
            }
            ByteLinkServiceInfo byteLinkServiceInfo3 = a.this.i;
            if (byteLinkServiceInfo3 != null && (c0011a = a.this.v) != null) {
                c0011a.f(byteLinkServiceInfo3);
            }
        }
    }

    /* loaded from: classes29.dex */
    public final class e implements NsdListener {
        public e() {
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdRegistered(NsdService registeredService) {
            o.LJIIJ(registeredService, "registeredService");
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdUnRegistered(NsdService unregisterService) {
            o.LJIIJ(unregisterService, "unregisterService");
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdDiscoveryFinished() {
            a.this.w.i("ByteLinkSourceImpl2", "onNsdDiscoveryFinished");
            IBrowseListener iBrowseListener = a.this.f111n;
            if (iBrowseListener != null) {
                iBrowseListener.onBrowse(2, new ArrayList());
            }
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdServiceFound(NsdService foundService) {
            o.LJIIJ(foundService, "foundService");
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNsdServiceFound: ");
            LIZ.append(foundService);
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdServiceLost(NsdService lostService) {
            o.LJIIJ(lostService, "lostService");
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNsdServiceLost: ");
            LIZ.append(lostService);
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            if (lostService.getName() != null) {
                a.this.j.remove(lostService.getName());
                IBrowseListener iBrowseListener = a.this.f111n;
                if (iBrowseListener != null) {
                    iBrowseListener.onBrowse(1, new ArrayList(a.this.j.values()));
                }
            }
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdServiceResolved(NsdService resolvedService) {
            o.LJIIJ(resolvedService, "resolvedService");
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNsdServiceResolved: ");
            LIZ.append(resolvedService);
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            InetAddress host = resolvedService.getHost();
            o.LJFF(host, "resolvedService.host");
            String hostAddress = host.getHostAddress();
            DisplayInfo displayInfo = new DisplayInfo();
            Map<String, byte[]> attributes = resolvedService.getAttributes();
            if (attributes != null && attributes.containsKey("display")) {
                byte[] bArr = attributes.get("display");
                if (bArr != null) {
                    Charset forName = Charset.forName("UTF-8");
                    o.LJFF(forName, "Charset.forName(\"UTF-8\")");
                    Object fromJson = JsonFormatter.fromJson(new String(bArr, forName), DisplayInfo.class);
                    o.LJFF(fromJson, "JsonFormatter.fromJson(v, DisplayInfo::class.java)");
                    displayInfo = (DisplayInfo) fromJson;
                    CastLogger castLogger2 = a.this.w;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("width: ");
                    LIZ2.append(displayInfo.getWidth());
                    LIZ2.append(" height:");
                    LIZ2.append(displayInfo.getHeight());
                    castLogger2.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ2));
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            ByteLinkServiceInfo byteLinkServiceInfo = new ByteLinkServiceInfo(hostAddress, resolvedService.getName(), resolvedService.getPort(), displayInfo.getWidth(), displayInfo.getHeight(), displayInfo.getFps(), displayInfo.getFeatures(), displayInfo.getDeviceID(), "", false);
            Map<String, ByteLinkServiceInfo> map = a.this.j;
            String name = resolvedService.getName();
            o.LJFF(name, "resolvedService.name");
            map.put(name, byteLinkServiceInfo);
            IBrowseListener iBrowseListener = a.this.f111n;
            if (iBrowseListener != null) {
                iBrowseListener.onBrowse(1, new ArrayList(a.this.j.values()));
            }
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdError(String errorMessage, int i, String errorSource) {
            o.LJIIJ(errorMessage, "errorMessage");
            o.LJIIJ(errorSource, "errorSource");
            CastLogger castLogger = a.this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNsdError ");
            LIZ.append(errorSource);
            LIZ.append(" code:");
            LIZ.append(i);
            LIZ.append(" msg:");
            LIZ.append(errorMessage);
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            a.this.j.clear();
            IBrowseListener iBrowseListener = a.this.f111n;
            if (iBrowseListener != null) {
                iBrowseListener.onBrowse(3, null);
            }
        }
    }

    /* loaded from: classes29.dex */
    public final class f implements ThreadFactory {
        public static final f a = new f();

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new PthreadThread(runnable, "/source/a/a$f");
        }
    }

    public a(ContextManager.CastContext castContext, String str) {
        o.LJIIJ(castContext, "castContext");
        this.E = castContext;
        this.a = 16000;
        this.d = "_bytelink._tcp.";
        this.g = "";
        this.h = -1;
        this.j = new HashMap();
        this.u = new Object();
        C16880lQ.LLLLZLLLI(f.a);
        CastLogger logger = ContextManager.getLogger(castContext);
        o.LJFF(logger, "ContextManager.getLogger(castContext)");
        this.w = logger;
        o.LJFF(ContextManager.getMonitor(castContext), "ContextManager.getMonitor(castContext)");
        this.C = new e();
        this.D = new d();
    }

    public static final void a(ContextManager.CastContext castContext, ILibraryLoader iLibraryLoader) {
        F.a(castContext, iLibraryLoader);
    }

    public static final void a(ContextManager.CastContext castContext, ILogger iLogger) {
        F.a(castContext, iLogger);
    }

    private final void a(RTCScreenProfile rTCScreenProfile, int i) {
        int i2;
        int i3;
        switch (i) {
            case 200:
                i2 = 1080;
                i3 = 1920;
                break;
            case 201:
                i2 = 720;
                i3 = 1280;
                break;
            case 202:
            default:
                rTCScreenProfile.setResolution(0, 0);
                return;
            case 203:
                rTCScreenProfile.setResolution(1440, 2560);
                return;
            case 204:
                rTCScreenProfile.setResolution(2160, 3840);
                return;
            case 205:
                rTCScreenProfile.setResolution(2160, 1440);
                return;
        }
        rTCScreenProfile.setResolution(i2, i3);
    }

    private final void a(ByteLinkPlayerInfo byteLinkPlayerInfo) {
        RTCSetting rTCSetting = new RTCSetting(this.E);
        this.f = rTCSetting;
        rTCSetting.setDecodeType(RTCSetting.DECODE_TYPE.DECODE_TYPE_HW);
        RTCSetting rTCSetting2 = this.f;
        if (rTCSetting2 == null) {
            o.LJIIZILJ();
            throw null;
        }
        rTCSetting2.setAVSyncType(RTCSetting.AVSYNC_TYPE.SYNC_LOW_LATENCY);
        RTCSetting rTCSetting3 = this.f;
        if (rTCSetting3 == null) {
            o.LJIIZILJ();
            throw null;
        }
        rTCSetting3.setPort(3230);
        RTCSetting rTCSetting4 = this.f;
        if (rTCSetting4 == null) {
            o.LJIIZILJ();
            throw null;
        }
        if (byteLinkPlayerInfo == null) {
            o.LJIIZILJ();
            throw null;
        }
        rTCSetting4.setVideoSourceType(byteLinkPlayerInfo.getVideoSourceType() == 0 ? RTCSetting.VIDEO_SOURCE_TYPE.SCREEN : RTCSetting.VIDEO_SOURCE_TYPE.CAMERA);
        this.k = byteLinkPlayerInfo.getProjectMode();
        this.l = byteLinkPlayerInfo.getAudioSource();
        RTCScreenProfile rtcScreenProfile = (RTCScreenProfile) JsonFormatter.fromJson("{\"bitrate\":16000,\"codecId\":\"H264\",\"dpi\":440,\"mFps\":60,\"height\":1920,\"isEnabled\":true,\"fixedResolution\":true,\"maxBitrate\":19200,\"sccType\":\"NONE\",\"screenOrientation\":\"SELF_ADAPT\",\"width\":1080}", RTCScreenProfile.class);
        j(byteLinkPlayerInfo.getStreamType());
        g(byteLinkPlayerInfo.getCaptureType());
        k(byteLinkPlayerInfo.getVideoTransProto());
        e(byteLinkPlayerInfo.getAudioTransProto());
        o.LJFF(rtcScreenProfile, "rtcScreenProfile");
        rtcScreenProfile.setCodecId(n(byteLinkPlayerInfo.getCodecId()));
        rtcScreenProfile.setBitrate(m(byteLinkPlayerInfo.getBitRateLevel()), (int) (m(byteLinkPlayerInfo.getBitRateLevel()) * 1.2d));
        a(rtcScreenProfile, byteLinkPlayerInfo.getResolutionLevel());
        rtcScreenProfile.setProjectionMode(o(this.k));
        rtcScreenProfile.setmFps(byteLinkPlayerInfo.getFps());
        rtcScreenProfile.setMediaFormat(byteLinkPlayerInfo.getMeidaFormat());
        RTCSetting rTCSetting5 = this.f;
        if (rTCSetting5 == null) {
            o.LJIIZILJ();
            throw null;
        }
        rTCSetting5.setScreenProfile(rtcScreenProfile);
        RTCVideoProfile rTCVideoProfile = (RTCVideoProfile) JsonFormatter.fromJson("{\"bitrate\":350,\"bitrateMode\":\"BITRATE_MODE_VBR\",\"cameraFacingId\":\"CAMERA_FACING_FRONT\",\"cameraPreviewFps\":30,\"cameraPreviewHeight\":480,\"cameraPreviewMode\":\"FULL\",\"cameraPreviewWidth\":848,\"codecId\":\"H264\",\"autoPublish\":true,\"isEnabled\":true,\"fixedResolution\":false,\"ltr\":false,\"layers\":1,\"maxBitrate\":600}", RTCVideoProfile.class);
        if (rTCVideoProfile != null) {
            rTCVideoProfile.setCodecId(byteLinkPlayerInfo.getCodecId() == 0 ? RTCSetting.VCODEC_ID.H264 : RTCSetting.VCODEC_ID.H265);
            rTCVideoProfile.setBitrate(m(byteLinkPlayerInfo.getBitRateLevel()), (int) (m(byteLinkPlayerInfo.getBitRateLevel()) * 1.2d));
            Point p = p(byteLinkPlayerInfo.getResolutionLevel());
            rTCVideoProfile.setCodecSize(p.y, p.x);
            rTCVideoProfile.setCameraPreviewFps(byteLinkPlayerInfo.getFps());
            RTCSetting rTCSetting6 = this.f;
            if (rTCSetting6 == null) {
                o.LJIIZILJ();
                throw null;
            }
            rTCSetting6.setVideoProfile(rTCVideoProfile);
        }
        RTCAudioProfile rtcAudioProfile = (RTCAudioProfile) JsonFormatter.fromJson("{\"audioAecType\":\"NONE\",\"audioAgcType\":\"NONE\",\"audioAncType\":\"NONE\",\"audioPtsOptimizeEnable\":true,\"audioSource\":8,\"audioStreamType\":3,\"bitrate\":192,\"audioBitrateMode\":\"BITRATE_MODE_CBR\",\"bitwidth\":16,\"bluetoothSCOEnabled\":false,\"samplerate\":48000,\"codecId\":\"AAC\",\"autoPublish\":true,\"autoSubscribe\":true,\"isEchoDetectionEnabled\":false,\"isEnabled\":true,\"isHwAecEnabled\":false,\"isHwNSEnabled\":false,\"maxBitrate\":192,\"channels\":2}", RTCAudioProfile.class);
        o.LJFF(rtcAudioProfile, "rtcAudioProfile");
        rtcAudioProfile.setAudioSource(l(this.l));
        RTCSetting rTCSetting7 = this.f;
        if (rTCSetting7 != null) {
            rTCSetting7.setAudioProfile(rtcAudioProfile);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    public static final boolean a(ContextManager.CastContext castContext, int i) {
        return F.a(castContext, i);
    }

    private final RTCSetting.VIDEO_SOURCE_TYPE b(int i) {
        RTCSetting.VIDEO_SOURCE_TYPE video_source_type = RTCSetting.VIDEO_SOURCE_TYPE.SCREEN;
        return i != 0 ? i != 1 ? i != 2 ? video_source_type : RTCSetting.VIDEO_SOURCE_TYPE.EXTERNAL_SURFACE : RTCSetting.VIDEO_SOURCE_TYPE.CAMERA : video_source_type;
    }

    private final boolean e(int i) {
        RTCSetting rTCSetting;
        RTCSetting.TRANS_TYPE trans_type;
        if (i == 0) {
            rTCSetting = this.f;
            if (rTCSetting != null) {
                trans_type = RTCSetting.TRANS_TYPE.UDP;
                rTCSetting.setAudioTransType(trans_type);
            }
        } else if (i == 1) {
            rTCSetting = this.f;
            if (rTCSetting != null) {
                trans_type = RTCSetting.TRANS_TYPE.TCP;
                rTCSetting.setAudioTransType(trans_type);
            }
        } else if (i == 2 && (rTCSetting = this.f) != null) {
            trans_type = RTCSetting.TRANS_TYPE.DART;
            rTCSetting.setAudioTransType(trans_type);
        }
        return true;
    }

    private final boolean g(int i) {
        RTCSetting rTCSetting;
        RTCSetting.CAPTURE_TYPE capture_type;
        if (i == 0) {
            rTCSetting = this.f;
            if (rTCSetting != null) {
                capture_type = RTCSetting.CAPTURE_TYPE.NATIVE;
                rTCSetting.setCaptureType(capture_type);
            }
        } else if (i == 1 && (rTCSetting = this.f) != null) {
            capture_type = RTCSetting.CAPTURE_TYPE.JAVA;
            rTCSetting.setCaptureType(capture_type);
        }
        return true;
    }

    private final boolean j(int i) {
        RTCSetting rTCSetting;
        RTCSetting.STREAM_TYPE stream_type;
        if (i == 0) {
            rTCSetting = this.f;
            if (rTCSetting != null) {
                stream_type = RTCSetting.STREAM_TYPE.STREAM_ES;
                rTCSetting.setStreamType(stream_type);
            }
        } else if (i == 1 && (rTCSetting = this.f) != null) {
            stream_type = RTCSetting.STREAM_TYPE.STREAM_RAW;
            rTCSetting.setStreamType(stream_type);
        }
        return true;
    }

    private final boolean k(int i) {
        RTCSetting rTCSetting;
        RTCSetting.TRANS_TYPE trans_type;
        if (i == 0) {
            rTCSetting = this.f;
            if (rTCSetting != null) {
                trans_type = RTCSetting.TRANS_TYPE.UDP;
                rTCSetting.setVideoTransType(trans_type);
            }
        } else if (i == 1) {
            rTCSetting = this.f;
            if (rTCSetting != null) {
                trans_type = RTCSetting.TRANS_TYPE.TCP;
                rTCSetting.setVideoTransType(trans_type);
            }
        } else if (i == 2) {
            rTCSetting = this.f;
            if (rTCSetting != null) {
                trans_type = RTCSetting.TRANS_TYPE.DART;
                rTCSetting.setVideoTransType(trans_type);
            }
        } else if (i == 3 && (rTCSetting = this.f) != null) {
            trans_type = RTCSetting.TRANS_TYPE.LLAMA;
            rTCSetting.setVideoTransType(trans_type);
        }
        return true;
    }

    private final int l(int i) {
        if (i != 1) {
            return (i == 3 || i != 4) ? 8 : 5;
        }
        return 1;
    }

    private final int m(int i) {
        switch (i) {
            case 300:
                return 7000;
            case 301:
                return 10000;
            case 302:
                return 14000;
            case 303:
                return 16000;
            case 304:
                return 20000;
            default:
                return this.a;
        }
    }

    private final RTCSetting.VCODEC_ID n(int i) {
        if (i != 0) {
            if (i == 1) {
                return RTCSetting.VCODEC_ID.H265;
            }
            if (i == 2) {
                return RTCSetting.VCODEC_ID.LOSSLESS;
            }
        }
        return RTCSetting.VCODEC_ID.H264;
    }

    private final RTCScreenProfile.PROJECTION_MODE o(int i) {
        return i != 100 ? RTCScreenProfile.PROJECTION_MODE.TNT_DESKTOP : RTCScreenProfile.PROJECTION_MODE.PHONE_MIRROR;
    }

    private final Point p(int i) {
        switch (i) {
            case 200:
                return new Point(1920, 1080);
            case 201:
                return new Point(1280, 720);
            case 202:
                return new Point(1920, 1080);
            case 203:
                return new Point(2560, 1440);
            case 204:
                return new Point(3840, 2160);
            case 205:
                return new Point(2160, 1440);
            default:
                return new Point(1920, 1080);
        }
    }

    public Object a(int i, Object... objects) {
        o.LJIIJ(objects, "objects");
        if (i != 10010) {
            return null;
        }
        return "3.10.2.1.overseas-tt";
    }

    @Override // com.byted.cast.source.services.a.b
    public void a(int i) {
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVolumeChanged()--->volume = ");
        LIZ.append(i);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        synchronized (this.u) {
            RTCEngine rTCEngine = this.e;
            if (rTCEngine != null) {
                float f2 = i;
                rTCEngine.setAudioVolume(f2 / this.m, f2);
            }
        }
    }

    public void a(int i, int i2) {
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.dumpMediaData(i, i2);
        }
    }

    public void a(int i, int i2, Intent data) {
        o.LJIIJ(data, "data");
        this.w.i("ByteLinkSourceImpl2", "onScreenRecordRequestResult ");
        synchronized (this.u) {
            RTCEngine rTCEngine = this.e;
            if (rTCEngine != null) {
                rTCEngine.onScreenRecordRequestResult(i, i2, data);
            }
        }
    }

    public void a(Activity activity) {
        o.LJIIJ(activity, "activity");
        this.w.i("ByteLinkSourceImpl2", "requestScreenRecord ");
        synchronized (this.u) {
            RTCEngine rTCEngine = this.e;
            if (rTCEngine != null) {
                rTCEngine.requestScreenRecord(activity, 101);
            }
        }
    }

    public void a(Context context, String deviceId, ByteLinkPlayerInfo settings) {
        o.LJIIJ(context, "context");
        o.LJIIJ(deviceId, "deviceId");
        o.LJIIJ(settings, "settings");
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init , gitInfo:1.61ac5e2, context:");
        LIZ.append(context);
        LIZ.append(", did:");
        LIZ.append(deviceId);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        synchronized (this.u) {
            this.b = C16880lQ.LLLLL(context);
            this.v = C0011a.m.a(this);
            a(settings);
            Point screenSize = Utils.getScreenSize(context);
            RTCEngine.init(this.b, this.E, RTCEngine.RuntimeEnv.ONLINE, "source", 3230, screenSize.x, screenSize.y, 60, true);
            RTCEngine rTCEngine = this.e;
            if (rTCEngine == null) {
                this.e = RTCEngine.create(context, this.E, this.f, this.D, true);
            } else {
                rTCEngine.reinit(context, this.f, null, this.D, true);
            }
            com.byted.cast.source.services.a aVar = new com.byted.cast.source.services.a(context);
            this.t = aVar;
            aVar.a(this);
            com.byted.cast.source.services.a aVar2 = this.t;
            if (aVar2 == null) {
                o.LJIIZILJ();
                throw null;
            }
            this.m = aVar2.b();
            com.byted.cast.source.services.a aVar3 = this.t;
            if (aVar3 == null) {
                o.LJIIZILJ();
                throw null;
            }
            aVar3.d();
            CastLogger castLogger2 = this.w;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initVolume = ");
            LIZ2.append(this.m);
            castLogger2.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ2));
            int i = this.m;
            if (i == 0) {
                i = 100;
            }
            this.m = i;
        }
    }

    public void a(IByteLinkDisplayListener listener) {
        o.LJIIJ(listener, "listener");
        this.p = listener;
    }

    public void a(IByteLinkPlayerListener listener) {
        o.LJIIJ(listener, "listener");
        this.q = listener;
    }

    public void a(IConnectListener listener) {
        o.LJIIJ(listener, "listener");
        this.o = listener;
    }

    public void a(ByteLinkServiceInfo serviceInfo) {
        o.LJIIJ(serviceInfo, "serviceInfo");
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect ");
        LIZ.append(serviceInfo);
        LIZ.append(", gitInfo:");
        LIZ.append("1.61ac5e2");
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        C0011a c0011a = this.v;
        if (c0011a != null) {
            c0011a.a(serviceInfo);
        }
    }

    public void a(IBrowseListener listener) {
        o.LJIIJ(listener, "listener");
        this.f111n = listener;
    }

    public void a(String json) {
        o.LJIIJ(json, "json");
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendMetaData, json:");
        LIZ.append(json);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.sendMetaData(json);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public void a(String str, String json) {
        o.LJIIJ(str, C63832P3k.LIZ);
        o.LJIIJ(json, "json");
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendMetaData, ip:");
        LIZ.append(str);
        LIZ.append(", json:");
        LIZ.append(json);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.sendMetaData(str, json);
        }
    }

    public final void a(boolean z) {
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.setAudioMix(Boolean.valueOf(z));
        }
    }

    public final RTCStatistics b() {
        RTCEngine rTCEngine = this.e;
        if (rTCEngine == null) {
            return new RTCStatistics();
        }
        RTCStatistics statistics = rTCEngine.getStatistics();
        o.LJFF(statistics, "mRTCEngine!!.statistics");
        return statistics;
    }

    public void b(int i, Object... objects) {
        RTCVideoProfile videoProfile;
        RTCScreenProfile screenProfile;
        RTCScreenProfile screenProfile2;
        o.LJIIJ(objects, "objects");
        if (i == 10019) {
            Object obj = objects[0];
            if (obj instanceof Surface) {
                if (obj == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type android.view.Surface");
                }
                Surface surface = (Surface) obj;
                CastLogger castLogger = this.w;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OPTION_REMOVE_PREVIEW_SURFACE: ");
                LIZ.append(surface);
                castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
                RTCEngine rTCEngine = this.e;
                if (rTCEngine != null) {
                    rTCEngine.removePreviewSurface(surface);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10022) {
            Object obj2 = objects[0];
            if (obj2 instanceof Boolean) {
                if (obj2 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                }
                F.a(this.E, ((Boolean) obj2).booleanValue());
                return;
            }
            return;
        }
        if (i == 10027) {
            Object obj3 = objects[0];
            if (obj3 instanceof Integer) {
                if (obj3 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                }
                int intValue = ((Integer) obj3).intValue();
                CastLogger castLogger2 = this.w;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("OPTION_SET_VIDEO_TRANS_TYPE:");
                LIZ2.append(intValue);
                castLogger2.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ2));
                k(intValue);
                return;
            }
            return;
        }
        if (i == 10053) {
            Object obj4 = objects[0];
            if (obj4 instanceof Boolean) {
                if (obj4 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                CastLogger castLogger3 = this.w;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("OPTION_SET_RECORDER_NEED_RESIZZE:");
                LIZ3.append(booleanValue);
                castLogger3.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ3));
                RTCEngine rTCEngine2 = this.e;
                if (rTCEngine2 != null) {
                    rTCEngine2.setRecorderNeedResize(booleanValue);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10068) {
            Object obj5 = objects[0];
            if (obj5 instanceof String) {
                Object obj6 = objects[1];
                if (obj6 instanceof String) {
                    Object obj7 = objects[2];
                    if (obj7 instanceof String) {
                        Object obj8 = objects[3];
                        if (obj8 instanceof String) {
                            Object obj9 = objects[4];
                            if (obj9 instanceof Boolean) {
                                if (obj5 == null) {
                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                                }
                                this.x = (String) obj5;
                                if (obj6 == null) {
                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                                }
                                this.y = (String) obj6;
                                if (obj7 == null) {
                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                                }
                                this.z = (String) obj7;
                                if (obj8 == null) {
                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                                }
                                this.A = (String) obj8;
                                if (obj9 == null) {
                                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                                }
                                this.B = ((Boolean) obj9).booleanValue();
                                CastLogger castLogger4 = this.w;
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("OPTION_CONFIG_RTCLINK_SOURCE, appId:");
                                LIZ4.append(this.x);
                                LIZ4.append(", token:");
                                LIZ4.append(this.y);
                                LIZ4.append(", roomId:");
                                LIZ4.append(this.z);
                                LIZ4.append(", userId:");
                                LIZ4.append(this.A);
                                LIZ4.append(", enabled:");
                                LIZ4.append(this.B);
                                castLogger4.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ4));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10078) {
            Object obj10 = objects[0];
            if (obj10 instanceof Boolean) {
                if (obj10 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolean booleanValue2 = ((Boolean) obj10).booleanValue();
                CastLogger castLogger5 = this.w;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("OPTION_SET_MAX_FPS:");
                LIZ5.append(booleanValue2);
                castLogger5.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ5));
                RTCEngine rTCEngine3 = this.e;
                if (rTCEngine3 != null) {
                    rTCEngine3.enableSetMaxFps(booleanValue2);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10086) {
            Object obj11 = objects[0];
            if (obj11 instanceof MirrorSettings) {
                if (obj11 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.common.api.MirrorSettings");
                }
                MirrorSettings mirrorSettings = (MirrorSettings) obj11;
                CastLogger castLogger6 = this.w;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("OPTION_SET_MIRROR_CONFIG, enableSourceGl: ");
                LIZ6.append(mirrorSettings.enableSourceOpengl);
                castLogger6.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ6));
                RTCSetting rTCSetting = this.f;
                if (rTCSetting != null) {
                    rTCSetting.setEnableSourceOpengl(mirrorSettings.enableSourceOpengl);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10064) {
            Object obj12 = objects[0];
            if ((obj12 instanceof Integer) && (objects[1] instanceof Integer)) {
                if (obj12 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                }
                int intValue2 = ((Integer) obj12).intValue();
                Object obj13 = objects[1];
                if (obj13 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                }
                int intValue3 = ((Integer) obj13).intValue();
                CastLogger castLogger7 = this.w;
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("OPTION_SET_VIRTUALDISPLAY_WH:");
                LIZ7.append(intValue2);
                LIZ7.append(" x ");
                LIZ7.append(intValue3);
                castLogger7.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ7));
                RTCEngine rTCEngine4 = this.e;
                if (rTCEngine4 != null) {
                    rTCEngine4.setVirtualDisplayWH(intValue2, intValue3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10065) {
            Object obj14 = objects[0];
            if (obj14 instanceof Integer) {
                if (obj14 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                }
                int intValue4 = ((Integer) obj14).intValue();
                CastLogger castLogger8 = this.w;
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("OPTION_CHANGE_SURFACE_FILL_TYPE:");
                LIZ8.append(intValue4);
                castLogger8.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ8));
                RTCEngine rTCEngine5 = this.e;
                if (rTCEngine5 != null) {
                    rTCEngine5.changeSurfaceFillType(intValue4);
                    return;
                }
                return;
            }
            return;
        }
        switch (i) {
            case 10005:
                Object obj15 = objects[0];
                if (obj15 instanceof Surface) {
                    if (obj15 == null) {
                        throw new C37692Eqm("null cannot be cast to non-null type android.view.Surface");
                    }
                    Surface surface2 = (Surface) obj15;
                    CastLogger castLogger9 = this.w;
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("SET_PREVIEW_SURFACE, surface:");
                    LIZ9.append(surface2);
                    castLogger9.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ9));
                    RTCEngine rTCEngine6 = this.e;
                    if (rTCEngine6 != null) {
                        rTCEngine6.setInputPreviewSurface(surface2);
                        return;
                    }
                    return;
                }
                return;
            case 10006:
                Object obj16 = objects[0];
                if (obj16 instanceof Integer) {
                    if (obj16 == null) {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                    }
                    RTCSetting.VIDEO_SOURCE_TYPE b2 = b(((Integer) obj16).intValue());
                    CastLogger castLogger10 = this.w;
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append("SET_VIDEO_SOURCE_TYPE :");
                    LIZ10.append(b2);
                    castLogger10.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ10));
                    RTCSetting rTCSetting2 = this.f;
                    if (rTCSetting2 != null) {
                        rTCSetting2.setVideoSourceType(b2);
                    }
                    RTCEngine rTCEngine7 = this.e;
                    if (rTCEngine7 != null) {
                        rTCEngine7.setCaptureSource(b2);
                        return;
                    }
                    return;
                }
                return;
            case 10007:
                Object obj17 = objects[0];
                if (obj17 instanceof RTCVideoProfile.CAMERA_FACING_ID) {
                    if (obj17 == null) {
                        throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.sdk.RTCVideoProfile.CAMERA_FACING_ID");
                    }
                    RTCVideoProfile.CAMERA_FACING_ID camera_facing_id = (RTCVideoProfile.CAMERA_FACING_ID) obj17;
                    CastLogger castLogger11 = this.w;
                    StringBuilder LIZ11 = X1D.LIZ();
                    LIZ11.append("SET_CAMERA_ID, cameraId:");
                    LIZ11.append(camera_facing_id);
                    castLogger11.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ11));
                    RTCSetting rTCSetting3 = this.f;
                    if (rTCSetting3 != null && (videoProfile = rTCSetting3.getVideoProfile()) != null) {
                        videoProfile.setCameraId(camera_facing_id);
                    }
                    String str = camera_facing_id == RTCVideoProfile.CAMERA_FACING_ID.CAMERA_FACING_FRONT ? "1" : CardStruct.IStatusCode.DEFAULT;
                    CastLogger castLogger12 = this.w;
                    StringBuilder LIZ12 = X1D.LIZ();
                    LIZ12.append("switchCamera, realCameraId:");
                    LIZ12.append(str);
                    castLogger12.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ12));
                    RTCEngine rTCEngine8 = this.e;
                    if (rTCEngine8 != null) {
                        rTCEngine8.switchCamera(str);
                        return;
                    }
                    return;
                }
                return;
            default:
                switch (i) {
                    case 10012:
                        Object obj18 = objects[0];
                        if (obj18 instanceof Integer) {
                            if (obj18 == null) {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                            }
                            this.h = ((Integer) obj18).intValue();
                            CastLogger castLogger13 = this.w;
                            StringBuilder LIZ13 = X1D.LIZ();
                            LIZ13.append("OPTION_SET_VIRTUALDISPLAY_FLAG:");
                            LIZ13.append(this.h);
                            castLogger13.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ13));
                            RTCSetting rTCSetting4 = this.f;
                            if (rTCSetting4 == null || (screenProfile2 = rTCSetting4.getScreenProfile()) == null) {
                                return;
                            }
                            screenProfile2.setVirtualDisplayFlag(this.h);
                            return;
                        }
                        return;
                    case 10013:
                        Object obj19 = objects[0];
                        if (obj19 instanceof String) {
                            if (obj19 == null) {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                            }
                            this.g = (String) obj19;
                            CastLogger castLogger14 = this.w;
                            StringBuilder LIZ14 = X1D.LIZ();
                            LIZ14.append("OPTION_SET_VIRTUALDISPLAY_NAME:");
                            LIZ14.append(this.g);
                            castLogger14.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ14));
                            RTCSetting rTCSetting5 = this.f;
                            if (rTCSetting5 == null || (screenProfile = rTCSetting5.getScreenProfile()) == null) {
                                return;
                            }
                            screenProfile.setVirtualDisplayName(this.g);
                            return;
                        }
                        return;
                    case 10014:
                        if (objects[0] instanceof ISurfaceListener) {
                            CastLogger castLogger15 = this.w;
                            StringBuilder LIZ15 = X1D.LIZ();
                            LIZ15.append("OPTION_SET_INPUT_SURFACE_AVAILABLE:");
                            LIZ15.append(objects[0]);
                            castLogger15.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ15));
                            RTCEngine rTCEngine9 = this.e;
                            if (rTCEngine9 != null) {
                                Object obj20 = objects[0];
                                if (obj20 == null) {
                                    throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.common.api.ISurfaceListener");
                                }
                                rTCEngine9.setInputSurfaceListener((ISurfaceListener) obj20);
                                return;
                            }
                            return;
                        }
                        return;
                    case 10015:
                        CastLogger castLogger16 = this.w;
                        StringBuilder sb = new StringBuilder("OPTION_START_VIDEO_ENCODE, videosource:");
                        RTCSetting rTCSetting6 = this.f;
                        sb.append(rTCSetting6 != null ? rTCSetting6.getVideoSourceType() : null);
                        castLogger16.i("ByteLinkSourceImpl2", sb.toString());
                        RTCSetting rTCSetting7 = this.f;
                        if ((rTCSetting7 != null ? rTCSetting7.getVideoSourceType() : null) == RTCSetting.VIDEO_SOURCE_TYPE.EXTERNAL_SURFACE) {
                            Object obj21 = objects[0];
                            if (obj21 instanceof MediaProjection) {
                                if (obj21 == null) {
                                    throw new C37692Eqm("null cannot be cast to non-null type android.media.projection.MediaProjection");
                                }
                                MediaProjection mediaProjection = (MediaProjection) obj21;
                                CastLogger castLogger17 = this.w;
                                StringBuilder LIZ16 = X1D.LIZ();
                                LIZ16.append("OPTION_START_VIDEO_ENCODE, set projection:");
                                LIZ16.append(mediaProjection);
                                castLogger17.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ16));
                                RTCEngine rTCEngine10 = this.e;
                                if (rTCEngine10 != null) {
                                    rTCEngine10.setMediaProjection(mediaProjection);
                                }
                            }
                            RTCEngine rTCEngine11 = this.e;
                            if (rTCEngine11 != null) {
                                rTCEngine11.startScreenRecord();
                                return;
                            }
                            return;
                        }
                        return;
                    case 10016:
                        Object obj22 = objects[0];
                        if (obj22 instanceof Boolean) {
                            if (obj22 == null) {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolean booleanValue3 = ((Boolean) obj22).booleanValue();
                            CastLogger castLogger18 = this.w;
                            StringBuilder LIZ17 = X1D.LIZ();
                            LIZ17.append("OPTION_SET_FLASH_ENABLE: ");
                            LIZ17.append(booleanValue3);
                            castLogger18.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ17));
                            RTCEngine rTCEngine12 = this.e;
                            if (rTCEngine12 != null) {
                                rTCEngine12.setFlashEnable(booleanValue3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 10017:
                        Object obj23 = objects[0];
                        if (obj23 instanceof Boolean) {
                            if (obj23 == null) {
                                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolean booleanValue4 = ((Boolean) obj23).booleanValue();
                            CastLogger castLogger19 = this.w;
                            StringBuilder LIZ18 = X1D.LIZ();
                            LIZ18.append("OPTION_SET_AUDIO_ENABLE :");
                            LIZ18.append(booleanValue4);
                            castLogger19.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ18));
                            RTCEngine rTCEngine13 = this.e;
                            if (rTCEngine13 != null) {
                                rTCEngine13.setAudioEnable(booleanValue4);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 100041:
                                Object obj24 = objects[0];
                                if (obj24 instanceof ILibraryLoader) {
                                    if (obj24 == null) {
                                        throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.common.api.ILibraryLoader");
                                    }
                                    this.r = (ILibraryLoader) obj24;
                                    CastLogger castLogger20 = this.w;
                                    StringBuilder LIZ19 = X1D.LIZ();
                                    LIZ19.append("OPTION_SET_LIBRARY_LOADER:");
                                    LIZ19.append(this.r);
                                    castLogger20.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ19));
                                    F.a(this.E, this.r);
                                    return;
                                }
                                return;
                            case 100042:
                                Object obj25 = objects[0];
                                if (obj25 instanceof ILogger) {
                                    if (obj25 == null) {
                                        throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.common.api.ILogger");
                                    }
                                    ILogger iLogger = (ILogger) obj25;
                                    this.w.setLogger(iLogger);
                                    CastLogger castLogger21 = this.w;
                                    StringBuilder LIZ20 = X1D.LIZ();
                                    LIZ20.append("OPTION_SET_LOGGER:");
                                    LIZ20.append(iLogger);
                                    castLogger21.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ20));
                                    F.a(this.E, iLogger);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                }
        }
    }

    public void b(String token) {
        o.LJIIJ(token, "token");
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.setCastToken(token);
        }
    }

    public boolean b(int i, int i2) {
        RTCVideoProfile videoProfile;
        RTCVideoProfile videoProfile2;
        RTCScreenProfile screenProfile;
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        RTCSetting rTCSetting = this.f;
        if (rTCSetting != null && (screenProfile = rTCSetting.getScreenProfile()) != null) {
            screenProfile.setResolution(i, i2);
        }
        RTCSetting rTCSetting2 = this.f;
        if ((rTCSetting2 != null ? rTCSetting2.getVideoSourceType() : null) == RTCSetting.VIDEO_SOURCE_TYPE.CAMERA) {
            CastLogger castLogger = this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setResolution camera, w:");
            LIZ.append(i2);
            LIZ.append(", h:");
            LIZ.append(i);
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
            RTCSetting rTCSetting3 = this.f;
            if (rTCSetting3 == null || (videoProfile2 = rTCSetting3.getVideoProfile()) == null) {
                return true;
            }
            videoProfile2.setCodecSize(i2, i);
            return true;
        }
        CastLogger castLogger2 = this.w;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setResolution screen, w:");
        LIZ2.append(i);
        LIZ2.append(", h:");
        LIZ2.append(i2);
        castLogger2.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ2));
        RTCSetting rTCSetting4 = this.f;
        if (rTCSetting4 == null || (videoProfile = rTCSetting4.getVideoProfile()) == null) {
            return true;
        }
        videoProfile.setCodecSize(i, i2);
        return true;
    }

    public boolean b(ByteLinkServiceInfo byteLinkServiceInfo) {
        C0011a c0011a;
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disConnect, gitInfo:1.61ac5e2, serviceInfo:");
        LIZ.append(byteLinkServiceInfo);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        ByteLinkServiceInfo byteLinkServiceInfo2 = this.i;
        if (byteLinkServiceInfo2 == null || (c0011a = this.v) == null) {
            return true;
        }
        c0011a.g(byteLinkServiceInfo2);
        return true;
    }

    public final void c() {
        IByteLinkPlayerListener iByteLinkPlayerListener;
        RTCEngine rTCEngine;
        this.w.i("ByteLinkSourceImpl2", "handleCastRequestSuccess");
        IByteLinkPlayerListener iByteLinkPlayerListener2 = this.q;
        if (iByteLinkPlayerListener2 != null) {
            iByteLinkPlayerListener2.onMonitorEvent(this.i, "bytelink_RTCEngine_prepareVideoEncoder", "");
        }
        RTCSetting rTCSetting = this.f;
        RTCSetting.VIDEO_SOURCE_TYPE videoSourceType = rTCSetting != null ? rTCSetting.getVideoSourceType() : null;
        RTCSetting.VIDEO_SOURCE_TYPE video_source_type = RTCSetting.VIDEO_SOURCE_TYPE.EXTERNAL_SURFACE;
        if (videoSourceType == video_source_type && (rTCEngine = this.e) != null) {
            rTCEngine.prepareVideoEncoder();
        }
        RTCSetting rTCSetting2 = this.f;
        if ((rTCSetting2 != null ? rTCSetting2.getVideoSourceType() : null) != video_source_type) {
            IByteLinkPlayerListener iByteLinkPlayerListener3 = this.q;
            if (iByteLinkPlayerListener3 != null) {
                iByteLinkPlayerListener3.onMonitorEvent(this.i, "bytelink_RTCEngine_startScreenRecord", "");
            }
            RTCEngine rTCEngine2 = this.e;
            if (rTCEngine2 != null) {
                rTCEngine2.startScreenRecord();
            }
        }
        ByteLinkServiceInfo byteLinkServiceInfo = this.i;
        if (byteLinkServiceInfo != null && (iByteLinkPlayerListener = this.q) != null) {
            iByteLinkPlayerListener.onMonitorEvent(byteLinkServiceInfo, "bytelink_cast_success", "");
        }
        IByteLinkPlayerListener iByteLinkPlayerListener4 = this.q;
        if (iByteLinkPlayerListener4 != null) {
            iByteLinkPlayerListener4.onStart();
        }
    }

    public final void c(int i) {
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.setAudioMixScale(i);
        }
    }

    public final void c(ByteLinkServiceInfo serviceInfo) {
        o.LJIIJ(serviceInfo, "serviceInfo");
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.castCancel();
        }
        IByteLinkPlayerListener iByteLinkPlayerListener = this.q;
        if (iByteLinkPlayerListener != null) {
            iByteLinkPlayerListener.onMonitorEvent(serviceInfo, "bytelink_stop_cast", "");
        }
    }

    public synchronized void c(String serverName) {
        INsdHelper iNsdHelper;
        o.LJIIJ(serverName, "serverName");
        this.w.i("ByteLinkSourceImpl2", "startBrowse");
        this.j.clear();
        String str = this.s;
        if (str != null && (iNsdHelper = this.c) != null) {
            iNsdHelper.stopDiscovery(str);
        }
        INsdHelper createNsdHelper = NsdFactory.createNsdHelper(NsdUtils.getNsdType(this.E), this.b, this.E, this.C, "ByteLinkSource", this.r);
        this.c = createNsdHelper;
        if (createNsdHelper != null) {
            createNsdHelper.setLogEnabled(true);
            createNsdHelper.setDiscoveryTimeout(0);
            this.s = createNsdHelper.startDiscovery(this.E, this.d, serverName, this.C);
            CastLogger castLogger = this.w;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startBrowse, mDiscoveryId:");
            LIZ.append(this.s);
            castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        }
    }

    public final void d() {
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.startScreenRecord();
        }
    }

    public final void d(ByteLinkServiceInfo serviceInfo) {
        RTCVideoProfile videoProfile;
        o.LJIIJ(serviceInfo, "serviceInfo");
        this.i = serviceInfo;
        b(serviceInfo.getWidth(), serviceInfo.getHeight());
        i(serviceInfo.getFps());
        RTCSetting rTCSetting = this.f;
        if (rTCSetting != null && (videoProfile = rTCSetting.getVideoProfile()) != null) {
            videoProfile.setCaptureType(serviceInfo.getCaptureType());
        }
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            RTCSetting rTCSetting2 = this.f;
            rTCEngine.setVideoSourceType(rTCSetting2 != null ? rTCSetting2.getVideoSourceType() : null);
            RTCSetting rTCSetting3 = this.f;
            rTCEngine.setVideoProfile(rTCSetting3 != null ? rTCSetting3.getVideoProfile() : null);
            RTCSetting rTCSetting4 = this.f;
            rTCEngine.setScreenProfile(rTCSetting4 != null ? rTCSetting4.getScreenProfile() : null);
            RTCSetting rTCSetting5 = this.f;
            rTCEngine.setAudioProfile(rTCSetting5 != null ? rTCSetting5.getAudioProfile() : null);
            RTCSetting rTCSetting6 = this.f;
            RTCSetting.TRANS_TYPE audioTransType = rTCSetting6 != null ? rTCSetting6.getAudioTransType() : null;
            RTCSetting rTCSetting7 = this.f;
            rTCEngine.setTransType(audioTransType, rTCSetting7 != null ? rTCSetting7.getVideoTransType() : null);
        }
        CastLogger castLogger = this.w;
        StringBuilder sb = new StringBuilder("handleCastRequest, serviceInfo:");
        sb.append(serviceInfo);
        sb.append(", screenProfile:");
        RTCSetting rTCSetting8 = this.f;
        sb.append(rTCSetting8 != null ? rTCSetting8.getScreenProfile() : null);
        sb.append(", videoProfile:");
        RTCSetting rTCSetting9 = this.f;
        sb.append(rTCSetting9 != null ? rTCSetting9.getVideoProfile() : null);
        sb.append(", videoSourceType:");
        RTCSetting rTCSetting10 = this.f;
        sb.append(rTCSetting10 != null ? rTCSetting10.getVideoSourceType() : null);
        sb.append(", getCaptureType:");
        sb.append(serviceInfo.getCaptureType());
        castLogger.i("ByteLinkSourceImpl2", sb.toString());
        RTCEngine rTCEngine2 = this.e;
        if (rTCEngine2 != null) {
            rTCEngine2.castRequest();
        }
        IByteLinkPlayerListener iByteLinkPlayerListener = this.q;
        if (iByteLinkPlayerListener != null) {
            iByteLinkPlayerListener.onMonitorEvent(serviceInfo, "bytelink_start_cast", "");
        }
    }

    public boolean d(int i) {
        RTCSetting rTCSetting;
        RTCAudioProfile audioProfile;
        RTCAudioProfile audioProfile2;
        RTCAudioProfile audioProfile3;
        RTCAudioProfile audioProfile4;
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioSource ");
        LIZ.append(i);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        this.l = i;
        if (i == 0) {
            RTCSetting rTCSetting2 = this.f;
            if (rTCSetting2 != null && (audioProfile4 = rTCSetting2.getAudioProfile()) != null) {
                audioProfile4.setEnabled(false);
            }
        } else {
            RTCSetting rTCSetting3 = this.f;
            if (rTCSetting3 != null && (audioProfile3 = rTCSetting3.getAudioProfile()) != null) {
                audioProfile3.setEnabled(true);
            }
            RTCSetting rTCSetting4 = this.f;
            if (rTCSetting4 != null && (audioProfile2 = rTCSetting4.getAudioProfile()) != null) {
                audioProfile2.setAudioSource(l(this.l));
            }
            if (this.l == 3 && (rTCSetting = this.f) != null && (audioProfile = rTCSetting.getAudioProfile()) != null) {
                audioProfile.setUseMediaProjection(true);
            }
        }
        return true;
    }

    public synchronized void e() {
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopBrowse, mDiscoveryId:");
        LIZ.append(this.s);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        String str = this.s;
        if (str != null) {
            INsdHelper iNsdHelper = this.c;
            if (iNsdHelper != null) {
                iNsdHelper.stopDiscovery(this.E, str);
            }
            this.c = null;
        }
    }

    public final void e(ByteLinkServiceInfo serviceInfo) {
        o.LJIIJ(serviceInfo, "serviceInfo");
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleConnect: ");
        LIZ.append(serviceInfo);
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        this.i = serviceInfo;
        if (serviceInfo.get_RtcLink()) {
            RTCEngine rTCEngine = this.e;
            if (rTCEngine != null) {
                rTCEngine.sourceInitAndJoinRoom(serviceInfo.get_RtcRoomId(), serviceInfo.get_RtcUserId(), serviceInfo.get_RtcAppId(), serviceInfo.get_RtcToken());
            }
        } else {
            RTCEngine rTCEngine2 = this.e;
            if (rTCEngine2 != null) {
                rTCEngine2.connect(serviceInfo.getIp(), serviceInfo.getPort(), " ", " ");
            }
        }
        IByteLinkPlayerListener iByteLinkPlayerListener = this.q;
        if (iByteLinkPlayerListener != null) {
            iByteLinkPlayerListener.onMonitorEvent(this.i, "bytelink_connect", "");
        }
    }

    public void f() {
        C0011a c0011a;
        this.w.i("ByteLinkSourceImpl2", "stopCast, gitInfo:1.61ac5e2");
        ByteLinkServiceInfo byteLinkServiceInfo = this.i;
        if (byteLinkServiceInfo != null) {
            C0011a c0011a2 = this.v;
            if (c0011a2 != null) {
                c0011a2.b(byteLinkServiceInfo);
            }
            if (byteLinkServiceInfo.isConnectByUser() || (c0011a = this.v) == null) {
                return;
            }
            c0011a.g(byteLinkServiceInfo);
        }
    }

    public void f(int i) {
        RTCVideoProfile videoProfile;
        RTCScreenProfile screenProfile;
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.setBitrate(i);
        }
        RTCSetting rTCSetting = this.f;
        if (rTCSetting != null && (screenProfile = rTCSetting.getScreenProfile()) != null) {
            screenProfile.setBitrate(i, (int) (i * 1.2d));
        }
        RTCSetting rTCSetting2 = this.f;
        if (rTCSetting2 == null || (videoProfile = rTCSetting2.getVideoProfile()) == null) {
            return;
        }
        videoProfile.setBitrate(i, (int) (i * 1.2d));
    }

    public void f(ByteLinkServiceInfo serviceInfo) {
        C0011a c0011a;
        o.LJIIJ(serviceInfo, "serviceInfo");
        CastLogger castLogger = this.w;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startMirror: ");
        LIZ.append(serviceInfo);
        LIZ.append(", gitInfo: 1.61ac5e2");
        castLogger.i("ByteLinkSourceImpl2", X1D.LIZIZ(LIZ));
        if (!serviceInfo.isConnectByUser() && (c0011a = this.v) != null) {
            c0011a.a(serviceInfo);
        }
        C0011a c0011a2 = this.v;
        if (c0011a2 != null) {
            c0011a2.d(serviceInfo);
        }
    }

    public final void g() {
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.stopScreenRecord();
        }
    }

    public void h(int i) {
        RTCVideoProfile videoProfile;
        RTCScreenProfile screenProfile;
        RTCSetting.VCODEC_ID n2 = n(i);
        RTCEngine rTCEngine = this.e;
        if (rTCEngine != null) {
            rTCEngine.setVideoCodecID(n2);
        }
        RTCSetting rTCSetting = this.f;
        if (rTCSetting != null && (screenProfile = rTCSetting.getScreenProfile()) != null) {
            screenProfile.setCodecId(n2);
        }
        RTCSetting rTCSetting2 = this.f;
        if (rTCSetting2 == null || (videoProfile = rTCSetting2.getVideoProfile()) == null) {
            return;
        }
        videoProfile.setCodecId(n2);
    }

    public boolean i(int i) {
        RTCVideoProfile videoProfile;
        RTCScreenProfile screenProfile;
        if (i <= 0) {
            return false;
        }
        RTCSetting rTCSetting = this.f;
        if (rTCSetting != null && (screenProfile = rTCSetting.getScreenProfile()) != null) {
            screenProfile.setmFps(i);
        }
        RTCSetting rTCSetting2 = this.f;
        if (rTCSetting2 == null || (videoProfile = rTCSetting2.getVideoProfile()) == null) {
            return true;
        }
        videoProfile.setCameraPreviewFps(i);
        return true;
    }

    public void a() {
        this.w.i("ByteLinkSourceImpl2", "destroy ");
        com.byted.cast.source.services.a aVar = this.t;
        if (aVar != null) {
            aVar.e();
        }
        e();
        synchronized (this.u) {
            RTCEngine rTCEngine = this.e;
            if (rTCEngine != null) {
                rTCEngine.destroy();
            }
            this.e = null;
            VoipEngine.deinitialize(this.E);
            this.w.i("ByteLinkSourceImpl2", "destroy, before state machine doQuit");
            C0011a c0011a = this.v;
            if (c0011a != null) {
                c0011a.e();
            }
            this.v = null;
            this.w.i("ByteLinkSourceImpl2", "destroy, after state machine doQuit");
        }
    }

    /* renamed from: com.byted.cast.source.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes29.dex */
    public static final class C0011a extends com.byted.cast.source.b.c {
        public static final c m = new c();
        public a d;
        public CastLogger e;
        public final g f;
        public final e g;
        public final d h;
        public final f i;
        public final h j;
        public final b k;
        public final C0012a l;

        /* renamed from: com.byted.cast.source.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes29.dex */
        public final class C0012a extends com.byted.cast.source.b.b {
            public C0012a() {
            }

            @Override // com.byted.cast.source.b.b, com.byted.cast.source.b.a
            public String a() {
                return "CancelingState";
            }

            @Override // com.byted.cast.source.b.b
            public void c() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "CancelingState::exit");
                C0011a.this.b(b.EnumC0013a.MSG_CANCEL_FAILED.ordinal());
            }

            @Override // com.byted.cast.source.b.b
            public void b() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "CancelingState::enter");
                ByteLinkServiceInfo byteLinkServiceInfo = C0011a.this.l().i;
                if (byteLinkServiceInfo != null) {
                    c cVar = new c(byteLinkServiceInfo, 190000, 190001, "CancelTimeout", true);
                    C0011a c0011a = C0011a.this;
                    c0011a.a(c0011a.a(b.EnumC0013a.MSG_CANCEL_FAILED.ordinal(), cVar), 20000L);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
            
                if (r0 != null) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
            
                if (r0 != null) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00ff, code lost:
            
                r3 = r3.d();
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
            
                if (r0 != null) goto L44;
             */
            @Override // com.byted.cast.source.b.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(android.os.Message r7) {
                /*
                    Method dump skipped, instructions count: 329
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.a.a.C0011a.C0012a.a(android.os.Message):boolean");
            }
        }

        /* renamed from: com.byted.cast.source.a.a$a$c */
        /* loaded from: classes29.dex */
        public static final class c {
            public c() {
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C0011a a(a impl) {
                o.LJIIJ(impl, "impl");
                C0011a c0011a = new C0011a("ByteLinkSource", impl);
                c0011a.a(true);
                c0011a.d();
                return c0011a;
            }
        }

        /* renamed from: com.byted.cast.source.a.a$a$d */
        /* loaded from: classes29.dex */
        public final class d extends com.byted.cast.source.b.b {
            public d() {
            }

            @Override // com.byted.cast.source.b.b, com.byted.cast.source.b.a
            public String a() {
                return "ConnectedState";
            }

            @Override // com.byted.cast.source.b.b
            public void c() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "ConnectedState::exit");
                C0011a.this.b(b.EnumC0013a.MSG_CONNECT_FAILED.ordinal());
            }

            @Override // com.byted.cast.source.b.b
            public void b() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "ConnectedState::enter");
                ByteLinkServiceInfo byteLinkServiceInfo = C0011a.this.l().i;
                if (byteLinkServiceInfo != null) {
                    c cVar = new c(byteLinkServiceInfo, 190000, 190004, "ConnectTimeout", true);
                    C0011a c0011a = C0011a.this;
                    c0011a.a(c0011a.a(b.EnumC0013a.MSG_CONNECT_FAILED.ordinal(), cVar), 20000L);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
            
                if (r0 != null) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
            
                r0.onMonitorEvent(r1, "bytelink_disconnect", "");
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
            
                if (r0 != null) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
            
                r1 = r1.d();
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
            
                if (r0 != null) goto L33;
             */
            @Override // com.byted.cast.source.b.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(android.os.Message r6) {
                /*
                    Method dump skipped, instructions count: 251
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.a.a.C0011a.d.a(android.os.Message):boolean");
            }
        }

        /* renamed from: com.byted.cast.source.a.a$a$f */
        /* loaded from: classes29.dex */
        public final class f extends com.byted.cast.source.b.b {
            public f() {
            }

            @Override // com.byted.cast.source.b.b, com.byted.cast.source.b.a
            public String a() {
                return "DisConnectingState";
            }

            @Override // com.byted.cast.source.b.b
            public void c() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "DisConnectingState::exit");
                C0011a.this.b(b.EnumC0013a.MSG_DISCONNECT_FAILED.ordinal());
            }

            @Override // com.byted.cast.source.b.b
            public void b() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "DisConnectingState::enter");
                ByteLinkServiceInfo byteLinkServiceInfo = C0011a.this.l().i;
                if (byteLinkServiceInfo != null) {
                    c cVar = new c(byteLinkServiceInfo, 190000, 190002, "DisconnectTimeout", true);
                    C0011a c0011a = C0011a.this;
                    c0011a.a(c0011a.a(b.EnumC0013a.MSG_DISCONNECT_FAILED.ordinal(), cVar), 20000L);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
            
                if (r4 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
            
                r4.onDisconnect(r5.d(), r5.e(), r5.a(), r5.b());
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
            
                r1 = r6.a;
                r1.a((com.byted.cast.source.b.a) r1.k());
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
            
                if (r4 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
            
                if (r4 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
            
                if (r4 != null) goto L22;
             */
            @Override // com.byted.cast.source.b.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(android.os.Message r7) {
                /*
                    Method dump skipped, instructions count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.a.a.C0011a.f.a(android.os.Message):boolean");
            }
        }

        /* renamed from: com.byted.cast.source.a.a$a$g */
        /* loaded from: classes29.dex */
        public final class g extends com.byted.cast.source.b.b {
            public g() {
            }

            @Override // com.byted.cast.source.b.b, com.byted.cast.source.b.a
            public String a() {
                return "IdleState";
            }

            @Override // com.byted.cast.source.b.b
            public boolean a(Message msg) {
                o.LJIIJ(msg, "msg");
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", a() + ", msg: " + msg);
                C0011a.this.a(msg, this);
                int i = msg.what;
                if (i == b.EnumC0013a.MSG_CONNECT.ordinal()) {
                    a l = C0011a.this.l();
                    Object obj = msg.obj;
                    if (obj == null) {
                        throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.source.browser.api.ByteLinkServiceInfo");
                    }
                    l.e((ByteLinkServiceInfo) obj);
                    C0011a c0011a = C0011a.this;
                    c0011a.a((com.byted.cast.source.b.a) c0011a.i());
                    return true;
                }
                if (i != b.EnumC0013a.MSG_CASTREQUEST.ordinal()) {
                    if (i != b.EnumC0013a.MSG_DISCONNECT.ordinal() && i != b.EnumC0013a.MSG_CANCELREQUEST.ordinal()) {
                        return true;
                    }
                    C0011a.this.a(msg.what, com.byted.cast.source.api.a.IDLE);
                    return true;
                }
                a l2 = C0011a.this.l();
                Object obj2 = msg.obj;
                if (obj2 == null) {
                    throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.source.browser.api.ByteLinkServiceInfo");
                }
                l2.e((ByteLinkServiceInfo) obj2);
                C0011a c0011a2 = C0011a.this;
                c0011a2.a((com.byted.cast.source.b.a) c0011a2.i());
                C0011a.this.a(msg);
                return true;
            }

            @Override // com.byted.cast.source.b.b
            public void b() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "IdleState::enter");
            }

            @Override // com.byted.cast.source.b.b
            public void c() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "IdleState::exit");
            }
        }

        /* renamed from: com.byted.cast.source.a.a$a$h */
        /* loaded from: classes29.dex */
        public final class h extends com.byted.cast.source.b.b {
            public h() {
            }

            @Override // com.byted.cast.source.b.b, com.byted.cast.source.b.a
            public String a() {
                return "RequestingState";
            }

            @Override // com.byted.cast.source.b.b
            public void c() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "RequestingState::exit");
                C0011a.this.b(b.EnumC0013a.MSG_CASTREQUEST_FAILED.ordinal());
            }

            @Override // com.byted.cast.source.b.b
            public void b() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "RequestingState::enter");
                ByteLinkServiceInfo byteLinkServiceInfo = C0011a.this.l().i;
                if (byteLinkServiceInfo != null) {
                    c cVar = new c(byteLinkServiceInfo, 190000, 190003, "CastTimeout", true);
                    C0011a c0011a = C0011a.this;
                    c0011a.a(c0011a.a(b.EnumC0013a.MSG_CASTREQUEST_FAILED.ordinal(), cVar), 20000L);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
            
                if (r3 != null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
            
                r3.onError(r4.e(), r4.a(), r4.b());
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
            
                r1 = r5.a;
                r0 = r1.h();
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
            
                if (r3 != null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
            
                if (r3 != null) goto L26;
             */
            @Override // com.byted.cast.source.b.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(android.os.Message r6) {
                /*
                    Method dump skipped, instructions count: 321
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.a.a.C0011a.h.a(android.os.Message):boolean");
            }
        }

        private final void o() {
            a(this.f, (com.byted.cast.source.b.b) null);
            a(this.g, this.f);
            a(this.h, this.f);
            a(this.i, this.f);
            a(this.j, this.h);
            a(this.k, this.h);
            a(this.l, this.h);
            a((com.byted.cast.source.b.b) this.f);
        }

        public final void a(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            a(b.EnumC0013a.MSG_CANCEL_FAILED.ordinal(), errorContent).sendToTarget();
        }

        public final void a(ByteLinkServiceInfo serviceInfo) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            a(b.EnumC0013a.MSG_CONNECT.ordinal(), serviceInfo).sendToTarget();
        }

        public final void b(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            a(b.EnumC0013a.MSG_CAPTURE_FAILED.ordinal(), errorContent).sendToTarget();
        }

        public final void b(ByteLinkServiceInfo serviceInfo) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            a(b.EnumC0013a.MSG_CANCELREQUEST.ordinal(), serviceInfo).sendToTarget();
        }

        public final void c(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            a(b.EnumC0013a.MSG_CASTREQUEST_FAILED.ordinal(), errorContent).sendToTarget();
        }

        public final void c(ByteLinkServiceInfo serviceInfo) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            a(b.EnumC0013a.MSG_CANCEL_SUCCESS.ordinal(), serviceInfo).sendToTarget();
        }

        public final void d(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            a(b.EnumC0013a.MSG_CONNECT_FAILED.ordinal(), errorContent).sendToTarget();
        }

        public final void d(ByteLinkServiceInfo serviceInfo) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            a(b.EnumC0013a.MSG_CASTREQUEST.ordinal(), serviceInfo).sendToTarget();
        }

        public final void e() {
            c();
        }

        public final void e(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            a(b.EnumC0013a.MSG_DISCONNECT_FAILED.ordinal(), errorContent).sendToTarget();
        }

        public final void e(ByteLinkServiceInfo serviceInfo) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            a(b.EnumC0013a.MSG_CASTREQUEST_SUCCESS.ordinal(), serviceInfo).sendToTarget();
        }

        public final C0012a f() {
            return this.l;
        }

        public final void f(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            a(b.EnumC0013a.MSG_DISCONNECT_SUCCESS.ordinal(), errorContent).sendToTarget();
        }

        public final void f(ByteLinkServiceInfo serviceInfo) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            a(b.EnumC0013a.MSG_CONNECT_SUCCESS.ordinal(), serviceInfo).sendToTarget();
        }

        public final b g() {
            return this.k;
        }

        public final void g(ByteLinkServiceInfo serviceInfo) {
            o.LJIIJ(serviceInfo, "serviceInfo");
            a(b.EnumC0013a.MSG_DISCONNECT.ordinal(), serviceInfo).sendToTarget();
        }

        public final d h() {
            return this.h;
        }

        public final void h(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            g(errorContent);
            b(b.EnumC0013a.MSG_CONNECT.ordinal());
            b(b.EnumC0013a.MSG_CASTREQUEST.ordinal());
            a(b.EnumC0013a.MSG_BY_KICK_OUT.ordinal(), errorContent).sendToTarget();
        }

        public final e i() {
            return this.g;
        }

        public final void i(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            j(errorContent);
            b(b.EnumC0013a.MSG_CONNECT.ordinal());
            b(b.EnumC0013a.MSG_CASTREQUEST.ordinal());
            a(b.EnumC0013a.MSG_NETWORK_ERROR.ordinal(), errorContent).sendToTarget();
        }

        public final f j() {
            return this.i;
        }

        public final g k() {
            return this.f;
        }

        public final a l() {
            return this.d;
        }

        public final CastLogger m() {
            return this.e;
        }

        public final h n() {
            return this.j;
        }

        /* renamed from: com.byted.cast.source.a.a$a$b */
        /* loaded from: classes29.dex */
        public final class b extends com.byted.cast.source.b.b {
            public b() {
            }

            @Override // com.byted.cast.source.b.b, com.byted.cast.source.b.a
            public String a() {
                return "CastedState";
            }

            @Override // com.byted.cast.source.b.b
            public void b() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "CastedState::enter");
            }

            @Override // com.byted.cast.source.b.b
            public void c() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "CastedState::exit");
            }

            /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
            
                if (r3 != null) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
            
                r3.onMonitorEvent(r1.d(), "bytelink_stop_cast", "");
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
            
                if (r3 != null) goto L34;
             */
            @Override // com.byted.cast.source.b.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(android.os.Message r6) {
                /*
                    Method dump skipped, instructions count: 314
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.a.a.C0011a.b.a(android.os.Message):boolean");
            }
        }

        /* renamed from: com.byted.cast.source.a.a$a$e */
        /* loaded from: classes29.dex */
        public final class e extends com.byted.cast.source.b.b {
            public e() {
            }

            @Override // com.byted.cast.source.b.b, com.byted.cast.source.b.a
            public String a() {
                return "ConnectingState";
            }

            @Override // com.byted.cast.source.b.b
            public void b() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "ConnectingState::enter");
            }

            @Override // com.byted.cast.source.b.b
            public void c() {
                C0011a.this.m().i("ByteLinkSourceImpl2::CastStateMachine", "ConnectingState::exit");
            }

            /* JADX WARN: Code restructure failed: missing block: B:50:0x0114, code lost:
            
                if (r2 != null) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
            
                r2.onMonitorEvent(r1.d(), "bytelink_disconnect", "");
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x011f, code lost:
            
                r1 = r7.a;
                r0 = r1.j();
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
            
                if (r2 != null) goto L48;
             */
            @Override // com.byted.cast.source.b.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(android.os.Message r8) {
                /*
                    Method dump skipped, instructions count: 351
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.a.a.C0011a.e.a(android.os.Message):boolean");
            }
        }

        public final void g(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            CastLogger castLogger = this.e;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyKickOutToUser:");
            LIZ.append(errorContent);
            castLogger.i("ByteLinkSourceImpl2::CastStateMachine", X1D.LIZIZ(LIZ));
            if (errorContent.c()) {
                IByteLinkPlayerListener iByteLinkPlayerListener = this.d.q;
                if (iByteLinkPlayerListener != null) {
                    iByteLinkPlayerListener.onInfo(errorContent.e(), errorContent.a(), errorContent.b());
                }
                errorContent.a(false);
            }
        }

        public final void j(c errorContent) {
            o.LJIIJ(errorContent, "errorContent");
            CastLogger castLogger = this.e;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyNetworkErrorToUser:");
            LIZ.append(errorContent);
            castLogger.i("ByteLinkSourceImpl2::CastStateMachine", X1D.LIZIZ(LIZ));
            if (errorContent.c()) {
                IByteLinkPlayerListener iByteLinkPlayerListener = this.d.q;
                if (iByteLinkPlayerListener != null) {
                    iByteLinkPlayerListener.onError(errorContent.e(), errorContent.a(), errorContent.b());
                }
                errorContent.a(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0011a(String str, a impl) {
            super(str);
            o.LJIIJ(impl, "impl");
            this.f = new g();
            this.g = new e();
            this.h = new d();
            this.i = new f();
            this.j = new h();
            this.k = new b();
            this.l = new C0012a();
            this.d = impl;
            this.e = impl.w;
            o();
        }

        public final void a(Message msg, com.byted.cast.source.b.a state) {
            ByteLinkServiceInfo byteLinkServiceInfo;
            String str;
            o.LJIIJ(msg, "msg");
            o.LJIIJ(state, "state");
            Object obj = msg.obj;
            if (obj instanceof ByteLinkServiceInfo) {
                if (obj != null) {
                    byteLinkServiceInfo = (ByteLinkServiceInfo) obj;
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.source.browser.api.ByteLinkServiceInfo");
                }
            } else if (obj instanceof c) {
                if (obj != null) {
                    byteLinkServiceInfo = ((c) obj).d();
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.source.impl.ByteLinkSourceImpl2.ErrorContent");
                }
            } else {
                byteLinkServiceInfo = null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", state.a());
                b.EnumC0013a a = b.EnumC0013a.r.a(msg.what);
                if (a == null || (str = a.a()) == null) {
                    str = "unknown";
                }
                jSONObject.put("action", str);
                jSONObject.put("msg", msg.toString());
                IByteLinkPlayerListener iByteLinkPlayerListener = this.d.q;
                if (iByteLinkPlayerListener != null) {
                    iByteLinkPlayerListener.onMonitorEvent(byteLinkServiceInfo, "StateInfo", jSONObject.toString());
                }
            } catch (JSONException unused) {
            }
        }

        public final void a(int i, com.byted.cast.source.api.a state) {
            String str;
            o.LJIIJ(state, "state");
            try {
                JSONObject jSONObject = new JSONObject();
                b.EnumC0013a a = b.EnumC0013a.r.a(i);
                if (a == null || (str = a.a()) == null) {
                    str = "unknown";
                }
                jSONObject.put("action", str);
                jSONObject.put("state", state.name());
                IByteLinkPlayerListener iByteLinkPlayerListener = this.d.q;
                if (iByteLinkPlayerListener != null) {
                    iByteLinkPlayerListener.onInfo(300005, state.ordinal(), jSONObject.toString());
                }
            } catch (JSONException e2) {
                this.e.w("ByteLinkSourceImpl2::CastStateMachine", "notifyStateToUser, json error:" + e2);
            }
        }
    }

    /* loaded from: classes29.dex */
    public static final class b {

        /* renamed from: com.byted.cast.source.a.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes29.dex */
        public enum EnumC0013a {
            MSG_CONNECT(0, "connect"),
            MSG_CONNECT_SUCCESS(1, "connect_success"),
            MSG_CONNECT_FAILED(2, "connect_failed"),
            MSG_DISCONNECT(3, "disconnect"),
            MSG_DISCONNECT_SUCCESS(4, "disconnect_success"),
            MSG_DISCONNECT_FAILED(5, "disconnect_failed"),
            MSG_CASTREQUEST(6, "cast_request"),
            MSG_CASTREQUEST_SUCCESS(7, "cast_request_success"),
            MSG_CASTREQUEST_FAILED(8, "cast_request_failed"),
            MSG_CAPTURE_FAILED(9, "capture_failed"),
            MSG_CANCELREQUEST(10, "cancel_request"),
            MSG_CANCEL_SUCCESS(11, "cancel_success"),
            MSG_CANCEL_FAILED(12, "cancel_failed"),
            MSG_NETWORK_ERROR(13, "network_error"),
            MSG_BY_KICK_OUT(14, "be_kicked_out");

            public static final C0014a r = new C0014a();
            public String a;

            /* renamed from: com.byted.cast.source.a.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes29.dex */
            public static final class C0014a {
                public C0014a() {
                }

                public /* synthetic */ C0014a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EnumC0013a a(int i) {
                    for (EnumC0013a enumC0013a : EnumC0013a.values()) {
                        if (enumC0013a.ordinal() == i) {
                            return enumC0013a;
                        }
                    }
                    return null;
                }
            }

            EnumC0013a(int i, String str) {
                this.a = str;
            }

            public static EnumC0013a valueOf(String str) {
                return (EnumC0013a) V0N.LJJJ(EnumC0013a.class, str);
            }

            public final String a() {
                return String.valueOf(this.a);
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(ContextManager.CastContext castContext, ILogger iLogger) {
            o.LJIIJ(castContext, "castContext");
            RTCEngine.setLogger(castContext, iLogger);
        }

        public final boolean a(ContextManager.CastContext castContext, int i) {
            o.LJIIJ(castContext, "castContext");
            ContextManager.getLogger(castContext).setLogLevel(i);
            return RTCEngine.setLogLevel(castContext, i);
        }

        public final void a(ContextManager.CastContext castContext, ILibraryLoader iLibraryLoader) {
            o.LJIIJ(castContext, "castContext");
            VoipEngine.setLibraryLoader(iLibraryLoader);
        }

        public final void a(ContextManager.CastContext castContext, boolean z) {
            o.LJIIJ(castContext, "castContext");
            VoipEngine.setFileLogEnabled(castContext, z);
        }
    }
}
