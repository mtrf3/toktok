package com.byted.cast.dnssd;

/* loaded from: classes29.dex */
public class InternalDNSSDService implements DNSSDService {
    public boolean isStopped;
    public final DnssdServiceListener listener;
    public final DNSSDService originalDNSSDService;

    /* loaded from: classes29.dex */
    public interface DnssdServiceListener {
        void onServiceStarting();

        void onServiceStopped();
    }

    @Override // com.byted.cast.dnssd.DNSSDService
    public void stop() {
        this.originalDNSSDService.stop();
        synchronized (this) {
            if (!this.isStopped) {
                this.listener.onServiceStopped();
                this.isStopped = true;
            }
        }
    }

    public InternalDNSSDService(DnssdServiceListener dnssdServiceListener, DNSSDService dNSSDService) {
        this.listener = dnssdServiceListener;
        this.originalDNSSDService = dNSSDService;
    }
}
