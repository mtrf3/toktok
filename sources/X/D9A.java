package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9A extends AbstractC39455Fe7 {
    public D9A() {
        C32856Cuy.ml(this.LIZJ);
        this.LIZJ.LJIILIIL(5.74f, 11.24f);
        this.LIZJ.LJIIL(3.8f, 5.69f);
        this.LIZJ.LJIIJ(0.44f, 0.67f, 0.48f, 1.2f, 0.1f, 1.91f);
        this.LIZJ.LIZJ(2.2f, 2.2f, false, true, 31.7f, 22.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(15.2f);
        this.LIZJ.LJIIJ(-0.6f, 0.0f, -1.1f, -0.49f, -1.1f, -1.1f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-1.85f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, -0.6f, 0.5f, -1.1f, 1.1f, -1.1f);
        this.LIZJ.LJIIJJI(12.39f);
        this.LIZJ.LJIIL(-1.51f, -2.26f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, 0.3f, -1.53f);
        this.LIZJ.LJIIL(1.84f, -1.22f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, 1.52f, 0.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.3f, 26.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(16.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(0.6f, 0.0f, 1.1f, 0.5f, 1.1f, 1.1f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(1.86f);
        this.LIZJ.LJIIJ(0.0f, 0.6f, -0.5f, 1.1f, -1.1f, 1.1f);
        this.LIZJ.LJI(20.41f);
        this.LIZJ.LJIIL(1.51f, 2.26f);
        this.LIZJ.LJIIJ(0.34f, 0.51f, 0.2f, 1.2f, -0.3f, 1.53f);
        this.LIZJ.LJIIL(-1.84f, 1.22f);
        this.LIZJ.LJIIJ(-0.5f, 0.34f, -1.18f, 0.2f, -1.52f, -0.3f);
        this.LIZJ.LJIIL(-3.8f, -5.69f);
        this.LIZJ.LJIIJ(-0.44f, -0.67f, -0.48f, -1.2f, -0.1f, -1.92f);
        this.LIZJ.LIZJ(2.2f, 2.2f, false, true, 16.3f, 26.0f);
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
