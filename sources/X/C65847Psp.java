package X;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* renamed from: X.Psp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65847Psp implements NsdManager.RegistrationListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        if (!this.LIZ.equals(nsdServiceInfo.getServiceName())) {
            C65846Pso.LIZ(this.LIZIZ);
        }
    }

    public C65847Psp(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        C65846Pso.LIZ(this.LIZIZ);
    }
}
