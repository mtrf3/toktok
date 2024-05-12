package X;

import java.util.List;

/* renamed from: X.11s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C263611s {
    public final List<C38851fl> LIZ;
    public final char LIZIZ;
    public final double LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final int hashCode() {
        char c = this.LIZIZ;
        String str = this.LJ;
        String str2 = this.LIZLLL;
        return str2.hashCode() + C79062V1e.LJ(str, c * 31, 31);
    }

    public C263611s(List list, char c, double d, String str, String str2) {
        this.LIZ = list;
        this.LIZIZ = c;
        this.LIZJ = d;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
