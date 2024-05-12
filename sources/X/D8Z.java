package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8Z extends AbstractC39455Fe7 {
    public D8Z() {
        this.LIZJ.LJIIIIZZ(42.66f, 8.05f);
        this.LIZJ.LJIIIZ(2.05f, 2.05f, false, false, -2.83f, -1.9f);
        this.LIZJ.LJII(9.51f, 18.64f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-1.66f);
        this.LIZJ.LJIIIZ(0.97f, 0.97f, false, false, -0.98f, -0.97f);
        this.LIZJ.LJI(6.48f);
        this.LIZJ.LJIIIZ(0.97f, 0.97f, false, false, -0.98f, 0.97f);
        C32856Cuy.F9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.54f, 0.44f, 0.97f, 0.97f, 0.97f);
        C32856Cuy.Db(this.LIZJ);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 0.98f, -0.43f, 0.98f, -0.97f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-1.3f);
        this.LIZJ.LJIIL(5.74f, 2.18f);
        this.LIZJ.LJIIIZ(9.25f, 9.25f, false, false, 7.83f, 9.82f);
        this.LIZJ.LJIIL(0.22f, 0.04f);
        this.LIZJ.LJIIIZ(10.2f, 10.2f, false, false, 9.16f, -3.29f);
        this.LIZJ.LJIIL(7.42f, 2.84f);
        this.LIZJ.LJIIIZ(2.05f, 2.05f, false, false, 2.78f, -1.91f);
        this.LIZJ.LJIJ(8.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-14.3f, 29.84f);
        this.LIZJ.LJIIIZ(6.3f, 6.3f, false, true, -4.47f, 1.0f);
        this.LIZJ.LJIIL(-0.21f, -0.04f);
        this.LIZJ.LJIIIZ(5.38f, 5.38f, false, true, -4.5f, -4.46f);
        this.LIZJ.LJIIL(9.18f, 3.5f);
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
