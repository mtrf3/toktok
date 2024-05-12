package com.byted.cast.dnssd;

import X.C16880lQ;
import X.X1D;
import android.content.Context;

/* loaded from: classes29.dex */
public final class DNSSDBindable extends DNSSD {
    public final Context context;
    public int serviceCount;

    public static native void nativeExit();

    @Override // com.byted.cast.dnssd.DNSSD, com.byted.cast.dnssd.InternalDNSSDService.DnssdServiceListener
    public void onServiceStarting() {
        super.onServiceStarting();
        try {
            C16880lQ.LLILL(this.context, "servicediscovery");
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Can't start NSD_SERVICE: ");
            LIZ.append(e);
            Logger.e("DNSSDBindable", X1D.LIZIZ(LIZ));
        }
        this.serviceCount++;
    }

    @Override // com.byted.cast.dnssd.DNSSD, com.byted.cast.dnssd.InternalDNSSDService.DnssdServiceListener
    public void onServiceStopped() {
        super.onServiceStopped();
        int i = this.serviceCount - 1;
        this.serviceCount = i;
        if (i == 0) {
            exit();
        }
    }

    public void exit() {
        nativeExit();
    }

    public String getNameForIfIndex(int i) {
        return InternalDNSSD.getNameForIfIndex(i);
    }

    public DNSSDBindable(Context context, ILibraryLoader iLibraryLoader) {
        super(context, "jdns_sd", iLibraryLoader);
        this.context = C16880lQ.LLLLL(context);
    }
}
