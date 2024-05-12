package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8I extends AbstractC39455Fe7 {
    public D8I() {
        this.LIZJ.LJIIIIZZ(23.0f, 8.0f);
        this.LIZJ.LJIILL(20.78f);
        this.LIZJ.LJIIL(-10.96f, -9.7f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.7f, 0.05f);
        this.LIZJ.LJIIL(-0.67f, 0.74f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.04f, 0.71f);
        this.LIZJ.LJIIL(12.63f, 11.17f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.32f, 0.0f);
        this.LIZJ.LJII(37.3f, 20.58f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.04f, -0.7f);
        this.LIZJ.LJIIL(-0.66f, -0.75f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, false, -0.7f, -0.05f);
        this.LIZJ.LJII(25.0f, 28.78f);
        C32856Cuy.f(this.LIZJ);
        C32856Cuy.H3(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.5f, 37.0f);
        C32856Cuy.LLFFF(this.LIZJ);
        C32856Cuy.LJIJJLI(this.LIZJ);
        C32856Cuy.Dc(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-23.0f);
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
