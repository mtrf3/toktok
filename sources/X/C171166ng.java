package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171166ng {
    public final C08630Vn<C5S9> LIZ;
    public final C08630Vn<Boolean> LIZIZ;

    public C171166ng() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C171166ng)) {
            return false;
        }
        C171166ng c171166ng = (C171166ng) obj;
        return o.LJ(this.LIZ, c171166ng.LIZ) && o.LJ(this.LIZIZ, c171166ng.LIZIZ);
    }

    public final int hashCode() {
        C08630Vn<C5S9> c08630Vn = this.LIZ;
        int hashCode = (c08630Vn == null ? 0 : c08630Vn.hashCode()) * 31;
        C08630Vn<Boolean> c08630Vn2 = this.LIZIZ;
        return hashCode + (c08630Vn2 != null ? c08630Vn2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UgcTemplatePreviewStates(mediaStateUIEvent=");
        LIZ.append(this.LIZ);
        LIZ.append(", reshootUIEvent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C171166ng(C08630Vn<C5S9> c08630Vn, C08630Vn<Boolean> c08630Vn2) {
        this.LIZ = c08630Vn;
        this.LIZIZ = c08630Vn2;
    }

    public static C171166ng LIZ(C171166ng c171166ng, C08630Vn c08630Vn, C08630Vn c08630Vn2, int i) {
        if ((i & 1) != 0) {
            c08630Vn = c171166ng.LIZ;
        }
        if ((i & 2) != 0) {
            c08630Vn2 = c171166ng.LIZIZ;
        }
        c171166ng.getClass();
        return new C171166ng(c08630Vn, c08630Vn2);
    }
}
