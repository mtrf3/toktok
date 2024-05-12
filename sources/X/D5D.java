package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5D extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5D() {
        this.LIZJ.LJIIIIZZ(35.2f, 25.96f);
        this.LIZJ.LJIIJ(-0.03f, 0.07f, -0.07f, 0.2f, -0.14f, 0.5f);
        this.LIZJ.LJIIL(-0.08f, 0.28f);
        this.LIZJ.LJIIL(-0.32f, 1.13f);
        this.LIZJ.LJIIIZ(13.75f, 13.75f, false, true, -8.76f, 8.89f);
        this.LIZJ.LJIIL(-1.13f, 0.33f);
        this.LIZJ.LJIIL(-0.32f, 0.1f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, false, 0.0f, 1.62f);
        this.LIZJ.LJIIL(0.32f, 0.1f);
        this.LIZJ.LJIIL(1.13f, 0.33f);
        this.LIZJ.LJIIIZ(13.75f, 13.75f, false, true, 9.08f, 10.02f);
        this.LIZJ.LJIIL(0.08f, 0.29f);
        this.LIZJ.LJIIL(0.14f, 0.49f);
        this.LIZJ.LJIIJ(0.31f, 0.69f, 1.29f, 0.69f, 1.6f, 0.0f);
        this.LIZJ.LJIIJ(0.03f, -0.07f, 0.07f, -0.2f, 0.14f, -0.5f);
        this.LIZJ.LJIIL(0.08f, -0.28f);
        this.LIZJ.LJIIL(0.32f, -1.13f);
        this.LIZJ.LJIIIZ(13.75f, 13.75f, false, true, 9.89f, -9.22f);
        this.LIZJ.LJIIL(0.32f, -0.1f);
        this.LIZJ.LJIIIZ(0.88f, 0.88f, false, false, 0.0f, -1.62f);
        this.LIZJ.LJIIL(-0.32f, -0.1f);
        this.LIZJ.LJIIL(-1.13f, -0.33f);
        this.LIZJ.LJIIIZ(13.75f, 13.75f, false, true, -9.08f, -10.02f);
        this.LIZJ.LJIIL(-0.08f, -0.29f);
        this.LIZJ.LJIIL(-0.14f, -0.49f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, false, -1.6f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(46.02f, 10.0f);
        dij.LJI(25.98f);
        dij.LJIIIZ(4.36f, 4.36f, false, false, -4.26f, 3.4f);
        dij.LJIIL(-0.6f, 3.53f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.98f, 0.83f);
        dij.LJIIJJI(-7.41f);
        dij.LIZJ(8.72f, 8.72f, false, false, 4.0f, 26.47f);
        dij.LJIILL(27.09f);
        dij.LJIIJ(0.0f, 4.8f, 3.9f, 8.7f, 8.73f, 8.7f);
        dij.LJIIJJI(46.54f);
        dij.LJIIJ(4.82f, 0.0f, 8.73f, -3.9f, 8.73f, -8.7f);
        dij.LJIJ(26.47f);
        dij.LJIIJ(0.0f, -4.8f, -3.9f, -8.7f, -8.73f, -8.7f);
        dij.LJIIJJI(-7.41f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.99f, -0.84f);
        dij.LJIIL(-0.59f, -3.52f);
        dij.LJIIJ(-0.44f, -2.0f, -2.21f, -3.41f, -4.26f, -3.41f);
        dij.LIZLLL();
        dij.LJIILIIL(-21.94f, 7.43f);
        dij.LJIIL(0.58f, -3.42f);
        dij.LJIIJ(0.16f, -0.6f, 0.7f, -1.01f, 1.32f, -1.01f);
        dij.LJIIJJI(20.04f);
        dij.LJIIJ(0.63f, 0.0f, 1.16f, 0.42f, 1.32f, 1.0f);
        dij.LJIIL(0.58f, 3.43f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 3.94f, 3.33f);
        dij.LJIIJJI(7.41f);
        dij.LIZJ(5.72f, 5.72f, false, true, 65.0f, 26.47f);
        dij.LJIILL(27.09f);
        dij.LJIIJ(0.0f, 3.14f, -2.56f, 5.7f, -5.73f, 5.7f);
        dij.LJI(12.73f);
        dij.LIZJ(5.72f, 5.72f, false, true, 7.0f, 53.57f);
        dij.LJIJ(26.47f);
        dij.LJIIJ(0.0f, -3.14f, 2.56f, -5.7f, 5.73f, -5.7f);
        dij.LJIIJJI(7.41f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 3.94f, -3.34f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
