package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cws, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32974Cws extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32974Cws() {
        this.LIZJ.LJIIIIZZ(41.08f, 16.0f);
        C32856Cuy.ki(this.LIZJ);
        this.LIZJ.LJIILL(22.95f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -3.39f, 1.43f);
        this.LIZJ.LJIIL(-5.13f, -4.95f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.7f, -0.27f);
        this.LIZJ.LJI(20.09f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, true, 15.15f, 36.0f);
        C32856Cuy.H6(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, 11.0f, -11.0f);
        C32856Cuy.LJL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(0.08f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16595489);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.11f, 2.09f);
        C32856Cuy.im(dij);
        dij.LJIIJJI(18.21f);
        C32856Cuy.ch(dij);
        dij.LJIJ(8.1f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        dij.LJI(8.11f);
        dij.LIZLLL();
        dij.LJIILIIL(13.92f, 21.36f);
        dij.LJIIJ(0.0f, 1.22f, -0.73f, 2.2f, -2.56f, 2.2f);
        dij.LJIIJ(-1.82f, 0.0f, -2.55f, -0.98f, -2.55f, -2.2f);
        dij.LJIIJ(0.0f, -1.22f, 0.73f, -2.21f, 2.55f, -2.21f);
        dij.LJIIJ(1.83f, 0.0f, 2.56f, 0.99f, 2.56f, 2.2f);
        dij.LIZLLL();
        dij.LJIILIIL(-5.3f, -10.3f);
        dij.LJIIJ(0.0f, 0.4f, -0.32f, 0.73f, -0.7f, 0.73f);
        dij.LJIIJJI(-2.25f);
        dij.LJIIJ(-0.4f, 0.0f, -0.7f, -0.33f, -0.7f, -0.73f);
        dij.LJIIJ(0.0f, -3.46f, 3.36f, -5.5f, 6.42f, -5.5f);
        dij.LJIILJJIL(6.43f, 2.04f, 6.43f, 5.5f, true);
        dij.LJIIJ(0.0f, 2.86f, -2.25f, 4.9f, -4.52f, 5.58f);
        dij.LJIIIZ(0.42f, 0.42f, false, false, -0.08f, 0.04f);
        dij.LJIILL(0.13f);
        dij.LJIIJ(0.0f, 0.43f, -0.34f, 0.78f, -0.76f, 0.78f);
        dij.LJIIJJI(-2.14f);
        dij.LJIIIZ(0.77f, 0.77f, false, true, -0.76f, -0.78f);
        dij.LJIILL(-0.3f);
        dij.LJIIJ(0.0f, -1.92f, 1.49f, -3.1f, 2.71f, -3.47f);
        dij.LJIIJ(1.27f, -0.38f, 1.9f, -1.32f, 1.9f, -1.98f);
        dij.LJIIJ(0.0f, -1.28f, -1.81f, -1.75f, -2.78f, -1.75f);
        dij.LJIIJ(-0.97f, 0.0f, -2.77f, 0.47f, -2.77f, 1.75f);
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
