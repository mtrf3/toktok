package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.0xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24450xd {
    public final C35871ax LIZ;
    public final int[] LIZIZ;
    public final int LIZJ;
    public final Object[] LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    public final void LIZJ() {
        this.LJFF = true;
        C35871ax c35871ax = this.LIZ;
        c35871ax.getClass();
        if (this.LIZ == c35871ax && c35871ax.LJLJJL > 0) {
            c35871ax.LJLJJL--;
        } else {
            "Unexpected reader close()".toString();
            C24780yA.LIZJ("Unexpected reader close()");
            throw null;
        }
    }

    public final void LIZLLL() {
        int LIZLLL;
        if (this.LJIIIZ == 0) {
            if (this.LJI == this.LJII) {
                int[] iArr = this.LIZIZ;
                int i = iArr[(this.LJIIIIZZ * 5) + 2];
                this.LJIIIIZZ = i;
                if (i < 0) {
                    LIZLLL = this.LIZJ;
                } else {
                    LIZLLL = C78847Ux1.LIZLLL(i, iArr) + i;
                }
                this.LJII = LIZLLL;
                return;
            }
            "endGroup() not called at the end of a group".toString();
            C24780yA.LIZJ("endGroup() not called at the end of a group");
            throw null;
        }
    }

    public final Object LJ() {
        int i = this.LJI;
        if (i < this.LJII) {
            return LIZIZ(i, this.LIZIZ);
        }
        return 0;
    }

    public final int LJFF() {
        int i = this.LJI;
        if (i < this.LJII) {
            return this.LIZIZ[i * 5];
        }
        return 0;
    }

    public final int LJIILJJIL() {
        int i = 1;
        if (this.LJIIIZ == 0) {
            if (!C78847Ux1.LJFF(this.LJI, this.LIZIZ)) {
                i = C78847Ux1.LJII(this.LJI, this.LIZIZ);
            }
            int i2 = this.LJI;
            this.LJI = C78847Ux1.LIZLLL(i2, this.LIZIZ) + i2;
            return i;
        }
        "Cannot skip while in an empty region".toString();
        C24780yA.LIZJ("Cannot skip while in an empty region");
        throw null;
    }

    public final void LJIILL() {
        if (this.LJIIIZ == 0) {
            this.LJI = this.LJII;
        } else {
            "Cannot skip the enclosing group while in an empty region".toString();
            C24780yA.LIZJ("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
    }

    public final void LJIILLIIL() {
        int i;
        if (this.LJIIIZ <= 0) {
            int[] iArr = this.LIZIZ;
            int i2 = this.LJI;
            if (iArr[(i2 * 5) + 2] == this.LJIIIIZZ) {
                this.LJIIIIZZ = i2;
                this.LJII = C78847Ux1.LIZLLL(i2, iArr) + i2;
                int i3 = this.LJI;
                int i4 = i3 + 1;
                this.LJI = i4;
                this.LJIIJ = C78847Ux1.LJIIIIZZ(i3, this.LIZIZ);
                if (i3 >= this.LIZJ - 1) {
                    i = this.LJ;
                } else {
                    i = this.LIZIZ[(i4 * 5) + 4];
                }
                this.LJIIJJI = i;
                return;
            }
            "Invalid slot table detected".toString();
            throw new IllegalArgumentException("Invalid slot table detected");
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SlotReader(current=");
        LIZ.append(this.LJI);
        LIZ.append(", key=");
        LIZ.append(LJFF());
        LIZ.append(", parent=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", end=");
        return b0.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C24450xd(C35871ax table) {
        o.LJIIIZ(table, "table");
        this.LIZ = table;
        this.LIZIZ = table.LJLIL;
        int i = table.LJLILLLLZI;
        this.LIZJ = i;
        this.LIZLLL = table.LJLJI;
        this.LJ = table.LJLJJI;
        this.LJII = i;
        this.LJIIIIZZ = -1;
    }

    public final C24400xY LIZ(int i) {
        ArrayList<C24400xY> arrayList = this.LIZ.LJLJLJ;
        int LJJLI = C78847Ux1.LJJLI(arrayList, i, this.LIZJ);
        if (LJJLI < 0) {
            C24400xY c24400xY = new C24400xY(i);
            ListProtector.add(arrayList, -(LJJLI + 1), c24400xY);
            return c24400xY;
        }
        Object obj = ListProtector.get(arrayList, LJJLI);
        o.LJIIIIZZ(obj, "get(location)");
        return (C24400xY) obj;
    }

    public final int LJII(int i) {
        return C78847Ux1.LIZLLL(i, this.LIZIZ);
    }

    public final boolean LJIIIIZZ(int i) {
        return C78847Ux1.LJFF(i, this.LIZIZ);
    }

    public final Object LJIIIZ(int i) {
        if (C78847Ux1.LJFF(i, this.LIZIZ)) {
            int[] iArr = this.LIZIZ;
            if (C78847Ux1.LJFF(i, iArr)) {
                return this.LIZLLL[iArr[(i * 5) + 4]];
            }
            InterfaceC24520xk.LIZ.getClass();
            return C24500xi.LIZIZ;
        }
        return null;
    }

    public final int LJIIJ(int i) {
        return C78847Ux1.LJII(i, this.LIZIZ);
    }

    public final int LJIIL(int i) {
        return this.LIZIZ[(i * 5) + 2];
    }

    public final void LJIILIIL(int i) {
        int i2;
        if (this.LJIIIZ == 0) {
            this.LJI = i;
            int i3 = this.LIZJ;
            if (i < i3) {
                i2 = this.LIZIZ[(i * 5) + 2];
            } else {
                i2 = -1;
            }
            this.LJIIIIZZ = i2;
            if (i2 < 0) {
                this.LJII = i3;
            } else {
                this.LJII = C78847Ux1.LIZLLL(i2, this.LIZIZ) + i2;
            }
            this.LJIIJ = 0;
            this.LJIIJJI = 0;
            return;
        }
        "Cannot reposition while in an empty region".toString();
        C24780yA.LIZJ("Cannot reposition while in an empty region");
        throw null;
    }

    public final Object LIZIZ(int i, int[] iArr) {
        int LJIJI;
        if (C78847Ux1.LJ(i, iArr)) {
            Object[] objArr = this.LIZLLL;
            int i2 = i * 5;
            if (i2 >= iArr.length) {
                LJIJI = iArr.length;
            } else {
                LJIJI = C78847Ux1.LJIJI(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
            }
            return objArr[LJIJI];
        }
        InterfaceC24520xk.LIZ.getClass();
        return C24500xi.LIZIZ;
    }

    public final Object LJI(int i, int i2) {
        int i3;
        int LJIIIIZZ = C78847Ux1.LJIIIIZZ(i, this.LIZIZ);
        int i4 = i + 1;
        if (i4 < this.LIZJ) {
            i3 = this.LIZIZ[(i4 * 5) + 4];
        } else {
            i3 = this.LJ;
        }
        int i5 = LJIIIIZZ + i2;
        if (i5 < i3) {
            return this.LIZLLL[i5];
        }
        InterfaceC24520xk.LIZ.getClass();
        return C24500xi.LIZIZ;
    }

    public final Object LJIIJJI(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.LIZLLL[C78847Ux1.LJIJI(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }
}
