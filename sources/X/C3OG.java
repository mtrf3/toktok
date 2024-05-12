package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3OG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OG {
    public final List<Long> LIZ;
    public final List<Long> LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageReadStatusModel{readUidList=");
        LIZ.append(this.LIZ);
        LIZ.append(", allUidList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", conId='");
        return C77800Ug8.LIZJ(LIZ, this.LIZJ, '\'', '}', LIZ);
    }

    public C3OG(List list, List list2, String str, long j) {
        this.LIZ = new ArrayList();
        this.LIZIZ = new ArrayList();
        this.LIZJ = "";
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = ((ArrayList) list).size();
        this.LJFF = ((ArrayList) list2).size();
    }
}
