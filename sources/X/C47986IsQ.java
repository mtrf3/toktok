package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IsQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47986IsQ<T> {
    public final Class<T> LIZ;
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47986IsQ)) {
            return false;
        }
        C47986IsQ c47986IsQ = (C47986IsQ) obj;
        return o.LJ(this.LIZ, c47986IsQ.LIZ) && o.LJ(this.LIZIZ, c47986IsQ.LIZIZ);
    }

    public final int hashCode() {
        Class<T> cls = this.LIZ;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        T t = this.LIZIZ;
        return hashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ParamsItem(inputType=");
        LIZ.append(this.LIZ);
        LIZ.append(", input=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C47986IsQ(Class<T> cls, T t) {
        this.LIZ = cls;
        this.LIZIZ = t;
    }
}
