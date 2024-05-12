package com.byted.cast.dnssd;

import X.X1D;

/* loaded from: classes29.dex */
public abstract class InternalDNSSD {
    public static final int DEFAULT = 4;
    public static InternalDNSSD fInstance;

    public abstract String _constructFullName(String str, String str2, String str3);

    public abstract DNSSDRecordRegistrar _createRecordRegistrar(RegisterRecordListener registerRecordListener);

    public abstract DNSSDService _enumerateDomains(int i, int i2, InternalDomainListener internalDomainListener);

    public abstract int _getIfIndexForName(String str);

    public abstract String _getNameForIfIndex(int i);

    public abstract void _init(String str, ILibraryLoader iLibraryLoader);

    public abstract DNSSDService _makeBrowser(int i, int i2, String str, String str2, InternalBrowseListener internalBrowseListener);

    public abstract DNSSDService _queryRecord(int i, int i2, String str, int i3, int i4, InternalQueryListener internalQueryListener);

    public abstract int _reconfirmRecord(int i, int i2, String str, int i3, int i4, byte[] bArr);

    public abstract DNSSDRegistration _register(int i, int i2, String str, String str2, String str3, String str4, int i3, TXTRecord tXTRecord, InternalRegisterListener internalRegisterListener);

    public abstract DNSSDService _resolve(int i, int i2, String str, String str2, String str3, InternalResolveListener internalResolveListener);

    static {
        try {
            String property = System.getProperty("com.byted.cast.dnssd.DNSSD");
            if (property == null) {
                property = "com.byted.cast.dnssd.AppleDNSSD";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InternalDNSSD, name:");
            LIZ.append(property);
            Logger.i("DNSSD_InternalDNSSD", X1D.LIZIZ(LIZ));
            fInstance = (InternalDNSSD) Class.forName(property).newInstance();
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cannot instantiate DNSSD");
            LIZ2.append(e);
            throw new InternalError(X1D.LIZIZ(LIZ2));
        }
    }

    public static final InternalDNSSD getInstance() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("getDNSSDInstance"));
        }
        return fInstance;
    }

    public static DNSSDRecordRegistrar createRecordRegistrar(RegisterRecordListener registerRecordListener) {
        return getInstance()._createRecordRegistrar(registerRecordListener);
    }

    public static int getIfIndexForName(String str) {
        return getInstance()._getIfIndexForName(str);
    }

    public static String getNameForIfIndex(int i) {
        return getInstance()._getNameForIfIndex(i);
    }

    public static DNSSDService browse(String str, InternalBrowseListener internalBrowseListener) {
        return browse(0, 0, str, "", internalBrowseListener);
    }

    public static void init(String str, ILibraryLoader iLibraryLoader) {
        getInstance()._init(str, iLibraryLoader);
    }

    public static String constructFullName(String str, String str2, String str3) {
        return getInstance()._constructFullName(str, str2, str3);
    }

    public static DNSSDService enumerateDomains(int i, int i2, InternalDomainListener internalDomainListener) {
        return getInstance()._enumerateDomains(i, i2, internalDomainListener);
    }

    public static DNSSDRegistration register(String str, String str2, int i, InternalRegisterListener internalRegisterListener) {
        return register(0, 0, str, str2, null, null, i, null, internalRegisterListener);
    }

    public static DNSSDService browse(int i, int i2, String str, String str2, InternalBrowseListener internalBrowseListener) {
        return getInstance()._makeBrowser(i, i2, str, str2, internalBrowseListener);
    }

    public static DNSSDService queryRecord(int i, int i2, String str, int i3, int i4, InternalQueryListener internalQueryListener) {
        return getInstance()._queryRecord(i, i2, str, i3, i4, internalQueryListener);
    }

    public static int reconfirmRecord(int i, int i2, String str, int i3, int i4, byte[] bArr) {
        return getInstance()._reconfirmRecord(i, i2, str, i3, i4, bArr);
    }

    public static DNSSDService resolve(int i, int i2, String str, String str2, String str3, InternalResolveListener internalResolveListener) {
        return getInstance()._resolve(i, i2, str, str2, str3, internalResolveListener);
    }

    public static DNSSDRegistration register(int i, int i2, String str, String str2, String str3, String str4, int i3, TXTRecord tXTRecord, InternalRegisterListener internalRegisterListener) {
        return getInstance()._register(i, i2, str, str2, str3, str4, i3, tXTRecord, internalRegisterListener);
    }
}
