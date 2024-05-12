package com.byted.cast.dnssd;

import X.X1D;

/* loaded from: classes29.dex */
public class AppleDNSSDException extends DNSSDException {
    public int fErrorCode;

    @Override // java.lang.Throwable
    public String getMessage() {
        String[] strArr = {"UNKNOWN", "NO_SUCH_NAME", "NO_MEMORY", "BAD_PARAM", "BAD_REFERENCE", "BAD_STATE", "BAD_FLAGS", "UNSUPPORTED", "NOT_INITIALIZED", "NO_CACHE", "ALREADY_REGISTERED", "NAME_CONFLICT", "INVALID", "FIREWALL", "INCOMPATIBLE", "BAD_INTERFACE_INDEX", "REFUSED", "NOSUCHRECORD", "NOAUTH", "NOSUCHKEY", "NATTRAVERSAL", "DOUBLENAT", "BADTIME", "BADSIG", "BADKEY", "TRANSIENT", "SERVICENOTRUNNING", "NATPORTMAPPINGUNSUPPORTED", "NATPORTMAPPINGDISABLED", "LOAD_SO_FAILED"};
        int i = this.fErrorCode;
        if (i <= -65537 && i > -65567) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DNS-SD Error ");
            LIZ.append(String.valueOf(this.fErrorCode));
            LIZ.append(": ");
            LIZ.append(strArr[(-65537) - this.fErrorCode]);
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(super.getMessage());
        LIZ2.append("(");
        LIZ2.append(String.valueOf(this.fErrorCode));
        LIZ2.append(")");
        return X1D.LIZIZ(LIZ2);
    }

    @Override // com.byted.cast.dnssd.DNSSDException
    public int getErrorCode() {
        return this.fErrorCode;
    }

    public AppleDNSSDException(int i) {
        this.fErrorCode = i;
    }
}
