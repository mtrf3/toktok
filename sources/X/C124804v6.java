package X;

import android.graphics.PointF;
import kotlin.jvm.internal.o;

/* renamed from: X.4v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124804v6 {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    public final PointF LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124804v6)) {
            return false;
        }
        C124804v6 c124804v6 = (C124804v6) obj;
        return o.LJ(this.LIZ, c124804v6.LIZ) && o.LJ(this.LIZIZ, c124804v6.LIZIZ) && o.LJ(this.LIZJ, c124804v6.LIZJ) && o.LJ(this.LIZLLL, c124804v6.LIZLLL);
    }

    public final int hashCode() {
        PointF pointF = this.LIZ;
        int hashCode = (pointF == null ? 0 : pointF.hashCode()) * 31;
        PointF pointF2 = this.LIZIZ;
        int hashCode2 = (hashCode + (pointF2 == null ? 0 : pointF2.hashCode())) * 31;
        PointF pointF3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (pointF3 == null ? 0 : pointF3.hashCode())) * 31;
        PointF pointF4 = this.LIZLLL;
        return hashCode3 + (pointF4 != null ? pointF4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CropParam(leftTop=");
        LIZ.append(this.LIZ);
        LIZ.append(", rightTop=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", leftBottom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", rightBottom=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C124804v6(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.LIZ = pointF;
        this.LIZIZ = pointF2;
        this.LIZJ = pointF3;
        this.LIZLLL = pointF4;
    }
}
