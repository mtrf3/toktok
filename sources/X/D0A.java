package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0A extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0A() {
        this.LIZJ.LJIIIIZZ(10.21f, 19.4f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJIIL(2.33f, 2.34f);
        C32856Cuy.xk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-3.89f, 3.9f);
        this.LIZJ.LJIIIZ(7.7f, 7.7f, true, false, 10.89f, 10.88f);
        this.LIZJ.LJIIL(3.89f, -3.89f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJIIL(2.34f, 2.33f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJIIL(-3.9f, 3.89f);
        this.LIZJ.LIZJ(13.0f, 13.0f, false, true, 6.33f, 23.29f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(3.9f, -3.89f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.04f, 24.85f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.41f);
        p3.LJIIL(2.34f, 2.34f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.4f, 0.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(3.9f, -3.9f);
        this.LIZJ.LIZJ(13.0f, 13.0f, true, false, 23.29f, 6.33f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-3.89f, 3.9f);
        C32856Cuy.C8(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(2.34f, 2.34f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIL(3.9f, -3.89f);
        this.LIZJ.LJIIIZ(7.7f, 7.7f, true, true, 10.88f, 10.89f);
        this.LIZJ.LJIIL(-3.89f, 3.89f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.76f, 28.49f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.41f);
        dij.LJIIL(2.34f, 2.34f);
        C32856Cuy.Ek(dij);
        dij.LJII(32.24f, 19.5f);
        C32856Cuy.Hk(dij);
        dij.LJIIL(-2.34f, -2.34f);
        C32856Cuy.F8(dij);
        dij.LJII(15.75f, 28.5f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
