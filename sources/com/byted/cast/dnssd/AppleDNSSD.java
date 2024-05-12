package com.byted.cast.dnssd;

import X.X1D;

/* loaded from: classes29.dex */
public class AppleDNSSD extends InternalDNSSD {
    public static boolean hasAutoCallbacks;

    public static native int InitLibrary(int i);

    public native int ConstructName(String str, String str2, String str3, String[] strArr);

    public native int GetIfIndexForName(String str);

    public native byte[] GetNameForIfIndex(int i);

    public native int ReconfirmRecord(int i, int i2, String str, int i3, int i4, byte[] bArr);

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public DNSSDRecordRegistrar _createRecordRegistrar(RegisterRecordListener registerRecordListener) {
        return new AppleRecordRegistrar(registerRecordListener);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public int _getIfIndexForName(String str) {
        return GetIfIndexForName(str);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public String _getNameForIfIndex(int i) {
        return new String(GetNameForIfIndex(i));
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public void _init(String str, ILibraryLoader iLibraryLoader) {
        boolean myLoadLibrary;
        if (iLibraryLoader != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("use third loader to load:");
            LIZ.append(str);
            Logger.i("DNSSD_AppleDNSSD", X1D.LIZIZ(LIZ));
            myLoadLibrary = iLibraryLoader.loadLibrary(str);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("use NativeLoader.myLoadLibrary:");
            LIZ2.append(str);
            Logger.i("DNSSD_AppleDNSSD", X1D.LIZIZ(LIZ2));
            myLoadLibrary = NativeLoader.myLoadLibrary(str);
        }
        if (myLoadLibrary) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("load library success:");
            LIZ3.append(str);
            Logger.i("DNSSD_AppleDNSSD", X1D.LIZIZ(LIZ3));
            int InitLibrary = InitLibrary(2);
            if (InitLibrary == 0) {
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("cannot instantiate DNSSD: ");
            LIZ4.append(new AppleDNSSDException(InitLibrary).getMessage());
            throw new InternalError(X1D.LIZIZ(LIZ4));
        }
        Logger.e("DNSSD_AppleDNSSD", "Load Library failed");
        throw new AppleDNSSDException(-65566);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public String _constructFullName(String str, String str2, String str3) {
        String[] strArr = new String[1];
        int ConstructName = ConstructName(str, str2, str3, strArr);
        if (ConstructName == 0) {
            return strArr[0];
        }
        throw new AppleDNSSDException(ConstructName);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public DNSSDService _enumerateDomains(int i, int i2, InternalDomainListener internalDomainListener) {
        return new AppleDomainEnum(i, i2, internalDomainListener);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public DNSSDService _makeBrowser(int i, int i2, String str, String str2, InternalBrowseListener internalBrowseListener) {
        return new AppleBrowser(i, i2, str, str2, internalBrowseListener);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public DNSSDService _queryRecord(int i, int i2, String str, int i3, int i4, InternalQueryListener internalQueryListener) {
        return new AppleQuery(i, i2, str, i3, i4, internalQueryListener);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public int _reconfirmRecord(int i, int i2, String str, int i3, int i4, byte[] bArr) {
        return ReconfirmRecord(i, i2, str, i3, i4, bArr);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public DNSSDService _resolve(int i, int i2, String str, String str2, String str3, InternalResolveListener internalResolveListener) {
        return new AppleResolver(i, i2, str, str2, str3, internalResolveListener);
    }

    @Override // com.byted.cast.dnssd.InternalDNSSD
    public DNSSDRegistration _register(int i, int i2, String str, String str2, String str3, String str4, int i3, TXTRecord tXTRecord, InternalRegisterListener internalRegisterListener) {
        byte[] bArr;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_register, regType:");
        LIZ.append(str2);
        LIZ.append(", serviceName:");
        LIZ.append(str);
        LIZ.append(", port:");
        LIZ.append(i3);
        Logger.d("DNSSD_AppleDNSSD", X1D.LIZIZ(LIZ));
        if (tXTRecord != null) {
            bArr = tXTRecord.getRawBytes();
        } else {
            bArr = null;
        }
        return new AppleRegistration(i, i2, str, str2, str3, str4, i3, bArr, internalRegisterListener);
    }
}
