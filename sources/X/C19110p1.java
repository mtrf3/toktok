package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0p1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19110p1<T> {
    public static final C19110p1 LJ = new C19110p1(Collections.emptyList());
    public static final C19110p1 LJFF = new C19110p1(Collections.emptyList());
    public final List<T> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZJ);
        LIZ.append(", offset ");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public C19110p1(List list) {
        this.LIZ = list;
        this.LIZLLL = 0;
    }

    public C19110p1(List list, int i, int i2) {
        this.LIZ = list;
        this.LIZIZ = 0;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
