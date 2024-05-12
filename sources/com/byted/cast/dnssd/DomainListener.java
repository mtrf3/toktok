package com.byted.cast.dnssd;

/* loaded from: classes29.dex */
public interface DomainListener extends BaseListener {
    void domainFound(DNSSDService dNSSDService, int i, int i2, String str);

    void domainLost(DNSSDService dNSSDService, int i, int i2, String str);
}
