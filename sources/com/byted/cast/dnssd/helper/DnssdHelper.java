package com.byted.cast.dnssd.helper;

import X.C16880lQ;
import X.C63832P3k;
import X.X1D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Log;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.StringUtil;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.Utils;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.discovery.BuriPointInfo;
import com.byted.cast.common.discovery.DiscoveryTimer;
import com.byted.cast.common.discovery.IDnssdLogger;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;
import com.byted.cast.dnssd.BonjourService;
import com.byted.cast.dnssd.BrowseListener;
import com.byted.cast.dnssd.DNSSD;
import com.byted.cast.dnssd.DNSSDBindable;
import com.byted.cast.dnssd.DNSSDEmbedded;
import com.byted.cast.dnssd.DNSSDException;
import com.byted.cast.dnssd.DNSSDRegistration;
import com.byted.cast.dnssd.DNSSDService;
import com.byted.cast.dnssd.Logger;
import com.byted.cast.dnssd.QueryListener;
import com.byted.cast.dnssd.RegisterListener;
import com.byted.cast.dnssd.ResolveListener;
import com.byted.cast.dnssd.TXTRecord;
import com.byted.cast.dnssd.helper.DnssdHelper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class DnssdHelper implements INsdHelper, DiscoveryTimer.OnTimeoutListener {
    public static final ExecutorService mExecutor = C16880lQ.LLLLZLLIL();
    public CastLogger mCastLogger;
    public CastMonitor mCastMonitor;
    public Context mContext;
    public DiscoveryTimer mDiscoveryTimer;
    public DNSSD mDnssd;
    public String mLinkName;
    public NsdListener mListener;
    public boolean mLogEnabled;
    public TeaEventTrack mTeaEventTrack;
    public DNSSDService queryService;
    public long mDiscoveryTimeout = 15;
    public Map<String, MyDnssdService> mBrowseInfos = new ConcurrentHashMap();
    public Map<String, MyDnssdService> mRegisterInfos = new ConcurrentHashMap();
    public Map<String, BuriPointInfo> mBuriPointInfos = new ConcurrentHashMap();
    public volatile WifiManager.MulticastLock multicastLock = null;
    public boolean mMulticastLockAcquired = false;

    @Override // com.byted.cast.common.discovery.INsdHelper
    public int getNsdHelperType() {
        return 2;
    }

    @Override // com.byted.cast.common.discovery.DiscoveryTimer.OnTimeoutListener
    public void onNsdDiscoveryTimeout() {
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void setLibraryLoader(ILibraryLoader iLibraryLoader) {
    }

    /* loaded from: classes29.dex */
    public class MyDnssdService {
        public Map<String, String> attrs;
        public DNSSDService dnssdService;
        public String domain = "";
        public NsdListener listener;
        public int port;
        public String serviceName;
        public String serviceType;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MyDnssdService{dnssdService=");
            LIZ.append(this.dnssdService);
            LIZ.append(", serviceType='");
            LIZ.append(this.serviceType);
            LIZ.append('\'');
            LIZ.append(", serviceName='");
            LIZ.append(this.serviceName);
            LIZ.append('\'');
            LIZ.append(", domain='");
            LIZ.append(this.domain);
            LIZ.append('\'');
            LIZ.append(", listener=");
            LIZ.append(this.listener);
            LIZ.append(", port=");
            LIZ.append(this.port);
            LIZ.append(", attrs=");
            LIZ.append(this.attrs);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public MyDnssdService(DNSSDService dNSSDService, String str, String str2, NsdListener nsdListener, int i, Map<String, String> map) {
            this.dnssdService = dNSSDService;
            this.serviceType = str;
            this.serviceName = str2;
            this.listener = nsdListener;
            this.port = i;
            this.attrs = map;
        }
    }

    private void acquireMulticastLock(NsdListener nsdListener) {
        if (!this.mMulticastLockAcquired && this.multicastLock != null) {
            this.mCastLogger.i("DnssdHelper", "acquireMulticastLock");
            this.mMulticastLockAcquired = true;
            try {
                this.multicastLock.acquire();
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("acquire multicast lock failed:");
                LIZ.append(th.getMessage());
                onError(nsdListener, 272152, X1D.LIZIZ(LIZ));
            }
        }
    }

    private void initMultiWifiLock(NsdListener nsdListener) {
        try {
            for (String str : C16880lQ.LLLLLLZ(this.mContext.getPackageManager(), this.mContext.getPackageName(), 4096).requestedPermissions) {
                if ("android.permission.CHANGE_WIFI_MULTICAST_STATE".equals(str)) {
                    if (this.multicastLock == null) {
                        synchronized (this) {
                            if (this.multicastLock == null) {
                                WifiManager wifiManager = (WifiManager) C16880lQ.LLILL(C16880lQ.LLLLL(this.mContext), "wifi");
                                if (wifiManager == null) {
                                    this.mCastLogger.w("DnssdHelper", "Can't get WIFI Service");
                                    onError(nsdListener, 272155, "Can't get WIFI Service");
                                    return;
                                }
                                this.multicastLock = wifiManager.createMulticastLock("DnssdHelper");
                                this.multicastLock.setReferenceCounted(true);
                                CastLogger castLogger = this.mCastLogger;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("initMultiWifiLock:");
                                LIZ.append(this.multicastLock);
                                castLogger.i("DnssdHelper", X1D.LIZIZ(LIZ));
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("check multicast permissions failed:");
            LIZ2.append(e.getMessage());
            onError(nsdListener, 272151, X1D.LIZIZ(LIZ2));
        }
        onError(nsdListener, 272154, "get multicast permission failed!");
    }

    private void releaseMulticastLock(NsdListener nsdListener) {
        if (this.mMulticastLockAcquired && this.multicastLock != null) {
            this.mCastLogger.i("DnssdHelper", "releaseMulticastLock");
            try {
                this.multicastLock.release();
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("multicastLock may be already released:");
                LIZ.append(th.getMessage());
                onError(nsdListener, 272153, X1D.LIZIZ(LIZ));
            }
            this.mMulticastLockAcquired = false;
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
            this.mDiscoveryTimer.timeout(this.mDiscoveryTimeout);
            return;
        }
        throw new IllegalArgumentException("Timeout has to be greater or equal 0!");
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void setLogEnabled(boolean z) {
        this.mLogEnabled = z;
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void setNsdListener(NsdListener nsdListener) {
        this.mListener = nsdListener;
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void stopDiscovery(String str) {
        try {
            this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Stop_Discovery", str);
        } catch (Exception unused) {
        }
        BuriPointInfo buriPointInfo = this.mBuriPointInfos.get(str);
        this.mBuriPointInfos.remove(str);
        this.mDiscoveryTimer.cancel();
        MyDnssdService myDnssdService = this.mBrowseInfos.get(str);
        if (myDnssdService != null) {
            DNSSDService dNSSDService = myDnssdService.dnssdService;
            if (dNSSDService != null) {
                CastLogger castLogger = this.mCastLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stopDiscovery, buriInfo:");
                LIZ.append(buriPointInfo);
                castLogger.i("DnssdHelper", X1D.LIZIZ(LIZ));
                dNSSDService.stop();
                this.mBrowseInfos.remove(str);
            }
            releaseMulticastLock(myDnssdService.listener);
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void unregisterService(final String str) {
        try {
            this.mCastMonitor.sendCustomEvent("dnssd", "Nsd_Unregister_Service", str);
            trackMdnsUnregisterEvent("start", "", "");
        } catch (Exception unused) {
        }
        final MyDnssdService myDnssdService = this.mRegisterInfos.get(str);
        if (myDnssdService != null) {
            if (myDnssdService.dnssdService != null) {
                CastLogger castLogger = this.mCastLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unregisterService, serviceType:");
                LIZ.append(str);
                castLogger.i("DnssdHelper", X1D.LIZIZ(LIZ));
                myDnssdService.dnssdService.stop();
                this.mRegisterInfos.remove(str);
                mExecutor.submit(new Runnable() { // from class: X.Za7
                    @Override // java.lang.Runnable
                    public final void run() {
                        DnssdHelper.this.lambda$unregisterService$2(myDnssdService, str);
                    }
                });
            }
            releaseMulticastLock(myDnssdService.listener);
        }
    }

    /* renamed from: com.byted.cast.dnssd.helper.DnssdHelper$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass1 implements QueryListener {
        public final /* synthetic */ String val$domain;
        public final /* synthetic */ String val$hostName;
        public final /* synthetic */ int val$port;
        public final /* synthetic */ String val$regType;
        public final /* synthetic */ String val$serviceName;
        public final /* synthetic */ Map val$txtRecord;

        @Override // com.byted.cast.dnssd.BaseListener
        public void operationFailed(DNSSDService dNSSDService, int i) {
            NsdListener nsdListener;
            int i2 = i - 262144;
            CastLogger castLogger = DnssdHelper.this.mCastLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("query records failed:");
            LIZ.append(i2);
            castLogger.w("DnssdHelper", X1D.LIZIZ(LIZ));
            MyDnssdService myDnssdService = DnssdHelper.this.mBrowseInfos.get(this.val$regType);
            if (myDnssdService != null && (nsdListener = myDnssdService.listener) != null) {
                nsdListener.onNsdError("query operation failed", i2, "DnssdQuery");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", i2);
                jSONObject.put("serviceType", this.val$regType);
                jSONObject.put("servicename", this.val$serviceName);
                jSONObject.put("domain", this.val$domain);
                DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Query_Failure", jSONObject.toString());
            } catch (Exception unused) {
            }
        }

        public AnonymousClass1(String str, String str2, String str3, Map map, int i, String str4) {
            this.val$serviceName = str;
            this.val$regType = str2;
            this.val$domain = str3;
            this.val$txtRecord = map;
            this.val$port = i;
            this.val$hostName = str4;
        }

        @Override // com.byted.cast.dnssd.QueryListener
        public void queryAnswered(DNSSDService dNSSDService, final int i, final int i2, String str, int i3, int i4, final byte[] bArr, final int i5) {
            CastLogger castLogger = DnssdHelper.this.mCastLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Query address, fullName:");
            LIZ.append(str);
            LIZ.append(", rrtype:");
            LIZ.append(i3);
            LIZ.append(", rrclass:");
            LIZ.append(i4);
            LIZ.append(", rdata:");
            LIZ.append(bArr);
            LIZ.append(", ttl:");
            LIZ.append(i5);
            castLogger.d("DnssdHelper", X1D.LIZIZ(LIZ));
            ExecutorService executorService = DnssdHelper.mExecutor;
            final String str2 = this.val$serviceName;
            final String str3 = this.val$regType;
            final String str4 = this.val$domain;
            final Map map = this.val$txtRecord;
            final int i6 = this.val$port;
            final String str5 = this.val$hostName;
            executorService.submit(new Runnable() { // from class: X.Za8
                @Override // java.lang.Runnable
                public final void run() {
                    DnssdHelper.AnonymousClass1.this.lambda$queryAnswered$0(i, i2, str2, str3, str4, map, i6, str5, bArr, i5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$queryAnswered$0(int i, int i2, String str, String str2, String str3, Map map, int i3, String str4, byte[] bArr, int i4) {
            NsdListener nsdListener;
            String hostAddress;
            BonjourService.Builder builder = new BonjourService.Builder(i, i2, str, str2, str3);
            builder.dnsRecords(map);
            builder.port(i3);
            builder.hostname(str4);
            try {
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                if (byAddress instanceof Inet4Address) {
                    builder.inet4Address((Inet4Address) byAddress);
                } else if (byAddress instanceof Inet6Address) {
                    builder.inet6Address((Inet6Address) byAddress);
                }
                BonjourService build = builder.build();
                MyDnssdService myDnssdService = DnssdHelper.this.mBrowseInfos.get(str2);
                if (myDnssdService != null && (nsdListener = myDnssdService.listener) != null) {
                    String serviceName = build.getServiceName();
                    String regType = build.getRegType();
                    String domain = build.getDomain();
                    if (build.getInet4Address() == null) {
                        hostAddress = null;
                    } else {
                        hostAddress = build.getInet4Address().getHostAddress();
                    }
                    nsdListener.onNsdServiceResolved(new NsdService(serviceName, regType, domain, hostAddress, build.getPort(), build.getInet4Address(), build.getTxtRecords()));
                }
                BuriPointInfo buriPointInfo = DnssdHelper.this.mBuriPointInfos.get(str2);
                CastLogger castLogger = DnssdHelper.this.mCastLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("queryAnswered, buriPointInfo:");
                LIZ.append(buriPointInfo);
                LIZ.append(", bonjourService:");
                LIZ.append(build);
                LIZ.append(", address:");
                LIZ.append("xxx.xxx.xxx.xxx");
                castLogger.i("DnssdHelper", X1D.LIZIZ(LIZ));
                if (buriPointInfo != null) {
                    try {
                        if (buriPointInfo.browseStarted && !buriPointInfo.resultFound) {
                            buriPointInfo.resultFound = true;
                            DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Query_Answered", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "bonjourService:%s, addr:%s, ttl:%d", new Object[]{build, "xxx.xxx.xxx.xxx", Integer.valueOf(i4)}));
                        } else {
                            DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Query_Answered_Ext", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "bonjourService:%s, addr:%s, ttl:%d", new Object[]{build, "xxx.xxx.xxx.xxx", Integer.valueOf(i4)}));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (UnknownHostException e) {
                CastLogger castLogger2 = DnssdHelper.this.mCastLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("unknown host:");
                LIZ2.append(e);
                castLogger2.w("DnssdHelper", X1D.LIZIZ(LIZ2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unregisterService$2(MyDnssdService myDnssdService, String str) {
        NsdListener nsdListener = myDnssdService.listener;
        if (nsdListener != null) {
            nsdListener.onNsdUnRegistered(new NsdService(myDnssdService.serviceName, myDnssdService.serviceType, myDnssdService.domain, myDnssdService.port, myDnssdService.attrs));
        }
        try {
            this.mCastMonitor.sendCustomEvent("dnssd", "Nsd_Service_Unregistered", str);
            trackMdnsUnregisterEvent("success", "", "");
        } catch (Exception unused) {
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public void stopDiscovery(ContextManager.CastContext castContext, String str) {
        stopDiscovery(str);
    }

    private void onError(NsdListener nsdListener, int i, String str) {
        CastLogger castLogger = this.mCastLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errorCode:");
        LIZ.append(i);
        LIZ.append(", errorMsg:");
        LIZ.append(str);
        castLogger.e("DnssdHelper", X1D.LIZIZ(LIZ));
        if (nsdListener != null) {
            nsdListener.onNsdError(str, i, "DnssdHelper");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str);
            jSONObject.put("serviceInfo", "");
            this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_onError", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private void trackMdnsUnregisterEvent(String str, String str2, String str3) {
        TeaEventTrack teaEventTrack = this.mTeaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.trackMdnsUnregisterEvent(str, "dnssd", str2, str3);
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public String startDiscovery(final String str, final String str2, final NsdListener nsdListener) {
        CastLogger castLogger = this.mCastLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startDiscovery, serviceType:");
        LIZ.append(str);
        LIZ.append(", serviceName:");
        LIZ.append(str2);
        castLogger.i("DnssdHelper", X1D.LIZIZ(LIZ));
        try {
            this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Start_Discovery", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "type:%s, name:%s", new Object[]{str, str2}));
        } catch (Exception unused) {
        }
        this.mBuriPointInfos.put(str, new BuriPointInfo(str, true, false));
        acquireMulticastLock(nsdListener);
        this.mDiscoveryTimer.start();
        try {
            this.mBrowseInfos.put(str, new MyDnssdService(this.mDnssd.browse(str, new BrowseListener() { // from class: com.byted.cast.dnssd.helper.DnssdHelper.3
                @Override // com.byted.cast.dnssd.BaseListener
                public void operationFailed(DNSSDService dNSSDService, int i) {
                    int i2 = i - 262144;
                    CastLogger castLogger2 = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("browse failed, errorCode:");
                    LIZ2.append(i2);
                    castLogger2.w("DnssdHelper", X1D.LIZIZ(LIZ2));
                    NsdListener nsdListener2 = nsdListener;
                    if (nsdListener2 != null) {
                        nsdListener2.onNsdError("discovery operation failed", i2, "DnssdDiscovery");
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("errorCode", i2);
                        jSONObject.put("serviceType", str);
                        jSONObject.put("servicename", str2);
                        DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Discovery_Failure", jSONObject.toString());
                    } catch (Exception unused2) {
                    }
                }

                @Override // com.byted.cast.dnssd.BrowseListener
                public void serviceFound(DNSSDService dNSSDService, int i, int i2, String str3, String str4, String str5) {
                    NsdListener nsdListener2;
                    CastLogger castLogger2 = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("serviceFound, serviceName:");
                    LIZ2.append(str3);
                    LIZ2.append(", regType:");
                    LIZ2.append(str4);
                    LIZ2.append(", domain:");
                    LIZ2.append(str5);
                    castLogger2.d("DnssdHelper", X1D.LIZIZ(LIZ2));
                    MyDnssdService myDnssdService = DnssdHelper.this.mBrowseInfos.get(str4);
                    if (myDnssdService != null && (nsdListener2 = myDnssdService.listener) != null) {
                        nsdListener2.onNsdServiceFound(new NsdService(str3, str4, str5));
                    }
                    try {
                        DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Found", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s, domain:%s", new Object[]{str3, str4, str5}));
                    } catch (Exception unused2) {
                    }
                    DnssdHelper.this.startResolve(i, i2, str3, str4, str5);
                }

                @Override // com.byted.cast.dnssd.BrowseListener
                public void serviceLost(DNSSDService dNSSDService, int i, int i2, String str3, String str4, String str5) {
                    NsdListener nsdListener2;
                    String hostAddress;
                    BonjourService build = new BonjourService.Builder(i, i2, str3, str4, str5).build();
                    CastLogger castLogger2 = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("serviceLost, bonjourService:");
                    LIZ2.append(build);
                    castLogger2.d("DnssdHelper", X1D.LIZIZ(LIZ2));
                    MyDnssdService myDnssdService = DnssdHelper.this.mBrowseInfos.get(str4);
                    if (myDnssdService != null && (nsdListener2 = myDnssdService.listener) != null) {
                        String serviceName = build.getServiceName();
                        String regType = build.getRegType();
                        String domain = build.getDomain();
                        if (build.getInet4Address() == null) {
                            hostAddress = null;
                        } else {
                            hostAddress = build.getInet4Address().getHostAddress();
                        }
                        nsdListener2.onNsdServiceLost(new NsdService(serviceName, regType, domain, hostAddress, build.getPort(), build.getInet4Address(), build.getTxtRecords()));
                    }
                    try {
                        DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Lost", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s, domain:%s", new Object[]{str3, str4, str5}));
                    } catch (Exception unused2) {
                    }
                }
            }), str, str2, nsdListener, -1, null));
        } catch (DNSSDException e) {
            this.mCastLogger.w("DnssdHelper", "browse error:" + e);
            int errorCode = e.getErrorCode() - 262144;
            nsdListener.onNsdError(e.getMessage(), errorCode, "DnssdDiscovery");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", errorCode);
                jSONObject.put("serviceType", str);
                jSONObject.put("servicename", str2);
                jSONObject.put("exception", Log.getStackTraceString(e));
                this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Discovery_Failure", jSONObject.toString());
            } catch (Exception unused2) {
            }
        }
        return str;
    }

    public void trackMdnsRegisterEvent(String str, String str2, String str3) {
        TeaEventTrack teaEventTrack = this.mTeaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.trackMdnsRegisterEvent(str, "dnssd", str2, str3);
        }
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public String startDiscovery(ContextManager.CastContext castContext, String str, String str2, NsdListener nsdListener) {
        startDiscovery(str, str2, nsdListener);
        return str;
    }

    @Override // com.byted.cast.common.discovery.INsdHelper
    public String registerService(final String str, final String str2, int i, Map<String, String> map, final NsdListener nsdListener) {
        DNSSDRegistration register;
        CastLogger castLogger = this.mCastLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerService, desiredServiceName:");
        LIZ.append(str);
        LIZ.append(", serviceType:");
        LIZ.append(str2);
        LIZ.append(", port:");
        LIZ.append(i);
        LIZ.append(", attrs:");
        LIZ.append(StringUtil.transMapToString(map));
        castLogger.i("DnssdHelper", X1D.LIZIZ(LIZ));
        try {
            this.mCastMonitor.sendCustomEvent("dnssd", "Nsd_Register_Service", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s, port:%d, attrs:%s", new Object[]{str, str2, Integer.valueOf(i), StringUtil.transMapToString(map)}));
            trackMdnsRegisterEvent("start", "", "");
        } catch (Exception unused) {
        }
        acquireMulticastLock(nsdListener);
        try {
            TXTRecord tXTRecord = new TXTRecord();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!entry.getKey().equals(C63832P3k.LIZ)) {
                    this.mCastLogger.i("DnssdHelper", "key:" + entry.getKey() + ", value:" + entry.getValue());
                }
                tXTRecord.set(entry.getKey(), entry.getValue());
            }
            this.mCastLogger.d("DnssdHelper", "registerService, txtRecord:" + tXTRecord);
            register = this.mDnssd.register(0, 0, str, str2, null, null, i, tXTRecord, new RegisterListener() { // from class: com.byted.cast.dnssd.helper.DnssdHelper.4
                @Override // com.byted.cast.dnssd.BaseListener
                public void operationFailed(DNSSDService dNSSDService, int i2) {
                    int i3 = i2 - 262144;
                    CastLogger castLogger2 = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("registerService failed, errorCode:");
                    LIZ2.append(i3);
                    castLogger2.w("DnssdHelper", X1D.LIZIZ(LIZ2));
                    nsdListener.onNsdError("register operation failed", 282151, "DnssdRegister");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("errorCode", i3);
                        jSONObject.put("serviceType", str2);
                        jSONObject.put("servicename", str);
                        DnssdHelper.this.mCastMonitor.sendCustomEvent("dnssd", "Nsd_Service_Register_Failure", jSONObject.toString());
                        DnssdHelper.this.trackMdnsRegisterEvent("failure", String.valueOf(16), String.valueOf(i3));
                    } catch (Exception unused2) {
                    }
                }

                @Override // com.byted.cast.dnssd.RegisterListener
                public void serviceRegistered(DNSSDRegistration dNSSDRegistration, int i2, String str3, String str4, String str5) {
                    String str6 = str4;
                    CastLogger castLogger2 = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("serviceRegistered success, flags:");
                    LIZ2.append(i2);
                    LIZ2.append(", serviceName:");
                    LIZ2.append(str3);
                    LIZ2.append(", regType:");
                    LIZ2.append(str6);
                    LIZ2.append(", domain:");
                    LIZ2.append(str5);
                    castLogger2.i("DnssdHelper", X1D.LIZIZ(LIZ2));
                    if (str6.contains("_airplay._tcp") || str6.contains("_raop._tcp")) {
                        str6 = str6.substring(0, str6.length() - 1);
                        CastLogger castLogger3 = DnssdHelper.this.mCastLogger;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("serviceRegistered modified airplay regType:");
                        LIZ3.append(str6);
                        castLogger3.i("DnssdHelper", X1D.LIZIZ(LIZ3));
                    }
                    MyDnssdService myDnssdService = DnssdHelper.this.mRegisterInfos.get(str6);
                    if (myDnssdService != null) {
                        myDnssdService.serviceName = str3;
                        myDnssdService.domain = str5;
                        NsdListener nsdListener2 = myDnssdService.listener;
                        if (nsdListener2 != null) {
                            nsdListener2.onNsdRegistered(new NsdService(str3, str6, str5, myDnssdService.port, myDnssdService.attrs));
                        }
                        try {
                            DnssdHelper.this.mCastMonitor.sendCustomEvent("dnssd", "Nsd_Service_Register_Success", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s, domain:%s", new Object[]{str3, str6, str5}));
                            DnssdHelper.this.trackMdnsRegisterEvent("success", "", "");
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    CastLogger castLogger4 = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("myDnssdService is null, regType:");
                    LIZ4.append(str6);
                    LIZ4.append(", mRegisterInfos.size:");
                    LIZ4.append(DnssdHelper.this.mRegisterInfos.size());
                    castLogger4.w("DnssdHelper", X1D.LIZIZ(LIZ4));
                    for (Map.Entry<String, MyDnssdService> entry2 : DnssdHelper.this.mRegisterInfos.entrySet()) {
                        CastLogger castLogger5 = DnssdHelper.this.mCastLogger;
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("key:");
                        LIZ5.append(entry2.getKey());
                        LIZ5.append(", MyDnssdService:");
                        LIZ5.append(entry2.getValue());
                        castLogger5.i("DnssdHelper", X1D.LIZIZ(LIZ5));
                    }
                }
            });
            CastLogger castLogger2 = this.mCastLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mRegisterInfos.put: serviceType:");
            LIZ2.append(str2);
            castLogger2.i("DnssdHelper", X1D.LIZIZ(LIZ2));
        } catch (DNSSDException e) {
            e = e;
        }
        try {
            this.mRegisterInfos.put(str2, new MyDnssdService(register, str2, str, nsdListener, i, map));
        } catch (DNSSDException e2) {
            e = e2;
            this.mCastLogger.w("DnssdHelper", "registerService error:" + e);
            int errorCode = e.getErrorCode() - 262144;
            nsdListener.onNsdError(e.getMessage(), 282151, "DnssdRegister");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", errorCode);
                jSONObject.put("serviceType", str2);
                jSONObject.put("servicename", str);
                jSONObject.put("exception", Log.getStackTraceString(e));
                this.mCastMonitor.sendCustomEvent("dnssd", "Nsd_Service_Register_Failure", jSONObject.toString());
                trackMdnsRegisterEvent("failure", String.valueOf(17), e.toString());
            } catch (Exception unused2) {
            }
            return str2;
        }
        return str2;
    }

    public void startResolve(int i, int i2, final String str, final String str2, final String str3) {
        NsdListener nsdListener;
        try {
            this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Start_Resolve", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s, domain:%s", new Object[]{str, str2, str3}));
        } catch (Exception unused) {
        }
        try {
            this.mDnssd.resolve(i, i2, str, str2, str3, new ResolveListener() { // from class: com.byted.cast.dnssd.helper.DnssdHelper.2
                @Override // com.byted.cast.dnssd.BaseListener
                public void operationFailed(DNSSDService dNSSDService, int i3) {
                    NsdListener nsdListener2;
                    int i4 = i3 - 262144;
                    CastLogger castLogger = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("resolve failed, errorCode:");
                    LIZ.append(i4);
                    castLogger.e("DnssdHelper", X1D.LIZIZ(LIZ));
                    MyDnssdService myDnssdService = DnssdHelper.this.mBrowseInfos.get(str2);
                    if (myDnssdService != null && (nsdListener2 = myDnssdService.listener) != null) {
                        nsdListener2.onNsdError("resolve operation failed", i4, "DnssdResolve");
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("errorCode", i4);
                        jSONObject.put("serviceType", str2);
                        jSONObject.put("servicename", str);
                        jSONObject.put("domain", str3);
                        DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Resolve_Failure", jSONObject.toString());
                    } catch (Exception unused2) {
                    }
                }

                @Override // com.byted.cast.dnssd.ResolveListener
                public void serviceResolved(DNSSDService dNSSDService, int i3, int i4, String str4, String str5, int i5, Map<String, String> map) {
                    CastLogger castLogger = DnssdHelper.this.mCastLogger;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Resolved, fullName:");
                    LIZ.append(str4);
                    LIZ.append(", hostName:");
                    LIZ.append(str5);
                    LIZ.append(", port:");
                    LIZ.append(i5);
                    LIZ.append(", textRecord:");
                    LIZ.append(StringUtil.transMapToString(map));
                    castLogger.i("DnssdHelper", X1D.LIZIZ(LIZ));
                    try {
                        DnssdHelper.this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Resolved", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "type:%s, fullName:%s, hostName:%s, port:%d, txtRecord:%s", new Object[]{str2, str4, str5, Integer.valueOf(i5), StringUtil.transMapToString(map)}));
                    } catch (Exception unused2) {
                    }
                    DnssdHelper.this.startQueryRecords(i4, str, str2, str3, str5, i5, map);
                }
            });
        } catch (DNSSDException e) {
            CastLogger castLogger = this.mCastLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resolve error:");
            LIZ.append(e);
            castLogger.w("DnssdHelper", X1D.LIZIZ(LIZ));
            int errorCode = e.getErrorCode() - 262144;
            MyDnssdService myDnssdService = this.mBrowseInfos.get(str2);
            if (myDnssdService != null && (nsdListener = myDnssdService.listener) != null) {
                nsdListener.onNsdError(e.getMessage(), errorCode, "DnssdResolve");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", errorCode);
                jSONObject.put("serviceType", str2);
                jSONObject.put("servicename", str);
                jSONObject.put("domain", str3);
                jSONObject.put("exception", Log.getStackTraceString(e));
                this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Resolve_Failure", jSONObject.toString());
            } catch (Exception unused2) {
            }
        }
    }

    public DnssdHelper(Context context, ContextManager.CastContext castContext, NsdListener nsdListener, String str, final ILibraryLoader iLibraryLoader, IDnssdLogger iDnssdLogger) {
        this.mContext = context;
        this.mListener = nsdListener;
        this.mLinkName = str;
        this.mCastMonitor = ContextManager.getMonitor(castContext);
        this.mCastLogger = ContextManager.getLogger(castContext);
        this.mTeaEventTrack = ContextManager.getTeaEventTrack(castContext);
        initMultiWifiLock(nsdListener);
        this.mDiscoveryTimer = new DiscoveryTimer(this, this.mDiscoveryTimeout);
        if (TextUtils.equals(Utils.getProperty("debug.dnssd.type", "1"), CardStruct.IStatusCode.DEFAULT)) {
            this.mCastLogger.i("DnssdHelper", "new DNSSDEmbedded");
            Logger.setLogger(iDnssdLogger);
            Logger.setLogger(iDnssdLogger);
            this.mDnssd = new DNSSDEmbedded(this.mContext, C16880lQ.LLJJJJ(), 60000, 5000L, iLibraryLoader != null ? new com.byted.cast.dnssd.ILibraryLoader() { // from class: X.Zht
                @Override // com.byted.cast.dnssd.ILibraryLoader
                public final boolean loadLibrary(String str2) {
                    return ILibraryLoader.this.loadLibrary(str2);
                }
            } : null);
            return;
        }
        this.mCastLogger.i("DnssdHelper", "new DNSSDBindable");
        Logger.setLogger(iDnssdLogger);
        Logger.setLogger(iDnssdLogger);
        this.mDnssd = new DNSSDBindable(this.mContext, iLibraryLoader != null ? new com.byted.cast.dnssd.ILibraryLoader() { // from class: X.Zhu
            @Override // com.byted.cast.dnssd.ILibraryLoader
            public final boolean loadLibrary(String str2) {
                return ILibraryLoader.this.loadLibrary(str2);
            }
        } : null);
    }

    public static DnssdHelper createInstance(Context context, ContextManager.CastContext castContext, NsdListener nsdListener, String str, ILibraryLoader iLibraryLoader, IDnssdLogger iDnssdLogger) {
        return new DnssdHelper(context, castContext, nsdListener, str, iLibraryLoader, iDnssdLogger);
    }

    public void startQueryRecords(int i, String str, String str2, String str3, String str4, int i2, Map<String, String> map) {
        NsdListener nsdListener;
        try {
            this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Start_Query_Records", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "name:%s, type:%s, domain:%s, port:%d", new Object[]{str, str2, str3, Integer.valueOf(i2)}));
        } catch (Exception unused) {
        }
        try {
            this.queryService = this.mDnssd.queryRecord(0, i, str4, 1, 1, true, new AnonymousClass1(str, str2, str3, map, i2, str4));
        } catch (DNSSDException e) {
            CastLogger castLogger = this.mCastLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("query records error:");
            LIZ.append(e);
            castLogger.w("DnssdHelper", X1D.LIZIZ(LIZ));
            int errorCode = e.getErrorCode() - 262144;
            MyDnssdService myDnssdService = this.mBrowseInfos.get(str2);
            if (myDnssdService != null && (nsdListener = myDnssdService.listener) != null) {
                nsdListener.onNsdError(e.getMessage(), errorCode, "DnssdQuery");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", errorCode);
                jSONObject.put("serviceType", str2);
                jSONObject.put("servicename", str);
                jSONObject.put("domain", str3);
                jSONObject.put("exception", Log.getStackTraceString(e));
                this.mCastMonitor.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Query_Failure", jSONObject.toString());
            } catch (Exception unused2) {
            }
        }
    }
}
