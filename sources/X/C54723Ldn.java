package X;

import Y.ARunnableS45S0100000_9;

/* renamed from: X.Ldn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54723Ldn {
    public final C54722Ldm LIZ;
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
    public final ARunnableS45S0100000_9 LJIIL = new ARunnableS45S0100000_9(this, 41);

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
                    C54722Ldm c54722Ldm = this.LIZ;
                    int i6 = (-this.LJFF) - this.LJI;
                    if (this.LJIIJJI) {
                        i3 = -1;
                    } else {
                        i3 = 1;
                    }
                    c54722Ldm.scrollBy(i6 * i3, 0);
                    this.LJIIIIZZ = this.LJFF + this.LJI;
                    this.LIZ.post(new ARunnableS45S0100000_9((InterfaceC65784Pro) new C54724Ldo(this.LJIIL), 42));
                    return;
                }
            } else if (i5 < 0) {
                if (this.LJIIIZ) {
                    this.LJIIIZ = false;
                    this.LJIIIIZZ = this.LJFF;
                } else {
                    C54722Ldm c54722Ldm2 = this.LIZ;
                    int i7 = (-this.LJFF) - this.LJI;
                    if (this.LJIIJJI) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    c54722Ldm2.scrollBy(i7 * i2, 0);
                    this.LJIIIIZZ = this.LJFF + this.LJI;
                    this.LIZ.post(new ARunnableS45S0100000_9((InterfaceC65784Pro) new C54724Ldo(this.LJIIL), 42));
                    return;
                }
            } else if (this.LJIIJ) {
                this.LJIIIIZZ = 0;
            } else {
                if (!this.LJIIIZ) {
                    C54722Ldm c54722Ldm3 = this.LIZ;
                    int i8 = (-this.LJFF) - this.LJI;
                    if (this.LJIIJJI) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    c54722Ldm3.scrollBy(i8 * i, 0);
                }
                this.LJIIJ = true;
                if (this.LJIIIZ) {
                    this.LJIIIZ = true;
                    this.LJIIIIZZ = this.LJ;
                } else {
                    this.LJIIIIZZ = this.LJI + this.LJ;
                }
                this.LIZ.post(new ARunnableS45S0100000_9((InterfaceC65784Pro) new C54724Ldo(this.LJIIL), 42));
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
            C54722Ldm c54722Ldm4 = this.LIZ;
            if (!this.LJIIJJI) {
                i4 = 1;
            }
            c54722Ldm4.scrollBy(i4, 0);
            this.LIZ.postDelayed(new ARunnableS45S0100000_9((InterfaceC65784Pro) new C54725Ldp(this.LJIIL), 42), i12);
            return;
        }
        this.LJIIIIZZ = i9 - i11;
        C54722Ldm c54722Ldm5 = this.LIZ;
        if (!this.LJIIJJI) {
            i4 = 1;
        }
        c54722Ldm5.scrollBy(i11 * i4, 0);
        this.LIZ.postDelayed(new ARunnableS45S0100000_9((InterfaceC65784Pro) new C54726Ldq(this.LJIIL), 42), this.LIZJ);
    }

    public C54723Ldn(C54722Ldm c54722Ldm) {
        this.LIZ = c54722Ldm;
        this.LJFF = (int) c54722Ldm.getPaint().measureText(c54722Ldm.getText().toString());
        this.LJI = (c54722Ldm.getMeasuredWidth() - c54722Ldm.getPaddingLeft()) - c54722Ldm.getPaddingRight();
        this.LJIIJJI = C26338AVi.LIZLLL(c54722Ldm);
    }
}
