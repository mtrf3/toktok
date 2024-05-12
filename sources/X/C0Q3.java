package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Q3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Q3<T> {
    public final T LIZ;
    public InterfaceC07020Pi LIZIZ;

    public C0Q3() {
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        T t = this.LIZ;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return this.LIZIZ.hashCode() + (hashCode * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0Q3(Object obj) {
        C1J1 c1j1 = C1J1.LIZ;
        this.LIZ = obj;
        this.LIZIZ = c1j1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0Q3) {
            C0Q3 c0q3 = (C0Q3) obj;
            if (o.LJ(c0q3.LIZ, this.LIZ) && o.LJ(c0q3.LIZIZ, this.LIZIZ)) {
                return true;
            }
        }
        return false;
    }
}
