package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.R8v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69069R8v extends R74 {
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69069R8v)) {
            return false;
        }
        C69069R8v c69069R8v = (C69069R8v) obj;
        return o.LJ(this.LJFF, c69069R8v.LJFF) && o.LJ(this.LJI, c69069R8v.LJI) && o.LJ(this.LJII, c69069R8v.LJII);
    }

    public final int hashCode() {
        return this.LJII.hashCode() + C79062V1e.LJ(this.LJI, this.LJFF.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForceResetPassObj(password=");
        LIZ.append(this.LJFF);
        LIZ.append(", conditionalLoginTicket=");
        LIZ.append(this.LJI);
        LIZ.append(", ticket=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C69069R8v(String str, String str2, String str3) {
        super(0);
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
    }
}
