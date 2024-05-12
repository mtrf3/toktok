package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10240ai {
    public final InterfaceC70422pa LIZ;
    public final boolean LIZIZ;
    public final java.util.Map<Object, C10140aY> LIZJ;
    public java.util.Map<Object, Integer> LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public final java.util.Set<Object> LJIIIIZZ;

    public final int LIZJ(long j) {
        if (this.LIZIZ) {
            return C23450w1.LIZJ(j);
        }
        return (int) (j >> 32);
    }

    public C10240ai(InterfaceC70422pa scope, boolean z) {
        o.LJIIIZ(scope, "scope");
        this.LIZ = scope;
        this.LIZIZ = z;
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = C113554cx.LJJJLIIL();
        this.LJ = -1;
        this.LJI = -1;
        this.LJIIIIZZ = new LinkedHashSet();
    }

    public final void LIZLLL(C32491Ph c32491Ph, C10140aY c10140aY) {
        while (((ArrayList) c10140aY.LIZIZ).size() > c32491Ph.LJIIIIZZ.size()) {
            ORS.LJJLL(c10140aY.LIZIZ);
        }
        while (((ArrayList) c10140aY.LIZIZ).size() < c32491Ph.LJIIIIZZ.size()) {
            int size = ((ArrayList) c10140aY.LIZIZ).size();
            long LIZJ = c32491Ph.LIZJ(size);
            List<C10310ap> list = c10140aY.LIZIZ;
            long j = c10140aY.LIZ;
            ((ArrayList) list).add(new C10310ap(C78939UyV.LIZ(((int) (LIZJ >> 32)) - ((int) (j >> 32)), C23450w1.LIZJ(LIZJ) - C23450w1.LIZJ(j)), c32491Ph.LIZIZ(size)));
        }
        ArrayList arrayList = (ArrayList) c10140aY.LIZIZ;
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            C10310ap c10310ap = (C10310ap) ListProtector.get(arrayList, i);
            long j2 = c10310ap.LIZJ;
            long j3 = c10140aY.LIZ;
            long LIZ = C78939UyV.LIZ(((int) (j2 >> 32)) + ((int) (j3 >> 32)), C23450w1.LIZJ(j3) + C23450w1.LIZJ(j2));
            long LIZJ2 = c32491Ph.LIZJ(i);
            c10310ap.LIZ = c32491Ph.LIZIZ(i);
            C1J4<C23450w1> LIZ2 = c32491Ph.LIZ(i);
            if (!C23450w1.LIZIZ(LIZ, LIZJ2)) {
                long j4 = c10140aY.LIZ;
                c10310ap.LIZJ = C78939UyV.LIZ(((int) (LIZJ2 >> 32)) - ((int) (j4 >> 32)), C23450w1.LIZJ(LIZJ2) - C23450w1.LIZJ(j4));
                if (LIZ2 != null) {
                    c10310ap.LIZLLL.setValue(Boolean.TRUE);
                    XKX.LIZLLL(this.LIZ, null, null, new C54872Dj(c10310ap, LIZ2, null), 3);
                }
            }
        }
    }

    public static int LIZIZ(int i, int i2, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty() && i >= ((C32491Ph) ORZ.LJLLJ(list)).LIZIZ && i <= ((C32491Ph) ORZ.LLFF(list)).LIZIZ) {
            if (i - ((C32491Ph) ORZ.LJLLJ(list)).LIZIZ < ((C32491Ph) ORZ.LLFF(list)).LIZIZ - i) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C32491Ph c32491Ph = (C32491Ph) ListProtector.get(list, i3);
                    int i4 = c32491Ph.LIZIZ;
                    if (i4 == i) {
                        return c32491Ph.LJ;
                    }
                    if (i4 > i) {
                        break;
                    }
                }
            } else {
                for (int LJJI = C47261Igj.LJJI(list); -1 < LJJI; LJJI--) {
                    C32491Ph c32491Ph2 = (C32491Ph) ListProtector.get(list, LJJI);
                    int i5 = c32491Ph2.LIZIZ;
                    if (i5 == i) {
                        return c32491Ph2.LJ;
                    }
                    if (i5 < i) {
                        break;
                    }
                }
            }
        }
        return i2;
    }

    public final int LIZ(int i, int i2, int i3, long j, boolean z, int i4, int i5, List<C32491Ph> list) {
        boolean z2;
        boolean z3;
        C40517FvF LJJ;
        C40517FvF LJJ2;
        int i6 = this.LJI;
        int i7 = 0;
        if (z ? i6 > i : i6 < i) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i8 = this.LJ;
        if (z ? i8 < i : i8 > i) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            if (!z) {
                LJJ2 = C78842Uww.LJJ(i6 + 1, i);
            } else {
                LJJ2 = C78842Uww.LJJ(i + 1, i6);
            }
            int i9 = LJJ2.LJLIL;
            int i10 = LJJ2.LJLILLLLZI;
            if (i9 <= i10) {
                while (true) {
                    i7 += LIZIZ(i9, i3, list);
                    if (i9 == i10) {
                        break;
                    }
                    i9++;
                }
            }
            return LIZJ(j) + i4 + this.LJII + i7;
        }
        if (z3) {
            if (!z) {
                LJJ = C78842Uww.LJJ(i + 1, i8);
            } else {
                LJJ = C78842Uww.LJJ(i8 + 1, i);
            }
            int i11 = LJJ.LJLIL;
            int i12 = LJJ.LJLILLLLZI;
            if (i11 <= i12) {
                while (true) {
                    i2 += LIZIZ(i11, i3, list);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            return LIZJ(j) + (this.LJFF - i2);
        }
        return i5;
    }
}
