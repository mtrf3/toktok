package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1Y extends AbstractC39455Fe7 {
    public D1Y() {
        this.LIZJ.LJIIIIZZ(11.0f, 6.64f);
        this.LIZJ.LIZJ(2.64f, 2.64f, false, true, 13.64f, 4.0f);
        this.LIZJ.LJIIJJI(20.72f);
        this.LIZJ.LIZJ(2.64f, 2.64f, false, true, 37.0f, 6.64f);
        C32856Cuy.i9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 4.52f, -2.3f, 8.5f, -5.81f, 10.83f);
        this.LIZJ.LIZJ(15.0f, 15.0f, false, true, 39.0f, 35.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(6.16f);
        this.LIZJ.LIZJ(2.84f, 2.84f, false, true, 36.16f, 44.0f);
        this.LIZJ.LJI(11.84f);
        this.LIZJ.LIZJ(2.84f, 2.84f, false, true, 9.0f, 41.16f);
        C32856Cuy.I9(this.LIZJ);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, true, 7.81f, -13.17f);
        this.LIZJ.LIZJ(12.99f, 12.99f, false, true, 11.0f, 11.0f);
        this.LIZJ.LJIJ(6.64f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 20.0f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, false, 9.0f, -9.0f);
        C32856Cuy.f(this.LIZJ);
        C32856Cuy.r6(this.LIZJ);
        C32856Cuy.B1(this.LIZJ);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, false, 9.0f, 9.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.J0(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, -11.0f, 11.0f);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.LJIJJ(this.LIZJ);
        C32856Cuy.LJJLL(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, -11.0f, -11.0f);
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
