package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2F extends AbstractC39455Fe7 {
    public D2F() {
        this.LIZJ.LJIIIIZZ(33.8f, 11.47f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(3.62f);
        this.LIZJ.LJIIJ(1.28f, 0.0f, 2.35f, 0.94f, 2.5f, 2.17f);
        this.LIZJ.LJIIL(3.04f, 25.43f);
        this.LIZJ.LIZJ(6.3f, 6.3f, false, true, 36.6f, 46.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(12.39f);
        this.LIZJ.LJIIIZ(6.3f, 6.3f, false, true, -6.35f, -6.93f);
        this.LIZJ.LJII(9.1f, 13.64f);
        this.LIZJ.LJIIIZ(2.49f, 2.49f, false, true, 2.5f, -2.17f);
        C32856Cuy.j0(this.LIZJ);
        C32856Cuy.Y0(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.5f, 0.45f, -3.7f, 1.84f, -5.59f);
        this.LIZJ.LJ(18.5f, 3.5f, 20.93f, 2.0f, 24.5f, 2.0f);
        this.LIZJ.LJIILJJIL(6.0f, 1.5f, 7.47f, 3.48f, true);
        this.LIZJ.LJIIIZ(9.73f, 9.73f, false, true, 1.84f, 5.6f);
        C32856Cuy.LJLI(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(20.33f, 7.8f);
        this.LIZJ.LJIIIZ(5.86f, 5.86f, false, false, -1.08f, 3.29f);
        C32856Cuy.LJLI(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(10.52f);
        C32856Cuy.Y0(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.87f, -0.28f, -2.22f, -1.08f, -3.29f);
        this.LIZJ.LJIIJ(-0.71f, -0.97f, -1.93f, -1.84f, -4.18f, -1.84f);
        this.LIZJ.LJIILJJIL(-3.47f, 0.87f, -4.18f, 1.84f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(12.1f, 15.3f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.83f, 0.0f);
        C32856Cuy.Nm(this.LIZJ);
        C32856Cuy.P5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
