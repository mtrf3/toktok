package com.byted.cast.common.discovery.nsdhelper;

import X.X1D;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class NsdListenerRegistration implements NsdManager.RegistrationListener {
    public NsdListener mClientListener;
    public String mListenerId;
    public final NsdHelper mNsdHelper;
    public TeaEventTrack mTeaEventTrack;

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServiceRegistered, serviceName:");
        LIZ.append(nsdServiceInfo.getServiceName());
        Logger.i("NsdHelper.NsdListenerRegistration", X1D.LIZIZ(LIZ));
        NsdListener nsdListener = this.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdRegistered(new NsdService(nsdServiceInfo, this.mNsdHelper.getConfig()));
        }
        try {
            Monitor.sendCustomEvent("nsdmanager", "Nsd_Service_Register_Success", new NsdService(nsdServiceInfo, this.mNsdHelper.getConfig()).toString());
            trackMdnsRegisterEvent("success", "", "");
        } catch (Exception unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServiceUnregistered, serviceName:");
        LIZ.append(nsdServiceInfo.getServiceName());
        Logger.i("NsdHelper.NsdListenerRegistration", X1D.LIZIZ(LIZ));
        NsdListener nsdListener = this.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdUnRegistered(new NsdService(nsdServiceInfo, this.mNsdHelper.getConfig()));
        }
        try {
            Monitor.sendCustomEvent("nsdmanager", "Nsd_Service_Unregistered", new NsdService(nsdServiceInfo, this.mNsdHelper.getConfig()).toString());
            trackMdnsUnregisterEvent("success", "", "");
        } catch (Exception unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        int i2 = i + 262144;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRegistrationFailed, errorCode:");
        LIZ.append(i2);
        Logger.i("NsdHelper.NsdListenerRegistration", X1D.LIZIZ(LIZ));
        NsdListener nsdListener = this.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdError("Service registration failed!", 282151, "android.net.nsd.NsdManager.RegistrationListener");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i2);
            jSONObject.put("serviceInfo", nsdServiceInfo);
            Monitor.sendCustomEvent("nsdmanager", "Nsd_Service_Register_Failure", jSONObject.toString());
            trackMdnsRegisterEvent("failure", String.valueOf(3), String.valueOf(i2));
        } catch (Exception unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        int i2 = i + 262144;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUnregistrationFailed, errorCode:");
        LIZ.append(i2);
        Logger.i("NsdHelper.NsdListenerRegistration", X1D.LIZIZ(LIZ));
        NsdListener nsdListener = this.mClientListener;
        if (nsdListener != null) {
            nsdListener.onNsdError("Service unregistration failed!", i2, "android.net.nsd.NsdManager.RegistrationListener");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i2);
            jSONObject.put("serviceInfo", nsdServiceInfo);
            Monitor.sendCustomEvent("nsdmanager", "Nsd_Service_Unregister_Failure", jSONObject.toString());
            trackMdnsUnregisterEvent("failure", String.valueOf(2), String.valueOf(i2));
        } catch (Exception unused) {
        }
    }

    public NsdListenerRegistration(NsdHelper nsdHelper, NsdListener nsdListener, TeaEventTrack teaEventTrack) {
        this.mNsdHelper = nsdHelper;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NsdListenerRegistration_");
        LIZ.append(System.identityHashCode(this));
        this.mListenerId = X1D.LIZIZ(LIZ);
        this.mClientListener = nsdListener;
        this.mTeaEventTrack = teaEventTrack;
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
}
