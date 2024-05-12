package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D61 extends AbstractC39455Fe7 {
    public D61() {
        this.LIZJ.LJIIIIZZ(8.25f, 4.0f);
        C32856Cuy.zn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(29.5f);
        C32856Cuy.An(this.LIZJ);
        this.LIZJ.LJIILL(2.41f);
        C32856Cuy.yn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(9.25f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p3.LJIJ(4.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.77f, 9.5f);
        this.LIZJ.LJIIJJI(28.46f);
        this.LIZJ.LJIIJ(0.84f, 0.0f, 1.52f, 0.67f, 1.52f, 1.5f);
        this.LIZJ.LJIILL(21.01f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -2.34f, 4.5f);
        this.LIZJ.LJIIL(-10.16f, 7.16f);
        this.LIZJ.LJIIIZ(5.65f, 5.65f, false, true, -6.5f, 0.0f);
        this.LIZJ.LJII(10.6f, 36.5f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -2.34f, -4.49f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-21.0f);
        this.LIZJ.LJIIJ(0.0f, -0.84f, 0.68f, -1.51f, 1.52f, -1.51f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(14.05f, 17.7f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(0.4f, 0.4f, false, true, 0.36f, 0.0f);
        this.LIZJ.LJIIL(3.99f, 1.96f);
        this.LIZJ.LJIIJ(0.57f, 0.28f, 1.23f, -0.19f, 1.14f, -0.81f);
        this.LIZJ.LJIIL(-0.68f, -4.68f);
        this.LIZJ.LJIIIZ(0.39f, 0.39f, false, true, 0.12f, -0.33f);
        this.LIZJ.LJIIL(2.9f, -2.85f);
        this.LIZJ.LJIIIZ(0.78f, 0.78f, false, false, -0.45f, -1.32f);
        this.LIZJ.LJIIL(-4.23f, -0.64f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(0.4f, 0.4f, false, true, -0.3f, -0.23f);
        this.LIZJ.LJIIL(-1.95f, -4.16f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, -1.44f, 0.0f);
        this.LIZJ.LJIIL(-1.95f, 4.16f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(0.4f, 0.4f, false, true, -0.3f, 0.23f);
        this.LIZJ.LJIIL(-4.23f, 0.64f);
        this.LIZJ.LJIIJ(-0.64f, 0.1f, -0.9f, 0.87f, -0.44f, 1.32f);
        this.LIZJ.LJIIL(2.9f, 2.85f);
        this.LIZJ.LJIIJ(0.08f, 0.09f, 0.12f, 0.21f, 0.1f, 0.33f);
        this.LIZJ.LJIIL(-0.67f, 4.68f);
        this.LIZJ.LJIIJ(-0.1f, 0.62f, 0.57f, 1.09f, 1.14f, 0.8f);
        this.LIZJ.LJIIL(4.0f, -1.96f);
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
