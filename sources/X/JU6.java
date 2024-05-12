package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JU6 extends JUC {
    public final List<InterfaceC49148JQq> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JU6)) {
            return false;
        }
        JU6 ju6 = (JU6) obj;
        return o.LJ(this.LIZ, ju6.LIZ) && this.LIZIZ == ju6.LIZIZ;
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
        LIZ.append("DataIntent(playableList=");
        LIZ.append(this.LIZ);
        LIZ.append(", ignoreStateCheck=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JU6(List<? extends InterfaceC49148JQq> playableList, boolean z) {
        o.LJIIIZ(playableList, "playableList");
        this.LIZ = playableList;
        this.LIZIZ = z;
    }
}
