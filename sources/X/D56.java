package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D56 extends AbstractC39455Fe7 {
    public D56() {
        this.LIZJ.LJIIIIZZ(43.0f, 8.94f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.15f, -0.99f);
        this.LIZJ.LJIIL(-8.0f, 1.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.85f, 0.99f);
        C32856Cuy.B9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.5f, 6.5f, true, false, 6.5f, 6.5f);
        this.LIZJ.LJIJ(16.15f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, true, 0.43f, -0.5f);
        this.LIZJ.LJIIL(4.89f, -0.73f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(0.8f, 0.8f, false, false, 0.68f, -0.79f);
        C78269Unh.LIZJ(this.LIZJ, "p", -5.2f);
        this.LIZJ.LJIIIIZZ(28.0f, 13.0f);
        C32856Cuy.Ze(this.LIZJ);
        C32856Cuy.LJIJI(this.LIZJ);
        C32856Cuy.tk(this.LIZJ);
        this.LIZJ.LJIILIIL(-5.0f, 8.0f);
        C32856Cuy.Ze(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(15.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.0f, 8.0f);
        C32856Cuy.Ze(this.LIZJ);
        C32856Cuy.Vh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
