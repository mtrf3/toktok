package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: X.0ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22670ul {
    public final Matrix LIZ = new Matrix();
    public final AbstractC35131Zl LIZIZ;
    public final AbstractC22650uj<?, PointF> LIZJ;
    public final C43801nk LIZLLL;
    public final C43751nf LJ;
    public final C43771nh LJFF;
    public final C43751nf LJI;
    public final C43751nf LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final Matrix LIZLLL() {
        this.LIZ.reset();
        PointF LJI = this.LIZJ.LJI();
        float f = LJI.x;
        if (f != 0.0f || LJI.y != 0.0f) {
            this.LIZ.preTranslate(f, LJI.y);
        }
        float floatValue = this.LJ.LJI().floatValue();
        if (floatValue != 0.0f) {
            this.LIZ.preRotate(floatValue);
        }
        C06810On LJI2 = LJI();
        float f2 = LJI2.LIZ;
        if (f2 != 1.0f || LJI2.LIZIZ != 1.0f) {
            this.LIZ.preScale(f2, LJI2.LIZIZ);
        }
        PointF pointF = (PointF) this.LIZIZ.LJI();
        float f3 = pointF.x;
        if (f3 != 0.0f || pointF.y != 0.0f) {
            this.LIZ.preTranslate(-f3, -pointF.y);
        }
        return this.LIZ;
    }

    public C22670ul(C38511fD c38511fD) {
        this.LIZIZ = (AbstractC35131Zl) c38511fD.LIZ.LIZ();
        this.LIZJ = c38511fD.LIZIZ.LIZ();
        this.LIZLLL = (C43801nk) c38511fD.LIZJ.LIZ();
        this.LJ = (C43751nf) c38511fD.LIZLLL.LIZ();
        this.LJFF = (C43771nh) c38511fD.LJ.LIZ();
        C44451on c44451on = c38511fD.LJFF;
        if (c44451on != null) {
            this.LJI = (C43751nf) c44451on.LIZ();
        } else {
            this.LJI = null;
        }
        C44451on c44451on2 = c38511fD.LJI;
        if (c44451on2 != null) {
            this.LJII = (C43751nf) c44451on2.LIZ();
        } else {
            this.LJII = null;
        }
    }

    public final void LIZ(AbstractC45041pk abstractC45041pk) {
        abstractC45041pk.LJFF(this.LIZIZ);
        abstractC45041pk.LJFF(this.LIZJ);
        abstractC45041pk.LJFF(this.LIZLLL);
        abstractC45041pk.LJFF(this.LJ);
        abstractC45041pk.LJFF(this.LJFF);
        C43751nf c43751nf = this.LJI;
        if (c43751nf != null) {
            abstractC45041pk.LJFF(c43751nf);
        }
        C43751nf c43751nf2 = this.LJII;
        if (c43751nf2 != null) {
            abstractC45041pk.LJFF(c43751nf2);
        }
    }

    public final void LIZIZ(InterfaceC22630uh interfaceC22630uh) {
        this.LIZIZ.LIZ(interfaceC22630uh);
        this.LIZJ.LIZ(interfaceC22630uh);
        LIZ(interfaceC22630uh);
        this.LJ.LIZ(interfaceC22630uh);
        LIZ(interfaceC22630uh);
        C43751nf c43751nf = this.LJI;
        if (c43751nf != null) {
            c43751nf.LIZ(interfaceC22630uh);
        }
        C43751nf c43751nf2 = this.LJII;
        if (c43751nf2 != null) {
            c43751nf2.LIZ(interfaceC22630uh);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Matrix LJ(float f) {
        PointF LJI = this.LIZJ.LJI();
        PointF pointF = (PointF) this.LIZIZ.LJI();
        C06810On LJI2 = LJI();
        float floatValue = this.LJ.LJI().floatValue();
        this.LIZ.reset();
        this.LIZ.preTranslate(LJI.x * f, LJI.y * f);
        double d = f;
        this.LIZ.preScale((float) Math.pow(LJI2.LIZ, d), (float) Math.pow(LJI2.LIZIZ, d));
        this.LIZ.preRotate(floatValue * f, pointF.x, pointF.y);
        return this.LIZ;
    }

    public final <T> boolean LIZJ(T t, C06800Om<T> c06800Om) {
        C43751nf c43751nf;
        C43751nf c43751nf2;
        if (t == C0GO.LJ) {
            this.LIZIZ.LJIIJ(c06800Om);
            return true;
        }
        if (t == C0GO.LJFF) {
            this.LIZJ.LJIIJ(c06800Om);
            return true;
        }
        if (t == C0GO.LJIIIIZZ) {
            LJIIJ(c06800Om);
            return true;
        }
        if (t == C0GO.LJIIIZ) {
            this.LJ.LJIIJ(c06800Om);
            return true;
        }
        if (t == C0GO.LIZJ) {
            LJIIJ(c06800Om);
            return true;
        }
        if (t == C0GO.LJIJJ && (c43751nf2 = this.LJI) != null) {
            c43751nf2.LJIIJ(c06800Om);
            return true;
        }
        if (t == C0GO.LJIJJLI && (c43751nf = this.LJII) != null) {
            c43751nf.LJIIJ(c06800Om);
            return true;
        }
        return false;
    }
}
