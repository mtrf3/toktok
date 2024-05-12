package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JU4 extends JUD {
    public final List<InterfaceC49148JQq> LIZ;
    public final boolean LIZIZ;

    public JU4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JU4)) {
            return false;
        }
        JU4 ju4 = (JU4) obj;
        return o.LJ(this.LIZ, ju4.LIZ) && this.LIZIZ == ju4.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<InterfaceC49148JQq> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataState(playableList=");
        LIZ.append(this.LIZ);
        LIZ.append(", ignoreStateCheck=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ JU4(int i) {
        this(null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JU4(List<? extends InterfaceC49148JQq> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
