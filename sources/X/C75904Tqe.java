package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75904Tqe extends OFU {
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final java.util.Map<String, Object> LJLJL;
    public final String LJLJLJ;
    public final List<String> LJLJLLL;

    public C75904Tqe() {
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LJLJJLL, JBR.LIZJ(this.LJLJJL, JBR.LIZJ(this.LJLJJI, JBR.LIZJ(this.LJLJI, this.LJLILLLLZI * 31, 31), 31), 31), 31);
        java.util.Map<String, Object> map = this.LJLJL;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return this.LJLJLLL.hashCode() + C79062V1e.LJ(this.LJLJLJ, (LIZJ + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHJoinCancelParam(joinType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", roomId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", userId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", channelId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", timeOutInterval=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", custom=");
        LIZ.append(this.LJLJL);
        LIZ.append(", source=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", sourceTrace=");
        return C1NE.LIZIZ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75904Tqe)) {
            return false;
        }
        C75904Tqe c75904Tqe = (C75904Tqe) obj;
        if (this.LJLILLLLZI == c75904Tqe.LJLILLLLZI && this.LJLJI == c75904Tqe.LJLJI && this.LJLJJI == c75904Tqe.LJLJJI && this.LJLJJL == c75904Tqe.LJLJJL && this.LJLJJLL == c75904Tqe.LJLJJLL && o.LJ(this.LJLJL, c75904Tqe.LJLJL) && o.LJ(this.LJLJLJ, c75904Tqe.LJLJLJ) && o.LJ(this.LJLJLLL, c75904Tqe.LJLJLLL)) {
            return true;
        }
        return false;
    }

    public C75904Tqe(int i, long j, long j2, long j3, String str, List list) {
        super(list);
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = -1L;
        this.LJLJL = null;
        this.LJLJLJ = str;
        this.LJLJLLL = list;
    }
}
