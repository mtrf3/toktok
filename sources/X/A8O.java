package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A8O extends A8N {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A8O) && o.LJ(this.LIZ, ((A8O) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FromCachedMap(price=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public A8O(String str) {
        this.LIZ = str;
    }
}
