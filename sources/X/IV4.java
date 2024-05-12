package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IV4<T> {
    public final T LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IV4)) {
            return false;
        }
        IV4 iv4 = (IV4) obj;
        return o.LJ(this.LIZ, iv4.LIZ) && this.LIZIZ == iv4.LIZIZ;
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestResult(result=");
        LIZ.append(this.LIZ);
        LIZ.append(", networkAttemptCount=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IV4(int i, Object obj) {
        this.LIZ = obj;
        this.LIZIZ = i;
    }
}
