package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8A extends AbstractC39455Fe7 {
    public D8A() {
        this.LIZJ.LJIIIIZZ(28.46f, 7.27f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.39f, 0.02f);
        this.LIZJ.LJII(8.3f, 26.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -0.29f, 0.7f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(34.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        this.LIZJ.LJIIJJI(6.74f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.7f, -0.3f);
        this.LIZJ.LJIIL(19.27f, -19.25f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.03f, -1.44f);
        this.LIZJ.LJIIL(-7.22f, -6.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.0f, 27.19f);
        this.LIZJ.LJII(27.8f, 9.4f);
        this.LIZJ.LJIIL(5.76f, 5.38f);
        this.LIZJ.LJII(15.33f, 33.0f);
        C32856Cuy.l6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-5.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.5f, 38.0f);
        C32856Cuy.LLFFF(this.LIZJ);
        C32856Cuy.LJJIIJ(this.LIZJ);
        C32856Cuy.Dc(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-31.0f);
        p4.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
