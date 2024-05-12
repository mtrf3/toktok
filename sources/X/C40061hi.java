package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40061hi extends C1AE {
    public int LJI;
    public int LJII;
    public final C16A LIZIZ = new C16A(this);
    public final C16C LIZJ = new C16C(this);
    public AnonymousClass169 LIZLLL = null;
    public boolean LJ = false;
    public final C14Z LJFF = new C14Z();
    public int LJIIIIZZ = 0;
    public int LJIIIZ = 0;
    public C017605c[] LJIIJ = new C017605c[4];
    public C017605c[] LJIIJJI = new C017605c[4];
    public int LJIIL = 257;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public WeakReference<C017905f> LJIILL = null;
    public WeakReference<C017905f> LJIILLIIL = null;
    public WeakReference<C017905f> LJIIZILJ = null;
    public WeakReference<C017905f> LJIJ = null;
    public final AnonymousClass168 LJIJI = new AnonymousClass168();

    /* JADX WARN: Removed duplicated region for block: B:401:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x05ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0738 A[LOOP:32: B:490:0x0736->B:491:0x0738, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x07ea  */
    @Override // X.C1AE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40061hi.LIZLLL():void");
    }

    @Override // X.C018205i
    public final String getType() {
        return "ConstraintLayout";
    }

    @Override // X.C1AE, X.C018205i
    public final void reset() {
        this.LJFF.LJIJ();
        this.LJI = 0;
        this.LJII = 0;
        super.reset();
    }

    public final void LJFF(C14Z c14z) {
        int i;
        boolean LJIIJJI = LJIIJJI(64);
        addToSolver(c14z, LJIIJJI);
        int size = this.LIZ.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C018205i c018205i = (C018205i) ListProtector.get(this.LIZ, i2);
            c018205i.setInBarrier(0, false);
            c018205i.setInBarrier(1, false);
            if (c018205i instanceof C40051hh) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C018205i c018205i2 = (C018205i) ListProtector.get(this.LIZ, i3);
                if (c018205i2 instanceof C40051hh) {
                    C40051hh c40051hh = (C40051hh) c018205i2;
                    for (int i4 = 0; i4 < c40051hh.LIZIZ; i4++) {
                        C018205i c018205i3 = c40051hh.LIZ[i4];
                        int i5 = c40051hh.LIZJ;
                        if (i5 == 0 || i5 == 1) {
                            c018205i3.setInBarrier(0, true);
                        } else if (i5 == 2 || i5 == 3) {
                            c018205i3.setInBarrier(1, true);
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C018205i c018205i4 = (C018205i) ListProtector.get(this.LIZ, i6);
            if (c018205i4.addFirst()) {
                c018205i4.addToSolver(c14z, LJIIJJI);
            }
        }
        if (C14Z.LJIILL) {
            HashSet<C018205i> hashSet = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                C018205i c018205i5 = (C018205i) ListProtector.get(this.LIZ, i7);
                if (!c018205i5.addFirst()) {
                    hashSet.add(c018205i5);
                }
            }
            if (getHorizontalDimensionBehaviour() == EnumC018105h.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            addChildrenToSolverByDependency(this, c14z, hashSet, i, false);
            Iterator<C018205i> it = hashSet.iterator();
            while (it.hasNext()) {
                C018205i next = it.next();
                C018605m.LIZ(this, c14z, next);
                next.addToSolver(c14z, LJIIJJI);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C018205i c018205i6 = (C018205i) ListProtector.get(this.LIZ, i8);
                if (c018205i6 instanceof C40061hi) {
                    EnumC018105h[] enumC018105hArr = c018205i6.mListDimensionBehaviors;
                    EnumC018105h enumC018105h = enumC018105hArr[0];
                    EnumC018105h enumC018105h2 = enumC018105hArr[1];
                    EnumC018105h enumC018105h3 = EnumC018105h.WRAP_CONTENT;
                    if (enumC018105h == enumC018105h3) {
                        c018205i6.setHorizontalDimensionBehaviour(EnumC018105h.FIXED);
                    }
                    if (enumC018105h2 == enumC018105h3) {
                        c018205i6.setVerticalDimensionBehaviour(EnumC018105h.FIXED);
                    }
                    c018205i6.addToSolver(c14z, LJIIJJI);
                    if (enumC018105h == enumC018105h3) {
                        c018205i6.setHorizontalDimensionBehaviour(enumC018105h);
                    }
                    if (enumC018105h2 == enumC018105h3) {
                        c018205i6.setVerticalDimensionBehaviour(enumC018105h2);
                    }
                } else {
                    C018605m.LIZ(this, c14z, c018205i6);
                    if (!c018205i6.addFirst()) {
                        c018205i6.addToSolver(c14z, LJIIJJI);
                    }
                }
            }
        }
        if (this.LJIIIIZZ > 0) {
            C017505b.LIZ(this, c14z, null, 0);
        }
        if (this.LJIIIZ > 0) {
            C017505b.LIZ(this, c14z, null, 1);
        }
    }

    public final void LJI(C017905f c017905f) {
        WeakReference<C017905f> weakReference = this.LJIJ;
        if (weakReference == null || weakReference.get() == null || c017905f.LIZLLL() > this.LJIJ.get().LIZLLL()) {
            this.LJIJ = new WeakReference<>(c017905f);
        }
    }

    public final void LJII(C017905f c017905f) {
        WeakReference<C017905f> weakReference = this.LJIIZILJ;
        if (weakReference == null || weakReference.get() == null || c017905f.LIZLLL() > this.LJIIZILJ.get().LIZLLL()) {
            this.LJIIZILJ = new WeakReference<>(c017905f);
        }
    }

    public final void LJIIIIZZ(C017905f c017905f) {
        WeakReference<C017905f> weakReference = this.LJIILL;
        if (weakReference == null || weakReference.get() == null || c017905f.LIZLLL() > this.LJIILL.get().LIZLLL()) {
            this.LJIILL = new WeakReference<>(c017905f);
        }
    }

    public final boolean LJIIJJI(int i) {
        if ((this.LJIIL & i) == i) {
            return true;
        }
        return false;
    }

    public final void LJ(C018205i c018205i, int i) {
        if (i == 0) {
            int i2 = this.LJIIIIZZ + 1;
            C017605c[] c017605cArr = this.LJIIJJI;
            if (i2 >= c017605cArr.length) {
                this.LJIIJJI = (C017605c[]) Arrays.copyOf(c017605cArr, c017605cArr.length * 2);
            }
            C017605c[] c017605cArr2 = this.LJIIJJI;
            int i3 = this.LJIIIIZZ;
            c017605cArr2[i3] = new C017605c(c018205i, 0, this.LJ);
            this.LJIIIIZZ = i3 + 1;
            return;
        }
        if (i != 1) {
            return;
        }
        int i4 = this.LJIIIZ + 1;
        C017605c[] c017605cArr3 = this.LJIIJ;
        if (i4 >= c017605cArr3.length) {
            this.LJIIJ = (C017605c[]) Arrays.copyOf(c017605cArr3, c017605cArr3.length * 2);
        }
        C017605c[] c017605cArr4 = this.LJIIJ;
        int i5 = this.LJIIIZ;
        c017605cArr4[i5] = new C017605c(c018205i, 1, this.LJ);
        this.LJIIIZ = i5 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b8, code lost:
    
        if (r12 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40061hi.LJIIIZ(int, boolean):boolean");
    }

    @Override // X.C018205i
    public final void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            ((C018205i) ListProtector.get(this.LIZ, i)).updateFromRuns(z, z2);
        }
    }

    public static void LJIIJ(C018205i c018205i, AnonymousClass169 anonymousClass169, AnonymousClass168 anonymousClass168) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (anonymousClass169 == null) {
            return;
        }
        anonymousClass168.LIZ = c018205i.getHorizontalDimensionBehaviour();
        anonymousClass168.LIZIZ = c018205i.getVerticalDimensionBehaviour();
        anonymousClass168.LIZJ = c018205i.getWidth();
        anonymousClass168.LIZLLL = c018205i.getHeight();
        anonymousClass168.LJIIIIZZ = false;
        anonymousClass168.LJIIIZ = 0;
        EnumC018105h enumC018105h = anonymousClass168.LIZ;
        EnumC018105h enumC018105h2 = EnumC018105h.MATCH_CONSTRAINT;
        if (enumC018105h == enumC018105h2) {
            z = true;
        } else {
            z = false;
        }
        if (anonymousClass168.LIZIZ == enumC018105h2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c018205i.mDimensionRatio > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && c018205i.mDimensionRatio > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && c018205i.hasDanglingDimension(0) && c018205i.mMatchConstraintDefaultWidth == 0 && !z3) {
            anonymousClass168.LIZ = EnumC018105h.WRAP_CONTENT;
            if (z2 && c018205i.mMatchConstraintDefaultHeight == 0) {
                anonymousClass168.LIZ = EnumC018105h.FIXED;
            }
            z = false;
        }
        if (z2 && c018205i.hasDanglingDimension(1) && c018205i.mMatchConstraintDefaultHeight == 0 && !z4) {
            anonymousClass168.LIZIZ = EnumC018105h.WRAP_CONTENT;
            if (z && c018205i.mMatchConstraintDefaultWidth == 0) {
                anonymousClass168.LIZIZ = EnumC018105h.FIXED;
            }
            z2 = false;
        }
        if (c018205i.isResolvedHorizontally()) {
            anonymousClass168.LIZ = EnumC018105h.FIXED;
            z = false;
        }
        if (c018205i.isResolvedVertically()) {
            anonymousClass168.LIZIZ = EnumC018105h.FIXED;
            z2 = false;
        }
        if (z3) {
            if (c018205i.mResolvedMatchConstraintDefault[0] == 4) {
                anonymousClass168.LIZ = EnumC018105h.FIXED;
            } else if (!z2) {
                EnumC018105h enumC018105h3 = anonymousClass168.LIZIZ;
                EnumC018105h enumC018105h4 = EnumC018105h.FIXED;
                if (enumC018105h3 == enumC018105h4) {
                    i2 = anonymousClass168.LIZLLL;
                } else {
                    anonymousClass168.LIZ = EnumC018105h.WRAP_CONTENT;
                    ((C1AG) anonymousClass169).LIZIZ(c018205i, anonymousClass168);
                    i2 = anonymousClass168.LJFF;
                }
                anonymousClass168.LIZ = enumC018105h4;
                int i3 = c018205i.mDimensionRatioSide;
                if (i3 == 0 || i3 == -1) {
                    anonymousClass168.LIZJ = (int) (c018205i.mDimensionRatio * i2);
                } else {
                    anonymousClass168.LIZJ = (int) (c018205i.mDimensionRatio / i2);
                }
            }
        }
        if (z4) {
            if (c018205i.mResolvedMatchConstraintDefault[1] == 4) {
                anonymousClass168.LIZIZ = EnumC018105h.FIXED;
            } else if (!z) {
                EnumC018105h enumC018105h5 = anonymousClass168.LIZ;
                EnumC018105h enumC018105h6 = EnumC018105h.FIXED;
                if (enumC018105h5 == enumC018105h6) {
                    i = anonymousClass168.LIZJ;
                } else {
                    anonymousClass168.LIZIZ = EnumC018105h.WRAP_CONTENT;
                    ((C1AG) anonymousClass169).LIZIZ(c018205i, anonymousClass168);
                    i = anonymousClass168.LJ;
                }
                anonymousClass168.LIZIZ = enumC018105h6;
                int i4 = c018205i.mDimensionRatioSide;
                if (i4 == 0 || i4 == -1) {
                    anonymousClass168.LIZLLL = (int) (i / c018205i.mDimensionRatio);
                } else {
                    anonymousClass168.LIZLLL = (int) (i * c018205i.mDimensionRatio);
                }
            }
        }
        ((C1AG) anonymousClass169).LIZIZ(c018205i, anonymousClass168);
        c018205i.setWidth(anonymousClass168.LJ);
        c018205i.setHeight(anonymousClass168.LJFF);
        c018205i.hasBaseline = anonymousClass168.LJII;
        c018205i.setBaselineDistance(anonymousClass168.LJI);
        anonymousClass168.LJIIIZ = 0;
    }
}
