package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43611nR implements InterfaceC34831Yh, InterfaceC34851Yj, InterfaceC22630uh, InterfaceC263811u {
    public final Matrix LIZ;
    public final Path LIZIZ;
    public final RectF LIZJ;
    public final String LIZLLL;
    public final List<InterfaceC20640rU> LJ;
    public final C04740Go LJFF;
    public List<InterfaceC34851Yj> LJI;
    public final C22670ul LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC34851Yj> LJFF() {
        if (this.LJI == null) {
            this.LJI = new ArrayList();
            for (int i = 0; i < this.LJ.size(); i++) {
                InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(this.LJ, i);
                if (interfaceC20640rU instanceof InterfaceC34851Yj) {
                    this.LJI.add(interfaceC20640rU);
                }
            }
        }
        return this.LJI;
    }

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJFF.invalidateSelf();
    }

    @Override // X.InterfaceC34851Yj
    public final Path getPath() {
        this.LIZ.reset();
        C22670ul c22670ul = this.LJII;
        if (c22670ul != null) {
            this.LIZ.set(c22670ul.LIZLLL());
        }
        this.LIZIZ.reset();
        for (int size = this.LJ.size() - 1; size >= 0; size--) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(this.LJ, size);
            if (interfaceC20640rU instanceof InterfaceC34851Yj) {
                this.LIZIZ.addPath(((InterfaceC34851Yj) interfaceC20640rU).getPath(), this.LIZ);
            }
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZ(RectF rectF, Matrix matrix) {
        this.LIZ.set(matrix);
        C22670ul c22670ul = this.LJII;
        if (c22670ul != null) {
            this.LIZ.preConcat(c22670ul.LIZLLL());
        }
        this.LIZJ.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.LJ.size() - 1; size >= 0; size--) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(this.LJ, size);
            if (interfaceC20640rU instanceof InterfaceC34831Yh) {
                InterfaceC34831Yh interfaceC34831Yh = (InterfaceC34831Yh) interfaceC20640rU;
                interfaceC34831Yh.LIZ(this.LIZJ, this.LIZ);
                if (C03970Dp.LIZ) {
                    interfaceC34831Yh.LIZ(this.LIZJ, this.LIZ);
                    rectF.union(this.LIZJ);
                } else if (rectF.isEmpty()) {
                    rectF.set(this.LIZJ);
                } else {
                    rectF.set(Math.min(rectF.left, this.LIZJ.left), Math.min(rectF.top, this.LIZJ.top), Math.max(rectF.right, this.LIZJ.right), Math.max(rectF.bottom, this.LIZJ.bottom));
                }
            }
        }
    }

    @Override // X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        C22670ul c22670ul = this.LJII;
        if (c22670ul != null) {
            c22670ul.LIZJ(t, c06800Om);
        }
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        ArrayList arrayList = new ArrayList(this.LJ.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.LJ.size() - 1; size >= 0; size--) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(this.LJ, size);
            interfaceC20640rU.LIZLLL(arrayList, this.LJ.subList(0, size));
            arrayList.add(interfaceC20640rU);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C43611nR(X.C04740Go r10, X.AbstractC45041pk r11, X.C38851fl r12) {
        /*
            r9 = this;
            java.lang.String r6 = r12.LIZ
            java.util.List<X.14q> r3 = r12.LIZIZ
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r3.size()
            r7.<init>(r0)
            r2 = 0
            r1 = 0
        Lf:
            int r0 = r3.size()
            r4 = r10
            r5 = r11
            if (r1 >= r0) goto L29
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.14q r0 = (X.InterfaceC271214q) r0
            X.0rU r0 = r0.LIZ(r4, r5)
            if (r0 == 0) goto L26
            r7.add(r0)
        L26:
            int r1 = r1 + 1
            goto Lf
        L29:
            java.util.List<X.14q> r1 = r12.LIZIZ
        L2b:
            int r0 = r1.size()
            if (r2 >= r0) goto L45
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            X.14q r8 = (X.InterfaceC271214q) r8
            boolean r0 = r8 instanceof X.C38511fD
            if (r0 == 0) goto L42
            X.1fD r8 = (X.C38511fD) r8
        L3d:
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            return
        L42:
            int r2 = r2 + 1
            goto L2b
        L45:
            r8 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43611nR.<init>(X.0Go, X.1pk, X.1fl):void");
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZJ(Canvas canvas, Matrix matrix, int i) {
        this.LIZ.set(matrix);
        C22670ul c22670ul = this.LJII;
        if (c22670ul != null) {
            this.LIZ.preConcat(c22670ul.LIZLLL());
            i = (int) ((((LJI().intValue() / 100.0f) * i) / 255.0f) * 255.0f);
        }
        int size = this.LJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                Object obj = ListProtector.get(this.LJ, size);
                if (obj instanceof InterfaceC34831Yh) {
                    ((InterfaceC34831Yh) obj).LIZJ(canvas, this.LIZ, i);
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        if (!c263711t.LIZJ(i, this.LIZLLL)) {
            return;
        }
        if (!"__container".equals(this.LIZLLL)) {
            String str = this.LIZLLL;
            c263711t2.getClass();
            C263711t c263711t3 = new C263711t(c263711t2);
            c263711t3.LIZ.add(str);
            if (c263711t.LIZ(i, this.LIZLLL)) {
                C263711t c263711t4 = new C263711t(c263711t3);
                c263711t4.LIZIZ = this;
                ((ArrayList) list).add(c263711t4);
            }
            c263711t2 = c263711t3;
        }
        if (c263711t.LIZLLL(i, this.LIZLLL)) {
            int LIZIZ = c263711t.LIZIZ(i, this.LIZLLL) + i;
            for (int i2 = 0; i2 < this.LJ.size(); i2++) {
                InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(this.LJ, i2);
                if (interfaceC20640rU instanceof InterfaceC263811u) {
                    ((InterfaceC263811u) interfaceC20640rU).LJ(c263711t, LIZIZ, list, c263711t2);
                }
            }
        }
    }

    public C43611nR(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, String str, List<InterfaceC20640rU> list, C38511fD c38511fD) {
        this.LIZ = new Matrix();
        this.LIZIZ = new Path();
        this.LIZJ = new RectF();
        this.LIZLLL = str;
        this.LJFF = c04740Go;
        this.LJ = list;
        if (c38511fD != null) {
            C22670ul c22670ul = new C22670ul(c38511fD);
            this.LJII = c22670ul;
            c22670ul.LIZ(abstractC45041pk);
            c22670ul.LIZIZ(this);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(list, size);
            if (interfaceC20640rU instanceof InterfaceC20650rV) {
                arrayList.add(interfaceC20640rU);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((InterfaceC20650rV) ListProtector.get(arrayList, size2)).LJFF(arrayList2.listIterator(arrayList2.size()));
            } else {
                return;
            }
        }
    }
}
