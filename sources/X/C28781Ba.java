package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28781Ba implements C0AS {
    public final C0AH LIZLLL;
    public final C1UB LIZ = new C1UB(30);
    public final ArrayList<C0AI> LIZIZ = new ArrayList<>();
    public final ArrayList<C0AI> LIZJ = new ArrayList<>();
    public int LJFF = 0;
    public final C0AT LJ = new C0AT(this);

    public final void LIZIZ() {
        int size = this.LIZJ.size();
        for (int i = 0; i < size; i++) {
            ((C28901Bm) this.LIZLLL).LIZ((C0AI) ListProtector.get(this.LIZJ, i));
        }
        LJIIJJI(this.LIZJ);
        this.LJFF = 0;
    }

    public final boolean LJI() {
        if (this.LIZIZ.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28781Ba.LJIIIZ():void");
    }

    public final void LIZJ() {
        LIZIZ();
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            C0AI c0ai = (C0AI) ListProtector.get(this.LIZIZ, i);
            int i2 = c0ai.LIZ;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            ((C28901Bm) this.LIZLLL).LIZ(c0ai);
                            ((C28901Bm) this.LIZLLL).LIZLLL(c0ai.LIZIZ, c0ai.LIZLLL);
                        }
                    } else {
                        ((C28901Bm) this.LIZLLL).LIZ(c0ai);
                        ((C28901Bm) this.LIZLLL).LIZIZ(c0ai.LIZIZ, c0ai.LIZLLL, c0ai.LIZJ);
                    }
                } else {
                    ((C28901Bm) this.LIZLLL).LIZ(c0ai);
                    C0AH c0ah = this.LIZLLL;
                    int i3 = c0ai.LIZIZ;
                    int i4 = c0ai.LIZLLL;
                    C28901Bm c28901Bm = (C28901Bm) c0ah;
                    c28901Bm.LIZ.LJJL(i3, i4, true);
                    RecyclerView recyclerView = c28901Bm.LIZ;
                    recyclerView.LLJILLL = true;
                    recyclerView.LLJIJIL.LIZJ += i4;
                }
            } else {
                ((C28901Bm) this.LIZLLL).LIZ(c0ai);
                ((C28901Bm) this.LIZLLL).LIZJ(c0ai.LIZIZ, c0ai.LIZLLL);
            }
        }
        LJIIJJI(this.LIZIZ);
        this.LJFF = 0;
    }

    public C28781Ba(C28901Bm c28901Bm) {
        this.LIZLLL = c28901Bm;
    }

    public final boolean LIZ(int i) {
        int size = this.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0AI c0ai = (C0AI) ListProtector.get(this.LIZJ, i2);
            int i3 = c0ai.LIZ;
            if (i3 == 8) {
                if (LJFF(c0ai.LIZLLL, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0ai.LIZIZ;
                int i5 = c0ai.LIZLLL + i4;
                while (i4 < i5) {
                    if (LJFF(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void LIZLLL(C0AI c0ai) {
        int i;
        int i2 = c0ai.LIZ;
        if (i2 != 1 && i2 != 8) {
            int LJIIL = LJIIL(c0ai.LIZIZ, i2);
            int i3 = c0ai.LIZIZ;
            int i4 = c0ai.LIZ;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("op should be remove or update.");
                    LIZ.append(c0ai);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c0ai.LIZLLL; i6++) {
                int LJIIL2 = LJIIL((i * i6) + c0ai.LIZIZ, c0ai.LIZ);
                int i7 = c0ai.LIZ;
                if (i7 == 2 ? LJIIL2 != LJIIL : i7 != 4 || LJIIL2 != LJIIL + 1) {
                    C0AI LJII = LJII(i7, LJIIL, i5, c0ai.LIZJ);
                    LJ(LJII, i3);
                    LJII.LIZJ = null;
                    this.LIZ.LIZ(LJII);
                    if (c0ai.LIZ == 4) {
                        i3 += i5;
                    }
                    LJIIL = LJIIL2;
                    i5 = 1;
                } else {
                    i5++;
                }
            }
            Object obj = c0ai.LIZJ;
            c0ai.LIZJ = null;
            this.LIZ.LIZ(c0ai);
            if (i5 > 0) {
                C0AI LJII2 = LJII(c0ai.LIZ, LJIIL, i5, obj);
                LJ(LJII2, i3);
                LJII2.LIZJ = null;
                this.LIZ.LIZ(LJII2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void LJIIIIZZ(C0AI c0ai) {
        this.LIZJ.add(c0ai);
        int i = c0ai.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        ((C28901Bm) this.LIZLLL).LIZLLL(c0ai.LIZIZ, c0ai.LIZLLL);
                        return;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unknown update op type for ");
                        LIZ.append(c0ai);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    }
                }
                ((C28901Bm) this.LIZLLL).LIZIZ(c0ai.LIZIZ, c0ai.LIZLLL, c0ai.LIZJ);
                return;
            }
            C0AH c0ah = this.LIZLLL;
            C28901Bm c28901Bm = (C28901Bm) c0ah;
            c28901Bm.LIZ.LJJL(c0ai.LIZIZ, c0ai.LIZLLL, false);
            c28901Bm.LIZ.LLJILLL = true;
            return;
        }
        ((C28901Bm) this.LIZLLL).LIZJ(c0ai.LIZIZ, c0ai.LIZLLL);
    }

    public final void LJIIJ(C0AI c0ai) {
        c0ai.LIZJ = null;
        this.LIZ.LIZ(c0ai);
    }

    public final void LJIIJJI(List<C0AI> list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            LJIIJ((C0AI) ListProtector.get(arrayList, i));
        }
        arrayList.clear();
    }

    public final void LJ(C0AI c0ai, int i) {
        ((C28901Bm) this.LIZLLL).LIZ(c0ai);
        int i2 = c0ai.LIZ;
        if (i2 != 2) {
            if (i2 == 4) {
                ((C28901Bm) this.LIZLLL).LIZIZ(i, c0ai.LIZLLL, c0ai.LIZJ);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        C0AH c0ah = this.LIZLLL;
        int i3 = c0ai.LIZLLL;
        C28901Bm c28901Bm = (C28901Bm) c0ah;
        c28901Bm.LIZ.LJJL(i, i3, true);
        RecyclerView recyclerView = c28901Bm.LIZ;
        recyclerView.LLJILLL = true;
        recyclerView.LLJIJIL.LIZJ += i3;
    }

    public final int LJFF(int i, int i2) {
        int size = this.LIZJ.size();
        while (i2 < size) {
            C0AI c0ai = (C0AI) ListProtector.get(this.LIZJ, i2);
            int i3 = c0ai.LIZ;
            if (i3 == 8) {
                int i4 = c0ai.LIZIZ;
                if (i4 == i) {
                    i = c0ai.LIZLLL;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0ai.LIZLLL <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0ai.LIZIZ;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0ai.LIZLLL;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0ai.LIZLLL;
                }
            }
            i2++;
        }
        return i;
    }

    public final int LJIIL(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.LIZJ.size() - 1; size >= 0; size--) {
            C0AI c0ai = (C0AI) ListProtector.get(this.LIZJ, size);
            int i5 = c0ai.LIZ;
            if (i5 == 8) {
                int i6 = c0ai.LIZIZ;
                int i7 = c0ai.LIZLLL;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            c0ai.LIZLLL = i7 + 1;
                        } else if (i2 == 2) {
                            c0ai.LIZLLL = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c0ai.LIZIZ = i6 + 1;
                        } else if (i2 == 2) {
                            c0ai.LIZIZ = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        c0ai.LIZIZ = i6 + 1;
                        c0ai.LIZLLL = i7 + 1;
                    } else if (i2 == 2) {
                        c0ai.LIZIZ = i6 - 1;
                        c0ai.LIZLLL = i7 - 1;
                    }
                }
            } else {
                int i8 = c0ai.LIZIZ;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0ai.LIZLLL;
                    } else if (i5 == 2) {
                        i += c0ai.LIZLLL;
                    }
                } else if (i2 == 1) {
                    c0ai.LIZIZ = i8 + 1;
                } else if (i2 == 2) {
                    c0ai.LIZIZ = i8 - 1;
                }
            }
        }
        for (int size2 = this.LIZJ.size() - 1; size2 >= 0; size2--) {
            C0AI c0ai2 = (C0AI) ListProtector.get(this.LIZJ, size2);
            if (c0ai2.LIZ == 8) {
                int i9 = c0ai2.LIZLLL;
                if (i9 == c0ai2.LIZIZ || i9 < 0) {
                    ListProtector.remove(this.LIZJ, size2);
                    LJIIJ(c0ai2);
                }
            } else if (c0ai2.LIZLLL <= 0) {
                ListProtector.remove(this.LIZJ, size2);
                LJIIJ(c0ai2);
            }
        }
        return i;
    }

    public final C0AI LJII(int i, int i2, int i3, Object obj) {
        C0AI c0ai = (C0AI) this.LIZ.LIZIZ();
        if (c0ai == null) {
            return new C0AI(i, i2, i3, obj);
        }
        c0ai.LIZ = i;
        c0ai.LIZIZ = i2;
        c0ai.LIZLLL = i3;
        c0ai.LIZJ = obj;
        return c0ai;
    }
}
