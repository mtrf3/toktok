package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21870tT {
    public static final /* synthetic */ int LIZIZ = 0;
    public final float LIZ;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        float f = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaselineShift(multiplier=");
        LIZ.append(f);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        float f = this.LIZ;
        if (!(obj instanceof C21870tT)) {
            return false;
        }
        if (!o.LJ(Float.valueOf(f), Float.valueOf(((C21870tT) obj).LIZ))) {
            return false;
        }
        return true;
    }
}
