package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0B extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0B() {
        this.LIZJ.LJIIIIZZ(33.26f, 28.8f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJIIL(-7.76f, -7.77f);
        this.LIZJ.LJIIIZ(2.02f, 2.02f, false, true, -0.08f, -0.09f);
        this.LIZJ.LJIIL(-0.1f, 0.1f);
        this.LIZJ.LJIIL(-7.76f, 7.77f);
        C32856Cuy.mk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.41f, -1.42f);
        C32856Cuy.vk(this.LIZJ);
        this.LIZJ.LJIIL(2.91f, -2.91f);
        this.LIZJ.LJIIIZ(5.66f, 5.66f, true, true, 6.61f, -9.04f);
        this.LIZJ.LJIIL(1.18f, 1.18f);
        this.LIZJ.LJIIL(1.17f, -1.18f);
        this.LIZJ.LJIIIZ(5.66f, 5.66f, true, true, 6.6f, 9.04f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(2.9f, 2.9f);
        C32856Cuy.LLF(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.9f, -11.94f);
        this.LIZJ.LJIIIZ(1.66f, 1.66f, false, false, -2.35f, 0.0f);
        this.LIZJ.LJIIL(-1.18f, 1.18f);
        this.LIZJ.LJIIL(1.18f, 1.17f);
        this.LIZJ.LJIIIZ(1.66f, 1.66f, true, false, 2.35f, -2.35f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-10.36f, 0.0f);
        this.LIZJ.LJIIIZ(1.66f, 1.66f, true, false, 0.0f, 2.35f);
        this.LIZJ.LJIIL(1.18f, -1.17f);
        this.LIZJ.LJII(20.0f, 16.86f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.14f, 7.34f);
        dij.LIZJ(6.0f, 6.0f, false, true, 14.1f, 2.0f);
        dij.LJIIJJI(19.8f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 5.96f, 5.34f);
        dij.LJIIL(3.4f, 31.0f);
        dij.LIZJ(6.0f, 6.0f, false, true, 37.3f, 45.0f);
        dij.LJI(10.7f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, -5.97f, -6.66f);
        C279417u.LIZIZ(dij, 3.41f, -31.0f, 14.1f, 6.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -1.98f, 1.78f);
        dij.LJIIL(-3.41f, 31.0f);
        dij.LIZJ(2.0f, 2.0f, false, false, 10.7f, 41.0f);
        dij.LJIIJJI(26.6f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.22f);
        dij.LJIIL(-3.42f, -31.0f);
        dij.LIZJ(2.0f, 2.0f, false, false, 33.9f, 6.0f);
        dij.LJI(14.1f);
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
