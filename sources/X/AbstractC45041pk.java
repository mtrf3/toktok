package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC45041pk implements InterfaceC34831Yh, InterfaceC22630uh, InterfaceC263811u {
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public final Paint LJ;
    public final Paint LJFF;
    public final Paint LJI;
    public final C04740Go LJIIL;
    public final C274816a LJIILIIL;
    public final C22660uk LJIILJJIL;
    public C43751nf LJIILL;
    public AbstractC45041pk LJIILLIIL;
    public AbstractC45041pk LJIIZILJ;
    public List<AbstractC45041pk> LJIJ;
    public final C22670ul LJIJJ;
    public boolean LJIJJLI;
    public final Path LIZ = new Path();
    public final Matrix LIZIZ = new Matrix();
    public final RectF LJII = new RectF();
    public final RectF LJIIIIZZ = new RectF();
    public final RectF LJIIIZ = new RectF();
    public final RectF LJIIJ = new RectF();
    public final Matrix LJIIJJI = new Matrix();
    public final List<AbstractC22650uj<?, ?>> LJIJI = new ArrayList();

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
    }

    public abstract void LJIIJ(Canvas canvas, Matrix matrix, int i);

    public void LJIILL(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
    }

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LJIIL.invalidateSelf();
    }

    public final void LJIIIIZZ() {
        if (this.LJIJ != null) {
            return;
        }
        if (this.LJIIZILJ == null) {
            this.LJIJ = Collections.emptyList();
            return;
        }
        this.LJIJ = new ArrayList();
        for (AbstractC45041pk abstractC45041pk = this.LJIIZILJ; abstractC45041pk != null; abstractC45041pk = abstractC45041pk.LJIIZILJ) {
            this.LJIJ.add(abstractC45041pk);
        }
    }

    public final boolean LJIIL() {
        C22660uk c22660uk = this.LJIILJJIL;
        if (c22660uk != null && !((List) c22660uk.LIZ).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void LJIILJJIL() {
        C04640Ge c04640Ge = this.LJIIL.LJLILLLLZI.LIZ;
        String str = this.LJIILIIL.LIZJ;
        boolean z = c04640Ge.LIZIZ;
        if (!z && !c04640Ge.LIZ) {
            return;
        }
        if (!c04640Ge.LIZ || z) {
            C06240Mi c06240Mi = (C06240Mi) ((HashMap) c04640Ge.LIZLLL).get(str);
            if (c06240Mi == null) {
                c06240Mi = new C06240Mi();
                ((HashMap) c04640Ge.LIZLLL).put(str, c06240Mi);
            }
            int i = c06240Mi.LIZ + 1;
            c06240Mi.LIZ = i;
            if (i == Integer.MAX_VALUE) {
                c06240Mi.LIZ = 1073741823;
            }
        }
        if (!str.equals("__container")) {
            return;
        }
        Iterator it = c04640Ge.LIZJ.iterator();
        while (true) {
            C0M7 c0m7 = (C0M7) it;
            if (!c0m7.hasNext()) {
                return;
            } else {
                ((InterfaceC04630Gd) c0m7.next()).LIZ();
            }
        }
    }

    @Override // X.InterfaceC20640rU
    public final String getName() {
        return this.LJIILIIL.LIZJ;
    }

    public final void LJFF(AbstractC22650uj<?, ?> abstractC22650uj) {
        if (abstractC22650uj == null) {
            return;
        }
        this.LJIJI.add(abstractC22650uj);
    }

    public final void LJIIIZ(Canvas canvas) {
        RectF rectF = this.LJII;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.LJI);
        C0GR.LIZ();
    }

    public void LJIIZILJ(float f) {
        C43751nf c43751nf;
        C22670ul c22670ul = this.LJIJJ;
        c22670ul.LIZIZ.LJIIIZ(f);
        c22670ul.LIZJ.LJIIIZ(f);
        c22670ul.LIZLLL.LJIIIZ(f);
        c22670ul.LJ.LJIIIZ(f);
        c22670ul.LJFF.LJIIIZ(f);
        C43751nf c43751nf2 = c22670ul.LJI;
        if (c43751nf2 != null) {
            c43751nf2.LJIIIZ(f);
        }
        C43751nf c43751nf3 = c22670ul.LJII;
        if (c43751nf3 != null) {
            c43751nf3.LJIIIZ(f);
        }
        if (this.LJIILJJIL != null) {
            for (int i = 0; i < ((List) this.LJIILJJIL.LIZ).size(); i++) {
                ((AbstractC22650uj) ListProtector.get((List) this.LJIILJJIL.LIZ, i)).LJIIIZ(f);
            }
        }
        float f2 = this.LJIILIIL.LJIIL;
        if (f2 != 0.0f) {
            f /= f2;
        }
        if (C03970Dp.LIZ && (c43751nf = this.LJIILL) != null) {
            c43751nf.LJIIIZ(f / f2);
        }
        AbstractC45041pk abstractC45041pk = this.LJIILLIIL;
        if (abstractC45041pk != null) {
            abstractC45041pk.LJIIZILJ(abstractC45041pk.LJIILIIL.LJIIL * f);
        }
        for (int i2 = 0; i2 < ((ArrayList) this.LJIJI).size(); i2++) {
            ((AbstractC22650uj) ListProtector.get(this.LJIJI, i2)).LJIIIZ(f);
        }
    }

    public AbstractC45041pk(C04740Go c04740Go, C274816a c274816a) {
        this.LJIJJLI = true;
        if (C03970Dp.LIZ) {
            this.LIZJ = new C19440pY(1);
            this.LIZLLL = new C19440pY(PorterDuff.Mode.DST_IN, 0);
            this.LJ = new C19440pY(PorterDuff.Mode.DST_OUT, 0);
            this.LJFF = new C19440pY(1);
            this.LJI = new C19440pY(PorterDuff.Mode.CLEAR);
        } else {
            this.LIZJ = new Paint(1);
            Paint paint = new Paint(1);
            this.LIZLLL = paint;
            Paint paint2 = new Paint(1);
            this.LJ = paint2;
            this.LJFF = new Paint(1);
            Paint paint3 = new Paint();
            this.LJI = paint3;
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.LJIIL = c04740Go;
        this.LJIILIIL = c274816a;
        StringBuilder LIZ = X1D.LIZ();
        JBR.LJFF(LIZ, c274816a.LIZJ, "#draw", LIZ);
        if (c274816a.LJIJJ == C16Z.Invert) {
            this.LJFF.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.LJFF.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C38511fD c38511fD = c274816a.LJIIIIZZ;
        c38511fD.getClass();
        C22670ul c22670ul = new C22670ul(c38511fD);
        this.LJIJJ = c22670ul;
        c22670ul.LIZIZ(this);
        List<C271614u> list = c274816a.LJII;
        if (list != null && !list.isEmpty()) {
            C22660uk c22660uk = new C22660uk(c274816a.LJII);
            this.LJIILJJIL = c22660uk;
            Iterator it = ((List) c22660uk.LIZ).iterator();
            while (it.hasNext()) {
                ((AbstractC22650uj) it.next()).LIZ(this);
            }
            for (AbstractC22650uj<?, ?> abstractC22650uj : (List) this.LJIILJJIL.LIZIZ) {
                LJFF(abstractC22650uj);
                abstractC22650uj.LIZ(this);
            }
        }
        if (!this.LJIILIIL.LJIJI.isEmpty()) {
            C43751nf c43751nf = new C43751nf(this.LJIILIIL.LJIJI);
            this.LJIILL = c43751nf;
            c43751nf.LIZIZ = true;
            c43751nf.LIZ(new InterfaceC22630uh() { // from class: X.1gP
                @Override // X.InterfaceC22630uh
                public final void LJI() {
                    boolean z = false;
                    if (C03970Dp.LIZ) {
                        AbstractC45041pk abstractC45041pk = AbstractC45041pk.this;
                        if (abstractC45041pk.LJIILL.LJIIJJI() == 1.0f) {
                            z = true;
                        }
                        if (z != abstractC45041pk.LJIJJLI) {
                            abstractC45041pk.LJIJJLI = z;
                            abstractC45041pk.LJIIL.invalidateSelf();
                            return;
                        }
                        return;
                    }
                    AbstractC45041pk abstractC45041pk2 = AbstractC45041pk.this;
                    if (abstractC45041pk2.LJIILL.LJI().floatValue() == 1.0f) {
                        z = true;
                    }
                    if (z == abstractC45041pk2.LJIJJLI) {
                        return;
                    }
                    abstractC45041pk2.LJIJJLI = z;
                    abstractC45041pk2.LJIIL.invalidateSelf();
                }
            });
            boolean z = this.LJIILL.LJI().floatValue() == 1.0f;
            if (z != this.LJIJJLI) {
                this.LJIJJLI = z;
                this.LJIIL.invalidateSelf();
            }
            LJFF(this.LJIILL);
            return;
        }
        if (true == this.LJIJJLI) {
            return;
        }
        this.LJIJJLI = true;
        this.LJIIL.invalidateSelf();
    }

    @Override // X.InterfaceC34831Yh
    public void LIZ(RectF rectF, Matrix matrix) {
        if (C03970Dp.LIZ) {
            this.LJII.set(0.0f, 0.0f, 0.0f, 0.0f);
            LJIIIIZZ();
        }
        this.LJIIJJI.set(matrix);
        this.LJIIJJI.preConcat(this.LJIJJ.LIZLLL());
    }

    @Override // X.InterfaceC263811u
    public <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
        this.LJIJJ.LIZJ(t, c06800Om);
    }

    public void LJIIJJI(RectF rectF, Matrix matrix) {
        this.LJII.set(0.0f, 0.0f, 0.0f, 0.0f);
        LJIIIIZZ();
        this.LJIIJJI.set(matrix);
        List<AbstractC45041pk> list = this.LJIJ;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.LJIIJJI.preConcat(((AbstractC45041pk) ListProtector.get(this.LJIJ, size)).LJIJJ.LIZLLL());
                }
            }
        } else {
            AbstractC45041pk abstractC45041pk = this.LJIIZILJ;
            if (abstractC45041pk != null) {
                this.LJIIJJI.preConcat(abstractC45041pk.LJIJJ.LIZLLL());
            }
        }
        this.LJIIJJI.preConcat(this.LJIJJ.LIZLLL());
    }

    public final void LJIILIIL(RectF rectF, Matrix matrix) {
        AbstractC45041pk abstractC45041pk = this.LJIILLIIL;
        if (abstractC45041pk == null || this.LJIILIIL.LJIJJ == C16Z.Invert) {
            return;
        }
        if (C03970Dp.LIZ) {
            this.LJIIIZ.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.LJIILLIIL.LJIIJJI(this.LJIIIZ, matrix);
            if (!rectF.intersect(this.LJIIIZ)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            return;
        }
        abstractC45041pk.LIZ(this.LJIIIZ, matrix);
        rectF.set(Math.max(rectF.left, this.LJIIIZ.left), Math.max(rectF.top, this.LJIIIZ.top), Math.min(rectF.right, this.LJIIIZ.right), Math.min(rectF.bottom, this.LJIIIZ.bottom));
    }

    @Override // X.InterfaceC34831Yh
    public final void LIZJ(Canvas canvas, Matrix matrix, int i) {
        if (!this.LJIJJLI) {
            C0GR.LIZ();
            return;
        }
        LJIIIIZZ();
        this.LIZIZ.reset();
        this.LIZIZ.set(matrix);
        for (int size = this.LJIJ.size() - 1; size >= 0; size--) {
            this.LIZIZ.preConcat(((AbstractC45041pk) ListProtector.get(this.LJIJ, size)).LJIJJ.LIZLLL());
        }
        C0GR.LIZ();
        int intValue = (int) ((((i / 255.0f) * LJI().intValue()) / 100.0f) * 255.0f);
        boolean z = false;
        if (this.LJIILLIIL != null || LJIIL()) {
            this.LJII.set(0.0f, 0.0f, 0.0f, 0.0f);
            LIZ(this.LJII, this.LIZIZ);
            if (C03970Dp.LIZ) {
                LJIILIIL(this.LJII, matrix);
            } else {
                LJIILIIL(this.LJII, this.LIZIZ);
            }
            this.LIZIZ.preConcat(this.LJIJJ.LIZLLL());
            RectF rectF = this.LJII;
            Matrix matrix2 = this.LIZIZ;
            this.LJIIIIZZ.set(0.0f, 0.0f, 0.0f, 0.0f);
            if (LJIIL()) {
                int size2 = ((List) this.LJIILJJIL.LIZJ).size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        C271614u c271614u = (C271614u) ListProtector.get((List) this.LJIILJJIL.LIZJ, i2);
                        this.LIZ.set((Path) ((AbstractC22650uj) ListProtector.get((List) this.LJIILJJIL.LIZ, i2)).LJI());
                        this.LIZ.transform(matrix2);
                        int i3 = C16W.LIZIZ[c271614u.LIZ.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            break;
                        }
                        this.LIZ.computeBounds(this.LJIIJ, z);
                        if (i2 == 0) {
                            this.LJIIIIZZ.set(this.LJIIJ);
                        } else {
                            RectF rectF2 = this.LJIIIIZZ;
                            rectF2.set(Math.min(rectF2.left, this.LJIIJ.left), Math.min(this.LJIIIIZZ.top, this.LJIIJ.top), Math.max(this.LJIIIIZZ.right, this.LJIIJ.right), Math.max(this.LJIIIIZZ.bottom, this.LJIIJ.bottom));
                        }
                        i2++;
                        z = false;
                    } else if (C03970Dp.LIZ) {
                        if (!rectF.intersect(this.LJIIIIZZ)) {
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    } else {
                        rectF.set(Math.max(rectF.left, this.LJIIIIZZ.left), Math.max(rectF.top, this.LJIIIIZZ.top), Math.min(rectF.right, this.LJIIIIZZ.right), Math.min(rectF.bottom, this.LJIIIIZZ.bottom));
                    }
                }
            }
            if (C03970Dp.LIZ) {
                if (!this.LJII.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
                    this.LJII.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            } else {
                this.LJII.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            }
            C0GR.LIZ();
            if (C03970Dp.LIZ) {
                if (this.LJII.width() < 1.0f || this.LJII.height() < 1.0f) {
                    C0GR.LIZ();
                    LJIILJJIL();
                    return;
                }
                this.LIZJ.setAlpha(255);
            }
            LJIILLIIL(canvas, this.LJII, this.LIZJ, true);
            C0GR.LIZ();
            LJIIIZ(canvas);
            LJIIJ(canvas, this.LIZIZ, intValue);
            C0GR.LIZ();
            if (LJIIL()) {
                Matrix matrix3 = this.LIZIZ;
                LJII(canvas, matrix3, EnumC271514t.MaskModeAdd);
                LJII(canvas, matrix3, EnumC271514t.MaskModeIntersect);
                LJII(canvas, matrix3, EnumC271514t.MaskModeSubtract);
            }
            if (this.LJIILLIIL != null) {
                LJIILLIIL(canvas, this.LJII, this.LJFF, false);
                C0GR.LIZ();
                LJIIIZ(canvas);
                this.LJIILLIIL.LIZJ(canvas, matrix, intValue);
                canvas.restore();
                C0GR.LIZ();
                C0GR.LIZ();
            }
            canvas.restore();
            C0GR.LIZ();
            C0GR.LIZ();
            LJIILJJIL();
            return;
        }
        this.LIZIZ.preConcat(this.LJIJJ.LIZLLL());
        LJIIJ(canvas, this.LIZIZ, intValue);
        C0GR.LIZ();
        C0GR.LIZ();
        LJIILJJIL();
    }

    public final void LJII(Canvas canvas, Matrix matrix, EnumC271514t enumC271514t) {
        Paint paint;
        if (C16W.LIZIZ[enumC271514t.ordinal()] != 1) {
            paint = this.LIZLLL;
        } else {
            paint = this.LJ;
        }
        int size = ((List) this.LJIILJJIL.LIZJ).size();
        for (int i = 0; i < size; i++) {
            if (((C271614u) ListProtector.get((List) this.LJIILJJIL.LIZJ, i)).LIZ == enumC271514t) {
                LJIILLIIL(canvas, this.LJII, paint, false);
                C0GR.LIZ();
                LJIIIZ(canvas);
                for (int i2 = 0; i2 < size; i2++) {
                    if (((C271614u) ListProtector.get((List) this.LJIILJJIL.LIZJ, i2)).LIZ == enumC271514t) {
                        this.LIZ.set((Path) ((AbstractC22650uj) ListProtector.get((List) this.LJIILJJIL.LIZ, i2)).LJI());
                        this.LIZ.transform(matrix);
                        AbstractC22650uj abstractC22650uj = (AbstractC22650uj) ListProtector.get((List) this.LJIILJJIL.LIZIZ, i2);
                        int alpha = this.LIZJ.getAlpha();
                        this.LIZJ.setAlpha((int) (((Integer) abstractC22650uj.LJI()).intValue() * 2.55f));
                        canvas.drawPath(this.LIZ, this.LIZJ);
                        this.LIZJ.setAlpha(alpha);
                    }
                }
                canvas.restore();
                C0GR.LIZ();
                C0GR.LIZ();
                return;
            }
        }
    }

    public static void LJIILLIIL(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            if (z) {
                i = 31;
            } else {
                i = 19;
            }
            canvas.saveLayer(rectF, paint, i);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }

    @Override // X.InterfaceC263811u
    public final void LJ(C263711t c263711t, int i, List<C263711t> list, C263711t c263711t2) {
        if (!c263711t.LIZJ(i, this.LJIILIIL.LIZJ)) {
            return;
        }
        if (!"__container".equals(this.LJIILIIL.LIZJ)) {
            String str = this.LJIILIIL.LIZJ;
            c263711t2.getClass();
            C263711t c263711t3 = new C263711t(c263711t2);
            c263711t3.LIZ.add(str);
            if (c263711t.LIZ(i, this.LJIILIIL.LIZJ)) {
                C263711t c263711t4 = new C263711t(c263711t3);
                c263711t4.LIZIZ = this;
                ((ArrayList) list).add(c263711t4);
            }
            c263711t2 = c263711t3;
        }
        if (c263711t.LIZLLL(i, this.LJIILIIL.LIZJ)) {
            LJIILL(c263711t, c263711t.LIZIZ(i, this.LJIILIIL.LIZJ) + i, list, c263711t2);
        }
    }
}
