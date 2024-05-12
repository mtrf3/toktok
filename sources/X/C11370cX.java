package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0cX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11370cX {
    public final InterfaceC70422pa LIZ;
    public final boolean LIZIZ;
    public final java.util.Map<Object, C11320cS> LIZJ;
    public java.util.Map<Object, Integer> LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public final java.util.Set<Object> LJIIIIZZ;

    public final int LIZIZ(long j) {
        if (this.LIZIZ) {
            return C23450w1.LIZJ(j);
        }
        return (int) (j >> 32);
    }

    public C11370cX(InterfaceC70422pa scope, boolean z) {
        o.LJIIIZ(scope, "scope");
        this.LIZ = scope;
        this.LIZIZ = z;
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = C113554cx.LJJJLIIL();
        this.LJ = -1;
        this.LJI = -1;
        this.LJIIIIZZ = new LinkedHashSet();
    }

    public final void LIZJ(C1QL c1ql, C11320cS c11320cS) {
        int i;
        int i2;
        while (((ArrayList) c11320cS.LIZLLL).size() > c1ql.LJIIL.size()) {
            ORS.LJJLL(c11320cS.LIZLLL);
        }
        while (((ArrayList) c11320cS.LIZLLL).size() < c1ql.LJIIL.size()) {
            int size = ((ArrayList) c11320cS.LIZLLL).size();
            long j = c1ql.LIZ;
            List<C11300cQ> list = c11320cS.LIZLLL;
            long j2 = c11320cS.LIZJ;
            long LIZ = C78939UyV.LIZ(((int) (j >> 32)) - ((int) (j2 >> 32)), C23450w1.LIZJ(j) - C23450w1.LIZJ(j2));
            AbstractC39201gK abstractC39201gK = ((C11340cU) ListProtector.get(c1ql.LJIIL, size)).LIZ;
            if (c1ql.LJIIJJI) {
                i2 = abstractC39201gK.LJLILLLLZI;
            } else {
                i2 = abstractC39201gK.LJLIL;
            }
            ((ArrayList) list).add(new C11300cQ(LIZ, i2));
        }
        ArrayList arrayList = (ArrayList) c11320cS.LIZLLL;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C11300cQ c11300cQ = (C11300cQ) ListProtector.get(arrayList, i3);
            long j3 = c11300cQ.LIZJ;
            long j4 = c11320cS.LIZJ;
            long LIZ2 = C78939UyV.LIZ(((int) (j3 >> 32)) + ((int) (j4 >> 32)), C23450w1.LIZJ(j4) + C23450w1.LIZJ(j3));
            long j5 = c1ql.LIZIZ;
            AbstractC39201gK abstractC39201gK2 = ((C11340cU) ListProtector.get(c1ql.LJIIL, i3)).LIZ;
            if (c1ql.LJIIJJI) {
                i = abstractC39201gK2.LJLILLLLZI;
            } else {
                i = abstractC39201gK2.LJLIL;
            }
            c11300cQ.LIZ = i;
            C1J4<C23450w1> LJ = c1ql.LJ(i3);
            if (!C23450w1.LIZIZ(LIZ2, j5)) {
                long j6 = c11320cS.LIZJ;
                c11300cQ.LIZJ = C78939UyV.LIZ(((int) (j5 >> 32)) - ((int) (j6 >> 32)), C23450w1.LIZJ(j5) - C23450w1.LIZJ(j6));
                if (LJ != null) {
                    c11300cQ.LIZLLL.setValue(Boolean.TRUE);
                    XKX.LIZLLL(this.LIZ, null, null, new C54932Dp(c11300cQ, LJ, null), 3);
                }
            }
        }
    }

    public final int LIZ(int i, int i2, int i3, long j, boolean z, int i4, int i5, List<C1QL> list, C11420cc c11420cc) {
        boolean z2;
        int i6 = this.LJI;
        boolean z3 = false;
        if (z ? i6 > i : i6 < i) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i7 = this.LJ;
        if (z ? i7 < i : i7 > i) {
            z3 = true;
        }
        if (z2) {
            if (z) {
                i6 = i;
            }
            int LIZJ = C11380cY.LIZJ(c11420cc, i6);
            if (z) {
                i = this.LJI;
            }
            return C11380cY.LIZ(c11420cc, LIZJ, C11380cY.LIZIZ(c11420cc, i) - 1, i3, list) + LIZIZ(j) + i4 + this.LJII;
        }
        if (!z3) {
            return i5;
        }
        if (!z) {
            i7 = i;
        }
        int LIZJ2 = C11380cY.LIZJ(c11420cc, i7);
        if (!z) {
            i = this.LJ;
        }
        return LIZIZ(j) + this.LJFF + (-i2) + (-C11380cY.LIZ(c11420cc, LIZJ2, C11380cY.LIZIZ(c11420cc, i) - 1, i3, list));
    }
}
