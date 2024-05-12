package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1LV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LV extends AbstractC07660Ru {
    public final List<AnonymousClass015> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LV) && o.LJ(this.LIZ, ((C1LV) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateTabList(tabs=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1LV(List<AnonymousClass015> list) {
        this.LIZ = list;
    }
}
