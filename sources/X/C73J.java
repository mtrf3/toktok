package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.73J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73J implements InterfaceC87283bg {
    public final List<String> LJLIL;

    public C73J() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C73J) && o.LJ(this.LJLIL, ((C73J) obj).LJLIL);
    }

    public final int hashCode() {
        List<String> list = this.LJLIL;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowDistributionParam(insertUserIds=");
        return C1NE.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C73J(List<String> list) {
        this.LJLIL = list;
    }
}
