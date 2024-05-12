package X;

import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.XZt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85057XZt {
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final boolean LIZLLL;
    public String LJ;
    public String LJFF;

    public C85057XZt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85057XZt)) {
            return false;
        }
        C85057XZt c85057XZt = (C85057XZt) obj;
        return this.LIZ == c85057XZt.LIZ && o.LJ(this.LIZIZ, c85057XZt.LIZIZ) && o.LJ(this.LIZJ, c85057XZt.LIZJ) && this.LIZLLL == c85057XZt.LIZLLL && o.LJ(this.LJ, c85057XZt.LJ) && o.LJ(this.LJFF, c85057XZt.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31), 31);
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJFF.hashCode() + C79062V1e.LJ(this.LJ, (LJ + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Upsell2svPopUpData(drawableImg=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", message=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showClose=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", primaryActionText=");
        LIZ.append(this.LJ);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C85057XZt(int i) {
        this.LIZ = R.drawable.bej;
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = true;
        this.LJ = "";
        this.LJFF = "";
    }
}
