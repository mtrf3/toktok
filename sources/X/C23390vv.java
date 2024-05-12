package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23390vv implements Comparable<C23390vv> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final float LJLIL;

    public static final boolean LIZJ(float f, float f2) {
        return o.LJ(Float.valueOf(f), Float.valueOf(f2));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJLIL);
    }

    public final String toString() {
        return LIZLLL(this.LJLIL);
    }

    public static String LIZLLL(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(f);
        LIZ.append(".dp");
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C23390vv c23390vv) {
        return Float.compare(this.LJLIL, c23390vv.LJLIL);
    }

    public final boolean equals(Object obj) {
        float f = this.LJLIL;
        if (!(obj instanceof C23390vv)) {
            return false;
        }
        if (!o.LJ(Float.valueOf(f), Float.valueOf(((C23390vv) obj).LJLIL))) {
            return false;
        }
        return true;
    }
}
