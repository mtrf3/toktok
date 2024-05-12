package X;

import Y.ARunnableS44S0100000_8;

/* renamed from: X.KNf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51607KNf {
    public final C51606KNe LIZ;
    public int LJ;
    public final int LJFF;
    public final int LJI;
    public int LJIIIIZZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;
    public int LIZIZ = 40;
    public int LIZJ = 10;
    public int LIZLLL = -1;
    public boolean LJII = true;
    public boolean LJIIIZ = true;
    public final ARunnableS44S0100000_8 LJIIL = new ARunnableS44S0100000_8(this, 28);

    public final void LIZ() {
        int i;
        int i2;
        int i3;
        if (this.LJII) {
            return;
        }
        int i4 = -1;
        if (this.LJIIIIZZ <= 0) {
            int i5 = this.LIZLLL;
            if (i5 > 0) {
                this.LIZLLL = i5 - 1;
                if (this.LJIIIZ) {
                    this.LJIIIZ = false;
                    this.LJIIIIZZ = this.LJFF;
                } else {
                    C51606KNe c51606KNe = this.LIZ;
                    int i6 = (-this.LJFF) - this.LJI;
                    if (this.LJIIJJI) {
                        i3 = -1;
                    } else {
                        i3 = 1;
                    }
                    c51606KNe.scrollBy(i6 * i3, 0);
                    this.LJIIIIZZ = this.LJFF + this.LJI;
                    this.LIZ.postOnAnimation(new ARunnableS44S0100000_8(new C51608KNg(this.LJIIL), (InterfaceC65784Pro<C76800UCe>) 29));
                    return;
                }
            } else if (i5 < 0) {
                if (this.LJIIIZ) {
                    this.LJIIIZ = false;
                    this.LJIIIIZZ = this.LJFF;
                } else {
                    C51606KNe c51606KNe2 = this.LIZ;
                    int i7 = (-this.LJFF) - this.LJI;
                    if (this.LJIIJJI) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    c51606KNe2.scrollBy(i7 * i2, 0);
                    this.LJIIIIZZ = this.LJFF + this.LJI;
                    this.LIZ.postOnAnimation(new ARunnableS44S0100000_8(new C51608KNg(this.LJIIL), (InterfaceC65784Pro<C76800UCe>) 29));
                    return;
                }
            } else if (this.LJIIJ) {
                this.LJIIIIZZ = 0;
            } else {
                if (!this.LJIIIZ) {
                    C51606KNe c51606KNe3 = this.LIZ;
                    int i8 = (-this.LJFF) - this.LJI;
                    if (this.LJIIJJI) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    c51606KNe3.scrollBy(i8 * i, 0);
                }
                this.LJIIJ = true;
                if (this.LJIIIZ) {
                    this.LJIIIZ = true;
                    this.LJIIIIZZ = this.LJ;
                } else {
                    this.LJIIIIZZ = this.LJI + this.LJ;
                }
                this.LIZ.postOnAnimation(new ARunnableS44S0100000_8(new C51608KNg(this.LJIIL), (InterfaceC65784Pro<C76800UCe>) 29));
                return;
            }
        }
        int i9 = this.LJIIIIZZ;
        if (i9 <= 0) {
            this.LJII = true;
            return;
        }
        int i10 = this.LIZIZ;
        int i11 = (this.LIZJ * i10) / 1000;
        if (i11 > i9) {
            i11 = i9;
        } else if (i11 <= 0) {
            this.LJIIIIZZ = i9 - 1;
            int i12 = 1000 / i10;
            C51606KNe c51606KNe4 = this.LIZ;
            if (!this.LJIIJJI) {
                i4 = 1;
            }
            c51606KNe4.scrollBy(i4, 0);
            this.LIZ.postOnAnimationDelayed(new ARunnableS44S0100000_8(new C51609KNh(this.LJIIL), (InterfaceC65784Pro<C76800UCe>) 29), i12);
            return;
        }
        this.LJIIIIZZ = i9 - i11;
        C51606KNe c51606KNe5 = this.LIZ;
        if (!this.LJIIJJI) {
            i4 = 1;
        }
        c51606KNe5.scrollBy(i11 * i4, 0);
        this.LIZ.postOnAnimationDelayed(new ARunnableS44S0100000_8(new C51610KNi(this.LJIIL), (InterfaceC65784Pro<C76800UCe>) 29), this.LIZJ);
    }

    public C51607KNf(C51606KNe c51606KNe) {
        this.LIZ = c51606KNe;
        this.LJFF = (int) c51606KNe.getPaint().measureText(c51606KNe.getText().toString());
        this.LJI = (c51606KNe.getMeasuredWidth() - c51606KNe.getPaddingLeft()) - c51606KNe.getPaddingRight();
        this.LJIIJJI = c51606KNe.LJJJIL();
    }
}
