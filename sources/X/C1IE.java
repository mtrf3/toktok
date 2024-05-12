package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* renamed from: X.1IE, reason: invalid class name */
/* loaded from: classes.dex */
public class C1IE extends C0OA {
    public final InterfaceC88472Yns<Object, C76800UCe> LJFF;
    public final InterfaceC88472Yns<Object, C76800UCe> LJI;
    public java.util.Set<C0O9> LJII;
    public C1IQ LJIIIIZZ;
    public int[] LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;

    @Override // X.C0OA
    public boolean LJI() {
        return false;
    }

    @Override // X.C0OA
    public final void LIZIZ() {
        C0OF.LIZLLL = C0OF.LIZLLL.LJII(LIZLLL()).LIZJ(this.LJIIIIZZ);
    }

    @Override // X.C0OA
    public void LIZJ() {
        if (!this.LIZJ) {
            super.LIZJ();
            LJIIJ(this);
        }
    }

    @Override // X.C0OA
    public void LJIIJJI() {
        if (this.LJIIJJI || this.LIZJ) {
            return;
        }
        LJIJ();
    }

    @Override // X.C0OA
    public final void LJIILIIL() {
        int length = this.LJIIIZ.length;
        for (int i = 0; i < length; i++) {
            C0OF.LJIIZILJ(this.LJIIIZ[i]);
        }
        int i2 = this.LIZLLL;
        if (i2 >= 0) {
            C0OF.LJIIZILJ(i2);
            this.LIZLLL = -1;
        }
    }

    public final void LJJII() {
        if (!this.LJIIJJI || this.LIZLLL >= 0) {
            return;
        }
        "Unsupported operation on a disposed or applied snapshot".toString();
        throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    public final void LJIJ() {
        LJIL(LIZLLL());
        if (!this.LJIIJJI && !this.LIZJ) {
            int LIZLLL = LIZLLL();
            synchronized (C0OF.LIZJ) {
                int i = C0OF.LJ;
                C0OF.LJ = i + 1;
                LJIILL(i);
                C0OF.LIZLLL = C0OF.LIZLLL.LJIILJJIL(LIZLLL());
            }
            LJIILLIIL(C0OF.LIZLLL(LIZLLL + 1, LIZLLL(), LJ()));
        }
    }

    public C0OC LJIJI() {
        java.util.Map<C0OB, ? extends C0OB> map;
        OSZ osz;
        java.util.Set<C0O9> LJIJJ = LJIJJ();
        if (LJIJJ != null) {
            AtomicReference<C41261je> atomicReference = C0OF.LJIIIIZZ;
            C41261je c41261je = atomicReference.get();
            o.LJIIIIZZ(c41261je, "currentGlobalSnapshot.get()");
            map = C0OF.LIZIZ(c41261je, this, C0OF.LIZLLL.LJII(atomicReference.get().LIZIZ));
        } else {
            map = null;
        }
        synchronized (C0OF.LIZJ) {
            C0OF.LIZJ(this);
            if (LJIJJ == null || LJIJJ.size() == 0) {
                LIZIZ();
                C41261je previousGlobalSnapshot = C0OF.LJIIIIZZ.get();
                o.LJIIIIZZ(previousGlobalSnapshot, "previousGlobalSnapshot");
                C0OF.LJIJ(previousGlobalSnapshot, C0OF.LIZ);
                java.util.Set<C0O9> set = previousGlobalSnapshot.LJII;
                if (set != null && (!set.isEmpty())) {
                    osz = new OSZ(ORZ.LLJILJILJ(C0OF.LJI), set);
                } else {
                    osz = new OSZ(C61878OQg.INSTANCE, null);
                }
            } else {
                C41261je c41261je2 = C0OF.LJIIIIZZ.get();
                C0OC LJIJJLI = LJIJJLI(C0OF.LJ, map, C0OF.LIZLLL.LJII(c41261je2.LIZIZ));
                if (!o.LJ(LJIJJLI, C1IO.LIZ)) {
                    return LJIJJLI;
                }
                LIZIZ();
                C0OF.LJIJ(c41261je2, C0OF.LIZ);
                java.util.Set<C0O9> set2 = c41261je2.LJII;
                LJJI(null);
                c41261je2.LJII = null;
                osz = new OSZ(ORZ.LLJILJILJ(C0OF.LJI), set2);
            }
            List list = (List) osz.getFirst();
            java.util.Set set3 = (java.util.Set) osz.getSecond();
            this.LJIIJJI = true;
            if (set3 != null && (!set3.isEmpty())) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC88471Ynr) ListProtector.get(list, i)).invoke(set3, this);
                }
            }
            if (LJIJJ != null && (!LJIJJ.isEmpty())) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((InterfaceC88471Ynr) ListProtector.get(list, i2)).invoke(LJIJJ, this);
                }
            }
            synchronized (C0OF.LIZJ) {
                LJIILIIL();
            }
            return C1IO.LIZ;
        }
    }

    @Override // X.C0OA
    public final InterfaceC88472Yns<Object, C76800UCe> LJFF() {
        return this.LJFF;
    }

    @Override // X.C0OA
    public final InterfaceC88472Yns<Object, C76800UCe> LJII() {
        return this.LJI;
    }

    public java.util.Set<C0O9> LJIJJ() {
        return this.LJII;
    }

    @Override // X.C0OA
    public void LJIIIZ(C0OA snapshot) {
        o.LJIIIZ(snapshot, "snapshot");
        this.LJIIJ++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (X.ORZ.LJLJJI(java.lang.Integer.valueOf(r0), r6.LJIIIIZZ) != false) goto L21;
     */
    @Override // X.C0OA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIJ(X.C0OA r7) {
        /*
            r6 = this;
            java.lang.String r0 = "snapshot"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            int r0 = r6.LJIIJ
            r2 = 1
            r5 = 0
            if (r0 <= 0) goto L62
            int r0 = r0 + (-1)
            r6.LJIIJ = r0
            if (r0 != 0) goto L61
            boolean r0 = r6.LJIIJJI
            if (r0 != 0) goto L61
            java.util.Set r1 = r6.LJIJJ()
            if (r1 == 0) goto L5e
            boolean r0 = r6.LJIIJJI
            r2 = r2 ^ r0
            if (r2 == 0) goto L53
            r0 = 0
            r6.LJJI(r0)
            int r4 = r6.LIZLLL()
            java.util.Iterator r3 = r1.iterator()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r3.next()
            X.0O9 r0 = (X.C0O9) r0
            X.0OB r2 = r0.LJII()
        L3c:
            if (r2 == 0) goto L2c
            int r0 = r2.LIZ
            if (r0 == r4) goto L4e
            X.1IQ r1 = r6.LJIIIIZZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.ORZ.LJLJJI(r0, r1)
            if (r0 == 0) goto L50
        L4e:
            r2.LIZ = r5
        L50:
            X.0OB r2 = r2.LIZIZ
            goto L3c
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unsupported operation on a snapshot that has been applied"
            r0.toString()
            r1.<init>(r0)
            throw r1
        L5e:
            r6.LIZ()
        L61:
            return
        L62:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1IE.LJIIJ(X.0OA):void");
    }

    @Override // X.C0OA
    public void LJIIL(C0O9 state) {
        o.LJIIIZ(state, "state");
        java.util.Set<C0O9> LJIJJ = LJIJJ();
        if (LJIJJ == null) {
            LJIJJ = new HashSet<>();
            LJJI(LJIJJ);
        }
        LJIJJ.add(state);
    }

    @Override // X.C0OA
    public C0OA LJIIZILJ(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns) {
        C1IG c1ig;
        if (!this.LIZJ) {
            LJJII();
            int LIZLLL = LIZLLL();
            LJIL(LIZLLL());
            Object obj = C0OF.LIZJ;
            synchronized (obj) {
                int i = C0OF.LJ;
                C0OF.LJ = i + 1;
                C0OF.LIZLLL = C0OF.LIZLLL.LJIILJJIL(i);
                c1ig = new C1IG(i, C0OF.LIZLLL(LIZLLL + 1, i, LJ()), interfaceC88472Yns, this);
            }
            if (!this.LJIIJJI && !this.LIZJ) {
                int LIZLLL2 = LIZLLL();
                synchronized (obj) {
                    int i2 = C0OF.LJ;
                    C0OF.LJ = i2 + 1;
                    LJIILL(i2);
                    C0OF.LIZLLL = C0OF.LIZLLL.LJIILJJIL(LIZLLL());
                }
                LJIILLIIL(C0OF.LIZLLL(LIZLLL2 + 1, LIZLLL(), LJ()));
            }
            return c1ig;
        }
        "Cannot use a disposed snapshot".toString();
        throw new IllegalArgumentException("Cannot use a disposed snapshot");
    }

    public final void LJIL(int i) {
        synchronized (C0OF.LIZJ) {
            this.LJIIIIZZ = this.LJIIIIZZ.LJIILJJIL(i);
        }
    }

    public final void LJJ(C1IQ snapshots) {
        o.LJIIIZ(snapshots, "snapshots");
        synchronized (C0OF.LIZJ) {
            this.LJIIIIZZ = this.LJIIIIZZ.LJIIIZ(snapshots);
        }
    }

    public void LJJI(java.util.Set<C0O9> set) {
        this.LJII = set;
    }

    public C1IE LJJIFFI(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2) {
        C1IE c1ie;
        if (!this.LIZJ) {
            LJJII();
            LJIL(LIZLLL());
            Object obj = C0OF.LIZJ;
            synchronized (obj) {
                final int i = C0OF.LJ;
                C0OF.LJ = i + 1;
                C0OF.LIZLLL = C0OF.LIZLLL.LJIILJJIL(i);
                C1IQ LJ = LJ();
                LJIILLIIL(LJ.LJIILJJIL(i));
                final C1IQ LIZLLL = C0OF.LIZLLL(LIZLLL() + 1, i, LJ);
                final InterfaceC88472Yns<Object, C76800UCe> LJIIIZ = C0OF.LJIIIZ(interfaceC88472Yns, this.LJFF, true);
                final InterfaceC88472Yns LIZ = C0OF.LIZ(interfaceC88472Yns2, this.LJI);
                c1ie = new C1IE(i, LIZLLL, LJIIIZ, LIZ, this) { // from class: X.1jf
                    public final C1IE LJIIL;
                    public boolean LJIILIIL;

                    @Override // X.C1IE, X.C0OA
                    public final void LIZJ() {
                        if (!this.LIZJ) {
                            super.LIZJ();
                            if (!this.LJIILIIL) {
                                this.LJIILIIL = true;
                                this.LJIIL.LJIIJ(this);
                            }
                        }
                    }

                    @Override // X.C1IE
                    public final C0OC LJIJI() {
                        java.util.Map<C0OB, ? extends C0OB> map;
                        C1IE c1ie2 = this.LJIIL;
                        if (c1ie2.LJIIJJI || c1ie2.LIZJ) {
                            return new C1IN(this);
                        }
                        java.util.Set<C0O9> set = this.LJII;
                        int i2 = this.LIZIZ;
                        if (set != null) {
                            map = C0OF.LIZIZ(c1ie2, this, c1ie2.LJ());
                        } else {
                            map = null;
                        }
                        synchronized (C0OF.LIZJ) {
                            C0OF.LIZJ(this);
                            if (set == null || set.size() == 0) {
                                LIZ();
                            } else {
                                C0OC LJIJJLI = LJIJJLI(this.LJIIL.LIZLLL(), map, this.LJIIL.LJ());
                                if (o.LJ(LJIJJLI, C1IO.LIZ)) {
                                    java.util.Set<C0O9> LJIJJ = this.LJIIL.LJIJJ();
                                    if (LJIJJ == null) {
                                        LJIJJ = new HashSet<>();
                                        this.LJIIL.LJJI(LJIJJ);
                                    }
                                    LJIJJ.addAll(set);
                                } else {
                                    return LJIJJLI;
                                }
                            }
                            if (this.LJIIL.LIZLLL() < i2) {
                                this.LJIIL.LJIJ();
                            }
                            C1IE c1ie3 = this.LJIIL;
                            c1ie3.LJIILLIIL(c1ie3.LJ().LJII(i2).LIZJ(this.LJIIIIZZ));
                            this.LJIIL.LJIL(i2);
                            C1IE c1ie4 = this.LJIIL;
                            int i3 = this.LIZLLL;
                            this.LIZLLL = -1;
                            if (i3 >= 0) {
                                int[] iArr = c1ie4.LJIIIZ;
                                o.LJIIIZ(iArr, "<this>");
                                int length = iArr.length;
                                int[] copyOf = Arrays.copyOf(iArr, length + 1);
                                copyOf[length] = i3;
                                c1ie4.LJIIIZ = copyOf;
                            } else {
                                c1ie4.getClass();
                            }
                            this.LJIIL.LJJ(this.LJIIIIZZ);
                            C1IE c1ie5 = this.LJIIL;
                            int[] handles = this.LJIIIZ;
                            c1ie5.getClass();
                            o.LJIIIZ(handles, "handles");
                            if (handles.length != 0) {
                                int[] iArr2 = c1ie5.LJIIIZ;
                                if (iArr2.length == 0) {
                                    c1ie5.LJIIIZ = handles;
                                } else {
                                    int length2 = iArr2.length;
                                    int length3 = handles.length;
                                    int[] result = Arrays.copyOf(iArr2, length2 + length3);
                                    System.arraycopy(handles, 0, result, length2, length3);
                                    o.LJIIIIZZ(result, "result");
                                    c1ie5.LJIIIZ = result;
                                }
                            }
                            this.LJIIJJI = true;
                            if (!this.LJIILIIL) {
                                this.LJIILIIL = true;
                                this.LJIIL.LJIIJ(this);
                            }
                            return C1IO.LIZ;
                        }
                    }

                    {
                        o.LJIIIZ(LIZLLL, "invalid");
                        o.LJIIIZ(this, "parent");
                        this.LJIIL = this;
                        this.LJIIIZ(this);
                    }
                };
            }
            if (!this.LJIIJJI && !this.LIZJ) {
                int LIZLLL2 = LIZLLL();
                synchronized (obj) {
                    int i2 = C0OF.LJ;
                    C0OF.LJ = i2 + 1;
                    LJIILL(i2);
                    C0OF.LIZLLL = C0OF.LIZLLL.LJIILJJIL(LIZLLL());
                }
                LJIILLIIL(C0OF.LIZLLL(LIZLLL2 + 1, LIZLLL(), LJ()));
            }
            return c1ie;
        }
        "Cannot use a disposed snapshot".toString();
        throw new IllegalArgumentException("Cannot use a disposed snapshot");
    }

    public final C0OC LJIJJLI(int i, java.util.Map<C0OB, ? extends C0OB> map, C1IQ invalidSnapshots) {
        C0OB LJIILL;
        C0OB LJIIIZ;
        OSZ osz;
        o.LJIIIZ(invalidSnapshots, "invalidSnapshots");
        C1IQ LJIIIZ2 = LJ().LJIILJJIL(LIZLLL()).LJIIIZ(this.LJIIIIZZ);
        java.util.Set<C0O9> LJIJJ = LJIJJ();
        o.LJI(LJIJJ);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (C0O9 c0o9 : LJIJJ) {
            C0OB LJII = c0o9.LJII();
            C0OB LJIILL2 = C0OF.LJIILL(LJII, i, invalidSnapshots);
            if (LJIILL2 != null && (LJIILL = C0OF.LJIILL(LJII, LIZLLL(), LJIIIZ2)) != null && !o.LJ(LJIILL2, LJIILL)) {
                C0OB LJIILL3 = C0OF.LJIILL(LJII, LIZLLL(), LJ());
                if (LJIILL3 != null) {
                    if ((map == null || (LJIIIZ = map.get(LJIILL2)) == null) && (LJIIIZ = c0o9.LJIIIZ(LJIILL, LJIILL2, LJIILL3)) == null) {
                        return new C1IN(this);
                    }
                    if (!o.LJ(LJIIIZ, LJIILL3)) {
                        if (o.LJ(LJIIIZ, LJIILL2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new OSZ(c0o9, LJIILL2.LIZIZ()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c0o9);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!o.LJ(LJIIIZ, LJIILL)) {
                                osz = new OSZ(c0o9, LJIIIZ);
                            } else {
                                osz = new OSZ(c0o9, LJIILL.LIZIZ());
                            }
                            arrayList.add(osz);
                        }
                    }
                } else {
                    C0OF.LJIILJJIL();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            LJIJ();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OSZ osz2 = (OSZ) ListProtector.get(arrayList, i2);
                C0O9 c0o92 = (C0O9) osz2.getFirst();
                C0OB c0ob = (C0OB) osz2.getSecond();
                c0ob.LIZ = LIZLLL();
                synchronized (C0OF.LIZJ) {
                    c0ob.LIZIZ = c0o92.LJII();
                    c0o92.LJIIIIZZ(c0ob);
                }
            }
        }
        if (arrayList2 != null) {
            LJIJJ.removeAll(arrayList2);
        }
        return C1IO.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1IE(int i, C1IQ invalid, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2) {
        super(i, invalid);
        o.LJIIIZ(invalid, "invalid");
        this.LJFF = interfaceC88472Yns;
        this.LJI = interfaceC88472Yns2;
        this.LJIIIIZZ = C1IQ.LJLJJL;
        this.LJIIIZ = new int[0];
        this.LJIIJ = 1;
    }
}
