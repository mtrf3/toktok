package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1P9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P9 implements InterfaceC09420Yo {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaddingValues(start=");
        C0SV.LIZ(this.LIZ, LIZ, ", top=");
        C0SV.LIZ(this.LIZIZ, LIZ, ", end=");
        C0SV.LIZ(this.LIZJ, LIZ, ", bottom=");
        LIZ.append((Object) C23390vv.LIZLLL(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC09420Yo
    public final float LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC09420Yo
    public final float LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC09420Yo
    public final float LIZ(EnumC23500w6 layoutDirection) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        if (layoutDirection == EnumC23500w6.Ltr) {
            return this.LIZJ;
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC09420Yo
    public final float LIZJ(EnumC23500w6 layoutDirection) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        if (layoutDirection == EnumC23500w6.Ltr) {
            return this.LIZ;
        }
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1P9)) {
            return false;
        }
        C1P9 c1p9 = (C1P9) obj;
        if (!C23390vv.LIZJ(this.LIZ, c1p9.LIZ) || !C23390vv.LIZJ(this.LIZIZ, c1p9.LIZIZ) || !C23390vv.LIZJ(this.LIZJ, c1p9.LIZJ) || !C23390vv.LIZJ(this.LIZLLL, c1p9.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C1P9(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
