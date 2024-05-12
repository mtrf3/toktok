package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D26 extends AbstractC39455Fe7 {
    public D26() {
        this.LIZJ.LJIIIIZZ(42.0f, 9.0f);
        C32856Cuy.k8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(19.44f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -2.3f, 4.48f);
        this.LIZJ.LJIIL(-10.0f, 7.14f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -6.4f, 0.0f);
        this.LIZJ.LJIIL(-10.0f, -7.14f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -2.3f, -4.48f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(9.5f);
        C32856Cuy.LIZLLL(this.LIZJ);
        this.LIZJ.LIZJ(0.5f, 0.5f, false, true, 6.0f, 9.0f);
        C32856Cuy.e(this.LIZJ);
        C32856Cuy.J1(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(35.0f);
        C32856Cuy.LJJJJI(this.LIZJ);
        this.LIZJ.LJIILIIL(-30.5f, 0.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(19.44f);
        this.LIZJ.LJIIJ(0.0f, 0.8f, 0.39f, 1.57f, 1.05f, 2.04f);
        this.LIZJ.LJIIL(10.0f, 7.14f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 2.9f, 0.0f);
        this.LIZJ.LJIIL(10.0f, -7.14f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 1.05f, -2.04f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(9.5f);
        C32856Cuy.sb(this.LIZJ);
        this.LIZJ.LJIILIIL(14.07f, 4.86f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, -3.14f, 0.0f);
        this.LIZJ.LJIIL(-1.61f, 3.26f);
        this.LIZJ.LJIIL(-3.6f, 0.53f);
        this.LIZJ.LJIIJ(-1.44f, 0.2f, -2.01f, 1.97f, -0.98f, 2.98f);
        this.LIZJ.LJIIL(2.61f, 2.54f);
        this.LIZJ.LJIIL(-0.61f, 3.6f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, 2.54f, 1.84f);
        this.LIZJ.LJII(24.0f, 27.4f);
        this.LIZJ.LJIIL(3.22f, 1.7f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, 2.54f, -1.85f);
        this.LIZJ.LJIIL(-0.61f, -3.59f);
        this.LIZJ.LJIIL(2.6f, -2.54f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, -0.96f, -2.98f);
        this.LIZJ.LJIIL(-3.6f, -0.53f);
        this.LIZJ.LJIIL(-1.62f, -3.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.68f, 4.72f);
        this.LIZJ.LJII(24.0f, 16.82f);
        this.LIZJ.LJIIL(1.11f, 2.26f);
        this.LIZJ.LJIIJ(0.26f, 0.52f, 0.75f, 0.88f, 1.32f, 0.96f);
        this.LIZJ.LJIIL(2.5f, 0.36f);
        this.LIZJ.LJIIL(-1.81f, 1.76f);
        this.LIZJ.LJIIJ(-0.41f, 0.4f, -0.6f, 0.98f, -0.5f, 1.55f);
        this.LIZJ.LJIIL(0.42f, 2.48f);
        this.LIZJ.LJIIL(-2.23f, -1.17f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, -1.62f, 0.0f);
        this.LIZJ.LJIIL(-2.23f, 1.17f);
        this.LIZJ.LJIIL(0.42f, -2.48f);
        this.LIZJ.LJIIJ(0.1f, -0.57f, -0.09f, -1.15f, -0.5f, -1.55f);
        this.LIZJ.LJIIL(-1.8f, -1.76f);
        this.LIZJ.LJIIL(2.49f, -0.36f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, false, 1.32f, -0.96f);
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
