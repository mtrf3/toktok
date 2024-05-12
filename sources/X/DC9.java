package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC9 extends AbstractC39455Fe7 {
    public DC9() {
        this.LIZJ.LJIIIIZZ(16.37f, 8.14f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 3.8f, -2.75f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.35f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 3.8f, 2.75f);
        this.LIZJ.LJIIL(9.79f, 29.6f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 37.3f, 43.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-5.2f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -3.84f, -2.83f);
        this.LIZJ.LJIIL(-1.54f, -5.07f);
        this.LIZJ.LJIIJJI(-5.76f);
        this.LIZJ.LJIIL(-1.55f, 5.07f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 15.6f, 43.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-5.2f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -3.8f, -5.25f);
        this.LIZJ.LJIIL(9.78f, -29.61f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 31.1f);
        this.LIZJ.LJIIJJI(11.7f);
        this.LIZJ.LJIIL(2.18f, 7.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.96f, 0.7f);
        this.LIZJ.LJIIJJI(3.78f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.47f, -0.66f);
        this.LIZJ.LJIIL(-9.34f, -28.26f);
        C32856Cuy.fk(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-5.9f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, -0.95f, 0.69f);
        this.LIZJ.LJII(10.6f, 38.34f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.48f, 0.66f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(3.77f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.96f, -0.7f);
        this.LIZJ.LJIIL(2.2f, -7.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.2f, -3.94f);
        this.LIZJ.LJIIJJI(9.29f);
        this.LIZJ.LJIIL(-4.54f, -14.87f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-0.2f);
        this.LIZJ.LJII(19.2f, 27.16f);
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
