package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36881ca extends AbstractC260710p {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36881ca) && o.LJ(this.LIZ, ((C36881ca) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchCategoryData(category=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C36881ca(String category) {
        o.LJIIIZ(category, "category");
        this.LIZ = category;
    }
}
