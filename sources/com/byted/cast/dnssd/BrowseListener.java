package com.byted.cast.dnssd;

/* loaded from: classes29.dex */
public interface BrowseListener extends BaseListener {
    void serviceFound(DNSSDService dNSSDService, int i, int i2, String str, String str2, String str3);

    void serviceLost(DNSSDService dNSSDService, int i, int i2, String str, String str2, String str3);
}