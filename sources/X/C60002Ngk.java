package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ngk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60002Ngk {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final List<C60001Ngj> LJIIIZ;

    public C60002Ngk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60002Ngk)) {
            return false;
        }
        C60002Ngk c60002Ngk = (C60002Ngk) obj;
        return this.LIZ == c60002Ngk.LIZ && this.LIZIZ == c60002Ngk.LIZIZ && this.LIZJ == c60002Ngk.LIZJ && this.LIZLLL == c60002Ngk.LIZLLL && o.LJ(this.LJ, c60002Ngk.LJ) && Float.compare(this.LJFF, c60002Ngk.LJFF) == 0 && Float.compare(this.LJI, c60002Ngk.LJI) == 0 && Float.compare(this.LJII, c60002Ngk.LJII) == 0 && Float.compare(this.LJIIIIZZ, c60002Ngk.LJIIIIZZ) == 0 && o.LJ(this.LJIIIZ, c60002Ngk.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJIIIIZZ, C47959Irz.LIZIZ(this.LJII, C47959Irz.LIZIZ(this.LJI, C47959Irz.LIZIZ(this.LJFF, C79062V1e.LJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, r0 * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        List<C60001Ngj> list = this.LJIIIZ;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StaticImpressionData(effectiveImpression=");
        LIZ.append(this.LIZ);
        LIZ.append(", costTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", viewTraversalTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", calculationTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", impressionRect=");
        LIZ.append(this.LJ);
        LIZ.append(", impressionArea=");
        LIZ.append(this.LJFF);
        LIZ.append(", coveredArea=");
        LIZ.append(this.LJI);
        LIZ.append(", exposePiv=");
        LIZ.append(this.LJII);
        LIZ.append(", piv=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", obstructionViews=");
        return C1NE.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public /* synthetic */ C60002Ngk(int i) {
        this(false, 0L, 0L, 0L, "", 0.0f, 0.0f, 0.0f, 0.0f, null);
    }

    public C60002Ngk(boolean z, long j, long j2, long j3, String impressionRect, float f, float f2, float f3, float f4, List<C60001Ngj> list) {
        o.LJIIIZ(impressionRect, "impressionRect");
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = impressionRect;
        this.LJFF = f;
        this.LJI = f2;
        this.LJII = f3;
        this.LJIIIIZZ = f4;
        this.LJIIIZ = list;
    }
}
