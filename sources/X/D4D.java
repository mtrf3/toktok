package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4D extends AbstractC39455Fe7 {
    public D4D() {
        this.LIZJ.LJIIIIZZ(18.35f, 6.0f);
        this.LIZJ.LJIIJ(-1.0f, 0.0f, -1.9f, 0.57f, -2.33f, 1.47f);
        this.LIZJ.LJIIL(-1.77f, 3.67f);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        C32856Cuy.rj(this.LIZJ);
        this.LIZJ.LJIJ(37.4f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        p.LJIIJJI(36.0f);
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(15.14f);
        C32856Cuy.qj(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-8.2f);
        this.LIZJ.LJIIL(-1.77f, -3.67f);
        this.LIZJ.LIZJ(2.6f, 2.6f, false, false, 29.69f, 6.0f);
        this.LIZJ.LJI(18.35f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(37.0f, 16.0f);
        C32856Cuy.r(this.LIZJ);
        C32856Cuy.bl(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-3.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.c1(this.LIZJ);
        this.LIZJ.LJIILIIL(-13.64f, 0.37f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 1.28f, 0.0f);
        this.LIZJ.LJIIL(0.11f, 0.4f);
        this.LIZJ.LJIIL(0.07f, 0.22f);
        this.LIZJ.LJIIL(0.25f, 0.9f);
        this.LIZJ.LIZJ(11.0f, 11.0f, false, false, 32.08f, 25.0f);
        this.LIZJ.LJIIJ(0.21f, 0.08f, 0.44f, 0.14f, 0.9f, 0.27f);
        this.LIZJ.LJIIL(0.26f, 0.08f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.0f, 1.3f);
        this.LIZJ.LJIIL(-0.26f, 0.08f);
        this.LIZJ.LJIIL(-0.9f, 0.27f);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, -7.26f, 8.0f);
        this.LIZJ.LJIIL(-0.07f, 0.24f);
        this.LIZJ.LJIIL(-0.11f, 0.39f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -1.28f, 0.0f);
        this.LIZJ.LJIIL(-0.12f, -0.4f);
        this.LIZJ.LJIIL(-0.06f, -0.22f);
        this.LIZJ.LJIIL(-0.25f, -0.9f);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, -7.91f, -7.38f);
        this.LIZJ.LJIIIZ(3.87f, 3.87f, false, true, -0.26f, -0.08f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.0f, -1.3f);
        this.LIZJ.LJIIL(0.26f, -0.08f);
        this.LIZJ.LJIIL(0.9f, -0.27f);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, 7.0f, -7.1f);
        this.LIZJ.LJIIL(0.26f, -0.9f);
        this.LIZJ.LJIIL(0.06f, -0.24f);
        this.LIZJ.LJIIL(0.12f, -0.39f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
