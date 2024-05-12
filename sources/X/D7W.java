package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7W extends AbstractC39455Fe7 {
    public D7W() {
        this.LIZJ.LJIIIIZZ(9.92f, 11.0f);
        this.LIZJ.LIZJ(5.83f, 5.83f, false, false, 4.0f, 16.73f);
        this.LIZJ.LJIILL(14.54f);
        this.LIZJ.LJ(4.0f, 34.48f, 6.7f, 37.0f, 9.92f, 37.0f);
        C32856Cuy.Cb(this.LIZJ);
        this.LIZJ.LJIIIZ(5.83f, 5.83f, false, false, 5.91f, -5.73f);
        C32856Cuy.D9(this.LIZJ);
        this.LIZJ.LJIIL(4.24f, 3.1f);
        this.LIZJ.LJIIJ(1.02f, 0.75f, 2.38f, 0.87f, 3.52f, 0.32f);
        this.LIZJ.LIZJ(3.3f, 3.3f, false, false, 44.0f, 30.46f);
        this.LIZJ.LJIJ(17.54f);
        this.LIZJ.LJIIIZ(3.3f, 3.3f, false, false, -1.9f, -2.97f);
        this.LIZJ.LJIIIZ(3.47f, 3.47f, false, false, -3.53f, 0.32f);
        this.LIZJ.LJII(34.33f, 18.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-1.26f);
        this.LIZJ.LJIIJ(0.0f, -3.21f, -2.7f, -5.73f, -5.92f, -5.73f);
        this.LIZJ.LJI(9.91f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.6f, 24.96f);
        this.LIZJ.LJIIJ(0.7f, -0.45f, 0.7f, -1.47f, 0.0f, -1.92f);
        this.LIZJ.LJIIL(-6.14f, -3.82f);
        this.LIZJ.LJIIIZ(1.14f, 1.14f, false, false, -1.76f, 0.95f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(7.66f);
        this.LIZJ.LJIIJ(0.0f, 0.89f, 1.0f, 1.43f, 1.76f, 0.95f);
        this.LIZJ.LJIIL(6.14f, -3.82f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
