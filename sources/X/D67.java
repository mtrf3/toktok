package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D67 extends AbstractC39455Fe7 {
    public D67() {
        this.LIZJ.LJIIIIZZ(3.0f, 8.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(3.9f);
        this.LIZJ.LJIIL(5.65f, 25.43f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 14.5f, 35.0f);
        C32856Cuy.O6(this.LIZJ);
        C32856Cuy.xa(this.LIZJ);
        this.LIZJ.LJI(16.1f);
        this.LIZJ.LJII(15.0f, 26.0f);
        C32856Cuy.LJIJJLI(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.9f, -1.37f);
        this.LIZJ.LJIIL(4.0f, -12.0f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 42.0f, 10.0f);
        this.LIZJ.LJI(11.44f);
        this.LIZJ.LJIIL(-0.99f, -4.43f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 8.5f, 4.0f);
        C32856Cuy.LLLII(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.0f, 45.0f);
        C32856Cuy.Gf(this.LIZJ);
        this.LIZJ.LJIIIIZZ(39.0f, 41.0f);
        C32856Cuy.g5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
