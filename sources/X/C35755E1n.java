package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.E1n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35755E1n {
    public String LIZ;
    public Integer LIZIZ;

    public C35755E1n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35755E1n)) {
            return false;
        }
        C35755E1n c35755E1n = (C35755E1n) obj;
        return o.LJ(this.LIZ, c35755E1n.LIZ) && o.LJ(this.LIZIZ, c35755E1n.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VopTextState(textJson=");
        LIZ.append(this.LIZ);
        LIZ.append(", textState=");
        return s0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35755E1n(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
