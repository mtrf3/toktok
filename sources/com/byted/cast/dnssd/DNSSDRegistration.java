package com.byted.cast.dnssd;

/* loaded from: classes29.dex */
public interface DNSSDRegistration extends DNSSDService {
    DNSRecord addRecord(int i, int i2, byte[] bArr, int i3);

    DNSRecord getTXTRecord();
}
