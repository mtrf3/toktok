package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8C extends AbstractC39455Fe7 {
    public D8C() {
        this.LIZJ.LJIILIIL(3.59f, 17.42f);
        this.LIZJ.LJIIL(1.4f, -1.09f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.25f, 0.02f);
        this.LIZJ.LJIIL(4.54f, 3.76f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.32f, 0.89f);
        this.LIZJ.LJI(4.82f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.23f, -3.58f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.5f, 22.3f);
        C32856Cuy.t9(this.LIZJ);
        C32856Cuy.Tm(this.LIZJ);
        this.LIZJ.LJIIL(-8.35f, 6.51f);
        this.LIZJ.LJIIL(-3.1f, -2.56f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, -1.4f, 0.14f);
        this.LIZJ.LJII(7.44f, 9.64f);
        this.LIZJ.LJIIJ(-0.35f, 0.42f, -0.28f, 1.06f, 0.14f, 1.41f);
        this.LIZJ.LJII(39.36f, 37.4f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, 1.4f, -0.14f);
        this.LIZJ.LJIIL(2.5f, -3.09f);
        this.LIZJ.LJIIJ(0.34f, -0.43f, 0.28f, -1.06f, -0.15f, -1.41f);
        this.LIZJ.LJII(30.5f, 22.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.5f, 26.75f);
        this.LIZJ.LJIIJ(0.0f, -0.42f, 0.5f, -0.65f, 0.82f, -0.38f);
        this.LIZJ.LJIIL(11.82f, 9.8f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.36f, 0.76f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(44.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-9.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        this.LIZJ.LJIJ(26.75f);
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
