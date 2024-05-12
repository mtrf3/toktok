package X;

import android.os.Bundle;

/* renamed from: X.VFc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79424VFc {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public C79445VFx LJ;
    public Bundle LJFF;
    public VG0 LJI;
    public AbstractC79424VFc LJII;
    public AbstractC79424VFc LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;

    public abstract VFZ LIZLLL(VFZ vfz, VG6 vg6);

    public AbstractC79424VFc LJ() {
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        LJFF();
        return abstractC79424VFc;
    }

    public final void LJFF() {
        AbstractC79424VFc abstractC79424VFc = this.LJII;
        if (abstractC79424VFc != null) {
            abstractC79424VFc.LJIIIIZZ = this.LJIIIIZZ;
        }
        AbstractC79424VFc abstractC79424VFc2 = this.LJIIIIZZ;
        if (abstractC79424VFc2 != null) {
            abstractC79424VFc2.LJII = abstractC79424VFc;
        }
        this.LJIIIIZZ = null;
        this.LJII = null;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("[");
        LIZ.append(this.LIZLLL);
        LIZ.append("]->");
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        if (abstractC79424VFc != null) {
            str = abstractC79424VFc.toString();
        } else {
            str = "end";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public int LIZ(int i) {
        if (i != 10004) {
            if (i != 10005) {
                if (i != 10011) {
                    if (i != 10014) {
                        return -1;
                    }
                    return this.LIZJ;
                }
                return this.LIZLLL;
            }
            return this.LIZ;
        }
        return this.LIZIZ;
    }

    public int LIZIZ(Bundle bundle) {
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx != null && c79445VFx.getIntOption(126, this.LIZ) == -1) {
            this.LJ.setOption(126, this.LIZ, 0);
            this.LJ.setOption(127, this.LIZ, "");
        }
        this.LJFF = bundle;
        return 0;
    }

    public final void LIZJ(AbstractC79424VFc abstractC79424VFc) {
        int i = abstractC79424VFc.LIZLLL;
        if (i <= this.LIZLLL) {
            AbstractC79424VFc abstractC79424VFc2 = this.LJIIIIZZ;
            if (abstractC79424VFc2 == null) {
                this.LJIIIIZZ = abstractC79424VFc;
                abstractC79424VFc.LJII = this;
                return;
            } else {
                if (abstractC79424VFc2.LIZLLL >= i) {
                    abstractC79424VFc2.LIZJ(abstractC79424VFc);
                    return;
                }
                abstractC79424VFc.LJII = this;
                abstractC79424VFc.LJIIIIZZ = abstractC79424VFc2;
                this.LJIIIIZZ.LJII = abstractC79424VFc;
                this.LJIIIIZZ = abstractC79424VFc;
                return;
            }
        }
        AbstractC79424VFc abstractC79424VFc3 = this.LJII;
        if (abstractC79424VFc3 == null) {
            this.LJII = abstractC79424VFc;
            abstractC79424VFc.LJIIIIZZ = this;
        } else {
            if (abstractC79424VFc3.LIZLLL >= i) {
                abstractC79424VFc3.LJIIIIZZ = abstractC79424VFc;
                abstractC79424VFc.LJII = abstractC79424VFc3;
                abstractC79424VFc.LJIIIIZZ = this;
                this.LJII = abstractC79424VFc;
                return;
            }
            abstractC79424VFc3.LIZJ(abstractC79424VFc);
        }
    }

    public void LJIIIZ(Bundle bundle) {
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        if (abstractC79424VFc != null) {
            abstractC79424VFc.LJIIIZ(bundle);
        }
    }

    public final void LJIIJ(C79445VFx c79445VFx) {
        this.LJ = c79445VFx;
        if (c79445VFx != null) {
            this.LJIIIZ = c79445VFx.texType();
        }
    }

    public AbstractC79424VFc(int i, int i2) {
        this.LIZ = i2;
        this.LJIIIZ = i;
    }

    public void LJI(int i, float f) {
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        if (abstractC79424VFc != null) {
            abstractC79424VFc.LJI(i, f);
        }
    }

    public void LJII(int i, int i2) {
        AbstractC79424VFc abstractC79424VFc;
        boolean z;
        if (i != 10011) {
            if (i != 10015) {
                AbstractC79424VFc abstractC79424VFc2 = this.LJIIIIZZ;
                if (abstractC79424VFc2 != null) {
                    abstractC79424VFc2.LJII(i, i2);
                    return;
                }
                return;
            }
            if (i2 > 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJ = z;
            return;
        }
        this.LIZLLL = i2;
        AbstractC79424VFc abstractC79424VFc3 = this.LJII;
        if ((abstractC79424VFc3 == null || i2 <= abstractC79424VFc3.LIZLLL) && ((abstractC79424VFc = this.LJIIIIZZ) == null || i2 >= abstractC79424VFc.LIZLLL)) {
            return;
        }
        LJFF();
        LIZJ(this);
    }

    public void LJIIIIZZ(int i, Object obj) {
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        if (abstractC79424VFc != null) {
            abstractC79424VFc.LJIIIIZZ(i, obj);
        }
    }
}
