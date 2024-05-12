package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.0OF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OF {
    public static final C48191up LIZ = C48191up.LJLIL;
    public static final C24730y5 LIZIZ = new C24730y5();
    public static final Object LIZJ = new Object();
    public static C1IQ LIZLLL;
    public static int LJ;
    public static final C0OD LJFF;
    public static final List<InterfaceC88471Ynr<java.util.Set<? extends Object>, C0OA, C76800UCe>> LJI;
    public static final List<InterfaceC88472Yns<Object, C76800UCe>> LJII;
    public static final AtomicReference<C41261je> LJIIIIZZ;
    public static final C0OA LJIIIZ;

    static {
        C1IQ c1iq = C1IQ.LJLJJL;
        LIZLLL = c1iq;
        LJ = 1;
        LJFF = new C0OD();
        LJI = new ArrayList();
        LJII = new ArrayList();
        int i = LJ;
        LJ = i + 1;
        C41261je c41261je = new C41261je(i, c1iq);
        LIZLLL = LIZLLL.LJIILJJIL(c41261je.LIZIZ);
        AtomicReference<C41261je> atomicReference = new AtomicReference<>(c41261je);
        LJIIIIZZ = atomicReference;
        C41261je c41261je2 = atomicReference.get();
        o.LJIIIIZZ(c41261je2, "currentGlobalSnapshot.get()");
        LJIIIZ = c41261je2;
    }

    public static final C0OA LJIIIIZZ() {
        C0OA c0oa = (C0OA) LIZIZ.LIZ();
        if (c0oa == null) {
            C41261je c41261je = LJIIIIZZ.get();
            o.LJIIIIZZ(c41261je, "currentGlobalSnapshot.get()");
            return c41261je;
        }
        return c0oa;
    }

    public static final void LJIILJJIL() {
        "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString();
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final void LIZJ(C0OA c0oa) {
        if (LIZLLL.LJIIIIZZ(c0oa.LIZLLL())) {
            return;
        }
        "Snapshot is not open".toString();
        throw new IllegalStateException("Snapshot is not open");
    }

    public static final <T> T LJ(InterfaceC88472Yns<? super C1IQ, ? extends T> interfaceC88472Yns) {
        C41261je c41261je;
        T t;
        List LLJILJILJ;
        o.LJII(LJIIIZ, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        Object obj = LIZJ;
        synchronized (obj) {
            c41261je = LJIIIIZZ.get();
            o.LJIIIIZZ(c41261je, "currentGlobalSnapshot.get()");
            t = (T) LJIJ(c41261je, interfaceC88472Yns);
        }
        java.util.Set<C0O9> set = c41261je.LJII;
        if (set != null) {
            synchronized (obj) {
                LLJILJILJ = ORZ.LLJILJILJ(LJI);
            }
            int size = ((ArrayList) LLJILJILJ).size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC88471Ynr) ListProtector.get(LLJILJILJ, i)).invoke(set, c41261je);
            }
        }
        return t;
    }

    public static final <T extends C0OB> T LJI(T r) {
        o.LJIIIZ(r, "r");
        C0OA LJIIIIZZ2 = LJIIIIZZ();
        T t = (T) LJIILL(r, LJIIIIZZ2.LIZLLL(), LJIIIIZZ2.LJ());
        if (t == null) {
            synchronized (LIZJ) {
                C0OA LJIIIIZZ3 = LJIIIIZZ();
                t = (T) LJIILL(r, LJIIIIZZ3.LIZLLL(), LJIIIIZZ3.LJ());
            }
            if (t == null) {
                LJIILJJIL();
                throw null;
            }
        }
        return t;
    }

    public static final void LJIIZILJ(int i) {
        int i2;
        C0OD c0od = LJFF;
        int i3 = c0od.LIZLLL[i];
        c0od.LIZIZ(i3, c0od.LIZ - 1);
        c0od.LIZ--;
        int[] iArr = c0od.LIZIZ;
        int i4 = iArr[i3];
        int i5 = i3;
        while (i5 > 0) {
            int i6 = ((i5 + 1) >> 1) - 1;
            if (iArr[i6] <= i4) {
                break;
            }
            c0od.LIZIZ(i6, i5);
            i5 = i6;
        }
        int[] iArr2 = c0od.LIZIZ;
        int i7 = c0od.LIZ >> 1;
        while (i3 < i7) {
            int i8 = (i3 + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < c0od.LIZ && (i2 = iArr2[i8]) < iArr2[i9]) {
                if (i2 >= iArr2[i3]) {
                    break;
                }
                c0od.LIZIZ(i8, i3);
                i3 = i8;
            } else {
                if (iArr2[i9] >= iArr2[i3]) {
                    break;
                }
                c0od.LIZIZ(i9, i3);
                i3 = i9;
            }
        }
        c0od.LIZLLL[i] = c0od.LJ;
        c0od.LJ = i;
    }

    public static final InterfaceC88472Yns LIZ(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        if (interfaceC88472Yns != null) {
            if (interfaceC88472Yns2 != null && !o.LJ(interfaceC88472Yns, interfaceC88472Yns2)) {
                return new IDqS172S0200000(interfaceC88472Yns, (InterfaceC88472Yns<Object, C76800UCe>) interfaceC88472Yns2, (InterfaceC88472Yns<Object, C76800UCe>) 26);
            }
            return interfaceC88472Yns;
        }
        return interfaceC88472Yns2;
    }

    public static final <T extends C0OB> T LJII(T r, C0OA c0oa) {
        o.LJIIIZ(r, "r");
        T t = (T) LJIILL(r, c0oa.LIZLLL(), c0oa.LJ());
        if (t != null) {
            return t;
        }
        LJIILJJIL();
        throw null;
    }

    public static final <T extends C0OB> T LJIIJ(T t, C0O9 state) {
        o.LJIIIZ(t, "<this>");
        o.LJIIIZ(state, "state");
        C0OB LJII2 = state.LJII();
        C0OD c0od = LJFF;
        int i = LJ;
        if (c0od.LIZ > 0) {
            i = c0od.LIZIZ[0];
        }
        int i2 = i - 1;
        C1IQ c1iq = C1IQ.LJLJJL;
        T t2 = null;
        C0OB c0ob = null;
        while (true) {
            if (LJII2 != null) {
                int i3 = LJII2.LIZ;
                if (i3 == 0) {
                    break;
                }
                if (i3 <= i2 && !c1iq.LJIIIIZZ(i3)) {
                    if (c0ob == null) {
                        c0ob = LJII2;
                    } else if (LJII2.LIZ >= c0ob.LIZ) {
                        t2 = (T) c0ob;
                    }
                }
                LJII2 = LJII2.LIZIZ;
            } else {
                break;
            }
        }
        t2 = (T) LJII2;
        if (t2 != null) {
            t2.LIZ = Integer.MAX_VALUE;
            return t2;
        }
        T t3 = (T) t.LIZIZ();
        t3.LIZ = Integer.MAX_VALUE;
        t3.LIZIZ = state.LJII();
        state.LJIIIIZZ(t3);
        return t3;
    }

    public static final void LJIIL(C0OA c0oa, C0O9 state) {
        o.LJIIIZ(state, "state");
        InterfaceC88472Yns<Object, C76800UCe> LJII2 = c0oa.LJII();
        if (LJII2 != null) {
            LJII2.invoke(state);
        }
    }

    public static final <T extends C0OB> T LJIILLIIL(T t, C0O9 state) {
        o.LJIIIZ(t, "<this>");
        o.LJIIIZ(state, "state");
        C0OA LJIIIIZZ2 = LJIIIIZZ();
        InterfaceC88472Yns<Object, C76800UCe> LJFF2 = LJIIIIZZ2.LJFF();
        if (LJFF2 != null) {
            LJFF2.invoke(state);
        }
        T t2 = (T) LJIILL(t, LJIIIIZZ2.LIZLLL(), LJIIIIZZ2.LJ());
        if (t2 == null) {
            synchronized (LIZJ) {
                C0OA LJIIIIZZ3 = LJIIIIZZ();
                t2 = (T) LJIILL(t, LJIIIIZZ3.LIZLLL(), LJIIIIZZ3.LJ());
            }
            if (t2 == null) {
                LJIILJJIL();
                throw null;
            }
        }
        return t2;
    }

    public static final <T> T LJIJ(C0OA c0oa, InterfaceC88472Yns<? super C1IQ, ? extends T> interfaceC88472Yns) {
        T invoke = interfaceC88472Yns.invoke(LIZLLL.LJII(c0oa.LIZLLL()));
        synchronized (LIZJ) {
            int i = LJ;
            LJ = i + 1;
            LIZLLL = LIZLLL.LJII(c0oa.LIZLLL());
            LJIIIIZZ.set(new C41261je(i, LIZLLL));
            c0oa.LIZJ();
            LIZLLL = LIZLLL.LJIILJJIL(i);
        }
        return invoke;
    }

    public static final java.util.Map LIZIZ(C1IE c1ie, C1IE c1ie2, C1IQ c1iq) {
        C0OB LJIILL;
        java.util.Set<C0O9> LJIJJ = c1ie2.LJIJJ();
        int LIZLLL2 = c1ie.LIZLLL();
        if (LJIJJ == null) {
            return null;
        }
        C1IQ LJIIIZ2 = c1ie2.LJ().LJIILJJIL(c1ie2.LIZLLL()).LJIIIZ(c1ie2.LJIIIIZZ);
        HashMap hashMap = null;
        for (C0O9 c0o9 : LJIJJ) {
            C0OB LJII2 = c0o9.LJII();
            C0OB LJIILL2 = LJIILL(LJII2, LIZLLL2, c1iq);
            if (LJIILL2 != null && (LJIILL = LJIILL(LJII2, LIZLLL2, LJIIIZ2)) != null && !o.LJ(LJIILL2, LJIILL)) {
                C0OB LJIILL3 = LJIILL(LJII2, c1ie2.LIZLLL(), c1ie2.LJ());
                if (LJIILL3 != null) {
                    C0OB LJIIIZ3 = c0o9.LJIIIZ(LJIILL, LJIILL2, LJIILL3);
                    if (LJIIIZ3 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(LJIILL2, LJIIIZ3);
                } else {
                    LJIILJJIL();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public static final C1IQ LIZLLL(int i, int i2, C1IQ c1iq) {
        o.LJIIIZ(c1iq, "<this>");
        while (i < i2) {
            c1iq = c1iq.LJIILJJIL(i);
            i++;
        }
        return c1iq;
    }

    public static final C0OA LJFF(final C0OA c0oa, final InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, final boolean z) {
        C1IE c1ie;
        boolean z2 = c0oa instanceof C1IE;
        if (z2 || c0oa == null) {
            if (z2) {
                c1ie = (C1IE) c0oa;
            } else {
                c1ie = null;
            }
            return new C41291jh(c1ie, interfaceC88472Yns, null, false, z);
        }
        return new C0OA(c0oa, interfaceC88472Yns, z) { // from class: X.1IR
            public final C0OA LJFF;
            public final boolean LJI;
            public final boolean LJII;
            public final InterfaceC88472Yns<Object, C76800UCe> LJIIIIZZ;

            @Override // X.C0OA
            public final void LIZJ() {
                C0OA c0oa2;
                this.LIZJ = true;
                if (this.LJII && (c0oa2 = this.LJFF) != null) {
                    c0oa2.LIZJ();
                }
            }

            @Override // X.C0OA
            public final InterfaceC88472Yns<Object, C76800UCe> LJII() {
                return null;
            }

            public final C0OA LJIJ() {
                C0OA c0oa2 = this.LJFF;
                if (c0oa2 == null) {
                    C41261je c41261je = C0OF.LJIIIIZZ.get();
                    o.LJIIIIZZ(c41261je, "currentGlobalSnapshot.get()");
                    return c41261je;
                }
                return c0oa2;
            }

            @Override // X.C0OA
            public final int LIZLLL() {
                return LJIJ().LIZLLL();
            }

            @Override // X.C0OA
            public final C1IQ LJ() {
                return LJIJ().LJ();
            }

            @Override // X.C0OA
            public final boolean LJI() {
                return LJIJ().LJI();
            }

            @Override // X.C0OA
            public final void LJIIJJI() {
                LJIJ().LJIIJJI();
            }

            @Override // X.C0OA
            public final InterfaceC88472Yns<Object, C76800UCe> LJFF() {
                return this.LJIIIIZZ;
            }

            @Override // X.C0OA
            public final void LJIIIZ(C0OA snapshot) {
                o.LJIIIZ(snapshot, "snapshot");
                C0OH.LIZ();
                throw null;
            }

            @Override // X.C0OA
            public final void LJIIJ(C0OA snapshot) {
                o.LJIIIZ(snapshot, "snapshot");
                C0OH.LIZ();
                throw null;
            }

            @Override // X.C0OA
            public final void LJIIL(C0O9 state) {
                o.LJIIIZ(state, "state");
                LJIJ().LJIIL(state);
            }

            @Override // X.C0OA
            public final C0OA LJIIZILJ(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2) {
                InterfaceC88472Yns<Object, C76800UCe> LJIIIZ2 = C0OF.LJIIIZ(interfaceC88472Yns2, this.LJIIIIZZ, true);
                if (!this.LJI) {
                    return C0OF.LJFF(LJIJ().LJIIZILJ(null), LJIIIZ2, true);
                }
                return LJIJ().LJIIZILJ(LJIIIZ2);
            }

            {
                super(0, C1IQ.LJLJJL);
                InterfaceC88472Yns<Object, C76800UCe> LJFF2;
                this.LJFF = c0oa;
                this.LJI = false;
                this.LJII = z;
                this.LJIIIIZZ = C0OF.LJIIIZ(interfaceC88472Yns, (c0oa == null || (LJFF2 = c0oa.LJFF()) == null) ? C0OF.LJIIIIZZ.get().LJFF : LJFF2, false);
            }
        };
    }

    public static final InterfaceC88472Yns<Object, C76800UCe> LJIIIZ(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2, boolean z) {
        if (!z) {
            interfaceC88472Yns2 = null;
        }
        if (interfaceC88472Yns != null) {
            if (interfaceC88472Yns2 != null && !o.LJ(interfaceC88472Yns, interfaceC88472Yns2)) {
                return new IDqS172S0200000(interfaceC88472Yns, interfaceC88472Yns2, (InterfaceC88472Yns<Object, C76800UCe>) 25);
            }
            return interfaceC88472Yns;
        }
        return interfaceC88472Yns2;
    }

    public static final <T extends C0OB> T LJIIJJI(T t, C0O9 state, C0OA c0oa) {
        o.LJIIIZ(t, "<this>");
        o.LJIIIZ(state, "state");
        T t2 = (T) LJIIJ(t, state);
        t2.LIZ(t);
        t2.LIZ = c0oa.LIZLLL();
        return t2;
    }

    public static final <T extends C0OB> T LJIILL(T t, int i, C1IQ c1iq) {
        T t2 = null;
        while (t != null) {
            int i2 = t.LIZ;
            if (i2 != 0 && i2 <= i && !c1iq.LJIIIIZZ(i2) && (t2 == null || t2.LIZ < t.LIZ)) {
                t2 = t;
            }
            t = (T) t.LIZIZ;
        }
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    public static final <T extends C0OB> T LJIJI(T t, C0O9 state, C0OA c0oa) {
        o.LJIIIZ(state, "state");
        if (c0oa.LJI()) {
            c0oa.LJIIL(state);
        }
        T t2 = (T) LJIILL(t, c0oa.LIZLLL(), c0oa.LJ());
        if (t2 != null) {
            if (t2.LIZ == c0oa.LIZLLL()) {
                return t2;
            }
            T t3 = (T) LJIIJJI(t2, state, c0oa);
            c0oa.LJIIL(state);
            return t3;
        }
        LJIILJJIL();
        throw null;
    }

    public static final C0OB LJIILIIL(C35961b6 c35961b6, C0O9 state, C0OA c0oa, C35961b6 c35961b62) {
        o.LJIIIZ(c35961b6, "<this>");
        o.LJIIIZ(state, "state");
        if (c0oa.LJI()) {
            c0oa.LJIIL(state);
        }
        int LIZLLL2 = c0oa.LIZLLL();
        if (c35961b62.LIZ == LIZLLL2) {
            return c35961b62;
        }
        C0OB LJIIJ = LJIIJ(c35961b6, state);
        LJIIJ.LIZ = LIZLLL2;
        c0oa.LJIIL(state);
        return LJIIJ;
    }
}
