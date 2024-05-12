package com.byted.cast.dnssd;

/* loaded from: classes29.dex */
public interface InternalBrowseListener extends BaseListener {
    void serviceFound(DNSSDService dNSSDService, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3);

    void serviceLost(DNSSDService dNSSDService, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3);
}
