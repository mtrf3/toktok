package X;

import Y.IDRunnableS86S0100000_24;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.projection.MediaProjection;
import android.text.TextUtils;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Constants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.DeviceInfoManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.LogDumper;
import com.byted.cast.common.MainThreadExecutor;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.NetworkMonitor;
import com.byted.cast.common.SourceMonitorUtils;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.Utils;
import com.byted.cast.common.api.IAppCommonDataListener;
import com.byted.cast.common.api.IBindSdkInfoListener;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.api.IGetDeviceInfoListener;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.api.IPlayerListener;
import com.byted.cast.common.api.IRegisterResultListener;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.ISendResultListener;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.IWriteCacheListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.auth.license.AuthWrapper;
import com.byted.cast.common.bean.BytecastBrowseType;
import com.byted.cast.common.bean.DanmakuSetting;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.bean.DeviceOfflineDetectSettings;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.bean.Resolution;
import com.byted.cast.common.bean.SourceDeviceInfo;
import com.byted.cast.common.bean.Speed;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.ConfigManager;
import com.byted.cast.common.config.ConfigParam;
import com.byted.cast.common.config.ConfigUtils;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.config.IMediaInfoListener;
import com.byted.cast.common.network.NetworkBehavior;
import com.byted.cast.common.network.NetworkBehaviorData;
import com.byted.cast.common.network.NetworkChangeReceiver2;
import com.byted.cast.common.pin.QRPinNetWork;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.IServerListener;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.byted.cast.common.threadpool.CastThreadFactory;
import com.byted.cast.common.threadpool.CastThreadPoolExecutor;
import com.byted.cast.wifidirect.IWiFiP2PListener;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZkL, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90801ZkL implements ICastSource {
    public static boolean LJJLI;
    public final ConfigManager LIZ;
    public final CastLogger LIZIZ;
    public final CastMonitor LIZJ;
    public final TeaEventTrack LIZLLL;
    public final ICastSource LJ;
    public final ICastSource LJFF;
    public final ICastSource LJI;
    public final ICastSource LJII;
    public final ICastSource LJIIIIZZ;
    public final ICastSource LJIIIZ;
    public final ICastSource LJIIJ;
    public final ICastSource LJIIJJI;
    public final ICastSource LJIIL;
    public final C90495ZfP LJIILIIL;
    public final C90499ZfT LJIILJJIL;
    public C90445Zeb LJIJI;
    public AuthWrapper LJIJJLI;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public final DeviceInfoManager LJJIIZ;
    public ConcurrentSubject<C90429ZeL> LJJIIZI;
    public ConcurrentSubject<C90429ZeL> LJJIJ;
    public C90794ZkE LJJIJIIJI;
    public IConnectListener LJJIJLIJ;
    public final NetworkBehavior LJJJJ;
    public NetworkBehaviorData LJJJJI;
    public IServerListener LJJJJIZL;
    public ScheduledExecutorService LJJJJJ;
    public IWiFiP2PListener LJJJJLL;
    public final C90435ZeR LJJJJZ;
    public final ContextManager.CastContext LJJJJZI;
    public final C90436ZeS LJJJLIIL;
    public final C90442ZeY LJJJLL;
    public IBrowseListener LJJJLZIJ;
    public ISinkDeviceInfoListener LJJL;
    public final java.util.Map<String, ICastSource> LJIILL = Collections.synchronizedMap(new LinkedHashMap());
    public final java.util.Map<String, ICastSource> LJIILLIIL = Collections.synchronizedMap(new LinkedHashMap());
    public List<String> LJIIZILJ = new ArrayList();
    public List<String> LJIJ = new ArrayList();
    public final MainThreadExecutor LJIJJ = new MainThreadExecutor();
    public final java.util.Set<String> LJIL = new ConcurrentSkipListSet();
    public final List<String> LJJIII = new ArrayList();
    public boolean LJJIIJ = false;
    public boolean LJJIIJZLJL = false;
    public EnumC90460Zeq LJJIJIIJIL = EnumC90460Zeq.STATE_DISCONNECTED;
    public final java.util.Map<String, C90430ZeM> LJJIJIL = new HashMap();
    public final java.util.Map<String, C90429ZeL> LJJIJL = new HashMap();
    public volatile boolean LJJIL = false;
    public final List<IBindSdkInfoListener> LJJIZ = new CopyOnWriteArrayList();
    public final ServiceInfo LJJJ = new ServiceInfo();
    public boolean LJJJI = true;
    public boolean LJJJIL = true;
    public final String LJJJJJL = CardStruct.IStatusCode.DEFAULT;
    public boolean LJJJJL = false;
    public String LJJJJLI = "";
    public ServiceInfo LJJJZ = null;

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void addDramaList(DramaBean[] dramaBeanArr, String str, IResultListener iResultListener) {
        ZZT.LIZ(this, dramaBeanArr, str, iResultListener);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void addOutputSurface(Surface surface) {
        ZZT.LIZIZ(this, surface);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void addVolume() {
        ZZT.LIZJ(this);
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
    public final /* synthetic */ void destroy() {
        ZZT.LJIIIZ(this);
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
    public final /* synthetic */ String getHttpPlayUrl() {
        return ZZT.LJIJI(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final ServiceInfo getServiceInfo() {
        return null;
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
    public final /* synthetic */ Statistics getStatistics() {
        return ZZT.LJJIIZ(this);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void init(Context context, Config config, IInitListener iInitListener) {
        ZZT.LJJIIZI(this, context, config, iInitListener);
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
    public final /* synthetic */ void play(ServiceInfo serviceInfo, android.net.Uri uri, int i) {
        ZZT.LJJIL(this, serviceInfo, uri, i);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final /* synthetic */ void removeOutputSurface(Surface surface) {
        ZZT.LJJJJ(this, surface);
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
    public final /* synthetic */ void sendData(int i, byte[] bArr, long j, long j2, long j3, long j4) {
        ZZT.LJJJJJL(this, i, bArr, j, j2, j3, j4);
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
    public final /* synthetic */ void setMediaProjection(MediaProjection mediaProjection) {
        ZZT.LJJJZ(this, mediaProjection);
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
    public final /* synthetic */ void setVolume(int i) {
        ZZT.LJJLL(this, i);
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
    public final /* synthetic */ void stop() {
        ZZT.LJLI(this);
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
    public final /* synthetic */ void subVolume() {
        ZZT.LJLJI(this);
    }

    public final void LIZ() {
        ICastSource iCastSource;
        this.LIZJ.sendByteCastSourceEvent("bytecast_unbind_sdk", "", null, "");
        this.LIZIZ.d("ByteCastSourceImpl", "destroy");
        stopBrowse();
        if (this.LJJJLZIJ != null) {
            this.LJIJJ.execute(new IDRunnableS86S0100000_24(this, 16));
        }
        ICastSource iCastSource2 = this.LJI;
        if (iCastSource2 != null) {
            iCastSource2.destroy();
        }
        ICastSource iCastSource3 = this.LJ;
        if (iCastSource3 != null) {
            iCastSource3.destroy();
        }
        ICastSource iCastSource4 = this.LJII;
        if (iCastSource4 != null) {
            iCastSource4.destroy();
        }
        ICastSource iCastSource5 = this.LJIIIIZZ;
        if (iCastSource5 != null) {
            iCastSource5.destroy();
        }
        ICastSource iCastSource6 = this.LJIIIZ;
        if (iCastSource6 != null) {
            iCastSource6.destroy();
        }
        ICastSource iCastSource7 = this.LJFF;
        if (iCastSource7 != null) {
            iCastSource7.destroy();
        }
        ICastSource iCastSource8 = this.LJIIJJI;
        if (iCastSource8 != null) {
            iCastSource8.destroy();
        }
        ICastSource iCastSource9 = this.LJIIL;
        if (iCastSource9 != null) {
            iCastSource9.destroy();
        }
        NetworkBehavior networkBehavior = this.LJJJJ;
        if (networkBehavior != null) {
            networkBehavior.unRegisterNetworkChangeReceiver();
        }
        AuthWrapper authWrapper = this.LJIJJLI;
        if (authWrapper != null) {
            authWrapper.destroy();
        }
        this.LIZ.destroy();
        ConcurrentSubject<C90429ZeL> concurrentSubject = this.LJJIJ;
        if (concurrentSubject != null) {
            concurrentSubject.destroy();
            this.LJJIJ = null;
        }
        ConcurrentSubject<C90429ZeL> concurrentSubject2 = this.LJJIIZI;
        if (concurrentSubject2 != null) {
            concurrentSubject2.destroy();
            this.LJJIIZI = null;
        }
        C90495ZfP c90495ZfP = this.LJIILIIL;
        if (c90495ZfP != null) {
            C90777Zjx c90777Zjx = c90495ZfP.LIZIZ;
            if (c90777Zjx != null) {
                c90777Zjx.LIZJ.i("NsdClient", "destroy");
                if (!c90777Zjx.LJIJJ) {
                    c90777Zjx.LIZJ.w("NsdClient", "destroy, not inited!");
                } else {
                    synchronized (c90777Zjx.LJJI) {
                        ExecutorService executorService = c90777Zjx.LJJIFFI;
                        if (executorService != null) {
                            ((ThreadPoolExecutor) executorService).shutdownNow();
                            c90777Zjx.LJJIFFI = null;
                        }
                    }
                    NetworkChangeReceiver2 networkChangeReceiver2 = c90777Zjx.LJIJI;
                    if (networkChangeReceiver2 != null) {
                        try {
                            networkChangeReceiver2.unregister();
                            c90777Zjx.LJIJI = null;
                        } catch (Exception e) {
                            CastLogger castLogger = c90777Zjx.LIZJ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("init, NetworkChangeReceiver2 exception:");
                            LIZ.append(e.getMessage());
                            castLogger.e("NsdClient", X1D.LIZIZ(LIZ));
                        }
                    }
                    c90777Zjx.LJIJJ = false;
                }
            }
            c90495ZfP.LIZLLL.getClass();
            if (c90495ZfP.LJ.LJI) {
                C90414Ze6 c90414Ze6 = c90495ZfP.LJ;
                c90414Ze6.LIZLLL.i("BDLinkServiceDetector", "stopDetect");
                if (!c90414Ze6.LJI) {
                    c90414Ze6.LIZLLL.w("BDLinkServiceDetector", "has stopped");
                } else {
                    c90414Ze6.LJI = false;
                    c90414Ze6.LIZIZ.removeCallbacksAndMessages(null);
                }
            }
        }
        C90499ZfT c90499ZfT = this.LJIILJJIL;
        if (c90499ZfT != null) {
            c90499ZfT.LIZ();
        }
        if ((this.LJJI || this.LJJII) && (iCastSource = this.LJIIJ) != null) {
            iCastSource.stopServer();
        }
        ScheduledExecutorService scheduledExecutorService = this.LJJJJJ;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.LJJJJJ = null;
        }
        LogDumper.destroy();
        ContextManager.clear(this.LJJJJZI);
        this.LJJIIZ.resetSinkDeviceInfo();
        this.LJJIJIIJIL = EnumC90460Zeq.STATE_DISCONNECTED;
    }

    public final void LIZJ() {
        ICastSource iCastSource;
        ICastSource iCastSource2;
        ICastSource iCastSource3;
        ICastSource iCastSource4;
        ICastSource iCastSource5;
        ICastSource iCastSource6;
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleModulePriorityImpl thread is ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        List<String> list = this.LJIIZILJ;
        if (list != null && ((ArrayList) list).size() > 0) {
            Iterator it = ((ArrayList) this.LJIIZILJ).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2023507661:
                            if (str.equals("LeLink") && (iCastSource6 = this.LJFF) != null) {
                                this.LJIILL.put("LeLink", iCastSource6);
                                break;
                            }
                            break;
                        case 457686803:
                            if (str.equals("BDCloud") && (iCastSource5 = this.LJIIL) != null) {
                                this.LJIILL.put("BDCloud", iCastSource5);
                                break;
                            }
                            break;
                        case 483315961:
                            if (str.equals("ChromeCast") && (iCastSource4 = this.LJIIJJI) != null) {
                                this.LJIILL.put("ChromeCast", iCastSource4);
                                break;
                            }
                            break;
                        case 1954424701:
                            if (str.equals("BDDLNA") && (iCastSource3 = this.LJ) != null) {
                                this.LJIILL.put("BDDLNA", iCastSource3);
                                break;
                            }
                            break;
                        case 1954691932:
                            if (str.equals("BDLink") && (iCastSource2 = this.LJI) != null) {
                                this.LJIILL.put("BDLink", iCastSource2);
                                break;
                            }
                            break;
                    }
                }
            }
            this.LIZJ.setProtocols(this.LJIIZILJ.toString());
        }
        CastLogger castLogger2 = this.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("linkCastSourceMap:");
        LIZ2.append(this.LJIILL.keySet());
        castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
        List<String> list2 = this.LJIJ;
        if (list2 != null && ((ArrayList) list2).size() > 0) {
            Iterator it2 = ((ArrayList) this.LJIJ).iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (str2 != null && str2.equals("ByteLink") && (iCastSource = this.LJII) != null) {
                    this.LJIILLIIL.put("ByteLink", iCastSource);
                }
            }
        }
        CastLogger castLogger3 = this.LIZIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("mirrorCastSourceMap:");
        LIZ3.append(this.LJIILLIIL.keySet());
        castLogger3.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ3));
        this.LJIJI = new C90445Zeb(this.LJJJJZI, this.LJIIZILJ, this.LJIJ);
        this.LJJJJZ.getClass();
        this.LJJJLL.LJFF = this.LJIJI;
        this.LJIILIIL.LIZ(10011, this.LJIIZILJ, this.LJIJ);
    }

    public final void LJ() {
        java.util.Set<String> set = this.LJIL;
        if (set == null) {
            return;
        }
        set.clear();
        this.LJIL.add("LeLink");
        this.LJIL.add("BDDLNA");
        this.LJIL.add("BDLink");
        this.LJIL.add("ChromeCast");
        this.LJIL.add("BDCloud");
        this.LJIL.add("ByteLink");
        this.LJIL.add("WIFIP2P");
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void clearDramaList() {
        ICastSource iCastSource;
        C90442ZeY c90442ZeY = this.LJJJLL;
        c90442ZeY.LJIIL.i("PlayerController", "start clearDramaList");
        if (c90442ZeY.LJ() || c90442ZeY.LJIIJJI == null) {
            return;
        }
        synchronized (c90442ZeY.LJI) {
            Iterator<String> it = c90442ZeY.LJI.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (TextUtils.equals(c90442ZeY.LJIIJJI.LIZJ, next) && (iCastSource = c90442ZeY.LJI.get(next)) != null) {
                    CastLogger castLogger = c90442ZeY.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("clearDramaList use ");
                    LIZ.append(next);
                    castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.clearDramaList();
                    CastMonitor castMonitor = c90442ZeY.LJIILIIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(next);
                    LIZ2.append(" clear Drama list");
                    castMonitor.sendSourceEvent("bytecast_drama_clear", X1D.LIZIZ(LIZ2), c90442ZeY.LIZLLL());
                    c90442ZeY.LJIILIIL.getSourceMonitor().trackByteCastStartDramaProtocol(next, "clear", "");
                    c90442ZeY.LJIILJJIL.getSourceMonitorUtils().trackByteCastStartDramaProtocol(next, "clear", "");
                    break;
                }
            }
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final String getFlvUrl() {
        ICastSource iCastSource = this.LJIIIIZZ;
        if (iCastSource != null) {
            return iCastSource.getFlvUrl();
        }
        return "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final String getHttpUrl() {
        ICastSource iCastSource = this.LJIIIIZZ;
        if (iCastSource != null) {
            return iCastSource.getHttpUrl();
        }
        return "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final String getRtmpUrl() {
        ICastSource iCastSource = this.LJIIIIZZ;
        if (iCastSource != null) {
            return iCastSource.getRtmpUrl();
        }
        return "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final String getVersion() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.ss.cast:source-link", "3.10.2.7.overseas-tt");
            jSONObject.put("com.ss.cast:source-bdlink", "3.10.2.7.overseas-tt");
            jSONObject.put("com.ss.cast:source-bddlna", "3.10.2.7.overseas-tt");
            ICastSource iCastSource = this.LJII;
            if (iCastSource != null) {
                jSONObject.put("com.ss.cast:source-mirror", iCastSource.getVersion());
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            ICastSource iCastSource2 = this.LJFF;
            if (iCastSource2 != null) {
                jSONObject.put("com.ss.cast:source-lelink", iCastSource2.getVersion());
            }
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        try {
            ICastSource iCastSource3 = this.LJIIJJI;
            if (iCastSource3 != null) {
                jSONObject.put("com.ss.cast:source-chromecast", iCastSource3.getVersion());
            }
        } catch (JSONException e3) {
            C16880lQ.LLLLIIL(e3);
        }
        try {
            if (this.LJFF != null) {
                jSONObject.put("com.ss.cast:source-lelink-wrapper", "3.10.2.7.overseas-tt");
            }
        } catch (JSONException e4) {
            C16880lQ.LLLLIIL(e4);
        }
        try {
            ICastSource iCastSource4 = this.LJIIIIZZ;
            if (iCastSource4 != null) {
                jSONObject.put("com.ss.cast:vast_cast", iCastSource4.getVersion());
            }
        } catch (JSONException e5) {
            C16880lQ.LLLLIIL(e5);
        }
        try {
            ICastSource iCastSource5 = this.LJIIIZ;
            if (iCastSource5 != null) {
                jSONObject.put("com.ss.cast:UsbCastSource", iCastSource5.getVersion());
            }
        } catch (JSONException e6) {
            C16880lQ.LLLLIIL(e6);
        }
        try {
            ICastSource iCastSource6 = this.LJIIL;
            if (iCastSource6 != null) {
                jSONObject.put("com.ss.cast:source-bdcloud", iCastSource6.getVersion());
            }
        } catch (JSONException e7) {
            C16880lQ.LLLLIIL(e7);
        }
        this.LIZIZ.i("ByteCastSourceImpl", "protocols version:" + jSONObject.toString());
        this.LIZJ.sendSourceEvent("ByteCast_Source_Get_Protocols_Version", jSONObject.toString());
        return jSONObject.toString();
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void playNextDrama() {
        ICastSource iCastSource;
        C90442ZeY c90442ZeY = this.LJJJLL;
        c90442ZeY.LJIIL.i("PlayerController", "start playNextDrama");
        if (c90442ZeY.LJ() || c90442ZeY.LJIIJJI == null) {
            return;
        }
        synchronized (c90442ZeY.LJI) {
            Iterator<String> it = c90442ZeY.LJI.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (TextUtils.equals(c90442ZeY.LJIIJJI.LIZJ, next) && (iCastSource = c90442ZeY.LJI.get(next)) != null) {
                    CastLogger castLogger = c90442ZeY.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("playNextDrama use ");
                    LIZ.append(next);
                    castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.playNextDrama();
                    CastMonitor castMonitor = c90442ZeY.LJIILIIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(next);
                    LIZ2.append(" play Drama next");
                    castMonitor.sendSourceEvent("bytecast_drama_next", X1D.LIZIZ(LIZ2), c90442ZeY.LIZLLL());
                    c90442ZeY.LJIILIIL.getSourceMonitor().trackByteCastStartDramaProtocol(next, "next", "");
                    c90442ZeY.LJIILJJIL.getSourceMonitorUtils().trackByteCastStartDramaProtocol(next, "next", "");
                    break;
                }
            }
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void playPreDrama() {
        ICastSource iCastSource;
        C90442ZeY c90442ZeY = this.LJJJLL;
        c90442ZeY.LJIIL.i("PlayerController", "start playPreDrama");
        if (c90442ZeY.LJ() || c90442ZeY.LJIIJJI == null) {
            return;
        }
        synchronized (c90442ZeY.LJI) {
            Iterator<String> it = c90442ZeY.LJI.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (TextUtils.equals(c90442ZeY.LJIIJJI.LIZJ, next) && (iCastSource = c90442ZeY.LJI.get(next)) != null) {
                    CastLogger castLogger = c90442ZeY.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("playPreDrama use ");
                    LIZ.append(next);
                    castLogger.i("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.playPreDrama();
                    CastMonitor castMonitor = c90442ZeY.LJIILIIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(next);
                    LIZ2.append(" play Drama pre");
                    castMonitor.sendSourceEvent("bytecast_drama_pre", X1D.LIZIZ(LIZ2), c90442ZeY.LIZLLL());
                    c90442ZeY.LJIILIIL.getSourceMonitor().trackByteCastStartDramaProtocol(next, "pre", "");
                    c90442ZeY.LJIILJJIL.getSourceMonitorUtils().trackByteCastStartDramaProtocol(next, "pre", "");
                    break;
                }
            }
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void startBrowse() {
        boolean z;
        this.LIZIZ.i("ByteCastSourceImpl", "_SEARCH startBrowse");
        if (!this.LJJ) {
            if (LJJLI) {
                ((ConcurrentSkipListSet) this.LJIL).remove("LeLink");
                ICastSource iCastSource = this.LJIILL.get("LeLink");
                if (iCastSource != null) {
                    iCastSource.startBrowse();
                }
                this.LJJJJL = true;
                SourceMonitorUtils sourceMonitor = this.LIZJ.getSourceMonitor();
                BytecastBrowseType bytecastBrowseType = BytecastBrowseType.ALL;
                sourceMonitor.trackBytecastStartBrowse(bytecastBrowseType);
                this.LIZLLL.getSourceMonitorUtils().trackBytecastStartBrowse(bytecastBrowseType);
                this.LIZJ.getSourceMonitor().trackStartBrowseProtocolEvent("LeLink");
                this.LIZLLL.getSourceMonitorUtils().trackStartBrowseProtocolEvent("LeLink");
            } else if (this.LJJJLZIJ != null) {
                this.LIZJ.getSourceMonitor().trackBrowseEvent("ByteCast", "bytecast_browse_failed_auth_invalid", "");
                this.LJJJLZIJ.onBrowse(-1, null);
            }
            this.LIZIZ.w("ByteCastSourceImpl", "_SEARCH startBrowse authVerify is false");
            return;
        }
        this.LIZJ.sendSourceEvent("ByteCast_Start_Browse_All", "");
        this.LJJJJL = true;
        SourceMonitorUtils sourceMonitor2 = this.LIZJ.getSourceMonitor();
        BytecastBrowseType bytecastBrowseType2 = BytecastBrowseType.ALL;
        sourceMonitor2.trackBytecastStartBrowse(bytecastBrowseType2);
        this.LIZLLL.getSourceMonitorUtils().trackBytecastStartBrowse(bytecastBrowseType2);
        Dispatcher.getInstance().printThreadPool(this.LJJJJZI, "source", "start browse before");
        C90445Zeb c90445Zeb = this.LJIJI;
        if (c90445Zeb != null) {
            c90445Zeb.LJI = null;
        }
        synchronized (this.LJIILL) {
            z = false;
            for (String str : this.LJIILL.keySet()) {
                ICastSource iCastSource2 = this.LJIILL.get(str);
                if (iCastSource2 != null) {
                    if ("BDDLNA".equals(str)) {
                        iCastSource2.setOption(100039, this.LJJJJLI);
                    }
                    iCastSource2.startBrowse();
                    ((ConcurrentSkipListSet) this.LJIL).remove(str);
                    if (!"BDLink".equals(str)) {
                        this.LIZJ.getSourceMonitor().trackStartBrowseProtocolEvent(str);
                        this.LIZLLL.getSourceMonitorUtils().trackStartBrowseProtocolEvent(str);
                    }
                }
                if ("BDLink".equals(str)) {
                    z = true;
                }
            }
        }
        synchronized (this.LJIILLIIL) {
            for (String str2 : this.LJIILLIIL.keySet()) {
                ICastSource iCastSource3 = this.LJIILLIIL.get(str2);
                if (iCastSource3 != null) {
                    iCastSource3.startBrowse();
                    ((ConcurrentSkipListSet) this.LJIL).remove(str2);
                    if (!"ByteLink".equals(str2)) {
                        this.LIZJ.getSourceMonitor().trackStartBrowseProtocolEvent(str2);
                        this.LIZLLL.getSourceMonitorUtils().trackStartBrowseProtocolEvent(str2);
                    }
                }
                if ("ByteLink".equals(str2)) {
                    this.LIZJ.getSourceMonitor().trackStartBrowseProtocolEvent("ByteLink_v2_deprecated");
                    this.LIZLLL.getSourceMonitorUtils().trackStartBrowseProtocolEvent("ByteLink_v2_deprecated");
                    z = true;
                }
            }
        }
        Dispatcher.getInstance().printThreadPool(this.LJJJJZI, "source", "start browse after");
        if (z) {
            if (this.LJIILL.containsKey("BDLink")) {
                this.LJJIIJ = true;
                this.LIZJ.getSourceMonitor().trackStartBrowseProtocolEvent("BDLink");
                this.LIZLLL.getSourceMonitorUtils().trackStartBrowseProtocolEvent("BDLink");
            } else {
                this.LJJIIJ = false;
            }
            if (this.LJIILLIIL.containsKey("ByteLink")) {
                this.LJJIIJZLJL = true;
                this.LIZJ.getSourceMonitor().trackStartBrowseProtocolEvent("ByteLink");
                this.LIZLLL.getSourceMonitorUtils().trackStartBrowseProtocolEvent("ByteLink");
            } else {
                this.LJJIIJZLJL = false;
            }
            this.LJIILIIL.LIZIZ();
        }
        C90499ZfT c90499ZfT = this.LJIILJJIL;
        if (c90499ZfT != null && c90499ZfT.LIZJ()) {
            ((ConcurrentSkipListSet) this.LJIL).remove("WIFIP2P");
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void stopBrowse() {
        ICastSource iCastSource;
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_SEARCH stopBrowse : authVerify=");
        LIZ.append(this.LJJ);
        castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        if (!this.LJJ) {
            if (LJJLI && (iCastSource = this.LJIILL.get("LeLink")) != null) {
                ((ConcurrentSkipListSet) this.LJIL).add("LeLink");
                iCastSource.stopBrowse();
                this.LIZJ.getSourceMonitor().trackStopBrowseProtocolEvent("LeLink");
                this.LJJJJL = false;
                SourceMonitorUtils sourceMonitor = this.LIZJ.getSourceMonitor();
                BytecastBrowseType bytecastBrowseType = BytecastBrowseType.ALL;
                sourceMonitor.trackBytecastStopBrowse(bytecastBrowseType);
                this.LIZLLL.getSourceMonitorUtils().trackBytecastStopBrowse(bytecastBrowseType);
                return;
            }
            return;
        }
        this.LJJJJL = false;
        this.LIZJ.sendSourceEvent("ByteCast_Stop_Browse_All", "");
        SourceMonitorUtils sourceMonitor2 = this.LIZJ.getSourceMonitor();
        BytecastBrowseType bytecastBrowseType2 = BytecastBrowseType.ALL;
        sourceMonitor2.trackBytecastStopBrowse(bytecastBrowseType2);
        this.LIZLLL.getSourceMonitorUtils().trackBytecastStopBrowse(bytecastBrowseType2);
        synchronized (this.LJIILL) {
            for (String str : this.LJIILL.keySet()) {
                ICastSource iCastSource2 = this.LJIILL.get(str);
                if (iCastSource2 != null) {
                    ((ConcurrentSkipListSet) this.LJIL).add(str);
                    iCastSource2.stopBrowse();
                    this.LIZJ.getSourceMonitor().trackStopBrowseProtocolEvent(str);
                }
            }
        }
        synchronized (this.LJIILLIIL) {
            for (String str2 : this.LJIILLIIL.keySet()) {
                ICastSource iCastSource3 = this.LJIILLIIL.get(str2);
                if (iCastSource3 != null) {
                    ((ConcurrentSkipListSet) this.LJIL).add(str2);
                    iCastSource3.stopBrowse();
                    this.LIZJ.getSourceMonitor().trackStopBrowseProtocolEvent(str2);
                }
            }
        }
        C90445Zeb c90445Zeb = this.LJIJI;
        if (c90445Zeb != null) {
            ((CopyOnWriteArrayList) c90445Zeb.LIZJ).clear();
            ((CopyOnWriteArrayList) c90445Zeb.LIZLLL).clear();
        }
        C90495ZfP c90495ZfP = this.LJIILIIL;
        if (c90495ZfP != null) {
            c90495ZfP.LIZJ();
        }
        this.LJJJI = true;
        this.LJJJIL = true;
        C90499ZfT c90499ZfT = this.LJIILJJIL;
        if (c90499ZfT != null && c90499ZfT.LIZLLL()) {
            ((ConcurrentSkipListSet) this.LJIL).add("WIFIP2P");
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void stopServer() {
        ICastSource iCastSource;
        this.LIZIZ.d("ByteCastSourceImpl", "stopServer");
        this.LIZJ.sendByteCastSourceEvent("bytecast_stop_server", "", null, "");
        synchronized (this.LJIILL) {
            for (String str : this.LJIILL.keySet()) {
                ICastSource iCastSource2 = this.LJIILL.get(str);
                if (iCastSource2 != null) {
                    CastLogger castLogger = this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" stopServer");
                    castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
                    iCastSource2.stopServer();
                }
            }
        }
        ICastSource iCastSource3 = this.LJIIIIZZ;
        if (iCastSource3 != null) {
            iCastSource3.stopServer();
        }
        if ((this.LJJI || this.LJJII) && (iCastSource = this.LJIIJ) != null) {
            iCastSource.stopServer();
        }
    }

    public C90801ZkL(ContextManager.CastContext castContext) {
        this.LJJJJZI = castContext;
        this.LIZ = ContextManager.getConfigManager(castContext);
        CastLogger logger = ContextManager.getLogger(castContext);
        this.LIZIZ = logger;
        this.LIZJ = ContextManager.getMonitor(castContext);
        this.LIZLLL = ContextManager.getTeaEventTrack(castContext);
        this.LJJIIZ = ContextManager.getDeviceInfoManager(castContext);
        try {
            ICastSource iCastSource = (ICastSource) Class.forName("com.byted.dlna.source.api.BDDLNASourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(castContext);
            this.LJ = iCastSource;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDDLNASourceWrapper: ");
            LIZ.append(iCastSource);
            logger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        } catch (Throwable unused) {
        }
        try {
            ICastSource iCastSource2 = (ICastSource) Class.forName("com.byted.link.source.impl.BDLinkSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
            this.LJI = iCastSource2;
            ((HashMap) this.LJJIJIL).put("BDLink", new C90430ZeM(iCastSource2));
        } catch (Throwable unused2) {
        }
        try {
            ICastSource iCastSource3 = (ICastSource) Class.forName("com.ss.lelink.source.LelinkSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
            this.LJFF = iCastSource3;
            CastLogger castLogger = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LelinkSourceWrapper:");
            LIZ2.append(iCastSource3);
            castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
        } catch (Throwable unused3) {
        }
        try {
            ICastSource iCastSource4 = (ICastSource) Class.forName("com.byted.cast.source.api.BytelinkSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
            this.LJII = iCastSource4;
            CastLogger castLogger2 = this.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("bytelinkSource:");
            LIZ3.append(iCastSource4);
            castLogger2.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ3));
            ((HashMap) this.LJJIJIL).put("ByteLink", new C90430ZeM(iCastSource4));
        } catch (Throwable unused4) {
        }
        try {
            ICastSource iCastSource5 = (ICastSource) Class.forName("com.byted.cast.vcast.VastCastSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
            this.LJIIIIZZ = iCastSource5;
            CastLogger castLogger3 = this.LIZIZ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("vastcast:zhy");
            LIZ4.append(iCastSource5);
            castLogger3.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ4));
        } catch (Throwable unused5) {
        }
        try {
            ICastSource iCastSource6 = (ICastSource) Class.forName("com.byted.cast.usbsource.usbdisplaysource.UsbCastSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
            this.LJIIIZ = iCastSource6;
            CastLogger castLogger4 = this.LIZIZ;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("usbCastSource:zhy");
            LIZ5.append(iCastSource6);
            castLogger4.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ5));
        } catch (Throwable unused6) {
        }
        try {
            this.LJIIJ = (ICastSource) Class.forName("com.byted.cast.proxy.CastProxyWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
        } catch (Throwable unused7) {
        }
        try {
            ICastSource iCastSource7 = (ICastSource) Class.forName("com.ss.chromecast.source.impl.ChromeCastSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
            this.LJIIJJI = iCastSource7;
            CastLogger castLogger5 = this.LIZIZ;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("ChromeCastSourceWrapper:");
            LIZ6.append(iCastSource7);
            castLogger5.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ6));
            ((HashMap) this.LJJIJIL).put("ChromeCast", new C90430ZeM(iCastSource7));
        } catch (Throwable unused8) {
        }
        try {
            ICastSource iCastSource8 = (ICastSource) Class.forName("com.byted.cloud.source.api.BDCloudSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(this.LJJJJZI);
            this.LJIIL = iCastSource8;
            ((HashMap) this.LJJIJIL).put("BDCloud", new C90430ZeM(iCastSource8));
        } catch (Throwable unused9) {
        }
        try {
            Class.forName("com.byted.cast.wifidirect.WiFiP2PHelper").newInstance();
            this.LJIILJJIL = new C90499ZfT(this.LJJJJZI);
            this.LIZIZ.i("ByteCastSourceImpl", "load Wifi-p2p manager success");
        } catch (Throwable th) {
            CastLogger castLogger6 = this.LIZIZ;
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("load Wifi-p2p manager throwable:");
            LIZ7.append(th);
            castLogger6.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ7));
        }
        this.LJIILIIL = new C90495ZfP(this.LJJJJZI, this.LJI, this.LJII);
        StringBuilder sb = new StringBuilder("There is ");
        if (this.LJI != null) {
            sb.append("BDLink ");
        }
        if (this.LJ != null) {
            sb.append("BDDLNA ");
        }
        if (this.LJII != null) {
            sb.append("ByteLink ");
        }
        if (this.LJFF != null) {
            sb.append("LeLink ");
        }
        if (this.LJIIJJI != null) {
            sb.append("ChromeCast ");
        }
        if (this.LJIIL != null) {
            sb.append("BDCloud ");
        }
        if (this.LJIILJJIL != null) {
            sb.append("WIFIP2P ");
        }
        sb.append("in the system.");
        this.LIZIZ.d("ByteCastSourceImpl", sb.toString());
        this.LJJJJ = new NetworkBehavior(new C90792ZkC(this), this.LJJJJZI);
        new QRPinNetWork(ContextManager.getConfigManager(this.LJJJJZI).getInitConfig().getNetAdapter());
        LJ();
        C90435ZeR c90435ZeR = new C90435ZeR(this.LJJJJZI);
        this.LJJJJZ = c90435ZeR;
        c90435ZeR.LIZIZ = this.LJ;
        c90435ZeR.LIZ = this.LJI;
        C90442ZeY c90442ZeY = new C90442ZeY(this.LJJJJZI, this.LJIILL, this.LJIIZILJ);
        this.LJJJLL = c90442ZeY;
        ICastSource iCastSource9 = this.LJI;
        ICastSource iCastSource10 = this.LJ;
        ICastSource iCastSource11 = this.LJFF;
        ICastSource iCastSource12 = this.LJIIJJI;
        ICastSource iCastSource13 = this.LJIIL;
        c90442ZeY.LIZ = iCastSource9;
        c90442ZeY.LIZIZ = iCastSource10;
        c90442ZeY.LIZJ = iCastSource11;
        c90442ZeY.LIZLLL = iCastSource12;
        c90442ZeY.LJ = iCastSource13;
        CastLogger castLogger7 = this.LIZIZ;
        c90442ZeY.LJIIL = castLogger7;
        CastMonitor castMonitor = this.LIZJ;
        c90442ZeY.LJIILIIL = castMonitor;
        C90436ZeS c90436ZeS = new C90436ZeS();
        this.LJJJLIIL = c90436ZeS;
        ICastSource iCastSource14 = this.LJII;
        ICastSource iCastSource15 = this.LJIIIIZZ;
        ICastSource iCastSource16 = this.LJIIIZ;
        c90436ZeS.LIZIZ = iCastSource14;
        c90436ZeS.LIZJ = iCastSource15;
        c90436ZeS.LIZLLL = iCastSource16;
        c90436ZeS.LJFF = castLogger7;
        TeaEventTrack teaEventTrack = this.LIZLLL;
        c90436ZeS.LJI = castMonitor;
        c90436ZeS.LJII = teaEventTrack;
        c90436ZeS.LIZ = this.LJIJI;
        c90436ZeS.LJ = this.LJIILJJIL;
        c90436ZeS.LJIIJ = new C90800ZkK(this, "ByteLink");
        ICastSource iCastSource17 = this.LJI;
        if (iCastSource17 != null) {
            iCastSource17.setConnectListener(new C90800ZkK(this, "BDLink"));
        }
        ICastSource iCastSource18 = this.LJIIJJI;
        if (iCastSource18 != null) {
            iCastSource18.setConnectListener(new C90800ZkK(this, "ChromeCast"));
        }
        ICastSource iCastSource19 = this.LJIIL;
        if (iCastSource19 != null) {
            iCastSource19.setConnectListener(new C90800ZkK(this, "BDCloud"));
        }
    }

    public static ConfigParam LIZIZ(String str) {
        ConfigParam.GrayConfigBuilder grayConfigBuilder = new ConfigParam.GrayConfigBuilder();
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableDnssd");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableJmDNS");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableBle");
        grayConfigBuilder.appendFeatureKey("ByteCast.DLNACache");
        grayConfigBuilder.appendFeatureKey("ByteCast.DLNASearch");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableBroadCastSearch");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableDeviceOffline");
        grayConfigBuilder.appendFeatureKey("ByteCast.DlnaOfflineInterval");
        grayConfigBuilder.appendFeatureKey("ByteCast.BdlinkOfflineInterval");
        grayConfigBuilder.appendFeatureKey("ByteCast.BdlinkEnableQuickQuery");
        grayConfigBuilder.appendFeatureKey("ByteCast.BdlinkEnableDiskCache");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableSsdpSearch");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableSsdpCycleSearch");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableSourceBDLinkIPv6");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableSourceDlnaIPv6");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableSourceBDLinkSsdpBroadcast");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableDlnaNewDeviceOffline");
        grayConfigBuilder.appendParam("version", (Object) ConfigUtils.getBuildVersion());
        grayConfigBuilder.appendParam("switch", (Object) "1");
        grayConfigBuilder.appendParam("os_version", (Object) Float.valueOf(ConfigUtils.getOSVersionF()));
        grayConfigBuilder.appendParam("device_id", (Object) str);
        grayConfigBuilder.appendParam("last_id", (Object) ConfigUtils.getLastId(str));
        return grayConfigBuilder.build();
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final synchronized void connect(ServiceInfo serviceInfo) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        if (!this.LJJ) {
            return;
        }
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("connect:");
        LIZ.append(serviceInfo);
        LIZ.append(", gitInfo:");
        LIZ.append("1.1086e87");
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        if (this.LJJIJIIJIL == EnumC90460Zeq.STATE_CONNECTING) {
            this.LIZIZ.w("ByteCastSourceImpl", "connecting, ignore this connect request");
            return;
        }
        this.LJJJZ = null;
        ConcurrentSubject<C90429ZeL> concurrentSubject = this.LJJIJ;
        if (concurrentSubject != null) {
            concurrentSubject.clearObservers();
        }
        Iterator it = ((HashMap) this.LJJIJIL).values().iterator();
        while (it.hasNext()) {
            ((C90430ZeM) it.next()).LIZIZ = false;
        }
        this.LJJIJIIJI = new C90794ZkE(this, new boolean[]{false}, serviceInfo);
        ConcurrentSubject<C90429ZeL> concurrentSubject2 = this.LJJIJ;
        if (concurrentSubject2 != null) {
            concurrentSubject2.setTimeout(20L, TimeUnit.SECONDS);
            concurrentSubject2.addObserver(this.LJJIJIIJI);
        }
        if (this.LJII != null && serviceInfo.protocols.contains("ByteLink") && (list4 = this.LJIJ) != null && ((ArrayList) list4).contains("ByteLink")) {
            Object obj = ((HashMap) this.LJJIJIL).get("ByteLink");
            Objects.requireNonNull(obj);
            ((C90430ZeM) obj).LIZIZ = true;
            this.LJII.connect(serviceInfo);
            this.LJJIJIIJIL = EnumC90460Zeq.STATE_CONNECTING;
            this.LIZJ.getSourceMonitor().trackByteCastConnectProtocol("ByteLink", "start", serviceInfo.castId, 0, "");
            this.LIZLLL.getSourceMonitorUtils().trackByteCastConnectProtocol("ByteLink", "start", serviceInfo.castId, 0, "");
        }
        if (this.LJI != null && serviceInfo.protocols.contains("BDLink") && (list3 = this.LJIIZILJ) != null && ((ArrayList) list3).contains("BDLink")) {
            Object obj2 = ((HashMap) this.LJJIJIL).get("BDLink");
            Objects.requireNonNull(obj2);
            ((C90430ZeM) obj2).LIZIZ = true;
            this.LJI.connect(serviceInfo);
            C90445Zeb c90445Zeb = this.LJIJI;
            if (c90445Zeb != null) {
                c90445Zeb.LJI = serviceInfo;
            }
            this.LJJIJIIJIL = EnumC90460Zeq.STATE_CONNECTING;
            this.LIZJ.getSourceMonitor().trackByteCastConnectProtocol("BDLink", "start", serviceInfo.castId, 0, "");
            this.LIZLLL.getSourceMonitorUtils().trackByteCastConnectProtocol("BDLink", "start", serviceInfo.castId, 0, "");
        }
        if (this.LJIIJJI != null && serviceInfo.protocols.contains("ChromeCast") && (list2 = this.LJIIZILJ) != null && ((ArrayList) list2).contains("ChromeCast")) {
            Object obj3 = ((HashMap) this.LJJIJIL).get("ChromeCast");
            Objects.requireNonNull(obj3);
            ((C90430ZeM) obj3).LIZIZ = true;
            this.LJIIJJI.connect(serviceInfo);
            C90445Zeb c90445Zeb2 = this.LJIJI;
            if (c90445Zeb2 != null) {
                c90445Zeb2.LJI = serviceInfo;
            }
            this.LJJIJIIJIL = EnumC90460Zeq.STATE_CONNECTING;
            this.LIZJ.getSourceMonitor().trackByteCastConnectProtocol("ChromeCast", "start", serviceInfo.castId, 0, "");
            this.LIZLLL.getSourceMonitorUtils().trackByteCastConnectProtocol("ChromeCast", "start", serviceInfo.castId, 0, "");
        }
        CastLogger castLogger2 = this.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("linkProtocols: ");
        LIZ2.append(this.LJIIZILJ);
        castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
        if (this.LJIIL != null && serviceInfo.protocols.contains("BDCloud") && (list = this.LJIIZILJ) != null && ((ArrayList) list).contains("BDCloud")) {
            Object obj4 = ((HashMap) this.LJJIJIL).get("BDCloud");
            Objects.requireNonNull(obj4);
            ((C90430ZeM) obj4).LIZIZ = true;
            this.LJIIL.connect(serviceInfo);
            C90445Zeb c90445Zeb3 = this.LJIJI;
            if (c90445Zeb3 != null) {
                c90445Zeb3.LJI = serviceInfo;
            }
            this.LJJIJIIJIL = EnumC90460Zeq.STATE_CONNECTING;
            this.LIZJ.getSourceMonitor().trackByteCastConnectProtocol("BDCloud", "start", serviceInfo.castId, 0, "");
            this.LIZLLL.getSourceMonitorUtils().trackByteCastConnectProtocol("BDCloud", "start", serviceInfo.castId, 0, "");
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final boolean disConnect(ServiceInfo serviceInfo) {
        if (!this.LJJ) {
            return false;
        }
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disConnect, info:");
        LIZ.append(serviceInfo);
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        if (this.LJII != null && (serviceInfo.protocols.contains("ByteLink") || serviceInfo.protocols.contains("RtcLink"))) {
            if (Dispatcher.getInstance().taskIsAlive("ByteLink")) {
                Dispatcher.getInstance().shutdownScheduleService("ByteLink");
            }
            this.LJII.disConnect(serviceInfo);
        }
        if (this.LJI != null && serviceInfo.protocols.contains("BDLink")) {
            this.LJI.disConnect(serviceInfo);
            C90445Zeb c90445Zeb = this.LJIJI;
            if (c90445Zeb != null) {
                c90445Zeb.LJI = null;
            }
        }
        if (this.LJIIJJI != null && serviceInfo.protocols.contains("ChromeCast")) {
            this.LJIIJJI.disConnect(serviceInfo);
        }
        if (this.LJIIL != null && serviceInfo.protocols.contains("BDCloud")) {
            this.LJIIL.disConnect(serviceInfo);
            C90445Zeb c90445Zeb2 = this.LJIJI;
            if (c90445Zeb2 != null) {
                c90445Zeb2.LJI = null;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void getMediaInfo(ServiceInfo serviceInfo) {
        List<String> list;
        List<String> list2;
        if (!this.LJJ) {
            this.LIZIZ.w("ByteCastSourceImpl", "not verify auth.");
            return;
        }
        C90442ZeY c90442ZeY = this.LJJJLL;
        c90442ZeY.LJIIL.i("PlayerController", "getMediaInfo");
        if (serviceInfo == null || TextUtils.isEmpty(serviceInfo.protocols)) {
            c90442ZeY.LJIIL.w("PlayerController", "serviceInfo is null or protocols are null.");
            return;
        }
        CastLogger castLogger = c90442ZeY.LJIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("linkProtocols: ");
        LIZ.append(c90442ZeY.LJII);
        castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
        if (c90442ZeY.LIZ != null && serviceInfo.protocols.contains("BDLink") && (list2 = c90442ZeY.LJII) != null && list2.contains("BDLink")) {
            c90442ZeY.LJIILJJIL.getSourceMonitorUtils().trackByteCastGetMediaInfoProtocol("BDLink");
            c90442ZeY.LIZ.getMediaInfo(serviceInfo);
        }
        if (c90442ZeY.LJ == null || !serviceInfo.protocols.contains("BDCloud") || (list = c90442ZeY.LJII) == null || !list.contains("BDCloud")) {
            return;
        }
        c90442ZeY.LJIILJJIL.getSourceMonitorUtils().trackByteCastGetMediaInfoProtocol("BDCloud");
        c90442ZeY.LJ.getMediaInfo(serviceInfo);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void playDramaId(String str) {
        this.LJJJLL.LJIJI(str);
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setBrowseResultListener(final IBrowseListener iBrowseListener) {
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setBrowseResultListener listener:");
        LIZ.append(iBrowseListener);
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        this.LJJJLZIJ = iBrowseListener;
        C90495ZfP c90495ZfP = this.LJIILIIL;
        if (c90495ZfP != null) {
            IBrowseListener iBrowseListener2 = new IBrowseListener() { // from class: X.Zk9
                @Override // com.byted.cast.common.api.IBrowseListener
                public final /* synthetic */ void onBrowseInvalidDevice(int i, List list) {
                    ZZR.LIZ(this, i, list);
                }

                @Override // com.byted.cast.common.api.IBrowseListener
                public final /* synthetic */ void onError(int i, String str) {
                    ZZR.LIZIZ(this, i, str);
                }

                /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
                /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0217  */
                @Override // com.byted.cast.common.api.IBrowseListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onBrowse(int r15, java.util.List r16) {
                    /*
                        Method dump skipped, instructions count: 663
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C90789Zk9.onBrowse(int, java.util.List):void");
                }
            };
            C90777Zjx c90777Zjx = c90495ZfP.LIZIZ;
            if (c90777Zjx != null) {
                c90777Zjx.LJII = iBrowseListener2;
            }
            C90467Zex c90467Zex = c90495ZfP.LIZJ;
            if (c90467Zex != null) {
                c90467Zex.LJIIL = iBrowseListener2;
            }
            ICastSource iCastSource = c90495ZfP.LIZLLL.LIZJ;
            if (iCastSource != null) {
                iCastSource.setSsdpBrowseResultListener(iBrowseListener2);
            }
        }
        ICastSource iCastSource2 = this.LJI;
        if (iCastSource2 != null) {
            iCastSource2.setBrowseResultListener(new IBrowseListener() { // from class: X.ZkA
                @Override // com.byted.cast.common.api.IBrowseListener
                public final /* synthetic */ void onBrowseInvalidDevice(int i, List list) {
                    ZZR.LIZ(this, i, list);
                }

                @Override // com.byted.cast.common.api.IBrowseListener
                public final /* synthetic */ void onError(int i, String str) {
                    ZZR.LIZIZ(this, i, str);
                }

                @Override // com.byted.cast.common.api.IBrowseListener
                public final void onBrowse(int i, List list) {
                    List<ServiceInfo> list2;
                    C90801ZkL c90801ZkL = C90801ZkL.this;
                    IBrowseListener iBrowseListener3 = iBrowseListener;
                    if (((ConcurrentSkipListSet) c90801ZkL.LJIL).contains("BDLink") || iBrowseListener3 == null || list == null) {
                        return;
                    }
                    C90445Zeb c90445Zeb = c90801ZkL.LJIJI;
                    String str = null;
                    if (c90445Zeb != null) {
                        list2 = c90445Zeb.LJ(i, "BDLink", list);
                    } else {
                        c90801ZkL.LIZIZ.i("ByteCastSourceImpl", "bdlinkSource serviceInfoManager is null");
                        list2 = null;
                    }
                    CastLogger castLogger2 = c90801ZkL.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("BDLink onBrowse code:");
                    LIZ2.append(i);
                    LIZ2.append(", serviceInfoList:");
                    LIZ2.append(list2);
                    castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
                    CastMonitor castMonitor = c90801ZkL.LIZJ;
                    if (list2 != null) {
                        str = list2.toString();
                    }
                    castMonitor.sendSourceEvent("ByteCast_Browse_Result", str);
                    iBrowseListener3.onBrowse(i, list2);
                    c90801ZkL.LJFF("BDLink", list2, true);
                }
            });
        }
        ICastSource iCastSource3 = this.LJ;
        if (iCastSource3 != null) {
            iCastSource3.setBrowseResultListener(new C90797ZkH(this, iBrowseListener));
        }
        ICastSource iCastSource4 = this.LJFF;
        if (iCastSource4 != null) {
            iCastSource4.setBrowseResultListener(new C90798ZkI(this, iBrowseListener));
        }
        ICastSource iCastSource5 = this.LJIIJJI;
        if (iCastSource5 != null) {
            iCastSource5.setBrowseResultListener(new C90799ZkJ(this, iBrowseListener));
        }
        ICastSource iCastSource6 = this.LJII;
        if (iCastSource6 != null) {
            iCastSource6.setBrowseResultListener(new C90793ZkD(this, iBrowseListener));
        }
        if (this.LJIILJJIL != null) {
            this.LJJJJLL = new C90427ZeJ(iBrowseListener);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setConnectListener(IConnectListener iConnectListener) {
        if (iConnectListener == null) {
            return;
        }
        this.LJJIJLIJ = iConnectListener;
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        C90777Zjx c90777Zjx;
        if (iLibraryLoader == null) {
            return;
        }
        ICastSource iCastSource = this.LJII;
        if (iCastSource != null) {
            iCastSource.setLibraryLoader(iLibraryLoader);
        }
        C90495ZfP c90495ZfP = this.LJIILIIL;
        if (c90495ZfP != null && (c90777Zjx = c90495ZfP.LIZIZ) != null) {
            c90777Zjx.LJIJ = iLibraryLoader;
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setLogger(ILogger iLogger) {
        if (iLogger == null) {
            return;
        }
        this.LIZIZ.setLogger(iLogger);
        ICastSource iCastSource = this.LJII;
        if (iCastSource != null) {
            iCastSource.setLogger(iLogger);
        }
        C90495ZfP c90495ZfP = this.LJIILIIL;
        if (c90495ZfP != null) {
            C90777Zjx c90777Zjx = c90495ZfP.LIZIZ;
            if (c90777Zjx != null) {
                c90777Zjx.LJIL = iLogger;
            }
            c90495ZfP.LIZLLL.getClass();
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setMediaInfoListener(IMediaInfoListener iMediaInfoListener) {
        C90442ZeY c90442ZeY = this.LJJJLL;
        c90442ZeY.LJIIIIZZ = iMediaInfoListener;
        ICastSource iCastSource = c90442ZeY.LIZ;
        if (iCastSource != null) {
            iCastSource.setMediaInfoListener(new C90814ZkY(c90442ZeY, "ChromeCast"));
        }
        ICastSource iCastSource2 = c90442ZeY.LJ;
        if (iCastSource2 != null) {
            iCastSource2.setMediaInfoListener(new C90814ZkY(c90442ZeY, "BDCloud"));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setMessageListener(IMessageListener iMessageListener) {
        ICastSource iCastSource = this.LJI;
        if (iCastSource != null) {
            iCastSource.setMessageListener(iMessageListener);
        }
        ICastSource iCastSource2 = this.LJII;
        if (iCastSource2 != null) {
            iCastSource2.setMessageListener(iMessageListener);
        }
        ICastSource iCastSource3 = this.LJIIIIZZ;
        if (iCastSource3 != null) {
            iCastSource3.setMessageListener(iMessageListener);
        }
        ICastSource iCastSource4 = this.LJIIIZ;
        if (iCastSource4 != null) {
            iCastSource4.setMessageListener(iMessageListener);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void setServerListener(com.byted.cast.common.api.IServerListener iServerListener) {
        C90436ZeS c90436ZeS = this.LJJJLIIL;
        if (iServerListener == null) {
            c90436ZeS.getClass();
            return;
        }
        ICastSource iCastSource = c90436ZeS.LIZJ;
        if (iCastSource == null) {
            return;
        }
        iCastSource.setServerListener(new C90807ZkR(c90436ZeS, iServerListener));
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void startServer(String str) {
        ICastSource iCastSource;
        ICastSource iCastSource2;
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startServer serviceName:");
        LIZ.append(str);
        LIZ.append(", verify:");
        LIZ.append(this.LJJ);
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        if (this.LJJ) {
            if ((this.LJJI || this.LJJII) && (iCastSource = this.LJIIJ) != null) {
                iCastSource.startServer(str);
            }
            if (this.LJJIFFI && (iCastSource2 = this.LJIIIIZZ) != null) {
                iCastSource2.startServer(str);
            }
            synchronized (this.LJIILL) {
                for (String str2 : this.LJIILL.keySet()) {
                    ICastSource iCastSource3 = this.LJIILL.get(str2);
                    if (iCastSource3 != null) {
                        CastLogger castLogger2 = this.LIZIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str2);
                        LIZ2.append(" startServer serviceName:");
                        LIZ2.append(str);
                        castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
                        iCastSource3.startServer(str);
                    }
                }
            }
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final String getLocalUrl(String str, String str2) {
        ICastSource iCastSource = this.LJIIJ;
        if (iCastSource != null) {
            return iCastSource.getLocalUrl(str, str2);
        }
        return "";
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final Object getOption(int i, Object... objArr) {
        this.LIZIZ.d("ByteCastSourceImpl", "getOption");
        synchronized (this.LJIILL) {
            for (String str : this.LJIILL.keySet()) {
                ICastSource iCastSource = this.LJIILL.get(str);
                if (iCastSource != null) {
                    CastLogger castLogger = this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" getOption");
                    castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
                    return iCastSource.getOption(i, objArr);
                }
            }
            return null;
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void register(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        C90444Zea LIZJ;
        ICastSource iCastSource;
        C90445Zeb c90445Zeb = this.LJIJI;
        if (c90445Zeb == null || (LIZJ = c90445Zeb.LIZJ(serviceInfo)) == null) {
            CastLogger castLogger = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("subscribe we cannot find device:");
            LIZ.append(serviceInfo);
            castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
            return;
        }
        synchronized (this.LJIILL) {
            for (String str : this.LJIILL.keySet()) {
                if (TextUtils.equals(str, "BDLink") && serviceInfo.protocols.contains(str) && (iCastSource = this.LJIILL.get(str)) != null) {
                    CastLogger castLogger2 = this.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(" subscribe serviceInfo:");
                    LIZ2.append(LIZJ.LJ);
                    castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
                    iCastSource.register(LIZJ.LJ, iRegisterResultListener);
                    return;
                }
            }
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final String sendSync(ServiceInfo serviceInfo, String str) {
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSync serviceInfo:");
        LIZ.append(serviceInfo);
        LIZ.append(", message:");
        LIZ.append(str);
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        ICastSource iCastSource = this.LJI;
        if (iCastSource != null) {
            return iCastSource.sendSync(serviceInfo, str);
        }
        return "";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x007b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x007e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0081. Please report as an issue. */
    @Override // com.byted.cast.common.api.ICastSource
    public final void setOption(int i, Object... objArr) {
        if (i == 100042) {
            Object obj = objArr[0];
            if (obj instanceof ILogger) {
                setLogger((ILogger) obj);
            }
        }
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setOption, option:");
        LIZ.append(i);
        LIZ.append(", mirrorCastSourceMap.size:");
        LIZ.append(this.LJIILLIIL.size());
        castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        if (i != 10018) {
            if (i != 10020) {
                if (i != 10043) {
                    if (i != 10072) {
                        if (i != 10074) {
                            if (i != 10090) {
                                if (i != 100039) {
                                    if (i != 100042) {
                                        if (i != 100073) {
                                            if (i != 10033) {
                                                if (i != 10034) {
                                                    if (i != 10037) {
                                                        if (i != 10038) {
                                                            if (i != 10084 && i != 10085) {
                                                                if (i != 10087) {
                                                                    if (i != 10088) {
                                                                        switch (i) {
                                                                            case 10000:
                                                                                Object obj2 = objArr[0];
                                                                                if (obj2 instanceof IBindSdkInfoListener) {
                                                                                    IBindSdkInfoListener iBindSdkInfoListener = (IBindSdkInfoListener) obj2;
                                                                                    if (iBindSdkInfoListener != null) {
                                                                                        ((CopyOnWriteArrayList) this.LJJIZ).add(new C90806ZkQ(this, iBindSdkInfoListener));
                                                                                    }
                                                                                    ICastSource iCastSource = this.LJFF;
                                                                                    if (iCastSource != null) {
                                                                                        iCastSource.setOption(i, objArr);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            case 10001:
                                                                                Object obj3 = objArr[0];
                                                                                if (obj3 instanceof Boolean) {
                                                                                    this.LJJI = ((Boolean) obj3).booleanValue();
                                                                                    this.LIZ.getInitConfig().setStartLocalServer(true);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            case 10002:
                                                                                Object obj4 = objArr[0];
                                                                                if (obj4 instanceof Integer) {
                                                                                    this.LJJJLIIL.LJIIJJI = ((Integer) obj4).intValue();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            case 10003:
                                                                                if (objArr[0] instanceof IHttpNetWork) {
                                                                                    this.LIZ.getInitConfig().setNetAdapter((IHttpNetWork) objArr[0]);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            case 10004:
                                                                                if (objArr[0] instanceof IMonitor) {
                                                                                    this.LIZ.getInitConfig().setMonitor((IMonitor) objArr[0]);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 10023:
                                                                                        Object obj5 = objArr[0];
                                                                                        if (obj5 instanceof Boolean) {
                                                                                            this.LJJIFFI = ((Boolean) obj5).booleanValue();
                                                                                            this.LIZ.getInitConfig().setStartVcastServer(true);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 10024:
                                                                                        Object obj6 = objArr[0];
                                                                                        if (obj6 instanceof Boolean) {
                                                                                            ((Boolean) obj6).booleanValue();
                                                                                            this.LIZ.getInitConfig().setStartUsbServer(true);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 10025:
                                                                                        Object obj7 = objArr[0];
                                                                                        if (obj7 instanceof Boolean) {
                                                                                            this.LJJII = ((Boolean) obj7).booleanValue();
                                                                                            this.LIZ.getInitConfig().setStartProxyServer(true);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 10058:
                                                                                                if (objArr[0] instanceof Object) {
                                                                                                    this.LIZ.getInitConfig().setWsChannelService(objArr[0]);
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            case 10059:
                                                                                                if (objArr[0] instanceof Integer) {
                                                                                                    this.LIZ.getInitConfig().setChannelId(((Integer) objArr[0]).intValue());
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            case 10060:
                                                                                                if (objArr[0] instanceof String) {
                                                                                                    this.LIZ.getInitConfig().setaId((String) objArr[0]);
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            case 10061:
                                                                                                if (objArr[0] instanceof String) {
                                                                                                    this.LIZ.getInitConfig().setInstallId((String) objArr[0]);
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            case 10062:
                                                                                                if (objArr[0] instanceof Integer) {
                                                                                                    this.LIZ.getInitConfig().setServiceId(((Integer) objArr[0]).intValue());
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            case 10063:
                                                                                                if (objArr[0] instanceof Boolean) {
                                                                                                    this.LIZ.getInitConfig().setHasInitByteSync(((Boolean) objArr[0]).booleanValue());
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 10080:
                                                                                                        if (objArr[0] instanceof Boolean) {
                                                                                                            this.LIZ.getInitConfig().setEnableBDLinkSSDPSwitch((Boolean) objArr[0]);
                                                                                                            return;
                                                                                                        }
                                                                                                        return;
                                                                                                    case 10081:
                                                                                                        if (objArr[0] instanceof Boolean) {
                                                                                                            this.LIZ.getInitConfig().setEnableBDLinkSSDPCycleSearch((Boolean) objArr[0]);
                                                                                                            return;
                                                                                                        }
                                                                                                        return;
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                    }
                                                                    if (objArr[0] instanceof Boolean) {
                                                                        this.LIZ.getInitConfig().setEnableBDLinkSourceBroadcast((Boolean) objArr[0]);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                if (objArr[0] instanceof String) {
                                                                    this.LIZ.getInitConfig().setChromeCastId((String) objArr[0]);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            this.LIZ.setOption(i, objArr);
                                                            return;
                                                        }
                                                        if (objArr[0] instanceof Boolean) {
                                                            this.LIZ.getInitConfig().setEnableDLNASearch((Boolean) objArr[0]);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (objArr[0] instanceof Boolean) {
                                                        this.LIZ.getInitConfig().setEnableDLNACache((Boolean) objArr[0]);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                Object obj8 = objArr[0];
                                                if (obj8 instanceof IAppCommonDataListener) {
                                                    this.LIZJ.setAppCommonDataListener((IAppCommonDataListener) obj8);
                                                    this.LIZLLL.setAppCommonDataListener((IAppCommonDataListener) objArr[0]);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (objArr[0] instanceof Boolean) {
                                                this.LIZ.getInitConfig().setForceDnssd((Boolean) objArr[0]);
                                                return;
                                            }
                                            return;
                                        }
                                        Object obj9 = objArr[0];
                                        if (obj9 instanceof Boolean) {
                                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                                            LogDumper.setWriteLog(this.LJJJJZI.getContextId(), booleanValue);
                                            CastLogger castLogger2 = this.LIZIZ;
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append("isWriteLog: ");
                                            LIZ2.append(booleanValue);
                                            castLogger2.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
                                            return;
                                        }
                                        return;
                                    }
                                    Object obj10 = objArr[0];
                                    if (obj10 instanceof ILogger) {
                                        setLogger((ILogger) obj10);
                                    }
                                    synchronized (this.LJIILL) {
                                        for (String str : this.LJIILL.keySet()) {
                                            ICastSource iCastSource2 = this.LJIILL.get(str);
                                            if (iCastSource2 != null) {
                                                CastLogger castLogger3 = this.LIZIZ;
                                                StringBuilder LIZ3 = X1D.LIZ();
                                                LIZ3.append(str);
                                                LIZ3.append(" setOption");
                                                castLogger3.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ3));
                                                iCastSource2.setOption(i, objArr);
                                            }
                                        }
                                    }
                                    if (this.LJII != null) {
                                        CastLogger castLogger4 = this.LIZIZ;
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("bytelink setOption:");
                                        LIZ4.append(i);
                                        castLogger4.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ4));
                                        this.LJII.setOption(i, objArr);
                                    }
                                    ICastSource iCastSource3 = this.LJIIIIZZ;
                                    if (iCastSource3 != null) {
                                        iCastSource3.setOption(i, objArr);
                                    }
                                    ICastSource iCastSource4 = this.LJIIIZ;
                                    if (iCastSource4 != null) {
                                        iCastSource4.setOption(i, objArr);
                                    }
                                    this.LJIILIIL.LIZ(i, objArr);
                                    return;
                                }
                                Object obj11 = objArr[0];
                                if (obj11 instanceof String) {
                                    this.LJJJJLI = String.valueOf(obj11);
                                    return;
                                }
                                return;
                            }
                            if (objArr[0] instanceof Boolean) {
                                this.LIZ.getInitConfig().setEnableDlnaNewDeviceOffline((Boolean) objArr[0]);
                                return;
                            }
                            return;
                        }
                        if (objArr[0] instanceof Boolean) {
                            this.LIZ.getInitConfig().setForceJmDNS((Boolean) objArr[0]);
                            return;
                        }
                        return;
                    }
                    if (objArr[0] instanceof DeviceOfflineDetectSettings) {
                        this.LIZ.getInitConfig().setDeviceOfflineDetectSettings((DeviceOfflineDetectSettings) objArr[0]);
                        return;
                    }
                    return;
                }
                if (objArr[0] instanceof Boolean) {
                    this.LIZ.getInitConfig().setEnableDLNABroadCast((Boolean) objArr[0]);
                    return;
                }
                return;
            }
            if (objArr[0] instanceof Boolean) {
                this.LIZ.getInitConfig().setEnableBLE((Boolean) objArr[0]);
                return;
            }
            return;
        }
        if (objArr[0] instanceof String) {
            this.LIZ.getInitConfig().setLocalProtocols(String.valueOf(objArr[0]));
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void unregister(ServiceInfo serviceInfo, IRegisterResultListener iRegisterResultListener) {
        C90444Zea LIZJ;
        ICastSource iCastSource;
        C90445Zeb c90445Zeb = this.LJIJI;
        if (c90445Zeb == null || (LIZJ = c90445Zeb.LIZJ(serviceInfo)) == null) {
            CastLogger castLogger = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unsubscribe we cannot find device:");
            LIZ.append(serviceInfo);
            castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
            return;
        }
        synchronized (this.LJIILL) {
            for (String str : this.LJIILL.keySet()) {
                if (TextUtils.equals(str, "BDLink") && serviceInfo.protocols.contains(str) && (iCastSource = this.LJIILL.get(str)) != null) {
                    CastLogger castLogger2 = this.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(" unsubscribe serviceInfo:");
                    LIZ2.append(LIZJ.LJ);
                    castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
                    iCastSource.unregister(LIZJ.LJ, iRegisterResultListener);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r16 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r14, java.util.List r15, boolean r16) {
        /*
            r13 = this;
            if (r15 == 0) goto L8
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L9
        L8:
            return
        L9:
            java.lang.String r3 = r15.toString()
            java.lang.String r4 = com.byted.cast.common.utils.ServiceInfoUtils.getDeviceName(r15)
            java.lang.String r5 = com.byted.cast.common.utils.ServiceInfoUtils.getManufacture(r15)
            boolean r0 = r13.LJJJJL
            r8 = r14
            r6 = r16
            if (r0 == 0) goto L4e
            com.byted.cast.common.TeaEventTrack r0 = r13.LIZLLL
            com.byted.cast.common.SourceMonitorUtils r0 = r0.getSourceMonitorUtils()
            com.byted.cast.common.bean.BytecastBrowseType r1 = com.byted.cast.common.bean.BytecastBrowseType.ALL
            r2 = 1
            r0.trackBytecastBrowseResult(r1, r2, r3, r4, r5, r6)
            if (r6 == 0) goto L40
            com.byted.cast.common.CastMonitor r0 = r13.LIZJ
            com.byted.cast.common.SourceMonitorUtils r0 = r0.getSourceMonitor()
            r0.trackBytecastBrowseResult(r1, r2, r3, r4, r5, r6)
        L33:
            com.byted.cast.common.CastMonitor r0 = r13.LIZJ
            com.byted.cast.common.SourceMonitorUtils r7 = r0.getSourceMonitor()
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            r7.trackBrowseResultProtocolEvent(r8, r9, r10, r11, r12)
        L40:
            com.byted.cast.common.TeaEventTrack r0 = r13.LIZLLL
            com.byted.cast.common.SourceMonitorUtils r7 = r0.getSourceMonitorUtils()
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            r7.trackBrowseResultProtocolEvent(r8, r9, r10, r11, r12)
            goto L8
        L4e:
            if (r6 == 0) goto L40
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90801ZkL.LJFF(java.lang.String, java.util.List, boolean):void");
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void getMsg(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getMsg serviceInfo:");
        LIZ.append(serviceInfo);
        LIZ.append(", message:");
        LIZ.append(str);
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        ICastSource iCastSource = this.LJI;
        if (iCastSource != null) {
            iCastSource.getMsg(serviceInfo, str, iSendResultListener);
        }
    }

    @Override // com.byted.cast.common.api.ICastSource
    public final void send(ServiceInfo serviceInfo, String str, ISendResultListener iSendResultListener) {
        for (String str2 : this.LJIIZILJ) {
            if (!TextUtils.isEmpty(serviceInfo.protocols) && serviceInfo.protocols.contains(str2)) {
                synchronized (this.LJIILL) {
                    for (String str3 : this.LJIILL.keySet()) {
                        ICastSource iCastSource = this.LJIILL.get(str3);
                        if (iCastSource != null && TextUtils.equals(str2, str3)) {
                            CastLogger castLogger = this.LIZIZ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(str3);
                            LIZ.append(" send");
                            castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
                            iCastSource.send(serviceInfo, str, iSendResultListener);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void LIZLLL(Context context, Config config, IInitListener iInitListener, boolean z) {
        IInitListener iInitListener2;
        String[] split;
        if (config == null) {
            iInitListener.onFail(10011, "ERROR_EMPTY_CONFIG", null);
            return;
        }
        Constants.attachAppContext(context);
        this.LJJJJZI.setProjectId(config.getProjectId());
        LogDumper.init(context, "ByteCast");
        this.LIZ.init(config);
        if (!TextUtils.isEmpty(config.getChromeCastId())) {
            Utils.setChromeCastId(config.getChromeCastId());
        }
        boolean isEnableDebug = config.isEnableDebug();
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Is debug open? ");
        LIZ.append(isEnableDebug);
        castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        Constants.isDebugMode = isEnableDebug;
        this.LIZIZ.setEnable(isEnableDebug);
        this.LJJI = config.isStartLocalServer();
        this.LJJIFFI = config.isStartVcastServer();
        config.isStartUsbServer();
        this.LJJII = config.isStartProxyServer();
        String localProtocols = config.getLocalProtocols();
        if (!TextUtils.isEmpty(localProtocols)) {
            CastLogger castLogger2 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parseProtocols: ");
            LIZ2.append(localProtocols);
            castLogger2.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ2));
            if (!TextUtils.isEmpty(localProtocols) && (split = localProtocols.split(",")) != null && split.length >= 1) {
                ((ArrayList) this.LJJIII).clear();
                this.LJIIZILJ = new ArrayList();
                this.LJIJ = new ArrayList();
                for (String str : split) {
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2023507661:
                                if (!str.equals("LeLink")) {
                                    break;
                                } else {
                                    ((ArrayList) this.LJIIZILJ).add(str);
                                    ((ArrayList) this.LJIJ).add(str);
                                    continue;
                                }
                            case -1803213502:
                                if (!str.equals("ByteLink")) {
                                    break;
                                } else {
                                    ((ArrayList) this.LJIJ).add(str);
                                    continue;
                                }
                            case 457686803:
                                if (!str.equals("BDCloud")) {
                                    break;
                                }
                                break;
                            case 483315961:
                                if (!str.equals("ChromeCast")) {
                                    break;
                                }
                                break;
                            case 1954424701:
                                if (!str.equals("BDDLNA")) {
                                    break;
                                }
                                break;
                            case 1954691932:
                                if (!str.equals("BDLink")) {
                                    break;
                                }
                                break;
                        }
                        ((ArrayList) this.LJIIZILJ).add(str);
                    }
                }
                ((ArrayList) this.LJJIII).addAll(Arrays.asList(split));
                CastLogger castLogger3 = this.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("parseProtocols: protocols: ");
                LIZ3.append(this.LJJIII);
                castLogger3.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ3));
            }
        }
        if (!config.isInitialModeBind()) {
            setLogger(config.getLogger());
            setLibraryLoader(config.getLibraryLoader());
            IAppCommonDataListener commonDataListener = config.getCommonDataListener();
            if (commonDataListener != null) {
                this.LIZJ.setAppCommonDataListener(commonDataListener);
                this.LIZLLL.setAppCommonDataListener(commonDataListener);
            }
            this.LJJJJLI = config.getDlnaXMLParserKeys();
            if (!this.LJJIL && config.getBindSdkInfoListeners() != null && config.getBindSdkInfoListeners().size() > 0) {
                for (IBindSdkInfoListener iBindSdkInfoListener : config.getBindSdkInfoListeners()) {
                    if (iBindSdkInfoListener != null) {
                        ((CopyOnWriteArrayList) this.LJJIZ).add(new C90806ZkQ(this, iBindSdkInfoListener));
                    }
                }
                this.LJJIL = true;
            }
        }
        C90495ZfP c90495ZfP = this.LJIILIIL;
        C90777Zjx c90777Zjx = c90495ZfP.LIZIZ;
        if (c90777Zjx != null) {
            c90777Zjx.LIZJ.i("NsdClient", "init");
            if (c90777Zjx.LJIJJ) {
                c90777Zjx.LIZJ.w("NsdClient", "init, already inited");
            } else {
                c90777Zjx.LIZ = context;
                ConfigManager configManager = ContextManager.getConfigManager(c90777Zjx.LIZIZ);
                c90777Zjx.LJFF = configManager.getInitConfig().isEnableDebug();
                String privateChannel = configManager.getInitConfig().getPrivateChannel();
                CastLogger castLogger4 = c90777Zjx.LIZJ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("setPrivateChannel: ");
                LIZ4.append(privateChannel);
                castLogger4.i("NsdClient", X1D.LIZIZ(LIZ4));
                if (TextUtils.isEmpty(privateChannel)) {
                    c90777Zjx.LJIIIZ = "BDLink";
                    c90777Zjx.LJIIJ = "_BDLink._tcp.";
                } else {
                    c90777Zjx.LJIIIZ = privateChannel;
                    c90777Zjx.LJIIJ = C16880lQ.LLLZ("_%s._tcp.", new Object[]{privateChannel});
                }
                if (c90777Zjx.LJIJI == null) {
                    try {
                        NetworkChangeReceiver2 networkChangeReceiver2 = new NetworkChangeReceiver2(context, c90777Zjx);
                        c90777Zjx.LJIJI = networkChangeReceiver2;
                        networkChangeReceiver2.register();
                    } catch (Exception e) {
                        CastLogger castLogger5 = c90777Zjx.LIZJ;
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("init, NetworkChangeReceiver2 exception:");
                        LIZ5.append(e.getMessage());
                        castLogger5.e("NsdClient", X1D.LIZIZ(LIZ5));
                        c90777Zjx.LJIJI = null;
                    }
                }
                c90777Zjx.LJJIFFI = new CastThreadPoolExecutor(4, 32, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(64), new CastThreadFactory("NsdClient"));
                c90777Zjx.LJIJJ = true;
            }
        }
        C90467Zex c90467Zex = c90495ZfP.LIZJ;
        if (c90467Zex != null) {
            c90467Zex.LJI = context;
            c90467Zex.LIZLLL = BluetoothAdapter.getDefaultAdapter();
            c90467Zex.LIZJ = new C90466Zew(c90467Zex);
        }
        C90498ZfS c90498ZfS = c90495ZfP.LIZLLL;
        String privateChannel2 = ContextManager.getConfigManager(c90498ZfS.LIZ).getInitConfig().getPrivateChannel();
        ICastSource iCastSource = c90498ZfS.LIZJ;
        if (iCastSource != null) {
            iCastSource.setSsdpPrivateChannel(privateChannel2);
        }
        C90416Ze8 c90416Ze8 = c90495ZfP.LJFF;
        c90416Ze8.LIZ = context;
        ConfigManager configManager2 = ContextManager.getConfigManager(c90416Ze8.LIZIZ);
        C90416Ze8.LJIIL = configManager2.getInitConfig().getBDLinkDiskCacheDetectIntervalMills();
        String privateChannel3 = configManager2.getInitConfig().getPrivateChannel();
        if (!TextUtils.isEmpty(privateChannel3)) {
            c90416Ze8.LJII = privateChannel3;
        }
        this.LJJIJ = new ConcurrentSubject<>();
        ConcurrentSubject<C90429ZeL> concurrentSubject = new ConcurrentSubject<>();
        this.LJJIIZI = concurrentSubject;
        concurrentSubject.addObserver(new C90805ZkP(this));
        if (TextUtils.equals(this.LJJJJJL, "1") && this.LJJJJJ == null) {
            ScheduledExecutorService LLLLZIL = C16880lQ.LLLLZIL(1);
            this.LJJJJJ = LLLLZIL;
            LLLLZIL.scheduleAtFixedRate(new RunnableC90184ZaO(1, this), 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        this.LIZJ.initSessionID(config.getDeviceId(), config.getAppId(), config.getProjectId(), "source");
        this.LIZJ.init(context, config.getDeviceId(), config.getMonitor());
        Monitor.initSessionID(config.getDeviceId(), config.getAppId(), config.getProjectId(), "default");
        Monitor.getInst(context, config.getDeviceId(), config.getMonitor());
        this.LIZLLL.initSessionID(config.getProjectId());
        NetworkMonitor.updateVpnStatus();
        NetworkMonitor.updateWifiProxyStatus();
        this.LIZJ.sendByteCastAuthEvent(config.isInitialModeBind(), "start", -1);
        this.LIZLLL.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_AUTH, new C90428ZeK(config));
        if (this.LJJJJ != null) {
            NetworkBehaviorData networkBehaviorData = this.LJJJJI;
            if (networkBehaviorData != null) {
                iInitListener2 = networkBehaviorData.getListener();
            } else {
                iInitListener2 = null;
            }
            ContextManager.CastContext castContext = this.LJJJJZI;
            if (!z || iInitListener2 == null) {
                iInitListener2 = iInitListener;
            }
            NetworkBehaviorData networkBehaviorData2 = new NetworkBehaviorData(context, castContext, config, iInitListener2);
            this.LJJJJI = networkBehaviorData2;
            this.LJJJJ.initNetworkChangeReceiver(networkBehaviorData2);
        }
        this.LIZIZ.d("ByteCastSourceImpl", "init");
        ICastSource iCastSource2 = this.LJI;
        if (iCastSource2 != null) {
            iCastSource2.init(context, config, iInitListener);
        }
        ICastSource iCastSource3 = this.LJ;
        if (iCastSource3 != null) {
            iCastSource3.init(context, config, iInitListener);
        }
        ICastSource iCastSource4 = this.LJFF;
        if (iCastSource4 != null) {
            iCastSource4.init(context, config, new C90795ZkF(this));
        }
        ICastSource iCastSource5 = this.LJII;
        if (iCastSource5 != null) {
            iCastSource5.init(context, config, new C90796ZkG());
        }
        ICastSource iCastSource6 = this.LJIIIIZZ;
        if (iCastSource6 != null) {
            iCastSource6.init(context, config, iInitListener);
        }
        ICastSource iCastSource7 = this.LJIIJJI;
        if (iCastSource7 != null) {
            iCastSource7.init(context, config, iInitListener);
        }
        ICastSource iCastSource8 = this.LJIIIZ;
        if (iCastSource8 != null) {
            iCastSource8.init(context, config, iInitListener);
        }
        ICastSource iCastSource9 = this.LJIIL;
        if (iCastSource9 != null) {
            iCastSource9.init(context, config, iInitListener);
        }
        CastLogger castLogger6 = this.LIZIZ;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("wifi-p2p isEnableWifiP2PSearch:");
        LIZ6.append(this.LIZ.getInitConfig().isEnableWifiP2PSearch());
        LIZ6.append("，wifiP2PManager：");
        LIZ6.append(this.LJIILJJIL);
        castLogger6.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ6));
        C90499ZfT c90499ZfT = this.LJIILJJIL;
        if (c90499ZfT != null) {
            c90499ZfT.LIZIZ(context, this.LJIJI, this.LJJJJLL);
        }
        this.LJIILL.clear();
        this.LJIILLIIL.clear();
        if (config.isInitialModeBind()) {
            this.LIZIZ.i("ByteCastSourceImpl", "local verify");
            String deviceId = config.getDeviceId();
            this.LIZIZ.i("ByteCastSourceImpl", "setAuthByLocalOption");
            LIZJ();
            CastLogger castLogger7 = this.LIZIZ;
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("set protocols by local protocols: ");
            LIZ7.append(this.LJJIII);
            castLogger7.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ7));
            CastMonitor castMonitor = this.LIZJ;
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("pkg:");
            LIZ8.append(context.getPackageName());
            LIZ8.append(",protocols:");
            LIZ8.append(this.LJJIII);
            castMonitor.sendSourceEvent("ByteCast_Source_Auth_LOCAL", X1D.LIZIZ(LIZ8));
            this.LJJ = true;
            this.LIZ.fetchConfig(LIZIZ(deviceId), new C90802ZkM(this, iInitListener));
        } else {
            this.LIZIZ.i("ByteCastSourceImpl", "license verify");
            CastLogger castLogger8 = this.LIZIZ;
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("authByLicense: projectId: ");
            LIZ9.append(config.getProjectId());
            castLogger8.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ9));
            if (TextUtils.isEmpty(config.getProjectId())) {
                iInitListener.onFail(10019, "ERROR_EMPTY_PROJECT_ID", null);
            } else {
                if (this.LJIJJLI == null) {
                    this.LJIJJLI = new AuthWrapper(this.LJJJJZI);
                }
                this.LJIJJLI.init(config.getProjectId());
                this.LJIJJLI.verifyLicense(config.getLicensePath(), new C90803ZkN(this, iInitListener));
                this.LIZ.fetchConfig(LIZIZ(config.getDeviceId()), null);
            }
        }
        getVersion();
        SourceDeviceInfo sourceDeviceInfo = new SourceDeviceInfo();
        sourceDeviceInfo.name = config.getServiceName();
        sourceDeviceInfo.deviceId = config.getDeviceId();
        sourceDeviceInfo.appId = config.getAppId();
        sourceDeviceInfo.userId = config.getUserId();
        sourceDeviceInfo.sessionId = this.LIZLLL.sessionID;
        sourceDeviceInfo.version = "3.10.2.7.overseas-tt";
        sourceDeviceInfo.ping = 1;
        this.LJJIIZ.saveLocalSourceDeviceInfo(context, sourceDeviceInfo);
    }
}
