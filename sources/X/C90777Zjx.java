package X;

import Y.IDRunnableS30S0200000_24;
import Y.IDRunnableS86S0100000_24;
import android.content.Context;
import android.net.Network;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.MainThreadExecutor;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IWriteCacheListener;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.discovery.NsdFactory;
import com.byted.cast.common.discovery.NsdService;
import com.byted.cast.common.discovery.NsdUtils;
import com.byted.cast.common.network.NetworkChangeReceiver2;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.DLNAOptionUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Zjx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90777Zjx implements NetworkChangeReceiver2.NetworkChangeListener {
    public Context LIZ;
    public final ContextManager.CastContext LIZIZ;
    public final CastLogger LIZJ;
    public final CastMonitor LIZLLL;
    public final TeaEventTrack LJ;
    public boolean LJFF;
    public IBrowseListener LJII;
    public INsdHelper LJIIIIZZ;
    public List<String> LJIIJJI;
    public List<String> LJIIL;
    public IWriteCacheListener LJIILL;
    public final ICastSource LJIILLIIL;
    public final ICastSource LJIIZILJ;
    public ILibraryLoader LJIJ;
    public NetworkChangeReceiver2 LJIJI;
    public ILogger LJIL;
    public String LJJ;
    public ExecutorService LJJIFFI;
    public final MainThreadExecutor LJI = new MainThreadExecutor();
    public String LJIIIZ = "BDLink";
    public String LJIIJ = "_BDLink._tcp.";
    public final java.util.Map<String, NsdService> LJIILIIL = new ConcurrentHashMap();
    public final java.util.Map<String, ServiceInfo> LJIILJJIL = new ConcurrentHashMap();
    public boolean LJIJJ = false;
    public boolean LJIJJLI = false;
    public final Object LJJI = new Object();
    public final C90776Zjw LJJII = new C90776Zjw(this);

    public final synchronized void LJFF() {
        String str;
        if (!DLNAOptionUtils.isEnableMdnsSearch(this.LIZIZ)) {
            this.LIZJ.d("NsdClient", "startBrowse, isEnableMdnsSearch is false");
            return;
        }
        CastLogger castLogger = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startBrowse, mServiceType:");
        LIZ.append(this.LJIIJ);
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
        INsdHelper iNsdHelper = this.LJIIIIZZ;
        if (iNsdHelper != null && (str = this.LJJ) != null) {
            iNsdHelper.stopDiscovery(this.LIZIZ, str);
            this.LJIIIIZZ = null;
        }
        boolean isDnssdEnabledFromGrayConfig = NsdUtils.isDnssdEnabledFromGrayConfig(this.LIZIZ);
        boolean isDnssdEnabledFromLocalConfig = NsdUtils.isDnssdEnabledFromLocalConfig(this.LIZIZ);
        NsdFactory.Type nsdType = NsdUtils.getNsdType(this.LIZIZ);
        CastLogger castLogger2 = this.LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startBrowse, enableDnssd:");
        LIZ2.append(isDnssdEnabledFromGrayConfig);
        LIZ2.append(", forceDnssd: ");
        LIZ2.append(isDnssdEnabledFromLocalConfig);
        LIZ2.append(", type:");
        LIZ2.append(nsdType);
        castLogger2.i("NsdClient", X1D.LIZIZ(LIZ2));
        INsdHelper createNsdHelper = NsdFactory.createNsdHelper(nsdType, this.LIZ, this.LIZIZ, this.LJJII, "NsdClient", this.LJIJ);
        this.LJIIIIZZ = createNsdHelper;
        if (createNsdHelper != null) {
            createNsdHelper.setDiscoveryTimeout(0);
            this.LJIIIIZZ.setLogEnabled(this.LJFF);
            this.LJJ = this.LJIIIIZZ.startDiscovery(this.LIZIZ, this.LJIIJ, "BDLink", this.LJJII);
            CastLogger castLogger3 = this.LIZJ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mNsdHelper.startDiscovery, mDiscoveryId:");
            LIZ3.append(this.LJJ);
            castLogger3.i("NsdClient", X1D.LIZIZ(LIZ3));
        }
        if (!((ConcurrentHashMap) this.LJIILJJIL).isEmpty()) {
            LIZLLL("cache");
        }
        this.LJIJJLI = true;
    }

    public final synchronized void LJI() {
        String str;
        if (!DLNAOptionUtils.isEnableMdnsSearch(this.LIZIZ)) {
            this.LIZJ.d("NsdClient", "stopBrowse, isEnableMdnsSearch is false");
            return;
        }
        CastLogger castLogger = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopBrowse, mServiceType: ");
        LIZ.append(this.LJIIJ);
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
        INsdHelper iNsdHelper = this.LJIIIIZZ;
        if (iNsdHelper != null && (str = this.LJJ) != null) {
            iNsdHelper.stopDiscovery(this.LIZIZ, str);
            CastLogger castLogger2 = this.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mNsdHelper.stopDiscovery, mDiscoveryId: ");
            LIZ2.append(this.LJJ);
            castLogger2.i("NsdClient", X1D.LIZIZ(LIZ2));
            this.LJIIIIZZ = null;
        }
        ((ConcurrentHashMap) this.LJIILIIL).clear();
        ((ConcurrentHashMap) this.LJIILJJIL).clear();
        LIZLLL("stop");
        this.LJIJJLI = false;
    }

    public final int LIZ(byte[] bArr) {
        if (bArr == null) {
            this.LIZJ.i("NsdClient", "fromByteArray, bytes is null");
            return 0;
        }
        try {
            int parseInt = CastIntegerProtector.parseInt(new String(bArr));
            CastLogger castLogger = this.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fromByteArray, length:");
            LIZ.append(bArr.length);
            LIZ.append(", ret:");
            LIZ.append(parseInt);
            castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
            return parseInt;
        } catch (Exception e) {
            CastLogger castLogger2 = this.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fromByteArray, exception: ");
            LIZ2.append(e);
            castLogger2.i("NsdClient", X1D.LIZIZ(LIZ2));
            return 0;
        }
    }

    public final void LIZIZ(NsdService nsdService) {
        if (nsdService == null) {
            this.LIZJ.i("NsdClient", "handNsdServiceLost: nsdService is null");
            return;
        }
        synchronized (this.LJJI) {
            ExecutorService executorService = this.LJJIFFI;
            if (executorService == null) {
                this.LIZJ.w("NsdClient", "handNsdServiceLost: mNsdExecutor is null");
            } else {
                executorService.submit(new IDRunnableS30S0200000_24(this, nsdService, 2));
            }
        }
    }

    public final boolean LIZJ(ServiceInfo serviceInfo) {
        if (serviceInfo == null) {
            return false;
        }
        CastLogger castLogger = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hasSameDevice: serviceInfo:");
        LIZ.append(serviceInfo);
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
        for (ServiceInfo serviceInfo2 : ((ConcurrentHashMap) this.LJIILJJIL).values()) {
            if (serviceInfo2 != null) {
                CastLogger castLogger2 = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("hasSameDevice: serviceInfo in list:");
                LIZ2.append(serviceInfo2);
                castLogger2.v("NsdClient", X1D.LIZIZ(LIZ2));
                if (TextUtils.equals(serviceInfo2.ip, serviceInfo.ip) && serviceInfo2.port == serviceInfo.port) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZLLL(String str) {
        this.LIZLLL.getSourceMonitor().trackNsdBrowseSuccessEvent(str);
        this.LJI.execute(new IDRunnableS86S0100000_24(this, 8));
    }

    @Override // com.byted.cast.common.network.NetworkChangeReceiver2.NetworkChangeListener
    public final void onAvailable(Network network) {
        CastLogger castLogger = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAvailable:");
        LIZ.append(this.LJIJJLI);
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
        if (this.LJIJJLI) {
            Dispatcher.getInstance().getByteCastHandler().postDelayed(new IDRunnableS86S0100000_24(this, 7), 200L);
        }
    }

    @Override // com.byted.cast.common.network.NetworkChangeReceiver2.NetworkChangeListener
    public final void onLost(Network network) {
        this.LIZJ.i("NsdClient", "onLost, clear all browse list!");
        if (this.LJIJJLI) {
            LJI();
            this.LJIJJLI = true;
        }
    }

    public final void LJ(int i, Object... objArr) {
        if (i != 10011) {
            switch (i) {
                case 100041:
                    Object obj = objArr[0];
                    if (!(obj instanceof ILibraryLoader)) {
                        return;
                    }
                    this.LJIJ = (ILibraryLoader) obj;
                    CastLogger castLogger = this.LIZJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("OPTION_SET_LIBRARY_LOADER:");
                    LIZ.append(this.LJIJ);
                    castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
                    return;
                case 100042:
                    Object obj2 = objArr[0];
                    if (!(obj2 instanceof ILogger)) {
                        return;
                    }
                    this.LJIL = (ILogger) obj2;
                    return;
                default:
                    return;
            }
        }
        Object obj3 = objArr[0];
        if (!(obj3 instanceof List)) {
            return;
        }
        Object obj4 = objArr[1];
        if (!(obj4 instanceof List)) {
            return;
        }
        this.LJIIJJI = (List) obj3;
        this.LJIIL = (List) obj4;
        CastLogger castLogger2 = this.LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("OPTION_PROTOCOLS_ENABLED, link:");
        LIZ2.append(this.LJIIJJI);
        LIZ2.append(", mirror:");
        LIZ2.append(this.LJIIL);
        castLogger2.i("NsdClient", X1D.LIZIZ(LIZ2));
    }

    public C90777Zjx(ContextManager.CastContext castContext, ICastSource iCastSource, ICastSource iCastSource2) {
        this.LIZIZ = castContext;
        this.LIZJ = ContextManager.getLogger(castContext);
        this.LIZLLL = ContextManager.getMonitor(castContext);
        this.LJ = ContextManager.getTeaEventTrack(castContext);
        this.LJIILLIIL = iCastSource;
        this.LJIIZILJ = iCastSource2;
    }
}
