package com.byted.cast.dnssd;

import com.byted.cast.dnssd.InternalDNSSDService;

/* loaded from: classes29.dex */
public class InternalDNSSDRegistration implements DNSSDRegistration {
    public boolean isStopped;
    public final InternalDNSSDService.DnssdServiceListener listener;
    public final DNSSDRegistration originalDNSSDService;

    @Override // com.byted.cast.dnssd.DNSSDRegistration
    public DNSRecord getTXTRecord() {
        return this.originalDNSSDService.getTXTRecord();
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

    public InternalDNSSDRegistration(InternalDNSSDService.DnssdServiceListener dnssdServiceListener, DNSSDRegistration dNSSDRegistration) {
        this.listener = dnssdServiceListener;
        this.originalDNSSDService = dNSSDRegistration;
    }

    @Override // com.byted.cast.dnssd.DNSSDRegistration
    public DNSRecord addRecord(int i, int i2, byte[] bArr, int i3) {
        return this.originalDNSSDService.addRecord(i, i2, bArr, i3);
    }
}
