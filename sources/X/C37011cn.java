package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37011cn extends AbstractC261010s {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37011cn) && o.LJ(this.LIZ, ((C37011cn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CategoryLoading(category=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C37011cn(String category) {
        o.LJIIIZ(category, "category");
        this.LIZ = category;
    }
}
