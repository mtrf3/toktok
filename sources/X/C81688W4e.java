package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W4e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81688W4e<T> implements W4P<W4W<T>> {
    public final List<W4P<W4W<T>>> LIZ;
    public final boolean LIZIZ;

    @Override // X.W4P
    public final Object get() {
        return new C81696W4m(this);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        LIZIZ.LIZIZ(this.LIZ, "list");
        return LIZIZ.toString();
    }

    public C81688W4e(List list) {
        C32151Nz.LJFF("List of suppliers is empty!", !((ArrayList) list).isEmpty());
        this.LIZ = list;
        this.LIZIZ = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C81688W4e)) {
            return false;
        }
        return C81256Vum.LIZ(this.LIZ, ((C81688W4e) obj).LIZ);
    }
}
