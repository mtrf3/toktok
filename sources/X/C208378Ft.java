package X;

import defpackage.b0;

/* renamed from: X.8Ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208378Ft {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final int LJI;
    public final int LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C208378Ft)) {
            return false;
        }
        C208378Ft c208378Ft = (C208378Ft) obj;
        return this.LIZ == c208378Ft.LIZ && this.LIZIZ == c208378Ft.LIZIZ && this.LIZJ == c208378Ft.LIZJ && this.LIZLLL == c208378Ft.LIZLLL && this.LJ == c208378Ft.LJ && Float.compare(this.LJFF, c208378Ft.LJFF) == 0 && this.LJI == c208378Ft.LJI && this.LJII == c208378Ft.LJII;
    }

    public final int hashCode() {
        return ((C47959Irz.LIZIZ(this.LJFF, ((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31, 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpanParams(index=");
        LIZ.append(this.LIZ);
        LIZ.append(", backgroundHeight=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textViewHeight=");
        LIZ.append(this.LIZJ);
        LIZ.append(", closeBtnWidth=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", closeBtnHeight=");
        LIZ.append(this.LJ);
        LIZ.append(", radius=");
        LIZ.append(this.LJFF);
        LIZ.append(", totalPadding=");
        LIZ.append(this.LJI);
        LIZ.append(", backgroundColor=");
        return b0.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C208378Ft(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = f;
        this.LJI = i6;
        this.LJII = i7;
    }
}
