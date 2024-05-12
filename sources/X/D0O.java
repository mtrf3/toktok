package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0O extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0O() {
        C32856Cuy.Ld(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-1);
        this.LIZIZ.setAlpha(51);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(27.36f, 12.72f);
        C32856Cuy.fk(dij);
        dij.LJIIJJI(-4.85f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.95f, 0.69f);
        dij.LJIIL(-7.4f, 22.63f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.47f, 0.65f);
        dij.LJIIJJI(3.08f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.96f, -0.71f);
        dij.LJIIL(1.64f, -5.51f);
        dij.LJIIJJI(9.28f);
        dij.LJIIL(1.64f, 5.5f);
        C32856Cuy.Kk(dij);
        dij.LJIIJJI(3.05f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.48f, -0.65f);
        I9A.LIZIZ(dij, -7.41f, -22.63f, 0.27f, 13.66f);
        dij.LJIIJJI(-7.26f);
        dij.LJIIL(3.53f, -11.83f);
        dij.LJIIJJI(0.2f);
        dij.LJIIL(3.53f, 11.83f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
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
