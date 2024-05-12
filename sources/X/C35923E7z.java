package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E7z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35923E7z {
    public final Object LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35923E7z)) {
            return false;
        }
        C35923E7z c35923E7z = (C35923E7z) obj;
        return o.LJ(this.LIZ, c35923E7z.LIZ) && o.LJ(this.LIZIZ, c35923E7z.LIZIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.LIZIZ;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageCursor(prev=");
        LIZ.append(this.LIZ);
        LIZ.append(", next=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35923E7z(Object obj, Object obj2) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
    }
}
