package X;

import android.graphics.PointF;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.59N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59N {
    public float LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public float LJ;
    public final List<? extends PointF> LJFF;

    public C59N() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59N)) {
            return false;
        }
        C59N c59n = (C59N) obj;
        return Float.compare(this.LIZ, c59n.LIZ) == 0 && o.LJ(this.LIZIZ, c59n.LIZIZ) && this.LIZJ == c59n.LIZJ && o.LJ(this.LIZLLL, c59n.LIZLLL) && Float.compare(this.LJ, c59n.LJ) == 0 && o.LJ(this.LJFF, c59n.LJFF);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.LJ, C79062V1e.LJ(this.LIZLLL, (C79062V1e.LJ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31) + this.LIZJ) * 31, 31), 31);
        List<? extends PointF> list = this.LJFF;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpeedInfo(normalSpeed=");
        LIZ.append(this.LIZ);
        LIZ.append(", resourceId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", name=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", aveSpeed=");
        LIZ.append(this.LJ);
        LIZ.append(", curveSpeed=");
        return C1NE.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C59N(Object obj) {
        this.LIZ = 1.0f;
        this.LIZIZ = "";
        this.LIZJ = 0;
        this.LIZLLL = "";
        this.LJ = 1.0f;
        this.LJFF = null;
    }
}
