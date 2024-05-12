package X;

import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91613if extends AbstractC89473fD {
    public final List<C109544Rq> LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91613if)) {
            return false;
        }
        C91613if c91613if = (C91613if) obj;
        return o.LJ(this.LIZ, c91613if.LIZ) && this.LIZIZ == c91613if.LIZIZ && o.LJ(this.LIZJ, c91613if.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnQueryMessageEvent(list=");
        LIZ.append(this.LIZ);
        LIZ.append(", direction=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", from=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91613if(List<? extends C109544Rq> list, int i, String str) {
        o.LJIIIZ(list, "list");
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
