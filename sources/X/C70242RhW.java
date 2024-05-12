package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.RhW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70242RhW {
    public final ISpecListLayoutStyle LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70242RhW)) {
            return false;
        }
        C70242RhW c70242RhW = (C70242RhW) obj;
        return o.LJ(this.LIZ, c70242RhW.LIZ) && this.LIZIZ == c70242RhW.LIZIZ && this.LIZJ == c70242RhW.LIZJ && this.LIZLLL == c70242RhW.LIZLLL && this.LJ == c70242RhW.LJ && o.LJ(this.LJFF, c70242RhW.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LIZJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LIZLLL;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        return this.LJFF.hashCode() + ((((i4 + i5) * 31) + (this.LJ ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Params(style=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSkc=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", forceFlowLayout=");
        LIZ.append(this.LIZJ);
        LIZ.append(", needCountAdapt=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", smoothScroll=");
        LIZ.append(this.LJ);
        LIZ.append(", pageName=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C70242RhW(ISpecListLayoutStyle style, boolean z, boolean z2, boolean z3, String pageName) {
        o.LJIIIZ(style, "style");
        o.LJIIIZ(pageName, "pageName");
        this.LIZ = style;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = false;
        this.LJFF = pageName;
    }
}
