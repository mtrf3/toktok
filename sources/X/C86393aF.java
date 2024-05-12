package X;

import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3aF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86393aF implements C33Q {
    public final boolean LJLIL;
    public final List<C785736n> LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86393aF)) {
            return false;
        }
        C86393aF c86393aF = (C86393aF) obj;
        return this.LJLIL == c86393aF.LJLIL && o.LJ(this.LJLILLLLZI, c86393aF.LJLILLLLZI) && this.LJLJI == c86393aF.LJLJI && this.LJLJJI == c86393aF.LJLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<C785736n> list = this.LJLILLLLZI;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return JBR.LIZJ(this.LJLJI, (i + hashCode) * 31, 31) + this.LJLJJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMSearchState(isResultPageVisible=");
        LIZ.append(this.LJLIL);
        LIZ.append(", searchResultItemList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", searchStartTimestamp=");
        LIZ.append(this.LJLJI);
        LIZ.append(", resultCount=");
        return b0.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C86393aF(int i, long j, List list, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = list;
        this.LJLJI = j;
        this.LJLJJI = i;
    }
}
