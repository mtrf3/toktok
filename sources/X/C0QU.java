package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.0QU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QU {
    public static final C0QU LIZLLL = new C0QU(0.0f, new C48352IyK(0.0f, 0.0f), 0);
    public final float LIZ;
    public final InterfaceC78843Uwx<Float> LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return ((this.LIZIZ.hashCode() + (Float.floatToIntBits(this.LIZ) * 31)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProgressBarRangeInfo(current=");
        LIZ.append(this.LIZ);
        LIZ.append(", range=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", steps=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QU)) {
            return false;
        }
        C0QU c0qu = (C0QU) obj;
        if (this.LIZ == c0qu.LIZ && o.LJ(this.LIZIZ, c0qu.LIZIZ) && this.LIZJ == c0qu.LIZJ) {
            return true;
        }
        return false;
    }

    public C0QU(float f, InterfaceC78843Uwx<Float> range, int i) {
        o.LJIIIZ(range, "range");
        this.LIZ = f;
        this.LIZIZ = range;
        this.LIZJ = i;
        if (!Float.isNaN(f)) {
            return;
        }
        "current must not be NaN".toString();
        throw new IllegalArgumentException("current must not be NaN");
    }
}
