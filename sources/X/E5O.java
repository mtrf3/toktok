package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E5O {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;

    public E5O() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5O)) {
            return false;
        }
        E5O e5o = (E5O) obj;
        return this.LIZ == e5o.LIZ && this.LIZIZ == e5o.LIZIZ && o.LJ(this.LIZJ, e5o.LIZJ) && o.LJ(this.LIZLLL, e5o.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        List<String> list = this.LIZJ;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LIZLLL;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BootTraceConfig(isFirstInstallAndLaunch=");
        LIZ.append(this.LIZ);
        LIZ.append(", isConfigReady=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", apiLogWhitelist=");
        LIZ.append(this.LIZJ);
        LIZ.append(", apiLogBlacklist=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public E5O(boolean z, boolean z2, List list, int i) {
        list = (i & 4) != 0 ? null : list;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = list;
        this.LIZLLL = null;
    }
}
