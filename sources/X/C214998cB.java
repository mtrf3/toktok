package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8cB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214998cB {
    public final long LIZ;
    public final long LIZIZ;
    public final List<InterfaceC215558d5> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C214998cB)) {
            return false;
        }
        C214998cB c214998cB = (C214998cB) obj;
        return this.LIZ == c214998cB.LIZ && this.LIZIZ == c214998cB.LIZIZ && o.LJ(this.LIZJ, c214998cB.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.LIZ);
        LIZ.append(',');
        LIZ.append(this.LIZIZ);
        LIZ.append("):");
        LIZ.append(this.LIZJ.size());
        return X1D.LIZIZ(LIZ);
    }

    public C214998cB(List list, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
    }
}
