package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33444DAq extends AbstractC39455Fe7 {
    public C33444DAq() {
        C32856Cuy.in(this.LIZJ);
        this.LIZJ.LJIIIIZZ(23.98f, 27.61f);
        this.LIZJ.LJIIJ(-1.54f, -0.4f, -3.21f, -0.61f, -5.0f, -0.61f);
        C32856Cuy.Y5(this.LIZJ);
        this.LIZJ.LJIIJ(0.56f, 0.0f, 1.0f, -0.45f, 1.02f, -1.0f);
        this.LIZJ.LJIIJ(0.3f, -7.84f, 4.9f, -13.0f, 12.98f, -13.0f);
        this.LIZJ.LJIIJ(1.85f, 0.0f, 3.52f, 0.27f, 5.0f, 0.78f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-4.17f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(41.48f, 30.65f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-12.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p3.LJIILL(-1.3f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p3.LJIIJJI(12.5f);
        p3.LJIIL(-2.86f, -2.48f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -0.05f, -1.46f);
        p3.LJIIL(0.87f, -0.87f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.0f);
        p3.LJIIL(5.3f, 5.3f);
        p3.LJIIJ(0.64f, 0.64f, 0.64f, 1.68f, 0.0f, 2.33f);
        p3.LJIIL(-5.3f, 5.29f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        p3.LJIIL(-0.87f, -0.87f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 0.05f, -1.46f);
        p3.LJIIL(2.86f, -2.48f);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.48f, 39.35f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(12.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(1.3f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-12.5f);
        C32856Cuy.N7(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
