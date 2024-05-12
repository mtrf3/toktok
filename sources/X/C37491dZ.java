package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1dZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37491dZ extends C11G {
    public final C1DO LIZIZ;
    public final C25710zf<C11O> LIZJ;
    public final java.util.Map<C11O, C11P> LIZLLL;
    public AbstractC538029g LJ;
    public C11H LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    @Override // X.C11G
    public final void LIZJ() {
        C25710zf<C37491dZ> c25710zf = this.LIZ;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            C37491dZ[] c37491dZArr = c25710zf.LJLIL;
            o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                c37491dZArr[i2].LIZJ();
                i2++;
            } while (i2 < i);
        }
        this.LIZIZ.LJFF();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Node(pointerInputFilter=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", children=");
        LIZ.append(this.LIZ);
        LIZ.append(", pointerIds=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C37491dZ(C1DO pointerInputNode) {
        o.LJIIIZ(pointerInputNode, "pointerInputNode");
        this.LIZIZ = pointerInputNode;
        this.LIZJ = new C25710zf<>(new C11O[16]);
        this.LIZLLL = new LinkedHashMap();
        this.LJII = true;
        this.LJIIIIZZ = true;
    }

    @Override // X.C11G
    public final void LIZIZ(C11B c11b) {
        super.LIZIZ(c11b);
        C11H c11h = this.LJFF;
        if (c11h == null) {
            return;
        }
        this.LJI = this.LJII;
        List<C11P> list = c11h.LIZ;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C11P c11p = (C11P) ListProtector.get(list, i);
            if (!c11p.LIZLLL && (!c11b.LIZ(c11p.LIZ) || !this.LJII)) {
                this.LIZJ.LJIIL(new C11O(c11p.LIZ));
            }
        }
        this.LJII = false;
        if (c11h.LIZJ == 5) {
            z = true;
        }
        this.LJIIIIZZ = z;
    }

    @Override // X.C11G
    public final boolean LIZLLL(C11B c11b) {
        C25710zf<C37491dZ> c25710zf;
        int i;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (!this.LIZLLL.isEmpty() && C1JI.LJIJJLI(this.LIZIZ)) {
            C11H c11h = this.LJFF;
            o.LJI(c11h);
            AbstractC538029g abstractC538029g = this.LJ;
            o.LJI(abstractC538029g);
            this.LIZIZ.LIZJ(c11h, C11I.Final, abstractC538029g.LJLJI);
            if (C1JI.LJIJJLI(this.LIZIZ) && (i = (c25710zf = this.LIZ).LJLJI) > 0) {
                C37491dZ[] c37491dZArr = c25710zf.LJLIL;
                o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    c37491dZArr[i2].LIZLLL(c11b);
                    i2++;
                } while (i2 < i);
            }
            z = true;
        }
        LIZIZ(c11b);
        ((LinkedHashMap) this.LIZLLL).clear();
        this.LJ = null;
        return z;
    }

    @Override // X.C11G
    public final boolean LIZ(java.util.Map<C11O, C11P> changes, InterfaceC274415w parentCoordinates, C11B c11b, boolean z) {
        Object obj;
        boolean z2;
        C11H c11h;
        int i;
        float f;
        o.LJIIIZ(changes, "changes");
        o.LJIIIZ(parentCoordinates, "parentCoordinates");
        boolean LIZ = super.LIZ(changes, parentCoordinates, c11b, z);
        if (!C1JI.LJIJJLI(this.LIZIZ)) {
            return true;
        }
        C1DO c1do = this.LIZIZ;
        o.LJIIIZ(c1do, "<this>");
        this.LJ = C78840Uwu.LJJIIZI(c1do, 16);
        Iterator<Map.Entry<C11O, C11P>> it = changes.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<C11O, C11P> next = it.next();
            long j = next.getKey().LIZ;
            C11P value = next.getValue();
            if (this.LIZJ.LJIIIIZZ(new C11O(j))) {
                ArrayList arrayList = new ArrayList();
                List list = value.LJIIJ;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass119 anonymousClass119 = (AnonymousClass119) ListProtector.get(list, i2);
                    long j2 = anonymousClass119.LIZ;
                    AbstractC538029g abstractC538029g = this.LJ;
                    o.LJI(abstractC538029g);
                    arrayList.add(new AnonymousClass119(j2, abstractC538029g.LJIIL(parentCoordinates, anonymousClass119.LIZIZ)));
                }
                java.util.Map<C11O, C11P> map = this.LIZLLL;
                C11O c11o = new C11O(j);
                AbstractC538029g abstractC538029g2 = this.LJ;
                o.LJI(abstractC538029g2);
                long LJIIL = abstractC538029g2.LJIIL(parentCoordinates, value.LJFF);
                AbstractC538029g abstractC538029g3 = this.LJ;
                o.LJI(abstractC538029g3);
                long LJIIL2 = abstractC538029g3.LJIIL(parentCoordinates, value.LIZJ);
                long j3 = value.LIZ;
                long j4 = value.LIZIZ;
                boolean z3 = value.LIZLLL;
                long j5 = value.LJ;
                boolean z4 = value.LJI;
                int i3 = value.LJII;
                long j6 = value.LJIIIIZZ;
                Float f2 = value.LJIIIZ;
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = 0.0f;
                }
                C11P c11p = new C11P(j3, j4, LJIIL2, z3, f, j5, LJIIL, z4, i3, arrayList, j6);
                c11p.LJIIJJI = value.LJIIJJI;
                map.put(c11o, c11p);
            }
        }
        if (this.LIZLLL.isEmpty()) {
            this.LIZJ.LJII();
            this.LIZ.LJII();
            return true;
        }
        for (int i4 = this.LIZJ.LJLJI - 1; -1 < i4; i4--) {
            if (!changes.containsKey(new C11O(this.LIZJ.LJLIL[i4].LIZ))) {
                this.LIZJ.LJIILJJIL(i4);
            }
        }
        C11H c11h2 = new C11H(ORZ.LLJI(((LinkedHashMap) this.LIZLLL).values()), c11b);
        List<C11P> list2 = c11h2.LIZ;
        int size2 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 < size2) {
                obj = ListProtector.get(list2, i5);
                if (c11b.LIZ(((C11P) obj).LIZ)) {
                    break;
                }
                i5++;
            } else {
                obj = null;
                break;
            }
        }
        C11P c11p2 = (C11P) obj;
        if (c11p2 != null) {
            if (!z) {
                this.LJII = false;
            } else if (!this.LJII && (c11p2.LIZLLL || c11p2.LJI)) {
                o.LJI(this.LJ);
                this.LJII = !u.LJJI(c11p2, r0.LJLJI);
            }
            boolean z5 = this.LJII;
            boolean z6 = this.LJI;
            int i6 = 4;
            if (z5 != z6 && ((i = c11h2.LIZJ) == 3 || i == 4 || i == 5)) {
                if (!z5) {
                    i6 = 5;
                }
                c11h2.LIZJ = i6;
            } else {
                int i7 = c11h2.LIZJ;
                if (i7 == 4 && z6 && !this.LJIIIIZZ) {
                    c11h2.LIZJ = 3;
                } else if (i7 == 5 && z5 && c11p2.LIZLLL) {
                    c11h2.LIZJ = 3;
                }
            }
        }
        if (!LIZ && c11h2.LIZJ == 3 && (c11h = this.LJFF) != null && c11h.LIZ.size() == c11h2.LIZ.size()) {
            int size3 = c11h2.LIZ.size();
            for (int i8 = 0; i8 < size3; i8++) {
                if (C10370av.LIZIZ(((C11P) ListProtector.get(c11h.LIZ, i8)).LIZJ, ((C11P) ListProtector.get(c11h2.LIZ, i8)).LIZJ)) {
                }
            }
            z2 = false;
            this.LJFF = c11h2;
            return z2;
        }
        z2 = true;
        this.LJFF = c11h2;
        return z2;
    }

    @Override // X.C11G
    public final boolean LJ(java.util.Map<C11O, C11P> changes, InterfaceC274415w parentCoordinates, C11B c11b, boolean z) {
        C25710zf<C37491dZ> c25710zf;
        int i;
        o.LJIIIZ(changes, "changes");
        o.LJIIIZ(parentCoordinates, "parentCoordinates");
        int i2 = 0;
        if (this.LIZLLL.isEmpty() || !C1JI.LJIJJLI(this.LIZIZ)) {
            return false;
        }
        C11H c11h = this.LJFF;
        o.LJI(c11h);
        AbstractC538029g abstractC538029g = this.LJ;
        o.LJI(abstractC538029g);
        long j = abstractC538029g.LJLJI;
        this.LIZIZ.LIZJ(c11h, C11I.Initial, j);
        if (C1JI.LJIJJLI(this.LIZIZ) && (i = (c25710zf = this.LIZ).LJLJI) > 0) {
            C37491dZ[] c37491dZArr = c25710zf.LJLIL;
            o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                C37491dZ c37491dZ = c37491dZArr[i2];
                java.util.Map<C11O, C11P> map = this.LIZLLL;
                AbstractC538029g abstractC538029g2 = this.LJ;
                o.LJI(abstractC538029g2);
                c37491dZ.LJ(map, abstractC538029g2, c11b, z);
                i2++;
            } while (i2 < i);
        }
        if (C1JI.LJIJJLI(this.LIZIZ)) {
            this.LIZIZ.LIZJ(c11h, C11I.Main, j);
        }
        return true;
    }
}
