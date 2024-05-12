package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13390fn {
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AsyncTypefaceResult(result=");
        LIZ.append(obj);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.LIZ;
        if (!(obj instanceof C13390fn) || !o.LJ(obj2, ((C13390fn) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
