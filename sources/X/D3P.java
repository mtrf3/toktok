package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3P extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3P() {
        this.LIZJ.LJIIIIZZ(39.0f, 15.12f);
        this.LIZJ.LJIJ(29.1f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(10.0f, 10.0f, false, true, -10.0f, 10.0f);
        this.LIZJ.LJI(15.02f);
        this.LIZJ.LJIIJ(0.05f, 1.64f, 0.2f, 2.7f, 0.64f, 3.57f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, false, 2.67f, 2.67f);
        this.LIZJ.LJIIJ(1.3f, 0.66f, 3.01f, 0.66f, 6.43f, 0.66f);
        this.LIZJ.LJIIJJI(11.38f);
        this.LIZJ.LJIIJ(3.42f, 0.0f, 5.12f, 0.0f, 6.43f, -0.66f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, false, 2.66f, -2.67f);
        this.LIZJ.LJIIJ(0.67f, -1.3f, 0.67f, -3.01f, 0.67f, -6.43f);
        this.LIZJ.LJIJ(24.86f);
        this.LIZJ.LJIIJ(0.0f, -3.42f, 0.0f, -5.12f, -0.66f, -6.43f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, false, -2.67f, -2.67f);
        this.LIZJ.LJIIJ(-0.88f, -0.44f, -1.94f, -0.59f, -3.57f, -0.64f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16595489);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(35.0f, 8.19f);
        dij.LIZJ(6.19f, 6.19f, false, false, 28.8f, 2.0f);
        dij.LJI(8.2f);
        dij.LIZJ(6.19f, 6.19f, false, false, 2.0f, 8.19f);
        dij.LJIJ(28.8f);
        dij.LIZJ(6.19f, 6.19f, false, false, 8.19f, 35.0f);
        dij.LJI(28.8f);
        dij.LIZJ(6.19f, 6.19f, false, false, 35.0f, 28.81f);
        dij.LJIJ(8.2f);
        dij.LIZLLL();
        dij.LJIILIIL(-8.71f, 5.26f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.28f, -1.39f);
        dij.LJIIL(-1.66f, -1.1f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.39f, 0.27f);
        dij.LJIIL(-6.1f, 9.15f);
        dij.LJIIL(-3.02f, -3.36f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.4f, -0.07f);
        dij.LJIIL(-1.5f, 1.33f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.07f, 1.41f);
        dij.LJIIL(4.74f, 5.29f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 3.15f, -0.23f);
        dij.LJIIL(7.53f, -11.3f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-49299);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
