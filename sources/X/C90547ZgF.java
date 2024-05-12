package X;

import android.content.Context;
import android.text.TextUtils;
import com.byted.cast.common.Constants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.DeviceInfoManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.LogDumper;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.IAppCommonDataListener;
import com.byted.cast.common.api.IBindSdkInfoListener;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.api.cloud.ICastIdListener;
import com.byted.cast.common.api.multiple.IMultipleActiveControl;
import com.byted.cast.common.api.multiple.IMultipleLoader;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.auth.license.AuthWrapper;
import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.ConfigManager;
import com.byted.cast.common.config.ConfigParam;
import com.byted.cast.common.config.ConfigUtils;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.network.NetworkBehavior;
import com.byted.cast.common.network.NetworkBehaviorData;
import com.byted.cast.common.performance.CrashUtil;
import com.byted.cast.common.pin.QRPinNetWork;
import com.byted.cast.common.sink.CallbackServerInfo;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.IServerListener;
import com.byted.cast.common.sink.ServiceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZgF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90547ZgF {
    public final ICastSink LIZ;
    public final ICastSink LIZIZ;
    public final ICastSink LIZJ;
    public final ICastSink LIZLLL;
    public final ICastSink LJ;
    public final ICastSink LJFF;
    public final ICastSink LJI;
    public final ZYI LJII;
    public final java.util.Map<String, ICastSink> LJIIIIZZ;
    public final java.util.Map<String, IMultipleLoader> LJIIIZ;
    public final java.util.Map<String, IMultipleActiveControl> LJIIJ;
    public final java.util.Map<String, CastInfo> LJIIJJI;
    public final ExecutorC90549ZgH LJIIL;
    public final C90850Zl8 LJIILIIL;
    public AuthWrapper LJIILJJIL;
    public List<String> LJIILL;
    public int LJIILLIIL;
    public final boolean LJIIZILJ;
    public Context LJIJ;
    public Config LJIJI;
    public String LJIJJ;
    public IServerListener LJIJJLI;
    public C90851Zl9 LJIL;
    public volatile boolean LJJ;
    public final List<IBindSdkInfoListener> LJJI;
    public final java.util.Map<String, CallbackServerInfo> LJJIFFI;
    public ConcurrentSubject<CallbackServerInfo> LJJII;
    public final Object LJJIII;
    public boolean LJJIIJ;
    public IHttpNetWork LJJIIJZLJL;
    public IMonitor LJJIIZ;
    public final NetworkBehavior LJJIIZI;
    public NetworkBehaviorData LJJIJ;
    public boolean LJJIJIIJI;
    public ScheduledExecutorService LJJIJIIJIL;
    public final String LJJIJIL;
    public volatile boolean LJJIJL;
    public final C90115ZYh LJJIJLIJ;
    public final ContextManager.CastContext LJJIL;
    public String LJJIZ;
    public final C90844Zl2 LJJJ;

    public final synchronized void LJIIJJI() {
        if (!this.LJJIIJ || this.LJJIJL) {
            Logger.d("ByteCastSinkImpl", "stopServer, service not start or has stopped server.");
            return;
        }
        this.LJJIJL = true;
        this.LJII.LIZIZ();
        C90115ZYh c90115ZYh = this.LJJIJLIJ;
        c90115ZYh.getClass();
        Logger.i("CastRelay", "stopServer");
        ICastSource iCastSource = c90115ZYh.LIZ;
        if (iCastSource != null) {
            iCastSource.stopServer();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopServer, castSinkMap size:");
        LIZ.append(((ConcurrentHashMap) this.LJIIIIZZ).size());
        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        Monitor.sendByteCastSinkEvent("bytecast_stop_server", "", (String) null, (String) null);
        for (String str : ((ConcurrentHashMap) this.LJIIIIZZ).keySet()) {
            ICastSink iCastSink = (ICastSink) ((ConcurrentHashMap) this.LJIIIIZZ).get(str);
            if (iCastSink != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(" stopServer");
                Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ2));
                iCastSink.stopServer();
            }
        }
        this.LJJIIJ = false;
        Logger.i("ByteCastSinkImpl", "stopServer out");
        Dispatcher.getInstance().printThreadPool(null, "sink", "stop server");
    }

    public static ConfigParam LIZJ() {
        ConfigParam.GrayConfigBuilder grayConfigBuilder = new ConfigParam.GrayConfigBuilder();
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableDnssd");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableJmDNS");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableBle");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableSinkSsdp");
        grayConfigBuilder.appendFeatureKey("ByteCast.EnableSinkBDLinkSsdpBroadcast");
        grayConfigBuilder.appendParam("version", (Object) ConfigUtils.getBuildVersion());
        grayConfigBuilder.appendParam("switch", (Object) "1");
        grayConfigBuilder.appendParam("os_version", (Object) Float.valueOf(ConfigUtils.getOSVersionF()));
        return grayConfigBuilder.build();
    }

    public final void LIZIZ() {
        Logger.i("ByteCastSinkImpl", "deInit");
        Monitor.sendByteCastSinkEvent("bytecast_unbind_sdk", "", (String) null, (String) null);
        ((HashMap) this.LJIIJJI).clear();
        for (String str : ((ConcurrentHashMap) this.LJIIIIZZ).keySet()) {
            ICastSink iCastSink = (ICastSink) ((ConcurrentHashMap) this.LJIIIIZZ).get(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" deInit");
            Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
            iCastSink.destroy();
        }
        C90115ZYh c90115ZYh = this.LJJIJLIJ;
        if (c90115ZYh != null) {
            Logger.i("CastRelay", "destroy");
            ICastSource iCastSource = c90115ZYh.LIZ;
            if (iCastSource != null) {
                iCastSource.destroy();
            }
        }
        NetworkBehavior networkBehavior = this.LJJIIZI;
        if (networkBehavior != null) {
            networkBehavior.unRegisterNetworkChangeReceiver();
        }
        AuthWrapper authWrapper = this.LJIILJJIL;
        if (authWrapper != null) {
            authWrapper.destroy();
        }
        synchronized (this.LJJIII) {
            ConcurrentSubject<CallbackServerInfo> concurrentSubject = this.LJJII;
            if (concurrentSubject != null) {
                concurrentSubject.destroy();
                this.LJJII = null;
            }
        }
        ConfigManager.getInstance().destroy();
        ScheduledExecutorService scheduledExecutorService = this.LJJIJIIJIL;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.LJJIJIIJIL = null;
        }
        LogDumper.destroy();
    }

    public final void LJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.ss.cast:sink-link", "3.10.2.6.overseas-tt");
            jSONObject.put("com.ss.cast:sink-bdlink", "3.10.2.6.overseas-tt");
            jSONObject.put("com.ss.cast:sink-bddlna", "3.10.2.6.overseas-tt");
            ICastSink iCastSink = this.LIZLLL;
            if (iCastSink != null) {
                jSONObject.put("com.ss.cast:sink-mirror", iCastSink.getVersion());
            }
            ICastSink iCastSink2 = this.LIZJ;
            if (iCastSink2 != null) {
                jSONObject.put("com.ss.cast:sink-airplay", iCastSink2.getVersion());
            }
            ICastSink iCastSink3 = this.LJ;
            if (iCastSink3 != null) {
                jSONObject.put("com.hpplay.sdk:lesink", iCastSink3.getVersion());
            }
            ICastSink iCastSink4 = this.LJFF;
            if (iCastSink4 != null) {
                jSONObject.put("com.ss.cast:sink-bdcloud", iCastSink4.getVersion());
            }
            ICastSink iCastSink5 = this.LJI;
            if (iCastSink5 != null) {
                jSONObject.put("com.ss.cast:sink-bdcloud", iCastSink5.getVersion());
            }
            C90115ZYh c90115ZYh = this.LJJIJLIJ;
            if (c90115ZYh != null) {
                jSONObject.put("com.ss.cast:vast_cast", c90115ZYh.LIZ());
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        Logger.i("ByteCastSinkImpl", "protocols version:" + jSONObject.toString());
        Monitor.sendSinkEvent("ByteCast_Sink_Get_Protocols_Version", jSONObject.toString());
        jSONObject.toString();
    }

    public final void LJI() {
        ICastSink iCastSink;
        ICastSink iCastSink2;
        ICastSink iCastSink3;
        ICastSink iCastSink4;
        ICastSink iCastSink5;
        ICastSink iCastSink6;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.LJIILL == null) {
            this.LJIILL = new ArrayList();
        }
        if (((ArrayList) this.LJIILL).size() > 0) {
            Iterator it = ((ArrayList) this.LJIILL).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (TextUtils.isEmpty(str)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("castSinkMap:handleModulePriorityImpl protocol empty, protocols:");
                    LIZ.append(this.LJIILL);
                    Logger.w("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
                } else {
                    str.getClass();
                    switch (str.hashCode()) {
                        case -2023507661:
                            if (str.equals("LeLink") && (iCastSink6 = this.LJ) != null) {
                                ((ConcurrentHashMap) this.LJIIIIZZ).put("LeLink", iCastSink6);
                                stringBuffer.append("LeLink,");
                                break;
                            }
                            break;
                        case -1803213502:
                            if (str.equals("ByteLink") && this.LIZLLL != null) {
                                Logger.i("ByteCastSinkImpl", "castSinkMap put BYTELINK");
                                ((ConcurrentHashMap) this.LJIIIIZZ).put("ByteLink", this.LIZLLL);
                                stringBuffer.append("ByteLink,");
                                break;
                            }
                            break;
                        case -108862212:
                            if (str.equals("BDAirPlay") && (iCastSink5 = this.LIZJ) != null) {
                                ((ConcurrentHashMap) this.LJIIIIZZ).put("BDAirPlay", iCastSink5);
                                stringBuffer.append("BDAirPlay,");
                                break;
                            }
                            break;
                        case 457686803:
                            if (str.equals("BDCloud") && (iCastSink4 = this.LJFF) != null) {
                                ((ConcurrentHashMap) this.LJIIIIZZ).put("BDCloud", iCastSink4);
                                break;
                            }
                            break;
                        case 483315961:
                            if (str.equals("ChromeCast") && (iCastSink3 = this.LJI) != null) {
                                ((ConcurrentHashMap) this.LJIIIIZZ).put("ChromeCast", iCastSink3);
                                break;
                            }
                            break;
                        case 1954424701:
                            if (str.equals("BDDLNA") && (iCastSink2 = this.LIZIZ) != null) {
                                ((ConcurrentHashMap) this.LJIIIIZZ).put("BDDLNA", iCastSink2);
                                stringBuffer.append("BDDLNA,");
                                break;
                            }
                            break;
                        case 1954691932:
                            if (str.equals("BDLink") && (iCastSink = this.LIZ) != null) {
                                ((ConcurrentHashMap) this.LJIIIIZZ).put("BDLink", iCastSink);
                                stringBuffer.append("BDLink,");
                                break;
                            }
                            break;
                    }
                }
            }
            Monitor.setProtocols(this.LJIILL.toString());
        }
        ZYI zyi = this.LJII;
        if (zyi != null) {
            List<String> list = this.LJIILL;
            ZWQ zwq = zyi.LIZ;
            if (zwq != null) {
                ((ArrayList) zwq.LJI).clear();
                ((ArrayList) zwq.LJI).addAll(list);
            }
            C90555ZgN c90555ZgN = zyi.LIZIZ;
            if (c90555ZgN != null) {
                if (c90555ZgN.LJIIIZ == null) {
                    c90555ZgN.LJIIIZ = new CopyOnWriteArrayList();
                }
                ((CopyOnWriteArrayList) c90555ZgN.LJIIIZ).clear();
                ((CopyOnWriteArrayList) c90555ZgN.LJIIIZ).addAll(list);
            }
            C90421ZeD c90421ZeD = zyi.LIZJ;
            ((ArrayList) c90421ZeD.LIZJ).clear();
            ((ArrayList) c90421ZeD.LIZJ).addAll(list);
        }
        int length = stringBuffer.length();
        if (length > 0) {
            stringBuffer = new StringBuffer(stringBuffer.substring(0, length - 1));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("castSinkMap:");
        LIZ2.append((Object) stringBuffer);
        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.Zl2] */
    public C90547ZgF(ContextManager.CastContext castContext) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LJIIIIZZ = concurrentHashMap;
        HashMap hashMap = new HashMap();
        this.LJIIIZ = hashMap;
        HashMap hashMap2 = new HashMap();
        this.LJIIJ = hashMap2;
        this.LJIIJJI = new HashMap();
        this.LJIIL = new ExecutorC90549ZgH();
        C90850Zl8 c90850Zl8 = new C90850Zl8(this);
        this.LJIILIIL = c90850Zl8;
        this.LJIILL = new ArrayList();
        this.LJIILLIIL = 1;
        this.LJIIZILJ = true;
        this.LJJ = false;
        this.LJJI = new ArrayList();
        this.LJJIFFI = new HashMap();
        this.LJJIII = new Object();
        this.LJJIIJ = false;
        this.LJJIJIL = CardStruct.IStatusCode.DEFAULT;
        this.LJJIJL = false;
        this.LJJIZ = null;
        this.LJJJ = new ICastIdListener() { // from class: X.Zl2
            @Override // com.byted.cast.common.api.cloud.ICastIdListener
            public final void onCastIdReceived(long j) {
                C90547ZgF c90547ZgF = C90547ZgF.this;
                c90547ZgF.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mCastIdListener castId： ");
                LIZ.append(j);
                Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
                c90547ZgF.LJJIZ = String.valueOf(j);
                if (c90547ZgF.LJJIJIIJI) {
                    Logger.d("ByteCastSinkImpl", "requestQRPingInfo ");
                }
                c90547ZgF.LIZLLL(c90547ZgF.LJIJ);
            }
        };
        new QRPinNetWork();
        this.LJJIL = castContext;
        new C90548ZgG(castContext);
        try {
            ICastSink iCastSink = (ICastSink) Class.forName("com.byted.link.sink.impl.BDLinkSinkWrapper").newInstance();
            this.LIZ = iCastSink;
            iCastSink.setPreemptListener(c90850Zl8);
            concurrentHashMap.put("BDLink", iCastSink);
            hashMap.put("BDLink", iCastSink.getMultipleLoader());
            hashMap2.put("BDLink", iCastSink.getMultipleActiveControl());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDLinkSinkWrapper:");
            LIZ.append(iCastSink);
            Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        } catch (Throwable unused) {
        }
        try {
            ICastSink iCastSink2 = (ICastSink) Class.forName("com.byted.dlna.sink.impl.BDDLNASinkWrapper").newInstance();
            this.LIZIZ = iCastSink2;
            iCastSink2.setPreemptListener(this.LJIILIIL);
            ((ConcurrentHashMap) this.LJIIIIZZ).put("BDDLNA", iCastSink2);
            ((HashMap) this.LJIIIZ).put("BDDLNA", iCastSink2.getMultipleLoader());
            ((HashMap) this.LJIIJ).put("BDDLNA", iCastSink2.getMultipleActiveControl());
            Logger.i("ByteCastSinkImpl", "BDDLNASinkWrapper:" + iCastSink2);
        } catch (Throwable unused2) {
        }
        try {
            Class.forName("com.hpplay.sdk.sink.api.LelinkCast");
            ICastSink iCastSink3 = (ICastSink) Class.forName("com.ss.lelink.sink.LelinkSinkWrapper").newInstance();
            this.LJ = iCastSink3;
            iCastSink3.setPreemptListener(this.LJIILIIL);
            ((ConcurrentHashMap) this.LJIIIIZZ).put("LeLink", iCastSink3);
            ((HashMap) this.LJIIIZ).put("LeLink", iCastSink3.getMultipleLoader());
            ((HashMap) this.LJIIJ).put("LeLink", iCastSink3.getMultipleActiveControl());
        } catch (Throwable unused3) {
        }
        try {
            ICastSink iCastSink4 = (ICastSink) Class.forName("com.byted.airplay.BDAirPlaySinkWrapper").newInstance();
            this.LIZJ = iCastSink4;
            iCastSink4.setPreemptListener(this.LJIILIIL);
            ((ConcurrentHashMap) this.LJIIIIZZ).put("BDAirPlay", iCastSink4);
            ((HashMap) this.LJIIIZ).put("BDAirPlay", iCastSink4.getMultipleLoader());
            ((HashMap) this.LJIIJ).put("BDAirPlay", iCastSink4.getMultipleActiveControl());
        } catch (Throwable unused4) {
        }
        try {
            ICastSink iCastSink5 = (ICastSink) Class.forName("com.byted.cast.sink.api.BytelinkSinkWrapper").newInstance();
            this.LIZLLL = iCastSink5;
            iCastSink5.setPreemptListener(this.LJIILIIL);
            ((ConcurrentHashMap) this.LJIIIIZZ).put("ByteLink", iCastSink5);
            Logger.i("ByteCastSinkImpl", "castSinkMap put BYTELINK");
            ((HashMap) this.LJIIIZ).put("ByteLink", iCastSink5.getMultipleLoader());
            ((HashMap) this.LJIIJ).put("ByteLink", iCastSink5.getMultipleActiveControl());
        } catch (Throwable unused5) {
        }
        try {
            ICastSink iCastSink6 = (ICastSink) Class.forName("com.byted.cloud.sink.impl.BDCloudSinkWrapper").newInstance();
            this.LJFF = iCastSink6;
            if (iCastSink6 != null) {
                iCastSink6.addCastIdListener(this.LJJJ);
            }
            iCastSink6.setPreemptListener(this.LJIILIIL);
            ((ConcurrentHashMap) this.LJIIIIZZ).put("BDCloud", iCastSink6);
            ((HashMap) this.LJIIIZ).put("BDCloud", iCastSink6.getMultipleLoader());
            ((HashMap) this.LJIIJ).put("BDCloud", iCastSink6.getMultipleActiveControl());
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            ICastSink iCastSink7 = (ICastSink) Class.forName("com.ss.chromecast.sink.impl.ChromeCastSinkWrapper").newInstance();
            this.LJI = iCastSink7;
            iCastSink7.setPreemptListener(this.LJIILIIL);
            ((ConcurrentHashMap) this.LJIIIIZZ).put("ChromeCast", iCastSink7);
            ((HashMap) this.LJIIIZ).put("ChromeCast", iCastSink7.getMultipleLoader());
            ((HashMap) this.LJIIJ).put("ChromeCast", iCastSink7.getMultipleActiveControl());
        } catch (Throwable th2) {
            th2.getMessage();
        }
        this.LJJIJLIJ = new C90115ZYh(this.LJJIL);
        this.LJII = new ZYI(this.LIZ, this.LIZLLL);
        StringBuilder sb = new StringBuilder("There is ");
        if (this.LIZ != null) {
            sb.append("BDLink ");
        }
        if (this.LIZIZ != null) {
            sb.append("BDDLNA ");
        }
        if (this.LIZLLL != null) {
            sb.append("ByteLink ");
        }
        if (this.LIZJ != null) {
            sb.append("BDAirPlay ");
        }
        if (this.LJ != null) {
            sb.append("LeLink ");
        }
        if (this.LJFF != null) {
            sb.append("BDCloud ");
        }
        if (this.LJI != null) {
            sb.append("ChromeCast ");
        }
        sb.append("in the system.");
        Logger.i("ByteCastSinkImpl", sb.toString());
        this.LJJIIZI = new NetworkBehavior(new C90846Zl4(this), this.LJJIL);
    }

    public final void LIZLLL(Context context) {
        ServiceInfo serviceInfo;
        SinkDeviceInfo sinkDeviceInfo = new SinkDeviceInfo();
        sinkDeviceInfo.name = this.LJIJI.getServiceName();
        sinkDeviceInfo.version = "3.10.2.6.overseas-tt";
        sinkDeviceInfo.deviceId = this.LJIJI.getDeviceId();
        sinkDeviceInfo.appId = this.LJIJI.getAppId();
        sinkDeviceInfo.userId = this.LJIJI.getUserId();
        sinkDeviceInfo.sessionId = TeaEventTrack.getInstance().sessionID;
        sinkDeviceInfo.castId = this.LJJIZ;
        sinkDeviceInfo.isSupportPlayList = true;
        ICastSink iCastSink = this.LIZ;
        if (iCastSink != null && (serviceInfo = iCastSink.getServiceInfo()) != null) {
            int i = serviceInfo.port;
            if (i <= 0) {
                i = 3530;
            }
            sinkDeviceInfo.port = i;
            sinkDeviceInfo.ip = serviceInfo.ip;
        }
        ICastSink iCastSink2 = this.LIZLLL;
        if (iCastSink2 != null) {
            ServiceInfo serviceInfo2 = iCastSink2.getServiceInfo();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("requestQRPingInfo  bytelinkSink.getServiceInfo():");
            LIZ.append(serviceInfo2);
            Logger.d("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
            if (serviceInfo2 != null) {
                int i2 = serviceInfo2.portMirror;
                if (i2 <= 0) {
                    i2 = 3230;
                }
                sinkDeviceInfo.portMirror = i2;
            }
        }
        DeviceInfoManager.getInstance().saveLocalSinkDeviceInfo(context, sinkDeviceInfo);
    }

    public final void LJFF(Config config) {
        String[] split;
        if (config == null) {
            return;
        }
        boolean isEnableDebug = config.isEnableDebug();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Is debug open? ");
        LIZ.append(isEnableDebug);
        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        Constants.isDebugMode = isEnableDebug;
        Logger.setEnable(isEnableDebug);
        this.LJJIIJZLJL = config.getNetAdapter();
        this.LJJIIZ = config.getMonitor();
        String localProtocols = config.getLocalProtocols();
        if (!TextUtils.isEmpty(localProtocols)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parseProtocols: ");
            LIZ2.append(localProtocols);
            Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ2));
            if (this.LJIILL == null) {
                this.LJIILL = new ArrayList();
            }
            ((ArrayList) this.LJIILL).clear();
            if (!TextUtils.isEmpty(localProtocols) && (split = localProtocols.split(",")) != null && split.length >= 1) {
                ((ArrayList) this.LJIILL).addAll(Arrays.asList(split));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("parseProtocols: protocols: ");
                LIZ3.append(this.LJIILL);
                Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ3));
            }
        }
        if (!config.isInitialModeBind()) {
            ILogger logger = config.getLogger();
            if (logger != null) {
                Logger.setLogger(logger);
            }
            IAppCommonDataListener commonDataListener = config.getCommonDataListener();
            if (commonDataListener != null) {
                Monitor.setAppCommonDataListener(commonDataListener);
                TeaEventTrack.getInstance().setAppCommonDataListener(commonDataListener);
            }
            if (!this.LJJ && config.getBindSdkInfoListeners() != null && config.getBindSdkInfoListeners().size() > 0) {
                for (IBindSdkInfoListener iBindSdkInfoListener : config.getBindSdkInfoListeners()) {
                    if (iBindSdkInfoListener != null) {
                        ((ArrayList) this.LJJI).add(new C90852ZlA(iBindSdkInfoListener));
                    }
                }
                this.LJJ = true;
            }
        }
    }

    public final void LIZ(Config config, IInitListener iInitListener) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("authByLicense: projectId: ");
        LIZ.append(config.getProjectId());
        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(config.getProjectId())) {
            iInitListener.onFail(10019, "ERROR_EMPTY_PROJECT_ID", null);
            return;
        }
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new AuthWrapper(null);
        }
        this.LJIILJJIL.init(config.getProjectId());
        this.LJIILJJIL.verifyLicense(config.getLicensePath(), new C90849Zl7(this, iInitListener));
        ConfigManager.getInstance().fetchConfig(LIZJ(), null);
    }

    public final void LJIIIIZZ(Context context, Config config) {
        ZYI zyi = this.LJII;
        ZWQ zwq = zyi.LIZ;
        if (zwq != null) {
            zwq.LIZIZ = context;
            if (config != null) {
                zwq.LJ = config.isEnableDebug();
                String privateChannel = config.getPrivateChannel();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setPrivateChannel, privateChannel:");
                LIZ.append(privateChannel);
                Logger.i("NsdServer", X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(privateChannel)) {
                    zwq.LIZJ = C16880lQ.LLLZ("_%s._tcp.", new Object[]{privateChannel});
                }
            }
        }
        C90555ZgN c90555ZgN = zyi.LIZIZ;
        if (c90555ZgN != null) {
            c90555ZgN.LJII = context;
            c90555ZgN.LJIIIZ = new CopyOnWriteArrayList();
            c90555ZgN.LIZ = UUID.randomUUID();
            c90555ZgN.LJIIL = "";
            c90555ZgN.LJIILIIL = false;
            c90555ZgN.LJIILJJIL = new C90553ZgL(c90555ZgN);
            c90555ZgN.LJIILL = new C90554ZgM();
        }
        C90421ZeD c90421ZeD = zyi.LIZJ;
        c90421ZeD.getClass();
        String privateChannel2 = config.getPrivateChannel();
        ICastSink iCastSink = c90421ZeD.LIZ;
        if (iCastSink != null) {
            iCastSink.setSsdpPrivateChannel(privateChannel2);
        }
        synchronized (this.LJJIII) {
            this.LJJII = new ConcurrentSubject<>();
        }
    }

    public final void LJIIJ(Context context, IInitListener iInitListener) {
        Logger.i("ByteCastSinkImpl", "setAuthByLocalOption");
        LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set protocols by local protocols: ");
        LIZ.append(this.LJIILL);
        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pkg:");
        LIZ2.append(context.getPackageName());
        LIZ2.append(",protocols:");
        LIZ2.append(this.LJIILL);
        Monitor.sendSinkEvent("ByteCast_SINK_Auth_LOCAL", X1D.LIZIZ(LIZ2));
        this.LJJIJIIJI = true;
        ConfigManager.getInstance().fetchConfig(LIZJ(), new C90848Zl6(this, iInitListener));
    }

    public final void LJIIIZ(String str, String str2, String str3) {
        CastInfo castInfo = (CastInfo) ((HashMap) this.LJIIJJI).get(str);
        if (castInfo != null) {
            Monitor.sendByteCastSinkEvent(str2, str3, castInfo.connectID, castInfo.toString());
        }
    }

    public final synchronized void LJII(Context context, Config config, IInitListener iInitListener, boolean z) {
        IInitListener iInitListener2 = null;
        if (config == null) {
            iInitListener.onFail(10011, "ERROR_EMPTY_CONFIG", null);
            return;
        }
        Constants.attachAppContext(context);
        LogDumper.init(context, "ByteCast");
        ConfigManager.getInstance().init(config);
        LJFF(config);
        if (TextUtils.equals(this.LJJIJIL, "1") && this.LJJIJIIJIL == null) {
            ScheduledExecutorService LLLLZIL = C16880lQ.LLLLZIL(1);
            this.LJJIJIIJIL = LLLLZIL;
            LLLLZIL.scheduleAtFixedRate(new Runnable() { // from class: X.ZgD
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Current process fds info:");
                    LIZ.append(CrashUtil.getFds());
                    Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
                }
            }, 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        this.LJIJI = config;
        new QRPinNetWork(config.getNetAdapter());
        Logger.i("ByteCastSinkImpl", "init, sinkVersion3.10.2.6.overseas-tt");
        Monitor.initSessionID(config.getDeviceId(), config.getAppId(), config.getProjectId(), "sink");
        Monitor.getInst(context, config.getDeviceId(), config.getMonitor());
        ContextManager.getMonitor(null).initSessionID(config.getDeviceId(), config.getAppId(), config.getProjectId(), "sink");
        ContextManager.getMonitor(null).init(context, config.getDeviceId(), config.getMonitor());
        TeaEventTrack.getInstance().initSessionID(config.getProjectId());
        LJIIIIZZ(context, config);
        this.LJIJ = context;
        Monitor.sendByteCastAuthEvent(config.isInitialModeBind(), "start", -1);
        TeaEventTrack.getInstance().trackSinkEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_AUTH, new C90546ZgE(config));
        if (this.LJJIIZI != null) {
            NetworkBehaviorData networkBehaviorData = this.LJJIJ;
            if (networkBehaviorData != null) {
                iInitListener2 = networkBehaviorData.getListener();
            }
            if (!z || iInitListener2 == null) {
                iInitListener2 = iInitListener;
            }
            NetworkBehaviorData networkBehaviorData2 = new NetworkBehaviorData(context, config, iInitListener2);
            this.LJJIJ = networkBehaviorData2;
            this.LJJIIZI.initNetworkChangeReceiver(networkBehaviorData2);
        }
        ICastSink iCastSink = this.LIZ;
        if (iCastSink != null) {
            iCastSink.init(context, config, iInitListener);
        }
        ICastSink iCastSink2 = this.LIZJ;
        if (iCastSink2 != null) {
            iCastSink2.init(context, config, iInitListener);
        }
        ICastSink iCastSink3 = this.LIZIZ;
        if (iCastSink3 != null) {
            iCastSink3.init(context, config, iInitListener);
        }
        ICastSink iCastSink4 = this.LIZLLL;
        if (iCastSink4 != null) {
            iCastSink4.init(context, config, iInitListener);
        }
        if (this.LJ != null && !TextUtils.isEmpty(config.getLelinkAppId()) && !TextUtils.isEmpty(config.getLelinkAppSecret())) {
            this.LJ.init(context, config, iInitListener);
        }
        ICastSink iCastSink5 = this.LJFF;
        if (iCastSink5 != null) {
            iCastSink5.init(context, config, iInitListener);
        }
        ICastSink iCastSink6 = this.LJI;
        if (iCastSink6 != null) {
            iCastSink6.init(context, config, iInitListener);
        }
        C90115ZYh c90115ZYh = this.LJJIJLIJ;
        if (c90115ZYh != null) {
            o.LJIIJ(context, "context");
            Logger.i("CastRelay", "init");
            ICastSource iCastSource = c90115ZYh.LIZ;
            if (iCastSource != null) {
                iCastSource.init(context, config, iInitListener);
            }
        }
        ((ConcurrentHashMap) this.LJIIIIZZ).clear();
        if (config.isInitialModeBind()) {
            Logger.i("ByteCastSinkImpl", "local verify");
            LJIIJ(context, iInitListener);
        } else {
            Logger.i("ByteCastSinkImpl", "license verify");
            LIZ(config, iInitListener);
        }
        LJ();
    }
}
