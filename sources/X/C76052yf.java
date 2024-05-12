package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76052yf extends F9E implements Comparable {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final InterfaceC78280Uns LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C76052yf other = (C76052yf) obj;
        o.LJIIJ(other, "other");
        long j = this.LJLILLLLZI;
        if (j != other.LJLILLLLZI) {
            return C66851QLn.LJFF(Long.valueOf(j), Long.valueOf(other.LJLILLLLZI));
        }
        return -1;
    }

    public C76052yf(long j, InterfaceC78280Uns interfaceC78280Uns, String eventName) {
        o.LJIIJ(eventName, "eventName");
        this.LJLIL = eventName;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC78280Uns;
    }
}
