package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06620Nu {
    public static final C1IB LIZ = new C1IB(new C06560No(null, null, null, null, 15));

    public abstract C06560No LIZ();

    public final int hashCode() {
        return LIZ().hashCode();
    }

    public final C1IB LIZIZ(C1IB exit) {
        o.LJIIIZ(exit, "exit");
        C06560No c06560No = ((C1IB) this).LIZIZ;
        C1ID c1id = c06560No.LIZ;
        if (c1id == null) {
            c1id = exit.LIZIZ.LIZ;
        }
        C1I3 c1i3 = c06560No.LIZIZ;
        if (c1i3 == null) {
            c1i3 = exit.LIZIZ.LIZIZ;
        }
        C1I8 c1i8 = c06560No.LIZJ;
        if (c1i8 == null) {
            c1i8 = exit.LIZIZ.LIZJ;
        }
        C0O4 c0o4 = c06560No.LIZLLL;
        if (c0o4 == null) {
            c0o4 = exit.LIZIZ.LIZLLL;
        }
        return new C1IB(new C06560No(c1id, c1i3, c1i8, c0o4));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AbstractC06620Nu) && o.LJ(((AbstractC06620Nu) obj).LIZ(), LIZ())) {
            return true;
        }
        return false;
    }
}
