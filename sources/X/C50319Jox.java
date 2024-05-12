package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jox, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50319Jox implements InterfaceC50310Joo {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50319Jox)) {
            return false;
        }
        C50319Jox c50319Jox = (C50319Jox) obj;
        return o.LJ(this.LIZ, c50319Jox.LIZ) && o.LJ(this.LIZIZ, c50319Jox.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchEnterAction(enterMethod=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchKeyWord=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C50319Jox(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
