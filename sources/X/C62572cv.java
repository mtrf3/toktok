package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62572cv {
    public final Class<?> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62572cv)) {
            return false;
        }
        C62572cv c62572cv = (C62572cv) obj;
        return o.LJ(this.LIZ, c62572cv.LIZ) && o.LJ(this.LIZIZ, c62572cv.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HierarchyDataIdentifier(clazz=");
        LIZ.append(this.LIZ);
        LIZ.append(", key=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C62572cv(Class<?> clazz, String str) {
        o.LJIIIZ(clazz, "clazz");
        this.LIZ = clazz;
        this.LIZIZ = str;
    }
}
