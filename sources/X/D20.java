package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D20 extends AbstractC39455Fe7 {
    public D20() {
        this.LIZJ.LJIIIIZZ(27.0f, 43.0f);
        C32856Cuy.N8(this.LIZJ);
        C32856Cuy.W0(this.LIZJ);
        C32856Cuy.B1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(13.2f);
        C32856Cuy.io(this.LIZJ);
        this.LIZJ.LJ(2.0f, 13.32f, 2.0f, 15.28f, 2.0f, 19.2f);
        this.LIZJ.LJIILL(9.6f);
        C32856Cuy.yj(this.LIZJ);
        C32856Cuy.D6(this.LIZJ);
        C32856Cuy.LJZ(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.0f, 19.5f);
        this.LIZJ.LJIIJ(0.0f, -0.77f, 0.0f, -1.16f, 0.16f, -1.38f);
        this.LIZJ.LJIIJ(0.15f, -0.2f, 0.36f, -0.33f, 0.6f, -0.35f);
        this.LIZJ.LJIIJ(0.28f, -0.03f, 0.62f, 0.16f, 1.3f, 0.55f);
        this.LIZJ.LJIIL(7.86f, 4.49f);
        this.LIZJ.LJIIJ(0.68f, 0.39f, 1.02f, 0.58f, 1.13f, 0.84f);
        this.LIZJ.LJIIJ(0.1f, 0.22f, 0.1f, 0.48f, 0.0f, 0.7f);
        this.LIZJ.LJIIJ(-0.11f, 0.26f, -0.45f, 0.45f, -1.13f, 0.84f);
        this.LIZJ.LJIIL(-7.87f, 4.5f);
        this.LIZJ.LJIIJ(-0.67f, 0.38f, -1.0f, 0.57f, -1.29f, 0.54f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, true, -0.6f, -0.35f);
        this.LIZJ.LJIIJ(-0.16f, -0.22f, -0.16f, -0.61f, -0.16f, -1.39f);
        this.LIZJ.LJIILL(-8.98f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(35.0f, 8.0f);
        this.LIZJ.LJIIJ(3.73f, 0.0f, 5.6f, 0.0f, 7.04f, 0.7f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, true, 3.27f, 3.26f);
        this.LIZJ.LJ(46.0f, 13.4f, 46.0f, 15.26f, 46.0f, 19.0f);
        C32856Cuy.LJLIIIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 3.73f, 0.0f, 5.6f, -0.7f, 7.04f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, true, -3.26f, 3.27f);
        this.LIZJ.LJ(40.6f, 40.0f, 38.74f, 40.0f, 35.0f, 40.0f);
        C32856Cuy.S9(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
