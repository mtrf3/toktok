package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.V7x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79237V7x extends C79236V7w {
    public final int LIZJ;
    public final View LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final C86898Y8o LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.LIZLLL.hashCode() + (this.LIZJ * 31)) * 31) + this.LJ) * 31) + this.LJFF) * 31;
        boolean z = this.LJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        if (!this.LJII) {
            i = 0;
        }
        int i4 = (i3 + i) * 31;
        C86898Y8o c86898Y8o = this.LJIIIIZZ;
        if (c86898Y8o == null) {
            hashCode = 0;
        } else {
            hashCode = c86898Y8o.hashCode();
        }
        return i4 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileTabCustomViewData(customType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", view=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", tabType=");
        LIZ.append(this.LJ);
        LIZ.append(", indicatorWidth=");
        LIZ.append(this.LJFF);
        LIZ.append(", shouldReplaceStandard=");
        LIZ.append(this.LJI);
        LIZ.append(", isCustomViewHasStandardType=");
        LIZ.append(this.LJII);
        LIZ.append(", listener=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C79236V7w
    public final C86898Y8o LIZ() {
        return this.LJIIIIZZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79237V7x)) {
            return false;
        }
        C79237V7x c79237V7x = (C79237V7x) obj;
        if (this.LIZJ == c79237V7x.LIZJ && o.LJ(this.LIZLLL, c79237V7x.LIZLLL) && this.LJ == c79237V7x.LJ && this.LJFF == c79237V7x.LJFF && this.LJI == c79237V7x.LJI && this.LJII == c79237V7x.LJII && o.LJ(this.LJIIIIZZ, c79237V7x.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public C79237V7x(Y4F y4f, int i, int i2, boolean z, boolean z2, C86895Y8l c86895Y8l) {
        super(0, null);
        this.LIZJ = 0;
        this.LIZLLL = y4f;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = c86895Y8l;
    }
}
