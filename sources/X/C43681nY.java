package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1nY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43681nY implements InterfaceC34831Yh, InterfaceC34851Yj, InterfaceC20650rV, InterfaceC22630uh, InterfaceC34841Yi {
    public final Matrix LIZ = new Matrix();
    public final Path LIZIZ = new Path();
    public final C04740Go LIZJ;
    public final AbstractC45041pk LIZLLL;
    public final String LJ;
    public final C43751nf LJFF;
    public final C43751nf LJI;
    public final C22670ul LJII;
    public C43611nR LJIIIIZZ;

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC34851Yj
    public final Path getPath() {
        Path path = this.LJIIIIZZ.getPath();
        this.LIZIZ.reset();
        float floatValue = this.LJFF.LJI().floatValue();
        float floatValue2 = this.LJI.LJI().floatValue();
        int i = (int) floatValue;
        while (true) {
            i--;
            if (i >= 0) {
                this.LIZ.set(this.LJII.LJ(i + floatValue2));
                this.LIZIZ.addPath(path, this.LIZ);
            } else {
                return this.LIZIZ;
            }
        }
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LJ;
    }

    @Override // X.InterfaceC20650rV
    public final void LJFF(ListIterator<InterfaceC20640rU> listIterator) {
        if (this.LJIIIIZZ != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.LJIIIIZZ = new C43611nR(this.LIZJ, this.LIZLLL, "Repeater", arrayList, null);
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZ(RectF rectF, Matrix matrix) {
        this.LJIIIIZZ.LIZ(rectF, matrix);
    }

    @Override // X.InterfaceC263811u
    public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        if (this.LJII.LIZJ(t, c06800Om)) {
            return;
        }
        if (t == C0GO.LJIIL) {
            this.LJFF.LJIIJ(c06800Om);
        } else {
            if (t != C0GO.LJIILIIL) {
                return;
            }
            this.LJI.LJIIJ(c06800Om);
        }
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        this.LJIIIIZZ.LIZLLL(list, list2);
    }

    public C43681nY(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, C38831fj c38831fj) {
        this.LIZJ = c04740Go;
        this.LIZLLL = abstractC45041pk;
        this.LJ = c38831fj.LIZ;
        AbstractC22650uj<Float, Float> LIZ = c38831fj.LIZIZ.LIZ();
        this.LJFF = (C43751nf) LIZ;
        abstractC45041pk.LJFF(LIZ);
        LIZ.LIZ(this);
        AbstractC22650uj<Float, Float> LIZ2 = c38831fj.LIZJ.LIZ();
        this.LJI = (C43751nf) LIZ2;
        abstractC45041pk.LJFF(LIZ2);
        LIZ2.LIZ(this);
        C38511fD c38511fD = c38831fj.LIZLLL;
        c38511fD.getClass();
        C22670ul c22670ul = new C22670ul(c38511fD);
        this.LJII = c22670ul;
        c22670ul.LIZ(abstractC45041pk);
        c22670ul.LIZIZ(this);
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZJ(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.LJFF.LJI().floatValue();
        float floatValue2 = this.LJI.LJI().floatValue();
        float floatValue3 = this.LJII.LJI.LJI().floatValue() / 100.0f;
        float floatValue4 = this.LJII.LJII.LJI().floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.LIZ.set(matrix);
                float f = i2;
                this.LIZ.preConcat(this.LJII.LJ(f + floatValue2));
                this.LJIIIIZZ.LIZJ(canvas, this.LIZ, (int) ((((floatValue4 - floatValue3) * (f / floatValue)) + floatValue3) * i));
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        C06260Mk.LIZLLL(c263711t, i, list, c263711t2, this);
    }
}
