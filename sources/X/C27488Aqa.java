package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27488Aqa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27488Aqa)) {
            return false;
        }
        C27488Aqa c27488Aqa = (C27488Aqa) obj;
        return o.LJ(this.LIZ, c27488Aqa.LIZ) && o.LJ(this.LIZIZ, c27488Aqa.LIZIZ) && o.LJ(this.LIZJ, c27488Aqa.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhoneModel(iso=");
        LIZ.append(this.LIZ);
        LIZ.append(", countryCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", number=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C27488Aqa(String str, String str2, String str3) {
        HH1.LIZ(str, "iso", str2, "countryCode", str3, "number");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
