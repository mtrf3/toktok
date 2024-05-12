package X;

import java.util.Collections;

/* renamed from: X.Iwq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48260Iwq {
    public final String LIZ;
    public final java.util.Map<Class<?>, Object> LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FieldDescriptor{name=");
        LIZ.append(this.LIZ);
        LIZ.append(", properties=");
        LIZ.append(this.LIZIZ.values());
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public static C48260Iwq LIZ(String str) {
        return new C48260Iwq(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48260Iwq)) {
            return false;
        }
        C48260Iwq c48260Iwq = (C48260Iwq) obj;
        if (this.LIZ.equals(c48260Iwq.LIZ) && this.LIZIZ.equals(c48260Iwq.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C48260Iwq(String str, java.util.Map<Class<?>, Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
