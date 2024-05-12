package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.POi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64376POi {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64376POi)) {
            return false;
        }
        C64376POi c64376POi = (C64376POi) obj;
        return o.LJ(this.LIZ, c64376POi.LIZ) && this.LIZIZ == c64376POi.LIZIZ && this.LIZJ == c64376POi.LIZJ && o.LJ(this.LIZLLL, c64376POi.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Content(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", index=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", size=");
        LIZ.append(this.LIZJ);
        LIZ.append(", msg=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C64376POi(String str, int i, int i2, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
    }
}
