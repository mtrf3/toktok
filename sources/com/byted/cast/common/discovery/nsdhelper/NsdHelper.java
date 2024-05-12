package com.byted.cast.common.discovery.nsdhelper;

import X.C16880lQ;
import X.C90147ZZn;
import X.X1D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Constants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.StringUtil;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.discovery.BuriPointInfo;
import com.byted.cast.common.discovery.DiscoveryTimer;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;
import com.byted.cast.common.discovery.nsdhelper.NsdHelper;
import com.byted.cast.common.threadpool.CastThreadExecutorsUtils;
import com.byted.cast.common.threadpool.CastThreadFactory;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class NsdHelper implements INsdHelper, DiscoveryTimer.OnTimeoutListener {
    public static NsdManager mNsdManager;
    public static WifiManager.MulticastLock wifiLock;
    public final ContextManager.CastContext mCastContext;
    public Config mConfig;
    public Handler mHandler;
    public String mLinkName;
    public CastLogger mLogger;
    public CastMonitor mMonitor;
    public NsdListener mNsdListener;
    public TeaEventTrack mTeaEventTrack;
    public static final ExecutorService sExecutor = CastThreadExecutorsUtils.newSingleThreadExecutor(new CastThreadFactory("NsdHelper"));
    public static final Object mLock = new Object();
    public static boolean bLocked = false;
    public static final Object sMultiCastAcquireLock = new Object();
    public final Object mServiceLock = new Object();
    public long mDiscoveryTimeout = 15;
    public final Object mDiscoveryLock = new Object();
    public Map<String, BuriPointInfo> mBuriPointInfos = new ConcurrentHashMap();
    public Map<String, NsdListenerRegistration> mRegistrationListeners = new ConcurrentHashMap();
    public Map<String, NsdListenerDiscovery> mDiscoveryListeners = new ConcurrentHashMap();
    public Map<String, NsdListenerResolve> mResolveListeners = new ConcurrentHashMap();
    public boolean mLogEnabled = false;
    public DiscoveryTimer mDiscoveryTimer = new DiscoveryTimer(this, this.mDiscoveryTimeout);

    @Override // com.byted.cast.common.discovery.INsdHelper
    public int getNsdHelperType() {
        return 1;
    }

    @Override // com.byted.cast.common.discovery.DiscoveryTimer.OnTimeoutListener
    public void onNsdDiscoveryTimeout() {
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public final /* synthetic */ void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        C90147ZZn.LIZ(this, iLibraryLoader);
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void setNsdListener(NsdListener nsdListener) {
    }

    public void finalize() {
        Object obj = mLock;
        synchronized (obj) {
            obj.notify();
        }
        super.finalize();
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public boolean isLogEnabled() {
        return this.mLogEnabled;
    }

    /* loaded from: classes29.dex */
    public class NsdHandler extends Handler {
        public WeakReference<NsdHelper> mNsdHelper;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.mNsdHelper.get() == null) {
            }
        }

        public NsdHandler(WeakReference<NsdHelper> weakReference, Looper looper) {
            super(looper);
            this.mNsdHelper = weakReference;
        }
    }

    private void ensureNsdManagerInitialized(NsdListener nsdListener) {
        boolean z;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ensureNsdManagerInitialized: mNsdManager is null: ");
        if (mNsdManager == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        castLogger.i("NsdHelper", X1D.LIZIZ(LIZ));
        if (mNsdManager == null) {
            try {
                mNsdManager = (NsdManager) C16880lQ.LLILL(Constants.sAppContext, "servicediscovery");
            } catch (Exception e) {
                e.printStackTrace();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("NsdManager: getSystemService error: ");
                LIZ2.append(e.getMessage());
                onError(nsdListener, 272145, X1D.LIZIZ(LIZ2));
            }
        }
    }

    private void handleBuriPointInfo(NsdServiceInfo nsdServiceInfo) {
        String nsdService = new NsdService(nsdServiceInfo, this.mConfig).toString();
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNsdServiceResolved:");
        LIZ.append(nsdService);
        LIZ.append(", buri size:");
        LIZ.append(this.mBuriPointInfos.size());
        castLogger.d("NsdHelper", X1D.LIZIZ(LIZ));
        String serviceType = nsdServiceInfo.getServiceType();
        if (!serviceType.endsWith(".")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(serviceType);
            LIZ2.append(".");
            serviceType = X1D.LIZIZ(LIZ2);
        }
        if (serviceType.startsWith(".")) {
            serviceType = serviceType.substring(1);
        }
        for (Map.Entry<String, BuriPointInfo> entry : this.mBuriPointInfos.entrySet()) {
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onNsdServiceResolved, key:");
            LIZ3.append(entry.getKey());
            LIZ3.append(", value:");
            LIZ3.append(entry.getValue());
            castLogger2.d("NsdHelper", X1D.LIZIZ(LIZ3));
        }
        BuriPointInfo buriPointInfo = this.mBuriPointInfos.get(serviceType);
        CastLogger castLogger3 = this.mLogger;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("onNsdServiceResolved, buriPointInfo:");
        LIZ4.append(buriPointInfo);
        LIZ4.append(", serviceType:");
        LIZ4.append(serviceType);
        castLogger3.i("NsdHelper", X1D.LIZIZ(LIZ4));
        if (buriPointInfo != null && buriPointInfo.browseStarted && !buriPointInfo.resultFound) {
            buriPointInfo.resultFound = true;
            this.mLogger.d("NsdHelper", "sendCustomEvent, onNsdServiceResolved");
            try {
                this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Resolved", nsdService);
            } catch (Exception unused) {
            }
            try {
                this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Resolved_Ext", nsdService);
            } catch (Exception unused2) {
            }
            this.mLogger.d("NsdHelper", "already found one, send NSD_SERVICE_RESOLVED_EXT");
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void setDiscoveryTimeout(int i) {
        if (i >= 0) {
            if (i == 0) {
                this.mDiscoveryTimeout = 2147483647L;
            } else {
                this.mDiscoveryTimeout = i;
            }
            DiscoveryTimer discoveryTimer = this.mDiscoveryTimer;
            if (discoveryTimer != null) {
                discoveryTimer.timeout(this.mDiscoveryTimeout);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Timeout has to be greater or equal 0!");
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void setLogEnabled(boolean z) {
        this.mLogEnabled = z;
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void stopDiscovery(final String str) {
        final NsdListenerDiscovery nsdListenerDiscovery = this.mDiscoveryListeners.get(str);
        if (nsdListenerDiscovery == null) {
            this.mLogger.w("NsdHelper", "stopDiscovery, disListener is null");
            return;
        }
        this.mDiscoveryTimer.cancel();
        String str2 = nsdListenerDiscovery.mServiceType;
        BuriPointInfo buriPointInfo = this.mBuriPointInfos.get(str2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopDiscovery, buriInfo:");
        LIZ.append(buriPointInfo);
        castLogger.i("NsdHelper", X1D.LIZIZ(LIZ));
        this.mBuriPointInfos.remove(str2);
        try {
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Stop_Discovery", str2);
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsStopDiscovery("start", "nsdmanager", "", "");
            }
        } catch (Exception unused) {
        }
        sExecutor.submit(new Runnable() { // from class: X.ZZo
            @Override // java.lang.Runnable
            public final void run() {
                NsdHelper.this.lambda$stopDiscovery$3(nsdListenerDiscovery, str);
            }
        });
        synchronized (sMultiCastAcquireLock) {
            WifiManager.MulticastLock multicastLock = wifiLock;
            if (multicastLock != null && bLocked) {
                try {
                    bLocked = false;
                    multicastLock.release();
                } catch (Exception e) {
                    e.printStackTrace();
                    NsdListener nsdListener = nsdListenerDiscovery.mClientListener;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("release wifi lock error: stopDiscovery: ");
                    LIZ2.append(e.getMessage());
                    onError(nsdListener, 272150, X1D.LIZIZ(LIZ2));
                }
            }
        }
        Object obj = mLock;
        synchronized (obj) {
            obj.notify();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void unregisterService(final String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unregisterService, listenerId:");
        LIZ.append(str);
        castLogger.i("NsdHelper", X1D.LIZIZ(LIZ));
        trackMdnsUnregisterEvent("start", "", "");
        try {
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Unregister_Service", str);
        } catch (Exception unused) {
        }
        final NsdListenerRegistration nsdListenerRegistration = this.mRegistrationListeners.get(str);
        if (nsdListenerRegistration != null) {
            sExecutor.submit(new Runnable() { // from class: X.ZZs
                @Override // java.lang.Runnable
                public final void run() {
                    NsdHelper.this.lambda$unregisterService$1(nsdListenerRegistration, str);
                }
            });
        }
        synchronized (sMultiCastAcquireLock) {
            WifiManager.MulticastLock multicastLock = wifiLock;
            if (multicastLock != null && bLocked) {
                try {
                    multicastLock.release();
                    bLocked = false;
                } catch (Throwable th) {
                    if (nsdListenerRegistration != null) {
                        NsdListener nsdListener = nsdListenerRegistration.mClientListener;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("release wifi lock error: unregister service: ");
                        LIZ2.append(th.getMessage());
                        onError(nsdListener, 272148, X1D.LIZIZ(LIZ2));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopDiscovery$3(NsdListenerDiscovery nsdListenerDiscovery, String str) {
        synchronized (this.mDiscoveryLock) {
            try {
                mNsdManager.stopServiceDiscovery(nsdListenerDiscovery);
            } catch (IllegalArgumentException e) {
                CastLogger castLogger = this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stopDiscovery error:");
                LIZ.append(e);
                castLogger.w("NsdHelper", X1D.LIZIZ(LIZ));
            }
            NsdListener nsdListener = nsdListenerDiscovery.mClientListener;
            if (nsdListener != null) {
                nsdListener.onNsdDiscoveryFinished();
            }
            this.mDiscoveryListeners.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unregisterService$1(NsdListenerRegistration nsdListenerRegistration, String str) {
        try {
            synchronized (this.mServiceLock) {
                NsdManager nsdManager = mNsdManager;
                if (nsdManager != null) {
                    nsdManager.unregisterService(nsdListenerRegistration);
                }
            }
        } catch (Exception e) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unregisterService:");
            LIZ.append(e);
            castLogger.w("NsdHelper", X1D.LIZIZ(LIZ));
            trackMdnsUnregisterEvent("failure", String.valueOf(1), e.toString());
        }
        this.mRegistrationListeners.remove(str);
    }

    public void onNsdServiceFound(NsdServiceInfo nsdServiceInfo, String str) {
        NsdListener nsdListener;
        DiscoveryTimer discoveryTimer = this.mDiscoveryTimer;
        if (discoveryTimer != null) {
            discoveryTimer.reset();
        }
        NsdListenerDiscovery nsdListenerDiscovery = this.mDiscoveryListeners.get(str);
        if (nsdListenerDiscovery != null && (nsdListener = nsdListenerDiscovery.mClientListener) != null) {
            nsdListener.onNsdServiceFound(new NsdService(nsdServiceInfo, this.mConfig));
            handleFoundService(nsdServiceInfo, nsdListener, str, false);
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void stopDiscovery(ContextManager.CastContext castContext, String str) {
        stopDiscovery(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNsdResolveFailed$5(NsdServiceInfo nsdServiceInfo, NsdListenerResolve nsdListenerResolve, String str) {
        handleFoundService(nsdServiceInfo, nsdListenerResolve.mClientListener, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerService$0(NsdListener nsdListener, NsdServiceInfo nsdServiceInfo, NsdListenerRegistration nsdListenerRegistration) {
        synchronized (this.mServiceLock) {
            ensureNsdManagerInitialized(nsdListener);
            NsdManager nsdManager = mNsdManager;
            if (nsdManager != null) {
                nsdManager.registerService(nsdServiceInfo, 1, nsdListenerRegistration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDiscovery$2(NsdListener nsdListener, String str, NsdListenerDiscovery nsdListenerDiscovery) {
        synchronized (this.mDiscoveryLock) {
            ensureNsdManagerInitialized(nsdListener);
            NsdManager nsdManager = mNsdManager;
            if (nsdManager != null) {
                nsdManager.discoverServices(str, 1, nsdListenerDiscovery);
            }
        }
    }

    private void onError(NsdListener nsdListener, int i, String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errorCode:");
        LIZ.append(i);
        LIZ.append(", errorMsg:");
        LIZ.append(str);
        castLogger.e("NsdHelper", X1D.LIZIZ(LIZ));
        if (nsdListener != null) {
            nsdListener.onNsdError(str, i, "NsdHelper");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str);
            jSONObject.put("serviceInfo", "");
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_onError", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private void trackMdnsRegisterEvent(String str, String str2, String str3) {
        TeaEventTrack teaEventTrack = this.mTeaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.trackMdnsRegisterEvent(str, "nsdmanager", str2, str3);
        }
    }

    private void trackMdnsUnregisterEvent(String str, String str2, String str3) {
        TeaEventTrack teaEventTrack = this.mTeaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.trackMdnsUnregisterEvent(str, "nsdmanager", str2, str3);
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public String startDiscovery(final String str, String str2, final NsdListener nsdListener) {
        try {
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Start_Discovery", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s", new Object[]{str2, str}));
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsDiscovery("start", "nsdmanager", "", "");
            }
        } catch (Exception unused) {
        }
        this.mBuriPointInfos.put(str, new BuriPointInfo(str, true, false));
        this.mLogger.i("NsdHelper", "startDiscovery, type:" + str + ", name:" + str2 + ", buri size:" + this.mBuriPointInfos.size());
        this.mDiscoveryTimer.start();
        synchronized (sMultiCastAcquireLock) {
            WifiManager.MulticastLock multicastLock = wifiLock;
            if (multicastLock != null && !bLocked) {
                try {
                    multicastLock.acquire();
                    bLocked = true;
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("acquire wifi lock error: startDiscovery: ");
                    LIZ.append(th.getMessage());
                    onError(nsdListener, 272149, X1D.LIZIZ(LIZ));
                    TeaEventTrack teaEventTrack2 = this.mTeaEventTrack;
                    if (teaEventTrack2 != null) {
                        teaEventTrack2.trackMdnsDiscovery("failure", "nsdmanager", String.valueOf(1), "");
                    }
                    return null;
                }
            }
        }
        final NsdListenerDiscovery nsdListenerDiscovery = new NsdListenerDiscovery(this.mCastContext, this, nsdListener, str);
        this.mDiscoveryListeners.put(nsdListenerDiscovery.mListenerId, nsdListenerDiscovery);
        sExecutor.submit(new Runnable() { // from class: X.ZZq
            @Override // java.lang.Runnable
            public final void run() {
                NsdHelper.this.lambda$startDiscovery$2(nsdListener, str, nsdListenerDiscovery);
            }
        });
        return nsdListenerDiscovery.mListenerId;
    }

    public NsdHelper(Context context, ContextManager.CastContext castContext, NsdListener nsdListener, String str) {
        this.mLinkName = "";
        this.mNsdListener = nsdListener;
        this.mCastContext = castContext;
        this.mMonitor = ContextManager.getMonitor(castContext);
        this.mLogger = ContextManager.getLogger(castContext);
        this.mTeaEventTrack = ContextManager.getTeaEventTrack(castContext);
        this.mConfig = ContextManager.getConfigManager(castContext).getInitConfig();
        if (this.mHandler == null) {
            this.mHandler = new NsdHandler(new WeakReference(this), Dispatcher.getInstance().getByteCastThreadLooper());
        }
        synchronized (sMultiCastAcquireLock) {
            try {
                String[] strArr = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (!"android.permission.CHANGE_WIFI_MULTICAST_STATE".equals(strArr[i])) {
                            i++;
                        } else if (wifiLock == null) {
                            WifiManager.MulticastLock createMulticastLock = ((WifiManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "wifi")).createMulticastLock("localWifi");
                            wifiLock = createMulticastLock;
                            createMulticastLock.setReferenceCounted(true);
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("get multicast lock failed:");
                LIZ.append(e.getMessage());
                onError(nsdListener, 272151, X1D.LIZIZ(LIZ));
            }
        }
        if (mNsdManager == null) {
            mNsdManager = (NsdManager) C16880lQ.LLILL(context, "servicediscovery");
        }
        this.mLinkName = str;
    }

    public static NsdHelper createInstance(Context context, ContextManager.CastContext castContext, NsdListener nsdListener, String str) {
        return new NsdHelper(context, castContext, nsdListener, str);
    }

    private void handleFoundService(final NsdServiceInfo nsdServiceInfo, final NsdListener nsdListener, final String str, final boolean z) {
        sExecutor.submit(new Runnable() { // from class: X.ZZr
            @Override // java.lang.Runnable
            public final void run() {
                NsdHelper.this.lambda$handleFoundService$4(nsdServiceInfo, z, nsdListener, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleFoundService$4(NsdServiceInfo nsdServiceInfo, boolean z, NsdListener nsdListener, String str) {
        try {
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Start_Resolve", nsdServiceInfo.toString());
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsResolve("start", "nsdmanager", "", "", z);
            }
        } catch (Exception unused) {
        }
        Object obj = mLock;
        synchronized (obj) {
            NsdListenerResolve nsdListenerResolve = new NsdListenerResolve(this.mCastContext, this, nsdListener, str, z);
            this.mResolveListeners.put(nsdListenerResolve.mListenerId, nsdListenerResolve);
            NsdManager nsdManager = mNsdManager;
            if (nsdManager != null) {
                nsdManager.resolveService(nsdServiceInfo, nsdListenerResolve);
            }
            try {
                obj.wait(1000L);
            } catch (InterruptedException unused2) {
                C16880lQ.LLLLIIIILLL().interrupt();
            }
        }
        this.mLogger.i("NsdHelper", "finished resolving service name:" + nsdServiceInfo.getServiceName() + ", type:" + nsdServiceInfo.getServiceType() + ", port:" + nsdServiceInfo.getPort() + "...");
    }

    public void onNsdServiceResolved(NsdServiceInfo nsdServiceInfo, String str, String str2, boolean z) {
        Object obj = mLock;
        synchronized (obj) {
            obj.notify();
        }
        NsdListenerResolve nsdListenerResolve = this.mResolveListeners.get(str);
        if (nsdListenerResolve == null) {
            this.mLogger.w("NsdHelper", "onNsdServiceResolved, resolveListener is null");
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsResolve("failure", "nsdmanager", String.valueOf(2), "", z);
                return;
            }
            return;
        }
        NsdListenerDiscovery nsdListenerDiscovery = this.mDiscoveryListeners.get(str2);
        if (nsdListenerDiscovery != null) {
            nsdListenerDiscovery.mResolvedCount = 0;
        }
        handleBuriPointInfo(nsdServiceInfo);
        DiscoveryTimer discoveryTimer = this.mDiscoveryTimer;
        if (discoveryTimer != null) {
            discoveryTimer.reset();
        }
        NsdListener nsdListener = nsdListenerResolve.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdServiceResolved(new NsdService(nsdServiceInfo, this.mConfig));
            TeaEventTrack teaEventTrack2 = this.mTeaEventTrack;
            if (teaEventTrack2 != null) {
                teaEventTrack2.trackMdnsResolve("success", "nsdmanager", "", "", z);
            }
        } else {
            TeaEventTrack teaEventTrack3 = this.mTeaEventTrack;
            if (teaEventTrack3 != null) {
                teaEventTrack3.trackMdnsResolve("failure", "nsdmanager", String.valueOf(3), "", z);
            }
        }
        this.mResolveListeners.remove(str);
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public String startDiscovery(ContextManager.CastContext castContext, String str, String str2, NsdListener nsdListener) {
        return startDiscovery(str, str2, nsdListener);
    }

    public void onNsdResolveFailed(final NsdServiceInfo nsdServiceInfo, String str, final String str2, int i, boolean z) {
        Object obj = mLock;
        synchronized (obj) {
            obj.notify();
        }
        final NsdListenerResolve nsdListenerResolve = this.mResolveListeners.get(str);
        if (nsdListenerResolve == null) {
            this.mLogger.w("NsdHelper", "onNsdResolveFailed, resolveListener is null");
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsResolve("failure", "nsdmanager", String.valueOf(2), String.valueOf(i), z);
                return;
            }
            return;
        }
        NsdListenerDiscovery nsdListenerDiscovery = this.mDiscoveryListeners.get(str2);
        if (nsdListenerDiscovery != null) {
            int i2 = nsdListenerDiscovery.mResolvedCount + 1;
            nsdListenerDiscovery.mResolvedCount = i2;
            if (i2 > 4) {
                nsdListenerDiscovery.mResolvedCount = 0;
                this.mResolveListeners.remove(str);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorCode", i);
                    jSONObject.put("serviceInfo", nsdServiceInfo);
                    this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Resolve_Failure", jSONObject.toString());
                    TeaEventTrack teaEventTrack2 = this.mTeaEventTrack;
                    if (teaEventTrack2 != null) {
                        teaEventTrack2.trackMdnsResolve("failure", "nsdmanager", String.valueOf(1), String.valueOf(i), z);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.mResolveListeners.remove(str);
            this.mHandler.postDelayed(new Runnable() { // from class: X.ZZp
                @Override // java.lang.Runnable
                public final void run() {
                    NsdHelper.this.lambda$onNsdResolveFailed$5(nsdServiceInfo, nsdListenerResolve, str2);
                }
            }, 200L);
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public String registerService(String str, String str2, int i, Map<String, String> map, final NsdListener nsdListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerService, serviceType:");
        LIZ.append(str2);
        LIZ.append(", attrs:");
        LIZ.append(StringUtil.transMapToString(map));
        castLogger.i("NsdHelper", X1D.LIZIZ(LIZ));
        trackMdnsRegisterEvent("start", "", "");
        if (TextUtils.isEmpty(str)) {
            onError(nsdListener, 272146, "service name cannot empty");
            trackMdnsRegisterEvent("failure", String.valueOf(1), "");
            return null;
        }
        try {
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Register_Service", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s, port:%d, attrs:%s", new Object[]{str, str2, Integer.valueOf(i), StringUtil.transMapToString(map)}));
        } catch (Exception unused) {
        }
        synchronized (sMultiCastAcquireLock) {
            WifiManager.MulticastLock multicastLock = wifiLock;
            if (multicastLock != null && !bLocked) {
                try {
                    multicastLock.acquire();
                    bLocked = true;
                } catch (Throwable th) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("acquire wifi lock error: register service: ");
                    LIZ2.append(th.getMessage());
                    onError(nsdListener, 272147, X1D.LIZIZ(LIZ2));
                    trackMdnsRegisterEvent("failure", String.valueOf(2), "");
                    return null;
                }
            }
        }
        final NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(str);
        nsdServiceInfo.setServiceType(str2);
        nsdServiceInfo.setPort(i);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            nsdServiceInfo.setAttribute(entry.getKey(), entry.getValue());
        }
        final NsdListenerRegistration nsdListenerRegistration = new NsdListenerRegistration(this, nsdListener, this.mTeaEventTrack);
        this.mRegistrationListeners.put(nsdListenerRegistration.mListenerId, nsdListenerRegistration);
        CastLogger castLogger2 = this.mLogger;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("registerService, regInfo:");
        LIZ3.append(new NsdService(nsdServiceInfo, this.mConfig));
        castLogger2.i("NsdHelper", X1D.LIZIZ(LIZ3));
        sExecutor.submit(new Runnable() { // from class: X.ZZt
            @Override // java.lang.Runnable
            public final void run() {
                NsdHelper.this.lambda$registerService$0(nsdListener, nsdServiceInfo, nsdListenerRegistration);
            }
        });
        return nsdListenerRegistration.mListenerId;
    }
}
