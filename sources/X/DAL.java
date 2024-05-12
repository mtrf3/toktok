package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAL extends AbstractC39455Fe7 {
    public DAL() {
        this.LIZJ.LJIIIIZZ(19.0f, 8.84f);
        this.LIZJ.LJIILL(26.75f);
        this.LIZJ.LJIIL(10.0f, 3.57f);
        this.LIZJ.LJIJ(12.41f);
        this.LIZJ.LJII(19.0f, 8.84f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(14.0f, 3.64f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(26.81f);
        p.LJIIL(9.0f, -2.77f);
        this.LIZJ.LJIJ(9.71f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-9.0f, 2.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.35f, 31.41f);
        this.LIZJ.LJIIL(12.94f, -3.98f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 46.0f, 38.0f);
        C32856Cuy.e(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.59f, -1.91f);
        this.LIZJ.LJIIL(-12.36f, 3.8f);
        this.LIZJ.LJIIL(-13.32f, -4.75f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.32f, -0.05f);
        this.LIZJ.LJIIL(-13.0f, 4.0f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 2.0f, 10.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(31.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.59f, 1.91f);
        this.LIZJ.LJIIL(12.36f, -3.8f);
        this.LIZJ.LJIIL(13.38f, 4.77f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.32f, 0.01f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.0f, 35.52f);
        this.LIZJ.LJIJ(8.71f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-9.0f, 2.77f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(26.81f);
        p5.LJIIL(9.0f, -2.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
