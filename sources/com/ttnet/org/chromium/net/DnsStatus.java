package com.ttnet.org.chromium.net;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.InetAddress;
import java.util.List;

/* loaded from: classes9.dex */
public class DnsStatus {
    public final List<InetAddress> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.LIZ.size()];
        for (int i = 0; i < this.LIZ.size(); i++) {
            bArr[i] = ((InetAddress) ListProtector.get(this.LIZ, i)).getAddress();
        }
        return bArr;
    }

    public boolean getPrivateDnsActive() {
        return this.LIZIZ;
    }

    public String getPrivateDnsServerName() {
        return this.LIZJ;
    }

    public String getSearchDomains() {
        return this.LIZLLL;
    }

    public DnsStatus(String str, String str2, List list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = str == null ? "" : str;
        this.LIZLLL = str2 == null ? "" : str2;
    }
}
