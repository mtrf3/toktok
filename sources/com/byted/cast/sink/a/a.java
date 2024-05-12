package com.byted.cast.sink.a;

import X.C16880lQ;
import X.C90652Zhw;
import X.C90653Zhx;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.DisplayInfo;
import com.byted.cast.common.MD5;
import com.byted.cast.common.api.IAudioDataListener;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.ISinkDataListener;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.discovery.NsdFactory;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;
import com.byted.cast.common.discovery.NsdUtils;
import com.byted.cast.engine.VoipEngine;
import com.byted.cast.sdk.IRTCEngineEventListener;
import com.byted.cast.sdk.RTCEngine;
import com.byted.cast.sdk.RTCSetting;
import com.byted.cast.sdk.RTCStatistics;
import com.byted.cast.sdk.model.RemoteMirrorConnectionInfo;
import com.byted.cast.sdk.utils.Utils;
import com.byted.cast.sdk.view.IRenderView;
import com.byted.cast.sink.a.a;
import com.byted.cast.sink.api.CastInfo;
import com.byted.cast.sink.api.ClientInfo;
import com.byted.cast.sink.api.IOnLogMonitor;
import com.byted.cast.sink.api.IPreemptListener;
import com.byted.cast.sink.api.IServerListener;
import com.byted.cast.sink.api.ServerInfo;
import com.byted.cast.sink.api.multiple.IMultipleActiveControl;
import com.byted.cast.sink.api.multiple.IMultipleLoader;
import com.byted.cast.sink.api.multiple.IMultipleReverseControl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class a {
    public ILibraryLoader A;
    public String B;
    public String C;
    public String D;
    public String E;
    public boolean F;
    public String G;

    /* renamed from: J, reason: collision with root package name */
    public ContextManager.CastContext f109J;
    public CastLogger K;
    public String L;
    public Context a;
    public INsdHelper b;
    public String d;
    public int e;
    public RTCEngine g;
    public RTCSetting h;
    public IServerListener i;
    public IMultipleReverseControl j;
    public IOnLogMonitor k;
    public IPreemptListener l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f110n;
    public int o;
    public boolean p;
    public Handler w;
    public String c = "_bytelink._tcp.";
    public Point f = new Point();
    public boolean q = false;
    public ConcurrentSkipListMap<String, ClientInfo> r = new ConcurrentSkipListMap<>();
    public Map<String, CastInfo> s = new HashMap();
    public Map<String, IRenderView> t = new HashMap();
    public Map<String, ViewGroup> u = new HashMap();
    public int v = 0;
    public int x = 3230;
    public boolean y = true;
    public int z = 0;
    public boolean H = false;
    public final Object I = new Object();
    public IMultipleLoader M = new C0009a();
    public IMultipleActiveControl N = new b();
    public IRTCEngineEventListener O = new c();
    public IRenderView.IRenderCallback P = new d();
    public NsdListener Q = new e();

    /* loaded from: classes29.dex */
    public class c implements IRTCEngineEventListener {
        public c() {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCancelSuccess() {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCastControl(int i, int i2) {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCastSuccess() {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onConnectStateChanged(RTCEngine.ConnectState connectState) {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onPaused() {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onResumed() {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onStat(String str) {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onStopped() {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onStuckStat(String str) {
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onKilled() {
            a.this.K.w("ByteLinkSinkImpl", "sink mirror is killed");
            a.this.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(CastInfo castInfo) {
            if (a.this.i != null) {
                CastLogger castLogger = a.this.K;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onCast start, castInfo:");
                LIZ.append(castInfo);
                castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
                CastInfo castInfo2 = new CastInfo(castInfo);
                castInfo2.infoType = 100;
                a.this.i.onCast(3, castInfo2);
                CastInfo castInfo3 = new CastInfo(castInfo);
                castInfo3.infoType = 101;
                a.this.i.onCast(3, castInfo3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(CastInfo castInfo) {
            if (a.this.i != null) {
                CastLogger castLogger = a.this.K;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onCast pause, castInfo:");
                LIZ.append(castInfo);
                castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
                CastInfo castInfo2 = new CastInfo(castInfo);
                castInfo2.infoType = 104;
                a.this.i.onCast(3, castInfo2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(CastInfo castInfo) {
            if (a.this.i != null) {
                CastLogger castLogger = a.this.K;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onCast resume, castInfo:");
                LIZ.append(castInfo);
                castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
                CastInfo castInfo2 = new CastInfo(castInfo);
                castInfo2.infoType = 105;
                a.this.i.onCast(3, castInfo2);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onCancelRequest(String str) {
            a.this.K.i("ByteLinkSinkImpl", "onCancelRequest " + str + ", gitInfo:1.61ac5e2");
            ClientInfo clientInfo = a.this.r.get(str);
            if (clientInfo == null) {
                a.this.K.e("ByteLinkSinkImpl", "onCancelRequest " + str + " has been already disconnected?");
                return;
            }
            a.this.a(clientInfo, false, RTCEngine.ExitReason.REASON_DISCONNECT, false);
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onFirstVideoFrame(String str) {
            if (a.this.i != null) {
                a.this.i.onFirstVideoFrame(str);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onIntoBackground(final String str) {
            a.this.K.i("ByteLinkSinkImpl", "onIntoBackground, userId:" + str);
            final ClientInfo clientInfo = a.this.r.get(str);
            if (clientInfo == null) {
                a.this.K.e("ByteLinkSinkImpl", str + " has not been connected?");
                return;
            }
            CastInfo castInfo = a.this.s.get(str);
            final CastInfo castInfo2 = new CastInfo();
            castInfo2.clientID = clientInfo.clientID;
            if (castInfo != null) {
                castInfo2.token = castInfo.token;
            }
            castInfo2.castType = 2;
            castInfo2.audioSessionId = a.this.g.getAudioSessionId(str);
            castInfo2.rotation = 1;
            castInfo2.mimeType = 102;
            a.this.w.post(new Runnable() { // from class: X.Zad
                @Override // java.lang.Runnable
                public final void run() {
                    a.c.this.b(castInfo2);
                }
            });
            a.this.w.post(new Runnable() { // from class: X.Zae
                @Override // java.lang.Runnable
                public final void run() {
                    a.c.this.a(clientInfo, str);
                }
            });
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onIntoForeground(String str) {
            a.this.K.i("ByteLinkSinkImpl", "onIntoForeground, userId:" + str);
            ClientInfo clientInfo = a.this.r.get(str);
            if (clientInfo == null) {
                a.this.K.e("ByteLinkSinkImpl", str + " has not been connected?");
                return;
            }
            CastInfo castInfo = a.this.s.get(str);
            final CastInfo castInfo2 = new CastInfo();
            castInfo2.clientID = clientInfo.clientID;
            if (castInfo != null) {
                castInfo2.token = castInfo.token;
            }
            castInfo2.castType = 2;
            castInfo2.audioSessionId = a.this.g.getAudioSessionId(str);
            castInfo2.rotation = 1;
            castInfo2.mimeType = 102;
            a.this.w.post(new Runnable() { // from class: X.Zag
                @Override // java.lang.Runnable
                public final void run() {
                    a.c.this.c(castInfo2);
                }
            });
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onRecvMetaData(String str) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRecvMetaData, json:");
            LIZ.append(str);
            castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
            if (a.this.i != null) {
                ClientInfo clientInfo = new ClientInfo();
                clientInfo.name = "ReverseConnection";
                clientInfo.clientID = "ReverseConnection";
                clientInfo.ip = "ReverseConnection";
                clientInfo.sourceType = 102;
                a.this.i.onRecvMetaData(1, clientInfo, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ClientInfo clientInfo, String str) {
            ViewGroup viewGroup = a.this.u.get(clientInfo.clientID);
            if (viewGroup != null) {
                a.this.t.get(str).removeRenderCallback(a.this.P);
                a.this.t.remove(str);
                viewGroup.removeAllViews();
                a.this.u.remove(clientInfo.clientID);
                viewGroup.setKeepScreenOn(false);
                a.this.K.i("ByteLinkSinkImpl", "onIntoBackground, container.removeAllViews");
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public boolean onCastRequest(String str, String str2) {
            CastLogger castLogger;
            StringBuilder sb;
            String str3;
            a.this.K.i("ByteLinkSinkImpl", "onCastRequest " + str + ", gitInfo:1.61ac5e2");
            ClientInfo clientInfo = a.this.r.get(str);
            if (clientInfo == null) {
                castLogger = a.this.K;
                sb = new StringBuilder();
                sb.append(str);
                str3 = " has not been connected?";
            } else if (a.this.s.get(str) != null) {
                castLogger = a.this.K;
                sb = new StringBuilder();
                sb.append(str);
                str3 = " has already casted";
            } else {
                final CastInfo castInfo = new CastInfo();
                castInfo.clientID = clientInfo.clientID;
                castInfo.token = str2;
                castInfo.castType = 2;
                castInfo.audioSessionId = a.this.g.getAudioSessionId(str);
                castInfo.rotation = 1;
                castInfo.mimeType = 102;
                a.this.s.put(str, castInfo);
                a.this.w.postDelayed(new Runnable() { // from class: X.Zaf
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.this.a(castInfo);
                    }
                }, 200L);
                return true;
            }
            sb.append(str3);
            castLogger.e("ByteLinkSinkImpl", sb.toString());
            return false;
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onConnect(String str, String str2) {
            a.this.K.i("ByteLinkSinkImpl", "onConnect " + str + ", gitInfo:1.61ac5e2");
            if (a.this.r.get(str) != null) {
                a.this.K.e("ByteLinkSinkImpl", str + " has been already connected?");
                return;
            }
            ClientInfo clientInfo = new ClientInfo();
            clientInfo.ip = str;
            clientInfo.name = str2;
            clientInfo.clientID = a.this.a(str);
            a.this.r.put(str, clientInfo);
            if (a.this.i != null) {
                a.this.i.onConnect(3, clientInfo);
                if (a.this.l != null) {
                    a.this.l.onPreempt(clientInfo);
                }
            }
            if (!TextUtils.equals("bytelink-remote-mirror", str) && a.this.F) {
                a.this.K.i("ByteLinkSinkImpl", "onConnect: leave RTC room when bytelink connection established");
                a.this.k();
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onDisconnect(RTCEngine.ExitReason exitReason, String str) {
            if (a.this.i != null) {
                ClientInfo clientInfo = new ClientInfo();
                clientInfo.name = "ReverseConnection";
                clientInfo.clientID = "ReverseConnection";
                clientInfo.ip = "ReverseConnection";
                clientInfo.sourceType = 101;
                a.this.i.onDisconnect(3, clientInfo);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onError(int i, String str) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError: code=");
            LIZ.append(i);
            LIZ.append(", description=");
            LIZ.append(str);
            castLogger.e("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
            if (a.this.i != null) {
                a.this.i.onError(3, 1000, i, str);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onLogMonitor(String str, String[][] strArr) {
            if (a.this.k != null) {
                a.this.k.onLogMonitor(str, strArr);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onMonitorEvent(String str, String str2) {
            if (a.this.i != null) {
                a.this.i.onMonitorEvent(str, str2);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onRecvMetaData(String str, String str2) {
            a.this.K.i("ByteLinkSinkImpl", "onRecvMetaData, userId:" + str + ", json:" + str2);
            if (a.this.i != null) {
                a.this.i.onRecvMetaData(1, a.this.r.get(str), str2);
                a.this.K.i("ByteLinkSinkImpl", "onRecvMetaData");
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onSinkLatencyStat(String str, String str2) {
            if (a.this.i != null) {
                a.this.i.onSinkLatencyStat(3, str, str2);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onSinkStuckStat(String str, String str2) {
            if (a.this.i != null) {
                a.this.i.onSinkStuckStat(3, str, str2);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onAudioSetVolume(String str, float f, float f2) {
            if (a.this.j != null) {
                a.this.j.setVolume(a.this.r.get(str).clientID, (int) (f * 100.0f));
                a.this.K.i("ByteLinkSinkImpl", "onAudioSetVolume");
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onConnectSuccess(int i, int i2, int i3) {
            if (a.this.i != null) {
                ClientInfo clientInfo = new ClientInfo();
                clientInfo.name = "ReverseConnection";
                clientInfo.clientID = "ReverseConnection";
                clientInfo.ip = "ReverseConnection";
                clientInfo.sourceType = 101;
                a.this.i.onConnect(3, clientInfo);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void onDisconnect(String str, RTCEngine.ExitReason exitReason, String str2) {
            a.this.K.i("ByteLinkSinkImpl", "onDisconnect " + str + ", reason:" + exitReason + ", message:" + str2 + ", gitInfo:1.61ac5e2");
            ClientInfo clientInfo = a.this.r.get(str);
            if (clientInfo == null) {
                if (TextUtils.equals("bytelink-remote-mirror", str)) {
                    a.this.K.i("ByteLinkSinkImpl", "onDisconnect: fail to join rtc room");
                    ClientInfo clientInfo2 = new ClientInfo();
                    clientInfo2.ip = str;
                    clientInfo2.name = str;
                    clientInfo2.clientID = a.this.a(str);
                    if (a.this.i != null) {
                        a.this.i.onDisconnect(3, clientInfo2);
                        return;
                    }
                    return;
                }
                a.this.K.e("ByteLinkSinkImpl", str + " has been already disconnected?");
                return;
            }
            a.this.a(clientInfo, false, exitReason, true);
            if (a.this.F && exitReason != RTCEngine.ExitReason.REASON_DISCONNECT) {
                a.this.K.i("ByteLinkSinkImpl", "onDisconnect: join RTC room when bytelink connection lost");
                a.this.g.sinkInitAndJoinRoom(a.this.D, a.this.E, a.this.B, a.this.C);
            }
        }

        @Override // com.byted.cast.sdk.IRTCEngineEventListener
        public void OnVideoSizeChanged(String str, final int i, final int i2, int i3) {
            a.this.K.i("ByteLinkSinkImpl", "OnVideoSizeChanged: userId=" + str + " width=" + i + " height" + i2 + " rotation=" + i3);
            final IRenderView iRenderView = a.this.t.get(str);
            if (iRenderView != null) {
                a.this.w.post(new Runnable() { // from class: X.Zac
                    @Override // java.lang.Runnable
                    public final void run() {
                        IRenderView.this.setVideoSize(i, i2);
                    }
                });
            } else {
                a.this.K.e("ByteLinkSinkImpl", "OnVideoSizeChanged: error");
            }
            if (a.this.i != null) {
                CastInfo castInfo = a.this.s.get(str);
                if (castInfo != null) {
                    castInfo.infoType = 103;
                    CastInfo.SizeInfo sizeInfo = new CastInfo.SizeInfo();
                    castInfo.sizeInfo = sizeInfo;
                    sizeInfo.width = i;
                    sizeInfo.height = i2;
                    castInfo.rotation = i3;
                    a.this.i.onCast(3, castInfo);
                    return;
                }
                a.this.K.e("ByteLinkSinkImpl", "OnVideoSizeChanged");
            }
        }
    }

    public a(ContextManager.CastContext castContext) {
        this.f109J = castContext;
        this.K = ContextManager.getLogger(castContext);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.Zhx] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.byted.cast.sink.a.a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.FrameLayout, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public IRenderView a(Context context, String str, FrameLayout frameLayout) {
        C90652Zhw c90652Zhw;
        CastLogger castLogger = this.K;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createRenderView: userId=");
        LIZ.append(str);
        LIZ.append(" container=");
        LIZ.append((Object) frameLayout);
        castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
        int i = this.v;
        if (i != 0) {
            c90652Zhw = i != 1 ? null : new C90653Zhx(context);
        } else {
            this.K.i("ByteLinkSinkImpl", "new SurfaceRenderView:");
            c90652Zhw = new C90652Zhw(context, this.f109J);
        }
        a(str, c90652Zhw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(c90652Zhw, layoutParams);
        frameLayout.setKeepScreenOn(true);
        return c90652Zhw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return str + "_" + MD5.hexdigest(str + System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CastInfo castInfo, String str) {
        ViewGroup viewGroup = this.u.get(castInfo.clientID);
        if (viewGroup != null) {
            this.t.get(str).removeRenderCallback(this.P);
            this.t.remove(str);
            C16880lQ.LJLLL((View) this.t.get(str), viewGroup);
            this.u.remove(castInfo.clientID);
            viewGroup.setKeepScreenOn(false);
            this.K.i("ByteLinkSinkImpl", "kickOutSource, container.removeAllViews");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ClientInfo clientInfo, String str) {
        ViewGroup viewGroup = this.u.get(clientInfo.clientID);
        if (viewGroup != null) {
            this.t.get(str).removeRenderCallback(this.P);
            this.t.remove(str);
            this.u.remove(clientInfo.clientID);
            viewGroup.setKeepScreenOn(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if (r8.i != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        r1 = r8.K;
        r0 = X.X1D.LIZ();
        r0.append("kickOutSource, onCast stop:");
        r0.append(r4);
        r1.i("ByteLinkSinkImpl", X.X1D.LIZIZ(r0));
        r8.i.onCast(3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (r8.i != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        if (r8.i != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.byted.cast.sink.api.ClientInfo r9, boolean r10, com.byted.cast.sdk.RTCEngine.ExitReason r11, boolean r12) {
        /*
            r8 = this;
            com.byted.cast.common.CastLogger r2 = r8.K
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "kickOutSource, active:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", reason:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", disconnect:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r6 = "ByteLinkSinkImpl"
            r2.i(r6, r0)
            if (r9 == 0) goto L35
            java.lang.String r2 = r9.ip
            if (r2 != 0) goto L36
        L35:
            return
        L36:
            java.lang.String r1 = "/"
            java.lang.String r0 = ""
            java.lang.String r5 = r2.replace(r1, r0)
            java.util.Map<java.lang.String, com.byted.cast.sink.api.CastInfo> r0 = r8.s
            java.lang.Object r4 = r0.get(r5)
            com.byted.cast.sink.api.CastInfo r4 = (com.byted.cast.sink.api.CastInfo) r4
            r3 = 3
            if (r4 == 0) goto L86
            r1 = 102(0x66, float:1.43E-43)
            r4.infoType = r1
            r7 = 1
            java.lang.String r2 = "kickOutSource, onCast stop:"
            if (r10 == 0) goto L9c
            com.byted.cast.sink.api.CastInfo$StopInfo r1 = new com.byted.cast.sink.api.CastInfo$StopInfo
            r0 = 101(0x65, float:1.42E-43)
            r1.<init>(r7, r0)
            r4.stopInfo = r1
            com.byted.cast.sink.api.IServerListener r0 = r8.i
            if (r0 == 0) goto L77
        L5f:
            com.byted.cast.common.CastLogger r1 = r8.K
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            r1.i(r6, r0)
            com.byted.cast.sink.api.IServerListener r0 = r8.i
            r0.onCast(r3, r4)
        L77:
            android.os.Handler r1 = r8.w
            X.Zab r0 = new X.Zab
            r0.<init>()
            r1.post(r0)
            java.util.Map<java.lang.String, com.byted.cast.sink.api.CastInfo> r0 = r8.s
            r0.remove(r5)
        L86:
            if (r10 == 0) goto L8d
            com.byted.cast.sdk.RTCEngine r0 = r8.g
            r0.kickOutSource(r5)
        L8d:
            if (r12 == 0) goto L35
            java.util.concurrent.ConcurrentSkipListMap<java.lang.String, com.byted.cast.sink.api.ClientInfo> r0 = r8.r
            r0.remove(r5)
            com.byted.cast.sink.api.IServerListener r0 = r8.i
            if (r0 == 0) goto L35
            r0.onDisconnect(r3, r9)
            goto L35
        L9c:
            com.byted.cast.sdk.RTCEngine$ExitReason r0 = com.byted.cast.sdk.RTCEngine.ExitReason.REASON_DISCONNECT
            if (r11 == r0) goto Lb2
            com.byted.cast.sdk.RTCEngine$ExitReason r0 = com.byted.cast.sdk.RTCEngine.ExitReason.REASON_KICK_OUT
            if (r11 == r0) goto Lb2
            com.byted.cast.sink.api.CastInfo$StopInfo r1 = new com.byted.cast.sink.api.CastInfo$StopInfo
            r0 = 104(0x68, float:1.46E-43)
            r1.<init>(r3, r0)
            r4.stopInfo = r1
            com.byted.cast.sink.api.IServerListener r0 = r8.i
            if (r0 == 0) goto L77
            goto L5f
        Lb2:
            if (r12 != 0) goto L77
            com.byted.cast.sink.api.CastInfo$StopInfo r0 = new com.byted.cast.sink.api.CastInfo$StopInfo
            r0.<init>(r7, r1)
            r4.stopInfo = r0
            com.byted.cast.sink.api.IServerListener r0 = r8.i
            if (r0 == 0) goto L77
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sink.a.a.a(com.byted.cast.sink.api.ClientInfo, boolean, com.byted.cast.sdk.RTCEngine$ExitReason, boolean):void");
    }

    private void a(String str, Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("in setOutputSurface, sessionId:");
        LIZ.append(str);
        LIZ.append(", surface:");
        LIZ.append(surface);
        LIZ.append(", UserCastMap size:");
        LIZ.append(this.s.size());
        X1D.LIZIZ(LIZ);
        for (Map.Entry<String, CastInfo> entry : this.s.entrySet()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setOutputSurface, clientId:");
            LIZ2.append(entry.getValue().clientID);
            LIZ2.append(", sessionId:");
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
            if (entry.getValue().clientID.equals(str)) {
                String key = entry.getKey();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("setOutputSurface, userId:");
                LIZ3.append(key);
                LIZ3.append(", sessionId:");
                LIZ3.append(str);
                X1D.LIZIZ(LIZ3);
                this.g.setVideoSurface(key, surface);
                return;
            }
        }
    }

    private void a(String str, IRenderView iRenderView) {
        CastLogger castLogger = this.K;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRenderView: userId=");
        LIZ.append(str);
        LIZ.append(" renderView=");
        LIZ.append(iRenderView);
        castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
        if (iRenderView == null) {
            return;
        }
        if (this.t.get(str) != null) {
            this.t.get(str).removeRenderCallback(this.P);
        }
        this.t.put(str, iRenderView);
        CastLogger castLogger2 = this.K;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addRenderCallback:");
        LIZ2.append(this.P);
        castLogger2.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ2));
        this.t.get(str).addRenderCallback(this.P);
    }

    private void f() {
        RTCSetting rTCSetting = new RTCSetting(this.f109J);
        this.h = rTCSetting;
        rTCSetting.setDecodeType(RTCSetting.DECODE_TYPE.DECODE_TYPE_HW);
        this.h.setAVSyncType(RTCSetting.AVSYNC_TYPE.SYNC_LOW_LATENCY);
        this.h.setPort(this.x);
        int arch = Utils.getArch();
        float oSVersionF = Utils.getOSVersionF();
        CastLogger castLogger = this.K;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initConfig, cpuarch:");
        LIZ.append(arch);
        LIZ.append(", osVersionF:");
        LIZ.append(oSVersionF);
        castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
        this.K.i("ByteLinkSinkImpl", "initConfig, disable native video decoder!");
        this.h.setEnableVideoNativeDecode(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        for (Map.Entry<String, ClientInfo> entry : this.r.entrySet()) {
            if (!"bytelink-remote-mirror".equals(entry.getKey())) {
                a(entry.getValue(), true, RTCEngine.ExitReason.REASON_DISCONNECT, true);
            }
        }
    }

    private void h() {
        if (this.H) {
            INsdHelper createNsdHelper = NsdFactory.createNsdHelper(NsdUtils.getNsdType(this.f109J), this.a, this.f109J, this.Q, "ByteLinkSink", this.A);
            this.b = createNsdHelper;
            createNsdHelper.setLogEnabled(true);
            DisplayInfo displayInfo = new DisplayInfo(this.m, this.f110n, this.o, 1, this.L);
            Gson gson = new Gson();
            String json = GsonProtectorUtils.toJson(gson, displayInfo);
            HashMap hashMap = new HashMap();
            hashMap.put("display", json);
            if (this.F) {
                hashMap.put("rtc", GsonProtectorUtils.toJson(gson, new RemoteMirrorConnectionInfo(this.D, this.E)));
            }
            this.G = this.b.registerService(this.d, this.c, this.x, hashMap, this.Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        for (final String str : this.r.keySet()) {
            CastLogger castLogger = this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopRemoteMirror cur userId=");
            LIZ.append(str);
            castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
            if ("bytelink-remote-mirror".equals(str)) {
                final ClientInfo clientInfo = this.r.get(str);
                CastInfo castInfo = this.s.get(str);
                if (castInfo != null) {
                    castInfo.infoType = 102;
                    castInfo.stopInfo = new CastInfo.StopInfo(1, 101);
                    if (this.i != null) {
                        CastLogger castLogger2 = this.K;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("kickOutSources, onCast stop:");
                        LIZ2.append(castInfo);
                        castLogger2.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ2));
                        this.i.onCast(3, castInfo);
                    }
                }
                this.g.kickOutSource(str);
                this.r.remove(str);
                this.s.remove(str);
                this.w.post(new Runnable() { // from class: X.Zaa
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a(clientInfo, str);
                    }
                });
                IServerListener iServerListener = this.i;
                if (iServerListener != null) {
                    iServerListener.onDisconnect(3, clientInfo);
                }
            }
        }
    }

    private void m() {
        INsdHelper iNsdHelper;
        String str;
        if (!this.H || (iNsdHelper = this.b) == null || (str = this.G) == null) {
            return;
        }
        iNsdHelper.unregisterService(str);
        this.b = null;
        synchronized (this.I) {
            try {
                this.I.wait(1000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public Object a(int i, Object... objArr) {
        if (i != 32) {
            return null;
        }
        return "3.10.2.1.overseas-tt";
    }

    public void a(int i) {
        RTCSetting rTCSetting;
        RTCSetting.AVSYNC_TYPE avsync_type;
        if (i == 0) {
            rTCSetting = this.h;
            avsync_type = RTCSetting.AVSYNC_TYPE.SYNC_LOW_LATENCY;
        } else {
            if (i != 1) {
                return;
            }
            rTCSetting = this.h;
            avsync_type = RTCSetting.AVSYNC_TYPE.SYNC_NORMAL;
        }
        rTCSetting.setAVSyncType(avsync_type);
    }

    public void a(int i, int i2) {
        RTCEngine rTCEngine = this.g;
        if (rTCEngine != null) {
            rTCEngine.dumpMediaData(i, i2);
        }
    }

    public void a(Application application) {
        RTCEngine rTCEngine = this.g;
        if (rTCEngine != null) {
            rTCEngine.setApplication(application);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0124, code lost:
    
        if (r0 > 1080) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r1 = r1 / 2;
        r0 = r0 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013a, code lost:
    
        if (r0 > 1080) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        if (r0 > 1080) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sink.a.a.a(android.content.Context, java.lang.String):void");
    }

    public void a(ILogger iLogger) {
        RTCEngine.setLogger(this.f109J, iLogger);
    }

    public void a(IOnLogMonitor iOnLogMonitor) {
        this.k = iOnLogMonitor;
    }

    public void a(IPreemptListener iPreemptListener) {
        this.l = iPreemptListener;
    }

    public void a(IServerListener iServerListener) {
        this.i = iServerListener;
    }

    public void a(IMultipleReverseControl iMultipleReverseControl) {
        this.j = iMultipleReverseControl;
    }

    public void a(String str, String str2) {
        if (this.g != null) {
            this.K.i("ByteLinkSinkImpl", "sendMetaData id:" + str + "meta:" + str2);
            for (String str3 : this.r.keySet()) {
                ClientInfo clientInfo = this.r.get(str3);
                this.K.i("ByteLinkSinkImpl", "sendMetaData " + clientInfo.clientID);
                if (clientInfo.clientID == str) {
                    this.g.sendMetaData(str3, str2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r7 = r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6, com.byted.cast.sink.api.ClientInfo r7) {
        /*
            r5 = this;
            com.byted.cast.common.CastLogger r2 = r5.K
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "notifyPreempt: allow="
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " clientInfo="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.String r4 = "ByteLinkSinkImpl"
            r2.i(r4, r0)
            r5.p = r6
            r3 = 1
            if (r6 != 0) goto L28
        L22:
            com.byted.cast.sdk.RTCEngine$ExitReason r0 = com.byted.cast.sdk.RTCEngine.ExitReason.REASON_DISCONNECT
            r5.a(r7, r3, r0, r3)
        L27:
            return
        L28:
            java.util.concurrent.ConcurrentSkipListMap<java.lang.String, com.byted.cast.sink.api.ClientInfo> r0 = r5.r
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            int r1 = r5.z
            if (r1 != r3) goto L5f
            java.util.concurrent.ConcurrentSkipListMap<java.lang.String, com.byted.cast.sink.api.ClientInfo> r0 = r5.r
            java.util.Map$Entry r0 = r0.firstEntry()
            if (r0 == 0) goto L27
            java.lang.Object r2 = r0.getValue()
            com.byted.cast.sink.api.ClientInfo r2 = (com.byted.cast.sink.api.ClientInfo) r2
            java.lang.String r1 = r2.ip
            java.lang.String r0 = r7.ip
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La5
            java.util.concurrent.ConcurrentSkipListMap<java.lang.String, com.byted.cast.sink.api.ClientInfo> r1 = r5.r
            java.lang.String r0 = r2.ip
            java.util.Map$Entry r0 = r1.higherEntry(r0)
            if (r0 == 0) goto La5
        L56:
            java.lang.Object r7 = r0.getValue()
            com.byted.cast.sink.api.ClientInfo r7 = (com.byted.cast.sink.api.ClientInfo) r7
        L5c:
            if (r7 == 0) goto L27
            goto L22
        L5f:
            r0 = 2
            if (r1 != r0) goto L85
            java.util.concurrent.ConcurrentSkipListMap<java.lang.String, com.byted.cast.sink.api.ClientInfo> r0 = r5.r
            java.util.Map$Entry r0 = r0.lastEntry()
            if (r0 == 0) goto L27
            java.lang.Object r2 = r0.getValue()
            com.byted.cast.sink.api.ClientInfo r2 = (com.byted.cast.sink.api.ClientInfo) r2
            java.lang.String r1 = r2.ip
            java.lang.String r0 = r7.ip
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La5
            java.util.concurrent.ConcurrentSkipListMap<java.lang.String, com.byted.cast.sink.api.ClientInfo> r1 = r5.r
            java.lang.String r0 = r2.ip
            java.util.Map$Entry r0 = r1.lowerEntry(r0)
            if (r0 == 0) goto La5
            goto L56
        L85:
            r0 = 3
            if (r1 != r0) goto L27
            java.util.concurrent.ConcurrentSkipListMap<java.lang.String, com.byted.cast.sink.api.ClientInfo> r0 = r5.r
            int r0 = r0.size()
            if (r0 != r3) goto L91
            goto L27
        L91:
            com.byted.cast.common.CastLogger r2 = r5.K
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "notifyPreempt: oneSessionMode toKickClient="
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            r2.i(r4, r0)
            goto L5c
        La5:
            r7 = r2
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sink.a.a.a(boolean, com.byted.cast.sink.api.ClientInfo):void");
    }

    public boolean a(String str, int i) {
        this.g.connect(str, i, "", "");
        return true;
    }

    public IMultipleActiveControl b() {
        return this.N;
    }

    public void b(int i) {
        RTCEngine rTCEngine = this.g;
        if (rTCEngine != null) {
            rTCEngine.setAudioMaxDelayByMs(i);
        }
    }

    public void b(int i, int i2) {
        RTCEngine rTCEngine = this.g;
        if (rTCEngine != null) {
            rTCEngine.setAudioDropPolicyByMs(i, i2);
        }
    }

    public void b(int i, Object... objArr) {
        CastLogger castLogger;
        StringBuilder sb;
        if (i == 2) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                String[] split = ((String) obj).split("\\*");
                if (split.length != 2) {
                    return;
                }
                this.m = CastIntegerProtector.parseInt(split[0]);
                this.f110n = CastIntegerProtector.parseInt(split[1]);
                RTCSetting rTCSetting = this.h;
                if (rTCSetting == null || this.g == null) {
                    return;
                }
                rTCSetting.getScreenProfile().setResolution(this.m, this.f110n);
                this.g.setScreenProfile(this.h.getScreenProfile());
                return;
            }
            return;
        }
        if (i == 25) {
            this.h.setbEnableAudioMixer(false);
            this.h.setbEnableAudioCallback(true);
            this.q = true;
            return;
        }
        if (i == 10026) {
            Object obj2 = objArr[0];
            if (obj2 instanceof Boolean) {
                Object obj3 = objArr[1];
                if (obj3 instanceof IAudioDataListener) {
                    Boolean bool = (Boolean) obj2;
                    IAudioDataListener iAudioDataListener = (IAudioDataListener) obj3;
                    if (this.g != null) {
                        Objects.toString(iAudioDataListener);
                        this.g.setAudioDataListener(bool, iAudioDataListener);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10066) {
            Object obj4 = objArr[0];
            if (obj4 instanceof Integer) {
                this.h.setLatencyMs(((Integer) obj4).intValue());
                return;
            }
            return;
        }
        if (i == 10091) {
            Object obj5 = objArr[0];
            if (!(obj5 instanceof Boolean)) {
                return;
            }
            this.H = ((Boolean) obj5).booleanValue();
            castLogger = this.K;
            sb = new StringBuilder("OPTION_ENABLE_BYTELINK_BROWSE:");
            sb.append(this.H);
        } else {
            if (i == 10021) {
                Objects.toString(objArr[0]);
                Object obj6 = objArr[0];
                if (obj6 instanceof String) {
                    Object obj7 = objArr[1];
                    if (obj7 instanceof Surface) {
                        a((String) obj6, (Surface) obj7);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 10022) {
                Object obj8 = objArr[0];
                if (obj8 instanceof Boolean) {
                    Objects.toString(obj8);
                    a(((Boolean) objArr[0]).booleanValue());
                    return;
                }
                return;
            }
            switch (i) {
                case 10028:
                    Object obj9 = objArr[0];
                    if (obj9 instanceof Boolean) {
                        Object obj10 = objArr[1];
                        if (obj10 instanceof Boolean) {
                            Object obj11 = objArr[2];
                            if (obj11 instanceof ISinkDataListener) {
                                Boolean bool2 = (Boolean) obj9;
                                Boolean bool3 = (Boolean) obj10;
                                ISinkDataListener iSinkDataListener = (ISinkDataListener) obj11;
                                if (this.g != null) {
                                    Objects.toString(iSinkDataListener);
                                    this.g.setSinkDataListener(bool2, bool3, iSinkDataListener);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 10029:
                    Object obj12 = objArr[0];
                    if (obj12 instanceof String) {
                        Object obj13 = objArr[1];
                        if (obj13 instanceof Long) {
                            this.g.decodeInput((String) obj12, ((Long) obj13).longValue());
                            return;
                        }
                        return;
                    }
                    return;
                case 10030:
                    Object obj14 = objArr[0];
                    if (obj14 instanceof String) {
                        Object obj15 = objArr[1];
                        if (obj15 instanceof Long) {
                            this.g.decodeOutput((String) obj14, ((Long) obj15).longValue());
                            return;
                        }
                        return;
                    }
                    return;
                case 10031:
                    Object obj16 = objArr[0];
                    if (obj16 instanceof String) {
                        Object obj17 = objArr[1];
                        if (obj17 instanceof Long) {
                            this.g.render((String) obj16, ((Long) obj17).longValue());
                            return;
                        }
                        return;
                    }
                    return;
                case 10032:
                    Object obj18 = objArr[0];
                    if (obj18 instanceof Boolean) {
                        this.h.setEnableVideoNativeDecode(((Boolean) obj18).booleanValue());
                        int arch = Utils.getArch();
                        float oSVersionF = Utils.getOSVersionF();
                        if (arch != 32 || oSVersionF >= 5.0f) {
                            return;
                        }
                        this.h.setEnableVideoNativeDecode(false);
                        return;
                    }
                    return;
                default:
                    switch (i) {
                        case 10069:
                            Object obj19 = objArr[0];
                            if (obj19 instanceof String) {
                                Object obj20 = objArr[1];
                                if (obj20 instanceof String) {
                                    Object obj21 = objArr[2];
                                    if (obj21 instanceof String) {
                                        Object obj22 = objArr[3];
                                        if (obj22 instanceof String) {
                                            String str = (String) obj19;
                                            this.B = str;
                                            String str2 = (String) obj20;
                                            this.C = str2;
                                            String str3 = (String) obj21;
                                            this.D = str3;
                                            String str4 = (String) obj22;
                                            this.E = str4;
                                            this.g.sinkInitAndJoinRoom(str3, str4, str, str2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        case 10070:
                            k();
                            return;
                        case 10071:
                            Object obj23 = objArr[0];
                            if (obj23 instanceof String) {
                                Object obj24 = objArr[1];
                                if (obj24 instanceof String) {
                                    Object obj25 = objArr[2];
                                    if (obj25 instanceof String) {
                                        Object obj26 = objArr[3];
                                        if (obj26 instanceof String) {
                                            Object obj27 = objArr[4];
                                            if (obj27 instanceof Boolean) {
                                                this.B = (String) obj23;
                                                this.C = (String) obj24;
                                                this.D = (String) obj25;
                                                this.E = (String) obj26;
                                                this.F = ((Boolean) obj27).booleanValue();
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
                        default:
                            switch (i) {
                                case 10075:
                                    Object obj28 = objArr[0];
                                    if (obj28 instanceof Boolean) {
                                        this.h.setDecodedByUser(((Boolean) obj28).booleanValue());
                                        return;
                                    }
                                    return;
                                case 10076:
                                    Object obj29 = objArr[0];
                                    if (obj29 instanceof Boolean) {
                                        this.y = ((Boolean) obj29).booleanValue();
                                        return;
                                    }
                                    return;
                                case 10077:
                                    Object obj30 = objArr[0];
                                    if (obj30 instanceof Integer) {
                                        this.z = ((Integer) obj30).intValue();
                                        castLogger = this.K;
                                        sb = new StringBuilder("OPTION_SET_PREEMPT_POLICY:");
                                        sb.append(this.z);
                                        break;
                                    } else {
                                        return;
                                    }
                                default:
                                    switch (i) {
                                        case 100041:
                                            Object obj31 = objArr[0];
                                            if (obj31 instanceof ILibraryLoader) {
                                                ILibraryLoader iLibraryLoader = (ILibraryLoader) obj31;
                                                this.A = iLibraryLoader;
                                                Objects.toString(iLibraryLoader);
                                                a(iLibraryLoader);
                                                return;
                                            }
                                            return;
                                        case 100042:
                                            Object obj32 = objArr[0];
                                            if (obj32 instanceof ILogger) {
                                                ILogger iLogger = (ILogger) obj32;
                                                Objects.toString(iLogger);
                                                a(iLogger);
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        }
        castLogger.i("ByteLinkSinkImpl", sb.toString());
    }

    public void b(String str) {
        if (this.g != null) {
            this.K.i("ByteLinkSinkImpl", "requestIdrFromSource, sessionId:" + str);
            for (String str2 : this.r.keySet()) {
                ClientInfo clientInfo = this.r.get(str2);
                this.K.i("ByteLinkSinkImpl", "requestIdrFromSource, clientId:" + clientInfo.clientID);
                if (clientInfo.clientID == str) {
                    this.g.requestIdrFromSource(str2);
                }
            }
        }
    }

    public IMultipleLoader c() {
        return this.M;
    }

    public void c(int i) {
        RTCEngine.setLogLevel(this.f109J, i);
    }

    public void c(String str) {
        this.K.i("ByteLinkSinkImpl", "startServer serviceName: " + str + ", gitInfo:1.61ac5e2");
        Context context = this.a;
        if (context == null) {
            this.K.e("ByteLinkSinkImpl", "context is null, you should init with context first!");
            return;
        }
        this.d = str;
        ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getRealSize(this.f);
        this.e = this.q ? 30 : 60;
        h();
        if (this.i != null) {
            ServerInfo serverInfo = new ServerInfo();
            serverInfo.deviceName = str;
            serverInfo.serverPort = this.x;
            this.i.onStart(3, serverInfo);
        }
    }

    public ServerInfo d() {
        this.K.i("ByteLinkSinkImpl", "getServerInfo, mServerPort:" + this.x);
        ServerInfo serverInfo = new ServerInfo();
        serverInfo.deviceName = this.d;
        serverInfo.serverPort = this.x;
        serverInfo.width = this.m;
        serverInfo.height = this.f110n;
        serverInfo.fps = this.e;
        serverInfo.features = 1;
        serverInfo.deviceID = this.L;
        return serverInfo;
    }

    public void d(int i) {
        this.v = i;
    }

    public RTCStatistics e() {
        RTCStatistics statistics = this.g.getStatistics();
        for (RTCStatistics.NetworkStatistics networkStatistics : statistics.nx) {
            ClientInfo clientInfo = this.r.get(networkStatistics.userId);
            if (clientInfo != null) {
                networkStatistics.userId = clientInfo.clientID;
            }
        }
        return statistics;
    }

    public boolean i() {
        this.g.disconnect();
        return true;
    }

    public boolean j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cmd", "invite");
            jSONObject.put("port", this.x);
            this.g.sendMetaData(jSONObject.toString());
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public void l() {
        this.K.i("ByteLinkSinkImpl", "stopServer, gitInfo:1.61ac5e2");
        m();
        if (this.i != null) {
            this.K.w("ByteLinkSinkImpl", "stopServer, onStop, serviceId:3");
            this.i.onStop(3);
        }
    }

    public void a() {
        l();
        g();
        RTCEngine rTCEngine = this.g;
        if (rTCEngine != null) {
            rTCEngine.destroy();
        }
        VoipEngine.deinitialize(this.f109J);
        Handler handler = this.w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.w = null;
        }
        this.a = null;
    }

    /* loaded from: classes29.dex */
    public class d implements IRenderView.IRenderCallback {
        public d() {
        }

        @Override // com.byted.cast.sdk.view.IRenderView.IRenderCallback
        public void onSurfaceDestroyed(IRenderView.ISurfaceHolder iSurfaceHolder) {
            a.this.K.i("ByteLinkSinkImpl", "onSurfaceDestroyed");
        }

        @Override // com.byted.cast.sdk.view.IRenderView.IRenderCallback
        public void onSurfaceTextureCreated(IRenderView iRenderView, Surface surface) {
            CastLogger castLogger;
            String str;
            for (String str2 : a.this.t.keySet()) {
                IRenderView iRenderView2 = a.this.t.get(str2);
                if (iRenderView2 != null && iRenderView == iRenderView2) {
                    if (a.this.h.getAVSyncType() == RTCSetting.AVSYNC_TYPE.SYNC_NORMAL) {
                        castLogger = a.this.K;
                        str = "setSurface: SYNC_NORMAL";
                    } else {
                        castLogger = a.this.K;
                        str = "setSurface: SYNC_LOW_LATENCY";
                    }
                    castLogger.i("ByteLinkSinkImpl", str);
                    a.this.g.setVideoSurface(str2, surface);
                    return;
                }
            }
        }

        @Override // com.byted.cast.sdk.view.IRenderView.IRenderCallback
        public void onSurfaceCreated(IRenderView.ISurfaceHolder iSurfaceHolder, int i, int i2) {
            a.this.K.i("ByteLinkSinkImpl", "onSurfaceCreated");
            for (Map.Entry<String, IRenderView> entry : a.this.t.entrySet()) {
                IRenderView value = entry.getValue();
                String key = entry.getKey();
                if (value != null && iSurfaceHolder.getRenderView() == value) {
                    if (iSurfaceHolder.getSurfaceHolder() != null) {
                        a.this.g.setVideoSurface(key, iSurfaceHolder.getSurfaceHolder().getSurface());
                        return;
                    }
                    return;
                }
            }
        }

        @Override // com.byted.cast.sdk.view.IRenderView.IRenderCallback
        public void onSurfaceChanged(IRenderView.ISurfaceHolder iSurfaceHolder, int i, int i2, int i3) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSurfaceChanged: w=");
            LIZ.append(i2);
            LIZ.append(" h=");
            LIZ.append(i3);
            castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
        }
    }

    /* loaded from: classes29.dex */
    public class e implements NsdListener {
        public e() {
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdDiscoveryFinished() {
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdServiceFound(NsdService nsdService) {
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdServiceLost(NsdService nsdService) {
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdServiceResolved(NsdService nsdService) {
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdRegistered(NsdService nsdService) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNsdRegistered:");
            LIZ.append(nsdService);
            castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdUnRegistered(NsdService nsdService) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNsdUnRegistered:");
            LIZ.append(nsdService);
            castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
            synchronized (a.this.I) {
                a.this.I.notify();
            }
        }

        @Override // com.byted.cast.common.discovery.NsdListener
        public void onNsdError(String str, int i, String str2) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNsdError, errorMessage:");
            LIZ.append(str);
            LIZ.append(", errorCode:");
            LIZ.append(i);
            LIZ.append(", errorSource:");
            LIZ.append(str2);
            castLogger.e("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
            if (a.this.i != null) {
                a.this.i.onError(3, 1001, i, str);
            }
        }
    }

    public void a(boolean z) {
        VoipEngine.setFileLogEnabled(this.f109J, z);
    }

    public void a(ILibraryLoader iLibraryLoader) {
        VoipEngine.setLibraryLoader(iLibraryLoader);
    }

    /* loaded from: classes29.dex */
    public class b implements IMultipleActiveControl {
        public b() {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleActiveControl
        public float getPlayerVolume(String str) {
            return 0.0f;
        }

        @Override // com.byted.cast.sink.api.IActiveControl
        public void pause(String str) {
        }

        @Override // com.byted.cast.sink.api.IActiveControl
        public void start(String str) {
        }

        @Override // com.byted.cast.sink.api.IActiveControl
        public void updateVolume(String str) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleActiveControl
        public void setPlayerVolume(String str, float f) {
            for (Map.Entry<String, CastInfo> entry : a.this.s.entrySet()) {
                if (entry.getValue().clientID.equals(str)) {
                    a.this.g.setPlayerVolume(entry.getKey(), f);
                    return;
                }
            }
        }

        @Override // com.byted.cast.sink.api.IActiveControl
        public void stop(String str, boolean z) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop from user, clientId:");
            LIZ.append(str);
            LIZ.append(", paramBoolean:");
            LIZ.append(z);
            castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
            Iterator<String> it = a.this.r.keySet().iterator();
            ClientInfo clientInfo = null;
            while (true) {
                if (it.hasNext()) {
                    clientInfo = a.this.r.get(it.next());
                    if (clientInfo.clientID == str) {
                        break;
                    }
                } else if (clientInfo == null) {
                    return;
                }
            }
            if (clientInfo.clientID != str) {
                return;
            }
            a.this.a(clientInfo, true, RTCEngine.ExitReason.REASON_DISCONNECT, true);
        }
    }

    /* renamed from: com.byted.cast.sink.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes29.dex */
    public class C0009a implements IMultipleLoader {
        public C0009a() {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleLoader
        public void loadAudio(String str, Context context, FrameLayout frameLayout) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleLoader
        public void loadPhoto(String str, Context context, FrameLayout frameLayout) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleLoader
        public void loadVideo(String str, Context context, FrameLayout frameLayout) {
        }

        @Override // com.byted.cast.sink.api.multiple.IMultipleLoader
        public void loadMirror(String str, Context context, FrameLayout frameLayout) {
            CastLogger castLogger = a.this.K;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadMirror ");
            LIZ.append(str);
            LIZ.append(", gitInfo:");
            LIZ.append("1.61ac5e2");
            castLogger.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ));
            for (String str2 : a.this.s.keySet()) {
                CastInfo castInfo = a.this.s.get(str2);
                CastLogger castLogger2 = a.this.K;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mUserCastMap ");
                LIZ2.append(castInfo.clientID);
                castLogger2.i("ByteLinkSinkImpl", X1D.LIZIZ(LIZ2));
                if (castInfo.clientID == str) {
                    a.this.u.put(str, frameLayout);
                    a.this.a(context, str2, frameLayout);
                }
            }
        }
    }
}
