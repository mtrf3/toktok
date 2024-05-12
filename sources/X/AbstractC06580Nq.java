package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06580Nq {
    public static final C1I9 LIZ = new C1I9(new C06560No(null, null, null, null, 15));

    public abstract C06560No LIZ();

    public final int hashCode() {
        return LIZ().hashCode();
    }

    public final C1I9 LIZIZ(C1I9 enter) {
        o.LJIIIZ(enter, "enter");
        C06560No c06560No = ((C1I9) this).LIZIZ;
        C1ID c1id = c06560No.LIZ;
        if (c1id == null) {
            c1id = enter.LIZIZ.LIZ;
        }
        C1I3 c1i3 = c06560No.LIZIZ;
        if (c1i3 == null) {
            c1i3 = enter.LIZIZ.LIZIZ;
        }
        C1I8 c1i8 = c06560No.LIZJ;
        if (c1i8 == null) {
            c1i8 = enter.LIZIZ.LIZJ;
        }
        C0O4 c0o4 = c06560No.LIZLLL;
        if (c0o4 == null) {
            c0o4 = enter.LIZIZ.LIZLLL;
        }
        return new C1I9(new C06560No(c1id, c1i3, c1i8, c0o4));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AbstractC06580Nq) && o.LJ(((AbstractC06580Nq) obj).LIZ(), LIZ())) {
            return true;
        }
        return false;
    }
}
