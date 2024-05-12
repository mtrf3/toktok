package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33296D4y extends AbstractC39455Fe7 {
    public C33296D4y() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 4.5f);
        C32856Cuy.e5(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.6f);
        this.LIZJ.LIZJ(12.0f, 12.0f, false, true, 36.0f, 20.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(6.34f);
        this.LIZJ.LJIIJ(0.0f, 0.18f, 0.1f, 0.34f, 0.25f, 0.43f);
        this.LIZJ.LJIIL(1.61f, 0.92f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, true, 1.74f, 2.66f);
        this.LIZJ.LJIIL(0.14f, 1.26f);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, true, 36.27f, 36.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(28.5f);
        this.LIZJ.LJIIIZ(4.5f, 4.5f, true, true, -9.0f, 0.0f);
        this.LIZJ.LJIIJJI(-7.77f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, true, -3.47f, -3.89f);
        this.LIZJ.LJIIL(0.14f, -1.26f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, true, 1.74f, -2.66f);
        this.LIZJ.LJIIL(1.6f, -0.92f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.26f, -0.43f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(20.5f);
        this.LIZJ.LIZJ(12.0f, 12.0f, false, true, 22.5f, 8.6f);
        C32856Cuy.d(this.LIZJ);
        C32856Cuy.Hj(this.LIZJ);
        this.LIZJ.LJIIIIZZ(22.5f, 36.0f);
        C32856Cuy.Ol(this.LIZJ);
        C32856Cuy.U(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIIZZ(24.0f, 11.5f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, false, -9.0f, 9.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(6.34f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, true, -1.76f, 3.04f);
        this.LIZJ.LJIIL(-1.61f, 0.92f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.25f, 0.38f);
        this.LIZJ.LJIIL(-0.14f, 1.26f);
        this.LIZJ.LJIIJ(-0.04f, 0.3f, 0.2f, 0.56f, 0.5f, 0.56f);
        this.LIZJ.LJIIJJI(24.53f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.56f);
        this.LIZJ.LJIIL(-0.15f, -1.26f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.25f, -0.38f);
        this.LIZJ.LJIIL(-1.6f, -0.92f);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, true, 33.0f, 26.84f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(20.5f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(9.0f, 9.0f, false, false, -9.0f, -9.0f);
        p10.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
