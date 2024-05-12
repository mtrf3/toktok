package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ehs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37140Ehs extends AbstractC37141Eht {
    public final EO7 LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C37140Ehs) && o.LJ(this.LIZ, ((C37140Ehs) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        EO7 eo7 = this.LIZ;
        if (eo7 != null) {
            return eo7.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Add(filter=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C37140Ehs(EO7 filter) {
        o.LJIIIZ(filter, "filter");
        this.LIZ = filter;
    }

    @Override // X.AbstractC37141Eht
    public final void LIZ(List<EO7> target) {
        o.LJIIIZ(target, "target");
        if (!target.contains(this.LIZ)) {
            target.add(this.LIZ);
        }
    }
}
