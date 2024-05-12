package X;

import kotlin.jvm.internal.o;

/* renamed from: X.V7v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79235V7v extends C79236V7w {
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C86898Y8o LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.LIZLLL, this.LIZJ * 31, 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        if (!this.LJI) {
            i = 0;
        }
        int i4 = (i3 + i) * 31;
        C86898Y8o c86898Y8o = this.LJII;
        if (c86898Y8o == null) {
            hashCode = 0;
        } else {
            hashCode = c86898Y8o.hashCode();
        }
        return i4 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileTabStandardData(standardType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tabName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", resId=");
        LIZ.append(this.LJ);
        LIZ.append(", supportAlert=");
        LIZ.append(this.LJFF);
        LIZ.append(", textModeSupportIcon=");
        LIZ.append(this.LJI);
        LIZ.append(", listener=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C79236V7w
    public final C86898Y8o LIZ() {
        return this.LJII;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79235V7v)) {
            return false;
        }
        C79235V7v c79235V7v = (C79235V7v) obj;
        if (this.LIZJ == c79235V7v.LIZJ && o.LJ(this.LIZLLL, c79235V7v.LIZLLL) && this.LJ == c79235V7v.LJ && this.LJFF == c79235V7v.LJFF && this.LJI == c79235V7v.LJI && o.LJ(this.LJII, c79235V7v.LJII)) {
            return true;
        }
        return false;
    }

    public C79235V7v(int i, String str, int i2, boolean z, boolean z2, C86898Y8o c86898Y8o) {
        super(i, c86898Y8o);
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = i2;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = c86898Y8o;
    }
}
