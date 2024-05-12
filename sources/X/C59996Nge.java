package X;

/* renamed from: X.Nge, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59996Nge {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer[] LIZJ;
    public C59996Nge LIZLLL;
    public C59996Nge LJ;
    public int LJFF;
    public long LJI;

    public C59996Nge(int i, int i2, Integer[] numArr) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = numArr;
    }

    public final long LIZ(int i, int i2, int i3) {
        if (i >= i2) {
            return 0L;
        }
        int i4 = this.LIZ;
        if (i4 == i && this.LIZIZ == i2) {
            this.LJFF += i3;
        } else {
            if (this.LIZLLL == null) {
                this.LIZLLL = new C59996Nge(i4, AnonymousClass030.LIZJ(this.LIZIZ, i4, 2, i4), this.LIZJ);
            }
            this.LIZLLL.LIZ(i, Math.min(((this.LIZIZ - i4) / 2) + i4, i2), i3);
            if (this.LJ == null) {
                int i5 = this.LIZ;
                int i6 = this.LIZIZ;
                this.LJ = new C59996Nge(AnonymousClass030.LIZJ(i6, i5, 2, i5), i6, this.LIZJ);
            }
            C59996Nge c59996Nge = this.LJ;
            int i7 = this.LIZ;
            c59996Nge.LIZ(Math.max(((this.LIZIZ - i7) / 2) + i7, i), i2, i3);
        }
        if (this.LJFF > 0) {
            this.LJI = this.LIZJ[this.LIZIZ].intValue() - this.LIZJ[this.LIZ].intValue();
        } else {
            if (this.LIZLLL == null) {
                int i8 = this.LIZ;
                this.LIZLLL = new C59996Nge(i8, AnonymousClass030.LIZJ(this.LIZIZ, i8, 2, i8), this.LIZJ);
            }
            long j = this.LIZLLL.LJI;
            if (this.LJ == null) {
                int i9 = this.LIZ;
                int i10 = this.LIZIZ;
                this.LJ = new C59996Nge(AnonymousClass030.LIZJ(i10, i9, 2, i9), i10, this.LIZJ);
            }
            this.LJI = j + this.LJ.LJI;
        }
        return this.LJI;
    }
}
