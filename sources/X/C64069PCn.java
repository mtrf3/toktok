package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PCn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64069PCn<A, B> {
    public static final /* synthetic */ int LIZJ = 0;
    public final A LIZ;
    public final B LIZIZ;

    public C64069PCn() {
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        A a = this.LIZ;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        B b = this.LIZIZ;
        if (b != null) {
            i = b.hashCode();
        }
        return i2 + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C64069PCn.class, obj.getClass())) {
            return false;
        }
        C64069PCn c64069PCn = (C64069PCn) obj;
        A a = this.LIZ;
        if (a == null) {
            if (c64069PCn.LIZ != null) {
                return false;
            }
        } else if (!o.LJ(a, c64069PCn.LIZ)) {
            return false;
        }
        B b = this.LIZIZ;
        if (b == null) {
            if (c64069PCn.LIZIZ != null) {
                return false;
            }
        } else if (!o.LJ(b, c64069PCn.LIZIZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C64069PCn(Object obj, Object obj2) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
    }
}
