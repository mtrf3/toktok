package X;

import java.io.Serializable;

/* renamed from: X.PcC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64816PcC implements Serializable, Comparable<C64816PcC> {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI = System.currentTimeMillis();
    public InterfaceC64817PcD mHttpDnsCallback;

    public String getHost() {
        return this.LJLIL;
    }

    public boolean isLocalDnsExpired() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Comparable
    public int compareTo(C64816PcC c64816PcC) {
        long j = c64816PcC.LJLJI;
        long j2 = this.LJLJI;
        if (j == j2) {
            return 0;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public C64816PcC(String str, InterfaceC64817PcD interfaceC64817PcD, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}
