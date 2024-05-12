package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D84 extends AbstractC39455Fe7 {
    public D84() {
        this.LIZJ.LJIIIIZZ(36.68f, 5.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(11.32f);
        C32856Cuy.LLILII(this.LIZJ);
        this.LIZJ.LJ(3.0f, 11.86f, 3.0f, 12.77f, 3.0f, 13.82f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(20.36f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 1.05f, 0.0f, 1.96f, 0.06f, 2.71f);
        p3.LJIIJ(0.07f, 0.8f, 0.2f, 1.58f, 0.6f, 2.33f);
        p3.LJIIIZ(6.0f, 6.0f, false, false, 2.62f, 2.63f);
        p3.LJIIIZ(6.1f, 6.1f, false, false, 2.33f, 0.59f);
        p3.LJIIJ(0.75f, 0.06f, 1.66f, 0.06f, 2.71f, 0.06f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(25.36f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(1.05f, 0.0f, 1.96f, 0.0f, 2.71f, -0.06f);
        p5.LJIIIZ(6.1f, 6.1f, false, false, 2.33f, -0.6f);
        p5.LJIIIZ(6.0f, 6.0f, false, false, 2.63f, -2.62f);
        p5.LJIIIZ(6.1f, 6.1f, false, false, 0.59f, -2.33f);
        p5.LJIIJ(0.06f, -0.75f, 0.06f, -1.66f, 0.06f, -2.71f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(13.82f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(0.0f, -1.05f, 0.0f, -1.96f, -0.06f, -2.71f);
        p7.LJIIIZ(6.1f, 6.1f, false, false, -0.6f, -2.33f);
        p7.LJIIIZ(6.0f, 6.0f, false, false, -2.62f, -2.63f);
        p7.LJIIIZ(6.1f, 6.1f, false, false, -2.33f, -0.59f);
        this.LIZJ.LJIIJ(-0.75f, -0.06f, -1.66f, -0.06f, -2.71f, -0.06f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.0f, 29.29f);
        this.LIZJ.LJIILL(4.81f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJ(0.0f, 1.15f, 0.0f, 1.9f, 0.05f, 2.46f);
        p9.LJIIJ(0.04f, 0.55f, 0.12f, 0.75f, 0.17f, 0.85f);
        p9.LJIIJ(0.19f, 0.37f, 0.5f, 0.68f, 0.87f, 0.87f);
        p9.LJIIJ(0.1f, 0.05f, 0.3f, 0.13f, 0.85f, 0.17f);
        p9.LJIIIZ(34.0f, 34.0f, false, false, 2.46f, 0.05f);
        this.LIZJ.LJIIJJI(19.69f);
        this.LIZJ.LJII(17.67f, 24.45f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -5.71f, -0.08f);
        this.LIZJ.LJII(7.0f, 29.29f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.0f, 18.5f);
        C32856Cuy.LLJZIJLIL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
