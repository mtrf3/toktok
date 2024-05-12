package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7S extends AbstractC39455Fe7 {
    public D7S() {
        this.LIZJ.LJIIIIZZ(35.0f, 12.07f);
        this.LIZJ.LJIIIZ(7.5f, 7.5f, false, true, 0.0f, 14.86f);
        this.LIZJ.LJIIJ(-0.55f, 0.08f, -1.0f, 0.52f, -1.0f, 1.07f);
        C32856Cuy.B1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 0.96f);
        this.LIZJ.LJIIIZ(12.5f, 12.5f, false, false, 0.0f, -24.92f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, false, -1.0f, 0.96f);
        C32856Cuy.B1(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.07f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.25f, 15.55f);
        this.LIZJ.LJIIL(0.17f, -0.15f);
        this.LIZJ.LJIIJ(5.13f, -4.76f, 6.96f, -6.46f, 10.87f, -5.74f);
        this.LIZJ.LJIIIZ(6.48f, 6.48f, false, true, 4.55f, 3.44f);
        this.LIZJ.LJIIJ(0.39f, 0.7f, 0.92f, 2.12f, 1.02f, 2.4f);
        this.LIZJ.LJIIJJI(9.64f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, true, true, 0.0f, 8.0f);
        this.LIZJ.LJIIJJI(-6.53f);
        this.LIZJ.LJIIJ(-0.03f, 0.76f, -0.1f, 1.59f, -0.22f, 2.5f);
        this.LIZJ.LJIIL(-1.19f, 9.45f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(0.07f);
        this.LIZJ.LJIIIZ(4.59f, 4.59f, false, true, -4.54f, 3.98f);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, true, 2.0f, 34.8f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(20.4f);
        this.LIZJ.LJIIJ(0.0f, -0.1f, 0.0f, -0.19f, 0.02f, -0.28f);
        this.LIZJ.LJIIJ(0.32f, -2.43f, 2.36f, -4.6f, 4.97f, -4.56f);
        C40084FoG.LJ(this.LIZJ, "p", 1.26f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
