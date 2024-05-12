package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37031cp extends AbstractC261010s {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37031cp) && o.LJ(this.LIZ, ((C37031cp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchEffectCategoryError(category=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C37031cp(String category) {
        o.LJIIIZ(category, "category");
        this.LIZ = category;
    }
}
