package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102283zs {
    public final List<C4J7> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C102283zs)) {
            return false;
        }
        C102283zs c102283zs = (C102283zs) obj;
        return o.LJ(this.LIZ, c102283zs.LIZ) && this.LIZIZ == c102283zs.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMResponse(data=");
        LIZ.append(this.LIZ);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C102283zs(List<C4J7> data, boolean z) {
        o.LJIIIZ(data, "data");
        this.LIZ = data;
        this.LIZIZ = z;
    }
}
