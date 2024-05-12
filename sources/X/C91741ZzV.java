package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZzV, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91741ZzV {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91741ZzV)) {
            return false;
        }
        C91741ZzV c91741ZzV = (C91741ZzV) obj;
        return o.LJ(this.LIZ, c91741ZzV.LIZ) && o.LJ(this.LIZIZ, c91741ZzV.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        if (this.LIZ.length() == 0) {
            return "";
        }
        return o.LJIILLIIL(this.LIZIZ, this.LIZ);
    }

    public C91741ZzV(String month, String year) {
        o.LJIIIZ(month, "month");
        o.LJIIIZ(year, "year");
        this.LIZ = month;
        this.LIZIZ = year;
    }
}
