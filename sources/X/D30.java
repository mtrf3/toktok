package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D30 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D30() {
        this.LIZJ.LJIIIIZZ(39.0f, 20.93f);
        this.LIZJ.LJIIJ(0.0f, 6.18f, -3.9f, 10.27f, -7.19f, 13.53f);
        this.LIZJ.LJ(30.45f, 35.82f, 24.0f, 42.0f, 24.0f, 42.0f);
        this.LIZJ.LJIILJJIL(-6.48f, -6.2f, -7.81f, -7.54f, true);
        this.LIZJ.LJ(13.69f, 31.97f, 9.0f, 27.11f, 9.0f, 20.93f);
        this.LIZJ.LJ(9.0f, 12.68f, 15.72f, 6.0f, 24.0f, 6.0f);
        this.LIZJ.LJIIJ(8.28f, 0.0f, 15.0f, 6.68f, 15.0f, 14.93f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -15483504);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(24.0f, 42.0f);
        dij.LJIIL(2.08f, 2.17f);
        dij.LJIIL(1.03f, -1.0f);
        dij.LJIIIZ(3059.92f, 3059.92f, false, false, 6.82f, -6.58f);
        dij.LJIIJ(3.23f, -3.22f, 8.07f, -8.1f, 8.07f, -15.66f);
        dij.LJ(42.0f, 11.01f, 33.93f, 3.0f, 24.0f, 3.0f);
        dij.LJIILLIIL(6.0f, 11.01f, 6.0f, 20.93f, true);
        dij.LJIIJ(0.0f, 7.58f, 5.67f, 13.27f, 8.07f, 15.66f);
        dij.LJIIIZ(576.32f, 576.32f, false, false, 6.82f, 6.58f);
        dij.LJIIL(1.03f, 1.0f);
        dij.LJII(24.0f, 42.0f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 0.0f);
        dij.LJIIL(2.08f, 2.17f);
        dij.LJII(24.0f, 46.16f);
        dij.LJIIL(-2.08f, -2.0f);
        dij.LJII(24.0f, 42.0f);
        dij.LIZLLL();
        dij.LJIILIIL(7.81f, -7.54f);
        dij.LJ(35.1f, 31.2f, 39.0f, 27.11f, 39.0f, 20.93f);
        dij.LJ(39.0f, 12.68f, 32.28f, 6.0f, 24.0f, 6.0f);
        dij.LJ(15.72f, 6.0f, 9.0f, 12.68f, 9.0f, 20.93f);
        dij.LJIIJ(0.0f, 6.18f, 4.69f, 11.04f, 7.19f, 13.53f);
        dij.LJ(17.52f, 35.8f, 24.0f, 42.0f, 24.0f, 42.0f);
        dij.LJIILJJIL(6.45f, -6.18f, 7.81f, -7.54f, true);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LIZ(24.0f, 21.0f, 5.0f, Path.Direction.CW);
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
