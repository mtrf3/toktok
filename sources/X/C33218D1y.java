package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33218D1y extends AbstractC39455Fe7 {
    public C33218D1y() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(5.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        p2.LJIIJJI(24.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, 5.0f);
        this.LIZJ.LJIILL(12.99f);
        this.LIZJ.LJIIJ(0.0f, 0.6f, -0.54f, 1.07f, -1.15f, 1.04f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, false, -13.33f, 20.33f);
        this.LIZJ.LJIIJ(0.37f, 0.72f, -0.12f, 1.64f, -0.93f, 1.64f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(10.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.S9(this.LIZJ);
        this.LIZJ.LJIILIIL(22.73f, 7.34f);
        C32856Cuy.Rl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(47.0f, 36.0f);
        C32856Cuy.w4(this.LIZJ);
        this.LIZJ.LJIILIIL(-4.93f, -2.24f);
        C32856Cuy.w8(this.LIZJ);
        this.LIZJ.LJII(37.0f, 33.17f);
        this.LIZJ.LJIIL(-2.24f, -2.24f);
        C32856Cuy.Xk(this.LIZJ);
        this.LIZJ.LJII(34.17f, 36.0f);
        this.LIZJ.LJIIL(-2.24f, 2.24f);
        C32856Cuy.kd(this.LIZJ);
        this.LIZJ.LJII(37.0f, 38.83f);
        this.LIZJ.LJIIL(2.24f, 2.24f);
        C32856Cuy.xd(this.LIZJ);
        this.LIZJ.LJII(39.83f, 36.0f);
        this.LIZJ.LJIIL(2.24f, -2.24f);
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
