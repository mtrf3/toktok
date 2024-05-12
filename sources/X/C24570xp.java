package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24570xp {
    public static final /* synthetic */ int LJIJJLI = 0;
    public final C35871ax LIZ;
    public int[] LIZIZ;
    public Object[] LIZJ;
    public ArrayList<C24400xY> LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public final C24660xy LJIILJJIL;
    public final C24660xy LJIILL;
    public final C24660xy LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public C24550xn LJIJJ;

    static {
        new C24560xo();
    }

    public final void LJFF() {
        this.LJIJI = true;
        if (this.LJIILJJIL.LIZIZ == 0) {
            LJJ(LJIIL());
            LJJIFFI(this.LIZJ.length - this.LJIIJ, this.LJ);
            LJJIIZ();
        }
        C35871ax c35871ax = this.LIZ;
        int[] groups = this.LIZIZ;
        int i = this.LJ;
        Object[] slots = this.LIZJ;
        int i2 = this.LJIIIZ;
        ArrayList<C24400xY> anchors = this.LIZLLL;
        c35871ax.getClass();
        o.LJIIIZ(groups, "groups");
        o.LJIIIZ(slots, "slots");
        o.LJIIIZ(anchors, "anchors");
        if (this.LIZ == c35871ax && c35871ax.LJLJJLL) {
            c35871ax.LJLJJLL = false;
            c35871ax.LJLIL = groups;
            c35871ax.LJLILLLLZI = i;
            c35871ax.LJLJI = slots;
            c35871ax.LJLJJI = i2;
            c35871ax.LJLJLJ = anchors;
            return;
        }
        "Unexpected writer close()".toString();
        throw new IllegalArgumentException("Unexpected writer close()");
    }

    public final void LJ() {
        int i = this.LJIIL;
        this.LJIIL = i + 1;
        if (i == 0) {
            this.LJIILL.LIZIZ(((this.LIZIZ.length / 5) - this.LJFF) - this.LJI);
        }
    }

    public final void LJIIIIZZ() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.LJIIL > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.LJIIZILJ;
        int i5 = this.LJI;
        int i6 = this.LJIJ;
        int LJIILJJIL = LJIILJJIL(i6);
        int i7 = this.LJIILIIL;
        int i8 = i4 - i6;
        boolean LJFF = C78847Ux1.LJFF(LJIILJJIL, this.LIZIZ);
        if (z) {
            C78847Ux1.LJIIIZ(LJIILJJIL, i8, this.LIZIZ);
            C78847Ux1.LJIIJ(LJIILJJIL, i7, this.LIZIZ);
            int LIZ = this.LJIILLIIL.LIZ();
            if (!LJFF) {
                i2 = i7;
            }
            this.LJIILIIL = LIZ + i2;
            this.LJIJ = LJJIIJZLJL(i6, this.LIZIZ);
            return;
        }
        if (i4 == i5) {
            int LIZLLL = C78847Ux1.LIZLLL(LJIILJJIL, this.LIZIZ);
            int LJII = C78847Ux1.LJII(LJIILJJIL, this.LIZIZ);
            C78847Ux1.LJIIIZ(LJIILJJIL, i8, this.LIZIZ);
            C78847Ux1.LJIIJ(LJIILJJIL, i7, this.LIZIZ);
            int LIZ2 = this.LJIILJJIL.LIZ();
            this.LJI = ((this.LIZIZ.length / 5) - this.LJFF) - this.LJIILL.LIZ();
            this.LJIJ = LIZ2;
            int LJJIIJZLJL = LJJIIJZLJL(i6, this.LIZIZ);
            int LIZ3 = this.LJIILLIIL.LIZ();
            this.LJIILIIL = LIZ3;
            if (LJJIIJZLJL == LIZ2) {
                if (!LJFF) {
                    i3 = i7 - LJII;
                }
                this.LJIILIIL = LIZ3 + i3;
                return;
            }
            int i9 = i8 - LIZLLL;
            if (LJFF) {
                i = 0;
            } else {
                i = i7 - LJII;
            }
            if (i9 != 0 || i != 0) {
                while (LJJIIJZLJL != 0 && LJJIIJZLJL != LIZ2 && (i != 0 || i9 != 0)) {
                    int LJIILJJIL2 = LJIILJJIL(LJJIIJZLJL);
                    if (i9 != 0) {
                        C78847Ux1.LJIIIZ(LJIILJJIL2, C78847Ux1.LIZLLL(LJIILJJIL2, this.LIZIZ) + i9, this.LIZIZ);
                    }
                    if (i != 0) {
                        int[] iArr = this.LIZIZ;
                        C78847Ux1.LJIIJ(LJIILJJIL2, C78847Ux1.LJII(LJIILJJIL2, iArr) + i, iArr);
                    }
                    if (C78847Ux1.LJFF(LJIILJJIL2, this.LIZIZ)) {
                        i = 0;
                    }
                    LJJIIJZLJL = LJJIIJZLJL(LJJIIJZLJL, this.LIZIZ);
                }
            }
            this.LJIILIIL += i;
            return;
        }
        "Expected to be at the end of a group".toString();
        C24780yA.LIZJ("Expected to be at the end of a group");
        throw null;
    }

    public final void LJIIIZ() {
        int i = this.LJIIL;
        if (i > 0) {
            int i2 = i - 1;
            this.LJIIL = i2;
            if (i2 == 0) {
                if (this.LJIILLIIL.LIZIZ == this.LJIILJJIL.LIZIZ) {
                    this.LJI = ((this.LIZIZ.length / 5) - this.LJFF) - this.LJIILL.LIZ();
                    return;
                } else {
                    "startGroup/endGroup mismatch while inserting".toString();
                    C24780yA.LIZJ("startGroup/endGroup mismatch while inserting");
                    throw null;
                }
            }
            return;
        }
        "Unbalanced begin/end insert".toString();
        throw new IllegalStateException("Unbalanced begin/end insert");
    }

    public final int LJIIL() {
        return (this.LIZIZ.length / 5) - this.LJFF;
    }

    public final void LJJIIZ() {
        boolean z;
        C24550xn c24550xn = this.LJIJJ;
        if (c24550xn != null) {
            while (!((List) c24550xn.LIZ).isEmpty()) {
                int LJ = c24550xn.LJ();
                int LJIILJJIL = LJIILJJIL(LJ);
                int i = LJ + 1;
                int LJIILL = LJIILL(LJ) + LJ;
                while (true) {
                    if (i < LJIILL) {
                        if ((this.LIZIZ[(LJIILJJIL(i) * 5) + 1] & 201326592) != 0) {
                            z = true;
                            break;
                        }
                        i += LJIILL(i);
                    } else {
                        z = false;
                        break;
                    }
                }
                if (C78847Ux1.LIZJ(LJIILJJIL, this.LIZIZ) != z) {
                    int[] iArr = this.LIZIZ;
                    int i2 = (LJIILJJIL * 5) + 1;
                    if (z) {
                        iArr[i2] = iArr[i2] | 67108864;
                    } else {
                        iArr[i2] = iArr[i2] & (-67108865);
                    }
                    int LJJIIJ = LJJIIJ(LJ);
                    if (LJJIIJ >= 0) {
                        c24550xn.LIZ(LJJIIJ);
                    }
                }
            }
        }
    }

    public final boolean LJJIIZI() {
        if (this.LJIIL == 0) {
            int i = this.LJIIZILJ;
            int i2 = this.LJII;
            int LJJIJL = LJJIJL();
            C24550xn c24550xn = this.LJIJJ;
            if (c24550xn != null) {
                while ((!((List) c24550xn.LIZ).isEmpty()) && ((Number) ORZ.LJLLJ((List) c24550xn.LIZ)).intValue() >= i) {
                    c24550xn.LJ();
                }
            }
            boolean LJJIJ = LJJIJ(i, this.LJIIZILJ - i);
            LJJIJIIJI(i2, this.LJII - i2, i - 1);
            this.LJIIZILJ = i;
            this.LJII = i2;
            this.LJIILIIL -= LJJIJL;
            return LJJIJ;
        }
        "Cannot remove group while inserting".toString();
        C24780yA.LIZJ("Cannot remove group while inserting");
        throw null;
    }

    public final void LJJIJIIJIL() {
        if (this.LJIIL == 0) {
            LJJIIZ();
            this.LJIIZILJ = 0;
            this.LJI = (this.LIZIZ.length / 5) - this.LJFF;
            this.LJII = 0;
            this.LJIIIIZZ = 0;
            this.LJIILIIL = 0;
            return;
        }
        "Cannot reset when inserting".toString();
        C24780yA.LIZJ("Cannot reset when inserting");
        throw null;
    }

    public final int LJJIJL() {
        int LJIILJJIL = LJIILJJIL(this.LJIIZILJ);
        int LIZLLL = C78847Ux1.LIZLLL(LJIILJJIL, this.LIZIZ) + this.LJIIZILJ;
        this.LJIIZILJ = LIZLLL;
        this.LJII = LJI(LJIILJJIL(LIZLLL), this.LIZIZ);
        if (C78847Ux1.LJFF(LJIILJJIL, this.LIZIZ)) {
            return 1;
        }
        return C78847Ux1.LJII(LJIILJJIL, this.LIZIZ);
    }

    public final void LJJIJLIJ() {
        int i = this.LJI;
        this.LJIIZILJ = i;
        this.LJII = LJI(LJIILJJIL(i), this.LIZIZ);
    }

    public final void LJJJ() {
        if (this.LJIIL == 0) {
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            LJJJI(0, c24490xh, c24490xh, false);
        } else {
            "Key must be supplied when inserting".toString();
            C24780yA.LIZJ("Key must be supplied when inserting");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SlotWriter(current = ");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(" end=");
        LIZ.append(this.LJI);
        LIZ.append(" size = ");
        LIZ.append(LJIIL());
        LIZ.append(" gap=");
        LIZ.append(this.LJ);
        LIZ.append('-');
        LIZ.append(this.LJ + this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C24570xp(C35871ax table) {
        o.LJIIIZ(table, "table");
        this.LIZ = table;
        int[] iArr = table.LJLIL;
        this.LIZIZ = iArr;
        Object[] objArr = table.LJLJI;
        this.LIZJ = objArr;
        this.LIZLLL = table.LJLJLJ;
        int i = table.LJLILLLLZI;
        this.LJ = i;
        this.LJFF = (iArr.length / 5) - i;
        this.LJI = i;
        int i2 = table.LJLJJI;
        this.LJIIIZ = i2;
        this.LJIIJ = objArr.length - i2;
        this.LJIIJJI = i;
        this.LJIILJJIL = new C24660xy();
        this.LJIILL = new C24660xy();
        this.LJIILLIIL = new C24660xy();
        this.LJIJ = -1;
    }

    public static void LJIJJ(C24570xp c24570xp) {
        int i = c24570xp.LJIJ;
        int LJIILJJIL = c24570xp.LJIILJJIL(i);
        int[] iArr = c24570xp.LIZIZ;
        int i2 = (LJIILJJIL * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        iArr[i2] = i3 | 134217728;
        if (C78847Ux1.LIZJ(LJIILJJIL, iArr)) {
            return;
        }
        c24570xp.LJJJJI(c24570xp.LJJIIJ(i));
    }

    public final void LIZ(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LJIIL <= 0) {
                if (i == 0) {
                    return;
                }
                int i2 = this.LJIIZILJ + i;
                if (i2 >= this.LJIJ && i2 <= this.LJI) {
                    this.LJIIZILJ = i2;
                    int LJI = LJI(LJIILJJIL(i2), this.LIZIZ);
                    this.LJII = LJI;
                    this.LJIIIIZZ = LJI;
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Cannot seek outside the current group (");
                LIZ.append(this.LJIJ);
                LIZ.append('-');
                LIZ.append(this.LJI);
                LIZ.append(')');
                String LIZIZ = X1D.LIZIZ(LIZ);
                LIZIZ.toString();
                C24780yA.LIZJ(LIZIZ);
                throw null;
            }
            "Cannot call seek() while inserting".toString();
            throw new IllegalStateException("Cannot call seek() while inserting");
        }
        "Cannot seek backwards".toString();
        C24780yA.LIZJ("Cannot seek backwards");
        throw null;
    }

    public final C24400xY LIZIZ(int i) {
        ArrayList<C24400xY> arrayList = this.LIZLLL;
        int LJJLI = C78847Ux1.LJJLI(arrayList, i, LJIIL());
        if (LJJLI < 0) {
            if (i > this.LJ) {
                i = -(LJIIL() - i);
            }
            C24400xY c24400xY = new C24400xY(i);
            ListProtector.add(arrayList, -(LJJLI + 1), c24400xY);
            return c24400xY;
        }
        Object obj = ListProtector.get(arrayList, LJJLI);
        o.LJIIIIZZ(obj, "get(location)");
        return (C24400xY) obj;
    }

    public final int LIZJ(C24400xY anchor) {
        o.LJIIIZ(anchor, "anchor");
        int i = anchor.LIZ;
        if (i < 0) {
            return i + LJIIL();
        }
        return i;
    }

    public final int LJII(int i) {
        if (i < this.LJIIIZ) {
            return i;
        }
        return i + this.LJIIJ;
    }

    public final void LJIIJ(int i) {
        boolean z;
        if (this.LJIIL <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.LJIJ;
            if (i2 != i) {
                if (i >= i2 && i < this.LJI) {
                    int i3 = this.LJIIZILJ;
                    int i4 = this.LJII;
                    int i5 = this.LJIIIIZZ;
                    this.LJIIZILJ = i;
                    LJJJ();
                    this.LJIIZILJ = i3;
                    this.LJII = i4;
                    this.LJIIIIZZ = i5;
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Started group at ");
                LIZ.append(i);
                LIZ.append(" must be a subgroup of the group at ");
                LIZ.append(i2);
                String LIZIZ = X1D.LIZIZ(LIZ);
                LIZIZ.toString();
                C24780yA.LIZJ(LIZIZ);
                throw null;
            }
            return;
        }
        "Cannot call ensureStarted() while inserting".toString();
        C24780yA.LIZJ("Cannot call ensureStarted() while inserting");
        throw null;
    }

    public final Object LJIILIIL(int i) {
        int LJIILJJIL = LJIILJJIL(i);
        if (C78847Ux1.LJ(LJIILJJIL, this.LIZIZ)) {
            return this.LIZJ[LIZLLL(LJIILJJIL, this.LIZIZ)];
        }
        InterfaceC24520xk.LIZ.getClass();
        return C24500xi.LIZIZ;
    }

    public final int LJIILJJIL(int i) {
        if (i < this.LJ) {
            return i;
        }
        return i + this.LJFF;
    }

    public final int LJIILL(int i) {
        return C78847Ux1.LIZLLL(LJIILJJIL(i), this.LIZIZ);
    }

    public final void LJIIZILJ(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.LJIIZILJ;
            LJJ(i3);
            int i4 = this.LJ;
            int i5 = this.LJFF;
            int[] iArr = this.LIZIZ;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                C61898ORa.LJIILLIIL(0, 0, i4 * 5, iArr, iArr2);
                C61898ORa.LJIILLIIL((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.LIZIZ = iArr2;
                i5 = i8;
            }
            int i9 = this.LJI;
            if (i9 >= i4) {
                this.LJI = i9 + i;
            }
            int i10 = i4 + i;
            this.LJ = i10;
            this.LJFF = i5 - i;
            if (i6 > 0) {
                i2 = LJI(LJIILJJIL(i3 + i), this.LIZIZ);
            } else {
                i2 = 0;
            }
            if (this.LJIIJJI >= i4) {
                i7 = this.LJIIIZ;
            }
            int i11 = this.LJIIJ;
            int length2 = this.LIZJ.length;
            if (i2 > i7) {
                i2 = -(((length2 - i11) - i2) + 1);
            }
            for (int i12 = i4; i12 < i10; i12++) {
                this.LIZIZ[(i12 * 5) + 4] = i2;
            }
            int i13 = this.LJIIJJI;
            if (i13 >= i4) {
                this.LJIIJJI = i13 + i;
            }
        }
    }

    public final boolean LJIJI(int i) {
        return C78847Ux1.LJFF(LJIILJJIL(i), this.LIZIZ);
    }

    public final void LJIL(int i) {
        boolean z;
        boolean z2;
        int i2;
        if (this.LJIIL == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i3 = this.LJIIZILJ;
                int i4 = this.LJIJ;
                int i5 = this.LJI;
                int i6 = i3;
                while (i > 0) {
                    i6 += C78847Ux1.LIZLLL(LJIILJJIL(i6), this.LIZIZ);
                    if (i6 > i5) {
                        "Parameter offset is out of bounds".toString();
                        C24780yA.LIZJ("Parameter offset is out of bounds");
                        throw null;
                    }
                    i--;
                }
                int LIZLLL = C78847Ux1.LIZLLL(LJIILJJIL(i6), this.LIZIZ);
                int i7 = this.LJII;
                int LJI = LJI(LJIILJJIL(i6), this.LIZIZ);
                int i8 = i6 + LIZLLL;
                int LJI2 = LJI(LJIILJJIL(i8), this.LIZIZ);
                int i9 = LJI2 - LJI;
                LJIJ(i9, Math.max(this.LJIIZILJ - 1, 0));
                LJIIZILJ(LIZLLL);
                int[] iArr = this.LIZIZ;
                int LJIILJJIL = LJIILJJIL(i8) * 5;
                C61898ORa.LJIILLIIL(LJIILJJIL(i3) * 5, LJIILJJIL, (LIZLLL * 5) + LJIILJJIL, iArr, iArr);
                if (i9 > 0) {
                    Object[] objArr = this.LIZJ;
                    C61898ORa.LJIIZILJ(i7, LJII(LJI + i9), LJII(LJI2 + i9), objArr, objArr);
                }
                int i10 = LJI + i9;
                int i11 = i10 - i7;
                int i12 = this.LJIIIZ;
                int i13 = this.LJIIJ;
                int length = this.LIZJ.length;
                int i14 = this.LJIIJJI;
                int i15 = i3 + LIZLLL;
                for (int i16 = i3; i16 < i15; i16++) {
                    int LJIILJJIL2 = LJIILJJIL(i16);
                    int LJI3 = LJI(LJIILJJIL2, iArr) - i11;
                    if (i14 < LJIILJJIL2) {
                        i2 = 0;
                    } else {
                        i2 = i12;
                    }
                    if (LJI3 > i2) {
                        LJI3 = -(((length - i13) - LJI3) + 1);
                    }
                    int i17 = this.LJIIIZ;
                    int i18 = this.LJIIJ;
                    int length2 = this.LIZJ.length;
                    if (LJI3 > i17) {
                        LJI3 = -(((length2 - i18) - LJI3) + 1);
                    }
                    iArr[(LJIILJJIL2 * 5) + 4] = LJI3;
                }
                int i19 = LIZLLL + i8;
                int LJIIL = LJIIL();
                int LJI4 = C78847Ux1.LJI(this.LIZLLL, i8, LJIIL);
                ArrayList arrayList = new ArrayList();
                if (LJI4 >= 0) {
                    while (LJI4 < this.LIZLLL.size()) {
                        Object obj = ListProtector.get(this.LIZLLL, LJI4);
                        o.LJIIIIZZ(obj, "anchors[index]");
                        C24400xY c24400xY = (C24400xY) obj;
                        int LIZJ = LIZJ(c24400xY);
                        if (LIZJ < i8 || LIZJ >= i19) {
                            break;
                        }
                        arrayList.add(c24400xY);
                        ListProtector.remove(this.LIZLLL, LJI4);
                    }
                }
                int i20 = i3 - i8;
                int size = arrayList.size();
                for (int i21 = 0; i21 < size; i21++) {
                    C24400xY c24400xY2 = (C24400xY) ListProtector.get(arrayList, i21);
                    int LIZJ2 = LIZJ(c24400xY2) + i20;
                    if (LIZJ2 >= this.LJ) {
                        c24400xY2.LIZ = -(LJIIL - LIZJ2);
                    } else {
                        c24400xY2.LIZ = LIZJ2;
                    }
                    ListProtector.add(this.LIZLLL, C78847Ux1.LJI(this.LIZLLL, LIZJ2, LJIIL), c24400xY2);
                }
                if (!LJJIJ(i8, LIZLLL)) {
                    LJIIJJI(i4, this.LJI, i3);
                    if (i9 > 0) {
                        LJJIJIIJI(i10, i9, i8 - 1);
                        return;
                    }
                    return;
                }
                "Unexpectedly removed anchors".toString();
                C24780yA.LIZJ("Unexpectedly removed anchors");
                throw null;
            }
            "Parameter offset is out of bounds".toString();
            C24780yA.LIZJ("Parameter offset is out of bounds");
            throw null;
        }
        "Cannot move a group while inserting".toString();
        C24780yA.LIZJ("Cannot move a group while inserting");
        throw null;
    }

    public final void LJJ(int i) {
        int LJIIL;
        int i2;
        int i3 = this.LJFF;
        int i4 = this.LJ;
        if (i4 != i) {
            boolean z = true;
            if (!this.LIZLLL.isEmpty()) {
                int length = (this.LIZIZ.length / 5) - this.LJFF;
                if (i4 < i) {
                    for (int LJI = C78847Ux1.LJI(this.LIZLLL, i4, length); LJI < this.LIZLLL.size(); LJI++) {
                        Object obj = ListProtector.get(this.LIZLLL, LJI);
                        o.LJIIIIZZ(obj, "anchors[index]");
                        C24400xY c24400xY = (C24400xY) obj;
                        int i5 = c24400xY.LIZ;
                        if (i5 >= 0 || (i2 = i5 + length) >= i) {
                            break;
                        }
                        c24400xY.LIZ = i2;
                    }
                } else {
                    for (int LJI2 = C78847Ux1.LJI(this.LIZLLL, i, length); LJI2 < this.LIZLLL.size(); LJI2++) {
                        Object obj2 = ListProtector.get(this.LIZLLL, LJI2);
                        o.LJIIIIZZ(obj2, "anchors[index]");
                        C24400xY c24400xY2 = (C24400xY) obj2;
                        int i6 = c24400xY2.LIZ;
                        if (i6 < 0) {
                            break;
                        }
                        c24400xY2.LIZ = -(length - i6);
                    }
                }
            }
            if (i3 > 0) {
                int[] iArr = this.LIZIZ;
                int i7 = i * 5;
                int i8 = i3 * 5;
                int i9 = i4 * 5;
                if (i < i4) {
                    C61898ORa.LJIILLIIL(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    C61898ORa.LJIILLIIL(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i4) {
                i4 = i + i3;
            }
            int length2 = this.LIZIZ.length / 5;
            if (i4 >= length2) {
                z = false;
            }
            C24780yA.LJFF(z);
            while (i4 < length2) {
                int i10 = (i4 * 5) + 2;
                int i11 = this.LIZIZ[i10];
                if (i11 > -2) {
                    LJIIL = i11;
                } else {
                    LJIIL = LJIIL() + i11 + 2;
                }
                if (LJIIL >= i) {
                    LJIIL = -((LJIIL() - LJIIL) + 2);
                }
                if (LJIIL != i11) {
                    this.LIZIZ[i10] = LJIIL;
                }
                i4++;
                if (i4 == i) {
                    i4 += i3;
                }
            }
        }
        this.LJ = i;
    }

    public final List LJJI(C35871ax table) {
        boolean z;
        o.LJIIIZ(table, "table");
        if (this.LJIIL <= 0 && LJIILL(this.LJIIZILJ + 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        C24780yA.LJFF(z);
        int i = this.LJIIZILJ;
        int i2 = this.LJII;
        int i3 = this.LJIIIIZZ;
        LIZ(1);
        LJJJ();
        LJ();
        C24570xp LJIILJJIL = table.LJIILJJIL();
        try {
            List LIZ = C24560xo.LIZ(LJIILJJIL, 2, this, false, true);
            LJIILJJIL.LJFF();
            LJIIIZ();
            LJIIIIZZ();
            this.LJIIZILJ = i;
            this.LJII = i2;
            this.LJIIIIZZ = i3;
            return LIZ;
        } catch (Throwable th) {
            LJIILJJIL.LJFF();
            throw th;
        }
    }

    public final Object LJJIII(int i) {
        int LJIILJJIL = LJIILJJIL(i);
        if (C78847Ux1.LJFF(LJIILJJIL, this.LIZIZ)) {
            return this.LIZJ[LJII(LJI(LJIILJJIL, this.LIZIZ))];
        }
        return null;
    }

    public final int LJJIIJ(int i) {
        return LJJIIJZLJL(i, this.LIZIZ);
    }

    public final void LJJJIL(Object obj) {
        if (this.LJIIL > 0) {
            LJIJ(1, this.LJIJ);
        }
        int i = this.LJII;
        this.LJII = i + 1;
        LJII(i);
        int i2 = this.LJII;
        if (i2 <= this.LJIIIIZZ) {
            this.LIZJ[LJII(i2 - 1)] = obj;
        } else {
            "Writing to an invalid slot".toString();
            C24780yA.LIZJ("Writing to an invalid slot");
            throw null;
        }
    }

    public final void LJJJJ(Object obj) {
        int LJIILJJIL = LJIILJJIL(this.LJIIZILJ);
        if (C78847Ux1.LJ(LJIILJJIL, this.LIZIZ)) {
            this.LIZJ[LJII(LIZLLL(LJIILJJIL, this.LIZIZ))] = obj;
        } else {
            "Updating the data of a group that was not created with a data slot".toString();
            C24780yA.LIZJ("Updating the data of a group that was not created with a data slot");
            throw null;
        }
    }

    public final void LJJJJI(int i) {
        if (i >= 0) {
            C24550xn c24550xn = this.LJIJJ;
            if (c24550xn == null) {
                c24550xn = new C24550xn();
                this.LJIJJ = c24550xn;
            }
            c24550xn.LIZ(i);
        }
    }

    public final int LIZLLL(int i, int[] iArr) {
        return C78847Ux1.LJIJI(iArr[(i * 5) + 1] >> 29) + LJI(i, iArr);
    }

    public final int LJI(int i, int[] iArr) {
        if (i >= this.LIZIZ.length / 5) {
            return this.LIZJ.length - this.LJIIJ;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.LJIIJ;
        int length = this.LIZJ.length;
        if (i2 >= 0) {
            return i2;
        }
        return (length - i3) + i2 + 1;
    }

    public final boolean LJIILLIIL(int i, int i2) {
        int i3;
        int LJIILL;
        int length;
        if (i2 == this.LJIJ) {
            length = this.LJI;
        } else {
            C24660xy c24660xy = this.LJIILJJIL;
            int i4 = c24660xy.LIZIZ;
            if (i4 > 0) {
                i3 = c24660xy.LIZ[i4 - 1];
            } else {
                i3 = 0;
            }
            if (i2 > i3) {
                LJIILL = LJIILL(i2);
            } else {
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    if (c24660xy.LIZ[i5] == i2) {
                        if (i5 >= 0) {
                            length = ((this.LIZIZ.length / 5) - this.LJFF) - this.LJIILL.LIZ[i5];
                        }
                    } else {
                        i5++;
                    }
                }
                LJIILL = LJIILL(i2);
            }
            length = LJIILL + i2;
        }
        if (i <= i2 || i >= length) {
            return false;
        }
        return true;
    }

    public final void LJIJ(int i, int i2) {
        if (i > 0) {
            LJJIFFI(this.LJII, i2);
            int i3 = this.LJIIIZ;
            int i4 = this.LJIIJ;
            if (i4 < i) {
                Object[] objArr = this.LIZJ;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                C61898ORa.LJIIZILJ(0, 0, i3, objArr, objArr2);
                C61898ORa.LJIIZILJ(i3 + i7, i4 + i3, length, objArr, objArr2);
                this.LIZJ = objArr2;
                i4 = i7;
            }
            int i8 = this.LJIIIIZZ;
            if (i8 >= i3) {
                this.LJIIIIZZ = i8 + i;
            }
            this.LJIIIZ = i3 + i;
            this.LJIIJ = i4 - i;
        }
    }

    public final void LJIJJLI(C35871ax c35871ax, int i) {
        boolean z;
        if (this.LJIIL > 0) {
            z = true;
        } else {
            z = false;
        }
        C24780yA.LJFF(z);
        if (i == 0 && this.LJIIZILJ == 0 && this.LIZ.LJLILLLLZI == 0) {
            int[] groups = this.LIZIZ;
            Object[] slots = this.LIZJ;
            ArrayList<C24400xY> anchors = this.LIZLLL;
            int[] iArr = c35871ax.LJLIL;
            int i2 = c35871ax.LJLILLLLZI;
            Object[] objArr = c35871ax.LJLJI;
            int i3 = c35871ax.LJLJJI;
            this.LIZIZ = iArr;
            this.LIZJ = objArr;
            this.LIZLLL = c35871ax.LJLJLJ;
            this.LJ = i2;
            this.LJFF = (iArr.length / 5) - i2;
            this.LJIIIZ = i3;
            this.LJIIJ = objArr.length - i3;
            this.LJIIJJI = i2;
            o.LJIIIZ(groups, "groups");
            o.LJIIIZ(slots, "slots");
            o.LJIIIZ(anchors, "anchors");
            c35871ax.LJLIL = groups;
            c35871ax.LJLILLLLZI = 0;
            c35871ax.LJLJI = slots;
            c35871ax.LJLJJI = 0;
            c35871ax.LJLJLJ = anchors;
            return;
        }
        C24570xp LJIILJJIL = c35871ax.LJIILJJIL();
        try {
            C24560xo.LIZ(LJIILJJIL, i, this, true, true);
        } finally {
            LJIILJJIL.LJFF();
        }
    }

    public final void LJJIFFI(int i, int i2) {
        int i3 = this.LJIIJ;
        int i4 = this.LJIIIZ;
        int i5 = this.LJIIJJI;
        if (i4 != i) {
            Object[] objArr = this.LIZJ;
            if (i < i4) {
                C61898ORa.LJIIZILJ(i + i3, i, i4, objArr, objArr);
            } else {
                C61898ORa.LJIIZILJ(i4, i4 + i3, i + i3, objArr, objArr);
            }
            C61898ORa.LJJ(i, i + i3, objArr);
        }
        int min = Math.min(i2 + 1, LJIIL());
        if (i5 != min) {
            int length = this.LIZJ.length - i3;
            if (min < i5) {
                int LJIILJJIL = LJIILJJIL(min);
                int LJIILJJIL2 = LJIILJJIL(i5);
                int i6 = this.LJ;
                while (LJIILJJIL < LJIILJJIL2) {
                    int[] iArr = this.LIZIZ;
                    int i7 = (LJIILJJIL * 5) + 4;
                    int i8 = iArr[i7];
                    if (i8 >= 0) {
                        iArr[i7] = -((length - i8) + 1);
                        LJIILJJIL++;
                        if (LJIILJJIL == i6) {
                            LJIILJJIL += this.LJFF;
                        }
                    } else {
                        "Unexpected anchor value, expected a positive anchor".toString();
                        C24780yA.LIZJ("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                }
            } else {
                int LJIILJJIL3 = LJIILJJIL(i5);
                int LJIILJJIL4 = LJIILJJIL(min);
                while (LJIILJJIL3 < LJIILJJIL4) {
                    int[] iArr2 = this.LIZIZ;
                    int i9 = (LJIILJJIL3 * 5) + 4;
                    int i10 = iArr2[i9];
                    if (i10 < 0) {
                        iArr2[i9] = i10 + length + 1;
                        LJIILJJIL3++;
                        if (LJIILJJIL3 == this.LJ) {
                            LJIILJJIL3 += this.LJFF;
                        }
                    } else {
                        "Unexpected anchor value, expected a negative anchor".toString();
                        C24780yA.LIZJ("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                }
            }
            this.LJIIJJI = min;
        }
        this.LJIIIZ = i;
    }

    public final void LJJII(C24400xY anchor, C24570xp c24570xp) {
        boolean z;
        boolean z2;
        boolean z3;
        int LJII;
        boolean z4;
        o.LJIIIZ(anchor, "anchor");
        boolean z5 = false;
        if (c24570xp.LJIIL > 0) {
            z = true;
        } else {
            z = false;
        }
        C24780yA.LJFF(z);
        if (this.LJIIL == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24780yA.LJFF(z2);
        C24780yA.LJFF(anchor.LIZ());
        int LIZJ = LIZJ(anchor) + 1;
        int i = this.LJIIZILJ;
        if (i <= LIZJ && LIZJ < this.LJI) {
            z3 = true;
        } else {
            z3 = false;
        }
        C24780yA.LJFF(z3);
        int LJJIIJ = LJJIIJ(LIZJ);
        int LJIILL = LJIILL(LIZJ);
        if (LJIJI(LIZJ)) {
            LJII = 1;
        } else {
            LJII = C78847Ux1.LJII(LJIILJJIL(LIZJ), this.LIZIZ);
        }
        C24560xo.LIZ(this, LIZJ, c24570xp, false, false);
        LJJJJI(LJJIIJ);
        if (LJII > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (LJJIIJ >= i) {
            int LJIILJJIL = LJIILJJIL(LJJIIJ);
            int[] iArr = this.LIZIZ;
            C78847Ux1.LJIIIZ(LJIILJJIL, C78847Ux1.LIZLLL(LJIILJJIL, iArr) - LJIILL, iArr);
            if (z4) {
                if (C78847Ux1.LJFF(LJIILJJIL, this.LIZIZ)) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.LIZIZ;
                    C78847Ux1.LJIIJ(LJIILJJIL, C78847Ux1.LJII(LJIILJJIL, iArr2) - LJII, iArr2);
                }
            }
            LJJIIJ = LJJIIJ(LJJIIJ);
        }
        if (z4) {
            if (this.LJIILIIL >= LJII) {
                z5 = true;
            }
            C24780yA.LJFF(z5);
            this.LJIILIIL -= LJII;
        }
    }

    public final int LJJIIJZLJL(int i, int[] iArr) {
        int i2 = iArr[(LJIILJJIL(i) * 5) + 2];
        if (i2 > -2) {
            return i2;
        }
        return LJIIL() + i2 + 2;
    }

    public final boolean LJJIJ(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<C24400xY> arrayList = this.LIZLLL;
            LJJ(i);
            if (!arrayList.isEmpty()) {
                int i3 = i2 + i;
                int LJI = C78847Ux1.LJI(this.LIZLLL, i3, (this.LIZIZ.length / 5) - this.LJFF);
                if (LJI >= this.LIZLLL.size()) {
                    LJI--;
                }
                int i4 = LJI + 1;
                int i5 = 0;
                while (LJI >= 0) {
                    Object obj = ListProtector.get(this.LIZLLL, LJI);
                    o.LJIIIIZZ(obj, "anchors[index]");
                    C24400xY c24400xY = (C24400xY) obj;
                    int LIZJ = LIZJ(c24400xY);
                    if (LIZJ < i) {
                        break;
                    }
                    if (LIZJ < i3) {
                        c24400xY.LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
                        if (i5 == 0) {
                            i5 = LJI + 1;
                        }
                        i4 = LJI;
                    }
                    LJI--;
                }
                if (i4 < i5) {
                    z = true;
                    this.LIZLLL.subList(i4, i5).clear();
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.LJ = i;
            this.LJFF += i2;
            int i6 = this.LJIIJJI;
            if (i6 > i) {
                this.LJIIJJI = Math.max(i, i6 - i2);
            }
            int i7 = this.LJI;
            if (i7 >= this.LJ) {
                this.LJI = i7 - i2;
            }
            int i8 = this.LJIJ;
            if (i8 >= 0) {
                if (C78847Ux1.LIZJ(LJIILJJIL(i8), this.LIZIZ)) {
                    LJJJJI(this.LJIJ);
                }
            }
        }
        return z;
    }

    public final Object LJJIJIL(int i, Object obj) {
        int LJJIZ = LJJIZ(LJIILJJIL(this.LJIIZILJ), this.LIZIZ);
        int LJI = LJI(LJIILJJIL(this.LJIIZILJ + 1), this.LIZIZ);
        int i2 = LJJIZ + i;
        if (i2 >= LJJIZ && i2 < LJI) {
            int LJII = LJII(i2);
            Object[] objArr = this.LIZJ;
            Object obj2 = objArr[LJII];
            objArr[LJII] = obj;
            return obj2;
        }
        StringBuilder LJ = C7MY.LJ("Write to an invalid slot index ", i, " for group ");
        LJ.append(this.LJIIZILJ);
        String LIZIZ = X1D.LIZIZ(LJ);
        LIZIZ.toString();
        C24780yA.LIZJ(LIZIZ);
        throw null;
    }

    public final Object LJJIL(int i, int i2) {
        int LJJIZ = LJJIZ(LJIILJJIL(i), this.LIZIZ);
        int LJI = LJI(LJIILJJIL(i + 1), this.LIZIZ);
        int i3 = i2 + LJJIZ;
        if (LJJIZ <= i3 && i3 < LJI) {
            return this.LIZJ[LJII(i3)];
        }
        InterfaceC24520xk.LIZ.getClass();
        return C24500xi.LIZIZ;
    }

    public final int LJJIZ(int i, int[] iArr) {
        if (i >= this.LIZIZ.length / 5) {
            return this.LIZJ.length - this.LJIIJ;
        }
        int LJIIIIZZ = C78847Ux1.LJIIIIZZ(i, iArr);
        int i2 = this.LJIIJ;
        int length = this.LIZJ.length;
        if (LJIIIIZZ >= 0) {
            return LJIIIIZZ;
        }
        return (length - i2) + LJIIIIZZ + 1;
    }

    public final void LJJJJIZL(int i, Object obj) {
        int LJIILJJIL = LJIILJJIL(i);
        int[] iArr = this.LIZIZ;
        if (LJIILJJIL < iArr.length && C78847Ux1.LJFF(LJIILJJIL, iArr)) {
            this.LIZJ[LJII(LJI(LJIILJJIL, this.LIZIZ))] = obj;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Updating the node of a group at ");
        LIZ.append(i);
        LIZ.append(" that was not created with as a node group");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        C24780yA.LIZJ(LIZIZ);
        throw null;
    }

    public final void LJIIJJI(int i, int i2, int i3) {
        if (i >= this.LJ) {
            i = -((LJIIL() - i) + 2);
        }
        while (i3 < i2) {
            this.LIZIZ[(LJIILJJIL(i3) * 5) + 2] = i;
            int LIZLLL = C78847Ux1.LIZLLL(LJIILJJIL(i3), this.LIZIZ) + i3;
            LJIIJJI(i3, LIZLLL, i3 + 1);
            i3 = LIZLLL;
        }
    }

    public final void LJJIJIIJI(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.LJIIJ;
            int i5 = i + i2;
            LJJIFFI(i5, i3);
            this.LJIIIZ = i;
            this.LJIIJ = i4 + i2;
            C61898ORa.LJJ(i, i5, this.LIZJ);
            int i6 = this.LJIIIIZZ;
            if (i6 >= i) {
                this.LJIIIIZZ = i6 - i2;
            }
        }
    }

    public final void LJJJI(int i, Object obj, Object obj2, boolean z) {
        boolean z2;
        int LIZLLL;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        if (this.LJIIL > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIILLIIL.LIZIZ(this.LJIILIIL);
        if (z2) {
            LJIIZILJ(1);
            int i7 = this.LJIIZILJ;
            int LJIILJJIL = LJIILJJIL(i7);
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (obj != c24490xh) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (z || obj2 == c24490xh) {
                i6 = 0;
            }
            int[] iArr = this.LIZIZ;
            int i8 = this.LJIJ;
            int i9 = this.LJII;
            if (z) {
                i3 = 1073741824;
            } else {
                i3 = 0;
            }
            if (i2 != 0) {
                i4 = 536870912;
            } else {
                i4 = 0;
            }
            if (i6 != 0) {
                i5 = 268435456;
            } else {
                i5 = 0;
            }
            int i10 = LJIILJJIL * 5;
            iArr[i10] = i;
            iArr[i10 + 1] = i3 | i4 | i5;
            iArr[i10 + 2] = i8;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = i9;
            this.LJIIIIZZ = i9;
            int i11 = (z ? 1 : 0) + i2 + i6;
            if (i11 > 0) {
                LJIJ(i11, i7);
                Object[] objArr = this.LIZJ;
                int i12 = this.LJII;
                if (z) {
                    objArr[i12] = obj2;
                    i12++;
                }
                if (i2 != 0) {
                    objArr[i12] = obj;
                    i12++;
                }
                if (i6 != 0) {
                    objArr[i12] = obj2;
                    i12++;
                }
                this.LJII = i12;
            }
            this.LJIILIIL = 0;
            LIZLLL = i7 + 1;
            this.LJIJ = i7;
            this.LJIIZILJ = LIZLLL;
        } else {
            this.LJIILJJIL.LIZIZ(this.LJIJ);
            this.LJIILL.LIZIZ(((this.LIZIZ.length / 5) - this.LJFF) - this.LJI);
            int i13 = this.LJIIZILJ;
            int LJIILJJIL2 = LJIILJJIL(i13);
            InterfaceC24520xk.LIZ.getClass();
            if (!o.LJ(obj2, C24500xi.LIZIZ)) {
                if (z) {
                    LJJJJIZL(this.LJIIZILJ, obj2);
                } else {
                    LJJJJ(obj2);
                }
            }
            this.LJII = LJJIZ(LJIILJJIL2, this.LIZIZ);
            this.LJIIIIZZ = LJI(LJIILJJIL(this.LJIIZILJ + 1), this.LIZIZ);
            this.LJIILIIL = C78847Ux1.LJII(LJIILJJIL2, this.LIZIZ);
            this.LJIJ = i13;
            this.LJIIZILJ = i13 + 1;
            LIZLLL = i13 + C78847Ux1.LIZLLL(LJIILJJIL2, this.LIZIZ);
        }
        this.LJI = LIZLLL;
    }
}
