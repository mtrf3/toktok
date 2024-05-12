package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAE extends AbstractC39455Fe7 {
    public DAE() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(44.0f, 7.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(5.6f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, true, -0.68f, 0.8f);
        this.LIZJ.LJIIL(-8.65f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, false, -0.43f, 0.5f);
        this.LIZJ.LJIILL(23.09f);
        this.LIZJ.LJIIIZ(7.12f, 7.12f, true, true, -7.12f, -7.12f);
        this.LIZJ.LJIIJJI(3.12f);
        this.LIZJ.LJIJ(8.47f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.85f, -1.0f);
        this.LIZJ.LJIIL(11.76f, -1.46f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, true, 44.0f, 7.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.0f, 9.0f);
        this.LIZJ.LJIIJ(1.82f, -1.82f, 1.0f, -6.0f, 2.5f, -6.0f);
        this.LIZJ.LJIILJJIL(0.68f, 4.18f, 2.5f, 6.0f, true);
        this.LIZJ.LJIIJ(1.82f, 1.82f, 6.0f, 1.0f, 6.0f, 2.5f);
        this.LIZJ.LJIILJJIL(-4.18f, 0.68f, -6.0f, 2.5f, true);
        this.LIZJ.LJIIJ(-1.82f, 1.82f, -1.0f, 6.0f, -2.5f, 6.0f);
        this.LIZJ.LJIILJJIL(-0.68f, -4.18f, -2.5f, -6.0f, true);
        this.LIZJ.LJIIJ(-1.82f, -1.82f, -6.0f, -1.0f, -6.0f, -2.5f);
        this.LIZJ.LJIILJJIL(4.18f, -0.68f, 6.0f, -2.5f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.19f, 23.81f);
        this.LIZJ.LJ(12.69f, 25.31f, 16.0f, 24.89f, 16.0f, 26.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, 1.11f, -3.31f, 0.69f, -4.81f, 2.19f);
        this.LIZJ.LJ(9.69f, 29.69f, 10.12f, 33.0f, 9.0f, 33.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(-1.12f, 0.0f, -0.69f, -3.31f, -2.19f, -4.81f);
        this.LIZJ.LJ(5.31f, 26.69f, 2.0f, 27.12f, 2.0f, 26.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -1.12f, 3.31f, -0.69f, 4.81f, -2.19f);
        this.LIZJ.LJ(8.31f, 22.31f, 7.89f, 19.0f, 9.0f, 19.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(1.11f, 0.0f, 0.69f, 3.31f, 2.19f, 4.81f);
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
