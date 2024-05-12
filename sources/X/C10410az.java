package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10410az {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;

    static {
        C78926UyI.LIZLLL(C10340as.LIZ, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10410az)) {
            return false;
        }
        C10410az c10410az = (C10410az) obj;
        return o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c10410az.LIZ)) && o.LJ(Float.valueOf(this.LIZIZ), Float.valueOf(c10410az.LIZIZ)) && o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c10410az.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c10410az.LIZLLL)) && C10340as.LIZ(this.LJ, c10410az.LJ) && C10340as.LIZ(this.LJFF, c10410az.LJFF) && C10340as.LIZ(this.LJI, c10410az.LJI) && C10340as.LIZ(this.LJII, c10410az.LJII);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJII) + JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        long j = this.LJ;
        long j2 = this.LJFF;
        long j3 = this.LJI;
        long j4 = this.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZIZ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZJ));
        LIZ.append(", ");
        LIZ.append(C87277YNd.LJJJJIZL(this.LIZLLL));
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (C10340as.LIZ(j, j2) && C10340as.LIZ(j2, j3) && C10340as.LIZ(j3, j4)) {
            if (C10340as.LIZIZ(j) == C10340as.LIZJ(j)) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("RoundRect(rect=", LIZIZ, ", radius=");
                LIZIZ2.append(C87277YNd.LJJJJIZL(C10340as.LIZIZ(j)));
                LIZIZ2.append(')');
                return X1D.LIZIZ(LIZIZ2);
            }
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("RoundRect(rect=", LIZIZ, ", x=");
            LIZIZ3.append(C87277YNd.LJJJJIZL(C10340as.LIZIZ(j)));
            LIZIZ3.append(", y=");
            LIZIZ3.append(C87277YNd.LJJJJIZL(C10340as.LIZJ(j)));
            LIZIZ3.append(')');
            return X1D.LIZIZ(LIZIZ3);
        }
        StringBuilder LIZIZ4 = C25620zW.LIZIZ("RoundRect(rect=", LIZIZ, ", topLeft=");
        LIZIZ4.append((Object) C10340as.LIZLLL(j));
        LIZIZ4.append(", topRight=");
        LIZIZ4.append((Object) C10340as.LIZLLL(j2));
        LIZIZ4.append(", bottomRight=");
        LIZIZ4.append((Object) C10340as.LIZLLL(j3));
        LIZIZ4.append(", bottomLeft=");
        LIZIZ4.append((Object) C10340as.LIZLLL(j4));
        LIZIZ4.append(')');
        return X1D.LIZIZ(LIZIZ4);
    }

    public C10410az(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = j4;
    }
}
