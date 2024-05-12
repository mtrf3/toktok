package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13400fo {
    public final InterfaceC13460fu LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13400fo)) {
            return false;
        }
        C13400fo c13400fo = (C13400fo) obj;
        return o.LJ(this.LIZ, c13400fo.LIZ) && o.LJ(this.LIZIZ, c13400fo.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Key(font=");
        LIZ.append(this.LIZ);
        LIZ.append(", loaderKey=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C13400fo(InterfaceC13460fu font, Object obj) {
        o.LJIIIZ(font, "font");
        this.LIZ = font;
        this.LIZIZ = obj;
    }
}
