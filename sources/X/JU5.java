package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JU5 extends JUC {
    public final int LIZ;
    public final List<InterfaceC49220JTk> LIZIZ;

    public /* synthetic */ JU5() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JU5)) {
            return false;
        }
        JU5 ju5 = (JU5) obj;
        return this.LIZ == ju5.LIZ && o.LJ(this.LIZIZ, ju5.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        List<InterfaceC49220JTk> list = this.LIZIZ;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StatusIntent(currentEnable=");
        LIZ.append(this.LIZ);
        LIZ.append(", allStatus=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JU5(int i, List<? extends InterfaceC49220JTk> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
