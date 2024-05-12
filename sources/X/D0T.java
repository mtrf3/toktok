package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0T extends AbstractC39455Fe7 {
    public D0T() {
        this.LIZJ.LJIIIIZZ(22.26f, 4.05f);
        this.LIZJ.LJIIIZ(4.15f, 4.15f, false, true, 4.2f, 0.05f);
        this.LIZJ.LJIIIZ(7.24f, 7.24f, false, true, 3.52f, 6.2f);
        C32856Cuy.D1(this.LIZJ);
        this.LIZJ.LJIIJJI(8.48f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, 5.48f, 6.3f);
        this.LIZJ.LJIIL(-2.41f, 15.73f);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, true, 36.04f, 42.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(11.1f);
        this.LIZJ.LIZJ(6.04f, 6.04f, false, true, 5.0f, 36.5f);
        this.LIZJ.LJIJ(24.29f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.02f, -0.27f);
        this.LIZJ.LJIIJ(0.39f, -2.9f, 2.89f, -5.46f, 6.07f, -5.42f);
        this.LIZJ.LJIIJJI(3.36f);
        this.LIZJ.LJIIL(5.3f, -11.75f);
        this.LIZJ.LJIIIZ(5.93f, 5.93f, false, true, 2.51f, -2.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-8.52f, 18.54f);
        this.LIZJ.LJI(11.04f);
        this.LIZJ.LJIIJ(-0.88f, -0.02f, -1.84f, 0.74f, -2.04f, 1.84f);
        this.LIZJ.LJIILL(11.92f);
        this.LIZJ.LIZJ(2.04f, 2.04f, false, false, 11.04f, 38.0f);
        this.LIZJ.LJI(13.74f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(22.6f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.0f, 15.41f);
        this.LIZJ.LJIIJJI(18.34f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 1.5f, -1.27f);
        this.LIZJ.LJII(39.97f, 21.0f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -1.5f, -1.72f);
        this.LIZJ.LJI(27.98f);
        C32856Cuy.um(this.LIZJ);
        this.LIZJ.LJIJ(10.3f);
        this.LIZJ.LJIIJ(0.0f, -1.18f, -0.62f, -2.21f, -1.57f, -2.78f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-0.04f, -0.02f);
        C32856Cuy.nb(this.LIZJ);
        this.LIZJ.LJIILJJIL(-0.07f, 0.0f, -0.18f, 0.06f, false);
        this.LIZJ.LJIIJ(-0.25f, 0.13f, -0.57f, 0.45f, -0.77f, 0.9f);
        C32856Cuy.i1(this.LIZJ);
        this.LIZJ.LJIIL(-5.66f, 12.55f);
        DIK.LIZIZ(this.LIZJ, "p", 38.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
