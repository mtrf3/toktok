package com.ss.chromecast.source.impl;

import X.C16880lQ;
import X.C90120ZYm;
import X.C90468Zey;
import X.C90500ZfU;
import X.C90506Zfa;
import X.C90639Zhj;
import X.C90778Zjy;
import X.C90779Zjz;
import X.C90780Zk0;
import X.C90832Zkq;
import X.C90919ZmF;
import X.C90920ZmG;
import X.C90923ZmJ;
import X.InterfaceC90501ZfV;
import X.InterfaceC90502ZfW;
import X.InterfaceC90503ZfX;
import X.QH7;
import X.RunnableC90507Zfb;
import X.X1D;
import X.ZZT;
import Y.IDRunnableS1S0201000_24;
import Y.IDRunnableS30S0200000_24;
import Y.IDRunnableS5S1100000_24;
import Y.IDRunnableS86S0100000_24;
import android.app.UiModeManager;
import android.content.Context;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.MainThreadExecutor;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.api.IGetDeviceInfoListener;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
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
import com.byted.cast.common.source.IPlayerListener;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class ChromeCastSourceWrapper implements ICastSource {
    public final C90500ZfU LIZ;
    public String LJ;
    public final CastLogger LJII;
    public final CastMonitor LJIIIIZZ;
    public final MainThreadExecutor LIZIZ = new MainThreadExecutor();
    public boolean LIZJ = true;
    public PlayerInfo LIZLLL = null;
    public String LJFF = "";
    public boolean LJI = false;

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void addOutputSurface(Surface surface) {
        ZZT.LIZIZ(this, surface);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void changeCameraID(int i) {
        ZZT.LIZLLL(this, i);
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
    public final /* synthetic */ boolean detect(ServiceInfo serviceInfo, int i, int i2) {
        return ZZT.LJIIJ(this, serviceInfo, i, i2);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void disableQueryPlayState() {
        ZZT.LJIIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void enableAudio(boolean z) {
        ZZT.LJIILIIL(this, z);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void enableFlash(boolean z) {
        ZZT.LJIILJJIL(this, z);
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
    public final /* synthetic */ DeviceInfo getSinkDeviceInfo(String str, int i) {
        return ZZT.LJJIII(this, str, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ List getSsdpServiceInfoList() {
        return ZZT.LJJIIJZLJL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ Statistics getStatistics() {
        return ZZT.LJJIIZ(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final String getVersion() {
        return "3.10.2.7.overseas-tt";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void onDiskCacheFoundService(ServiceInfo serviceInfo) {
        ZZT.LJJIJ(this, serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void onNetworkChangeReady() {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void onSsdpDeviceOffline(ServiceInfo serviceInfo) {
        ZZT.LJJIJIIJIL(this, serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ boolean ping(String str, int i) {
        return ZZT.LJJIJL(this, str, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void register(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        ZZT.LJJJIL(this, serviceInfo, iRegisterResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void removeOutputSurface(Surface surface) {
        ZZT.LJJJJ(this, surface);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void send(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
        ZZT.LJJJJJ(this, serviceInfo, str, iSendResultListener);
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
    public final /* synthetic */ void setAudioMixScale(int i) {
        ZZT.LJJJJLI(this, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setAuthorizationResult(int i) {
        ZZT.LJJJJLL(this, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setInputSurfaceCallback(ISurfaceListener iSurfaceListener) {
        ZZT.LJJJJZI(this, iSurfaceListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        ZZT.LJJJLIIL(this, iLibraryLoader);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setLogger(ILogger iLogger) {
        ZZT.LJJJLL(this, iLogger);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMediaInfoListener(IMediaInfoListener iMediaInfoListener) {
        ZZT.LJJJLZIJ(this, iMediaInfoListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMediaProjection(MediaProjection mediaProjection) {
        ZZT.LJJJZ(this, mediaProjection);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMessageListener(IMessageListener iMessageListener) {
        ZZT.LJJL(this, iMessageListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMirrorInfo(MirrorInfo mirrorInfo) {
        ZZT.LJJLI(this, mirrorInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setMirrorListener(IMirrorListener iMirrorListener) {
        ZZT.LJJLIIIIJ(this, iMirrorListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setOption(int i, Object... objArr) {
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPlayerListener(IPlayerListener iPlayerListener) {
        ZZT.LJJLIIIJJI(this, iPlayerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void setPrivateChannel(String str) {
        ZZT.LJJLIIIJJIZ(this, str);
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
    public final /* synthetic */ void setSurfaceFillType(int i) {
        ZZT.LJJLJLI(this, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void startMirror(MirrorInfo mirrorInfo) {
        ZZT.LJJZ(this, mirrorInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void startRecorder() {
        ZZT.LJJZZI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void startSsdpBrowse() {
        ZZT.LJL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void stopBrowse() {
        this.LIZJ = true;
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "stopBrowse ");
        c90506Zfa.LIZJ = false;
        ((ConcurrentHashMap) c90506Zfa.LJ).clear();
        this.LJI = false;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void stopMirror() {
        ZZT.LJLIIIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void stopRecorder() {
        ZZT.LJLIIL(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void stopSsdpBrowse() {
        ZZT.LJLILLLLZI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void unregister(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        ZZT.LJLJJI(this, serviceInfo, iRegisterResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void addVolume() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "addVolume");
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 37));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void clearDramaList() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.getClass();
        try {
            C90639Zhj LJ = c90506Zfa.LJ(null);
            if (LJ != null) {
                C90120ZYm LJFF = LJ.LJFF();
                LJFF.getClass();
                QH7.LJ("Must be called from the main thread.");
                int[] LJI = C90468Zey.LJI(LJFF.LIZLLL);
                JSONObject jSONObject = new JSONObject();
                QH7.LJ("Must be called from the main thread.");
                if (!LJ.LJJIII()) {
                    C90639Zhj.LJIJJLI();
                } else {
                    C90639Zhj.LJJIIJ(new C90920ZmG(LJ, LJI, jSONObject));
                }
                c90506Zfa.LJJII = null;
                InterfaceC90503ZfX interfaceC90503ZfX = c90506Zfa.LJI;
                if (interfaceC90503ZfX != null) {
                    ((C90780Zk0) interfaceC90503ZfX).LIZIZ(c90506Zfa.LJJIII, null);
                }
            }
        } catch (Exception e) {
            CastLogger castLogger = c90506Zfa.LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exception: ");
            LIZ.append(e.getMessage());
            castLogger.e("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void destroy() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.i("ChromeCastSourceImpl", "destroy");
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            c90506Zfa.LIZJ();
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 33));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final ServiceInfo getServiceInfo() {
        this.LIZ.LIZ.getClass();
        return null;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void pause() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "pause");
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 35));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void playNextDrama() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.getClass();
        try {
            C90639Zhj LJ = c90506Zfa.LJ(null);
            if (LJ != null) {
                LJ.LJIILLIIL();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            c90506Zfa.LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void playPreDrama() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.getClass();
        try {
            C90639Zhj LJ = c90506Zfa.LJ(null);
            if (LJ != null) {
                LJ.LJIIZILJ();
            }
        } catch (Exception e) {
            CastLogger castLogger = c90506Zfa.LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exception: ");
            LIZ.append(e.getMessage());
            castLogger.e("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void resume() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "resume");
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 34));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void startBrowse() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "startBrowse ");
        c90506Zfa.LIZJ = true;
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
            InterfaceC90501ZfV interfaceC90501ZfV = c90506Zfa.LIZ;
            if (interfaceC90501ZfV != null) {
                ArrayList arrayList = new ArrayList(((ConcurrentHashMap) C90506Zfa.LJJIJIIJI).values());
                C90778Zjy c90778Zjy = (C90778Zjy) interfaceC90501ZfV;
                if (c90778Zjy.LIZ != null) {
                    c90778Zjy.LIZIZ.LIZIZ.execute(new IDRunnableS1S0201000_24(c90778Zjy, arrayList, 6, 1));
                }
            }
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 28));
            c90506Zfa.LJI();
        }
        if (!this.LJI) {
            this.LJI = true;
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void stop() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "stop");
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 36));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void stopServer() {
        this.LIZ.LIZ.getClass();
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void subVolume() {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "subVolume");
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 30));
        }
    }

    public ChromeCastSourceWrapper(ContextManager.CastContext castContext) {
        this.LIZ = new C90500ZfU(castContext);
        this.LJII = ContextManager.getLogger(castContext);
        this.LJIIIIZZ = ContextManager.getMonitor(castContext);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void connect(ServiceInfo serviceInfo) {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        CastLogger castLogger = c90506Zfa.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect(), serviceInfo:");
        LIZ.append(serviceInfo);
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        if (serviceInfo == null) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "serviceInfo is null.");
            InterfaceC90502ZfW interfaceC90502ZfW = c90506Zfa.LIZIZ;
            if (interfaceC90502ZfW != null) {
                ((C90779Zjz) interfaceC90502ZfW).LIZ(null, 201, 26200005);
                return;
            }
            return;
        }
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
            InterfaceC90502ZfW interfaceC90502ZfW2 = c90506Zfa.LIZIZ;
            if (interfaceC90502ZfW2 == null) {
                return;
            }
            ((C90779Zjz) interfaceC90502ZfW2).LIZ(null, 201, 26200007);
            return;
        }
        if (c90506Zfa.LJIIIIZZ != null) {
            c90506Zfa.LJIJJLI.i("ChromeCastSourceImpl", "already connected.");
            InterfaceC90502ZfW interfaceC90502ZfW3 = c90506Zfa.LIZIZ;
            if (interfaceC90502ZfW3 == null) {
                return;
            }
            ((C90779Zjz) interfaceC90502ZfW3).LIZ(null, 201, 26200008);
            return;
        }
        c90506Zfa.LJJIII = serviceInfo;
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS30S0200000_24(c90506Zfa, serviceInfo, 5));
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final boolean disConnect(ServiceInfo serviceInfo) {
        this.LIZ.LIZ.LIZJ();
        return true;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void play(PlayerInfo playerInfo) {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        CastLogger castLogger = c90506Zfa.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play playerInfo:");
        LIZ.append(playerInfo);
        castLogger.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS30S0200000_24(c90506Zfa, playerInfo, 7));
        }
        this.LIZLLL = playerInfo;
        if (playerInfo != null) {
            this.LJ = playerInfo.getUrl();
        }
        this.LJFF = "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void playDramaId(String str) {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.getClass();
        try {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS5S1100000_24(c90506Zfa, str, 1));
        } catch (Exception e) {
            c90506Zfa.LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setBrowseResultListener(IBrowseListener iBrowseListener) {
        this.LIZ.LIZ.LIZ = new C90778Zjy(this, iBrowseListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setConnectListener(IConnectListener iConnectListener) {
        this.LIZ.LIZ.LIZIZ = new C90779Zjz(this, iConnectListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setPlayerListener(com.byted.cast.common.api.IPlayerListener iPlayerListener) {
        this.LIZ.LIZ.LJI = new C90780Zk0(this, iPlayerListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setVolume(int i) {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        CastLogger castLogger = c90506Zfa.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVolume volume:");
        LIZ.append(i);
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90506Zfa, 31));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void startServer(String str) {
        this.LIZ.LIZ.getClass();
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void getSinkDeviceInfo(ServiceInfo serviceInfo, ISinkDeviceInfoListener iSinkDeviceInfoListener) {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.i("ChromeCastSourceImpl", "getSinkDeviceInfo");
        c90506Zfa.LJJIIZ = iSinkDeviceInfoListener;
        if (serviceInfo != null) {
            if (c90506Zfa.LJIIIIZZ == null) {
                c90506Zfa.LJIJJLI.i("ChromeCastSourceImpl", "getSinkDeviceInfo mCastSession is null");
                iSinkDeviceInfoListener.onFail(1702000004, "ChromeCast is not connected yet");
            } else {
                c90506Zfa.LJIIIIZZ(true);
            }
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void seekTo(long j, int i) {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        CastLogger castLogger = c90506Zfa.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seekTo progress:");
        LIZ.append(j);
        LIZ.append(", tag:");
        LIZ.append(i);
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new RunnableC90507Zfb(c90506Zfa, j));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setRepeatMode(int i, IResultListener iResultListener) {
        Object obj;
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.getClass();
        try {
            C90639Zhj LJ = c90506Zfa.LJ(iResultListener);
            if (LJ != null) {
                CastLogger castLogger = c90506Zfa.LJIJJLI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("set repeat mode: ");
                LIZ.append(i);
                castLogger.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
                JSONObject jSONObject = new JSONObject();
                QH7.LJ("Must be called from the main thread.");
                if (!LJ.LJJIII()) {
                    obj = C90639Zhj.LJIJJLI();
                } else {
                    C90923ZmJ c90923ZmJ = new C90923ZmJ(LJ, i, jSONObject);
                    C90639Zhj.LJJIIJ(c90923ZmJ);
                    obj = c90923ZmJ;
                }
                String str = "setRepeatMode";
                C90923ZmJ c90923ZmJ2 = (BasePendingResult) obj;
                if (iResultListener != null) {
                    c90923ZmJ2.LIZIZ(new C90832Zkq(c90506Zfa, str, iResultListener));
                }
            }
        } catch (Exception e) {
            CastLogger castLogger2 = c90506Zfa.LJIJJLI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("exception: ");
            LIZ2.append(e.getMessage());
            castLogger2.e("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void addDramaList(DramaBean[] dramaBeanArr, String str, IResultListener iResultListener) {
        Object obj;
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.i("ChromeCastSourceImpl", "addDramaListBase");
        try {
            C90639Zhj LJ = c90506Zfa.LJ(iResultListener);
            if (LJ != null) {
                int LIZLLL = c90506Zfa.LIZLLL(str);
                int LIZ = LJ.LJFF().LIZ(LIZLLL);
                if (LIZLLL == -1) {
                    LIZLLL = c90506Zfa.LJJIFFI.length;
                    LIZ = 0;
                }
                CastLogger castLogger = c90506Zfa.LJIJJLI;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("addDramaList, insertBeforeDramaId: ");
                LIZ2.append(str);
                LIZ2.append(", index: ");
                LIZ2.append(LIZLLL);
                LIZ2.append(", itemId: ");
                LIZ2.append(LIZ);
                castLogger.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
                MediaQueueItem[] LIZIZ = c90506Zfa.LIZIZ(dramaBeanArr, c90506Zfa.LJJI, LIZLLL + 1);
                JSONObject jSONObject = new JSONObject();
                QH7.LJ("Must be called from the main thread.");
                if (!LJ.LJJIII()) {
                    obj = C90639Zhj.LJIJJLI();
                } else {
                    C90919ZmF c90919ZmF = new C90919ZmF(LJ, LIZIZ, LIZ, jSONObject);
                    C90639Zhj.LJJIIJ(c90919ZmF);
                    obj = c90919ZmF;
                }
                InterfaceC90503ZfX interfaceC90503ZfX = c90506Zfa.LJI;
                if (interfaceC90503ZfX != null) {
                    ((C90780Zk0) interfaceC90503ZfX).LIZIZ(c90506Zfa.LJJIII, c90506Zfa.LJJII);
                }
                String str2 = "addDramaList";
                C90919ZmF c90919ZmF2 = (BasePendingResult) obj;
                if (iResultListener != null) {
                    c90919ZmF2.LIZIZ(new C90832Zkq(c90506Zfa, str2, iResultListener));
                }
            }
        } catch (Exception e) {
            CastLogger castLogger2 = c90506Zfa.LJIJJLI;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("exception: ");
            LIZ3.append(e.getMessage());
            castLogger2.e("ChromeCastSourceImpl", X1D.LIZIZ(LIZ3));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void init(Context context, Config config, IInitListener iInitListener) {
        C90506Zfa c90506Zfa = this.LIZ.LIZ;
        c90506Zfa.LJIJJLI.i("ChromeCastSourceImpl", "init");
        c90506Zfa.LJFF = context;
        boolean z = false;
        try {
            if (((UiModeManager) C16880lQ.LLILL(context, "uimode")).getCurrentModeType() != 4) {
                if (C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), c90506Zfa.LJFF) == 0) {
                    z = true;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        c90506Zfa.LJIIZILJ = z;
        if (!c90506Zfa.LJIIZILJ) {
            c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "unsupported chromecast device.");
        } else {
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS30S0200000_24(c90506Zfa, context, 6));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void play(ServiceInfo serviceInfo, Uri uri, int i) {
        throw new UnsupportedOperationException();
    }
}
