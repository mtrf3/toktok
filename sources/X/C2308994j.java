package X;

import kotlin.jvm.internal.o;

/* renamed from: X.94j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2308994j {
    public final Object LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2308994j) && o.LJ(this.LIZ, ((C2308994j) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheValue(data=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C2308994j(Object obj) {
        this.LIZ = obj;
    }
}
