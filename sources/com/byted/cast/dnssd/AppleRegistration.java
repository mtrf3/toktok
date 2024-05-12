package com.byted.cast.dnssd;

import X.X1D;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class AppleRegistration extends AppleService implements DNSSDRegistration {
    public native int AddRecord(int i, int i2, byte[] bArr, int i3, AppleDNSRecord appleDNSRecord);

    public native int BeginRegister(int i, int i2, String str, String str2, String str3, String str4, int i3, byte[] bArr);

    @Override // com.byted.cast.dnssd.DNSSDRegistration
    public DNSRecord getTXTRecord() {
        return new AppleDNSRecord(this);
    }

    @Override // com.byted.cast.dnssd.DNSSDRegistration
    public DNSRecord addRecord(int i, int i2, byte[] bArr, int i3) {
        AppleDNSRecord appleDNSRecord = new AppleDNSRecord(this);
        ThrowOnErr(AddRecord(i, i2, bArr, i3, appleDNSRecord));
        return appleDNSRecord;
    }

    public AppleRegistration(int i, int i2, String str, String str2, String str3, String str4, int i3, byte[] bArr, InternalRegisterListener internalRegisterListener) {
        super(internalRegisterListener);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new AppleRegistration, hasAutoCallbacks:");
        LIZ.append(AppleDNSSD.hasAutoCallbacks);
        Logger.d("DNSSD_AppleService", X1D.LIZIZ(LIZ));
        ThrowOnErr(BeginRegister(i2, i, str, str2, str3, str4, i3, bArr));
        if (!AppleDNSSD.hasAutoCallbacks) {
            new PthreadThread(this, "Thread-AppleRegistration").start();
        }
    }
}
