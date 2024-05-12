package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214318b5 extends SZD {
    public final Class<?> LIZJ;
    public final EnumC214308b4 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C214318b5)) {
            return false;
        }
        C214318b5 c214318b5 = (C214318b5) obj;
        return o.LJ(this.LIZJ, c214318b5.LIZJ) && this.LIZLLL == c214318b5.LIZLLL;
    }

    public final int hashCode() {
        Class<?> cls = this.LIZJ;
        return this.LIZLLL.hashCode() + ((cls == null ? 0 : cls.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AssemViewModelCreatePerformanceParams(host=");
        LIZ.append(this.LIZJ);
        LIZ.append(", type=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C214318b5(Class<?> cls, EnumC214308b4 type) {
        o.LJIIIZ(type, "type");
        this.LIZJ = cls;
        this.LIZLLL = type;
    }
}
