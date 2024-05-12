package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.OcH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62273OcH {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62273OcH)) {
            return false;
        }
        C62273OcH c62273OcH = (C62273OcH) obj;
        return o.LJ(this.LIZ, c62273OcH.LIZ) && o.LJ(this.LIZIZ, c62273OcH.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextItem(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", id=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C62273OcH(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
