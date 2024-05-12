package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03150Al {
    public final List<C03140Ak> LIZ;
    public final int[] LIZIZ;
    public final int[] LIZJ;
    public final AbstractC03120Ai LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public final int LIZ(int i) {
        if (i >= 0 && i < this.LJ) {
            int i2 = this.LIZIZ[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }
        StringBuilder LJ = C7MY.LJ("Index out of bounds - passed position = ", i, ", old list size = ");
        LJ.append(this.LJ);
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(final C0AK c0ak) {
        C28841Bg c28841Bg;
        int i;
        if (c0ak instanceof C28841Bg) {
            c28841Bg = (C28841Bg) c0ak;
        } else {
            c28841Bg = new C0AK(c0ak) { // from class: X.1Bg
                public final C0AK LJLIL;
                public int LJLILLLLZI;
                public int LJLJI = -1;
                public int LJLJJI = -1;
                public Object LJLJJL;

                public final void LIZ() {
                    int i2 = this.LJLILLLLZI;
                    if (i2 == 0) {
                        return;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                this.LJLIL.LJJLIIIJILLIZJL(this.LJLJI, this.LJLJJI, this.LJLJJL);
                            }
                        } else {
                            this.LJLIL.LJJIJLIJ(this.LJLJI, this.LJLJJI);
                        }
                    } else {
                        this.LJLIL.LJLIIIL(this.LJLJI, this.LJLJJI);
                    }
                    this.LJLJJL = null;
                    this.LJLILLLLZI = 0;
                }

                {
                    this.LJLIL = c0ak;
                }

                @Override // X.C0AK
                public final void LJJIJLIJ(int i2, int i3) {
                    int i4;
                    if (this.LJLILLLLZI == 2 && (i4 = this.LJLJI) >= i2 && i4 <= i2 + i3) {
                        this.LJLJJI += i3;
                        this.LJLJI = i2;
                    } else {
                        LIZ();
                        this.LJLJI = i2;
                        this.LJLJJI = i3;
                        this.LJLILLLLZI = 2;
                    }
                }

                @Override // X.C0AK
                public final void LJLIIIL(int i2, int i3) {
                    int i4;
                    if (this.LJLILLLLZI == 1 && i2 >= (i4 = this.LJLJI)) {
                        int i5 = this.LJLJJI;
                        if (i2 <= i4 + i5) {
                            this.LJLJJI = i5 + i3;
                            this.LJLJI = Math.min(i2, i4);
                            return;
                        }
                    }
                    LIZ();
                    this.LJLJI = i2;
                    this.LJLJJI = i3;
                    this.LJLILLLLZI = 1;
                }

                @Override // X.C0AK
                public final void LJLJLLL(int i2, int i3) {
                    LIZ();
                    this.LJLIL.LJLJLLL(i2, i3);
                }

                @Override // X.C0AK
                public final void LJJLIIIJILLIZJL(int i2, int i3, Object obj) {
                    int i4;
                    if (this.LJLILLLLZI == 3) {
                        int i5 = this.LJLJI;
                        int i6 = this.LJLJJI;
                        if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.LJLJJL == obj) {
                            this.LJLJI = Math.min(i2, i5);
                            this.LJLJJI = Math.max(i6 + i5, i4) - this.LJLJI;
                            return;
                        }
                    }
                    LIZ();
                    this.LJLJI = i2;
                    this.LJLJJI = i3;
                    this.LJLJJL = obj;
                    this.LJLILLLLZI = 3;
                }
            };
        }
        int i2 = this.LJ;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.LJ;
        int i4 = this.LJFF;
        for (int size = this.LIZ.size() - 1; size >= 0; size--) {
            C03140Ak c03140Ak = (C03140Ak) ListProtector.get(this.LIZ, size);
            int i5 = c03140Ak.LIZ;
            int i6 = c03140Ak.LIZJ;
            int i7 = i5 + i6;
            int i8 = c03140Ak.LIZIZ + i6;
            while (true) {
                if (i3 <= i7) {
                    break;
                }
                i3--;
                int i9 = this.LIZIZ[i3];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    C03170An LIZLLL = LIZLLL(arrayDeque, i10, false);
                    if (LIZLLL != null) {
                        int i11 = (i2 - LIZLLL.LIZIZ) - 1;
                        c28841Bg.LJLJLLL(i3, i11);
                        if ((i9 & 4) != 0) {
                            c28841Bg.LJJLIIIJILLIZJL(i11, 1, this.LIZLLL.LIZJ(i3, i10));
                        }
                    } else {
                        arrayDeque.add(new C03170An(i3, (i2 - i3) - 1, true));
                    }
                } else {
                    c28841Bg.LJJIJLIJ(i3, 1);
                    i2--;
                }
            }
            while (i4 > i8) {
                i4--;
                int i12 = this.LIZJ[i4];
                if ((i12 & 12) != 0) {
                    int i13 = i12 >> 4;
                    C03170An LIZLLL2 = LIZLLL(arrayDeque, i13, true);
                    if (LIZLLL2 == null) {
                        arrayDeque.add(new C03170An(i4, i2 - i3, false));
                    } else {
                        c28841Bg.LJLJLLL((i2 - LIZLLL2.LIZIZ) - 1, i3);
                        if ((i12 & 4) != 0) {
                            c28841Bg.LJJLIIIJILLIZJL(i3, 1, this.LIZLLL.LIZJ(i13, i4));
                        }
                    }
                } else {
                    c28841Bg.LJLIIIL(i3, 1);
                    i2++;
                }
            }
            int i14 = c03140Ak.LIZ;
            int i15 = c03140Ak.LIZIZ;
            for (i = 0; i < c03140Ak.LIZJ; i++) {
                if ((this.LIZIZ[i14] & 15) == 2) {
                    c28841Bg.LJJLIIIJILLIZJL(i14, 1, this.LIZLLL.LIZJ(i14, i15));
                }
                i14++;
                i15++;
            }
            i3 = c03140Ak.LIZ;
            i4 = c03140Ak.LIZIZ;
        }
        c28841Bg.LIZ();
    }

    public final void LIZJ(AbstractC029409q abstractC029409q) {
        LIZIZ(new C28811Bd(abstractC029409q));
    }

    public static C03170An LIZLLL(Collection<C03170An> collection, int i, boolean z) {
        C03170An c03170An;
        Iterator it = ((ArrayDeque) collection).iterator();
        while (true) {
            if (it.hasNext()) {
                c03170An = (C03170An) it.next();
                if (c03170An.LIZ == i && c03170An.LIZJ == z) {
                    it.remove();
                    break;
                }
            } else {
                c03170An = null;
                break;
            }
        }
        while (it.hasNext()) {
            C03170An c03170An2 = (C03170An) it.next();
            if (z) {
                c03170An2.LIZIZ--;
            } else {
                c03170An2.LIZIZ++;
            }
        }
        return c03170An;
    }

    public C03150Al(AbstractC03120Ai abstractC03120Ai, List<C03140Ak> list, int[] iArr, int[] iArr2, boolean z) {
        C03140Ak c03140Ak;
        int i;
        C03140Ak c03140Ak2;
        int i2;
        int i3;
        int i4;
        this.LIZ = list;
        this.LIZIZ = iArr;
        this.LIZJ = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.LIZLLL = abstractC03120Ai;
        int LJ = abstractC03120Ai.LJ();
        this.LJ = LJ;
        int LIZLLL = abstractC03120Ai.LIZLLL();
        this.LJFF = LIZLLL;
        this.LJI = z;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty() || (c03140Ak = (C03140Ak) ListProtector.get(list, 0)) == null || c03140Ak.LIZ != 0 || c03140Ak.LIZIZ != 0) {
            ListProtector.add(list, 0, new C03140Ak(0, 0, 0));
        }
        arrayList.add(new C03140Ak(LJ, LIZLLL, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C03140Ak c03140Ak3 = (C03140Ak) it.next();
            for (int i5 = 0; i5 < c03140Ak3.LIZJ; i5++) {
                int i6 = c03140Ak3.LIZ + i5;
                int i7 = c03140Ak3.LIZIZ + i5;
                if (this.LIZLLL.LIZ(i6, i7)) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                this.LIZIZ[i6] = (i7 << 4) | i4;
                this.LIZJ[i7] = (i6 << 4) | i4;
            }
        }
        if (this.LJI) {
            int i8 = 0;
            for (C03140Ak c03140Ak4 : this.LIZ) {
                while (true) {
                    i = c03140Ak4.LIZ;
                    if (i8 < i) {
                        if (this.LIZIZ[i8] == 0) {
                            int size = this.LIZ.size();
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i9 < size) {
                                    c03140Ak2 = (C03140Ak) ListProtector.get(this.LIZ, i9);
                                    while (true) {
                                        i2 = c03140Ak2.LIZIZ;
                                        if (i10 < i2) {
                                            if (this.LIZJ[i10] == 0 && this.LIZLLL.LIZIZ(i8, i10)) {
                                                if (this.LIZLLL.LIZ(i8, i10)) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 4;
                                                }
                                                this.LIZIZ[i8] = (i10 << 4) | i3;
                                                this.LIZJ[i10] = i3 | (i8 << 4);
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                }
                                i10 = c03140Ak2.LIZJ + i2;
                                i9++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = c03140Ak4.LIZJ + i;
            }
        }
    }
}
