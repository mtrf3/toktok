package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A3W extends A6I {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A3W) && o.LJ(this.LIZ, ((A3W) obj).LIZ);
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
        LIZ.append("IapSuccessPendingVerification(sourceWay=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public A3W(String str) {
        this.LIZ = str;
    }
}
