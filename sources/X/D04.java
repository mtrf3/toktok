package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D04 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D04() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16726295);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(13.17f, 18.9f);
        dij.LJII(9.3f, 22.78f);
        dij.LIZJ(11.26f, 11.26f, false, false, 25.23f, 38.7f);
        dij.LJIIL(3.86f, -3.87f);
        C32856Cuy.W1(dij);
        dij.LJIIL(-1.6f, -1.61f);
        dij.LJIIIZ(1.46f, 1.46f, false, false, -2.07f, 0.0f);
        dij.LJIIL(-3.87f, 3.87f);
        dij.LJIIIZ(6.06f, 6.06f, true, true, -8.58f, -8.58f);
        dij.LJIIL(3.87f, -3.87f);
        C32856Cuy.W1(dij);
        dij.LJIIL(-1.61f, -1.61f);
        dij.LJIIIZ(1.46f, 1.46f, false, false, -2.06f, 0.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(34.83f, 29.1f);
        dij.LJIIJ(-0.57f, 0.56f, -1.5f, 0.56f, -2.06f, 0.0f);
        dij.LJIIL(-1.61f, -1.62f);
        dij.LJIIIZ(1.46f, 1.46f, false, true, 0.0f, -2.06f);
        dij.LJIIL(3.87f, -3.87f);
        dij.LJIIIZ(6.06f, 6.06f, true, false, -8.58f, -8.58f);
        dij.LJIIL(-3.87f, 3.87f);
        dij.LJIIJ(-0.57f, 0.57f, -1.5f, 0.57f, -2.06f, 0.0f);
        dij.LJIIL(-1.61f, -1.61f);
        dij.LJIIIZ(1.46f, 1.46f, false, true, 0.0f, -2.06f);
        dij.LJIIL(3.86f, -3.87f);
        dij.LIZJ(11.26f, 11.26f, false, true, 38.7f, 25.23f);
        dij.LJIIL(-3.87f, 3.86f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(18.3f, 26.03f);
        dij2.LJIIJ(-0.58f, 0.57f, -0.58f, 1.5f, 0.0f, 2.06f);
        dij2.LJIIL(1.6f, 1.62f);
        dij2.LJIIJ(0.58f, 0.57f, 1.5f, 0.57f, 2.07f, 0.0f);
        dij2.LJIIL(7.74f, -7.74f);
        C32856Cuy.W1(dij2);
        dij2.LJIIL(-1.62f, -1.62f);
        dij2.LJIIIZ(1.46f, 1.46f, false, false, -2.06f, 0.0f);
        dij2.LJIIL(-7.74f, 7.74f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
