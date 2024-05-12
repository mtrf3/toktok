package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JU2 extends JUD {
    public final boolean LIZ;
    public final List<InterfaceC49220JTk> LIZIZ;

    public JU2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JU2)) {
            return false;
        }
        JU2 ju2 = (JU2) obj;
        return this.LIZ == ju2.LIZ && o.LJ(this.LIZIZ, ju2.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<InterfaceC49220JTk> list = this.LIZIZ;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnableState(canPlay=");
        LIZ.append(this.LIZ);
        LIZ.append(", allEnableStatus=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ JU2(int i) {
        this(false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JU2(boolean z, List<? extends InterfaceC49220JTk> list) {
        this.LIZ = z;
        this.LIZIZ = list;
    }
}
