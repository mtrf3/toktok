package com.byted.cast.dnssd;

/* loaded from: classes29.dex */
public class AppleDNSRecord implements DNSRecord {
    public AppleService fOwner;
    public long fRecord;

    public native int Remove();

    public native int Update(int i, byte[] bArr, int i2);

    @Override // com.byted.cast.dnssd.DNSRecord
    public void remove() {
        ThrowOnErr(Remove());
    }

    public AppleDNSRecord(AppleService appleService) {
        this.fOwner = appleService;
    }

    public void ThrowOnErr(int i) {
        if (i == 0) {
        } else {
            throw new AppleDNSSDException(i);
        }
    }

    @Override // com.byted.cast.dnssd.DNSRecord
    public void update(int i, byte[] bArr, int i2) {
        ThrowOnErr(Update(i, bArr, i2));
    }
}
