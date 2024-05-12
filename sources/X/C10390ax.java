package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10390ax {
    public static final C10390ax LJ = new C10390ax(0.0f, 0.0f, 0.0f, 0.0f);
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10390ax)) {
            return false;
        }
        C10390ax c10390ax = (C10390ax) obj;
        return o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c10390ax.LIZ)) && o.LJ(Float.valueOf(this.LIZIZ), Float.valueOf(c10390ax.LIZIZ)) && o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c10390ax.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c10390ax.LIZLLL));
    }

    public final long LIZ() {
        float f = this.LIZ;
        float LIZ = C1I0.LIZ(this.LIZJ, f, 2.0f, f);
        float f2 = this.LIZIZ;
        return C78923UyF.LIZ(LIZ, ((this.LIZLLL - f2) / 2.0f) + f2);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Rect.fromLTRB(");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZIZ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZJ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZIZ(C10390ax other) {
        o.LJIIIZ(other, "other");
        if (this.LIZJ <= other.LIZ || other.LIZJ <= this.LIZ || this.LIZLLL <= other.LIZIZ || other.LIZLLL <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    public final C10390ax LIZLLL(long j) {
        return new C10390ax(C10370av.LIZLLL(j) + this.LIZ, C10370av.LJ(j) + this.LIZIZ, C10370av.LIZLLL(j) + this.LIZJ, C10370av.LJ(j) + this.LIZLLL);
    }

    public final C10390ax LIZJ(float f, float f2) {
        return new C10390ax(this.LIZ + f, this.LIZIZ + f2, this.LIZJ + f, this.LIZLLL + f2);
    }

    public C10390ax(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
