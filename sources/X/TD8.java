package X;

import Y.ARunnableS44S0100000_8;
import Y.ARunnableS48S0100000_12;

/* loaded from: classes13.dex */
public final class TD8 {
    public int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public int LJII;
    public boolean LJIIIZ;
    public final boolean LJIIJ;
    public final TD7 LJIIL;
    public int LIZ = 40;
    public int LIZIZ = 10;
    public int LIZJ = -1;
    public boolean LJI = true;
    public boolean LJIIIIZZ = true;
    public final ARunnableS48S0100000_12 LJIIJJI = new ARunnableS48S0100000_12(this, 65);

    public final void LIZ() {
        int i;
        int i2;
        int i3;
        if (this.LJI) {
            return;
        }
        int i4 = -1;
        if (this.LJII <= 0) {
            int i5 = this.LIZJ;
            if (i5 > 0) {
                this.LIZJ = i5 - 1;
                if (this.LJIIIIZZ) {
                    this.LJIIIIZZ = false;
                    this.LJII = this.LJ;
                } else {
                    TD7 td7 = this.LJIIL;
                    int i6 = (-this.LJ) - this.LJFF;
                    if (this.LJIIJ) {
                        i3 = -1;
                    } else {
                        i3 = 1;
                    }
                    td7.scrollBy(i6 * i3, 0);
                    this.LJII = this.LJ + this.LJFF;
                    this.LJIIL.postOnAnimation(new ARunnableS44S0100000_8(new TD9(this.LJIIJJI), (InterfaceC65784Pro<C76800UCe>) 80));
                    return;
                }
            } else if (i5 < 0) {
                if (this.LJIIIIZZ) {
                    this.LJIIIIZZ = false;
                    this.LJII = this.LJ;
                } else {
                    TD7 td72 = this.LJIIL;
                    int i7 = (-this.LJ) - this.LJFF;
                    if (this.LJIIJ) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    td72.scrollBy(i7 * i2, 0);
                    this.LJII = this.LJ + this.LJFF;
                    this.LJIIL.postOnAnimation(new ARunnableS44S0100000_8(new TD9(this.LJIIJJI), (InterfaceC65784Pro<C76800UCe>) 80));
                    return;
                }
            } else if (this.LJIIIZ) {
                this.LJII = 0;
            } else {
                if (!this.LJIIIIZZ) {
                    TD7 td73 = this.LJIIL;
                    int i8 = (-this.LJ) - this.LJFF;
                    if (this.LJIIJ) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    td73.scrollBy(i8 * i, 0);
                }
                this.LJIIIZ = true;
                if (this.LJIIIIZZ) {
                    this.LJIIIIZZ = true;
                    this.LJII = this.LIZLLL;
                } else {
                    this.LJII = this.LJFF + this.LIZLLL;
                }
                this.LJIIL.postOnAnimation(new ARunnableS44S0100000_8(new TD9(this.LJIIJJI), (InterfaceC65784Pro<C76800UCe>) 80));
                return;
            }
        }
        int i9 = this.LJII;
        if (i9 <= 0) {
            this.LJI = true;
            return;
        }
        int i10 = this.LIZ;
        int i11 = (this.LIZIZ * i10) / 1000;
        if (i11 > i9) {
            i11 = i9;
        } else if (i11 <= 0) {
            this.LJII = i9 - 1;
            int i12 = 1000 / i10;
            TD7 td74 = this.LJIIL;
            if (!this.LJIIJ) {
                i4 = 1;
            }
            td74.scrollBy(i4, 0);
            this.LJIIL.postOnAnimationDelayed(new ARunnableS44S0100000_8(new TDA(this.LJIIJJI), (InterfaceC65784Pro<C76800UCe>) 80), i12);
            return;
        }
        this.LJII = i9 - i11;
        TD7 td75 = this.LJIIL;
        if (!this.LJIIJ) {
            i4 = 1;
        }
        td75.scrollBy(i11 * i4, 0);
        this.LJIIL.postOnAnimationDelayed(new ARunnableS44S0100000_8(new TDB(this.LJIIJJI), (InterfaceC65784Pro<C76800UCe>) 80), this.LIZIZ);
    }

    public TD8(TD7 td7) {
        this.LJIIL = td7;
        this.LJ = (int) td7.getPaint().measureText(td7.getText().toString());
        this.LJFF = (td7.getMeasuredWidth() - td7.getPaddingLeft()) - td7.getPaddingRight();
        this.LJIIJ = td7.LJJIJL();
    }
}
