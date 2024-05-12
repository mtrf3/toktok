package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8O extends AbstractC39455Fe7 {
    public D8O() {
        this.LIZJ.LJIIIIZZ(10.9f, 7.7f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.95f, 0.72f);
        this.LIZJ.LJIIL(-8.9f, 30.45f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, false, 2.0f, 40.15f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(4.07f);
        C32856Cuy.F5(this.LIZJ);
        this.LIZJ.LJIIJJI(11.05f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.9f, 7.22f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.97f, 0.74f);
        this.LIZJ.LJIIJJI(4.06f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 0.96f, -1.28f);
        this.LIZJ.LJII(18.94f, 8.42f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, -0.96f, -0.71f);
        DIL.LIZ(this.LIZJ, "p", 10.9f);
        this.LIZJ.LJIILIIL(7.75f, 19.38f);
        this.LIZJ.LJIIJJI(-8.37f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(4.08f, -15.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(0.2f);
        this.LIZJ.LJIIL(4.09f, 15.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(32.67f, 39.5f);
        C32856Cuy.T4(this.LIZJ);
        this.LIZJ.LJIIIIZZ(42.27f, 39.5f);
        C32856Cuy.T4(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
