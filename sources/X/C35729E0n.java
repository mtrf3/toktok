package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.E0n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35729E0n {
    public final String LIZ;
    public final List<AbstractC83320Wmy> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35729E0n)) {
            return false;
        }
        C35729E0n c35729E0n = (C35729E0n) obj;
        return o.LJ(this.LIZ, c35729E0n.LIZ) && o.LJ(this.LIZIZ, c35729E0n.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<AbstractC83320Wmy> list = this.LIZIZ;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UIDataModel(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", options=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35729E0n(String title, List<? extends AbstractC83320Wmy> list) {
        o.LJIIIZ(title, "title");
        this.LIZ = title;
        this.LIZIZ = list;
    }
}
