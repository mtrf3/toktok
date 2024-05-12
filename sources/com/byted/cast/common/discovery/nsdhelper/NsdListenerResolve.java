package com.byted.cast.common.discovery.nsdhelper;

import X.C16880lQ;
import X.X1D;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.discovery.NsdListener;
import java.util.Locale;

/* loaded from: classes29.dex */
public class NsdListenerResolve implements NsdManager.ResolveListener {
    public NsdListener mClientListener;
    public String mDiscoveryId;
    public final boolean mIsRetry;
    public String mListenerId;
    public CastLogger mLogger;
    public final NsdHelper mNsdHelper;

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        this.mLogger.i("NsdHelper.NsdListenerResolve", C16880lQ.LLLZI(Locale.getDefault(), "onServiceResolved -> name: %s, port %d, type: %s", new Object[]{nsdServiceInfo.getServiceName(), Integer.valueOf(nsdServiceInfo.getPort()), nsdServiceInfo.getServiceType()}));
        this.mNsdHelper.onNsdServiceResolved(nsdServiceInfo, this.mListenerId, this.mDiscoveryId, this.mIsRetry);
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        int i2 = i + 262144;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResolveFailed, serviceType:");
        LIZ.append(nsdServiceInfo.getServiceType());
        LIZ.append(", errorCode:");
        LIZ.append(i2);
        castLogger.i("NsdHelper.NsdListenerResolve", X1D.LIZIZ(LIZ));
        this.mNsdHelper.onNsdResolveFailed(nsdServiceInfo, this.mListenerId, this.mDiscoveryId, i2, this.mIsRetry);
    }

    public NsdListenerResolve(ContextManager.CastContext castContext, NsdHelper nsdHelper, NsdListener nsdListener, String str, boolean z) {
        this.mNsdHelper = nsdHelper;
        this.mLogger = ContextManager.getLogger(castContext);
        this.mClientListener = nsdListener;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NsdListenerResolve_");
        LIZ.append(System.identityHashCode(this));
        this.mListenerId = X1D.LIZIZ(LIZ);
        this.mDiscoveryId = str;
        this.mIsRetry = z;
    }
}
