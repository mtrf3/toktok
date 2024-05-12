package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ESl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36455ESl {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<String> LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36455ESl)) {
            return false;
        }
        C36455ESl c36455ESl = (C36455ESl) obj;
        return o.LJ(this.LIZ, c36455ESl.LIZ) && this.LIZIZ == c36455ESl.LIZIZ && this.LIZJ == c36455ESl.LIZJ;
    }

    public final int hashCode() {
        return JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(ORZ.LLD(this.LIZ, ",", null, null, null, 62));
        LIZ.append('|');
        LIZ.append(this.LIZIZ);
        LIZ.append('|');
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public C36455ESl(List<String> packageNames, long j, int i) {
        o.LJIIIZ(packageNames, "packageNames");
        this.LIZ = packageNames;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
