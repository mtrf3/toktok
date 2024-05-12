package X;

/* renamed from: X.0va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23180va {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RippleAlpha(draggedAlpha=");
        LIZ.append(this.LIZ);
        LIZ.append(", focusedAlpha=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hoveredAlpha=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pressedAlpha=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23180va)) {
            return false;
        }
        C23180va c23180va = (C23180va) obj;
        if (this.LIZ == c23180va.LIZ && this.LIZIZ == c23180va.LIZIZ && this.LIZJ == c23180va.LIZJ && this.LIZLLL == c23180va.LIZLLL) {
            return true;
        }
        return false;
    }

    public C23180va(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
