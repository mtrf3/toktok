package com.byted.cast.dnssd;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class AppleRecordRegistrar extends AppleService implements DNSSDRecordRegistrar {
    public native int CreateConnection();

    public native int RegisterRecord(int i, int i2, String str, int i3, int i4, byte[] bArr, int i5, AppleDNSRecord appleDNSRecord);

    public AppleRecordRegistrar(RegisterRecordListener registerRecordListener) {
        super(registerRecordListener);
        Logger.d("DNSSD_AppleService", "AppleRecordRegistrar");
        ThrowOnErr(CreateConnection());
        if (!AppleDNSSD.hasAutoCallbacks) {
            new PthreadThread(this, "Thread-AppleRecordRegistrar").start();
        }
    }

    @Override // com.byted.cast.dnssd.DNSSDRecordRegistrar
    public DNSRecord registerRecord(int i, int i2, String str, int i3, int i4, byte[] bArr, int i5) {
        AppleDNSRecord appleDNSRecord = new AppleDNSRecord(this);
        ThrowOnErr(RegisterRecord(i, i2, str, i3, i4, bArr, i5, appleDNSRecord));
        return appleDNSRecord;
    }
}
