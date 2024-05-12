package com.bytedance.netecho.result;

import X.C78966Uyw;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class DnsResolveResult extends Result {
    public final String ip;
    public final boolean success;
    public final String throwableMsg;

    public static /* synthetic */ DnsResolveResult copy$default(DnsResolveResult dnsResolveResult, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dnsResolveResult.success;
        }
        if ((i & 2) != 0) {
            str = dnsResolveResult.ip;
        }
        if ((i & 4) != 0) {
            str2 = dnsResolveResult.throwableMsg;
        }
        return dnsResolveResult.copy(z, str, str2);
    }

    private Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.success), this.ip, this.throwableMsg};
    }

    public final DnsResolveResult copy(boolean z, String str, String str2) {
        return new DnsResolveResult(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DnsResolveResult) {
            return C78966Uyw.LJIIIZ(((DnsResolveResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("DnsResolveResult:%s,%s,%s", getObjects());
    }

    public final String getIp() {
        return this.ip;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getThrowableMsg() {
        return this.throwableMsg;
    }

    public DnsResolveResult(boolean z, String str, String str2) {
        this.success = z;
        this.ip = str;
        this.throwableMsg = str2;
    }
}
