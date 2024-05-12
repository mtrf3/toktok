package com.byted.cast.dnssd;

import com.byted.cast.dnssd.InternalDNSSDService;

/* loaded from: classes29.dex */
public class InternalDNSSDRecordRegistrar implements DNSSDRecordRegistrar {
    public boolean isStopped;
    public final InternalDNSSDService.DnssdServiceListener listener;
    public final DNSSDRecordRegistrar originalService;

    @Override // com.byted.cast.dnssd.DNSSDService
    public void stop() {
        this.originalService.stop();
        synchronized (this) {
            if (!this.isStopped) {
                this.listener.onServiceStopped();
                this.isStopped = true;
            }
        }
    }

    public InternalDNSSDRecordRegistrar(InternalDNSSDService.DnssdServiceListener dnssdServiceListener, DNSSDRecordRegistrar dNSSDRecordRegistrar) {
        this.listener = dnssdServiceListener;
        this.originalService = dNSSDRecordRegistrar;
    }

    @Override // com.byted.cast.dnssd.DNSSDRecordRegistrar
    public DNSRecord registerRecord(int i, int i2, String str, int i3, int i4, byte[] bArr, int i5) {
        return this.originalService.registerRecord(i, i2, str, i3, i4, bArr, i5);
    }
}
