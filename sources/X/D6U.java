package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6U extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6U() {
        this.LIZJ.LJIIIIZZ(19.95f, 6.8f);
        C32856Cuy.S7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(8.07f, 36.18f);
        this.LIZJ.LJIIJ(1.2f, -4.85f, 4.16f, -7.8f, 7.54f, -9.12f);
        this.LIZJ.LJIIIZ(12.45f, 12.45f, false, true, 10.37f, 0.64f);
        this.LIZJ.LJIIJ(0.2f, 0.1f, 0.44f, 0.05f, 0.55f, -0.14f);
        this.LIZJ.LJIIL(0.6f, -1.04f);
        this.LIZJ.LJIIIZ(0.4f, 0.4f, false, false, -0.14f, -0.54f);
        this.LIZJ.LJIIJ(-3.64f, -2.0f, -8.15f, -2.33f, -12.1f, -0.78f);
        this.LIZJ.LJIIJ(-4.03f, 1.57f, -7.42f, 5.05f, -8.77f, 10.54f);
        this.LIZJ.LJIIIZ(0.4f, 0.4f, false, false, 0.3f, 0.48f);
        this.LIZJ.LJIIL(1.17f, 0.26f);
        this.LIZJ.LJIIIZ(0.4f, 0.4f, false, false, 0.48f, -0.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(35.0f, 36.0f);
        C32856Cuy.l0(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(0.0f, -2.0f);
        this.LIZJ.LJIIIZ(1.2f, 1.2f, true, true, 0.0f, -2.4f);
        this.LIZJ.LJIIIZ(1.2f, 1.2f, false, true, 0.0f, 2.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(35.4f, 25.03f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.8f, 0.0f);
        dij.LJIIL(-6.2f, 3.54f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.4f, 0.7f);
        dij.LJIILL(7.07f);
        dij.LJIIJ(0.0f, 0.28f, 0.15f, 0.55f, 0.4f, 0.69f);
        dij.LJIIL(6.2f, 3.54f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, 0.8f, 0.0f);
        dij.LJIIL(6.2f, -3.54f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, 0.4f, -0.7f);
        dij.LJIILL(-7.07f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.4f, -0.69f);
        dij.LJIIL(-6.2f, -3.54f);
        dij.LIZLLL();
        dij.LJIILIIL(-0.6f, 1.9f);
        dij.LJIIIZ(0.4f, 0.4f, false, true, 0.4f, 0.0f);
        dij.LJIIL(4.6f, 2.75f);
        dij.LJIIJ(0.13f, 0.08f, 0.2f, 0.2f, 0.2f, 0.35f);
        dij.LJIILL(5.54f);
        dij.LJIIIZ(0.4f, 0.4f, false, true, -0.2f, 0.35f);
        dij.LJIIL(-4.6f, 2.76f);
        dij.LJIIIZ(0.4f, 0.4f, false, true, -0.4f, 0.0f);
        dij.LJIIL(-4.6f, -2.76f);
        dij.LJIIIZ(0.4f, 0.4f, false, true, -0.2f, -0.35f);
        dij.LJIILL(-5.54f);
        dij.LJIIIZ(0.4f, 0.4f, false, true, 0.2f, -0.35f);
        dij.LJIIL(4.6f, -2.76f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
