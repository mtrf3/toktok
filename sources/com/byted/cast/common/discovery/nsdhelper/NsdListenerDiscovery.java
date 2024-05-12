package com.byted.cast.common.discovery.nsdhelper;

import X.X1D;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class NsdListenerDiscovery implements NsdManager.DiscoveryListener {
    public NsdListener mClientListener;
    public Config mConfig;
    public String mListenerId;
    public CastLogger mLogger;
    public CastMonitor mMonitor;
    public final NsdHelper mNsdHelper;
    public int mResolvedCount;
    public String mServiceType;
    public TeaEventTrack mTeaEventTrack;

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStarted(String str) {
        this.mLogger.i("NsdHelper.NsdListenerDiscovery", "onDiscoveryStarted");
        TeaEventTrack teaEventTrack = this.mTeaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.trackMdnsDiscovery("success", "nsdmanager", "", "");
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStopped(String str) {
        this.mLogger.i("NsdHelper.NsdListenerDiscovery", "onDiscoveryStopped");
        TeaEventTrack teaEventTrack = this.mTeaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.trackMdnsStopDiscovery("success", "nsdmanager", "", "");
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServiceFound, serviceInfo:");
        LIZ.append(nsdServiceInfo);
        castLogger.i("NsdHelper.NsdListenerDiscovery", X1D.LIZIZ(LIZ));
        if (this.mClientListener != null) {
            this.mNsdHelper.onNsdServiceFound(nsdServiceInfo, this.mListenerId);
        }
        try {
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Found", new NsdService(nsdServiceInfo, this.mConfig).toString());
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsServiceFound("nsdmanager");
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServiceLost, serviceName:");
        LIZ.append(nsdServiceInfo.getServiceName());
        castLogger.i("NsdHelper.NsdListenerDiscovery", X1D.LIZIZ(LIZ));
        NsdListener nsdListener = this.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdServiceLost(new NsdService(nsdServiceInfo, this.mConfig));
        }
        try {
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Lost", new NsdService(nsdServiceInfo, this.mConfig).toString());
        } catch (Exception unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStartDiscoveryFailed(String str, int i) {
        int i2 = i + 262144;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartDiscoveryFailed, serviceType:");
        LIZ.append(str);
        LIZ.append(", errorCode:");
        LIZ.append(i2);
        castLogger.i("NsdHelper.NsdListenerDiscovery", X1D.LIZIZ(LIZ));
        NsdListener nsdListener = this.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdError("Starting service discovery failed!", i2, "android.net.nsd.NsdHelper.DiscoveryListener");
            this.mClientListener.onNsdDiscoveryFinished();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i2);
            jSONObject.put("serviceType", str);
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Discovery_Failure", jSONObject.toString());
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsDiscovery("failure", "nsdmanager", String.valueOf(2), String.valueOf(i2));
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStopDiscoveryFailed(String str, int i) {
        int i2 = i + 262144;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStopDiscoveryFailed, serviceType:");
        LIZ.append(str);
        LIZ.append(", errorCode:");
        LIZ.append(i2);
        castLogger.i("NsdHelper.NsdListenerDiscovery", X1D.LIZIZ(LIZ));
        NsdListener nsdListener = this.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdError("Stopping service discovery failed!", i2, "android.net.nsd.NsdHelper.DiscoveryListener");
            this.mClientListener.onNsdDiscoveryFinished();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i2);
            jSONObject.put("serviceType", str);
            this.mMonitor.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Stop_Discovery_Failure", jSONObject.toString());
            TeaEventTrack teaEventTrack = this.mTeaEventTrack;
            if (teaEventTrack != null) {
                teaEventTrack.trackMdnsStopDiscovery("failure", "nsdmanager", String.valueOf(1), String.valueOf(i2));
            }
        } catch (Exception unused) {
        }
    }

    public NsdListenerDiscovery(ContextManager.CastContext castContext, NsdHelper nsdHelper, NsdListener nsdListener, String str) {
        this.mNsdHelper = nsdHelper;
        this.mMonitor = ContextManager.getMonitor(castContext);
        this.mLogger = ContextManager.getLogger(castContext);
        this.mTeaEventTrack = ContextManager.getTeaEventTrack(castContext);
        this.mConfig = ContextManager.getConfigManager(castContext).getInitConfig();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NsdListenerDiscovery_");
        LIZ.append(System.identityHashCode(this));
        this.mListenerId = X1D.LIZIZ(LIZ);
        this.mClientListener = nsdListener;
        this.mServiceType = str;
    }
}
